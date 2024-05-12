package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class VideoInterval implements Serializable {

    @InterfaceC65349Pkn("end")
    public Float end;

    @InterfaceC65349Pkn("start")
    public Float start;

    public VideoInterval() {
        Float valueOf = Float.valueOf(0.0f);
        this.start = valueOf;
        this.end = valueOf;
    }

    public final Float getEnd() {
        return this.end;
    }

    public final Float getStart() {
        return this.start;
    }

    public final void setEnd(Float f) {
        this.end = f;
    }

    public final void setStart(Float f) {
        this.start = f;
    }
}
