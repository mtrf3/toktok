package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import kotlin.jvm.internal.o;

/* renamed from: X.Hxo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45772Hxo implements Parcelable.Creator<StickPointMusicAlg> {
    @Override // android.os.Parcelable.Creator
    public final StickPointMusicAlg createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new StickPointMusicAlg();
    }

    @Override // android.os.Parcelable.Creator
    public final StickPointMusicAlg[] newArray(int i) {
        return new StickPointMusicAlg[i];
    }
}
