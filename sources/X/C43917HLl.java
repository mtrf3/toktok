package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MusicSyncData;
import kotlin.jvm.internal.o;

/* renamed from: X.HLl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43917HLl implements Parcelable.Creator<MusicSyncData> {
    @Override // android.os.Parcelable.Creator
    public final MusicSyncData createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new MusicSyncData(parcel.readLong(), parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final MusicSyncData[] newArray(int i) {
        return new MusicSyncData[i];
    }
}
