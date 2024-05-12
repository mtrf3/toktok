package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V11 implements Parcelable.Creator<OuterEffectTextShadowConfig> {
    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextShadowConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new OuterEffectTextShadowConfig(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextShadowConfig[] newArray(int i) {
        return new OuterEffectTextShadowConfig[i];
    }
}
