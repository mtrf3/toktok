package com.bytedance.android.livesdk.livesetting.watchlive.enterroom;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SlardarTagData {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("app_log_count")
    public int logCount;

    @InterfaceC65349Pkn("message_count")
    public int messageCount;

    /* JADX WARN: Multi-variable type inference failed */
    public SlardarTagData() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    public SlardarTagData(boolean z, int i, int i2) {
        this.enable = z;
        this.messageCount = i;
        this.logCount = i2;
    }

    public /* synthetic */ SlardarTagData(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? true : z, (i3 & 2) != 0 ? 5 : i, (i3 & 4) != 0 ? 5 : i2);
    }
}
