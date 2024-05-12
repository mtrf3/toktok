package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class QZV implements IAVPlayer.EventListener, IAVPlayer.ErrorListener, QZQ, InterfaceC30127Bs3, CGL {
    @Override // X.InterfaceC30127Bs3
    public void LIZIZ(CGF notifyFilter) {
        o.LJIIIZ(notifyFilter, "notifyFilter");
    }

    @Override // X.InterfaceC30127Bs3
    public float LIZLLL(int i) {
        return 60.0f;
    }

    @Override // X.CGL
    public void LJFF() {
    }

    public abstract void LJII();

    public abstract boolean LJIIIIZZ(C00C c00c);

    public abstract Object LJIIJ(C17R c17r);

    public abstract void LJIIJJI(String str);

    public abstract String LJIIL();

    public abstract String LJIILIIL(int i);

    public abstract C10K LJIILL(String str, String str2);

    public abstract QZV LJIILLIIL();

    public abstract void LJIIZILJ();

    @Override // X.CGL
    public void destroy() {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.ErrorListener
    public void onError(IAVPlayer iAVPlayer, int i, Exception exc) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onPause(IAVPlayer iAVPlayer, int i) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onPrepared(IAVPlayer iAVPlayer, int i) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onProgress(IAVPlayer iAVPlayer, long j) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onSeeked(IAVPlayer iAVPlayer, long j, boolean z) {
    }

    @Override // com.ss.ttlivestreamer.core.player.IAVPlayer.EventListener
    public void onStarted(IAVPlayer iAVPlayer, int i) {
    }

    public void start() {
    }

    public void stop() {
    }

    public /* synthetic */ QZV() {
    }

    public /* synthetic */ QZV(AbstractC44957Hkf abstractC44957Hkf) {
    }

    public Object LIZ(Class cls) {
        C6Y7 LJ = LJ(cls);
        if (LJ == null) {
            return null;
        }
        return LJ.get();
    }

    public java.util.Set LJI(Class cls) {
        return (java.util.Set) LIZJ(cls).get();
    }

    public boolean LJIJ(AnoleComponentAppearModel appearModel) {
        o.LJIIIZ(appearModel, "appearModel");
        return o.LJ(appearModel.getType(), LJIIL());
    }

    public static boolean LJIILJJIL(String sourceComponent, List list) {
        o.LJIIIZ(sourceComponent, "sourceComponent");
        if (list == null || !(!list.isEmpty())) {
            return true;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next(), sourceComponent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0009, code lost:
    
        if (r6 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized X.C48425IzV LJIIIZ(android.content.Context r4, com.ss.ttm.player.TTPlayerClient r5, java.util.HashMap r6) {
        /*
            java.lang.Class<X.QZV> r3 = X.QZV.class
            monitor-enter(r3)
            if (r6 == 0) goto L8
            r1 = 33
            goto Le
        L8:
            r2 = 1
            if (r6 == 0) goto Lc
            goto L26
        Lc:
            r0 = 0
            goto L40
        Le:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L47
            int r2 = r0.intValue()     // Catch: java.lang.Throwable -> L47
        L26:
            r1 = 43
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto Lc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L47
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L47
        L40:
            X.IzV r0 = X.C48425IzV.LJIJI(r5, r4, r2, r0)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return r0
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QZV.LJIIIZ(android.content.Context, com.ss.ttm.player.TTPlayerClient, java.util.HashMap):X.IzV");
    }
}
