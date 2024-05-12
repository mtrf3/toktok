package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public class ShareReportResult {

    @InterfaceC65349Pkn("delta_intimacy")
    public long deltaIntimacy;

    @InterfaceC65349Pkn("display_text")
    public Text displayText;

    public long getDeltaIntimacy() {
        return this.deltaIntimacy;
    }

    public Text getDisplayText() {
        return this.displayText;
    }

    @InterfaceC65349Pkn("delta_intimacy")
    public void setDeltaIntimacy(long j) {
        this.deltaIntimacy = j;
    }

    @InterfaceC65349Pkn("display_text")
    public void setDisplayText(Text text) {
        this.displayText = text;
    }
}
