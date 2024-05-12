package com.ss.android.ugc.aweme.nows.feed.ui.other;

import X.C209598Kl;
import X.C221108m2;
import X.C3C8;
import X.C62822Ol8;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import X.InterfaceC57784Mm4;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import kotlin.jvm.internal.AqS153S0100000_3;

/* loaded from: classes4.dex */
public abstract class AbstractOtherAssemCell<ASSEM extends ReusedUISlotAssem<? extends C3C8>, T extends InterfaceC57784Mm4> extends AssemPowerCell<ASSEM, T> implements InterfaceC55100Ljs {
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C209598Kl.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3((AbstractOtherAssemCell) this, 643));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3((AbstractOtherAssemCell) this, 644));

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC55100Ljs
    public final InterfaceC55235Lm3 getParentScope() {
        return (InterfaceC55235Lm3) this.LJLJLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.InterfaceC55100Ljs
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return (ViewModelStoreOwner) this.LJLJLLL.getValue();
    }
}
