package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WHI implements Parcelable.Creator<OuterEffectTextLayoutConfig> {
    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextLayoutConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        float readFloat = parcel.readFloat();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        int readInt6 = parcel.readInt();
        int readInt7 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt7);
        int i = 0;
        while (i != readInt7) {
            i = C279117r.LIZIZ(OuterEffectTextConfig.CREATOR, parcel, arrayList, i, 1);
        }
        return new OuterEffectTextLayoutConfig(readInt, readInt2, readFloat, readInt3, readInt4, readInt5, readInt6, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextLayoutConfig[] newArray(int i) {
        return new OuterEffectTextLayoutConfig[i];
    }
}
