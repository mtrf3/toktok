package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2oT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69732oT {
    public static final C69732oT LIZ = new C69732oT();
    public static final ConcurrentHashMap<String, C33R<InterfaceC69762oW>> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C69802oa LIZJ(java.lang.String r4) {
        /*
            java.lang.String r0 = "itemId"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.33R<X.2oW>> r3 = X.C69732oT.LIZIZ
            java.lang.Object r0 = r3.get(r4)
            X.33R r0 = (X.C33R) r0
            r2 = 0
            if (r0 == 0) goto L22
            java.lang.Object r1 = r0.getValue()
            X.2oW r1 = (X.InterfaceC69762oW) r1
        L16:
            boolean r0 = r1 instanceof X.C69782oY
            if (r0 == 0) goto L1d
            r3.remove(r4)
        L1d:
            boolean r0 = r1 instanceof X.C69772oX
            if (r0 != 0) goto L24
            return r2
        L22:
            r1 = r2
            goto L16
        L24:
            X.2oX r1 = (X.C69772oX) r1
            X.2oa r1 = r1.LIZ
            boolean r0 = X.C69802oa.LIZ(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L33
            r2 = r1
            if (r1 != 0) goto L36
        L33:
            r3.remove(r4)
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69732oT.LIZJ(java.lang.String):X.2oa");
    }

    public static C79863Bm LJ(String str) {
        C33R<InterfaceC69762oW> c33r = LIZIZ.get(str);
        if (c33r != null) {
            return V1M.LIZLLL(c33r);
        }
        return null;
    }

    public static boolean LJFF(String str) {
        InterfaceC69762oW interfaceC69762oW;
        C79863Bm LJ = LJ(str);
        if (LJ != null) {
            interfaceC69762oW = (InterfaceC69762oW) LJ.getValue();
        } else {
            interfaceC69762oW = null;
        }
        if ((interfaceC69762oW instanceof C69772oX) && !C69802oa.LIZ(((C69772oX) interfaceC69762oW).LIZ)) {
            return true;
        }
        return false;
    }

    public static void LJI(String str) {
        C33R<InterfaceC69762oW> c33r = LIZIZ.get(str);
        if (c33r == null) {
            return;
        }
        c33r.setValue(C69782oY.LIZ);
    }

    public static Object LIZIZ(String str, InterfaceC67352kd interfaceC67352kd) {
        return LIZ.LIZ(str, C78613UtF.LIZJ, interfaceC67352kd);
    }

    public static C69802oa LJII(String str, AwemeStatusBean awemeStatusBean, Aweme aweme) {
        VideoMaskInfo contentClassificationMaskInfo;
        String str2 = null;
        if (awemeStatusBean == null) {
            LJI(str);
            return null;
        }
        if (aweme != null && (contentClassificationMaskInfo = aweme.getContentClassificationMaskInfo()) != null && o.LJ(contentClassificationMaskInfo.getShowMask(), Boolean.TRUE)) {
            awemeStatusBean.setStatus(Integer.valueOf(CastIntegerProtector.parseInt("1027")));
            VideoMaskInfo contentClassificationMaskInfo2 = aweme.getContentClassificationMaskInfo();
            if (contentClassificationMaskInfo2 != null) {
                str2 = contentClassificationMaskInfo2.getTitle();
            }
            awemeStatusBean.setStatusText(str2);
        }
        AwemeService.LIZ().R1(aweme);
        ConcurrentHashMap<String, C33R<InterfaceC69762oW>> concurrentHashMap = LIZIZ;
        C33R<InterfaceC69762oW> c33r = concurrentHashMap.get(str);
        if (c33r == null) {
            concurrentHashMap.put(str, V8H.LIZ(new C69772oX(new C69802oa(awemeStatusBean, aweme))));
        } else {
            c33r.setValue(new C69772oX(new C69802oa(awemeStatusBean, aweme)));
        }
        return LIZJ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r9, X.XKW r10, X.InterfaceC67352kd<? super X.C69802oa> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C69752oV
            if (r0 == 0) goto L74
            r3 = r11
            X.2oV r3 = (X.C69752oV) r3
            int r2 = r3.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r3.LJLJJI = r2
        L12:
            java.lang.Object r1 = r3.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJI
            r5 = 2
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L25
            if (r0 == r7) goto L82
            if (r0 != r5) goto L7a
            X.C141335gf.LIZJ(r1)
        L24:
            return r1
        L25:
            X.C141335gf.LIZJ(r1)
            X.3Bm r6 = LJ(r9)
            if (r6 == 0) goto L45
            java.lang.Object r1 = r6.getValue()
            X.2oW r1 = (X.InterfaceC69762oW) r1
        L34:
            boolean r0 = r1 instanceof X.C69772oX
            if (r0 == 0) goto L47
            X.2oX r1 = (X.C69772oX) r1
            X.2oa r0 = r1.LIZ
            boolean r0 = X.C69802oa.LIZ(r0)
            if (r0 != 0) goto L5b
            X.2oa r0 = r1.LIZ
            return r0
        L45:
            r1 = r2
            goto L34
        L47:
            boolean r0 = r1 instanceof X.C69712oR
            if (r0 == 0) goto L5b
            X.2o7 r0 = new X.2o7
            r0.<init>(r2)
            r3.LJLIL = r9
            r3.LJLJJI = r7
            java.lang.Object r1 = X.V1M.LJIILJJIL(r6, r0, r3)
            if (r1 != r4) goto L85
            return r4
        L5b:
            X.315 r1 = kotlinx.coroutines.CoroutineExceptionHandler.LJJJJIZL
            X.2o8 r0 = new X.2o8
            r0.<init>(r1, r9)
            X.MBA r1 = r10.plus(r0)
            X.2oQ r0 = new X.2oQ
            r0.<init>(r9, r2)
            r3.LJLJJI = r5
            java.lang.Object r1 = X.XKX.LJI(r1, r0, r3)
            if (r1 != r4) goto L24
            return r4
        L74:
            X.2oV r3 = new X.2oV
            r3.<init>(r8, r11)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L82:
            X.C141335gf.LIZJ(r1)
        L85:
            X.2oW r1 = (X.InterfaceC69762oW) r1
            boolean r0 = r1 instanceof X.C69772oX
            if (r0 == 0) goto L90
            X.2oX r1 = (X.C69772oX) r1
            X.2oa r0 = r1.LIZ
            return r0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69732oT.LIZ(java.lang.String, X.XKW, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.List<java.lang.String> r12, int r13, X.XKW r14, X.InterfaceC67352kd<? super X.C69722oS> r15) {
        /*
            r11 = this;
            r6 = r13
            boolean r0 = r15 instanceof X.C69742oU
            if (r0 == 0) goto La8
            r3 = r15
            X.2oU r3 = (X.C69742oU) r3
            int r2 = r3.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La8
            int r2 = r2 - r1
            r3.LJLJJLL = r2
        L13:
            java.lang.Object r4 = r3.LJLJJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJLL
            r1 = 1
            if (r0 == 0) goto L55
            if (r0 != r1) goto Ld3
            int r6 = r3.LJLJI
            java.lang.Object r8 = r3.LJLILLLLZI
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r12 = r3.LJLIL
            java.util.List r12 = (java.util.List) r12
            X.C141335gf.LIZJ(r4)
        L2b:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 != r1) goto Laf
            java.util.Iterator r2 = r8.iterator()
        L3b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lcd
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            X.2oa r0 = LIZJ(r1)
            if (r0 != 0) goto L51
            r3.add(r1)
            goto L3b
        L51:
            r4.put(r1, r0)
            goto L3b
        L55:
            java.util.ArrayList r7 = X.C1JX.LJFF(r4)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.Iterator r5 = r12.iterator()
        L64:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r4 = r5.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.33R<X.2oW>> r0 = X.C69732oT.LIZIZ
            java.lang.Object r0 = r0.get(r4)
            X.33R r0 = (X.C33R) r0
            if (r0 == 0) goto L90
            java.lang.Object r0 = r0.getValue()
        L7e:
            boolean r0 = r0 instanceof X.C69712oR
            if (r0 == 0) goto L86
            r7.add(r4)
            goto L64
        L86:
            boolean r0 = LJFF(r4)
            if (r0 != 0) goto L64
            r8.add(r4)
            goto L64
        L90:
            r0 = 0
            goto L7e
        L92:
            X.2o4 r5 = new X.2o4
            r10 = 0
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r3.LJLIL = r12
            r3.LJLILLLLZI = r8
            r3.LJLJI = r6
            r3.LJLJJLL = r1
            java.lang.Object r0 = X.XKX.LJI(r9, r5, r3)
            if (r0 != r2) goto L2b
            return r2
        La8:
            X.2oU r3 = new X.2oU
            r3.<init>(r11, r15)
            goto L13
        Laf:
            java.util.Iterator r2 = r12.iterator()
        Lb3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lcd
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            X.2oa r0 = LIZJ(r1)
            if (r0 != 0) goto Lc9
            r3.add(r1)
            goto Lb3
        Lc9:
            r4.put(r1, r0)
            goto Lb3
        Lcd:
            X.2oS r0 = new X.2oS
            r0.<init>(r4, r3)
            return r0
        Ld3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69732oT.LIZLLL(java.util.List, int, X.XKW, X.2kd):java.lang.Object");
    }
}
