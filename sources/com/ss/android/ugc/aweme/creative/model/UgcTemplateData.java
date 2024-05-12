package com.ss.android.ugc.aweme.creative.model;

import X.C1FJ;
import X.C1FL;
import X.C41673GXd;
import X.C41674GXe;
import X.GPV;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UgcTemplateData implements Parcelable {

    @InterfaceC65349Pkn("enable_publish_as_template")
    public boolean enablePublishAsTemplate;

    @InterfaceC65349Pkn("is_pugc_template_from_anchor")
    public boolean isPUgcTemplateFromAnchor;

    @InterfaceC65349Pkn("is_ugc_template_from_anchor")
    public boolean isUgcTemplateFromAnchor;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("original_normalized_nle_path")
    public String originalNormalizedNLEPath;

    @GPV
    public Boolean showOriginTemplateAnchor;

    @InterfaceC65349Pkn("ugc_template_id")
    public String ugcTemplateId;

    @InterfaceC65349Pkn("ugc_template_origin_anchor")
    public AnchorCommonStruct ugcTemplateOriginAnchor;

    @InterfaceC65349Pkn("ugc_template_tag")
    public String ugcTemplateTag;

    @InterfaceC65349Pkn("ugc_template_version")
    public Integer ugcTemplateVersion;

    @GPV
    public String ugcTemplateZipUrl;
    public static final C41674GXe Companion = new C41674GXe();
    public static final Parcelable.Creator<UgcTemplateData> CREATOR = new C41673GXd();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UgcTemplateData() {
        /*
            r13 = this;
            r1 = 0
            r3 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r1
            r12 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.UgcTemplateData.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isPUgcTemplateFromAnchor ? 1 : 0);
        out.writeInt(this.isUgcTemplateFromAnchor ? 1 : 0);
        Integer num = this.ugcTemplateVersion;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.ugcTemplateZipUrl);
        Boolean bool = this.showOriginTemplateAnchor;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.ugcTemplateId);
        out.writeSerializable(this.ugcTemplateOriginAnchor);
        out.writeString(this.originalNormalizedNLEPath);
        out.writeString(this.ugcTemplateTag);
        out.writeInt(this.enablePublishAsTemplate ? 1 : 0);
    }

    public UgcTemplateData(boolean z, boolean z2, Integer num, String str, Boolean bool, String str2, AnchorCommonStruct anchorCommonStruct, String str3, String str4, boolean z3) {
        this.isPUgcTemplateFromAnchor = z;
        this.isUgcTemplateFromAnchor = z2;
        this.ugcTemplateVersion = num;
        this.ugcTemplateZipUrl = str;
        this.showOriginTemplateAnchor = bool;
        this.ugcTemplateId = str2;
        this.ugcTemplateOriginAnchor = anchorCommonStruct;
        this.originalNormalizedNLEPath = str3;
        this.ugcTemplateTag = str4;
        this.enablePublishAsTemplate = z3;
    }

    public /* synthetic */ UgcTemplateData(boolean z, boolean z2, Integer num, String str, Boolean bool, String str2, AnchorCommonStruct anchorCommonStruct, String str3, String str4, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : anchorCommonStruct, (i & 128) != 0 ? null : str3, (i & 256) == 0 ? str4 : null, (i & 512) == 0 ? z3 : false);
    }
}
