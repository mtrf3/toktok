package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ShareWarnInfo extends F9E implements Serializable {
    public boolean hasShown;

    @InterfaceC65349Pkn("learn_more_text")
    public final String learnMoreText;

    @InterfaceC65349Pkn("learn_more_url")
    public final String learnMoreUrl;

    @InterfaceC65349Pkn("sub_title_1")
    public final String subTitle1;

    @InterfaceC65349Pkn("sub_title_2")
    public final String subTitle2;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareWarnInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShareWarnInfo copy$default(ShareWarnInfo shareWarnInfo, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareWarnInfo.title;
        }
        if ((i & 2) != 0) {
            str2 = shareWarnInfo.subTitle1;
        }
        if ((i & 4) != 0) {
            str3 = shareWarnInfo.subTitle2;
        }
        if ((i & 8) != 0) {
            str4 = shareWarnInfo.learnMoreText;
        }
        if ((i & 16) != 0) {
            str5 = shareWarnInfo.learnMoreUrl;
        }
        if ((i & 32) != 0) {
            z = shareWarnInfo.hasShown;
        }
        return shareWarnInfo.copy(str, str2, str3, str4, str5, z);
    }

    public final ShareWarnInfo copy(String title, String subTitle1, String subTitle2, String learnMoreText, String learnMoreUrl, boolean z) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(subTitle1, "subTitle1");
        o.LJIIIZ(subTitle2, "subTitle2");
        o.LJIIIZ(learnMoreText, "learnMoreText");
        o.LJIIIZ(learnMoreUrl, "learnMoreUrl");
        return new ShareWarnInfo(title, subTitle1, subTitle2, learnMoreText, learnMoreUrl, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.title, this.subTitle1, this.subTitle2, this.learnMoreText, this.learnMoreUrl, Boolean.valueOf(this.hasShown)};
    }

    public final boolean getHasShown() {
        return this.hasShown;
    }

    public final String getLearnMoreText() {
        return this.learnMoreText;
    }

    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final String getSubTitle1() {
        return this.subTitle1;
    }

    public final String getSubTitle2() {
        return this.subTitle2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setHasShown(boolean z) {
        this.hasShown = z;
    }

    public ShareWarnInfo(String title, String subTitle1, String subTitle2, String learnMoreText, String learnMoreUrl, boolean z) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(subTitle1, "subTitle1");
        o.LJIIIZ(subTitle2, "subTitle2");
        o.LJIIIZ(learnMoreText, "learnMoreText");
        o.LJIIIZ(learnMoreUrl, "learnMoreUrl");
        this.title = title;
        this.subTitle1 = subTitle1;
        this.subTitle2 = subTitle2;
        this.learnMoreText = learnMoreText;
        this.learnMoreUrl = learnMoreUrl;
        this.hasShown = z;
    }

    public /* synthetic */ ShareWarnInfo(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? false : z);
    }
}
