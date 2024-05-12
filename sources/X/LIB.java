package X;

/* loaded from: classes10.dex */
public final class LIB<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;

    public LIB(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r6 == null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    @Override // X.InterfaceC64592gB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Long r6 = (java.lang.Long) r6
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto Lf
        Le:
            return
        Lf:
            com.ss.android.ugc.aweme.friendstab.preload.FriendsFeedPreloadPolling r0 = com.ss.android.ugc.aweme.friendstab.preload.FriendsFeedPreloadPolling.LJLIL
            r0.getClass()
            com.ss.android.ugc.aweme.friendstab.tab.StateOwner r0 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LJLIL
            X.1qj r1 = r0.LIZLLL()
            if (r1 != 0) goto L5f
        L1c:
            boolean r0 = r5.LJLIL
            r3 = 0
            if (r0 == 0) goto L4d
            if (r6 != 0) goto L3e
        L24:
            X.LI7 r0 = X.LI7.POLLING
            java.lang.String r2 = r0.getScene()
        L2a:
            X.Ol8 r0 = com.ss.android.ugc.aweme.friendstab.preload.FriendsFeedPreloadPolling.LJLJJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6e
            X.LIj r0 = X.C54029LIj.LIZIZ
            X.LIC.LIZ(r0, r2)
            goto Le
        L3e:
            long r1 = r6.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L50
            X.LI7 r0 = X.LI7.COLD_START
            java.lang.String r2 = r0.getScene()
            goto L2a
        L4d:
            if (r6 != 0) goto L50
            goto L24
        L50:
            long r1 = r6.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L24
            X.LI7 r0 = X.LI7.HOMEPAGE_RECREATE
            java.lang.String r2 = r0.getScene()
            goto L2a
        L5f:
            X.7b0 r0 = com.bytedance.hox.Hox.LJLLI     // Catch: java.lang.Exception -> L1c
            com.bytedance.hox.Hox r1 = r0.LIZ(r1)     // Catch: java.lang.Exception -> L1c
            java.lang.String r0 = "FRIENDS_FEED"
            androidx.fragment.app.Fragment r0 = r1.Ja(r0)     // Catch: java.lang.Exception -> L1c
            if (r0 == 0) goto L1c
            goto Le
        L6e:
            androidx.lifecycle.LifecycleOwner r0 = androidx.lifecycle.ProcessLifecycleOwner.get()
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r1.isAtLeast(r0)
            if (r0 == 0) goto Le
            X.LIj r0 = X.C54029LIj.LIZIZ
            X.LIC.LIZ(r0, r2)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LIB.accept(java.lang.Object):void");
    }
}
