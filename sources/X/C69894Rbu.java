package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tiktok.tpsc.settings.account.GroupTitleAdapterConfigs;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Rbu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69894Rbu implements Parcelable.Creator<GroupTitleAdapterConfigs> {
    @Override // android.os.Parcelable.Creator
    public final GroupTitleAdapterConfigs createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        int readInt = parcel.readInt();
        EnumC69895Rbv valueOf = EnumC69895Rbv.valueOf(parcel.readString());
        int readInt2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt2);
        int i = 0;
        while (i != readInt2) {
            i = C5YW.LIZ(GroupTitleAdapterConfigs.class, parcel, arrayList, i, 1);
        }
        return new GroupTitleAdapterConfigs(readInt, valueOf, arrayList, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final GroupTitleAdapterConfigs[] newArray(int i) {
        return new GroupTitleAdapterConfigs[i];
    }
}
