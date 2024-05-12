package com.ss.android.ugc.aweme.im.sdk.chat.feature.typingindicator;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class TypingStatusConfig extends F9E {

    @InterfaceC65349Pkn("display_interval")
    public final long displayInterval;

    @InterfaceC65349Pkn("send_interval")
    public final long sendInterval;

    @InterfaceC65349Pkn("send_typing_indicator")
    public final boolean sendTypingIndicator;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.displayInterval), Long.valueOf(this.sendInterval), Boolean.valueOf(this.sendTypingIndicator)};
    }

    public TypingStatusConfig(long j, long j2, boolean z) {
        this.displayInterval = j;
        this.sendInterval = j2;
        this.sendTypingIndicator = z;
    }
}
