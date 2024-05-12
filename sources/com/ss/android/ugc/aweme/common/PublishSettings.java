package com.ss.android.ugc.aweme.common;

import X.EnumC42002Ge6;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishSettings implements Serializable {

    @InterfaceC65349Pkn("allow_comment")
    public final boolean allowComment;

    @InterfaceC65349Pkn("allow_duet")
    public final boolean allowDuet;

    @InterfaceC65349Pkn("allow_stitch")
    public final boolean allowStitch;

    @InterfaceC65349Pkn("caption")
    public final String caption;

    @InterfaceC65349Pkn("cover_image_timestamp")
    public final Double coverImageTimeStamp;

    @InterfaceC65349Pkn("is_direct_post")
    public final boolean isDirectPost;

    @InterfaceC65349Pkn("privacy_setting")
    public final EnumC42002Ge6 privacySetting;

    @InterfaceC65349Pkn("title")
    public final String title;

    public static /* synthetic */ PublishSettings copy$default(PublishSettings publishSettings, EnumC42002Ge6 enumC42002Ge6, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC42002Ge6 = publishSettings.privacySetting;
        }
        if ((i & 2) != 0) {
            z = publishSettings.isDirectPost;
        }
        if ((i & 4) != 0) {
            z2 = publishSettings.allowDuet;
        }
        if ((i & 8) != 0) {
            z3 = publishSettings.allowStitch;
        }
        if ((i & 16) != 0) {
            z4 = publishSettings.allowComment;
        }
        if ((i & 32) != 0) {
            str = publishSettings.caption;
        }
        if ((i & 64) != 0) {
            str2 = publishSettings.title;
        }
        if ((i & 128) != 0) {
            d = publishSettings.coverImageTimeStamp;
        }
        return publishSettings.copy(enumC42002Ge6, z, z2, z3, z4, str, str2, d);
    }

    public final PublishSettings copy(EnumC42002Ge6 privacySetting, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, Double d) {
        o.LJIIIZ(privacySetting, "privacySetting");
        return new PublishSettings(privacySetting, z, z2, z3, z4, str, str2, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishSettings)) {
            return false;
        }
        PublishSettings publishSettings = (PublishSettings) obj;
        return this.privacySetting == publishSettings.privacySetting && this.isDirectPost == publishSettings.isDirectPost && this.allowDuet == publishSettings.allowDuet && this.allowStitch == publishSettings.allowStitch && this.allowComment == publishSettings.allowComment && o.LJ(this.caption, publishSettings.caption) && o.LJ(this.title, publishSettings.title) && o.LJ(this.coverImageTimeStamp, publishSettings.coverImageTimeStamp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.privacySetting.hashCode() * 31;
        boolean z = this.isDirectPost;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.allowDuet;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.allowStitch;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (((i4 + i5) * 31) + (this.allowComment ? 1 : 0)) * 31;
        String str = this.caption;
        int hashCode2 = (i6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.coverImageTimeStamp;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishSettings(privacySetting=");
        LIZ.append(this.privacySetting);
        LIZ.append(", isDirectPost=");
        LIZ.append(this.isDirectPost);
        LIZ.append(", allowDuet=");
        LIZ.append(this.allowDuet);
        LIZ.append(", allowStitch=");
        LIZ.append(this.allowStitch);
        LIZ.append(", allowComment=");
        LIZ.append(this.allowComment);
        LIZ.append(", caption=");
        LIZ.append(this.caption);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", coverImageTimeStamp=");
        LIZ.append(this.coverImageTimeStamp);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean getAllowComment() {
        return this.allowComment;
    }

    public final boolean getAllowDuet() {
        return this.allowDuet;
    }

    public final boolean getAllowStitch() {
        return this.allowStitch;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final Double getCoverImageTimeStamp() {
        return this.coverImageTimeStamp;
    }

    public final EnumC42002Ge6 getPrivacySetting() {
        return this.privacySetting;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isDirectPost() {
        return this.isDirectPost;
    }

    public PublishSettings(EnumC42002Ge6 privacySetting, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, Double d) {
        o.LJIIIZ(privacySetting, "privacySetting");
        this.privacySetting = privacySetting;
        this.isDirectPost = z;
        this.allowDuet = z2;
        this.allowStitch = z3;
        this.allowComment = z4;
        this.caption = str;
        this.title = str2;
        this.coverImageTimeStamp = d;
    }
}
