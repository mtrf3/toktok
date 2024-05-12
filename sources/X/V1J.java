package X;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V1J implements Parcelable.Creator<InnerEffectTextStrokeConfig> {
    @Override // android.os.Parcelable.Creator
    public final InnerEffectTextStrokeConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new InnerEffectTextStrokeConfig(parcel.readFloat(), parcel.readInt(), Paint.Join.valueOf(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final InnerEffectTextStrokeConfig[] newArray(int i) {
        return new InnerEffectTextStrokeConfig[i];
    }
}
