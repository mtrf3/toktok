package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notification.creator.power.CreatorAllTabFragmentData;
import kotlin.jvm.internal.o;

/* renamed from: X.Maq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57088Maq implements Parcelable.Creator<CreatorAllTabFragmentData> {
    @Override // android.os.Parcelable.Creator
    public final CreatorAllTabFragmentData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CreatorAllTabFragmentData(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final CreatorAllTabFragmentData[] newArray(int i) {
        return new CreatorAllTabFragmentData[i];
    }
}
