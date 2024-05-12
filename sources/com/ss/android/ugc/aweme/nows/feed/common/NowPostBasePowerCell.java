package com.ss.android.ugc.aweme.nows.feed.common;

import X.C19N;
import X.C209558Kh;
import X.C210188Ms;
import X.C221108m2;
import X.C3C8;
import X.C62822Ol8;
import X.InterfaceC194547kI;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class NowPostBasePowerCell<ASSEM extends ReusedUISlotAssem<? extends C3C8>, T extends InterfaceC194547kI> extends AssemPowerCell<ASSEM, T> implements InterfaceC55100Ljs {
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C209558Kh.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3((NowPostBasePowerCell) this, 573));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3((NowPostBasePowerCell) this, 574));

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        if (C19N.LJ("now_optimize_scope", true)) {
            return super.getParentScope();
        }
        return (InterfaceC55235Lm3) this.LJLJLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC55100Ljs
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return (ViewModelStoreOwner) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        ASSEM L = L();
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        this.LJLIL = C210188Ms.LIZIZ(context, L.W3(), parent, false, null);
        M(L, getContainerView(), this);
        return getContainerView();
    }
}
