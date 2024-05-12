package com.ss.android.ugc.aweme.dependence.beauty.data;

import X.C43588H8u;
import X.C82940Wgq;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes15.dex */
public final class BeautyComposerInfo implements Parcelable {
    public static final C82940Wgq CREATOR = new C82940Wgq();
    public final String categoryId;
    public final String effectId;
    public final String extra;
    public String nodePath;
    public final String resourceId;

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
        String str4 = this.resourceId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.categoryId;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BeautyComposerInfo(nodePath=");
        LIZ.append(this.nodePath);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", effectId=");
        LIZ.append(this.effectId);
        LIZ.append(", resourceId=");
        LIZ.append(this.resourceId);
        LIZ.append(", categoryId=");
        return JBR.LJFF(LIZ, this.categoryId, ")", LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BeautyComposerInfo) {
            BeautyComposerInfo beautyComposerInfo = (BeautyComposerInfo) obj;
            if (o.LJ(this.nodePath, beautyComposerInfo.nodePath)) {
                return true;
            }
            List LJLJJL = s.LJLJJL(this.nodePath, new String[]{":"}, 0, 6);
            List LJLJJL2 = s.LJLJJL(beautyComposerInfo.nodePath, new String[]{":"}, 0, 6);
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
        parcel.writeString(this.resourceId);
        parcel.writeString(this.categoryId);
    }

    public BeautyComposerInfo(String str, String str2, String str3, String str4, String str5) {
        C43588H8u.LIZLLL(str, "nodePath", str3, "effectId", str4, "resourceId", str5, "categoryId");
        this.nodePath = str;
        this.extra = str2;
        this.effectId = str3;
        this.resourceId = str4;
        this.categoryId = str5;
    }

    public /* synthetic */ BeautyComposerInfo(String str, String str2, String str3, String str4, int i) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? null : "");
    }
}
