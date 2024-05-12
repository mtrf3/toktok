package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker_core.newframework.stickerModel.StickerDataWrapper;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Gj2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42308Gj2 implements Parcelable.Creator<StickerDataWrapper> {
    @Override // android.os.Parcelable.Creator
    public final StickerDataWrapper createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        int i2 = 0;
        while (i2 != readInt) {
            i2 = C5YW.LIZ(StickerDataWrapper.class, parcel, arrayList, i2, 1);
        }
        int readInt2 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(readInt2);
        while (i != readInt2) {
            i = C5YW.LIZ(StickerDataWrapper.class, parcel, arrayList2, i, 1);
        }
        return new StickerDataWrapper(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final StickerDataWrapper[] newArray(int i) {
        return new StickerDataWrapper[i];
    }
}
