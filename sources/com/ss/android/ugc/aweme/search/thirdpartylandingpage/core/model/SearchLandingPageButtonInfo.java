package com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class SearchLandingPageButtonInfo extends F9E implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("button_name")
    public final String buttonName;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("click_link")
    public final String clickLink;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchLandingPageButtonInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchLandingPageButtonInfo copy$default(SearchLandingPageButtonInfo searchLandingPageButtonInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchLandingPageButtonInfo.buttonName;
        }
        if ((i & 2) != 0) {
            str2 = searchLandingPageButtonInfo.buttonText;
        }
        if ((i & 4) != 0) {
            str3 = searchLandingPageButtonInfo.clickLink;
        }
        return searchLandingPageButtonInfo.copy(str, str2, str3);
    }

    public final SearchLandingPageButtonInfo copy(String buttonName, String buttonText, String clickLink) {
        o.LJIIIZ(buttonName, "buttonName");
        o.LJIIIZ(buttonText, "buttonText");
        o.LJIIIZ(clickLink, "clickLink");
        return new SearchLandingPageButtonInfo(buttonName, buttonText, clickLink);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.buttonName, this.buttonText, this.clickLink};
    }

    public final String getButtonName() {
        return this.buttonName;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getClickLink() {
        return this.clickLink;
    }

    public SearchLandingPageButtonInfo(String str, String str2, String str3) {
        HH1.LIZ(str, "buttonName", str2, "buttonText", str3, "clickLink");
        this.buttonName = str;
        this.buttonText = str2;
        this.clickLink = str3;
    }

    public /* synthetic */ SearchLandingPageButtonInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
