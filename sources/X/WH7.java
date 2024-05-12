package X;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectExtraConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WH7 implements Parcelable.Creator<InnerEffectTextConfig> {
    @Override // android.os.Parcelable.Creator
    public final InnerEffectTextConfig createFromParcel(Parcel parcel) {
        InnerEffectTextShadowConfig createFromParcel;
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
        int readInt14 = parcel.readInt();
        OSZ osz = (OSZ) parcel.readSerializable();
        int readInt15 = parcel.readInt();
        Paint.Style valueOf = Paint.Style.valueOf(parcel.readString());
        int readInt16 = parcel.readInt();
        int readInt17 = parcel.readInt();
        WHB valueOf2 = WHB.valueOf(parcel.readString());
        WH9 valueOf3 = WH9.valueOf(parcel.readString());
        int readInt18 = parcel.readInt();
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        float readFloat3 = parcel.readFloat();
        String readString = parcel.readString();
        int readInt19 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt19);
        int i = 0;
        while (i != readInt19) {
            i = C279117r.LIZIZ(InnerEffectTextStrokeConfig.CREATOR, parcel, arrayList, i, 1);
        }
        int readInt20 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(readInt20);
        int i2 = 0;
        while (i2 != readInt20) {
            i2 = C279117r.LIZIZ(InnerEffectTextCoverConfig.CREATOR, parcel, arrayList2, i2, 1);
        }
        int readInt21 = parcel.readInt();
        ArrayList arrayList3 = new ArrayList(readInt21);
        int i3 = 0;
        while (i3 != readInt21) {
            i3 = C279117r.LIZIZ(InnerEffectTextBgConfig.CREATOR, parcel, arrayList3, i3, 1);
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = InnerEffectTextShadowConfig.CREATOR.createFromParcel(parcel);
        }
        return new InnerEffectTextConfig(readInt, readInt2, readInt3, readInt4, readInt5, readInt6, readInt7, readInt8, readInt9, readInt10, readInt11, readInt12, readInt13, readInt14, osz, readInt15, valueOf, readInt16, readInt17, valueOf2, valueOf3, readInt18, readFloat, readFloat2, readFloat3, readString, arrayList, arrayList2, arrayList3, createFromParcel, InnerEffectExtraConfig.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final InnerEffectTextConfig[] newArray(int i) {
        return new InnerEffectTextConfig[i];
    }
}
