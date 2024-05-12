package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Link {

    @InterfaceC65349Pkn("path")
    public final String name;

    @InterfaceC65349Pkn("rawType")
    public final String rawType;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("zorder")
    public final Integer zOrder;

    /* JADX WARN: Multi-variable type inference failed */
    public Link() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return o.LJ(this.name, link.name) && o.LJ(this.type, link.type) && o.LJ(this.rawType, link.rawType) && o.LJ(this.zOrder, link.zOrder);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rawType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.zOrder;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Link(name=");
        LIZ.append(this.name);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", rawType=");
        LIZ.append(this.rawType);
        LIZ.append(", zOrder=");
        return s0.LIZJ(LIZ, this.zOrder, ')', LIZ);
    }

    public Link(String str, String str2, String str3, Integer num) {
        this.name = str;
        this.type = str2;
        this.rawType = str3;
        this.zOrder = num;
    }

    public /* synthetic */ Link(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }
}
