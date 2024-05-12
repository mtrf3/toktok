package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.model.MissionInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.UZu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77414UZu implements Parcelable.Creator<MissionInfo> {
    @Override // android.os.Parcelable.Creator
    public final MissionInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new MissionInfo();
    }

    @Override // android.os.Parcelable.Creator
    public final MissionInfo[] newArray(int i) {
        return new MissionInfo[i];
    }
}
