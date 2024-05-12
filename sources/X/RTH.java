package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tiktok.tpsc.settings.account.DisclosureAdapterConfigs;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RTH implements Parcelable.Creator<DisclosureAdapterConfigs> {
    @Override // android.os.Parcelable.Creator
    public final DisclosureAdapterConfigs createFromParcel(Parcel parcel) {
        Integer valueOf;
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        Integer num = null;
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        String readString = parcel.readString();
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new DisclosureAdapterConfigs(readInt, valueOf, num, readString, interfaceC88472Yns, z, (InterfaceC65784Pro) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final DisclosureAdapterConfigs[] newArray(int i) {
        return new DisclosureAdapterConfigs[i];
    }
}
