package com.bytedance.android.livesdk.game;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class GameLinkMicGiftDialogConfig {

    @InterfaceC65349Pkn("block_barrier")
    public boolean isBlockBarrier;

    @InterfaceC65349Pkn("block_widget")
    public boolean isBlockWidget;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GameLinkMicGiftDialogConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.GameLinkMicGiftDialogConfig.<init>():void");
    }

    public GameLinkMicGiftDialogConfig(boolean z, boolean z2) {
        this.isBlockWidget = z;
        this.isBlockBarrier = z2;
    }

    public /* synthetic */ GameLinkMicGiftDialogConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
