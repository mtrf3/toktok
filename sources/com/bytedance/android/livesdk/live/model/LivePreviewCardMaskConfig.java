package com.bytedance.android.livesdk.live.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class LivePreviewCardMaskConfig implements Serializable {

    @InterfaceC65349Pkn("live_preview_card_mask_top_optimized")
    public boolean topOptimized;

    @InterfaceC65349Pkn("live_preview_card_bottom_mask_height")
    public int bottomMaskHeight = -1;

    @InterfaceC65349Pkn("live_preview_card_bottom_mask_alpha")
    public int bottomMaskAlpha = 50;

    public final int getBottomMaskAlpha() {
        return this.bottomMaskAlpha;
    }

    public final int getBottomMaskHeight() {
        return this.bottomMaskHeight;
    }

    public final boolean getTopOptimized() {
        return this.topOptimized;
    }

    public final void setBottomMaskAlpha(int i) {
        this.bottomMaskAlpha = i;
    }

    public final void setBottomMaskHeight(int i) {
        this.bottomMaskHeight = i;
    }

    public final void setTopOptimized(boolean z) {
        this.topOptimized = z;
    }
}
