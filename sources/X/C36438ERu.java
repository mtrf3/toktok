package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ERu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36438ERu implements Parcelable.Creator<MobileEffectsModel2> {
    @Override // android.os.Parcelable.Creator
    public final MobileEffectsModel2 createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C279117r.LIZIZ(UploadableMobileEffect2.CREATOR, parcel, arrayList, i, 1);
        }
        return new MobileEffectsModel2(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final MobileEffectsModel2[] newArray(int i) {
        return new MobileEffectsModel2[i];
    }
}
