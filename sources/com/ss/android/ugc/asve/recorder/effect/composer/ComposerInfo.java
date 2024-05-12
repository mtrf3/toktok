package com.ss.android.ugc.asve.recorder.effect.composer;

import X.C82941Wgr;
import X.HH1;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes15.dex */
public final class ComposerInfo implements Parcelable {
    public static final C82941Wgr CREATOR = new C82941Wgr();
    public final String effectId;
    public final String extra;
    public final String key;
    public String nodePath;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.nodePath;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.extra;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.effectId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.key;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ComposerInfo(nodePath=");
        LIZ.append(this.nodePath);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", effectId=");
        LIZ.append(this.effectId);
        LIZ.append(", key=");
        return JBR.LJFF(LIZ, this.key, ")", LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComposerInfo) {
            ComposerInfo composerInfo = (ComposerInfo) obj;
            if (o.LJ(this.nodePath, composerInfo.nodePath)) {
                return true;
            }
            List LJLJJL = s.LJLJJL(this.nodePath, new String[]{":"}, 0, 6);
            List LJLJJL2 = s.LJLJJL(composerInfo.nodePath, new String[]{":"}, 0, 6);
            if (LJLJJL.size() >= 2 && LJLJJL2.size() >= 2 && o.LJ(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL2, 0)) && o.LJ(ListProtector.get(LJLJJL, 1), ListProtector.get(LJLJJL2, 1))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.nodePath);
        parcel.writeString(this.extra);
        parcel.writeString(this.effectId);
    }

    public ComposerInfo(String str, String str2, String str3, String str4) {
        HH1.LIZ(str, "nodePath", str2, "extra", str3, "effectId");
        this.nodePath = str;
        this.extra = str2;
        this.effectId = str3;
        this.key = str4;
    }

    public /* synthetic */ ComposerInfo(String str, String str2, String str3, int i) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? null : "");
    }
}
