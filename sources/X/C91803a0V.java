package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneRouteArg;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.a0V, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91803a0V implements Parcelable.Creator<PhoneRouteArg> {
    @Override // android.os.Parcelable.Creator
    public final PhoneRouteArg createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i != readInt; i++) {
            arrayList.add(parcel.readParcelable(PhoneRouteArg.class.getClassLoader()));
        }
        return new PhoneRouteArg(readString, arrayList, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PhoneRouteArg[] newArray(int i) {
        return new PhoneRouteArg[i];
    }
}
