package X;

import android.util.SparseArray;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;

/* renamed from: X.M6c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56258M6c implements InterfaceC56268M6m {
    public final InterfaceC56268M6m LIZJ;
    public final C56261M6f LJ;
    public final C56260M6e LJFF;
    public final C56267M6l LJI;
    public final C56259M6d LJII;
    public final C56257M6b LJIIIIZZ;
    public final SparseArray<InterfaceC56268M6m> LJIIIZ;
    public final LVV LIZ = new LVV();
    public final C56263M6h LIZIZ = new C56263M6h();
    public final C54359LVb LIZLLL = new C54359LVb();

    public C56258M6c() {
        if (C19N.LJ("ws_check_anr_enable", true)) {
            this.LIZJ = new C56262M6g();
        } else {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin != null) {
                this.LIZJ = createIIMServicebyMonsterPlugin.getImParser();
            } else {
                this.LIZJ = new C56266M6k();
            }
        }
        this.LJ = new C56261M6f();
        this.LJFF = new C56260M6e();
        this.LJIIIZ = new SparseArray<>();
        this.LJI = new C56267M6l();
        this.LJII = new C56259M6d();
        this.LJIIIIZZ = new C56257M6b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r3.service != 1015) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r6 != 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r3.service != 6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return r7.LIZIZ.LIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r3.service != 7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        return r7.LIZLLL.LIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3.service != 1010) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        return r7.LJ.LIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r3.service != 20003) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r7.LJFF.LIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r6 != 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r3.service != 6) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        r7.LJI.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        r0 = r7.LJIIIZ.get(r3.service);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        return r0.LIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
    
        if (r6 != 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
    
        if (r3.service == 20164) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007d, code lost:
    
        if (r3.service != 20047) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
    
        if (r3.service != 50000) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        return r7.LJIIIIZZ.LIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0085, code lost:
    
        return r7.LJII.LIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0086, code lost:
    
        if (r6 != 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0089, code lost:
    
        if (r6 != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0037, code lost:
    
        if (r6 != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0045, code lost:
    
        if (r6 != 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0054, code lost:
    
        if (r6 != 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0025, code lost:
    
        return r7.LIZJ.LIZ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0026, code lost:
    
        if (r6 == 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r3.service != 5) goto L11;
     */
    @Override // X.InterfaceC56268M6m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C56265M6j r8) {
        /*
            r7 = this;
            com.bytedance.common.wschannel.model.WsChannelMsg r3 = r8.LIZ
            int r6 = r3.method
            r5 = 1
            if (r6 != r5) goto L12
            int r0 = r3.service
            if (r0 != r5) goto L14
            X.LVV r0 = r7.LIZ
            java.lang.Object r0 = r0.LIZ(r8)
            return r0
        L12:
            if (r6 != r5) goto L26
        L14:
            int r1 = r3.service
            r0 = 5
            if (r1 == r0) goto L1f
        L19:
            int r1 = r3.service
            r0 = 1015(0x3f7, float:1.422E-42)
            if (r1 != r0) goto L29
        L1f:
            X.M6m r0 = r7.LIZJ
            java.lang.Object r0 = r0.LIZ(r8)
            return r0
        L26:
            if (r6 != r5) goto L29
            goto L19
        L29:
            r4 = 6
            if (r6 != r5) goto L37
            int r0 = r3.service
            if (r0 != r4) goto L39
            X.M6h r0 = r7.LIZIZ
            java.lang.Object r0 = r0.LIZ(r8)
            return r0
        L37:
            if (r6 != r5) goto L45
        L39:
            int r1 = r3.service
            r0 = 7
            if (r1 != r0) goto L47
            X.LVb r0 = r7.LIZLLL
            java.lang.Object r0 = r0.LIZ(r8)
            return r0
        L45:
            if (r6 != r5) goto L54
        L47:
            int r1 = r3.service
            r0 = 1010(0x3f2, float:1.415E-42)
            if (r1 != r0) goto L56
            X.M6f r0 = r7.LJ
            java.lang.Object r0 = r0.LIZ(r8)
            return r0
        L54:
            if (r6 != r5) goto L63
        L56:
            int r1 = r3.service
            r0 = 20003(0x4e23, float:2.803E-41)
            if (r1 != r0) goto L63
            X.M6e r0 = r7.LJFF
            java.lang.Object r0 = r0.LIZ(r8)
            return r0
        L63:
            r0 = 2
            r2 = 0
            if (r6 != r0) goto L71
            int r0 = r3.service
            if (r0 != r4) goto L99
            X.M6l r0 = r7.LJI
            r0.getClass()
            return r2
        L71:
            if (r6 != r5) goto L86
            int r1 = r3.service
            r0 = 20164(0x4ec4, float:2.8256E-41)
            if (r1 == r0) goto L7f
        L79:
            int r1 = r3.service
            r0 = 20047(0x4e4f, float:2.8092E-41)
            if (r1 != r0) goto L8b
        L7f:
            X.M6d r0 = r7.LJII
            java.lang.Object r0 = r0.LIZ(r8)
            return r0
        L86:
            if (r6 != r5) goto L89
            goto L79
        L89:
            if (r6 != r5) goto L99
        L8b:
            int r1 = r3.service
            r0 = 50000(0xc350, float:7.0065E-41)
            if (r1 != r0) goto L99
            X.M6b r0 = r7.LJIIIIZZ
            java.lang.Object r0 = r0.LIZ(r8)
            return r0
        L99:
            android.util.SparseArray<X.M6m> r1 = r7.LJIIIZ
            int r0 = r3.service
            java.lang.Object r0 = r1.get(r0)
            X.M6m r0 = (X.InterfaceC56268M6m) r0
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r0.LIZ(r8)
            return r0
        Laa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56258M6c.LIZ(X.M6j):java.lang.Object");
    }
}
