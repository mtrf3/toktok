package com.ss.android.ugc.aweme.ftc.components.corner;

import X.C164646dA;
import X.InterfaceC146745pO;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS7S0010000_2;

/* loaded from: classes3.dex */
public final class FTCEditCornerViewModel extends LifecycleAwareViewModel<FTCEditCornerState> implements InterfaceC146745pO {
    @Override // X.InterfaceC146745pO
    public void JV() {
        setState(C164646dA.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public FTCEditCornerState kv0() {
        return new FTCEditCornerState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC146745pO
    public void GT(boolean z) {
        setState(new AqS7S0010000_2(z, 3));
    }

    @Override // X.InterfaceC146745pO
    public void LLZZZIL(int i) {
        setState(new AqS27S0001000_2(i, 2));
    }

    @Override // X.InterfaceC146745pO
    public void f0(int i) {
        setState(new AqS27S0001000_2(i, 3));
    }
}
