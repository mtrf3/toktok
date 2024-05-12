package X;

import android.content.Context;
import android.util.Base64;
import com.lynx.canvas.loader.CanvasResourceResolver;
import com.lynx.tasm.core.JSProxy;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import defpackage.i0;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ExecutorService;

/* loaded from: classes15.dex */
public final class VU8 {
    public final ExecutorService LIZ = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("/AssetsLoader"));
    public Context LIZIZ;

    public static String LIZLLL(String str, long j) {
        if (str == null) {
            return null;
        }
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("redirectUrl from url: ");
                LIZ.append(str);
                O5Y.LJJJ("AssetsLoader", X1D.LIZIZ(LIZ));
                str = JSProxy.LJFF(j, str);
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("redirectUrl exception: ");
                LIZ2.append(e.toString());
                O5Y.LJIILIIL("AssetsLoader", X1D.LIZIZ(LIZ2));
            }
            return str;
        } finally {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("redirectUrl to url: ");
            LIZ3.append(str);
            O5Y.LJJJ("AssetsLoader", X1D.LIZIZ(LIZ3));
        }
    }

    public static void LIZ(CanvasResourceResolver canvasResourceResolver, String str, boolean z) {
        int indexOf = str.indexOf("base64,");
        if (!str.startsWith("data:") || indexOf == -1) {
            LJ(canvasResourceResolver, "invalid data url!", z);
        }
        byte[] decode = Base64.decode(str.substring(indexOf + 7), 0);
        if (z) {
            canvasResourceResolver.LJFF(decode.length);
            canvasResourceResolver.LIZLLL(decode, decode.length);
            canvasResourceResolver.LJ(null, true);
            return;
        }
        canvasResourceResolver.LIZJ(decode, decode.length);
    }

    public static void LIZIZ(CanvasResourceResolver canvasResourceResolver, String str, boolean z) {
        if (!str.startsWith("/")) {
            str = i0.LJFF("/", str);
        }
        LIZJ(new FileInputStream(new File(str)), canvasResourceResolver, z, 0);
    }

    public static void LJ(CanvasResourceResolver canvasResourceResolver, String str, boolean z) {
        if (z) {
            canvasResourceResolver.LJ(str, false);
        } else {
            canvasResourceResolver.LIZ(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        r0 = r11.read(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r0 == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r0 <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r12.LIZLLL(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        r12.LJ(null, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        r10 = new byte[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        r1 = r11.read(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r1 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        r0 = new byte[r1];
        java.lang.System.arraycopy(r7, 0, r0, 0, r1);
        r4 = new byte[][]{r10, r0};
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r1 = r1 + r4[r2].length;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r2 >= 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r10 = new byte[r1];
        r3 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        r1 = r4[r3];
        r0 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r0 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        if (r3 >= 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
    
        java.lang.System.arraycopy(r1, 0, r10, r2, r0);
        r2 = r2 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        r12.LIZJ(r10, r10.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0036, code lost:
    
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0039, code lost:
    
        if (r2 > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r14 > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r13 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        r0 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        r7 = new byte[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r12.LJFF(r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.io.InputStream r11, com.lynx.canvas.loader.CanvasResourceResolver r12, boolean r13, int r14) {
        /*
            int r2 = r11.available()
            if (r2 > 0) goto L38
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "no length from stream, responseContentLength = "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "AssetsLoader"
            X.O5Y.LJJJ(r0, r1)
            if (r14 <= 0) goto L38
        L1d:
            if (r13 == 0) goto L36
        L1f:
            r0 = 1024(0x400, float:1.435E-42)
        L21:
            byte[] r7 = new byte[r0]
            r6 = 1
            r5 = -1
            if (r13 == 0) goto L3c
            r12.LJFF(r14)
        L2a:
            int r0 = r11.read(r7)
            if (r0 == r5) goto L74
            if (r0 <= 0) goto L2a
            r12.LIZLLL(r7, r0)
            goto L2a
        L36:
            r0 = r14
            goto L21
        L38:
            r14 = r2
            if (r2 <= 0) goto L1f
            goto L1d
        L3c:
            r9 = 0
            byte[] r10 = new byte[r9]
        L3f:
            int r1 = r11.read(r7)
            if (r1 == r5) goto L6f
            byte[] r0 = new byte[r1]
            java.lang.System.arraycopy(r7, r9, r0, r9, r1)
            r8 = 2
            byte[][] r4 = new byte[r8]
            r4[r9] = r10
            r4[r6] = r0
            r2 = 0
            r1 = 0
        L53:
            r0 = r4[r2]
            int r0 = r0.length
            int r1 = r1 + r0
            int r2 = r2 + 1
            if (r2 >= r8) goto L5c
            goto L53
        L5c:
            byte[] r10 = new byte[r1]
            r3 = 0
            r2 = 0
        L60:
            r1 = r4[r3]
            int r0 = r1.length
            if (r0 != 0) goto L6a
        L65:
            int r3 = r3 + 1
            if (r3 >= r8) goto L3f
            goto L60
        L6a:
            java.lang.System.arraycopy(r1, r9, r10, r2, r0)
            int r2 = r2 + r0
            goto L65
        L6f:
            int r0 = r10.length
            r12.LIZJ(r10, r0)
            goto L78
        L74:
            r0 = 0
            r12.LJ(r0, r6)
        L78:
            r11.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VU8.LIZJ(java.io.InputStream, com.lynx.canvas.loader.CanvasResourceResolver, boolean, int):void");
    }
}
