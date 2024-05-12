package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;

/* renamed from: X.IOo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46546IOo implements InterfaceC46334IGk {
    public final /* synthetic */ SearchVideoHolder LIZ;

    @Override // X.InterfaceC46334IGk
    public final void LIZ() {
        JGI core;
        C48887JGp w0 = this.LIZ.w0();
        if (w0 != null && (core = w0.getCore()) != null) {
            core.LJIIL();
        }
    }

    @Override // X.InterfaceC46334IGk
    public final void LIZIZ() {
        JGI core;
        C48887JGp w0 = this.LIZ.w0();
        if (w0 != null && (core = w0.getCore()) != null) {
            core.LJIJ();
        }
    }

    @Override // X.InterfaceC46334IGk
    public final void LIZJ() {
        JGI core;
        C48887JGp w0 = this.LIZ.w0();
        if (w0 != null && (core = w0.getCore()) != null) {
            C46728IVo.LJIIL(819200, core.getMAweme());
        }
    }

    @Override // X.InterfaceC46334IGk
    public final boolean LJJZZIII() {
        JGI core;
        InterfaceC47247IgV surfaceHolder;
        C48887JGp w0 = this.LIZ.w0();
        if (w0 == null || (core = w0.getCore()) == null || (surfaceHolder = core.getSurfaceHolder()) == null || !surfaceHolder.d4()) {
            return false;
        }
        return true;
    }

    public C46546IOo(SearchVideoHolder searchVideoHolder) {
        this.LIZ = searchVideoHolder;
    }
}
