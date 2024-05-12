package X;

import com.ss.android.ugc.aweme.compliance.business.fbv.FBVNoticeObserver;

/* renamed from: X.OoE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63014OoE implements InterfaceC26237ARl {
    public final /* synthetic */ FBVNoticeObserver LJLIL;

    public C63014OoE(FBVNoticeObserver fBVNoticeObserver) {
        this.LJLIL = fBVNoticeObserver;
    }

    @Override // X.InterfaceC26237ARl
    public final void onWindowFocusChanged(boolean z) {
        C26231ARf c26231ARf;
        if (!z && (c26231ARf = this.LJLIL.LJLLILLLL) != null) {
            c26231ARf.LIZIZ(null);
        }
    }
}
