package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextStrokeConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V12 implements Parcelable.Creator<OuterEffectTextStrokeConfig> {
    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextStrokeConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new OuterEffectTextStrokeConfig(parcel.readFloat(), parcel.readString(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextStrokeConfig[] newArray(int i) {
        return new OuterEffectTextStrokeConfig[i];
    }
}
