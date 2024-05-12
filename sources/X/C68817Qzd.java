package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qzd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68817Qzd extends AbstractC68731QyF {
    public final Fragment LJ;
    public C13340fi LJFF;
    public Activity LJI;
    public final List LJII = new ArrayList();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:8:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    public final void LJ() {
        /*
            r4 = this;
            android.app.Activity r2 = r4.LJI
            if (r2 == 0) goto L74
            X.0fi r0 = r4.LJFF
            if (r0 == 0) goto L74
            T extends X.R0Y r0 = r4.LIZ
            if (r0 != 0) goto L74
        Ld:
            java.lang.Class<X.Qzb> r1 = X.C68815Qzb.class
            monitor-enter(r1)     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            X.C68815Qzb.LIZ(r2)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r1)     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            android.app.Activity r0 = r4.LJI     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            X.Qzc r2 = X.C68459Qtr.LIZ(r0)     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            android.app.Activity r1 = r4.LJI     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            X.Qov r0 = new X.Qov     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            r0.<init>(r1)     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            X.R02 r3 = r2.LLJJJJLIIL(r0)     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            if (r3 != 0) goto L28
            return
        L28:
            X.0fi r2 = r4.LJFF     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            X.R01 r1 = new X.R01     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            androidx.fragment.app.Fragment r0 = r4.LJ     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            r1.<init>(r0, r3)     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            r2.LIZ(r1)     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            java.util.List r0 = r4.LJII     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            java.util.Iterator r3 = r0.iterator()     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
        L3c:
            boolean r0 = r3.hasNext()     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            if (r0 == 0) goto L61
            java.lang.Object r2 = r3.next()     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            X.Qzq r2 = (X.InterfaceC68830Qzq) r2     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            T extends X.R0Y r0 = r4.LIZ     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            X.R01 r0 = (X.R01) r0     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            r0.getClass()     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            X.R02 r1 = r0.LIZIZ     // Catch: android.os.RemoteException -> L5a X.PSW -> L6c
            X.Qzg r0 = new X.Qzg     // Catch: android.os.RemoteException -> L5a X.PSW -> L6c
            r0.<init>(r2)     // Catch: android.os.RemoteException -> L5a X.PSW -> L6c
            r1.a0(r0)     // Catch: android.os.RemoteException -> L5a X.PSW -> L6c
            goto L3c
        L5a:
            r1 = move-exception
            X.Qtv r0 = new X.Qtv     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            r0.<init>(r1)     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            throw r0     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
        L61:
            java.util.List r0 = r4.LJII     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            r0.clear()     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            goto L6c
        L69:
            r0 = move-exception
            monitor-exit(r1)     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
            throw r0     // Catch: X.PSW -> L6c android.os.RemoteException -> L6d
        L6c:
            return
        L6d:
            r1 = move-exception
            X.Qtv r0 = new X.Qtv
            r0.<init>(r1)
            throw r0
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68817Qzd.LJ():void");
    }

    public C68817Qzd(Fragment fragment) {
        this.LJ = fragment;
    }

    @Override // X.AbstractC68731QyF
    public final void LIZ(C13340fi c13340fi) {
        this.LJFF = c13340fi;
        LJ();
    }
}
