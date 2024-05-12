package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextBgConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WHJ implements Parcelable.Creator<OuterEffectTextBgConfig> {
    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextBgConfig createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new OuterEffectTextBgConfig(readString, z, EffectTextBgNinePatch.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextBgConfig[] newArray(int i) {
        return new OuterEffectTextBgConfig[i];
    }
}
