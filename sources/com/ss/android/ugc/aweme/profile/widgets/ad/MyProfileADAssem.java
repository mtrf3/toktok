package com.ss.android.ugc.aweme.profile.widgets.ad;

import X.C237559Tz;
import X.C65352Pkq;
import X.C8VC;
import X.C9KV;
import X.C9PL;
import X.InterfaceC235069Kk;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MyProfileADAssem extends UIContentAssem {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    public MyProfileADAssem() {
        new LinkedHashMap();
    }

    public final void v3() {
        String str;
        Aweme aweme;
        if (this.LJLJJL && (str = this.LJLJI) != null) {
            C237559Tz c237559Tz = new C237559Tz();
            C9PL c9pl = (C9PL) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(C9KV.class));
            if (c9pl != null) {
                aweme = c9pl.LJII;
            } else {
                aweme = null;
            }
            c237559Tz.LJIIJJI(str, aweme, "other");
            this.LJLIL = false;
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        if (this.LJLJJI && !this.LJLILLLLZI) {
            v3();
        }
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9KD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS170S0100000_4(this, 629));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9KE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 630));
        this.LJLILLLLZI = true;
    }
}
