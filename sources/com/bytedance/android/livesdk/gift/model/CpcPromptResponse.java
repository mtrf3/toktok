package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CpcPromptResponse extends F9E {

    @InterfaceC65349Pkn("gift_faq")
    public boolean giftFaq;

    @InterfaceC65349Pkn("prompt")
    public String prompt;

    @InterfaceC65349Pkn("redirect_link_text")
    public String redirectLinkText;

    @InterfaceC65349Pkn("time_interval_for_display")
    public long timeIntervalForDisplay;

    @InterfaceC65349Pkn("time_interval_for_next_prompt")
    public long timeIntervalForNextPrompt;

    @InterfaceC65349Pkn("time_interval_for_next_request")
    public long timeIntervalForNextRequest;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CpcPromptResponse() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r9 = 0
            r10 = 63
            r0 = r12
            r2 = r1
            r5 = r3
            r7 = r3
            r11 = r1
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.model.CpcPromptResponse.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.prompt, this.redirectLinkText, Long.valueOf(this.timeIntervalForDisplay), Long.valueOf(this.timeIntervalForNextPrompt), Long.valueOf(this.timeIntervalForNextRequest), Boolean.valueOf(this.giftFaq)};
    }

    public CpcPromptResponse(String str, String str2, long j, long j2, long j3, boolean z) {
        this.prompt = str;
        this.redirectLinkText = str2;
        this.timeIntervalForDisplay = j;
        this.timeIntervalForNextPrompt = j2;
        this.timeIntervalForNextRequest = j3;
        this.giftFaq = z;
    }

    public /* synthetic */ CpcPromptResponse(String str, String str2, long j, long j2, long j3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) == 0 ? str2 : null, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) == 0 ? j3 : 0L, (i & 32) != 0 ? false : z);
    }
}
