package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class SongVideoShownRecord {

    @InterfaceC65349Pkn("time")
    public Long lastShowTimestamp;

    @InterfaceC65349Pkn("id")
    public final String metaSongId;

    @InterfaceC65349Pkn("count")
    public int showTimes;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SongVideoShownRecord)) {
            return false;
        }
        SongVideoShownRecord songVideoShownRecord = (SongVideoShownRecord) obj;
        return o.LJ(this.metaSongId, songVideoShownRecord.metaSongId) && o.LJ(this.lastShowTimestamp, songVideoShownRecord.lastShowTimestamp) && this.showTimes == songVideoShownRecord.showTimes;
    }

    public final int hashCode() {
        int hashCode = this.metaSongId.hashCode() * 31;
        Long l = this.lastShowTimestamp;
        return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.showTimes;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SongVideoShownRecord(metaSongId=");
        LIZ.append(this.metaSongId);
        LIZ.append(", lastShowTimestamp=");
        LIZ.append(this.lastShowTimestamp);
        LIZ.append(", showTimes=");
        LIZ.append(this.showTimes);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SongVideoShownRecord(String metaSongId, Long l, int i) {
        o.LJIIIZ(metaSongId, "metaSongId");
        this.metaSongId = metaSongId;
        this.lastShowTimestamp = l;
        this.showTimes = i;
    }

    public /* synthetic */ SongVideoShownRecord(String str, Long l, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, (i2 & 4) != 0 ? 0 : i);
    }
}
