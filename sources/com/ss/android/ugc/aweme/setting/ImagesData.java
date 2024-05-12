package com.ss.android.ugc.aweme.setting;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ImagesData {

    @InterfaceC65349Pkn("ltr-light")
    public String ltrLight;

    @InterfaceC65349Pkn("rtl-light")
    public String rtlLight;

    /* JADX WARN: Multi-variable type inference failed */
    public ImagesData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImagesData)) {
            return false;
        }
        ImagesData imagesData = (ImagesData) obj;
        return o.LJ(this.ltrLight, imagesData.ltrLight) && o.LJ(this.rtlLight, imagesData.rtlLight);
    }

    public final int hashCode() {
        String str = this.ltrLight;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rtlLight;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImagesData(ltrLight=");
        LIZ.append(this.ltrLight);
        LIZ.append(", rtlLight=");
        return q.LIZIZ(LIZ, this.rtlLight, ')', LIZ);
    }

    public ImagesData(String str, String str2) {
        this.ltrLight = str;
        this.rtlLight = str2;
    }

    public /* synthetic */ ImagesData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
