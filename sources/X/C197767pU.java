package X;

import Y.ARunnableS39S0100000_3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.7pU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197767pU implements InterfaceC196737np {
    public InterfaceC197787pW LIZIZ;
    public C197057oL LIZJ;
    public String LIZ = "default";
    public EnumC196787nu LIZLLL = EnumC196787nu.INVALID;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C86N.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C197047oK.LJLIL);

    public final void LIZ() {
        Integer num;
        if (this.LIZIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("detachHost, scene: ");
            LIZ.append(this.LIZ);
            LIZ.append(", host: ");
            InterfaceC197787pW interfaceC197787pW = this.LIZIZ;
            if (interfaceC197787pW != null) {
                num = Integer.valueOf(interfaceC197787pW.hashCode());
            } else {
                num = null;
            }
            LIZ.append(num);
            X1D.LIZIZ(LIZ);
            InterfaceC197787pW interfaceC197787pW2 = this.LIZIZ;
            if (interfaceC197787pW2 != null && interfaceC197787pW2.LJJLIIIJLJLI() != null) {
                LIZIZ().LJ(this.LIZIZ);
            }
            this.LIZIZ = null;
        }
        this.LIZJ = null;
        this.LIZIZ = null;
        this.LIZLLL = EnumC196787nu.INVALID;
    }

    public final InterfaceC197777pV LIZIZ() {
        return (InterfaceC197777pV) this.LJ.getValue();
    }

    public final java.util.Map<Class<? extends InterfaceC197027oI>, InterfaceC197027oI> LIZLLL() {
        return (java.util.Map) this.LJFF.getValue();
    }

    @Override // X.InterfaceC196737np
    public final InterfaceC197277oh LIZJ() {
        C229728zw LIZJ = LIZIZ().LIZJ();
        o.LJIIIIZZ(LIZJ, "player.videoInfoProvider");
        return LIZJ;
    }

    @Override // X.InterfaceC196737np
    public final InterfaceC197017oH getPlayState() {
        IWU playState = LIZIZ().getPlayState();
        o.LJIIIIZZ(playState, "player.playState");
        return playState;
    }

    @Override // X.InterfaceC196737np
    public final boolean isMute() {
        return LIZIZ().LIZJ().LIZ();
    }

    @Override // X.InterfaceC196737np
    public final void release() {
        LIZ();
        LIZIZ().LJII(null);
        LIZIZ().LJIIIIZZ(null);
        LIZIZ().LJFF(this.LIZ);
        Iterator<Map.Entry<Class<? extends InterfaceC197027oI>, InterfaceC197027oI>> it = LIZLLL().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onDetach();
        }
        LIZLLL().clear();
        LIZIZ().release();
    }

    @Override // X.InterfaceC196737np
    public final void reset() {
        LIZIZ().reset();
        LIZ();
        LIZIZ().LJII(null);
        LIZIZ().LJIIIIZZ(null);
    }

    @Override // X.InterfaceC196737np
    public final void stop() {
        String str;
        InterfaceC46811IYt interfaceC46811IYt;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop, scene: ");
        LIZ.append(this.LIZ);
        LIZ.append(", current request: ");
        C197057oL c197057oL = this.LIZJ;
        if (c197057oL != null && (interfaceC46811IYt = c197057oL.LIZIZ) != null) {
            str = interfaceC46811IYt.getKey();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LIZIZ().stop();
        LIZ();
    }

    @Override // X.InterfaceC196737np
    public final C197057oL LJIIJ() {
        return this.LIZJ;
    }

    public final void LJ(String scene) {
        o.LJIIIZ(scene, "scene");
        this.LIZ = scene;
    }

    @Override // X.InterfaceC196737np
    public final void LJII(InterfaceC46540IOi interfaceC46540IOi) {
        LIZIZ().LJII(interfaceC46540IOi);
    }

    @Override // X.InterfaceC196737np
    public final void LJIIIIZZ(Class<? extends InterfaceC197027oI> cls) {
        InterfaceC197027oI interfaceC197027oI = LIZLLL().get(cls);
        if (interfaceC197027oI != null) {
            interfaceC197027oI.onDetach();
        }
        LIZLLL().remove(cls);
    }

    @Override // X.InterfaceC196737np
    public final void LJIIJJI(EnumC196787nu scope) {
        String str;
        InterfaceC46811IYt interfaceC46811IYt;
        o.LJIIIZ(scope, "scope");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pause, scene: ");
        LIZ.append(this.LIZ);
        LIZ.append(", current request: ");
        C197057oL c197057oL = this.LIZJ;
        if (c197057oL != null && (interfaceC46811IYt = c197057oL.LIZIZ) != null) {
            str = interfaceC46811IYt.getKey();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", scope: ");
        LIZ.append(scope.name());
        X1D.LIZIZ(LIZ);
        EnumC196787nu enumC196787nu = this.LIZLLL;
        if (enumC196787nu == EnumC196787nu.INVALID || scope.compareTo(enumC196787nu) < 0 || !LIZIZ().getPlayState().LIZ()) {
            this.LIZLLL = scope;
        }
        LIZIZ().pause();
    }

    @Override // X.InterfaceC196737np
    public final boolean LJIIL(InterfaceC197787pW host) {
        Integer num;
        o.LJIIIZ(host, "host");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("compare host, current: ");
        InterfaceC197787pW interfaceC197787pW = this.LIZIZ;
        if (interfaceC197787pW != null) {
            num = Integer.valueOf(interfaceC197787pW.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", target: ");
        LIZ.append(host.hashCode());
        X1D.LIZIZ(LIZ);
        return o.LJ(this.LIZIZ, host);
    }

    @Override // X.InterfaceC196737np
    public final void LJIILIIL(InterfaceC197787pW host) {
        o.LJIIIZ(host, "host");
        this.LIZIZ = host;
        if (host.LJJLIIIJLJLI() != null) {
            LIZIZ().LIZIZ(host);
        }
    }

    @Override // X.InterfaceC196737np
    public final void LJIILJJIL(EnumC196787nu scope) {
        String str;
        InterfaceC46811IYt interfaceC46811IYt;
        o.LJIIIZ(scope, "scope");
        if (C210188Ms.LIZLLL()) {
            C37179EiV.LIZ().post(new ARunnableS39S0100000_3(this, 172));
        }
        if (scope.getValue() <= this.LIZLLL.getValue() && LIZIZ().getPlayState().LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("resume, scene: ");
            LIZ.append(this.LIZ);
            LIZ.append(", current request: ");
            C197057oL c197057oL = this.LIZJ;
            if (c197057oL != null && (interfaceC46811IYt = c197057oL.LIZIZ) != null) {
                str = interfaceC46811IYt.getKey();
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(", scope: ");
            LIZ.append(scope.name());
            X1D.LIZIZ(LIZ);
            LIZIZ().resume();
            this.LIZLLL = EnumC196787nu.INVALID;
        }
    }

    @Override // X.InterfaceC196737np
    public final void LJIILL(C197807pY c197807pY) {
        LIZIZ().LJIIIIZZ(c197807pY);
    }

    @Override // X.InterfaceC196737np
    public final void LJIILLIIL(boolean z) {
        if (z == isMute()) {
            return;
        }
        if (z) {
            LIZIZ().LIZLLL().LIZ();
        } else {
            LIZIZ().LIZLLL().LIZIZ();
        }
    }

    @Override // X.InterfaceC196737np
    public final void LJIIZILJ(C197057oL c197057oL) {
        String str;
        InterfaceC46811IYt interfaceC46811IYt;
        if (c197057oL.LIZIZ == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play, scene: ");
        LIZ.append(this.LIZ);
        LIZ.append(", request: ");
        LIZ.append(c197057oL.LIZIZ.getKey());
        LIZ.append(", current request: ");
        C197057oL c197057oL2 = this.LIZJ;
        if (c197057oL2 != null && (interfaceC46811IYt = c197057oL2.LIZIZ) != null) {
            str = interfaceC46811IYt.getKey();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LIZIZ().LIZ(c197057oL.LIZIZ);
        this.LIZJ = c197057oL;
        this.LIZLLL = EnumC196787nu.INVALID;
    }

    @Override // X.InterfaceC196737np
    public final void LJIJ(List<C197057oL> list) {
        InterfaceC197777pV LIZIZ = LIZIZ();
        String str = this.LIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((C197057oL) it.next()).LIZIZ);
        }
        LIZIZ.LJI(str, arrayList);
    }

    @Override // X.InterfaceC196737np
    public final void LJIIIZ(Class cls, C196977oD c196977oD) {
        c196977oD.LIZ(this);
        LIZLLL().put(cls, c196977oD);
    }
}
