package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.XtG, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86258XtG implements InterfaceC61118Nyk {
    public final /* synthetic */ C86251Xt9 LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    public C86258XtG(Activity activity, C86251Xt9 c86251Xt9, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ = c86251Xt9;
        this.LIZIZ = activity;
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] grantResults, String[] strArr) {
        C86251Xt9 c86251Xt9 = this.LIZ;
        Activity activity = this.LIZIZ;
        o.LJIIIIZZ(grantResults, "grantResults");
        c86251Xt9.LIZ(activity, grantResults, this.LIZJ);
    }
}
