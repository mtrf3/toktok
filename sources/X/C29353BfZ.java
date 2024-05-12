package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BfZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29353BfZ implements InterfaceC28918BWo {
    @Override // X.InterfaceC28918BWo
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC28918BWo
    public final int getErrorCode() {
        return 101;
    }

    @Override // X.InterfaceC28918BWo
    public final Object LIZIZ(BIK bik, AbstractC65782Prm abstractC65782Prm) {
        Context context = bik.LIZ;
        if (!((C29374Bfu) B83.LIZ().LIZIZ()).isLogin()) {
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            C29356Bfc c29356Bfc = new C29356Bfc();
            c29356Bfc.LIZ = C15380j0.LJIILJJIL(R.string.sym);
            c29356Bfc.LIZJ = -1;
            c29356Bfc.LJ = "video_take";
            c29356Bfc.LJFF = "open_live";
            c29356Bfc.LIZLLL = "bottom_tab";
            ((C29374Bfu) LIZIZ).LIZLLL(context, new C29377Bfx(c29356Bfc)).LIZ(new C29355Bfb());
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
