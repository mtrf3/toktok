package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.InterfaceC87283bg;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectionDetail implements InterfaceC87283bg {

    @InterfaceC65349Pkn("covers")
    public final List<UrlModel> covers;

    @InterfaceC65349Pkn("creator_name")
    public String creatorName;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("share_info")
    public final ShareStruct shareInfo;

    @InterfaceC65349Pkn("statistic")
    public Statistic statistic;

    @InterfaceC65349Pkn("status")
    public final Status status;

    @InterfaceC65349Pkn("uid")
    public String uid;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionDetail() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionDetail)) {
            return false;
        }
        CollectionDetail collectionDetail = (CollectionDetail) obj;
        return o.LJ(this.id, collectionDetail.id) && o.LJ(this.name, collectionDetail.name) && o.LJ(this.covers, collectionDetail.covers) && o.LJ(this.status, collectionDetail.status) && o.LJ(this.statistic, collectionDetail.statistic) && o.LJ(this.uid, collectionDetail.uid) && o.LJ(this.shareInfo, collectionDetail.shareInfo) && o.LJ(this.creatorName, collectionDetail.creatorName) && o.LJ(this.extra, collectionDetail.extra);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UrlModel> list = this.covers;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Status status = this.status;
        int hashCode4 = (hashCode3 + (status == null ? 0 : status.hashCode())) * 31;
        Statistic statistic = this.statistic;
        int hashCode5 = (hashCode4 + (statistic == null ? 0 : statistic.hashCode())) * 31;
        String str3 = this.uid;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShareStruct shareStruct = this.shareInfo;
        int hashCode7 = (hashCode6 + (shareStruct == null ? 0 : shareStruct.hashCode())) * 31;
        String str4 = this.creatorName;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.extra;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    /* loaded from: classes4.dex */
    public static final class ShareStruct {

        @InterfaceC65349Pkn("share_desc")
        public final String desc;

        @InterfaceC65349Pkn("share_desc_info")
        public final String descInfo;

        @InterfaceC65349Pkn("share_title")
        public final String title;

        @InterfaceC65349Pkn("share_url")
        public final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public ShareStruct() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareStruct)) {
                return false;
            }
            ShareStruct shareStruct = (ShareStruct) obj;
            return o.LJ(this.url, shareStruct.url) && o.LJ(this.desc, shareStruct.desc) && o.LJ(this.title, shareStruct.title) && o.LJ(this.descInfo, shareStruct.descInfo);
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.desc;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.descInfo;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShareStruct(url=");
            LIZ.append(this.url);
            LIZ.append(", desc=");
            LIZ.append(this.desc);
            LIZ.append(", title=");
            LIZ.append(this.title);
            LIZ.append(", descInfo=");
            return q.LIZIZ(LIZ, this.descInfo, ')', LIZ);
        }

        public ShareStruct(String str, String str2, String str3, String str4) {
            this.url = str;
            this.desc = str2;
            this.title = str3;
            this.descInfo = str4;
        }

        public /* synthetic */ ShareStruct(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Statistic {

        @InterfaceC65349Pkn("has_videos")
        public final boolean hasVideos;

        @InterfaceC65349Pkn("total")
        public Long total;

        /* JADX WARN: Multi-variable type inference failed */
        public Statistic() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Statistic)) {
                return false;
            }
            Statistic statistic = (Statistic) obj;
            return o.LJ(this.total, statistic.total) && this.hasVideos == statistic.hasVideos;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            Long l = this.total;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            boolean z = this.hasVideos;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Statistic(total=");
            LIZ.append(this.total);
            LIZ.append(", hasVideos=");
            return C48339Iy7.LIZJ(LIZ, this.hasVideos, ')', LIZ);
        }

        public Statistic(Long l, boolean z) {
            this.total = l;
            this.hasVideos = z;
        }

        public /* synthetic */ Statistic(Long l, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? false : z);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Status {

        @InterfaceC65349Pkn("state")
        public Integer state;

        /* JADX WARN: Multi-variable type inference failed */
        public Status() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Status) && o.LJ(this.state, ((Status) obj).state);
        }

        public final int hashCode() {
            Integer num = this.state;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Status(state=");
            return s0.LIZJ(LIZ, this.state, ')', LIZ);
        }

        public Status(Integer num) {
            this.state = num;
        }

        public /* synthetic */ Status(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionDetail(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", covers=");
        LIZ.append(this.covers);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(", statistic=");
        LIZ.append(this.statistic);
        LIZ.append(", uid=");
        LIZ.append(this.uid);
        LIZ.append(", shareInfo=");
        LIZ.append(this.shareInfo);
        LIZ.append(", creatorName=");
        LIZ.append(this.creatorName);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionDetail(String str, String str2, List<? extends UrlModel> list, Status status, Statistic statistic, String str3, ShareStruct shareStruct, String str4, String str5) {
        this.id = str;
        this.name = str2;
        this.covers = list;
        this.status = status;
        this.statistic = statistic;
        this.uid = str3;
        this.shareInfo = shareStruct;
        this.creatorName = str4;
        this.extra = str5;
    }

    public /* synthetic */ CollectionDetail(String str, String str2, List list, Status status, Statistic statistic, String str3, ShareStruct shareStruct, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : status, (i & 16) != 0 ? null : statistic, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : shareStruct, (i & 128) != 0 ? null : str4, (i & 256) == 0 ? str5 : null);
    }
}
