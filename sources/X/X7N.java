package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectLocalPageMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X7N implements Parcelable.Creator<SelectMusicFromSelectLocalPageMonitor> {
    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectLocalPageMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return SelectMusicFromSelectLocalPageMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectLocalPageMonitor[] newArray(int i) {
        return new SelectMusicFromSelectLocalPageMonitor[i];
    }
}
