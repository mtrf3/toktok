package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.flow.PageSession;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X7I implements Parcelable.Creator<PageSession> {
    @Override // android.os.Parcelable.Creator
    public final PageSession createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new PageSession();
    }

    @Override // android.os.Parcelable.Creator
    public final PageSession[] newArray(int i) {
        return new PageSession[i];
    }
}
