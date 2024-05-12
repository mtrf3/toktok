package com.ss.android.ugc.aweme.ftc.components.sticker.core;

import X.C146945pi;
import X.C149335tZ;
import X.C149345ta;
import X.C150485vQ;
import X.C150495vR;
import X.C150505vS;
import X.C150515vT;
import X.C150525vU;
import X.C150535vV;
import X.C221108m2;
import X.C5H3;
import X.C67P;
import X.InterfaceC146805pU;
import X.InterfaceC146845pY;
import X.ORZ;
import X.OSZ;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS0S0000003_2;
import kotlin.jvm.internal.AqS0S0000101_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditStickerViewModel extends LifecycleAwareViewModel<FTCEditStickerState> implements InterfaceC146805pU {
    public C146945pi LJLJL;
    public final C5H3 LJLJLJ = C221108m2.LIZIZ(C150535vV.LJLIL);
    public final C5H3 LJLJLLL = C221108m2.LIZIZ(C150525vU.LJLIL);
    public final C5H3 LJLL = C221108m2.LIZIZ(C149345ta.LJLIL);
    public final C5H3 LJLLI = C221108m2.LIZIZ(C149335tZ.LJLIL);
    public final C5H3 LJLLILLLL = C221108m2.LIZIZ(C150515vT.LJLIL);

    @Override // X.InterfaceC140385f8
    public void X80() {
    }

    @Override // X.InterfaceC140385f8
    public void hide() {
    }

    @Override // X.InterfaceC140385f8
    public MutableLiveData<Boolean> A10() {
        return (MutableLiveData) this.LJLLILLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public FTCEditStickerState kv0() {
        return new FTCEditStickerState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC140385f8
    public void LLZIL() {
        setStateImmediate(C150495vR.LJLIL);
    }

    @Override // X.InterfaceC140385f8
    public boolean LLZZ() {
        C146945pi c146945pi = this.LJLJL;
        if (c146945pi != null) {
            return c146945pi.LLZZ();
        }
        return false;
    }

    public final MutableLiveData<Boolean> N4() {
        return (MutableLiveData) this.LJLL.getValue();
    }

    public final MutableLiveData<Boolean> hP() {
        return (MutableLiveData) this.LJLLI.getValue();
    }

    public final MutableLiveData<Boolean> sH() {
        return (MutableLiveData) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC140385f8
    public void show() {
        setStateImmediate(C150505vS.LJLIL);
    }

    @Override // X.InterfaceC140385f8
    public String tj0() {
        InterfaceC146845pY interfaceC146845pY;
        List<C67P> LJZL;
        C146945pi c146945pi = this.LJLJL;
        if (c146945pi != null && (interfaceC146845pY = c146945pi.LJLLL) != null && (LJZL = interfaceC146845pY.LJZL()) != null) {
            return ORZ.LLD(LJZL, null, null, null, null, 63);
        }
        return "";
    }

    public final MutableLiveData<Boolean> yf0() {
        return (MutableLiveData) this.LJLJLLL.getValue();
    }

    @Override // X.InterfaceC140385f8
    public void LLLLIIIILLL(OSZ<Integer, Integer> value) {
        o.LJIIIZ(value, "value");
        setStateImmediate(new AqS168S0100000_2(value, (OSZ<Integer, Integer>) 53));
    }

    @Override // X.InterfaceC140385f8
    public void WW(boolean z) {
        setStateImmediate(new AqS7S0010000_2(z, 4));
    }

    @Override // X.InterfaceC140385f8
    public void rb0(Integer num) {
        setState(new AqS168S0100000_2(num, 54));
    }

    @Override // X.InterfaceC146805pU
    public void s60(C146945pi scene) {
        o.LJIIIZ(scene, "scene");
        this.LJLJL = scene;
    }

    @Override // X.InterfaceC140385f8
    public void GN(float f, long j) {
        setState(new AqS0S0000101_2(f, j, 0));
    }

    @Override // X.InterfaceC140385f8
    public void LLZILL(int i, boolean z) {
        setStateImmediate(new C150485vQ(i, z));
    }

    @Override // X.InterfaceC140385f8
    public void wl(float f, float f2, float f3) {
        setState(new AqS0S0000003_2(f, f2, f3, 0));
    }
}
