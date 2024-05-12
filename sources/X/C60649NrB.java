package X;

import android.text.TextUtils;
import com.google.gson.j;
import com.google.gson.m;

/* renamed from: X.NrB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60649NrB extends AbstractC60629Nqr<OM1> implements InterfaceC60707Ns7 {
    public boolean LJLJL;
    public InterfaceC60651NrD LJLJLJ;
    public volatile FP9 LJLJLLL;
    public C60652NrE LJLL;
    public final C60653NrF LJLLI = new C60653NrF(this);

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        C60631Nqt.LIZ(((C60640Nr2) LIZ()).getExtendableWebViewClient(), new C60533NpJ(this));
        LIZLLL("loadUrl", this.LJLLI);
        LIZLLL("reload", this.LJLLI);
        LIZLLL("goBack", this.LJLLI);
    }

    public final void LJFF(m mVar) {
        if (this.LJLJLLL == null) {
            this.LJLJLLL = new FP9();
        }
        if (mVar == null) {
            return;
        }
        j LJJIJ = mVar.LJJIJ("scc_cs_enable");
        if (LJJIJ != null) {
            this.LJLJL = LJJIJ.LJFF();
        }
        j LJJIJ2 = mVar.LJJIJ("scc_cs_is_debug");
        if (LJJIJ2 != null) {
            C38639FEl.LIZIZ = LJJIJ2.LJFF();
        }
        this.LJLJLLL.LIZ.LIZ(mVar);
    }

    public final boolean LJI(String str) {
        if (this.LJLJL && this.LJLJLLL != null && this.LJLJLJ != null && !TextUtils.isEmpty(str)) {
            this.LJLJLJ.LIZLLL();
            return true;
        }
        return false;
    }
}
