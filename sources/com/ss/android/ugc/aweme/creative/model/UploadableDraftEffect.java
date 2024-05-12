package com.ss.android.ugc.aweme.creative.model;

import X.C36432ERo;
import X.F9E;
import X.InterfaceC36436ERs;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UploadableDraftEffect extends F9E implements Parcelable {
    public static final Parcelable.Creator<UploadableDraftEffect> CREATOR = new C36432ERo();

    @InterfaceC65349Pkn("draftId")
    public final String draftId;

    @InterfaceC65349Pkn("effectId")
    public String effectId;

    @InterfaceC65349Pkn("effectName")
    public final String effectName;

    @InterfaceC65349Pkn("enableSubmission")
    public boolean enableSubmission;

    @InterfaceC65349Pkn("hintStarlingKey")
    public String hintStarlingKey;

    @InterfaceC65349Pkn("iconFilePath")
    public final String iconFilePath;

    @InterfaceC65349Pkn("needSubmission")
    public boolean needSubmission;

    @InterfaceC65349Pkn("unzipFilePath")
    public final String unzipFilePath;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("zipFilePath")
    public String zipFilePath;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UploadableDraftEffect() {
        /*
            r12 = this;
            r1 = 0
            r7 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r8 = r7
            r9 = r1
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.effectId, this.draftId, this.effectName, this.iconFilePath, this.zipFilePath, this.unzipFilePath, Boolean.valueOf(this.needSubmission), Boolean.valueOf(this.enableSubmission), this.hintStarlingKey};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.effectId);
        out.writeString(this.draftId);
        out.writeString(this.effectName);
        out.writeString(this.iconFilePath);
        out.writeString(this.zipFilePath);
        out.writeString(this.unzipFilePath);
        out.writeInt(this.needSubmission ? 1 : 0);
        out.writeInt(this.enableSubmission ? 1 : 0);
        out.writeString(this.hintStarlingKey);
    }

    public UploadableDraftEffect(String effectId, String draftId, String effectName, String iconFilePath, String zipFilePath, String unzipFilePath, boolean z, boolean z2, String hintStarlingKey) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(draftId, "draftId");
        o.LJIIIZ(effectName, "effectName");
        o.LJIIIZ(iconFilePath, "iconFilePath");
        o.LJIIIZ(zipFilePath, "zipFilePath");
        o.LJIIIZ(unzipFilePath, "unzipFilePath");
        o.LJIIIZ(hintStarlingKey, "hintStarlingKey");
        this.effectId = effectId;
        this.draftId = draftId;
        this.effectName = effectName;
        this.iconFilePath = iconFilePath;
        this.zipFilePath = zipFilePath;
        this.unzipFilePath = unzipFilePath;
        this.needSubmission = z;
        this.enableSubmission = z2;
        this.hintStarlingKey = hintStarlingKey;
    }

    public /* synthetic */ UploadableDraftEffect(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? true : z2, (i & 256) == 0 ? str7 : "");
    }
}
