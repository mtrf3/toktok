package com.ss.android.ugc.aweme.search;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.model.Position;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class HighlightInfo implements Serializable {

    @InterfaceC65349Pkn("field")
    public String field;

    @InterfaceC65349Pkn("positions")
    public List<Position> positions;

    public final String getField() {
        return this.field;
    }

    public final List<Position> getPositions() {
        return this.positions;
    }

    public final void setField(String str) {
        this.field = str;
    }

    public final void setPositions(List<Position> list) {
        this.positions = list;
    }
}
