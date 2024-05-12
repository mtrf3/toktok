package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class KtfInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("caution_label")
    public final String cautionLabel;
    public boolean hasShowOnce;

    @InterfaceC65349Pkn("message_text_on_share")
    public final String messageTextOnShare;

    @InterfaceC65349Pkn("show_message_on_share")
    public final boolean showMessageOnShare;

    @InterfaceC65349Pkn("show_warning")
    public final boolean showWarning;

    @InterfaceC65349Pkn("warning_text")
    public final String warningText;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KtfInfo() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r2
            r4 = r1
            r5 = r2
            r6 = r1
            r8 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.KtfInfo.<init>():void");
    }

    public static /* synthetic */ KtfInfo copy$default(KtfInfo ktfInfo, boolean z, String str, String str2, boolean z2, String str3, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ktfInfo.showWarning;
        }
        if ((i & 2) != 0) {
            str = ktfInfo.cautionLabel;
        }
        if ((i & 4) != 0) {
            str2 = ktfInfo.warningText;
        }
        if ((i & 8) != 0) {
            z2 = ktfInfo.showMessageOnShare;
        }
        if ((i & 16) != 0) {
            str3 = ktfInfo.messageTextOnShare;
        }
        if ((i & 32) != 0) {
            z3 = ktfInfo.hasShowOnce;
        }
        return ktfInfo.copy(z, str, str2, z2, str3, z3);
    }

    public final KtfInfo copy(boolean z, String cautionLabel, String warningText, boolean z2, String messageTextOnShare, boolean z3) {
        o.LJIIIZ(cautionLabel, "cautionLabel");
        o.LJIIIZ(warningText, "warningText");
        o.LJIIIZ(messageTextOnShare, "messageTextOnShare");
        return new KtfInfo(z, cautionLabel, warningText, z2, messageTextOnShare, z3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.showWarning), this.cautionLabel, this.warningText, Boolean.valueOf(this.showMessageOnShare), this.messageTextOnShare, Boolean.valueOf(this.hasShowOnce)};
    }

    public final void resetState() {
        this.hasShowOnce = false;
    }

    public final String getCautionLabel() {
        return this.cautionLabel;
    }

    public final boolean getHasShowOnce() {
        return this.hasShowOnce;
    }

    public final String getMessageTextOnShare() {
        return this.messageTextOnShare;
    }

    public final boolean getShowMessageOnShare() {
        return this.showMessageOnShare;
    }

    public final boolean getShowWarning() {
        return this.showWarning;
    }

    public final String getWarningText() {
        return this.warningText;
    }

    public final void setHasShowOnce(boolean z) {
        this.hasShowOnce = z;
    }

    public KtfInfo(boolean z, String str, String str2, boolean z2, String str3, boolean z3) {
        HH1.LIZ(str, "cautionLabel", str2, "warningText", str3, "messageTextOnShare");
        this.showWarning = z;
        this.cautionLabel = str;
        this.warningText = str2;
        this.showMessageOnShare = z2;
        this.messageTextOnShare = str3;
        this.hasShowOnce = z3;
    }

    public /* synthetic */ KtfInfo(boolean z, String str, String str2, boolean z2, String str3, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z2, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? false : z3);
    }
}
