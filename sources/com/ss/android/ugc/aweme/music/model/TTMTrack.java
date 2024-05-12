package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TTMTrack implements Serializable {

    @InterfaceC65349Pkn("artist_name")
    public String artistName;

    @InterfaceC65349Pkn("cover_medium")
    public UrlModel coverMedium;

    @InterfaceC65349Pkn("duration")
    public Long duration;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("name")
    public String name;

    /* JADX WARN: Multi-variable type inference failed */
    public TTMTrack() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TTMTrack copy$default(TTMTrack tTMTrack, String str, String str2, UrlModel urlModel, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTMTrack.id;
        }
        if ((i & 2) != 0) {
            str2 = tTMTrack.name;
        }
        if ((i & 4) != 0) {
            urlModel = tTMTrack.coverMedium;
        }
        if ((i & 8) != 0) {
            l = tTMTrack.duration;
        }
        if ((i & 16) != 0) {
            str3 = tTMTrack.artistName;
        }
        return tTMTrack.copy(str, str2, urlModel, l, str3);
    }

    public final TTMTrack copy(String id, String str, UrlModel urlModel, Long l, String str2) {
        o.LJIIIZ(id, "id");
        return new TTMTrack(id, str, urlModel, l, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTMTrack)) {
            return false;
        }
        TTMTrack tTMTrack = (TTMTrack) obj;
        return o.LJ(this.id, tTMTrack.id) && o.LJ(this.name, tTMTrack.name) && o.LJ(this.coverMedium, tTMTrack.coverMedium) && o.LJ(this.duration, tTMTrack.duration) && o.LJ(this.artistName, tTMTrack.artistName);
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.coverMedium;
        int hashCode3 = (hashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Long l = this.duration;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.artistName;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTMTrack(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", coverMedium=");
        LIZ.append(this.coverMedium);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", artistName=");
        return q.LIZIZ(LIZ, this.artistName, ')', LIZ);
    }

    public final String getArtistName() {
        return this.artistName;
    }

    public final UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public TTMTrack(String id, String str, UrlModel urlModel, Long l, String str2) {
        o.LJIIIZ(id, "id");
        this.id = id;
        this.name = str;
        this.coverMedium = urlModel;
        this.duration = l;
        this.artistName = str2;
    }

    public /* synthetic */ TTMTrack(String str, String str2, UrlModel urlModel, Long l, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : urlModel, (i & 8) != 0 ? -1L : l, (i & 16) == 0 ? str3 : "");
    }
}
