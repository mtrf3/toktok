package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qze, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68818Qze extends AbstractC68731QyF {
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
            if (r2 == 0) goto L60
            X.0fi r0 = r4.LJFF
            if (r0 == 0) goto L60
            T extends X.R0Y r0 = r4.LIZ
            if (r0 != 0) goto L60
        Ld:
            java.lang.Class<X.Qzb> r1 = X.C68815Qzb.class
            monitor-enter(r1)     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            X.C68815Qzb.LIZ(r2)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r1)     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            android.app.Activity r0 = r4.LJI     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            X.Qzc r2 = X.C68459Qtr.LIZ(r0)     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            android.app.Activity r1 = r4.LJI     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            X.Qov r0 = new X.Qov     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            r0.<init>(r1)     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            X.R03 r3 = r2.LLJLL(r0)     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            X.0fi r2 = r4.LJFF     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            X.Qzz r1 = new X.Qzz     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            androidx.fragment.app.Fragment r0 = r4.LJ     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            r1.<init>(r0, r3)     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            r2.LIZ(r1)     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            java.util.List r0 = r4.LJII     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            java.util.Iterator r2 = r0.iterator()     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
        L39:
            boolean r0 = r2.hasNext()     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            if (r0 == 0) goto L4d
            java.lang.Object r1 = r2.next()     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            X.Qzu r1 = (X.InterfaceC68834Qzu) r1     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            T extends X.R0Y r0 = r4.LIZ     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            X.Qzz r0 = (X.C68839Qzz) r0     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            r0.LIZIZ(r1)     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            goto L39
        L4d:
            java.util.List r0 = r4.LJII     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            r0.clear()     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            goto L58
        L55:
            r0 = move-exception
            monitor-exit(r1)     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
            throw r0     // Catch: X.PSW -> L58 android.os.RemoteException -> L59
        L58:
            return
        L59:
            r1 = move-exception
            X.Qtv r0 = new X.Qtv
            r0.<init>(r1)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68818Qze.LJ():void");
    }

    public C68818Qze(Fragment fragment) {
        this.LJ = fragment;
    }

    @Override // X.AbstractC68731QyF
    public final void LIZ(C13340fi c13340fi) {
        this.LJFF = c13340fi;
        LJ();
    }
}
