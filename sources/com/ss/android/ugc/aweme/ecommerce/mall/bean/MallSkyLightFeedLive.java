package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallSkyLightFeedLive {

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("cover")
    public final MallSkyLightFeedLiveCover cover;

    @InterfaceC65349Pkn("number")
    public final Long number;

    @InterfaceC65349Pkn("room_id")
    public final String roomId;

    @InterfaceC65349Pkn("user")
    public final MallSkyLightFeedLiveUser user;

    /* JADX WARN: Multi-variable type inference failed */
    public MallSkyLightFeedLive() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MallSkyLightFeedLive copy$default(MallSkyLightFeedLive mallSkyLightFeedLive, String str, Long l, MallSkyLightFeedLiveCover mallSkyLightFeedLiveCover, MallSkyLightFeedLiveUser mallSkyLightFeedLiveUser, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mallSkyLightFeedLive.roomId;
        }
        if ((i & 2) != 0) {
            l = mallSkyLightFeedLive.number;
        }
        if ((i & 4) != 0) {
            mallSkyLightFeedLiveCover = mallSkyLightFeedLive.cover;
        }
        if ((i & 8) != 0) {
            mallSkyLightFeedLiveUser = mallSkyLightFeedLive.user;
        }
        if ((i & 16) != 0) {
            str2 = mallSkyLightFeedLive.authorId;
        }
        return mallSkyLightFeedLive.copy(str, l, mallSkyLightFeedLiveCover, mallSkyLightFeedLiveUser, str2);
    }

    public final MallSkyLightFeedLive copy(String str, Long l, MallSkyLightFeedLiveCover mallSkyLightFeedLiveCover, MallSkyLightFeedLiveUser mallSkyLightFeedLiveUser, String str2) {
        return new MallSkyLightFeedLive(str, l, mallSkyLightFeedLiveCover, mallSkyLightFeedLiveUser, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallSkyLightFeedLive)) {
            return false;
        }
        MallSkyLightFeedLive mallSkyLightFeedLive = (MallSkyLightFeedLive) obj;
        return o.LJ(this.roomId, mallSkyLightFeedLive.roomId) && o.LJ(this.number, mallSkyLightFeedLive.number) && o.LJ(this.cover, mallSkyLightFeedLive.cover) && o.LJ(this.user, mallSkyLightFeedLive.user) && o.LJ(this.authorId, mallSkyLightFeedLive.authorId);
    }

    public int hashCode() {
        String str = this.roomId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.number;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        MallSkyLightFeedLiveCover mallSkyLightFeedLiveCover = this.cover;
        int hashCode3 = (hashCode2 + (mallSkyLightFeedLiveCover == null ? 0 : mallSkyLightFeedLiveCover.hashCode())) * 31;
        MallSkyLightFeedLiveUser mallSkyLightFeedLiveUser = this.user;
        int hashCode4 = (hashCode3 + (mallSkyLightFeedLiveUser == null ? 0 : mallSkyLightFeedLiveUser.hashCode())) * 31;
        String str2 = this.authorId;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallSkyLightFeedLive(roomId=");
        LIZ.append(this.roomId);
        LIZ.append(", number=");
        LIZ.append(this.number);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", user=");
        LIZ.append(this.user);
        LIZ.append(", authorId=");
        return q.LIZIZ(LIZ, this.authorId, ')', LIZ);
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final MallSkyLightFeedLiveCover getCover() {
        return this.cover;
    }

    public final Long getNumber() {
        return this.number;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final MallSkyLightFeedLiveUser getUser() {
        return this.user;
    }

    public MallSkyLightFeedLive(String str, Long l, MallSkyLightFeedLiveCover mallSkyLightFeedLiveCover, MallSkyLightFeedLiveUser mallSkyLightFeedLiveUser, String str2) {
        this.roomId = str;
        this.number = l;
        this.cover = mallSkyLightFeedLiveCover;
        this.user = mallSkyLightFeedLiveUser;
        this.authorId = str2;
    }

    public /* synthetic */ MallSkyLightFeedLive(String str, Long l, MallSkyLightFeedLiveCover mallSkyLightFeedLiveCover, MallSkyLightFeedLiveUser mallSkyLightFeedLiveUser, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : mallSkyLightFeedLiveCover, (i & 8) != 0 ? null : mallSkyLightFeedLiveUser, (i & 16) == 0 ? str2 : null);
    }
}
