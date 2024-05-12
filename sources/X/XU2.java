package X;

import com.ss.android.ugc.musicprovider.provider.MusicPlayer;

/* loaded from: classes16.dex */
public final class XU2 implements XU4 {
    public final XU4 LJLIL;

    @Override // X.XU4
    public final boolean isPlaying() {
        return this.LJLIL.isPlaying();
    }

    @Override // X.XU4
    public final void pause() {
        this.LJLIL.pause();
    }

    @Override // X.XU4
    public final void release() {
        this.LJLIL.release();
    }

    @Override // X.XU4
    public final void resume() {
        this.LJLIL.resume();
    }

    @Override // X.XU4
    public final void stop() {
        this.LJLIL.stop();
    }

    public XU2() {
        XPS LIZLLL = XPS.LIZLLL();
        if (LIZLLL.LIZJ == null) {
            LIZLLL.LJ();
        }
        this.LJLIL = new MusicPlayer(LIZLLL.LIZJ);
        LJI();
    }

    public static void LJI() {
        XPS LIZLLL = XPS.LIZLLL();
        if (LIZLLL.LIZIZ == null) {
            LIZLLL.LJ();
        }
        String path = LIZLLL.LIZIZ.getPath();
        String LIZ = XPS.LIZLLL().LIZ();
        if (!C30581Hy.LJII(path)) {
            C30581Hy.LJIIJ(path);
        }
        if (!C30581Hy.LJII(LIZ)) {
            C30581Hy.LJIIJ(LIZ);
        }
    }

    public XU2(String str) {
        this.LJLIL = new C47323Ihj(str == null ? "" : str);
        LJI();
    }

    @Override // X.XU4
    public final void LIZIZ(InterfaceC47330Ihq interfaceC47330Ihq) {
        this.LJLIL.LIZIZ(interfaceC47330Ihq);
    }

    @Override // X.XU4
    public final void LIZJ(InterfaceC47328Iho interfaceC47328Iho) {
        this.LJLIL.LIZJ(interfaceC47328Iho);
    }

    @Override // X.XU4
    public final void LIZLLL(C47325Ihl c47325Ihl) {
        this.LJLIL.LIZLLL(c47325Ihl);
    }

    @Override // X.XU4
    public final void LJ(XUV xuv) {
        this.LJLIL.LJ(xuv);
    }

    @Override // X.XU4
    public final void LJFF(InterfaceC47329Ihp interfaceC47329Ihp) {
        this.LJLIL.LJFF(interfaceC47329Ihp);
    }

    @Override // X.XU4
    public final void LIZ(String str, String str2, C84862XSg c84862XSg) {
        this.LJLIL.LIZ(str, str2, c84862XSg);
    }
}
