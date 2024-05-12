package X;

import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Nig, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60122Nig implements InterfaceC60115NiZ {
    public final /* synthetic */ NV7 LIZ;
    public final /* synthetic */ C68322mC<String> LIZIZ;
    public final /* synthetic */ C60123Nih LIZJ;

    @Override // X.InterfaceC60115NiZ
    public final void LIZ() {
        this.LIZ.refresh();
        this.LIZIZ.element = "safe";
        C60119Nid.LIZ = "safe";
        MusicLandingPageViewModel musicLandingPageViewModel = this.LIZJ.LJLJI;
        if (musicLandingPageViewModel != null) {
            musicLandingPageViewModel.gv0(this.LIZIZ.element);
            C60119Nid.LIZLLL = false;
        } else {
            o.LJIJI("safeStatusViewModel");
            throw null;
        }
    }

    public C60122Nig(NV7 nv7, C68322mC<String> c68322mC, C60123Nih c60123Nih) {
        this.LIZ = nv7;
        this.LIZIZ = c68322mC;
        this.LIZJ = c60123Nih;
    }
}
