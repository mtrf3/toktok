package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notification.creator.power.CreatorFragmentData;
import kotlin.jvm.internal.o;

/* renamed from: X.Mar, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57089Mar implements Parcelable.Creator<CreatorFragmentData> {
    @Override // android.os.Parcelable.Creator
    public final CreatorFragmentData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CreatorFragmentData(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final CreatorFragmentData[] newArray(int i) {
        return new CreatorFragmentData[i];
    }
}
