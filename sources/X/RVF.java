package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tiktok.tpsc.TPSCPageBuildConfigs;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RVF implements Parcelable.Creator<TPSCPageBuildConfigs> {
    @Override // android.os.Parcelable.Creator
    public final TPSCPageBuildConfigs createFromParcel(Parcel parcel) {
        Integer valueOf;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        EnumC69896Rbw valueOf2 = EnumC69896Rbw.valueOf(parcel.readString());
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i != readInt) {
            i = C5YW.LIZ(TPSCPageBuildConfigs.class, parcel, arrayList, i, 1);
        }
        return new TPSCPageBuildConfigs(readString, valueOf, valueOf2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final TPSCPageBuildConfigs[] newArray(int i) {
        return new TPSCPageBuildConfigs[i];
    }
}
