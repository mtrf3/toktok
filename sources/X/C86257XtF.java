package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XtF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86257XtF implements InterfaceC61118Nyk {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ C86251Xt9 LIZJ;

    public C86257XtF(Activity activity, C86251Xt9 c86251Xt9, InterfaceC65784Pro interfaceC65784Pro) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = activity;
        this.LIZJ = c86251Xt9;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] iArr, String[] strArr) {
        if (iArr[0] == 0) {
            this.LIZ.invoke();
            return;
        }
        C5S1 c5s1 = new C5S1(this.LIZIZ);
        c5s1.LIZLLL(this.LIZIZ.getString(R.string.jga));
        c5s1.LJ();
        this.LIZJ.LJLILLLLZI.LIZ(-1, "uploadFailed");
    }
}
