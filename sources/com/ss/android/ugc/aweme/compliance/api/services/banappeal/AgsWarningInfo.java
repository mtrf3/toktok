package com.ss.android.ugc.aweme.compliance.api.services.banappeal;

import X.C236459Pt;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AgsWarningInfo extends F9E implements Serializable {
    public static final C236459Pt Companion = new Object() { // from class: X.9Pt
    };

    @InterfaceC65349Pkn("button_close_text")
    public final String buttonCloseText;

    @InterfaceC65349Pkn("button_detail_text")
    public final String buttonDetailText;

    @InterfaceC65349Pkn("detail_url")
    public final String detailUrl;

    @InterfaceC65349Pkn("warning_desc")
    public final String warningDesc;

    @InterfaceC65349Pkn("warning_level")
    public final int warningLevel;

    @InterfaceC65349Pkn("warning_title")
    public final String warningTitle;

    public static /* synthetic */ AgsWarningInfo copy$default(AgsWarningInfo agsWarningInfo, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = agsWarningInfo.buttonCloseText;
        }
        if ((i2 & 2) != 0) {
            str2 = agsWarningInfo.buttonDetailText;
        }
        if ((i2 & 4) != 0) {
            str3 = agsWarningInfo.warningDesc;
        }
        if ((i2 & 8) != 0) {
            str4 = agsWarningInfo.warningTitle;
        }
        if ((i2 & 16) != 0) {
            str5 = agsWarningInfo.detailUrl;
        }
        if ((i2 & 32) != 0) {
            i = agsWarningInfo.warningLevel;
        }
        return agsWarningInfo.copy(str, str2, str3, str4, str5, i);
    }

    public final AgsWarningInfo copy(String buttonCloseText, String buttonDetailText, String warningDesc, String warningTitle, String detailUrl, int i) {
        o.LJIIIZ(buttonCloseText, "buttonCloseText");
        o.LJIIIZ(buttonDetailText, "buttonDetailText");
        o.LJIIIZ(warningDesc, "warningDesc");
        o.LJIIIZ(warningTitle, "warningTitle");
        o.LJIIIZ(detailUrl, "detailUrl");
        return new AgsWarningInfo(buttonCloseText, buttonDetailText, warningDesc, warningTitle, detailUrl, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.buttonCloseText, this.buttonDetailText, this.warningDesc, this.warningTitle, this.detailUrl, Integer.valueOf(this.warningLevel)};
    }

    public final String getButtonCloseText() {
        return this.buttonCloseText;
    }

    public final String getButtonDetailText() {
        return this.buttonDetailText;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final String getWarningDesc() {
        return this.warningDesc;
    }

    public final int getWarningLevel() {
        return this.warningLevel;
    }

    public final String getWarningTitle() {
        return this.warningTitle;
    }

    public AgsWarningInfo(String buttonCloseText, String buttonDetailText, String warningDesc, String warningTitle, String detailUrl, int i) {
        o.LJIIIZ(buttonCloseText, "buttonCloseText");
        o.LJIIIZ(buttonDetailText, "buttonDetailText");
        o.LJIIIZ(warningDesc, "warningDesc");
        o.LJIIIZ(warningTitle, "warningTitle");
        o.LJIIIZ(detailUrl, "detailUrl");
        this.buttonCloseText = buttonCloseText;
        this.buttonDetailText = buttonDetailText;
        this.warningDesc = warningDesc;
        this.warningTitle = warningTitle;
        this.detailUrl = detailUrl;
        this.warningLevel = i;
    }
}
