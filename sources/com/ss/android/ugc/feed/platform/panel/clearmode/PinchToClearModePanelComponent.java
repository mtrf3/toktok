package com.ss.android.ugc.feed.platform.panel.clearmode;

import X.C2K0;
import X.C78540Us4;
import X.C78963Uyt;
import X.InterfaceC55102Lju;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;

/* loaded from: classes2.dex */
public final class PinchToClearModePanelComponent extends BasePanelComponent implements IPinchToClearModePanelComponent, InterfaceC55102Lju {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -950925715) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.clearmode.IPinchToClearModePanelComponent
    public final void Ek(float f, Aweme aweme) {
        C78963Uyt.LJJJJJ(f, aweme, C78540Us4.LJFF(getPanelContext()));
    }
}
