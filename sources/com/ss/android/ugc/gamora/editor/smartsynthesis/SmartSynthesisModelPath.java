package com.ss.android.ugc.gamora.editor.smartsynthesis;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SmartSynthesisModelPath {

    @InterfaceC65349Pkn("smartcodec")
    public final String smartcodec;

    @InterfaceC65349Pkn("statics")
    public final String statics;

    /* JADX WARN: Multi-variable type inference failed */
    public SmartSynthesisModelPath() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartSynthesisModelPath)) {
            return false;
        }
        SmartSynthesisModelPath smartSynthesisModelPath = (SmartSynthesisModelPath) obj;
        return o.LJ(this.smartcodec, smartSynthesisModelPath.smartcodec) && o.LJ(this.statics, smartSynthesisModelPath.statics);
    }

    public final int hashCode() {
        String str = this.smartcodec;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statics;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SmartSynthesisModelPath(smartcodec=");
        LIZ.append(this.smartcodec);
        LIZ.append(", statics=");
        return q.LIZIZ(LIZ, this.statics, ')', LIZ);
    }

    public SmartSynthesisModelPath(String str, String str2) {
        this.smartcodec = str;
        this.statics = str2;
    }

    public /* synthetic */ SmartSynthesisModelPath(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
