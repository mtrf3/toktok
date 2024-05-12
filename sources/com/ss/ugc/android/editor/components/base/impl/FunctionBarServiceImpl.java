package com.ss.ugc.android.editor.components.base.impl;

import X.ActivityC45651qj;
import X.AnonymousClass523;
import X.AnonymousClass525;
import X.AnonymousClass526;
import X.AnonymousClass528;
import X.C1286052y;
import X.C50Q;
import X.C5G0;
import X.C5G5;
import X.InterfaceC1286152z;
import Y.AObserverS70S0100000_2;
import androidx.lifecycle.LifecycleOwner;
import com.ss.ugc.android.editor.base.functions.ShowPanelFragmentEvent;
import com.ss.ugc.android.editor.components.base.api.IFunctionBarService;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FunctionBarServiceImpl implements IFunctionBarService {
    public C1286052y functionBarController;

    @Override // com.ss.ugc.android.editor.components.base.api.IFunctionBarService
    public void onDestroy() {
        this.functionBarController = null;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IFunctionBarService
    public C50Q getFuncBarController() {
        return this.functionBarController;
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IFunctionBarService
    public void init(ActivityC45651qj activity, InterfaceC1286152z interfaceC1286152z, int i, int i2) {
        o.LJIIIZ(activity, "activity");
        C1286052y c1286052y = new C1286052y(activity, i, i2);
        this.functionBarController = c1286052y;
        if (interfaceC1286152z != null) {
            if (!c1286052y.LJLJL) {
                C5G5.LIZ(c1286052y);
                c1286052y.LJLJLLL = interfaceC1286152z;
                ArrayList<AnonymousClass523> LIZJ = interfaceC1286152z.LIZJ();
                if (LIZJ != null) {
                    c1286052y.LJIILLIIL().setRootFunctionList(LIZJ);
                    c1286052y.LJLJJLL = new AnonymousClass526(LIZJ);
                }
                AnonymousClass526 anonymousClass526 = c1286052y.LJLJJLL;
                if (anonymousClass526 != null) {
                    AnonymousClass525 anonymousClass525 = new AnonymousClass525(c1286052y.LJIILLIIL(), anonymousClass526, c1286052y.LJLLLLLL);
                    c1286052y.LJLLLL = new AnonymousClass528(anonymousClass525);
                    c1286052y.LJLJJL = anonymousClass525;
                }
                c1286052y.LJIILLIIL().getFuncItemClickState().observe((LifecycleOwner) c1286052y.LJLLJ.getValue(), new AObserverS70S0100000_2(c1286052y, 10));
                c1286052y.LJIILLIIL().getBackToRootStateChanged().observe((LifecycleOwner) c1286052y.LJLLJ.getValue(), new AObserverS70S0100000_2(c1286052y, 11));
                c1286052y.LJIILLIIL().getBackIconClickState().observe((LifecycleOwner) c1286052y.LJLLJ.getValue(), new AObserverS70S0100000_2(c1286052y, 12));
                ((ShowPanelFragmentEvent) C5G0.LIZ(ShowPanelFragmentEvent.class)).LJLIL.observe((LifecycleOwner) c1286052y.LJLLJ.getValue(), new AObserverS70S0100000_2(c1286052y, 13));
                c1286052y.LJLJL = true;
                return;
            }
            throw new IllegalStateException("Duplicate initialization.");
        }
    }
}
