package com.ss.android.ugc.aweme.ml.events;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;

/* loaded from: classes2.dex */
public final class EventWithPortraitsOneItem {

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("names")
    public List<String> names;

    @InterfaceC65349Pkn("portraits")
    public List<String> portraits;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("(name=");
        LIZ.append(this.name);
        LIZ.append(", names=");
        LIZ.append(this.names);
        LIZ.append(", portraits=");
        return C1NE.LIZIZ(LIZ, this.portraits, ')', LIZ);
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getNames() {
        return this.names;
    }

    public final List<String> getPortraits() {
        return this.portraits;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNames(List<String> list) {
        this.names = list;
    }

    public final void setPortraits(List<String> list) {
        this.portraits = list;
    }
}
