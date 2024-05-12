package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.creativex.camerakit.camera.session.recorder.impl.RecorderImpl;
import java.lang.Enum;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wv8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83826Wv8<KEY extends Enum<KEY>> implements InterfaceC83725WtV<KEY> {
    public final java.util.Map<InterfaceC83821Wv3<KEY>, InterfaceC83830WvC<KEY>> LJLIL;
    public InterfaceC83830WvC<KEY> LJLILLLLZI;
    public InterfaceC83829WvB LJLJI;
    public final C73318Sq2 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C73893SzJ<AbstractC83839WvL> LJLJLJ;
    public final C73893SzJ<AbstractC83849WvV> LJLJLLL;
    public final C73893SzJ<InterfaceC83830WvC<KEY>> LJLL;
    public final C73893SzJ<AbstractC83845WvR> LJLLI;
    public final InterfaceC83821Wv3<KEY> LJLLILLLL;
    public final InterfaceC83831WvD<KEY> LJLLJ;
    public final InterfaceC83836WvI<KEY> LJLLL;
    public final InterfaceC83840WvM LJLLLL;
    public final InterfaceC65784Pro<InterfaceC83878Wvy> LJLLLLLL;

    public final InterfaceC83878Wvy LJI() {
        return (InterfaceC83878Wvy) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC83640Ws8
    public final int getCameraFacing() {
        return Z6(false);
    }

    @Override // X.InterfaceC83852WvY
    public final C82127WLb r4() {
        return (C82127WLb) this.LJLJJLL.getValue();
    }

    public final C73426Srm LJ() {
        C73893SzJ<C76800UCe> c73893SzJ = ((C83835WvH) this.LJLJL.getValue()).LIZ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final InterfaceC83830WvC<KEY> LJFF() {
        InterfaceC83830WvC<KEY> interfaceC83830WvC = this.LJLILLLLZI;
        if (interfaceC83830WvC != null) {
            return interfaceC83830WvC;
        }
        "no active session found, make sure are not accessing session before init or during switch".toString();
        throw new IllegalArgumentException("no active session found, make sure are not accessing session before init or during switch");
    }

    public final InterfaceC83829WvB LJII() {
        InterfaceC83829WvB interfaceC83829WvB = this.LJLJI;
        if (interfaceC83829WvB != null) {
            return interfaceC83829WvB;
        }
        "recorder not initialized yet, make sure you access recorder after init".toString();
        throw new IllegalArgumentException("recorder not initialized yet, make sure you access recorder after init");
    }

    public final C73426Srm LJIIIZ() {
        C73893SzJ<C76800UCe> c73893SzJ = ((C83835WvH) this.LJLJL.getValue()).LIZIZ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC83852WvY
    public final InterfaceC83759Wu3 LIZJ() {
        return LJII().LIZJ();
    }

    @Override // X.InterfaceC83852WvY
    public final InterfaceC83886Ww6 LIZLLL() {
        return LJII().LIZLLL();
    }

    @Override // X.InterfaceC83640Ws8
    public final void LJL() {
        LJFF().LJL();
    }

    @Override // X.InterfaceC83640Ws8
    public final boolean LLFZ() {
        return LJFF().LLFZ();
    }

    @Override // X.InterfaceC83640Ws8
    public final int LLJJJ() {
        return LJFF().LLJJJ();
    }

    @Override // X.InterfaceC83640Ws8
    public final InterfaceC83737Wth O0() {
        return LJFF().O0();
    }

    @Override // X.InterfaceC83640Ws8
    public final void T6() {
        LJFF().T6();
    }

    @Override // X.InterfaceC83640Ws8
    public final void Y3() {
        LJFF().Y3();
    }

    @Override // X.InterfaceC83640Ws8
    public final void Y6() {
        LJFF().Y6();
    }

    @Override // X.InterfaceC83852WvY
    public final InterfaceC83670Wsc getAudioController() {
        return LJII().getAudioController();
    }

    @Override // X.InterfaceC83852WvY
    public final InterfaceC83863Wvj getCameraController() {
        return LJII().getCameraController();
    }

    @Override // X.InterfaceC83852WvY
    public final InterfaceC83727WtX getEffectController() {
        return LJII().getEffectController();
    }

    @Override // X.InterfaceC83852WvY
    public final InterfaceC83865Wvl getMediaController() {
        return LJII().getMediaController();
    }

    @Override // X.InterfaceC83852WvY
    public final void release() {
        C82891Wg3.LIZLLL().i("CaptureLog release");
        InterfaceC83830WvC<KEY> interfaceC83830WvC = this.LJLILLLLZI;
        if (interfaceC83830WvC != null) {
            interfaceC83830WvC.LIZIZ();
            interfaceC83830WvC.release();
        }
        InterfaceC83829WvB interfaceC83829WvB = this.LJLJI;
        if (interfaceC83829WvB != null) {
            interfaceC83829WvB.release();
        }
        this.LJLJJI.dispose();
    }

    @Override // X.InterfaceC83852WvY
    public final InterfaceC83829WvB s4() {
        return LJII();
    }

    @Override // X.InterfaceC83852WvY
    public final InterfaceC83868Wvo t4() {
        return LJII().LIZ();
    }

    public final void LJIIIIZZ(C83911WwV c83911WwV) {
        InterfaceC83821Wv3<KEY> interfaceC83821Wv3;
        OSZ osz;
        C83935Wwt c83935Wwt;
        OSZ osz2;
        C83935Wwt c83935Wwt2;
        if (this.LJLILLLLZI != null) {
            return;
        }
        C82891Wg3.LIZLLL().i("CaptureLog init");
        InterfaceC83821Wv3<KEY> interfaceC83821Wv32 = this.LJLLILLLL;
        InterfaceC83830WvC<KEY> interfaceC83830WvC = this.LJLILLLLZI;
        if (interfaceC83830WvC != null) {
            interfaceC83830WvC.LIZIZ();
            this.LJLJLJ.onNext(new C83834WvG(interfaceC83830WvC));
        }
        InterfaceC83836WvI<KEY> interfaceC83836WvI = this.LJLLL;
        InterfaceC83821Wv3<KEY> interfaceC83821Wv33 = null;
        if (interfaceC83830WvC != null) {
            interfaceC83821Wv3 = interfaceC83830WvC.getKey();
        } else {
            interfaceC83821Wv3 = null;
        }
        C83935Wwt LIZ = interfaceC83836WvI.LIZ(interfaceC83821Wv3, interfaceC83821Wv32);
        if (interfaceC83830WvC != null) {
            osz = new OSZ(interfaceC83830WvC.getKey(), interfaceC83830WvC.getSessionContext());
        } else {
            osz = null;
        }
        OSZ osz3 = new OSZ(interfaceC83821Wv32, LIZ);
        this.LJLJLLL.onNext(new C83850WvW());
        if (osz != null) {
            c83935Wwt = (C83935Wwt) osz.getSecond();
        } else {
            c83935Wwt = null;
        }
        LJIIJJI(c83935Wwt, (C83935Wwt) osz3.getSecond(), true);
        RecorderImpl LIZ2 = this.LJLLLL.LIZ(LIZ, c83911WwV);
        this.LJLJI = LIZ2;
        C83851WvX c83851WvX = new C83851WvX(LJI(), LIZ2, r4(), (C83835WvH) this.LJLJL.getValue(), new AqS161S0200000_14(this, interfaceC83821Wv32, 59));
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        InterfaceC83830WvC<KEY> interfaceC83830WvC2 = (InterfaceC83830WvC<KEY>) linkedHashMap.get(interfaceC83821Wv32);
        if (interfaceC83830WvC2 == null) {
            interfaceC83830WvC2 = this.LJLLJ.LIZ(interfaceC83821Wv32, c83851WvX);
            linkedHashMap.put(interfaceC83821Wv32, interfaceC83830WvC2);
        }
        InterfaceC83830WvC<KEY> interfaceC83830WvC3 = interfaceC83830WvC2;
        this.LJLILLLLZI = interfaceC83830WvC3;
        if (interfaceC83830WvC != null) {
            this.LJLJLJ.onNext(new C83832WvE(interfaceC83830WvC, interfaceC83830WvC3));
        }
        interfaceC83830WvC3.LIZ();
        if (interfaceC83830WvC != null) {
            osz2 = new OSZ(interfaceC83830WvC.getKey(), interfaceC83830WvC.getSessionContext());
        } else {
            osz2 = null;
        }
        OSZ osz4 = new OSZ(interfaceC83821Wv32, interfaceC83830WvC3.getSessionContext());
        this.LJLJLLL.onNext(new C83848WvU());
        if (osz2 != null) {
            c83935Wwt2 = (C83935Wwt) osz2.getSecond();
        } else {
            c83935Wwt2 = null;
        }
        LJIIJJI(c83935Wwt2, (C83935Wwt) osz4.getSecond(), false);
        if (interfaceC83830WvC != null) {
            this.LJLJLJ.onNext(new C83833WvF(interfaceC83830WvC, interfaceC83830WvC3));
        } else {
            this.LJLL.onNext(interfaceC83830WvC3);
        }
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("CaptureLog switchSessionActual [oldSessionKey, newSessionKey] | [");
        if (interfaceC83830WvC != null) {
            interfaceC83821Wv33 = interfaceC83830WvC.getKey();
        }
        LIZ3.append(interfaceC83821Wv33);
        LIZ3.append(", ");
        LIZ3.append(interfaceC83830WvC3.getKey());
        LIZ3.append(']');
        LIZLLL.i(X1D.LIZIZ(LIZ3));
    }

    public final void LJIIJ(InterfaceC83659WsR listener) {
        o.LJIIIZ(listener, "listener");
        C83835WvH c83835WvH = (C83835WvH) this.LJLJL.getValue();
        c83835WvH.getClass();
        c83835WvH.LIZJ = listener;
    }

    @Override // X.InterfaceC83640Ws8
    public final void LLJJL(float f) {
        LJFF().LLJJL(f);
    }

    @Override // X.InterfaceC83640Ws8
    public final int Z6(boolean z) {
        return LJFF().Z6(false);
    }

    @Override // X.InterfaceC83640Ws8
    public final void n0(boolean z) {
        LJFF().n0(z);
    }

    @Override // X.InterfaceC83640Ws8
    public final boolean LLJJLIIIJLLLLLLLZ(float f, float f2) {
        return LJFF().LLJJLIIIJLLLLLLLZ(f, f2);
    }

    @Override // X.InterfaceC83640Ws8
    public final void U6(Cert cert, boolean z) {
        LJFF().U6(cert, z);
    }

    @Override // X.InterfaceC83640Ws8
    public final void V6(Cert cert, boolean z) {
        LJFF().V6(cert, z);
    }

    @Override // X.InterfaceC83640Ws8
    public final void W6(Cert cert, boolean z) {
        LJFF().W6(cert, z);
    }

    public final void LJIIJJI(C83935Wwt c83935Wwt, C83935Wwt c83935Wwt2, boolean z) {
        C5T3 c5t3;
        AbstractC83845WvR c83842WvO;
        if (c83935Wwt != null && ((c5t3 = c83935Wwt.LJLJJL) == null || c5t3.getRatio() != c83935Wwt2.LJLJJL.getRatio())) {
            C83843WvP c83843WvP = new C83843WvP(c83935Wwt.LJLJI, c83935Wwt.LJLJJL, c83935Wwt.LJLJJLL);
            C83843WvP c83843WvP2 = new C83843WvP(c83935Wwt2.LJLJI, c83935Wwt2.LJLJJL, c83935Wwt2.LJLJJLL);
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CaptureLog tryEmitRatioChangeEvent isWillChange:");
            LIZ.append(z);
            LIZ.append(", [fromStrategy, toStrategy] | [");
            LIZ.append(c83843WvP);
            LIZ.append(", ");
            LIZ.append(c83843WvP2);
            LIZ.append(']');
            LIZLLL.i(X1D.LIZIZ(LIZ));
            if (z) {
                c83842WvO = new C83844WvQ(c83843WvP, c83843WvP2);
            } else {
                c83842WvO = new C83842WvO(c83843WvP, c83843WvP2);
            }
            this.LJLLI.onNext(c83842WvO);
            return;
        }
        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CaptureLog tryEmitRatioChangeEvent preview ratio not change, isWillChange:");
        LIZ2.append(z);
        LIZLLL2.i(X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC83640Ws8
    public final void X6(boolean z, Cert cert, boolean z2) {
        LJFF().X6(z, cert, z2);
    }

    @Override // X.InterfaceC83640Ws8
    public final int z6(boolean z, Cert cert, String str) {
        return LJFF().z6(z, cert, str);
    }

    public C83826Wv8(InterfaceC83821Wv3 defaultSessionKey, InterfaceC83831WvD interfaceC83831WvD, InterfaceC83836WvI contextProvider, C83910WwU c83910WwU, InterfaceC65784Pro globalContextProvider) {
        o.LJIIIZ(defaultSessionKey, "defaultSessionKey");
        o.LJIIIZ(contextProvider, "contextProvider");
        o.LJIIIZ(globalContextProvider, "globalContextProvider");
        this.LJLLILLLL = defaultSessionKey;
        this.LJLLJ = interfaceC83831WvD;
        this.LJLLL = contextProvider;
        this.LJLLLL = c83910WwU;
        this.LJLLLLLL = globalContextProvider;
        this.LJLIL = new LinkedHashMap();
        this.LJLJJI = new C73318Sq2();
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 412));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 413));
        this.LJLJL = C221108m2.LIZIZ(C83846WvS.LJLIL);
        this.LJLJLJ = new C73893SzJ<>();
        this.LJLJLLL = new C73893SzJ<>();
        this.LJLL = new C73893SzJ<>();
        this.LJLLI = new C73893SzJ<>();
    }
}
