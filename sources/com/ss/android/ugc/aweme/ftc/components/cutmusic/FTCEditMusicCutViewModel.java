package com.ss.android.ugc.aweme.ftc.components.cutmusic;

import X.C81645W2n;
import X.InterfaceC145415nF;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.jvm.internal.AqS15S0102000_14;
import kotlin.jvm.internal.AqS38S0001000_14;

/* loaded from: classes15.dex */
public final class FTCEditMusicCutViewModel extends LifecycleAwareViewModel<FTCEditMusicCutState> implements InterfaceC145415nF {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public FTCEditMusicCutState kv0() {
        return new FTCEditMusicCutState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC145415nF
    public void show() {
        setState(C81645W2n.LJLIL);
    }

    @Override // X.InterfaceC145415nF
    public void LJJLIIIJ(int i) {
        setState(new AqS38S0001000_14(i, 0));
    }

    @Override // X.InterfaceC145415nF
    public void ds0(AVMusicWaveBean aVMusicWaveBean, int i, int i2) {
        setState(new AqS15S0102000_14(aVMusicWaveBean, i, i2, 0));
    }
}
