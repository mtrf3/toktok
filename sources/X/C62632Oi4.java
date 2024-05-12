package X;

import android.app.Activity;
import kotlin.jvm.internal.AqS157S0200000_10;

/* renamed from: X.Oi4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62632Oi4 implements InterfaceC62809Okv {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ Activity LIZIZ;

    public C62632Oi4(Activity activity, AqS157S0200000_10 aqS157S0200000_10) {
        this.LIZ = aqS157S0200000_10;
        this.LIZIZ = activity;
    }

    @Override // X.InterfaceC62809Okv
    public final void LIZ(boolean z, String str) {
        if (z) {
            this.LIZ.invoke();
            C62629Oi1.LJI = true;
        } else {
            C62629Oi1.LJI = false;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LIZIZ);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }
}
