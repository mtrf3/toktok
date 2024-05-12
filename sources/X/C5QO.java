package X;

import Y.ARunnableS38S0100000_2;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.preview.PreviewPanelViewModel;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS45S0110000_2;
import kotlin.jvm.internal.AqS56S1100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5QO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5QO extends AbstractC48231ut<InterfaceC1278950f, C5QE, C5QF, C132935Jp> implements InterfaceC135635Tz, InterfaceC1278950f {
    public final C82622Wbi LJLL;
    public C5QE LJLLI;

    private final PreviewPanelViewModel LJLZ() {
        return (PreviewPanelViewModel) C5G0.LIZ(PreviewPanelViewModel.class);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C132935Jp> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 1029);
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C5QE> LJLJJLL() {
        return new AqS152S0100000_2(this, 1030);
    }

    @Override // X.InterfaceC1278950f
    public void Bx() {
        for (InterfaceC132925Jo interfaceC132925Jo : LJJLJ().LIZIZ.values()) {
            if (o.LJ(LJJLJ().LJII, interfaceC132925Jo)) {
                LJJZZI(C5QT.LJLIL);
            }
            interfaceC132925Jo.LJIILL();
        }
        LJZI(null);
    }

    @Override // X.InterfaceC1278950f
    public SurfaceView Jq() {
        return LJJLJ().LIZ;
    }

    @Override // X.InterfaceC1278950f
    public void T2() {
        PreviewPanelViewModel LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.mv0(null);
        }
    }

    @Override // X.InterfaceC1278950f
    public OSZ<String, InterfaceC132925Jo> VZ() {
        return LJJLJ().LJFF;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5QF> LJJLIIIJJI() {
        return C5QV.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.InterfaceC1278950f
    public void Ez(boolean z) {
        PreviewPanelViewModel LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.LJLJJLL.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1278950f
    public void LJLJLLL(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 58));
    }

    @Override // X.InterfaceC1278950f
    public void LJZ(NLEModel nleModel) {
        MutableLiveData<NLEModel> mutableLiveData;
        o.LJIIIZ(nleModel, "nleModel");
        PreviewPanelViewModel LJLZ = LJLZ();
        if (LJLZ == null || (mutableLiveData = LJLZ.LJLIL) == null) {
            return;
        }
        mutableLiveData.setValue(nleModel);
    }

    public final void LJZI(OSZ<String, ? extends InterfaceC132925Jo> osz) {
        LJJZZI(new AqS168S0100000_2(osz, (OSZ<Integer, Integer>) 637));
    }

    @Override // X.InterfaceC1278950f
    public void OW(NLEEditor nleEditor) {
        MutableLiveData<NLEModel> mutableLiveData;
        o.LJIIIZ(nleEditor, "nleEditor");
        PreviewPanelViewModel LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.LJLZ = nleEditor;
        }
        PreviewPanelViewModel LJLZ2 = LJLZ();
        if (LJLZ2 != null && (mutableLiveData = LJLZ2.LJLIL) != null) {
            mutableLiveData.setValue(nleEditor.LJ());
        }
        LJJZZI(new AqS168S0100000_2(nleEditor, 632));
    }

    @Override // X.InterfaceC1278950f
    public void Of(java.util.Map<String, ? extends InterfaceC132925Jo> materials) {
        o.LJIIIZ(materials, "materials");
        LJJZZI(new AqS168S0100000_2(materials, 635));
    }

    @Override // X.InterfaceC1278950f
    public void Rg(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 57));
        if (!z) {
            LJZI(null);
            for (InterfaceC132925Jo interfaceC132925Jo : LJJLJ().LIZIZ.values()) {
                if (o.LJ(LJJLJ().LJII, interfaceC132925Jo)) {
                    LJJZZI(C5QR.LJLIL);
                }
                interfaceC132925Jo.LJIILL();
            }
        }
    }

    @Override // X.InterfaceC1278950f
    public void iW(C5Q2 onTouchEventListener) {
        o.LJIIIZ(onTouchEventListener, "onTouchEventListener");
        LJJZZI(new AqS168S0100000_2(onTouchEventListener, 636));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1278950f
    public void k6(String materialKey) {
        OSZ<? extends NLETrack, ? extends NLETrackSlot> osz;
        MutableLiveData mutableLiveData;
        InterfaceC132925Jo second;
        o.LJIIIZ(materialKey, "materialKey");
        LJJZZI(C5QQ.LJLIL);
        for (Map.Entry<String, InterfaceC132925Jo> entry : LJJLJ().LIZIZ.entrySet()) {
            if (o.LJ(entry.getKey(), materialKey)) {
                LJZI(new OSZ<>(entry.getKey(), entry.getValue()));
            } else {
                if (o.LJ(LJJLJ().LJII, entry.getValue())) {
                    LJJZZI(C5QS.LJLIL);
                }
                entry.getValue().LJIILL();
            }
        }
        OSZ<String, InterfaceC132925Jo> osz2 = LJJLJ().LJFF;
        if (osz2 != null && (second = osz2.getSecond()) != null) {
            second.LJIJI();
        }
        PreviewPanelViewModel LJLZ = LJLZ();
        if (LJLZ != null) {
            PreviewPanelViewModel LJLZ2 = LJLZ();
            if (LJLZ2 != null && (mutableLiveData = LJLZ2.LJLLLL) != null) {
                osz = (OSZ) mutableLiveData.getValue();
            } else {
                osz = null;
            }
            LJLZ.mv0(osz);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1278950f
    public void kB(String materialKey) {
        OSZ<? extends NLETrack, ? extends NLETrackSlot> osz;
        MutableLiveData mutableLiveData;
        InterfaceC132925Jo second;
        o.LJIIIZ(materialKey, "materialKey");
        LJJZZI(C5QP.LJLIL);
        for (Map.Entry<String, InterfaceC132925Jo> entry : LJJLJ().LIZIZ.entrySet()) {
            if (o.LJ(entry.getKey(), materialKey)) {
                LJZI(new OSZ<>(entry.getKey(), entry.getValue()));
                LJJZZI(new AqS56S1100000_2(this, materialKey, 6));
            } else {
                entry.getValue().LJIILL();
            }
        }
        OSZ<String, InterfaceC132925Jo> osz2 = LJJLJ().LJFF;
        if (osz2 != null && (second = osz2.getSecond()) != null) {
            second.LJIJI();
        }
        PreviewPanelViewModel LJLZ = LJLZ();
        if (LJLZ != null) {
            PreviewPanelViewModel LJLZ2 = LJLZ();
            if (LJLZ2 != null && (mutableLiveData = LJLZ2.LJLLLL) != null) {
                osz = (OSZ) mutableLiveData.getValue();
            } else {
                osz = null;
            }
            LJLZ.mv0(osz);
        }
    }

    @Override // X.InterfaceC1278950f
    public void mf0(SurfaceView surfaceView) {
        o.LJIIIZ(surfaceView, "surfaceView");
        LJJZZI(new AqS168S0100000_2(surfaceView, 634));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.graphics.Bitmap] */
    @Override // X.InterfaceC1278950f
    public View ol0(boolean z) {
        C133775Mv P8;
        ?? LJII;
        C68322mC c68322mC = new C68322mC();
        if (z) {
            InterfaceC126684y8 interfaceC126684y8 = LJJLJ().LJ;
            if (interfaceC126684y8 == null || (P8 = interfaceC126684y8.P8()) == null || (LJII = P8.LJII(-1)) == 0) {
                return null;
            }
            c68322mC.element = LJII;
        }
        LJJZZI(new AqS45S0110000_2(z, (boolean) c68322mC, (C68322mC<Bitmap>) 11));
        C5QE c5qe = this.LJLLI;
        if (c5qe == null) {
            return null;
        }
        return c5qe.LJLJJL;
    }

    @Override // X.InterfaceC1278950f
    public <T extends InterfaceC132925Jo> T s0(String materialKey) {
        o.LJIIIZ(materialKey, "materialKey");
        InterfaceC132925Jo interfaceC132925Jo = LJJLJ().LIZIZ.get(materialKey);
        o.LJII(interfaceC132925Jo, "null cannot be cast to non-null type T of com.ss.ugc.android.editor.preview.PreviewPanelComponent.getMaterial");
        return (T) interfaceC132925Jo;
    }

    @Override // X.InterfaceC1278950f
    public void wr(InterfaceC126684y8 nleSession) {
        o.LJIIIZ(nleSession, "nleSession");
        LJJZZI(new AqS168S0100000_2(nleSession, 633));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5QO(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
    }

    @Override // X.InterfaceC1278950f
    public void G6(NLETrack track, NLETrackSlot slot) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        PreviewPanelViewModel LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.mv0(new OSZ<>(track, slot));
        }
    }

    @Override // X.InterfaceC1278950f
    public void Z8(long j, boolean z) {
        PreviewPanelViewModel LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.LJLJLLL = j;
            if (z) {
                if (LJLZ.LJLL) {
                    LJLZ.LJLL = false;
                    LJLZ.LJLLI.postDelayed(new ARunnableS38S0100000_2(LJLZ, 199), 150L);
                    return;
                }
                return;
            }
            LJLZ.LJLLI.removeCallbacksAndMessages(null);
            LJLZ.LJLL = true;
            LJLZ.LJLILLLLZI.setValue(Long.valueOf(LJLZ.LJLJLLL));
        }
    }

    @Override // X.InterfaceC1278950f
    public void cK(int i, int i2) {
        float f;
        C132885Jk c132885Jk;
        PreviewPanelViewModel LJLZ;
        MutableLiveData<NLEModel> mutableLiveData;
        NLEModel value;
        if (!C132955Jr.LIZ) {
            return;
        }
        PreviewPanelViewModel LJLZ2 = LJLZ();
        if (LJLZ2 != null && (mutableLiveData = LJLZ2.LJLIL) != null && (value = mutableLiveData.getValue()) != null) {
            f = value.getCanvasRatio();
        } else {
            f = 0.5625f;
        }
        C132885Jk c132885Jk2 = new C132885Jk(f, i, i2);
        PreviewPanelViewModel LJLZ3 = LJLZ();
        if (LJLZ3 != null) {
            c132885Jk = LJLZ3.LJLJLJ;
        } else {
            c132885Jk = null;
        }
        if (!o.LJ(c132885Jk2, c132885Jk) && (LJLZ = LJLZ()) != null) {
            LJLZ.gv0(i, i2);
        }
    }
}
