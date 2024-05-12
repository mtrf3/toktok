package X;

import android.graphics.Rect;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.5qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C147685qu extends AbstractC29891Fh<InterfaceC147865rC> implements InterfaceC147865rC {
    public C63C LJLIL;
    public final C0IB<Integer> LJLILLLLZI;
    public final LiveEvent<OSZ<Float, Long>> LJLJI;
    public final LiveEvent<OSJ<Float, Float, Float>> LJLJJI;
    public final LiveEvent<OSJ<Float, Float, Float>> LJLJJL;
    public final LiveEvent<OSJ<Float, Float, Float>> LJLJJLL;
    public final LiveEvent<OSJ<Float, Float, Float>> LJLJL;
    public final LiveEvent<OSJ<Float, Float, Float>> LJLJLJ;
    public final LiveEvent<OSJ<Float, Float, Float>> LJLJLLL;
    public final LiveEvent<OSJ<Float, Float, Float>> LJLL;
    public final LiveEvent<Integer> LJLLI;
    public final LiveEvent<C76800UCe> LJLLILLLL;
    public final LiveEvent<OSZ<Effect, String>> LJLLJ;
    public final LiveEvent<C76800UCe> LJLLL;
    public final LiveEvent<C76800UCe> LJLLLL;
    public final LiveEvent<Boolean> LJLLLLLL;
    public final C0IB<Boolean> LJLZ;
    public final LiveEvent<OSJ<Boolean, Boolean, InterfaceC65784Pro<C76800UCe>>> LJZ;
    public final LiveEvent<Boolean> LJZI;
    public final LiveEvent<OSZ<Integer, Integer>> LJZL;
    public final LiveEvent<C76800UCe> LL;
    public final LiveEvent<OSZ<Integer, Boolean>> LLD;
    public final LiveEvent<C76800UCe> LLF;
    public final LiveEvent<Float> LLFF;
    public final LiveEvent<Boolean> LLFFF;
    public final LiveEvent<C76800UCe> LLFII;
    public final LiveEvent<Boolean> LLFZ;
    public final C5H3 LLI;
    public final C5H3 LLIFFJFJJ;
    public final C5H3 LLII;
    public final C5H3 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C5H3 LLIIIJ;
    public final C5H3 LLIIIL;
    public final C5H3 LLIIIZ;
    public final C5H3 LLIIJI;
    public InterfaceC65784Pro<Rect> LLIIJLIL;
    public final C5H3 LLIIL;

    public InterfaceC147865rC LJJLI() {
        return this;
    }

    public void X80() {
    }

    public void hide() {
    }

    public void show() {
    }

    @Override // X.InterfaceC140385f8
    public MutableLiveData<Boolean> A10() {
        return (MutableLiveData) this.LLIIIL.getValue();
    }

    @Override // X.InterfaceC147865rC
    public void AX() {
        C63C c63c = this.LJLIL;
        if (c63c != null) {
            FrameLayout frameLayout = c63c.LLIIIL;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            } else {
                o.LJIJI("textPStickerLayout");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC147865rC
    public void Bb() {
        C63D c63d;
        C63C c63c = this.LJLIL;
        if (c63c != null && (c63d = c63c.LLJI) != null) {
            c63d.F8(false);
        }
    }

    @Override // X.InterfaceC147865rC
    public void Dq() {
        C63C c63c = this.LJLIL;
        if (c63c != null) {
            InterfaceC147775r3 interfaceC147775r3 = c63c.LLI;
            if (interfaceC147775r3 != null) {
                interfaceC147775r3.hide();
            } else {
                o.LJIJI("interactStickersApi");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC147865rC
    public void Kg() {
        C63C c63c = this.LJLIL;
        if (c63c != null) {
            InterfaceC147775r3 interfaceC147775r3 = c63c.LLI;
            if (interfaceC147775r3 != null) {
                interfaceC147775r3.show();
            } else {
                o.LJIJI("interactStickersApi");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC140385f8
    public boolean LLZZ() {
        C63C c63c = this.LJLIL;
        if (c63c != null) {
            return c63c.LLZZ();
        }
        return false;
    }

    @Override // X.InterfaceC147865rC
    public void Lh0() {
        C63K c63k;
        C63C c63c = this.LJLIL;
        if (c63c != null && (c63k = (C63K) C44384HbQ.LJJJ(c63c).LJ(C63K.class)) != null) {
            c63k.sd();
        }
    }

    @Override // X.InterfaceC147865rC
    public MutableLiveData<Boolean> N4() {
        return (MutableLiveData) this.LLII.getValue();
    }

    @Override // X.InterfaceC147865rC
    public void Vl() {
        InterfaceC139535dl LLJJLIIIJLLLLLLLZ;
        C63C c63c = this.LJLIL;
        if (c63c != null && (LLJJLIIIJLLLLLLLZ = c63c.LLJJLIIIJLLLLLLLZ()) != null) {
            LLJJLIIIJLLLLLLLZ.hide();
        }
    }

    @Override // X.InterfaceC147865rC
    public void Xp0() {
        C63C c63c = this.LJLIL;
        if (c63c != null) {
            FrameLayout frameLayout = c63c.LLIIIL;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
            } else {
                o.LJIJI("textPStickerLayout");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC147865rC
    public MutableLiveData<C76800UCe> eL() {
        return (MutableLiveData) this.LLIIL.getValue();
    }

    @Override // X.InterfaceC147865rC
    public InterfaceC139535dl fB() {
        C63C c63c = this.LJLIL;
        if (c63c != null) {
            return c63c.LLJJLIIIJLLLLLLLZ();
        }
        return null;
    }

    @Override // X.InterfaceC147865rC
    public AnonymousClass643 fe0() {
        C63C c63c = this.LJLIL;
        if (c63c != null) {
            return (AnonymousClass643) c63c.LLILZIL.getValue();
        }
        return null;
    }

    @Override // X.InterfaceC147865rC
    public MutableLiveData<Boolean> fm0() {
        return (MutableLiveData) this.LLIIIILZ.getValue();
    }

    @Override // X.InterfaceC147865rC
    public MutableLiveData<Boolean> hP() {
        return (MutableLiveData) this.LLIIII.getValue();
    }

    @Override // X.InterfaceC147865rC
    public QaStruct hh0() {
        C63K c63k;
        InteractStickerStruct interactStickerStruct;
        C63C c63c = this.LJLIL;
        if (c63c == null || (c63k = (C63K) C44384HbQ.LJJJ(c63c).LJ(C63K.class)) == null || (interactStickerStruct = c63k.getInteractStickerStruct()) == null) {
            return null;
        }
        return interactStickerStruct.getQaStruct();
    }

    @Override // X.InterfaceC147865rC
    public MutableLiveData<C76800UCe> kJ() {
        return (MutableLiveData) this.LLIIJI.getValue();
    }

    @Override // X.InterfaceC147865rC
    public void kz() {
        C63D c63d;
        C63C c63c = this.LJLIL;
        if (c63c != null && (c63d = c63c.LLJI) != null) {
            c63d.F8(true);
        }
    }

    @Override // X.InterfaceC147865rC
    public MutableLiveData<Boolean> lx() {
        return (MutableLiveData) this.LLIIIJ.getValue();
    }

    @Override // X.InterfaceC147865rC
    public MutableLiveData<C76800UCe> n3() {
        return (MutableLiveData) this.LLIIIZ.getValue();
    }

    @Override // X.InterfaceC147865rC
    public MutableLiveData<Boolean> sH() {
        return (MutableLiveData) this.LLI.getValue();
    }

    @Override // X.InterfaceC140385f8
    public String tj0() {
        C63D c63d;
        String textContent;
        C63C c63c = this.LJLIL;
        if (c63c == null || (c63d = c63c.LLJI) == null || (textContent = c63d.getTextContent()) == null) {
            return "";
        }
        return textContent;
    }

    @Override // X.InterfaceC147865rC
    public MutableLiveData<Boolean> yf0() {
        return (MutableLiveData) this.LLIFFJFJJ.getValue();
    }

    @Override // X.InterfaceC147865rC
    public void KI() {
        lx().setValue(Boolean.TRUE);
    }

    @Override // X.InterfaceC147865rC
    public void LJLL() {
        LiveEvent<C76800UCe> b4 = b4();
        o.LJII(b4, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) b4).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC147865rC
    public void LLIIIILZ() {
        LiveEvent<C76800UCe> i4 = i4();
        o.LJII(i4, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) i4).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC140385f8
    public void LLZIL() {
        LiveEvent<C76800UCe> v52 = v5();
        o.LJII(v52, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) v52).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC147865rC
    public void Oh0() {
        LiveEvent<C76800UCe> Ap0 = Ap0();
        o.LJII(Ap0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) Ap0).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC147865rC
    public void W3() {
        LiveEvent<C76800UCe> E60 = E60();
        o.LJII(E60, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) E60).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC147865rC
    public void lg() {
        eL().setValue(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC147865rC
    public void s1() {
        LiveEvent<C76800UCe> ls = ls();
        o.LJII(ls, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) ls).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC147865rC
    public C0IB<Integer> Ak0() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<C76800UCe> Ap0() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSJ<Float, Float, Float>> Bg0() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSZ<Float, Long>> E30() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<C76800UCe> E60() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSJ<Float, Float, Float>> Fj() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSZ<Integer, Integer>> M90() {
        return this.LJZL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSJ<Float, Float, Float>> T50() {
        return this.LJLL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSJ<Float, Float, Float>> UI() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSJ<Float, Float, Float>> Xe() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSZ<Effect, String>> Z40() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC147865rC
    public C0IB<Boolean> Z60() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSJ<Float, Float, Float>> aV() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<Boolean> aj0() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<C76800UCe> b4() {
        return this.LLF;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSZ<Integer, Boolean>> c0() {
        return this.LLD;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<Boolean> d60() {
        return this.LJZI;
    }

    @Override // X.InterfaceC147865rC
    public InterfaceC65784Pro<Rect> dS() {
        return this.LLIIJLIL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC147865rC getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<Boolean> hl() {
        return this.LLFZ;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<C76800UCe> i4() {
        return this.LLFII;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSJ<Float, Float, Float>> k80() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<OSJ<Boolean, Boolean, InterfaceC65784Pro<C76800UCe>>> lb0() {
        return this.LJZ;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<C76800UCe> ls() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<Boolean> ls0() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<C76800UCe> v5() {
        return this.LL;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<Integer> xw() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC147865rC
    public LiveEvent<Float> zj() {
        return this.LLFF;
    }

    public C147685qu(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLILLLLZI = new C40871j1(null);
        this.LJLJI = new C29901Fi();
        this.LJLJJI = new C29901Fi();
        this.LJLJJL = new C29901Fi();
        this.LJLJJLL = new C29901Fi();
        this.LJLJL = new C29901Fi();
        this.LJLJLJ = new C29901Fi();
        this.LJLJLLL = new C29901Fi();
        this.LJLL = new C29901Fi();
        this.LJLLI = new C29901Fi();
        this.LJLLILLLL = new C29901Fi();
        this.LJLLJ = new C29901Fi();
        this.LJLLL = new C29901Fi();
        this.LJLLLL = new C29901Fi();
        this.LJLLLLLL = new C29901Fi();
        this.LJLZ = new C40871j1(Boolean.FALSE);
        this.LJZ = new C29901Fi();
        this.LJZI = new C29901Fi();
        this.LJZL = new C29901Fi();
        this.LL = new C29901Fi();
        this.LLD = new C29901Fi();
        this.LLF = new C29901Fi();
        this.LLFF = new C29901Fi();
        this.LLFFF = new C29901Fi();
        this.LLFII = new C29901Fi();
        this.LLFZ = new C29901Fi();
        this.LLI = C221108m2.LIZIZ(C147735qz.LJLIL);
        this.LLIFFJFJJ = C221108m2.LIZIZ(C147725qy.LJLIL);
        this.LLII = C221108m2.LIZIZ(C146635pD.LJLIL);
        this.LLIIII = C221108m2.LIZIZ(C146625pC.LJLIL);
        this.LLIIIILZ = C221108m2.LIZIZ(C147705qw.LJLIL);
        this.LLIIIJ = C221108m2.LIZIZ(C147695qv.LJLIL);
        this.LLIIIL = C221108m2.LIZIZ(C147715qx.LJLIL);
        this.LLIIIZ = C221108m2.LIZIZ(C147745r0.LJLIL);
        this.LLIIJI = C221108m2.LIZIZ(C147765r2.LJLIL);
        this.LLIIL = C221108m2.LIZIZ(C147755r1.LJLIL);
    }

    @Override // X.InterfaceC147865rC
    public void Ii0(boolean z) {
        LiveEvent<Boolean> ls0 = ls0();
        o.LJII(ls0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) ls0).LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC147865rC
    public void LLLIZZ(boolean z) {
        C0IB<Boolean> Z60 = Z60();
        o.LJII(Z60, "null cannot be cast to non-null type com.bytedance.als.MutableLiveState<kotlin.Boolean>");
        ((C40871j1) Z60).LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC140385f8
    public void LLLLIIIILLL(OSZ<Integer, Integer> value) {
        o.LJIIIZ(value, "value");
        LiveEvent<OSZ<Integer, Integer>> M90 = M90();
        o.LJII(M90, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<kotlin.Int, kotlin.Int>>");
        ((C29901Fi) M90).LJII(value);
    }

    @Override // X.InterfaceC147865rC
    public void Nn(boolean z) {
        LiveEvent<Boolean> hl = hl();
        o.LJII(hl, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) hl).LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC147865rC
    public void QE(InterfaceC65784Pro<Rect> interfaceC65784Pro) {
        this.LLIIJLIL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC147865rC
    public void Qy(C63C scene) {
        o.LJIIIZ(scene, "scene");
        this.LJLIL = scene;
    }

    @Override // X.InterfaceC147865rC
    public void R10(int i) {
        LiveEvent<Integer> xw = xw();
        o.LJII(xw, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Int>");
        ((C29901Fi) xw).LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC140385f8
    public void WW(boolean z) {
        LiveEvent<Boolean> d60 = d60();
        o.LJII(d60, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) d60).LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC147865rC
    public void Wd0(float f) {
        LiveEvent<Float> zj = zj();
        o.LJII(zj, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Float>");
        ((C29901Fi) zj).LJII(Float.valueOf(f));
    }

    @Override // X.InterfaceC147865rC
    public void dv(boolean z) {
        C63C c63c;
        InterfaceC139535dl LLJJLIIIJLLLLLLLZ;
        InterfaceC139535dl LLJJLIIIJLLLLLLLZ2;
        C63C c63c2 = this.LJLIL;
        if (c63c2 != null && (LLJJLIIIJLLLLLLLZ2 = c63c2.LLJJLIIIJLLLLLLLZ()) != null) {
            LLJJLIIIJLLLLLLLZ2.show();
        }
        if (z && (c63c = this.LJLIL) != null && (LLJJLIIIJLLLLLLLZ = c63c.LLJJLIIIJLLLLLLLZ()) != null) {
            LLJJLIIIJLLLLLLLZ.M9();
        }
    }

    @Override // X.InterfaceC140385f8
    public void rb0(Integer num) {
        C0IB<Integer> Ak0 = Ak0();
        o.LJII(Ak0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveState<kotlin.Int?>");
        ((C40871j1) Ak0).LJI(num);
    }

    @Override // X.InterfaceC147865rC
    public void rf(boolean z) {
        LiveEvent<Boolean> aj0 = aj0();
        o.LJII(aj0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Boolean>");
        ((C29901Fi) aj0).LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC140385f8
    public void GN(float f, long j) {
        LiveEvent<OSZ<Float, Long>> E30 = E30();
        o.LJII(E30, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<kotlin.Float, kotlin.Long>>");
        ((C29901Fi) E30).LJII(new OSZ(Float.valueOf(f), Long.valueOf(j)));
    }

    @Override // X.InterfaceC140385f8
    public void LLZILL(int i, boolean z) {
        LiveEvent<OSZ<Integer, Boolean>> c0 = c0();
        o.LJII(c0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<kotlin.Int, kotlin.Boolean>?>");
        ((C29901Fi) c0).LJII(new OSZ(Integer.valueOf(i), Boolean.valueOf(z)));
    }

    @Override // X.InterfaceC147865rC
    public void O9(Effect effect, String str) {
        o.LJIIIZ(effect, "effect");
        LiveEvent<OSZ<Effect, String>> Z40 = Z40();
        o.LJII(Z40, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Pair<com.ss.android.ugc.effectmanager.effect.model.Effect, kotlin.String?>>");
        ((C29901Fi) Z40).LJII(new OSZ(effect, str));
    }

    @Override // X.InterfaceC147865rC
    public void M20(float f, float f2, float f3) {
        LiveEvent<OSJ<Float, Float, Float>> aV = aV();
        o.LJII(aV, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Triple<kotlin.Float, kotlin.Float, kotlin.Float>>");
        ((C29901Fi) aV).LJII(new OSJ(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    @Override // X.InterfaceC147865rC
    public void WM(float f, float f2, float f3) {
        LiveEvent<OSJ<Float, Float, Float>> Bg0 = Bg0();
        o.LJII(Bg0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Triple<kotlin.Float, kotlin.Float, kotlin.Float>>");
        ((C29901Fi) Bg0).LJII(new OSJ(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    @Override // X.InterfaceC147865rC
    public void XF(float f, float f2, float f3) {
        LiveEvent<OSJ<Float, Float, Float>> Fj = Fj();
        o.LJII(Fj, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Triple<kotlin.Float, kotlin.Float, kotlin.Float>>");
        ((C29901Fi) Fj).LJII(new OSJ(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    @Override // X.InterfaceC147865rC
    public void Y00(float f, float f2, float f3) {
        LiveEvent<OSJ<Float, Float, Float>> Xe = Xe();
        o.LJII(Xe, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Triple<kotlin.Float, kotlin.Float, kotlin.Float>>");
        ((C29901Fi) Xe).LJII(new OSJ(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    @Override // X.InterfaceC147865rC
    public void Zk0(boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> onDone) {
        o.LJIIIZ(onDone, "onDone");
        LiveEvent<OSJ<Boolean, Boolean, InterfaceC65784Pro<C76800UCe>>> lb0 = lb0();
        o.LJII(lb0, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Triple<kotlin.Boolean, kotlin.Boolean, kotlin.Function0<kotlin.Unit>>?>");
        ((C29901Fi) lb0).LJII(new OSJ(Boolean.valueOf(z), Boolean.valueOf(z2), onDone));
    }

    @Override // X.InterfaceC147865rC
    public void dE(float f, float f2, float f3) {
        LiveEvent<OSJ<Float, Float, Float>> T50 = T50();
        o.LJII(T50, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Triple<kotlin.Float, kotlin.Float, kotlin.Float>>");
        ((C29901Fi) T50).LJII(new OSJ(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    @Override // X.InterfaceC147865rC
    public void dt(float f, float f2, float f3) {
        LiveEvent<OSJ<Float, Float, Float>> UI = UI();
        o.LJII(UI, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Triple<kotlin.Float, kotlin.Float, kotlin.Float>>");
        ((C29901Fi) UI).LJII(new OSJ(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    @Override // X.InterfaceC140385f8
    public void wl(float f, float f2, float f3) {
        LiveEvent<OSJ<Float, Float, Float>> k80 = k80();
        o.LJII(k80, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Triple<kotlin.Float, kotlin.Float, kotlin.Float>>");
        ((C29901Fi) k80).LJII(new OSJ(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }
}
