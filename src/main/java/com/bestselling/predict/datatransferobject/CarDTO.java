package com.bestselling.predict.datatransferobject;

import java.util.Date;

import com.bestselling.predict.domainvalue.EngineType;
import com.bestselling.predict.domainvalue.ModelType;
import com.bestselling.predict.domainvalue.RCType;
import com.bestselling.predict.domainvalue.TransmissionType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@Data
public class CarDTO {

    int kilometers;
    int owner;
    RCType rcType = RCType.INDIVIDUAL;
    EngineType engineType = EngineType.PETROL;
    TransmissionType transmissionType = TransmissionType.MANUAL;
    Date registrationyear = new Date(100, 1, 1);
    String city = "Bangalore";
    ModelType modelType = ModelType.LXI;
    double price;

    @JsonFormat(shape = JsonFormat.Shape.ANY, pattern = "yyyy", timezone = "IST")
    public Date getRegistrationyear() {
        return registrationyear;
    }

}
