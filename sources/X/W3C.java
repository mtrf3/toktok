package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextBgNinePatch;
import com.ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W3C implements Parcelable.Creator<EffectTextBgNinePatch> {
    @Override // android.os.Parcelable.Creator
    public final EffectTextBgNinePatch createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        int i2 = 0;
        while (i2 != readInt) {
            i2 = C279117r.LIZIZ(NinePatchDiv.CREATOR, parcel, arrayList, i2, 1);
        }
        int readInt2 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(readInt2);
        while (i != readInt2) {
            i = C279117r.LIZIZ(NinePatchDiv.CREATOR, parcel, arrayList2, i, 1);
        }
        return new EffectTextBgNinePatch(arrayList, arrayList2, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final EffectTextBgNinePatch[] newArray(int i) {
        return new EffectTextBgNinePatch[i];
    }
}
