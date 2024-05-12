package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BkU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29658BkU extends V1B {
    public boolean LJLJJL;
    public final /* synthetic */ C29656BkS LJLJJLL;
    public final /* synthetic */ View LJLJL;

    public C29658BkU(C29656BkS c29656BkS, View view) {
        this.LJLJJLL = c29656BkS;
        this.LJLJL = view;
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        C29635Bk7.LIZLLL(this.LJLJJLL.LJLIL.type, 0);
        C29635Bk7.LIZJ(this.LJLJJLL.LJLIL.type, 0);
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        if (this.LJLJJL) {
            return;
        }
        this.LJLJJL = true;
        C29635Bk7.LIZLLL(this.LJLJJLL.LJLIL.type, 1);
        C29635Bk7.LIZJ(this.LJLJJLL.LJLIL.type, 1);
        int i3 = this.LJLJJLL.LJLZ;
        if (i3 == 720) {
            i = (int) (i * 0.6666667f);
            i2 = (int) (i2 * 0.6666667f);
        } else if (i3 <= 720) {
            i = 0;
            i2 = 0;
        }
        if (i > 0 && i2 > 0) {
            C29656BkS c29656BkS = this.LJLJJLL;
            c29656BkS.LJLJL(this.LJLJL, c29656BkS.LJLIL.type, i, i2);
        }
        this.LJLJJLL._$_findCachedViewById(R.id.j6l).setVisibility(8);
        this.LJLJJLL.setVisibility(0);
    }
}
