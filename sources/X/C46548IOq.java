package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;

/* renamed from: X.IOq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46548IOq implements InterfaceC46334IGk {
    public final /* synthetic */ SearchPhotoHolder LIZ;

    @Override // X.InterfaceC46334IGk
    public final void LIZ() {
    }

    @Override // X.InterfaceC46334IGk
    public final void LIZIZ() {
        JGI core;
        JHC i0 = this.LIZ.i0();
        if (i0 != null && (core = i0.getCore()) != null) {
            core.LJIJ();
        }
    }

    @Override // X.InterfaceC46334IGk
    public final void LIZJ() {
        JGI core;
        JHC i0 = this.LIZ.i0();
        if (i0 != null && (core = i0.getCore()) != null) {
            C46728IVo.LJIIL(819200, core.getMAweme());
        }
    }

    @Override // X.InterfaceC46334IGk
    public final boolean LJJZZIII() {
        JGI core;
        InterfaceC47247IgV surfaceHolder;
        JHC i0 = this.LIZ.i0();
        if (i0 == null || (core = i0.getCore()) == null || (surfaceHolder = core.getSurfaceHolder()) == null || !surfaceHolder.d4()) {
            return false;
        }
        return true;
    }

    public C46548IOq(SearchPhotoHolder searchPhotoHolder) {
        this.LIZ = searchPhotoHolder;
    }
}
