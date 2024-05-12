package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70522Rm2;
import X.C70523Rm3;
import X.C73156SnQ;
import X.KL2;
import X.RVZ;
import X.TBT;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpAddonFloatWidget extends JediBaseWidget {
    public final C62822Ol8 LJLIL;
    public final float LJLILLLLZI;
    public RVZ LJLJI;
    public Boolean LJLJJI;
    public Boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public Boolean LJLL;
    public float LJLLI;
    public PthreadTimer LJLLILLLL;

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return R.layout.wq;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        View findViewById;
        Context context;
        super.onCreate();
        View view = this.contentView;
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = this.contentView;
        if (view2 != null && (context = view2.getContext()) != null) {
            this.LJLLI = this.LJLILLLLZI - KL2.LJIIJJI(context);
        }
        PthreadTimer pthreadTimer = new PthreadTimer("PdpAddonFloatWidget");
        this.LJLLILLLL = pthreadTimer;
        pthreadTimer.schedule(new C70523Rm3(this), 500L, 500L);
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rm0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getScrollOffset());
            }
        }, new AqS194S0100000_12(this, 59));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rm4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
            }
        }, new AqS194S0100000_12(this, 60));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.RmA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getAddonFloatViewViewVO();
            }
        }, new AqS194S0100000_12(this, 61));
        View view3 = this.contentView;
        if (view3 != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 12, 42), view3);
        }
        View view4 = this.contentView;
        if (view4 != null && (findViewById = view4.findViewById(R.id.bfp)) != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 13, 42), findViewById);
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        PthreadTimer pthreadTimer = this.LJLLILLLL;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        if (o.LJ(this.LJLJJI, Boolean.FALSE)) {
            C70522Rm2.LIZ.LIZJ(0, 1);
        }
    }

    public PdpAddonFloatWidget(PdpFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 153));
        this.LJLILLLLZI = 325.0f;
        this.LJLJJI = Boolean.FALSE;
        Boolean bool = Boolean.TRUE;
        this.LJLJJL = bool;
        this.LJLL = bool;
    }
}
