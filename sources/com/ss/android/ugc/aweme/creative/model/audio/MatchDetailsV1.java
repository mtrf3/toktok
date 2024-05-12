package com.ss.android.ugc.aweme.creative.model.audio;

import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MatchPeriod;
import com.ss.android.ugc.aweme.creative.model.audio.SongInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MatchDetailsV1 implements Parcelable {
    public static final Parcelable.Creator<MatchDetailsV1> CREATOR = new Parcelable.Creator<MatchDetailsV1>() { // from class: X.6Lp
        @Override // android.os.Parcelable.Creator
        public final MatchDetailsV1 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            o.LJIIIZ(parcel, "parcel");
            long readLong = parcel.readLong();
            SongInfo songInfo = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = C279117r.LIZIZ(MatchPeriod.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                songInfo = SongInfo.CREATOR.createFromParcel(parcel);
            }
            return new MatchDetailsV1(readLong, arrayList, songInfo);
        }

        @Override // android.os.Parcelable.Creator
        public final MatchDetailsV1[] newArray(int i) {
            return new MatchDetailsV1[i];
        }
    };

    @GPV
    @InterfaceC65349Pkn("match_periods")
    public final ArrayList<MatchPeriod> matchPeriods;

    @GPV
    @InterfaceC65349Pkn("match_song_info")
    public final SongInfo matchSongInfo;

    @GPV
    @InterfaceC65349Pkn("matched_meta_song_id")
    public final long matchedMetaSongId;

    /* JADX WARN: Multi-variable type inference failed */
    public MatchDetailsV1() {
        this(0L, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.matchedMetaSongId);
        ArrayList<MatchPeriod> arrayList = this.matchPeriods;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator<MatchPeriod> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(out, i);
            }
        }
        SongInfo songInfo = this.matchSongInfo;
        if (songInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            songInfo.writeToParcel(out, i);
        }
    }

    public MatchDetailsV1(long j, ArrayList<MatchPeriod> arrayList, SongInfo songInfo) {
        this.matchedMetaSongId = j;
        this.matchPeriods = arrayList;
        this.matchSongInfo = songInfo;
    }

    public /* synthetic */ MatchDetailsV1(long j, ArrayList arrayList, SongInfo songInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : arrayList, (i & 4) != 0 ? null : songInfo);
    }
}
