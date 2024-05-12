package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.XtO, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86266XtO implements InterfaceC38012Evw {
    public final C86267XtP LJLIL;
    public final C38049EwX LJLILLLLZI;
    public String LJLJI;
    public final WeakReference<Context> LJLJJI;

    public C86266XtO(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        this.LJLILLLLZI = c38049EwX;
        this.LJLJJI = weakReference;
        C86267XtP c86267XtP = new C86267XtP(this, weakReference);
        this.LJLIL = c86267XtP;
        c86267XtP.LJLJJL = false;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        c38048EwW.LJIIJ = false;
        this.LJLJI = c38048EwW.LIZIZ;
        this.LJLIL.LIZLLL(c38048EwW.LIZLLL);
    }
}
