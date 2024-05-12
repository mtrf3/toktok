package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectSecondPageMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X7O implements Parcelable.Creator<SelectMusicFromSelectSecondPageMonitor> {
    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectSecondPageMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return SelectMusicFromSelectSecondPageMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectSecondPageMonitor[] newArray(int i) {
        return new SelectMusicFromSelectSecondPageMonitor[i];
    }
}
