package com.bytedance.creativex.recorder.sticker.panel;

import X.C1EP;
import X.C221108m2;
import X.C5H3;
import X.C63081OpJ;
import X.C82398WVm;
import X.C82622Wbi;
import X.I9W;
import X.InterfaceC45925I0r;
import X.InterfaceC65784Pro;
import X.InterfaceC82400WVo;
import X.InterfaceC88472Yns;
import X.W4A;
import X.W4D;
import X.W4E;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS56S0110000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class RecordStickerPanelViewModel extends LifecycleAwareViewModel<StickerPanelState> implements InterfaceC45925I0r {
    public final MutableLiveData<Boolean> LJLJL;
    public final C5H3 LJLJLJ;
    public boolean LJLJLLL;
    public final C82622Wbi LJLL;
    public final W4A LJLLI;

    private final HashSet<W4E> Kv0() {
        return (HashSet) this.LJLJLJ.getValue();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public StickerPanelState kv0() {
        return new StickerPanelState(null, 1, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public void onStart() {
        super.onStart();
        ((C1EP) this.LJLL.LJ(C1EP.class, null)).m3(I9W.class, new AqS180S0100000_14(this, 39));
    }

    @Override // X.InterfaceC45925I0r
    public LiveData<Boolean> Bi() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC45925I0r
    public void ET(W4E stickerPanelShowIntercept) {
        o.LJIIIZ(stickerPanelShowIntercept, "stickerPanelShowIntercept");
        Kv0().add(stickerPanelShowIntercept);
    }

    public final boolean Lv0(int i) {
        InterfaceC65784Pro<Boolean> interfaceC65784Pro;
        InterfaceC82400WVo interfaceC82400WVo;
        if (i != 4 || (((interfaceC65784Pro = this.LJLLI.LIZJ) != null && interfaceC65784Pro.invoke().booleanValue()) || (interfaceC82400WVo = (InterfaceC82400WVo) ((C1EP) this.LJLL.LJ(C1EP.class, null)).sO(I9W.class)) == null || !C82398WVm.LIZLLL(interfaceC82400WVo))) {
            return false;
        }
        l10(false, false);
        C63081OpJ.LJJLIIIIJ(interfaceC82400WVo);
        return true;
    }

    @Override // X.InterfaceC45925I0r
    public void pO(W4E stickerPanelShowIntercept) {
        o.LJIIIZ(stickerPanelShowIntercept, "stickerPanelShowIntercept");
        Kv0().remove(stickerPanelShowIntercept);
    }

    @Override // X.InterfaceC45925I0r
    public void wx(boolean z) {
        this.LJLJLLL = z;
        if (z) {
            l10(false, false);
        }
    }

    public RecordStickerPanelViewModel(C82622Wbi diContainer, W4A config) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLL = diContainer;
        this.LJLLI = config;
        this.LJLJL = new MutableLiveData<>();
        this.LJLJLJ = C221108m2.LIZIZ(W4D.LJLIL);
    }

    @Override // X.InterfaceC45925I0r
    public void l10(boolean z, boolean z2) {
        InterfaceC88472Yns<? super Boolean, Boolean> interfaceC88472Yns = this.LJLLI.LIZIZ;
        if (interfaceC88472Yns == null || !interfaceC88472Yns.invoke(Boolean.valueOf(z)).booleanValue()) {
            if (z) {
                HashSet<W4E> Kv0 = Kv0();
                if (!(Kv0 instanceof Collection) || !Kv0.isEmpty()) {
                    Iterator<W4E> it = Kv0.iterator();
                    while (it.hasNext()) {
                        if (it.next().LIZ(z2)) {
                            return;
                        }
                    }
                }
            }
            setStateImmediate(new AqS56S0110000_14(this, z, 1));
        }
    }
}
