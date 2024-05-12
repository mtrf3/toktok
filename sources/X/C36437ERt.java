package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.ERt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36437ERt implements Parcelable.Creator<MobileEffectsModel> {
    @Override // android.os.Parcelable.Creator
    public final MobileEffectsModel createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        int i2 = 0;
        while (i2 != readInt) {
            i2 = C279117r.LIZIZ(UploadableMobileEffect.CREATOR, parcel, arrayList, i2, 1);
        }
        int readInt2 = parcel.readInt();
        ArrayList arrayList2 = new ArrayList(readInt2);
        while (i != readInt2) {
            i = C279117r.LIZIZ(UploadableDraftEffect.CREATOR, parcel, arrayList2, i, 1);
        }
        return new MobileEffectsModel(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final MobileEffectsModel[] newArray(int i) {
        return new MobileEffectsModel[i];
    }
}
