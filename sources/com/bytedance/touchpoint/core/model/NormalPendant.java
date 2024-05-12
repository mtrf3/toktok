package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NormalPendant extends C95U {

    @InterfaceC65349Pkn("activity_id")
    public String activityId;

    @InterfaceC65349Pkn("bottom_text")
    public Title bottomText;

    @InterfaceC65349Pkn("bottom_text_bg_color")
    public String bottomTextBgColor;

    @InterfaceC65349Pkn("close_frequent_limit")
    public CloseFrequentLimit closeFrequentLimit;

    @InterfaceC65349Pkn("dismiss_after")
    public int dismissAfter;

    @InterfaceC65349Pkn("lottie_file_md5")
    public String lottieFileMd5;

    @InterfaceC65349Pkn("lottie_file_zip")
    public String lottieFileZip;

    @InterfaceC65349Pkn("lottie_name")
    public String lottieName;

    @InterfaceC65349Pkn("mini_pendant_closable")
    public boolean miniPendantClosable;

    @InterfaceC65349Pkn("need_login_gate")
    public boolean needLoginGate;

    @InterfaceC65349Pkn("normal_jump_link")
    public String normalJumpLink;

    @InterfaceC65349Pkn("pendant_disable_close")
    public Boolean pendantDisableClose;

    @InterfaceC65349Pkn("pendant_pic")
    public String pendantPic;

    @InterfaceC65349Pkn("pendant_shrink_pic")
    public String pendantShrinkPic;

    @InterfaceC65349Pkn("promotion_hashtag_ids")
    public List<String> promotionIds;

    @InterfaceC65349Pkn("show_after")
    public int showAfter;

    @InterfaceC65349Pkn("show_in_follow")
    public boolean showInFollow;

    @InterfaceC65349Pkn("show_times")
    public int showTimes;

    @InterfaceC65349Pkn("shrink_after")
    public int shrinkAfter;

    public final Object[] LIZIZ() {
        return new Object[]{this.activityId, Integer.valueOf(this.showTimes), Boolean.valueOf(this.showInFollow), this.closeFrequentLimit, this.promotionIds, Boolean.valueOf(this.miniPendantClosable), Integer.valueOf(this.shrinkAfter), Integer.valueOf(this.dismissAfter), Integer.valueOf(this.showAfter), this.normalJumpLink, this.pendantPic, this.pendantShrinkPic, this.pendantDisableClose, this.bottomText, this.bottomTextBgColor, Boolean.valueOf(this.needLoginGate), this.lottieName, this.lottieFileZip, this.lottieFileMd5};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NormalPendant) {
            return C78966Uyw.LJIIIZ(((NormalPendant) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("NormalPendant:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public NormalPendant(String activityId, int i, boolean z, CloseFrequentLimit closeFrequentLimit, List<String> promotionIds, boolean z2, int i2, int i3, int i4, String normalJumpLink, String pendantPic, String pendantShrinkPic, Boolean bool, Title title, String str, boolean z3, String str2, String lottieFileZip, String lottieFileMd5) {
        o.LJIIIZ(activityId, "activityId");
        o.LJIIIZ(promotionIds, "promotionIds");
        o.LJIIIZ(normalJumpLink, "normalJumpLink");
        o.LJIIIZ(pendantPic, "pendantPic");
        o.LJIIIZ(pendantShrinkPic, "pendantShrinkPic");
        o.LJIIIZ(lottieFileZip, "lottieFileZip");
        o.LJIIIZ(lottieFileMd5, "lottieFileMd5");
        this.activityId = activityId;
        this.showTimes = i;
        this.showInFollow = z;
        this.closeFrequentLimit = closeFrequentLimit;
        this.promotionIds = promotionIds;
        this.miniPendantClosable = z2;
        this.shrinkAfter = i2;
        this.dismissAfter = i3;
        this.showAfter = i4;
        this.normalJumpLink = normalJumpLink;
        this.pendantPic = pendantPic;
        this.pendantShrinkPic = pendantShrinkPic;
        this.pendantDisableClose = bool;
        this.bottomText = title;
        this.bottomTextBgColor = str;
        this.needLoginGate = z3;
        this.lottieName = str2;
        this.lottieFileZip = lottieFileZip;
        this.lottieFileMd5 = lottieFileMd5;
    }

    public /* synthetic */ NormalPendant(String str, int i, boolean z, CloseFrequentLimit closeFrequentLimit, List list, boolean z2, int i2, int i3, int i4, String str2, String str3, String str4, Boolean bool, Title title, String str5, boolean z3, String str6, String str7, String str8, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, z, closeFrequentLimit, list, z2, i2, i3, i4, str2, str3, str4, bool, title, str5, (i5 & 32768) != 0 ? false : z3, str6, str7, str8);
    }
}
