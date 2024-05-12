package com.ss.android.ugc.aweme.commerce.tools.tcm;

import X.GGK;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceToolsTcmModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CommerceToolsTcmModel> CREATOR = new GGK();

    @InterfaceC65349Pkn("account_ad_setting_open")
    public boolean accountAdSettingsBeOpen;

    @InterfaceC65349Pkn("ads_authorization_switch")
    public boolean adsAuthorizationSwitch;

    @InterfaceC65349Pkn("ads_Only_switch")
    public boolean adsOnlySwitch;

    @InterfaceC65349Pkn("brand_organic_type")
    public String brandOrganicType;

    @InterfaceC65349Pkn("branded_content_switch")
    public String brandedContentSwitch;

    @InterfaceC65349Pkn("deliverable_id")
    public String deliverableId;

    @InterfaceC65349Pkn("has_tagged_ba")
    public boolean hasTaggedBA;

    @InterfaceC65349Pkn("is_tcm_order")
    public boolean isTcmOrder;

    @InterfaceC65349Pkn("outer_tcm_order")
    public String outerTcmOrder;

    @InterfaceC65349Pkn("spark_ads_auth")
    public String sparkAdsAuth;

    @InterfaceC65349Pkn("submit_text")
    public TCMPostPageSubmitTextModel submitText;

    @InterfaceC65349Pkn("tcm_campaign_info")
    public String tcmCampaignInfo;

    @InterfaceC65349Pkn("tcm_params")
    public String tcmParams;

    @InterfaceC65349Pkn("tcm_prevent_self_see")
    public int tcmPreventSelfSee;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommerceToolsTcmModel() {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            r15 = 16383(0x3fff, float:2.2957E-41)
            r0 = r17
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r2
            r13 = r1
            r14 = r1
            r16 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommerceToolsTcmModel(boolean r18) {
        /*
            r17 = this;
            r2 = 0
            r9 = 0
            r15 = 16382(0x3ffe, float:2.2956E-41)
            r0 = r17
            r1 = r18
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r10 = r9
            r11 = r9
            r12 = r2
            r13 = r9
            r14 = r9
            r16 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel.<init>(boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommerceToolsTcmModel(boolean r18, java.lang.String r19) {
        /*
            r17 = this;
            r3 = 0
            r9 = 0
            r15 = 16380(0x3ffc, float:2.2953E-41)
            r1 = r18
            r2 = r19
            r0 = r17
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r10 = r9
            r11 = r9
            r12 = r3
            r13 = r9
            r14 = r9
            r16 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel.<init>(boolean, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommerceToolsTcmModel(boolean r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r4 = 0
            r9 = 0
            r15 = 16376(0x3ff8, float:2.2948E-41)
            r1 = r18
            r0 = r17
            r3 = r20
            r2 = r19
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r10 = r9
            r11 = r9
            r12 = r4
            r13 = r9
            r14 = r9
            r16 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel.<init>(boolean, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommerceToolsTcmModel(boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r5 = 0
            r9 = 0
            r15 = 16368(0x3ff0, float:2.2936E-41)
            r1 = r18
            r0 = r17
            r2 = r19
            r4 = r21
            r3 = r20
            r6 = r5
            r7 = r5
            r8 = r5
            r10 = r9
            r11 = r9
            r12 = r5
            r13 = r9
            r14 = r9
            r16 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel.<init>(boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommerceToolsTcmModel(boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel r22) {
        /*
            r17 = this;
            r6 = 0
            r9 = 0
            r15 = 16352(0x3fe0, float:2.2914E-41)
            r1 = r18
            r0 = r17
            r2 = r19
            r3 = r20
            r5 = r22
            r4 = r21
            r7 = r6
            r8 = r6
            r10 = r9
            r11 = r9
            r12 = r6
            r13 = r9
            r14 = r9
            r16 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommerceToolsTcmModel(boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel r22, java.lang.String r23) {
        /*
            r17 = this;
            r7 = 0
            r9 = 0
            r15 = 16320(0x3fc0, float:2.2869E-41)
            r5 = r22
            r1 = r18
            r6 = r23
            r0 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r8 = r7
            r10 = r9
            r11 = r9
            r12 = r7
            r13 = r9
            r14 = r9
            r16 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommerceToolsTcmModel(boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel r22, java.lang.String r23, java.lang.String r24) {
        /*
            r17 = this;
            java.lang.String r0 = "brandedContentSwitch"
            r7 = r24
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r8 = 0
            r9 = 0
            r15 = 16256(0x3f80, float:2.278E-41)
            r5 = r22
            r4 = r21
            r6 = r23
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r10 = r9
            r11 = r9
            r12 = r8
            r13 = r9
            r14 = r9
            r16 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String brandedContentSwitch, String str5) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, brandedContentSwitch, str5, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16128, 0 == true ? 1 : 0);
        o.LJIIIZ(brandedContentSwitch, "brandedContentSwitch");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String brandedContentSwitch, String str5, boolean z2) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, brandedContentSwitch, str5, z2, false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15872, 0 == true ? 1 : 0);
        o.LJIIIZ(brandedContentSwitch, "brandedContentSwitch");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String brandedContentSwitch, String str5, boolean z2, boolean z3) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, brandedContentSwitch, str5, z2, z3, false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15360, 0 == true ? 1 : 0);
        o.LJIIIZ(brandedContentSwitch, "brandedContentSwitch");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommerceToolsTcmModel(boolean r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, boolean r27, boolean r28) {
        /*
            r17 = this;
            java.lang.String r0 = "brandedContentSwitch"
            r7 = r24
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r12 = 0
            r13 = 0
            r15 = 14336(0x3800, float:2.0089E-41)
            r5 = r22
            r4 = r21
            r3 = r20
            r2 = r19
            r0 = r17
            r1 = r18
            r10 = r27
            r11 = r28
            r9 = r26
            r8 = r25
            r6 = r23
            r14 = r13
            r16 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String brandedContentSwitch, String str5, boolean z2, boolean z3, boolean z4, String str6) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, brandedContentSwitch, str5, z2, z3, z4, str6, 0, 0 == true ? 1 : 0, 12288, null);
        o.LJIIIZ(brandedContentSwitch, "brandedContentSwitch");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String brandedContentSwitch, String str5, boolean z2, boolean z3, boolean z4, String str6, int i) {
        this(z, str, str2, str3, tCMPostPageSubmitTextModel, str4, brandedContentSwitch, str5, z2, z3, z4, str6, i, false, FileUtils.BUFFER_SIZE, null);
        o.LJIIIZ(brandedContentSwitch, "brandedContentSwitch");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isTcmOrder ? 1 : 0);
        out.writeString(this.outerTcmOrder);
        out.writeString(this.sparkAdsAuth);
        out.writeString(this.deliverableId);
        TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel = this.submitText;
        if (tCMPostPageSubmitTextModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            tCMPostPageSubmitTextModel.writeToParcel(out, i);
        }
        out.writeString(this.tcmCampaignInfo);
        out.writeString(this.brandedContentSwitch);
        out.writeString(this.brandOrganicType);
        out.writeInt(this.adsOnlySwitch ? 1 : 0);
        out.writeInt(this.adsAuthorizationSwitch ? 1 : 0);
        out.writeInt(this.hasTaggedBA ? 1 : 0);
        out.writeString(this.tcmParams);
        out.writeInt(this.tcmPreventSelfSee);
        out.writeInt(this.accountAdSettingsBeOpen ? 1 : 0);
    }

    public final boolean getAccountAdSettingsBeOpen() {
        return this.accountAdSettingsBeOpen;
    }

    public final boolean getAdsAuthorizationSwitch() {
        return this.adsAuthorizationSwitch;
    }

    public final boolean getAdsOnlySwitch() {
        return this.adsOnlySwitch;
    }

    public final String getBrandOrganicType() {
        return this.brandOrganicType;
    }

    public final String getBrandedContentSwitch() {
        return this.brandedContentSwitch;
    }

    public final String getDeliverableId() {
        return this.deliverableId;
    }

    public final boolean getHasTaggedBA() {
        return this.hasTaggedBA;
    }

    public final String getOuterTcmOrder() {
        return this.outerTcmOrder;
    }

    public final String getSparkAdsAuth() {
        return this.sparkAdsAuth;
    }

    public final TCMPostPageSubmitTextModel getSubmitText() {
        return this.submitText;
    }

    public final String getTcmCampaignInfo() {
        return this.tcmCampaignInfo;
    }

    public final String getTcmParams() {
        return this.tcmParams;
    }

    public final int getTcmPreventSelfSee() {
        return this.tcmPreventSelfSee;
    }

    public final boolean isTcmOrder() {
        return this.isTcmOrder;
    }

    public final void setAccountAdSettingsBeOpen(boolean z) {
        this.accountAdSettingsBeOpen = z;
    }

    public final void setAdsAuthorizationSwitch(boolean z) {
        this.adsAuthorizationSwitch = z;
    }

    public final void setAdsOnlySwitch(boolean z) {
        this.adsOnlySwitch = z;
    }

    public final void setBrandOrganicType(String str) {
        this.brandOrganicType = str;
    }

    public final void setBrandedContentSwitch(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.brandedContentSwitch = str;
    }

    public final void setDeliverableId(String str) {
        this.deliverableId = str;
    }

    public final void setHasTaggedBA(boolean z) {
        this.hasTaggedBA = z;
    }

    public final void setOuterTcmOrder(String str) {
        this.outerTcmOrder = str;
    }

    public final void setSparkAdsAuth(String str) {
        this.sparkAdsAuth = str;
    }

    public final void setSubmitText(TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel) {
        this.submitText = tCMPostPageSubmitTextModel;
    }

    public final void setTcmCampaignInfo(String str) {
        this.tcmCampaignInfo = str;
    }

    public final void setTcmOrder(boolean z) {
        this.isTcmOrder = z;
    }

    public final void setTcmParams(String str) {
        this.tcmParams = str;
    }

    public final void setTcmPreventSelfSee(int i) {
        this.tcmPreventSelfSee = i;
    }

    public CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String brandedContentSwitch, String str5, boolean z2, boolean z3, boolean z4, String str6, int i, boolean z5) {
        o.LJIIIZ(brandedContentSwitch, "brandedContentSwitch");
        this.isTcmOrder = z;
        this.outerTcmOrder = str;
        this.sparkAdsAuth = str2;
        this.deliverableId = str3;
        this.submitText = tCMPostPageSubmitTextModel;
        this.tcmCampaignInfo = str4;
        this.brandedContentSwitch = brandedContentSwitch;
        this.brandOrganicType = str5;
        this.adsOnlySwitch = z2;
        this.adsAuthorizationSwitch = z3;
        this.hasTaggedBA = z4;
        this.tcmParams = str6;
        this.tcmPreventSelfSee = i;
        this.accountAdSettingsBeOpen = z5;
    }

    public /* synthetic */ CommerceToolsTcmModel(boolean z, String str, String str2, String str3, TCMPostPageSubmitTextModel tCMPostPageSubmitTextModel, String str4, String str5, String str6, boolean z2, boolean z3, boolean z4, String str7, int i, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : tCMPostPageSubmitTextModel, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? CardStruct.IStatusCode.DEFAULT : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? false : z3, (i2 & 1024) != 0 ? false : z4, (i2 & 2048) == 0 ? str7 : null, (i2 & 4096) != 0 ? 0 : i, (i2 & FileUtils.BUFFER_SIZE) == 0 ? z5 : false);
    }
}
