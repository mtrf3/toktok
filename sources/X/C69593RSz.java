package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleBrief;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RSz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69593RSz implements Parcelable.Creator<BundleBrief> {
    @Override // android.os.Parcelable.Creator
    public final BundleBrief createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        return new BundleBrief(createStringArrayList, valueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final BundleBrief[] newArray(int i) {
        return new BundleBrief[i];
    }
}
