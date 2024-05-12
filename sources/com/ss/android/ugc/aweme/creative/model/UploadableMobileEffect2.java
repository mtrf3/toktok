package com.ss.android.ugc.aweme.creative.model;

import X.C36430ERm;
import X.C43588H8u;
import X.C79062V1e;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UploadableMobileEffect2 implements Parcelable {
    public static final Parcelable.Creator<UploadableMobileEffect2> CREATOR = new C36430ERm();

    @InterfaceC65349Pkn("dirPath")
    public final String dirPath;

    @InterfaceC65349Pkn("draftInfo")
    public DraftInfo draftInfo;

    @InterfaceC65349Pkn("effectId")
    public final String effectId;

    @InterfaceC65349Pkn("effectName")
    public String effectName;

    @InterfaceC65349Pkn("greenScreenInfo")
    public GreenScreenInfo greenScreenInfo;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("iconFilePath")
    public final String iconFilePath;

    @InterfaceC65349Pkn("templateInfo")
    public TemplateEffectInfo templateInfo;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("zipFilePath")
    public final String zipFilePath;

    /* JADX WARN: Multi-variable type inference failed */
    public UploadableMobileEffect2() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadableMobileEffect2)) {
            return false;
        }
        UploadableMobileEffect2 uploadableMobileEffect2 = (UploadableMobileEffect2) obj;
        return o.LJ(this.effectId, uploadableMobileEffect2.effectId) && o.LJ(this.effectName, uploadableMobileEffect2.effectName) && o.LJ(this.iconFilePath, uploadableMobileEffect2.iconFilePath) && o.LJ(this.zipFilePath, uploadableMobileEffect2.zipFilePath) && o.LJ(this.dirPath, uploadableMobileEffect2.dirPath) && o.LJ(this.templateInfo, uploadableMobileEffect2.templateInfo) && o.LJ(this.greenScreenInfo, uploadableMobileEffect2.greenScreenInfo) && o.LJ(this.draftInfo, uploadableMobileEffect2.draftInfo);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadableMobileEffect2(effectId=");
        LIZ.append(this.effectId);
        LIZ.append(", effectName=");
        LIZ.append(this.effectName);
        LIZ.append(", iconFilePath=");
        LIZ.append(this.iconFilePath);
        LIZ.append(", zipFilePath=");
        LIZ.append(this.zipFilePath);
        LIZ.append(", dirPath=");
        LIZ.append(this.dirPath);
        LIZ.append(", templateInfo=");
        LIZ.append(this.templateInfo);
        LIZ.append(", greenScreenInfo=");
        LIZ.append(this.greenScreenInfo);
        LIZ.append(", draftInfo=");
        LIZ.append(this.draftInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.effectId);
        out.writeString(this.effectName);
        out.writeString(this.iconFilePath);
        out.writeString(this.zipFilePath);
        out.writeString(this.dirPath);
        TemplateEffectInfo templateEffectInfo = this.templateInfo;
        if (templateEffectInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            templateEffectInfo.writeToParcel(out, i);
        }
        GreenScreenInfo greenScreenInfo = this.greenScreenInfo;
        if (greenScreenInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            greenScreenInfo.writeToParcel(out, i);
        }
        DraftInfo draftInfo = this.draftInfo;
        if (draftInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            draftInfo.writeToParcel(out, i);
        }
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.zipFilePath, C79062V1e.LJ(this.iconFilePath, C79062V1e.LJ(this.effectName, this.effectId.hashCode() * 31, 31), 31), 31);
        String str = this.dirPath;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        TemplateEffectInfo templateEffectInfo = this.templateInfo;
        if (templateEffectInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = templateEffectInfo.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        GreenScreenInfo greenScreenInfo = this.greenScreenInfo;
        if (greenScreenInfo == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = greenScreenInfo.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        DraftInfo draftInfo = this.draftInfo;
        if (draftInfo != null) {
            i = draftInfo.hashCode();
        }
        return i4 + i;
    }

    public UploadableMobileEffect2(String str, String str2, String str3, String str4, String str5, TemplateEffectInfo templateEffectInfo, GreenScreenInfo greenScreenInfo, DraftInfo draftInfo) {
        C43588H8u.LIZLLL(str, "effectId", str2, "effectName", str3, "iconFilePath", str4, "zipFilePath");
        this.effectId = str;
        this.effectName = str2;
        this.iconFilePath = str3;
        this.zipFilePath = str4;
        this.dirPath = str5;
        this.templateInfo = templateEffectInfo;
        this.greenScreenInfo = greenScreenInfo;
        this.draftInfo = draftInfo;
    }

    public /* synthetic */ UploadableMobileEffect2(String str, String str2, String str3, String str4, String str5, TemplateEffectInfo templateEffectInfo, GreenScreenInfo greenScreenInfo, DraftInfo draftInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : templateEffectInfo, (i & 64) != 0 ? null : greenScreenInfo, (i & 128) == 0 ? draftInfo : null);
    }
}
