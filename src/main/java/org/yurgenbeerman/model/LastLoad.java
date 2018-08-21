package org.yurgenbeerman.model;

/**
 * Created by yurii.pyvovarenko on 8/20/2018.
 */
import lombok.Data;

@Data
public class LastLoad {
    Long sourceId;
    String sourceName;
    String lastLoad;

    public LastLoad() {}

    public LastLoad(Long sourceId, String sourceName, String lastLoad) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.lastLoad = lastLoad;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public void setLastLoad(String lastLoad) {
        this.lastLoad = lastLoad;
    }
}
