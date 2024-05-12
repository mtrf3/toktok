package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectCollectPageMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X7K implements Parcelable.Creator<SelectMusicFromSelectCollectPageMonitor> {
    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectCollectPageMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return SelectMusicFromSelectCollectPageMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectCollectPageMonitor[] newArray(int i) {
        return new SelectMusicFromSelectCollectPageMonitor[i];
    }
}
