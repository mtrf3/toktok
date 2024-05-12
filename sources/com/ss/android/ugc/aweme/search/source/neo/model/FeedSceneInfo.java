package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.OQY;
import X.X1D;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FeedSceneInfo {

    @InterfaceC65349Pkn("act")
    public final Set<String> actSet;

    @InterfaceC65349Pkn("aweme_id")
    public final String awemeId;

    @InterfaceC65349Pkn("effect_id")
    public final String effectId;

    @InterfaceC65349Pkn("music_id")
    public final String musicId;

    @InterfaceC65349Pkn("music_play_time")
    public final Long musicPlayTime;

    @InterfaceC65349Pkn("play_time")
    public final Long playTime;

    @InterfaceC65349Pkn("timestamp")
    public final Long timestamp;

    public FeedSceneInfo() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSceneInfo)) {
            return false;
        }
        FeedSceneInfo feedSceneInfo = (FeedSceneInfo) obj;
        return o.LJ(this.timestamp, feedSceneInfo.timestamp) && o.LJ(this.awemeId, feedSceneInfo.awemeId) && o.LJ(this.playTime, feedSceneInfo.playTime) && o.LJ(this.musicPlayTime, feedSceneInfo.musicPlayTime) && o.LJ(this.musicId, feedSceneInfo.musicId) && o.LJ(this.effectId, feedSceneInfo.effectId) && o.LJ(this.actSet, feedSceneInfo.actSet);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Long l = this.timestamp;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int LJ = C79062V1e.LJ(this.awemeId, hashCode * 31, 31);
        Long l2 = this.playTime;
        if (l2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l2.hashCode();
        }
        int i2 = (LJ + hashCode2) * 31;
        Long l3 = this.musicPlayTime;
        if (l3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        String str = this.musicId;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str2 = this.effectId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.actSet.hashCode() + ((i4 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[awemeId:");
        LIZ.append(this.awemeId);
        LIZ.append(", timestamp:");
        LIZ.append(this.timestamp);
        LIZ.append(", playTime:");
        LIZ.append(this.playTime);
        LIZ.append(", musicPlayTime:");
        LIZ.append(this.musicPlayTime);
        LIZ.append(", musicId:");
        LIZ.append(this.musicId);
        LIZ.append(", effectId:");
        LIZ.append(this.effectId);
        LIZ.append(" actSet:");
        LIZ.append(this.actSet);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public FeedSceneInfo(Long l, String awemeId, Long l2, Long l3, String str, String str2, Set<String> actSet) {
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(actSet, "actSet");
        this.timestamp = l;
        this.awemeId = awemeId;
        this.playTime = l2;
        this.musicPlayTime = l3;
        this.musicId = str;
        this.effectId = str2;
        this.actSet = actSet;
    }

    public static FeedSceneInfo LIZ(FeedSceneInfo feedSceneInfo, Long l, Long l2, String str, String str2, Set set, int i) {
        Long l3;
        Set actSet = set;
        String str3 = str2;
        String str4 = str;
        Long l4 = l;
        Long l5 = l2;
        String awemeId = null;
        if ((i & 1) != 0) {
            l3 = feedSceneInfo.timestamp;
        } else {
            l3 = null;
        }
        if ((i & 2) != 0) {
            awemeId = feedSceneInfo.awemeId;
        }
        if ((i & 4) != 0) {
            l4 = feedSceneInfo.playTime;
        }
        if ((i & 8) != 0) {
            l5 = feedSceneInfo.musicPlayTime;
        }
        if ((i & 16) != 0) {
            str4 = feedSceneInfo.musicId;
        }
        if ((i & 32) != 0) {
            str3 = feedSceneInfo.effectId;
        }
        if ((i & 64) != 0) {
            actSet = feedSceneInfo.actSet;
        }
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(actSet, "actSet");
        return new FeedSceneInfo(l3, awemeId, l4, l5, str4, str3, actSet);
    }

    public FeedSceneInfo(Long l, String str, Long l2, Long l3, String str2, String str3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : str2, (i & 32) == 0 ? str3 : null, (i & 64) != 0 ? OQY.INSTANCE : set);
    }
}
