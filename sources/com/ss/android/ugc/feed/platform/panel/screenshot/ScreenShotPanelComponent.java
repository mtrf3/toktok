package com.ss.android.ugc.feed.platform.panel.screenshot;

import X.C16880lQ;
import X.C221108m2;
import X.C221138m5;
import X.C51781KTx;
import X.C55304LnA;
import X.C55309LnF;
import X.C5H3;
import X.C62819Ol5;
import X.C62822Ol8;
import X.EnumC221088m0;
import X.JAK;
import X.KU4;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS65S0110000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ScreenShotPanelComponent extends BasePanelComponent {
    public final C5H3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public ScreenShotPanelComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS159S0100000_9((KU4) this, 744), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS65S0110000_9(false, (KU4) this, 5));
        }
        this.LJLIL = c62822Ol8;
        this.LJLILLLLZI = C221108m2.LIZIZ(C55304LnA.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 745));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.KU4, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void setUserVisibleHint(boolean z) {
        int i;
        String str;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLIL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            i = iFeedPanelPlatformAbility.getPanelPageType();
        } else {
            i = 0;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LJLIL.getValue();
        String str2 = null;
        if (iFeedPanelPlatformAbility2 != null) {
            str2 = iFeedPanelPlatformAbility2.getPanelEventType();
        }
        String enterFrom = C62819Ol5.LJIILIIL(i, str2, true);
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null || (str = C16880lQ.LJLLJ(validTopActivity.getClass())) == null) {
            str = "";
        }
        if (z) {
            IScreenshotService iScreenshotService = (IScreenshotService) this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            iScreenshotService.LIZ(enterFrom, new C55309LnF(this, str, enterFrom));
            return;
        }
        ((IScreenshotService) this.LJLILLLLZI.getValue()).LJI(enterFrom);
    }
}
