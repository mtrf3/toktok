package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;

/* renamed from: X.Pwr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66097Pwr {
    public final IX8 LIZ;

    public C66097Pwr(IX8 ix8) {
        this.LIZ = ix8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r3.LIZIZ();
        r2 = r12.LIZ;
        r10 = r8.LIZJ.getPath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        r1 = ((java.util.ArrayList) r2.LIZ).size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r9 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (((X.InterfaceC37635Epr) com.bytedance.mt.protector.impl.collections.ListProtector.get((java.util.ArrayList) r2.LIZ, r9)).LIZ(r10) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        r0 = (X.InterfaceC66095Pwp) com.bytedance.mt.protector.impl.collections.ListProtector.get((java.util.ArrayList) r2.LIZIZ, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        r3.LIZJ = 404;
        r3.LIZLLL = "Not found";
        r3.LJ = X.AbstractC38911fr.LJIILIIL("No handler found\n", "text/plain");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
    
        if (r0.LIZ(r4, r8, r3) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
    
        r3.LIZJ = com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        r3.LIZLLL = "Internal Server Error";
        r0 = new java.io.StringWriter();
        r1 = new java.io.PrintWriter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010a, code lost:
    
        r2.printStackTrace(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
    
        r1.close();
        r3.LJ = X.AbstractC38911fr.LJIILIIL(r0.toString(), "text/plain");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ab, code lost:
    
        monitor-exit(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C66096Pwq r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66097Pwr.LIZ(X.Pwq):void");
    }

    public static void LIZIZ(C66104Pwy c66104Pwy, C66107Px1 c66107Px1) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HTTP/1.1 ");
        LIZ.append(c66104Pwy.LIZJ);
        LIZ.append(" ");
        LIZ.append(c66104Pwy.LIZLLL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        int length = LIZIZ.length();
        for (int i = 0; i < length; i++) {
            c66107Px1.LIZ.write(LIZIZ.charAt(i));
        }
        c66107Px1.LIZ.write(C66107Px1.LIZIZ);
        int size = c66104Pwy.LIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            String LJ = a1.LJ((String) ListProtector.get(c66104Pwy.LIZ, i2), ": ", (String) ListProtector.get(c66104Pwy.LIZIZ, i2));
            int length2 = LJ.length();
            for (int i3 = 0; i3 < length2; i3++) {
                c66107Px1.LIZ.write(LJ.charAt(i3));
            }
            c66107Px1.LIZ.write(C66107Px1.LIZIZ);
        }
        c66107Px1.LIZ.write(C66107Px1.LIZIZ);
        c66107Px1.LIZ.flush();
    }
}
