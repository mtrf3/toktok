package com.bytedance.android.livesdk.livesetting.message;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveMessageConfig {

    @InterfaceC65349Pkn("duplicate_size")
    public int duplicateSize;

    @InterfaceC65349Pkn("enhance_websocket")
    public boolean enhanceWebsocket;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveMessageConfig() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public final int getDuplicateSize() {
        return this.duplicateSize;
    }

    public final boolean getEnhanceWebsocket() {
        return this.enhanceWebsocket;
    }

    public final void setDuplicateSize(int i) {
        this.duplicateSize = i;
    }

    public final void setEnhanceWebsocket(boolean z) {
        this.enhanceWebsocket = z;
    }

    public LiveMessageConfig(int i, boolean z) {
        this.duplicateSize = i;
        this.enhanceWebsocket = z;
    }

    public /* synthetic */ LiveMessageConfig(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 512 : i, (i2 & 2) != 0 ? false : z);
    }
}
