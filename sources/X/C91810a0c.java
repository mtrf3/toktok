package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinSetRouteArg;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.a0c, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91810a0c implements Parcelable.Creator<PinSetRouteArg> {
    @Override // android.os.Parcelable.Creator
    public final PinSetRouteArg createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        EnumC92072a4q valueOf = EnumC92072a4q.valueOf(parcel.readString());
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add(parcel.readSerializable());
        }
        return new PinSetRouteArg(valueOf, arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PinSetRouteArg[] newArray(int i) {
        return new PinSetRouteArg[i];
    }
}
