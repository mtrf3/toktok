package com.ss.android.ugc.aweme.profile.widgets.scm;

import X.C65352Pkq;
import X.C8VC;
import X.InterfaceC235069Kk;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StateControlledMediaAssem extends UIContentAssem {
    public boolean LJLIL;

    public StateControlledMediaAssem() {
        new LinkedHashMap();
        this.LJLIL = true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9If
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS135S0200000_4(this, view, 107));
    }
}
