package com.ss.android.ugc.aweme.dsp.arch;

import X.ActivityC45651qj;
import X.C3C8;
import X.C55096Ljo;
import X.C91395Ztv;
import X.C91397Ztx;
import X.InterfaceC55235Lm3;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ext_power_list.AssemReusedContainer;

/* loaded from: classes22.dex */
public abstract class DspFeedBaseItemCell extends AssemReusedContainer<DspFeedBaseItemCell, C91395Ztv> implements C3C8 {
    public final C91397Ztx LJLLILLLL;

    @Override // X.C8VZ
    public final LifecycleOwner GW() {
        return C55096Ljo.LJIIIZ(this.LJLLILLLL.LJLIL);
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer
    public final LifecycleOwner LJJLI() {
        return this.LJLLILLLL.LJLIL;
    }

    @Override // X.C8VZ
    public final ActivityC45651qj getActivity() {
        return C55096Ljo.LJIIIIZZ(this.LJLLILLLL.LJLIL);
    }

    @Override // X.C8VZ
    public final View getContainerView() {
        return this.LJLLILLLL.LJLJI;
    }

    @Override // com.bytedance.ext_power_list.AssemReusedContainer, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return C55096Ljo.LJIIZILJ(this.LJLLILLLL.LJLIL);
    }

    public DspFeedBaseItemCell(C91397Ztx c91397Ztx) {
        super(c91397Ztx.LJLILLLLZI);
        this.LJLLILLLL = c91397Ztx;
    }
}
