package com.ss.android.ugc.aweme.ftc.components.volume;

import X.InterfaceC146795pT;
import X.WUT;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import kotlin.jvm.internal.AqS37S1000000_14;
import kotlin.jvm.internal.AqS38S0001000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FTCEditVolumeViewModel extends LifecycleAwareViewModel<FTCEditVolumeState> implements InterfaceC146795pT {
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public FTCEditVolumeState kv0() {
        return new FTCEditVolumeState(null, null, null, null, 15, null);
    }

    @Override // X.InterfaceC146795pT
    public void show() {
        setState(WUT.LJLIL);
    }

    @Override // X.InterfaceC146795pT
    public void L3(String value) {
        o.LJIIIZ(value, "value");
        setState(new AqS37S1000000_14(value, 0));
    }

    @Override // X.InterfaceC146795pT
    public void O2(int i) {
        setState(new AqS38S0001000_14(i, 1));
    }

    @Override // X.InterfaceC146795pT
    public void t(String value) {
        o.LJIIIZ(value, "value");
        setState(new AqS37S1000000_14(value, 1));
    }
}
