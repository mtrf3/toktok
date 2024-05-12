package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.effectcreator.models.EffectCommandDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectObjectDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ERv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36439ERv implements Parcelable.Creator<EffectPackageDataWrapper> {
    @Override // android.os.Parcelable.Creator
    public final EffectPackageDataWrapper createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        long readLong4 = parcel.readLong();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        int readInt6 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt6);
        int i = 0;
        while (i != readInt6) {
            i = C279117r.LIZIZ(EffectObjectDataWrapper.CREATOR, parcel, arrayList, i, 1);
        }
        int readInt7 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(readInt7);
        int i2 = 0;
        while (i2 != readInt7) {
            i2 = C279117r.LIZIZ(EffectCommandDataWrapper.CREATOR, parcel, arrayList2, i2, 1);
        }
        String readString9 = parcel.readString();
        int readInt8 = parcel.readInt();
        ArrayList arrayList3 = new ArrayList(readInt8);
        int i3 = 0;
        while (i3 != readInt8) {
            i3 = C279117r.LIZIZ(EffectHintWrapper.CREATOR, parcel, arrayList3, i3, 1);
        }
        return new EffectPackageDataWrapper(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readLong, readLong2, readLong3, readLong4, readInt, readInt2, readInt3, readInt4, readInt5, arrayList, arrayList2, readString9, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final EffectPackageDataWrapper[] newArray(int i) {
        return new EffectPackageDataWrapper[i];
    }
}
