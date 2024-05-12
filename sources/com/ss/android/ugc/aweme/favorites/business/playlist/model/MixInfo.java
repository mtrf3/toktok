package com.ss.android.ugc.aweme.favorites.business.playlist.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MixInfo {

    @InterfaceC65349Pkn("mix_creator_user_id")
    public final String authorUid;

    @InterfaceC65349Pkn("cover_url")
    public final String coverUrl;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("mix_name")
    public final String name;

    @InterfaceC65349Pkn("mix_video_total_count")
    public final Integer totalVideoCount;

    @InterfaceC65349Pkn("mix_video_update_count")
    public final Integer updatedVideoCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixInfo)) {
            return false;
        }
        MixInfo mixInfo = (MixInfo) obj;
        return o.LJ(this.id, mixInfo.id) && o.LJ(this.coverUrl, mixInfo.coverUrl) && o.LJ(this.name, mixInfo.name) && o.LJ(this.totalVideoCount, mixInfo.totalVideoCount) && o.LJ(this.updatedVideoCount, mixInfo.updatedVideoCount) && o.LJ(this.authorUid, mixInfo.authorUid);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.coverUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.totalVideoCount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.updatedVideoCount;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.authorUid;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MixInfo(id=");
        LIZ.append(this.id);
        LIZ.append(", coverUrl=");
        LIZ.append(this.coverUrl);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", totalVideoCount=");
        LIZ.append(this.totalVideoCount);
        LIZ.append(", updatedVideoCount=");
        LIZ.append(this.updatedVideoCount);
        LIZ.append(", authorUid=");
        return q.LIZIZ(LIZ, this.authorUid, ')', LIZ);
    }

    public MixInfo(String id, String str, String str2, Integer num, Integer num2, String str3) {
        o.LJIIIZ(id, "id");
        this.id = id;
        this.coverUrl = str;
        this.name = str2;
        this.totalVideoCount = num;
        this.updatedVideoCount = num2;
        this.authorUid = str3;
    }
}
