package com.ss.android.ugc.aweme.comment.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CPCPromptData extends F9E {

    @InterfaceC65349Pkn("time_interval_for_next_prompt")
    public final int nextPromptInterval;

    @InterfaceC65349Pkn("prompt_text")
    public final String promptText;

    @InterfaceC65349Pkn("redirect_link_text")
    public final String redirectLinkText;

    /* JADX WARN: Multi-variable type inference failed */
    public CPCPromptData() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CPCPromptData copy$default(CPCPromptData cPCPromptData, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cPCPromptData.promptText;
        }
        if ((i2 & 2) != 0) {
            str2 = cPCPromptData.redirectLinkText;
        }
        if ((i2 & 4) != 0) {
            i = cPCPromptData.nextPromptInterval;
        }
        return cPCPromptData.copy(str, str2, i);
    }

    public final CPCPromptData copy(String promptText, String redirectLinkText, int i) {
        o.LJIIIZ(promptText, "promptText");
        o.LJIIIZ(redirectLinkText, "redirectLinkText");
        return new CPCPromptData(promptText, redirectLinkText, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.promptText, this.redirectLinkText, Integer.valueOf(this.nextPromptInterval)};
    }

    public final int getNextPromptInterval() {
        return this.nextPromptInterval;
    }

    public final String getPromptText() {
        return this.promptText;
    }

    public final String getRedirectLinkText() {
        return this.redirectLinkText;
    }

    public CPCPromptData(String promptText, String redirectLinkText, int i) {
        o.LJIIIZ(promptText, "promptText");
        o.LJIIIZ(redirectLinkText, "redirectLinkText");
        this.promptText = promptText;
        this.redirectLinkText = redirectLinkText;
        this.nextPromptInterval = i;
    }

    public /* synthetic */ CPCPromptData(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
