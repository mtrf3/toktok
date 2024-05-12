package com.ss.android.ugc.tiktok.tpsc;

import X.C1NE;
import X.C61878OQg;
import X.EnumC69896Rbw;
import X.RVF;
import X.UC7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TPSCPageBuildConfigs implements Parcelable {
    public static final Parcelable.Creator<TPSCPageBuildConfigs> CREATOR = new RVF();
    public List<? extends Parcelable> contentConfigs;
    public EnumC69896Rbw style;
    public String title;
    public Integer titleRes;

    public TPSCPageBuildConfigs() {
        this((Integer) null, (EnumC69896Rbw) null, (List) null, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TPSCPageBuildConfigs)) {
            return false;
        }
        TPSCPageBuildConfigs tPSCPageBuildConfigs = (TPSCPageBuildConfigs) obj;
        return o.LJ(this.title, tPSCPageBuildConfigs.title) && o.LJ(this.titleRes, tPSCPageBuildConfigs.titleRes) && this.style == tPSCPageBuildConfigs.style && o.LJ(this.contentConfigs, tPSCPageBuildConfigs.contentConfigs);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.titleRes;
        return this.contentConfigs.hashCode() + ((this.style.hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TPSCPageBuildConfigs(title=");
        LIZ.append(this.title);
        LIZ.append(", titleRes=");
        LIZ.append(this.titleRes);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", contentConfigs=");
        return C1NE.LIZIZ(LIZ, this.contentConfigs, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        Integer num = this.titleRes;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.style.name());
        Iterator LIZJ = UC7.LIZJ(this.contentConfigs, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
    }

    public TPSCPageBuildConfigs(Integer num, EnumC69896Rbw enumC69896Rbw, List list, int i) {
        this((String) null, (i & 2) != 0 ? null : num, (i & 4) != 0 ? EnumC69896Rbw.PAGE : enumC69896Rbw, (List<? extends Parcelable>) ((i & 8) != 0 ? C61878OQg.INSTANCE : list));
    }

    public TPSCPageBuildConfigs(String str, Integer num, EnumC69896Rbw style, List<? extends Parcelable> contentConfigs) {
        o.LJIIIZ(style, "style");
        o.LJIIIZ(contentConfigs, "contentConfigs");
        this.title = str;
        this.titleRes = num;
        this.style = style;
        this.contentConfigs = contentConfigs;
    }
}
