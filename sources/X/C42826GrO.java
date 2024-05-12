package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import kotlin.jvm.internal.o;

/* renamed from: X.GrO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42826GrO implements Parcelable.Creator<LogPbBean> {
    @Override // android.os.Parcelable.Creator
    public final LogPbBean createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new LogPbBean();
    }

    @Override // android.os.Parcelable.Creator
    public final LogPbBean[] newArray(int i) {
        return new LogPbBean[i];
    }
}
