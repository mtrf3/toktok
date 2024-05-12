package com.ss.android.ugc.feed.platform.panel;

import X.C221108m2;
import X.C51781KTx;
import X.C62822Ol8;
import X.C8MM;
import X.InterfaceC79150V4o;
import X.KRA;
import X.KU0;
import X.KU4;
import X.KU5;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.feed.platform.monitor.ComponentTraceVM;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public abstract class BasePanelUIComponent extends UIContentAssem implements KU4 {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public void eventInit(C8MM c8mm) {
    }

    @Override // X.KU4
    public void onPagePause(int i) {
    }

    @Override // X.KU4
    public void onPageResume(int i) {
    }

    public void setUserVisibleHint(boolean z) {
    }

    public BasePanelUIComponent() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 375));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 374));
        this.LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 376));
    }

    @Override // X.KU4
    public final KU5 getActionHandler() {
        return (KU5) this.LJLJI.getValue();
    }

    @Override // X.KU4
    public final KRA getPanelContext() {
        return (KRA) this.LJLIL.getValue();
    }

    @Override // X.C8O3
    public final EventCenter getEventCenter() {
        return getPanelContext().LIZIZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        ComponentTraceVM LIZ = KU0.LIZ(getPanelContext().LJ);
        if (LIZ == null) {
            return;
        }
        LIZ.LJLIL++;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        if (this.LJLILLLLZI.isInitialized()) {
            KU5 ku5 = (KU5) this.LJLILLLLZI.getValue();
            ((InterfaceC79150V4o) ku5.LIZIZ.getValue()).LIZIZ(null);
            ku5.LIZ().clear();
            ku5.LIZIZ().clear();
        }
    }

    @Override // X.C8W0
    public void onParentSet() {
        super.onParentSet();
        C51781KTx.LIZ(this);
    }
}
