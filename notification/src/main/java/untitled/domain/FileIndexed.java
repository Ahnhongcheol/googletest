package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileld;
    private String keywords;
}
