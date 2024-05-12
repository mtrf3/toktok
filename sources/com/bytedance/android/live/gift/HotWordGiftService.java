package com.bytedance.android.live.gift;

import X.C15870jn;
import X.C76800UCe;
import X.CN1;
import X.InterfaceC15800jg;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class HotWordGiftService implements IHotWordGiftService {
    public static final HotWordGiftService LJLILLLLZI = new HotWordGiftService();
    public final /* synthetic */ IHotWordGiftService LJLIL = (IHotWordGiftService) CN1.LIZ(IHotWordGiftService.class);

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void clearLocalLibrary() {
        this.LJLIL.clearLocalLibrary();
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final boolean isEnabled() {
        return this.LJLIL.isEnabled();
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final boolean isRemoteEnabled() {
        return this.LJLIL.isRemoteEnabled();
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final boolean isUserEnabled() {
        return this.LJLIL.isUserEnabled();
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void notifyCommentInputChanged(String input) {
        o.LJIIIZ(input, "input");
        this.LJLIL.notifyCommentInputChanged(input);
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C15870jn.LIZ(this);
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void registerToggleChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.registerToggleChangeListener(listener);
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void setHighlightHandler(InterfaceC15800jg interfaceC15800jg) {
        this.LJLIL.setHighlightHandler(interfaceC15800jg);
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void setUserEnabled(boolean z) {
        this.LJLIL.setUserEnabled(z);
    }

    @Override // com.bytedance.android.live.gift.IHotWordGiftService
    public final void unregisterToggleChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.unregisterToggleChangeListener(listener);
    }
}
