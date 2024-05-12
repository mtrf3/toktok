package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectFirstPageMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X7L implements Parcelable.Creator<SelectMusicFromSelectFirstPageMonitor> {
    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectFirstPageMonitor createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return SelectMusicFromSelectFirstPageMonitor.INSTANCE;
    }

    @Override // android.os.Parcelable.Creator
    public final SelectMusicFromSelectFirstPageMonitor[] newArray(int i) {
        return new SelectMusicFromSelectFirstPageMonitor[i];
    }
}
