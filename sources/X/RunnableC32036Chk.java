package X;

/* renamed from: X.Chk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC32036Chk implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ Object LJLJJL;
    public final /* synthetic */ Object LJLJJLL;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:19:0x001e, B:21:0x0022, B:10:0x0059, B:12:0x0064, B:15:0x0072, B:17:0x0047, B:26:0x0031, B:23:0x0025), top: B:18:0x001e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:19:0x001e, B:21:0x0022, B:10:0x0059, B:12:0x0064, B:15:0x0072, B:17:0x0047, B:26:0x0031, B:23:0x0025), top: B:18:0x001e, inners: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.LJLIL
            switch(r0) {
                case 0: goto L86;
                default: goto L5;
            }
        L5:
            java.lang.Object r6 = r9.LJLILLLLZI
            X.Emr r6 = (X.C37449Emr) r6
            java.lang.Object r8 = r9.LJLJI
            java.lang.Object r5 = r9.LJLJJI
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r9.LJLJJL
            X.BQ6 r3 = (X.BQ6) r3
            java.lang.Object r1 = r9.LJLJJLL
            X.BQ6 r1 = (X.BQ6) r1
            r6.getClass()
            r4 = -3
            r7 = 0
            if (r8 == 0) goto L3f
            boolean r0 = r8 instanceof com.google.gson.m     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L25
            com.google.gson.m r8 = (com.google.gson.m) r8     // Catch: java.lang.Throwable -> L78
            goto L40
        L25:
            com.google.gson.Gson r0 = com.bytedance.pia.core.utils.GsonUtils.LIZIZ()     // Catch: java.lang.Throwable -> L30
            com.google.gson.j r8 = r0.LJIJJLI(r8)     // Catch: java.lang.Throwable -> L30
            com.google.gson.m r8 = (com.google.gson.m) r8     // Catch: java.lang.Throwable -> L30
            goto L40
        L30:
            r1 = move-exception
            java.lang.String r0 = "parse data failed."
            r6.LIZJ(r4, r5, r0, r1)     // Catch: java.lang.Throwable -> L78
            X.Chl r0 = new X.Chl     // Catch: java.lang.Throwable -> L78
            r0.<init>()     // Catch: java.lang.Throwable -> L78
            X.C37449Emr.LIZLLL(r3, r0)     // Catch: java.lang.Throwable -> L78
            goto L85
        L3f:
            r8 = r7
        L40:
            if (r1 != 0) goto L47
            if (r3 == 0) goto L45
            goto L47
        L45:
            r1 = 0
            goto L59
        L47:
            X.Em6 r2 = new X.Em6     // Catch: java.lang.Throwable -> L78
            r2.<init>()     // Catch: java.lang.Throwable -> L78
            android.util.SparseArray<X.BQ6<X.EmW>> r1 = r6.LJII     // Catch: java.lang.Throwable -> L78
            int r0 = r6.LJI     // Catch: java.lang.Throwable -> L78
            int r0 = r0 + (-1)
            r6.LJI = r0     // Catch: java.lang.Throwable -> L78
            r1.append(r0, r2)     // Catch: java.lang.Throwable -> L78
            int r1 = r6.LJI     // Catch: java.lang.Throwable -> L78
        L59:
            X.EpD r0 = new X.EpD     // Catch: java.lang.Throwable -> L78
            r0.<init>(r8, r5, r1)     // Catch: java.lang.Throwable -> L78
            com.google.gson.m r1 = com.bytedance.pia.core.bridge.protocol.ProtocolMessage.LIZIZ(r0)     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L72
            java.lang.String r0 = "create protocol message failed."
            r6.LIZJ(r4, r5, r0, r7)     // Catch: java.lang.Throwable -> L78
            X.Chl r0 = new X.Chl     // Catch: java.lang.Throwable -> L78
            r0.<init>()     // Catch: java.lang.Throwable -> L78
            X.C37449Emr.LIZLLL(r3, r0)     // Catch: java.lang.Throwable -> L78
            goto L85
        L72:
            X.EpP<com.google.gson.m> r0 = r6.LJ     // Catch: java.lang.Throwable -> L78
            r0.LIZ(r1)     // Catch: java.lang.Throwable -> L78
            goto L85
        L78:
            r0 = move-exception
            X.Chl r1 = new X.Chl
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            X.C37449Emr.LIZLLL(r3, r1)
        L85:
            return
        L86:
            java.lang.Object r5 = r9.LJLILLLLZI
            X.CcP r5 = (X.AnimationAnimationListenerC31705CcP) r5
            java.lang.Object r4 = r9.LJLJI
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r3 = r9.LJLJJI
            com.bytedance.android.live.slot.IFrameSlot r3 = (com.bytedance.android.live.slot.IFrameSlot) r3
            java.lang.Object r1 = r9.LJLJJL
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r9.LJLJJLL
            X.CcU r2 = (X.InterfaceC31710CcU) r2
            r5.getClass()
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lbd
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r4.removeAllViews()
            Y.AObserverS69S0200000_5 r0 = r5.LIZJ
            java.lang.Object r0 = r0.l1
            com.bytedance.android.live.slot.FrameL2SlotWidget r0 = (com.bytedance.android.live.slot.FrameL2SlotWidget) r0
            r0.hide()
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            r3.LJII(r0)
            java.lang.String r1 = "FrameL2SlotWidget"
            java.lang.String r0 = "slot visible change, visible: false"
            X.C31684Cc4.LIZIZ(r1, r2, r0)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC32036Chk.run():void");
    }

    public /* synthetic */ RunnableC32036Chk(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC31710CcU interfaceC31710CcU, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
        this.LJLJJL = obj4;
        this.LJLJJLL = interfaceC31710CcU;
    }
}
