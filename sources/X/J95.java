package X;

import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;

/* loaded from: classes9.dex */
public final class J95 implements InterfaceC48689J8z {
    public final /* synthetic */ SpeedModeServiceImpl LIZ;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    @Override // X.InterfaceC48689J8z
    public final void LIZ() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl r0 = r2.LIZ
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl.LJIIIIZZ()
            if (r0 == 0) goto L46
        Lc:
            boolean r0 = X.C64752PbA.LIZ()     // Catch: java.lang.Exception -> L42
            if (r0 == 0) goto L3a
            X.Paz r0 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch: java.lang.Exception -> L42
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Exception -> L42
            X.PaD r0 = X.C64693PaD.LJIILIIL(r0)     // Catch: java.lang.Exception -> L42
            if (r0 == 0) goto L46
            com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r0 = X.C64693PaD.LIZLLL     // Catch: java.lang.Exception -> L42
            if (r0 == 0) goto L32
            com.bytedance.common.utility.reflect.Reflect r1 = com.bytedance.common.utility.reflect.Reflect.on(r0)     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = "triggerSwitchingToCellular"
            com.bytedance.common.utility.reflect.Reflect r0 = r1.call(r0)     // Catch: java.lang.Exception -> L42
            r0.get()     // Catch: java.lang.Exception -> L42
            goto L46
        L32:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = "CronetEngine has not been initialized."
            r1.<init>(r0)     // Catch: java.lang.Exception -> L42
            throw r1     // Catch: java.lang.Exception -> L42
        L3a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Exception -> L42
            java.lang.String r0 = "Cronet is not enabled"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L42
            throw r1     // Catch: java.lang.Exception -> L42
        L42:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J95.LIZ():void");
    }

    public J95(SpeedModeServiceImpl speedModeServiceImpl) {
        this.LIZ = speedModeServiceImpl;
    }
}
