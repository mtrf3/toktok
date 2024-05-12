package com.ss.android.ugc.gamora.recorder.sticker.templateeffect;

import X.C74038T3y;
import X.C79062V1e;
import X.InterfaceC87283bg;
import X.TAE;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MobileEffectData implements InterfaceC87283bg, Parcelable {
    public static final Parcelable.Creator<MobileEffectData> CREATOR = new C74038T3y();
    public final String creationId;
    public final CKEDraftInfoWrapper draftInfo;
    public final NewFaceStickerBean effect;
    public final String enterFrom;
    public final TAE mode;
    public final EffectPackageDataWrapper publishData;
    public final String shootPageEnterFrom;
    public final String shootWay;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileEffectData)) {
            return false;
        }
        MobileEffectData mobileEffectData = (MobileEffectData) obj;
        return this.mode == mobileEffectData.mode && o.LJ(this.creationId, mobileEffectData.creationId) && o.LJ(this.shootWay, mobileEffectData.shootWay) && o.LJ(this.shootPageEnterFrom, mobileEffectData.shootPageEnterFrom) && o.LJ(this.effect, mobileEffectData.effect) && o.LJ(this.draftInfo, mobileEffectData.draftInfo) && o.LJ(this.publishData, mobileEffectData.publishData) && o.LJ(this.enterFrom, mobileEffectData.enterFrom);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.mode.name());
        out.writeString(this.creationId);
        out.writeString(this.shootWay);
        out.writeString(this.shootPageEnterFrom);
        out.writeSerializable(this.effect);
        out.writeParcelable(this.draftInfo, i);
        out.writeParcelable(this.publishData, i);
        out.writeString(this.enterFrom);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.mode.hashCode() * 31;
        String str = this.creationId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.shootPageEnterFrom, C79062V1e.LJ(this.shootWay, (hashCode4 + hashCode) * 31, 31), 31);
        NewFaceStickerBean newFaceStickerBean = this.effect;
        if (newFaceStickerBean == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = newFaceStickerBean.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        CKEDraftInfoWrapper cKEDraftInfoWrapper = this.draftInfo;
        if (cKEDraftInfoWrapper == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = cKEDraftInfoWrapper.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        EffectPackageDataWrapper effectPackageDataWrapper = this.publishData;
        if (effectPackageDataWrapper != null) {
            i = effectPackageDataWrapper.hashCode();
        }
        return this.enterFrom.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MobileEffectData(mode=");
        LIZ.append(this.mode);
        LIZ.append(", creationId=");
        LIZ.append(this.creationId);
        LIZ.append(", shootWay=");
        LIZ.append(this.shootWay);
        LIZ.append(", shootPageEnterFrom=");
        LIZ.append(this.shootPageEnterFrom);
        LIZ.append(", effect=");
        LIZ.append(this.effect);
        LIZ.append(", draftInfo=");
        LIZ.append(this.draftInfo);
        LIZ.append(", publishData=");
        LIZ.append(this.publishData);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.enterFrom, ')', LIZ);
    }

    public MobileEffectData(TAE mode, String str, String shootWay, String shootPageEnterFrom, NewFaceStickerBean newFaceStickerBean, CKEDraftInfoWrapper cKEDraftInfoWrapper, EffectPackageDataWrapper effectPackageDataWrapper, String enterFrom) {
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(shootPageEnterFrom, "shootPageEnterFrom");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.mode = mode;
        this.creationId = str;
        this.shootWay = shootWay;
        this.shootPageEnterFrom = shootPageEnterFrom;
        this.effect = newFaceStickerBean;
        this.draftInfo = cKEDraftInfoWrapper;
        this.publishData = effectPackageDataWrapper;
        this.enterFrom = enterFrom;
    }

    public /* synthetic */ MobileEffectData(TAE tae, String str, String str2, String str3, NewFaceStickerBean newFaceStickerBean, CKEDraftInfoWrapper cKEDraftInfoWrapper, EffectPackageDataWrapper effectPackageDataWrapper, String str4, int i) {
        this(tae, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : newFaceStickerBean, (i & 32) != 0 ? null : cKEDraftInfoWrapper, (i & 64) == 0 ? effectPackageDataWrapper : null, (i & 128) == 0 ? str4 : "");
    }
}
