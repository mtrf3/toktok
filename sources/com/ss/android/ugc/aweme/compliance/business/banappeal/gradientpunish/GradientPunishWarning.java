package com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class GradientPunishWarning extends F9E {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("toast_text")
    public final String bubbleText;

    @InterfaceC65349Pkn("detail_url")
    public final String detailUrl;

    @InterfaceC65349Pkn("popup_confirm")
    public final String dialogButton;

    @InterfaceC65349Pkn("popup_text")
    public final String dialogMessage;

    @InterfaceC65349Pkn("warn_type")
    public final int warnType;

    /* JADX WARN: Multi-variable type inference failed */
    public GradientPunishWarning() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GradientPunishWarning copy$default(GradientPunishWarning gradientPunishWarning, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gradientPunishWarning.dialogMessage;
        }
        if ((i2 & 2) != 0) {
            str2 = gradientPunishWarning.dialogButton;
        }
        if ((i2 & 4) != 0) {
            str3 = gradientPunishWarning.bubbleText;
        }
        if ((i2 & 8) != 0) {
            i = gradientPunishWarning.warnType;
        }
        if ((i2 & 16) != 0) {
            str4 = gradientPunishWarning.detailUrl;
        }
        return gradientPunishWarning.copy(str, str2, str3, i, str4);
    }

    public final GradientPunishWarning copy(String dialogMessage, String dialogButton, String bubbleText, int i, String detailUrl) {
        o.LJIIIZ(dialogMessage, "dialogMessage");
        o.LJIIIZ(dialogButton, "dialogButton");
        o.LJIIIZ(bubbleText, "bubbleText");
        o.LJIIIZ(detailUrl, "detailUrl");
        return new GradientPunishWarning(dialogMessage, dialogButton, bubbleText, i, detailUrl);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.dialogMessage, this.dialogButton, this.bubbleText, Integer.valueOf(this.warnType), this.detailUrl};
    }

    public final String getBubbleText() {
        return this.bubbleText;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final String getDialogButton() {
        return this.dialogButton;
    }

    public final String getDialogMessage() {
        return this.dialogMessage;
    }

    public final int getWarnType() {
        return this.warnType;
    }

    public GradientPunishWarning(String str, String str2, String str3, int i, String str4) {
        C43588H8u.LIZLLL(str, "dialogMessage", str2, "dialogButton", str3, "bubbleText", str4, "detailUrl");
        this.dialogMessage = str;
        this.dialogButton = str2;
        this.bubbleText = str3;
        this.warnType = i;
        this.detailUrl = str4;
    }

    public /* synthetic */ GradientPunishWarning(String str, String str2, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) == 0 ? str4 : "");
    }
}
