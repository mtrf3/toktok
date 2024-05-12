package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextStrokeConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V39 implements Parcelable.Creator<OuterEffectTextCoverConfig> {
    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextCoverConfig createFromParcel(Parcel parcel) {
        OuterEffectTextShadowConfig createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        int readInt4 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt4);
        int i = 0;
        while (i != readInt4) {
            i = C279117r.LIZIZ(OuterEffectTextStrokeConfig.CREATOR, parcel, arrayList, i, 1);
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = OuterEffectTextShadowConfig.CREATOR.createFromParcel(parcel);
        }
        return new OuterEffectTextCoverConfig(readString, readString2, readInt, readInt2, readInt3, readFloat, readFloat2, arrayList, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextCoverConfig[] newArray(int i) {
        return new OuterEffectTextCoverConfig[i];
    }
}
