package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVK implements Parcelable.Creator<BnplInfo> {
    @Override // android.os.Parcelable.Creator
    public final BnplInfo createFromParcel(Parcel parcel) {
        boolean z;
        Boolean valueOf;
        o.LJIIIZ(parcel, "parcel");
        int i = 0;
        ArrayList arrayList = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = C279117r.LIZIZ(InstallmentPlan.CREATOR, parcel, arrayList, i, 1);
            }
        }
        return new BnplInfo(valueOf, readString, readString2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final BnplInfo[] newArray(int i) {
        return new BnplInfo[i];
    }
}
