package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bfa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29354Bfa implements InterfaceC29110Bbe {
    @Override // X.InterfaceC29110Bbe
    public final boolean LJIIIZ() {
        Activity topActivity = C7N.LJIIJJI().getTopActivity();
        if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            C29356Bfc c29356Bfc = new C29356Bfc();
            c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.sym);
            c29356Bfc.LIZJ = -1;
            c29356Bfc.LJ = "video_take";
            c29356Bfc.LJFF = "open_live";
            c29356Bfc.LIZLLL = "bottom_tab";
            ((C29374Bfu) LIZIZ).LIZLLL(topActivity, new C29377Bfx(c29356Bfc)).LIZ(new C29355Bfb());
            return true;
        }
        return false;
    }
}
