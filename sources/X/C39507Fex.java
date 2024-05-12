package X;

import android.util.LruCache;
import com.bytedance.pumbaa.hybrid.impl.jsb.BridgeHookDispatcher;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Fex, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39507Fex {
    public final LruCache<String, C39489Fef> LIZ;
    public final CopyOnWriteArrayList<String> LIZIZ;
    public final BridgeHookDispatcher LIZJ;

    public C39507Fex(BridgeHookDispatcher dispatcher) {
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZJ = dispatcher;
        this.LIZ = new LruCache<>(100);
        this.LIZIZ = new CopyOnWriteArrayList<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0175, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0177, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0178, code lost:
    
        r11 = X.C141335gf.LIZ(r7);
        X.C3C5.m7constructorimpl(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00ef, code lost:
    
        r23 = X.C38386F4s.LJFF(r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f9, code lost:
    
        if (r16 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00fb, code lost:
    
        r0 = (java.util.List) r16.getThird();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x011d, code lost:
    
        return new X.C39489Fef(null, r5, null, false, r6, r23, r3, r14, r9, r5, r4, r1, r30, r31, "H5", r0, 262341);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0121, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0123, code lost:
    
        r31 = r6.getClass().getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x012d, code lost:
    
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0131, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0134, code lost:
    
        r30 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0138, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x013b, code lost:
    
        r1 = r7.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x013d, code lost:
    
        if (r1 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x013f, code lost:
    
        r1 = X.C38386F4s.LIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0143, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0147, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r16 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r1.length() != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        if (r6 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007f, code lost:
    
        if (X.C64409PPp.LIZIZ == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
    
        r1 = X.C16880lQ.LJLLILLLL(X.C68222m2.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
    
        r6 = r7.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008b, code lost:
    
        if (r6 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
    
        r31 = X.C16880lQ.LJLLILLLL(r6.getClass());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        if (r31 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r14 = r7.LJLILLLLZI;
        r9 = (java.lang.String) com.bytedance.mt.protector.impl.collections.ListProtector.get(r33, 0);
        r6 = (java.lang.String) X.ORZ.LLFF(ujb.s.LJLJJL((java.lang.CharSequence) com.bytedance.mt.protector.impl.collections.ListProtector.get(r33, 0), new java.lang.String[]{"/"}, 0, 6));
        r5 = (java.lang.String) com.bytedance.mt.protector.impl.collections.ListProtector.get(r33, 1);
        r4 = (java.lang.String) com.bytedance.mt.protector.impl.collections.ListProtector.get(r33, 2);
        r13 = X.C39524FfE.LIZIZ(r4);
        r15 = r13.LJLIL.iterator();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d5, code lost:
    
        if (r15.hasNext() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e1, code lost:
    
        if (r15.next().LJLIL != X.EnumC39525FfF.STRING) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011e, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
    
        if (r13.LJLILLLLZI.LJLIL != X.EnumC39525FfF.VOID) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
    
        if (r11 != (-1)) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015f, code lost:
    
        r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r34, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0165, code lost:
    
        if ((r8 instanceof java.lang.String) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0167, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0168, code lost:
    
        r8 = (java.lang.String) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016a, code lost:
    
        if (r8 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        r11 = new org.json.JSONObject(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0171, code lost:
    
        X.C3C5.m7constructorimpl(r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C39489Fef LIZ(java.lang.Object r32, java.util.List r33, java.util.List r34) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39507Fex.LIZ(java.lang.Object, java.util.List, java.util.List):X.Fef");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 6
            int r2 = ujb.s.LJJLIIJ(r7, r8, r0)
            if (r2 <= 0) goto L9b
            int r1 = ujb.s.LJJLIIJ(r7, r9, r0)
            if (r1 <= 0) goto L9b
            int r0 = r8.length()
            int r0 = r0 + r2
            java.lang.String r1 = r7.substring(r0, r1)
            java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r5 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L27
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L2a
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L2a
            goto L32
        L27:
            r0 = move-exception
            r4 = r5
            goto L2b
        L2a:
            r0 = move-exception
        L2b:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L32:
            java.lang.Throwable r2 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r2 == 0) goto L54
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "parseCallback failed: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", stack: "
            r1.append(r0)
            r0 = 0
            java.lang.String r0 = X.C38386F4s.LIZJ(r2, r0)
            r1.append(r0)
            X.X1D.LIZIZ(r1)
        L54:
            if (r4 == 0) goto L9b
            java.lang.String r0 = "__callback_id"
            java.lang.String r1 = r4.optString(r0)
            if (r1 == 0) goto L9b
            android.util.LruCache<java.lang.String, X.Fef> r0 = r6.LIZ
            java.lang.Object r3 = r0.get(r1)
            X.Fef r3 = (X.C39489Fef) r3
            if (r3 == 0) goto L9b
            boolean r0 = r3.LJLJJI
            if (r0 == 0) goto L9b
            r0 = 524223(0x7ffbf, float:7.34593E-40)
            X.Fef r2 = X.C39489Fef.L(r3, r4, r5, r0)
            com.bytedance.pumbaa.hybrid.impl.jsb.BridgeHookDispatcher r0 = r6.LIZJ
            java.util.List r0 = r0.getChain()
            java.util.Iterator r1 = r0.iterator()
        L7d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r1.next()
            X.Ff7 r0 = (X.InterfaceC39517Ff7) r0
            r0.LIZIZ(r2)
            goto L7d
        L8d:
            android.util.LruCache<java.lang.String, X.Fef> r1 = r6.LIZ
            java.lang.String r0 = r3.LJLIL
            r1.remove(r0)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r1 = r6.LIZIZ
            java.lang.String r0 = r3.LJLIL
            r1.remove(r0)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39507Fex.LIZIZ(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
