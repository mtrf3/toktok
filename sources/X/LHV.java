package X;

import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class LHV<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public LHV(String str, int i, int i2) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        if (r2 != null) goto L15;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            r4 = this;
            r0 = 6
            X.OSZ[] r3 = new X.OSZ[r0]
            java.lang.String r2 = r4.LJLIL
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "enter_from"
            r1.<init>(r2, r0)
            r0 = 0
            r3[r0] = r1
            X.OSZ r2 = new X.OSZ
            java.lang.String r1 = "tab_name"
            java.lang.String r0 = "friends"
            r2.<init>(r0, r1)
            r0 = 1
            r3[r0] = r2
            X.OSZ r2 = new X.OSZ
            java.lang.String r1 = "landing_page"
            java.lang.String r0 = "homepage_friends"
            r2.<init>(r0, r1)
            r0 = 2
            r3[r0] = r2
            int r0 = r4.LJLILLLLZI
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "total_number_cnt"
            r1.<init>(r2, r0)
            r0 = 3
            r3[r0] = r1
            int r0 = r4.LJLJI
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "friends_number_cnt"
            r1.<init>(r2, r0)
            r0 = 4
            r3[r0] = r1
            com.ss.android.ugc.aweme.friendstab.tab.StateOwner r0 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LJLIL
            X.1qj r1 = r0.LIZLLL()
            X.7b0 r0 = com.bytedance.hox.Hox.LJLLI
            if (r1 == 0) goto L8f
            com.bytedance.hox.Hox r0 = r0.LIZ(r1)
            java.lang.String r2 = "NOTIFICATION"
            androidx.fragment.app.Fragment r1 = r0.Ja(r2)
            java.lang.String r0 = X.LHN.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L7b
            com.bytedance.router.fragment.FindNavigationContainerResult r0 = com.bytedance.router.fragment.NavigationUtils.findNavigationContainer(r1)
            if (r0 == 0) goto L7b
            androidx.fragment.app.Fragment r1 = com.bytedance.router.fragment.NavigationUtils.findTopFragment(r1)
            boolean r0 = r1 instanceof X.InterfaceC27853AwT
            if (r0 == 0) goto L7b
            X.AwT r1 = (X.InterfaceC27853AwT) r1
            if (r1 == 0) goto L7b
            java.lang.String r2 = r1.getPageName()
            if (r2 != 0) goto L7d
        L7b:
            java.lang.String r2 = ""
        L7d:
            X.OSZ r1 = new X.OSZ
            java.lang.String r0 = "from_inbox_page"
            r1.<init>(r2, r0)
            r0 = 5
            r3[r0] = r1
            java.lang.String r0 = "enter_social_2tab"
            X.FMX.LJIILL(r0, r3)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L8f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LHV.call():java.lang.Object");
    }
}
