package com.ss.android.ugc.aweme.commerce.tools.common;

import X.C42474Gli;
import X.GPV;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.music.context.CommerceToolsMusicContext;
import com.ss.android.ugc.aweme.commerce.tools.music.model.CommerceToolsMusicModel;
import com.ss.android.ugc.aweme.commerce.tools.sticker.CommerceToolsStickerContext;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEContext;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceToolsModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CommerceToolsModel> CREATOR = new C42474Gli();

    @InterfaceC65349Pkn("ibe_context")
    public IBEContext ibeContext;

    @InterfaceC65349Pkn("is_showed_commerce_transform_bottom_button")
    public boolean isShowedCommerceTransformBottomButton;

    @InterfaceC65349Pkn("is_showed_commerce_transform_button")
    public boolean isShowedCommerceTransformButton;

    @InterfaceC65349Pkn("mission")
    public Mission mission;

    @GPV
    public final CommerceToolsMusicContext musicContext;

    @InterfaceC65349Pkn("music_model")
    public final CommerceToolsMusicModel musicModel;

    @InterfaceC65349Pkn("music_usage_confirmation")
    public int musicUsageConfirmation;

    @InterfaceC65349Pkn("record_challenge")
    public AVChallenge recordChallenge;

    @InterfaceC65349Pkn("sticker_context")
    public CommerceToolsStickerContext stickerContext;

    @InterfaceC65349Pkn("tcm_publish_model")
    public CommerceToolsTcmModel tcmModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommerceToolsModel() {
        /*
            r13 = this;
            r1 = 0
            r3 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r2 = r1
            r4 = r3
            r5 = r1
            r6 = r3
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r12 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel.<init>():void");
    }

    public static /* synthetic */ CommerceToolsModel copy$default(CommerceToolsModel commerceToolsModel, CommerceToolsTcmModel commerceToolsTcmModel, Mission mission, boolean z, boolean z2, AVChallenge aVChallenge, int i, CommerceToolsStickerContext commerceToolsStickerContext, CommerceToolsMusicModel commerceToolsMusicModel, CommerceToolsMusicContext commerceToolsMusicContext, IBEContext iBEContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            commerceToolsTcmModel = commerceToolsModel.tcmModel;
        }
        if ((i2 & 2) != 0) {
            mission = commerceToolsModel.mission;
        }
        if ((i2 & 4) != 0) {
            z = commerceToolsModel.isShowedCommerceTransformButton;
        }
        if ((i2 & 8) != 0) {
            z2 = commerceToolsModel.isShowedCommerceTransformBottomButton;
        }
        if ((i2 & 16) != 0) {
            aVChallenge = commerceToolsModel.recordChallenge;
        }
        if ((i2 & 32) != 0) {
            i = commerceToolsModel.musicUsageConfirmation;
        }
        if ((i2 & 64) != 0) {
            commerceToolsStickerContext = commerceToolsModel.stickerContext;
        }
        if ((i2 & 128) != 0) {
            commerceToolsMusicModel = commerceToolsModel.musicModel;
        }
        if ((i2 & 256) != 0) {
            commerceToolsMusicContext = commerceToolsModel.musicContext;
        }
        if ((i2 & 512) != 0) {
            iBEContext = commerceToolsModel.ibeContext;
        }
        return commerceToolsModel.copy(commerceToolsTcmModel, mission, z, z2, aVChallenge, i, commerceToolsStickerContext, commerceToolsMusicModel, commerceToolsMusicContext, iBEContext);
    }

    public final CommerceToolsModel copy(CommerceToolsTcmModel tcmModel, Mission mission, boolean z, boolean z2, AVChallenge aVChallenge, int i, CommerceToolsStickerContext stickerContext, CommerceToolsMusicModel musicModel, CommerceToolsMusicContext musicContext, IBEContext ibeContext) {
        o.LJIIIZ(tcmModel, "tcmModel");
        o.LJIIIZ(stickerContext, "stickerContext");
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(musicContext, "musicContext");
        o.LJIIIZ(ibeContext, "ibeContext");
        return new CommerceToolsModel(tcmModel, mission, z, z2, aVChallenge, i, stickerContext, musicModel, musicContext, ibeContext);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceToolsModel)) {
            return false;
        }
        CommerceToolsModel commerceToolsModel = (CommerceToolsModel) obj;
        return o.LJ(this.tcmModel, commerceToolsModel.tcmModel) && o.LJ(this.mission, commerceToolsModel.mission) && this.isShowedCommerceTransformButton == commerceToolsModel.isShowedCommerceTransformButton && this.isShowedCommerceTransformBottomButton == commerceToolsModel.isShowedCommerceTransformBottomButton && o.LJ(this.recordChallenge, commerceToolsModel.recordChallenge) && this.musicUsageConfirmation == commerceToolsModel.musicUsageConfirmation && o.LJ(this.stickerContext, commerceToolsModel.stickerContext) && o.LJ(this.musicModel, commerceToolsModel.musicModel) && o.LJ(this.musicContext, commerceToolsModel.musicContext) && o.LJ(this.ibeContext, commerceToolsModel.ibeContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.tcmModel.hashCode() * 31;
        Mission mission = this.mission;
        int hashCode2 = (hashCode + (mission == null ? 0 : mission.hashCode())) * 31;
        boolean z = this.isShowedCommerceTransformButton;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode2 + i) * 31) + (this.isShowedCommerceTransformBottomButton ? 1 : 0)) * 31;
        AVChallenge aVChallenge = this.recordChallenge;
        return this.ibeContext.hashCode() + ((this.musicContext.hashCode() + ((this.musicModel.hashCode() + ((this.stickerContext.hashCode() + ((((i2 + (aVChallenge != null ? aVChallenge.hashCode() : 0)) * 31) + this.musicUsageConfirmation) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommerceToolsModel(tcmModel=");
        LIZ.append(this.tcmModel);
        LIZ.append(", mission=");
        LIZ.append(this.mission);
        LIZ.append(", isShowedCommerceTransformButton=");
        LIZ.append(this.isShowedCommerceTransformButton);
        LIZ.append(", isShowedCommerceTransformBottomButton=");
        LIZ.append(this.isShowedCommerceTransformBottomButton);
        LIZ.append(", recordChallenge=");
        LIZ.append(this.recordChallenge);
        LIZ.append(", musicUsageConfirmation=");
        LIZ.append(this.musicUsageConfirmation);
        LIZ.append(", stickerContext=");
        LIZ.append(this.stickerContext);
        LIZ.append(", musicModel=");
        LIZ.append(this.musicModel);
        LIZ.append(", musicContext=");
        LIZ.append(this.musicContext);
        LIZ.append(", ibeContext=");
        LIZ.append(this.ibeContext);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.tcmModel.writeToParcel(out, i);
        Mission mission = this.mission;
        if (mission == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mission.writeToParcel(out, i);
        }
        out.writeInt(this.isShowedCommerceTransformButton ? 1 : 0);
        out.writeInt(this.isShowedCommerceTransformBottomButton ? 1 : 0);
        out.writeParcelable(this.recordChallenge, i);
        out.writeInt(this.musicUsageConfirmation);
        this.stickerContext.writeToParcel(out, i);
        this.musicModel.writeToParcel(out, i);
        this.musicContext.writeToParcel(out, i);
        this.ibeContext.writeToParcel(out, i);
    }

    public final IBEContext getIbeContext() {
        return this.ibeContext;
    }

    public final Mission getMission() {
        return this.mission;
    }

    public final CommerceToolsMusicContext getMusicContext() {
        return this.musicContext;
    }

    public final CommerceToolsMusicModel getMusicModel() {
        return this.musicModel;
    }

    public final int getMusicUsageConfirmation() {
        return this.musicUsageConfirmation;
    }

    public final AVChallenge getRecordChallenge() {
        return this.recordChallenge;
    }

    public final CommerceToolsStickerContext getStickerContext() {
        return this.stickerContext;
    }

    public final CommerceToolsTcmModel getTcmModel() {
        return this.tcmModel;
    }

    public final boolean isShowedCommerceTransformBottomButton() {
        return this.isShowedCommerceTransformBottomButton;
    }

    public final boolean isShowedCommerceTransformButton() {
        return this.isShowedCommerceTransformButton;
    }

    public final void setIbeContext(IBEContext iBEContext) {
        o.LJIIIZ(iBEContext, "<set-?>");
        this.ibeContext = iBEContext;
    }

    public final void setMission(Mission mission) {
        this.mission = mission;
    }

    public final void setMusicUsageConfirmation(int i) {
        this.musicUsageConfirmation = i;
    }

    public final void setRecordChallenge(AVChallenge aVChallenge) {
        this.recordChallenge = aVChallenge;
    }

    public final void setShowedCommerceTransformBottomButton(boolean z) {
        this.isShowedCommerceTransformBottomButton = z;
    }

    public final void setShowedCommerceTransformButton(boolean z) {
        this.isShowedCommerceTransformButton = z;
    }

    public final void setStickerContext(CommerceToolsStickerContext commerceToolsStickerContext) {
        o.LJIIIZ(commerceToolsStickerContext, "<set-?>");
        this.stickerContext = commerceToolsStickerContext;
    }

    public final void setTcmModel(CommerceToolsTcmModel commerceToolsTcmModel) {
        o.LJIIIZ(commerceToolsTcmModel, "<set-?>");
        this.tcmModel = commerceToolsTcmModel;
    }

    public CommerceToolsModel(CommerceToolsTcmModel tcmModel, Mission mission, boolean z, boolean z2, AVChallenge aVChallenge, int i, CommerceToolsStickerContext stickerContext, CommerceToolsMusicModel musicModel, CommerceToolsMusicContext musicContext, IBEContext ibeContext) {
        o.LJIIIZ(tcmModel, "tcmModel");
        o.LJIIIZ(stickerContext, "stickerContext");
        o.LJIIIZ(musicModel, "musicModel");
        o.LJIIIZ(musicContext, "musicContext");
        o.LJIIIZ(ibeContext, "ibeContext");
        this.tcmModel = tcmModel;
        this.mission = mission;
        this.isShowedCommerceTransformButton = z;
        this.isShowedCommerceTransformBottomButton = z2;
        this.recordChallenge = aVChallenge;
        this.musicUsageConfirmation = i;
        this.stickerContext = stickerContext;
        this.musicModel = musicModel;
        this.musicContext = musicContext;
        this.ibeContext = ibeContext;
    }

    public /* synthetic */ CommerceToolsModel(CommerceToolsTcmModel commerceToolsTcmModel, Mission mission, boolean z, boolean z2, AVChallenge aVChallenge, int i, CommerceToolsStickerContext commerceToolsStickerContext, CommerceToolsMusicModel commerceToolsMusicModel, CommerceToolsMusicContext commerceToolsMusicContext, IBEContext iBEContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new CommerceToolsTcmModel(false, null, null, null, null, null, null, null, false, false, false, null, 0, false, 16383, null) : commerceToolsTcmModel, (i2 & 2) != 0 ? null : mission, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) == 0 ? aVChallenge : null, (i2 & 32) == 0 ? i : 0, (i2 & 64) != 0 ? new CommerceToolsStickerContext() : commerceToolsStickerContext, (i2 & 128) != 0 ? new CommerceToolsMusicModel() : commerceToolsMusicModel, (i2 & 256) != 0 ? new CommerceToolsMusicContext() : commerceToolsMusicContext, (i2 & 512) != 0 ? new IBEContext() : iBEContext);
    }
}
