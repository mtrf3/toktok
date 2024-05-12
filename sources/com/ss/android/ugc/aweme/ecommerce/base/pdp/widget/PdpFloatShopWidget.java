package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget;

import X.C16880lQ;
import X.C221108m2;
import X.C27549ArZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70941Rsn;
import X.C78946Uyc;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;

/* loaded from: classes5.dex */
public final class PdpFloatShopWidget extends JediBaseWidget {
    public final C62822Ol8 LJLIL;

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return R.layout.a2d;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public PdpFloatShopWidget() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 74));
    }

    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View view = this.contentView;
        if (view != null) {
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 48, 42), view);
        }
        View view2 = this.contentView;
        if (view2 != null) {
            C78946Uyc.LJJIIJZLJL(view2, new C70941Rsn(), new AqS154S0100000_4(this, 245), C27549ArZ.LJLIL);
        }
    }
}
