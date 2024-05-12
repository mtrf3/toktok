package com.bytedance.android.live.gift;

import X.C76800UCe;
import X.InterfaceC06390Mx;
import X.InterfaceC15800jg;
import X.InterfaceC88472Yns;

/* loaded from: classes.dex */
public interface IHotWordGiftService extends InterfaceC06390Mx {
    void clearLocalLibrary();

    boolean isEnabled();

    boolean isRemoteEnabled();

    boolean isUserEnabled();

    void notifyCommentInputChanged(String str);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void registerToggleChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void setHighlightHandler(InterfaceC15800jg interfaceC15800jg);

    void setUserEnabled(boolean z);

    void unregisterToggleChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);
}
