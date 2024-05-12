package X;

import android.os.Bundle;

/* renamed from: X.QoL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68117QoL implements Runnable {
    public final /* synthetic */ Bundle LJLIL;
    public final /* synthetic */ C68132Qoa LJLILLLLZI;
    public final /* synthetic */ C68132Qoa LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ C68084Qno LJLJJL;

    public RunnableC68117QoL(C68084Qno c68084Qno, Bundle bundle, C68132Qoa c68132Qoa, C68132Qoa c68132Qoa2, long j) {
        this.LJLJJL = c68084Qno;
        this.LJLIL = bundle;
        this.LJLILLLLZI = c68132Qoa;
        this.LJLJI = c68132Qoa2;
        this.LJLJJI = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C68084Qno c68084Qno = this.LJLJJL;
            Bundle bundle = this.LJLIL;
            C68132Qoa c68132Qoa = this.LJLILLLLZI;
            C68132Qoa c68132Qoa2 = this.LJLJI;
            long j = this.LJLJJI;
            bundle.remove("screen_name");
            bundle.remove("screen_class");
            c68084Qno.LJIIJ(c68132Qoa, c68132Qoa2, j, true, c68084Qno.LIZ.LJIL().LJJLIIIJJIZ(null, "screen_view", bundle, null, false));
        } finally {
            if (LIZ) {
            }
        }
    }
}
