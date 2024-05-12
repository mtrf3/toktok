package X;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WH8 implements Parcelable.Creator<InnerEffectTextCoverConfig> {
    @Override // android.os.Parcelable.Creator
    public final InnerEffectTextCoverConfig createFromParcel(Parcel parcel) {
        InnerEffectTextShadowConfig createFromParcel;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        WHB valueOf = WHB.valueOf(parcel.readString());
        WH9 valueOf2 = WH9.valueOf(parcel.readString());
        Paint.Style valueOf3 = Paint.Style.valueOf(parcel.readString());
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        int readInt3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt3);
        int i = 0;
        while (i != readInt3) {
            i = C279117r.LIZIZ(InnerEffectTextStrokeConfig.CREATOR, parcel, arrayList, i, 1);
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = InnerEffectTextShadowConfig.CREATOR.createFromParcel(parcel);
        }
        return new InnerEffectTextCoverConfig(readInt, readInt2, valueOf, valueOf2, valueOf3, readFloat, readFloat2, arrayList, createFromParcel);
    }

    @Override // android.os.Parcelable.Creator
    public final InnerEffectTextCoverConfig[] newArray(int i) {
        return new InnerEffectTextCoverConfig[i];
    }
}
