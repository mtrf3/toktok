package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.IOn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46545IOn implements InterfaceC46334IGk {
    public final /* synthetic */ JI9 LIZ;

    @Override // X.InterfaceC46334IGk
    public final void LIZ() {
        JGI core;
        C48887JGp c48887JGp = this.LIZ.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            core.LJIIL();
        }
    }

    @Override // X.InterfaceC46334IGk
    public final void LIZIZ() {
        JGI core;
        C48887JGp c48887JGp = this.LIZ.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            core.LJIJ();
        }
    }

    @Override // X.InterfaceC46334IGk
    public final void LIZJ() {
        String str;
        JGI core;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("next video is preloading...   id:");
        Aweme aweme = this.LIZ.LJZI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C48887JGp c48887JGp = this.LIZ.LJLLL;
        if (c48887JGp != null && (core = c48887JGp.getCore()) != null) {
            C46728IVo.LJIIL(819200, core.getMAweme());
        }
    }

    @Override // X.InterfaceC46334IGk
    public final boolean LJJZZIII() {
        Boolean bool;
        JGI core;
        InterfaceC47247IgV surfaceHolder;
        JGI core2;
        InterfaceC47247IgV surfaceHolder2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isAvailable: ");
        C48887JGp c48887JGp = this.LIZ.LJLLL;
        if (c48887JGp != null && (core2 = c48887JGp.getCore()) != null && (surfaceHolder2 = core2.getSurfaceHolder()) != null) {
            bool = Boolean.valueOf(surfaceHolder2.d4());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        X1D.LIZIZ(LIZ);
        C48887JGp c48887JGp2 = this.LIZ.LJLLL;
        if (c48887JGp2 == null || (core = c48887JGp2.getCore()) == null || (surfaceHolder = core.getSurfaceHolder()) == null || !surfaceHolder.d4()) {
            return false;
        }
        return true;
    }

    public C46545IOn(JI9 ji9) {
        this.LIZ = ji9;
    }
}
