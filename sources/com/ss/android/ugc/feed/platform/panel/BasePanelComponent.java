package com.ss.android.ugc.feed.platform.panel;

import X.C221108m2;
import X.C51781KTx;
import X.C5H3;
import X.C8MM;
import X.C8W0;
import X.InterfaceC79150V4o;
import X.KRA;
import X.KU0;
import X.KU4;
import X.KU5;
import com.ss.android.ugc.feed.platform.monitor.ComponentTraceVM;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class BasePanelComponent extends C8W0 implements KU4 {
    public final C5H3 _panelContext$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(this, 372));
    public final C5H3<KU5> _actionHandler = C221108m2.LIZIZ(new AqS158S0100000_8(this, 371));
    public final C5H3 actionHandler$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(this, 373));

    public void onPagePause(int i) {
    }

    public void onPageResume(int i) {
    }

    @Override // X.KU4, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public void setUserVisibleHint(boolean z) {
    }

    private final KRA get_panelContext() {
        return (KRA) this._panelContext$delegate.getValue();
    }

    @Override // X.KU4
    public KU5 getActionHandler() {
        return (KU5) this.actionHandler$delegate.getValue();
    }

    @Override // X.C8O3
    public EventCenter getEventCenter() {
        return getPanelContext().LIZIZ;
    }

    @Override // X.KU4
    public KRA getPanelContext() {
        return get_panelContext();
    }

    @Override // X.C8W0
    public void onCreate() {
        super.onCreate();
        ComponentTraceVM LIZ = KU0.LIZ(getPanelContext().LJ);
        if (LIZ == null) {
            return;
        }
        LIZ.LJLIL++;
    }

    @Override // X.C8W0
    public void onDestroy() {
        super.onDestroy();
        if (this._actionHandler.isInitialized()) {
            KU5 value = this._actionHandler.getValue();
            ((InterfaceC79150V4o) value.LIZIZ.getValue()).LIZIZ(null);
            value.LIZ().clear();
            value.LIZIZ().clear();
        }
    }

    @Override // X.C8W0
    public void onParentSet() {
        super.onParentSet();
        C51781KTx.LIZ(this);
    }

    public void eventInit(C8MM receiver) {
        o.LJIIIZ(receiver, "$receiver");
    }
}
