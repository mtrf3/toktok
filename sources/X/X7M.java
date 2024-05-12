package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectForYouPageMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X7M implements Parcelable.Creator<SelectMusicFromSelectForYouPageMonitor> {
    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectForYouPageMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return SelectMusicFromSelectForYouPageMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectForYouPageMonitor[] newArray(int i) {
        return new SelectMusicFromSelectForYouPageMonitor[i];
    }
}
