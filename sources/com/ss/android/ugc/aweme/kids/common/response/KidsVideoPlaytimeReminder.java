package com.ss.android.ugc.aweme.kids.common.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KidsVideoPlaytimeReminder {

    @InterfaceC65349Pkn("wellness_img_url")
    public final String imageUrl;

    @InterfaceC65349Pkn("dark_wellness_img_url")
    public final String imageUrlDark;

    @InterfaceC65349Pkn("subtitle")
    public final String subtitle;

    @InterfaceC65349Pkn("threshold")
    public final Integer threshold;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public KidsVideoPlaytimeReminder() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KidsVideoPlaytimeReminder copy$default(KidsVideoPlaytimeReminder kidsVideoPlaytimeReminder, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kidsVideoPlaytimeReminder.threshold;
        }
        if ((i & 2) != 0) {
            str = kidsVideoPlaytimeReminder.imageUrl;
        }
        if ((i & 4) != 0) {
            str2 = kidsVideoPlaytimeReminder.imageUrlDark;
        }
        if ((i & 8) != 0) {
            str3 = kidsVideoPlaytimeReminder.title;
        }
        if ((i & 16) != 0) {
            str4 = kidsVideoPlaytimeReminder.subtitle;
        }
        return kidsVideoPlaytimeReminder.copy(num, str, str2, str3, str4);
    }

    public final KidsVideoPlaytimeReminder copy(Integer num, String str, String str2, String str3, String str4) {
        return new KidsVideoPlaytimeReminder(num, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsVideoPlaytimeReminder)) {
            return false;
        }
        KidsVideoPlaytimeReminder kidsVideoPlaytimeReminder = (KidsVideoPlaytimeReminder) obj;
        return o.LJ(this.threshold, kidsVideoPlaytimeReminder.threshold) && o.LJ(this.imageUrl, kidsVideoPlaytimeReminder.imageUrl) && o.LJ(this.imageUrlDark, kidsVideoPlaytimeReminder.imageUrlDark) && o.LJ(this.title, kidsVideoPlaytimeReminder.title) && o.LJ(this.subtitle, kidsVideoPlaytimeReminder.subtitle);
    }

    public int hashCode() {
        Integer num = this.threshold;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.imageUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrlDark;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KidsVideoPlaytimeReminder(threshold=");
        LIZ.append(this.threshold);
        LIZ.append(", imageUrl=");
        LIZ.append(this.imageUrl);
        LIZ.append(", imageUrlDark=");
        LIZ.append(this.imageUrlDark);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", subtitle=");
        return q.LIZIZ(LIZ, this.subtitle, ')', LIZ);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageUrlDark() {
        return this.imageUrlDark;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Integer getThreshold() {
        return this.threshold;
    }

    public final String getTitle() {
        return this.title;
    }

    public KidsVideoPlaytimeReminder(Integer num, String str, String str2, String str3, String str4) {
        this.threshold = num;
        this.imageUrl = str;
        this.imageUrlDark = str2;
        this.title = str3;
        this.subtitle = str4;
    }

    public /* synthetic */ KidsVideoPlaytimeReminder(Integer num, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? str4 : null);
    }
}
