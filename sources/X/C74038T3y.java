package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import kotlin.jvm.internal.o;

/* renamed from: X.T3y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74038T3y implements Parcelable.Creator<MobileEffectData> {
    @Override // android.os.Parcelable.Creator
    public final MobileEffectData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new MobileEffectData(TAE.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (NewFaceStickerBean) parcel.readSerializable(), (CKEDraftInfoWrapper) parcel.readParcelable(MobileEffectData.class.getClassLoader()), (EffectPackageDataWrapper) parcel.readParcelable(MobileEffectData.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final MobileEffectData[] newArray(int i) {
        return new MobileEffectData[i];
    }
}
