package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextStrokeConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.V4x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79159V4x implements Parcelable.Creator<OuterEffectTextConfig> {
    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextConfig createFromParcel(Parcel parcel) {
        OuterEffectTextShadowConfig createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        int readInt6 = parcel.readInt();
        int readInt7 = parcel.readInt();
        int readInt8 = parcel.readInt();
        int readInt9 = parcel.readInt();
        int readInt10 = parcel.readInt();
        int readInt11 = parcel.readInt();
        int readInt12 = parcel.readInt();
        int readInt13 = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt14 = parcel.readInt();
        int readInt15 = parcel.readInt();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        int readInt16 = parcel.readInt();
        int readInt17 = parcel.readInt();
        int readInt18 = parcel.readInt();
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        float readFloat3 = parcel.readFloat();
        String readString5 = parcel.readString();
        int readInt19 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt19);
        int i = 0;
        while (i != readInt19) {
            i = C279117r.LIZIZ(OuterEffectTextStrokeConfig.CREATOR, parcel, arrayList, i, 1);
        }
        int readInt20 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(readInt20);
        int i2 = 0;
        while (i2 != readInt20) {
            i2 = C279117r.LIZIZ(OuterEffectTextCoverConfig.CREATOR, parcel, arrayList2, i2, 1);
        }
        int readInt21 = parcel.readInt();
        ArrayList arrayList3 = new ArrayList(readInt21);
        int i3 = 0;
        while (i3 != readInt21) {
            i3 = C279117r.LIZIZ(OuterEffectTextBgConfig.CREATOR, parcel, arrayList3, i3, 1);
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = OuterEffectTextShadowConfig.CREATOR.createFromParcel(parcel);
        }
        return new OuterEffectTextConfig(readInt, readInt2, readInt3, readInt4, readInt5, readInt6, readInt7, readInt8, readInt9, readInt10, readInt11, readInt12, readInt13, readString, readString2, readInt14, readInt15, readString3, readString4, readInt16, readInt17, readInt18, readFloat, readFloat2, readFloat3, readString5, arrayList, arrayList2, arrayList3, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final OuterEffectTextConfig[] newArray(int i) {
        return new OuterEffectTextConfig[i];
    }
}
