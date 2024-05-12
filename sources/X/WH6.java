package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WH6 implements Parcelable.Creator<InnerEffectTextBgConfig> {
    @Override // android.os.Parcelable.Creator
    public final InnerEffectTextBgConfig createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new InnerEffectTextBgConfig(readString, z, EffectTextBgNinePatch.CREATOR.createFromParcel(parcel), parcel.readInt(), WHC.valueOf(parcel.readString()), WHC.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final InnerEffectTextBgConfig[] newArray(int i) {
        return new InnerEffectTextBgConfig[i];
    }
}
