package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V8G implements Parcelable.Creator<InnerEffectTextShadowConfig> {
    @Override // android.os.Parcelable.Creator
    public final InnerEffectTextShadowConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new InnerEffectTextShadowConfig(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final InnerEffectTextShadowConfig[] newArray(int i) {
        return new InnerEffectTextShadowConfig[i];
    }
}
