package com.ss.android.ugc.aweme.models;

import X.AnonymousClass391;
import X.C48339Iy7;
import X.C79062V1e;
import X.EnumC69898Rby;
import X.RVB;
import X.UC7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RssArticle implements Parcelable {
    public static final Parcelable.Creator<RssArticle> CREATOR = new RVB();
    public final List<Long> awemeIds;
    public final String date;
    public final String description;
    public final int guid;
    public final boolean hasMaxImages;
    public final List<String> imageUrls;
    public final boolean isPublished;
    public final String linkUrl;
    public final String rssGuid;
    public final String rssUrl;
    public final EnumC69898Rby status;
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RssArticle)) {
            return false;
        }
        RssArticle rssArticle = (RssArticle) obj;
        return o.LJ(this.title, rssArticle.title) && o.LJ(this.description, rssArticle.description) && o.LJ(this.rssUrl, rssArticle.rssUrl) && o.LJ(this.rssGuid, rssArticle.rssGuid) && o.LJ(this.imageUrls, rssArticle.imageUrls) && o.LJ(this.date, rssArticle.date) && this.status == rssArticle.status && o.LJ(this.linkUrl, rssArticle.linkUrl) && o.LJ(this.awemeIds, rssArticle.awemeIds) && this.hasMaxImages == rssArticle.hasMaxImages;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RssArticle() {
        /*
            r11 = this;
            java.lang.String r1 = ""
            X.OQg r5 = X.C61878OQg.INSTANCE
            X.Rby r7 = X.EnumC69898Rby.UNPUBLISHED
            r10 = 0
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r1
            r8 = r1
            r9 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.models.RssArticle.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.imageUrls, C79062V1e.LJ(this.rssGuid, C79062V1e.LJ(this.rssUrl, C79062V1e.LJ(this.description, this.title.hashCode() * 31, 31), 31), 31), 31);
        String str = this.date;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        EnumC69898Rby enumC69898Rby = this.status;
        if (enumC69898Rby != null) {
            i = enumC69898Rby.hashCode();
        }
        int LIZIZ2 = AnonymousClass391.LIZIZ(this.awemeIds, C79062V1e.LJ(this.linkUrl, (i2 + i) * 31, 31), 31);
        boolean z = this.hasMaxImages;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return LIZIZ2 + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RssArticle(title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", rssUrl=");
        LIZ.append(this.rssUrl);
        LIZ.append(", rssGuid=");
        LIZ.append(this.rssGuid);
        LIZ.append(", imageUrls=");
        LIZ.append(this.imageUrls);
        LIZ.append(", date=");
        LIZ.append(this.date);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(", linkUrl=");
        LIZ.append(this.linkUrl);
        LIZ.append(", awemeIds=");
        LIZ.append(this.awemeIds);
        LIZ.append(", hasMaxImages=");
        return C48339Iy7.LIZJ(LIZ, this.hasMaxImages, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.description);
        out.writeString(this.rssUrl);
        out.writeString(this.rssGuid);
        out.writeStringList(this.imageUrls);
        out.writeString(this.date);
        EnumC69898Rby enumC69898Rby = this.status;
        if (enumC69898Rby == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC69898Rby.name());
        }
        out.writeString(this.linkUrl);
        Iterator LIZJ = UC7.LIZJ(this.awemeIds, out);
        while (LIZJ.hasNext()) {
            out.writeLong(((Number) LIZJ.next()).longValue());
        }
        out.writeInt(this.hasMaxImages ? 1 : 0);
    }

    public RssArticle(String title, String description, String rssUrl, String rssGuid, List<String> imageUrls, String str, EnumC69898Rby enumC69898Rby, String linkUrl, List<Long> awemeIds, boolean z) {
        boolean z2;
        o.LJIIIZ(title, "title");
        o.LJIIIZ(description, "description");
        o.LJIIIZ(rssUrl, "rssUrl");
        o.LJIIIZ(rssGuid, "rssGuid");
        o.LJIIIZ(imageUrls, "imageUrls");
        o.LJIIIZ(linkUrl, "linkUrl");
        o.LJIIIZ(awemeIds, "awemeIds");
        this.title = title;
        this.description = description;
        this.rssUrl = rssUrl;
        this.rssGuid = rssGuid;
        this.imageUrls = imageUrls;
        this.date = str;
        this.status = enumC69898Rby;
        this.linkUrl = linkUrl;
        this.awemeIds = awemeIds;
        this.hasMaxImages = z;
        this.guid = hashCode();
        if (enumC69898Rby == EnumC69898Rby.PUBLISHED) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isPublished = z2;
    }
}
