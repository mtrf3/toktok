package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.external.router.AssetInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.GmR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42519GmR implements Parcelable.Creator<AssetInfo> {
    @Override // android.os.Parcelable.Creator
    public final AssetInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new AssetInfo(parcel.readString(), parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final AssetInfo[] newArray(int i) {
        return new AssetInfo[i];
    }
}
