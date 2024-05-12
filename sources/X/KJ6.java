package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectSearchPageMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KJ6 implements Parcelable.Creator<SelectMusicFromSelectSearchPageMonitor> {
    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectSearchPageMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return SelectMusicFromSelectSearchPageMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectSearchPageMonitor[] newArray(int i) {
        return new SelectMusicFromSelectSearchPageMonitor[i];
    }
}
