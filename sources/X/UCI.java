package X;

import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.keva.Keva;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UCI implements InterfaceC73592SuS, InterfaceC250809sq, InterfaceC48038ItG, U4B, O0Z {
    public static final UCI LJLIL = new UCI();
    public static final UCI LJLILLLLZI = new UCI();

    @Override // X.InterfaceC250809sq
    public void LIZIZ(ViewGroup viewGroup) {
    }

    @Override // X.InterfaceC250809sq
    public void LIZLLL(ViewGroup viewGroup) {
    }

    @Override // X.O0Z
    public void onComplete() {
    }

    @Override // X.InterfaceC250809sq
    public Keva LIZ() {
        Keva repo = Keva.getRepo("Customer Mock");
        o.LJIIIIZZ(repo, "getRepo(\"Customer Mock\")");
        return repo;
    }

    @Override // X.U4B
    public void LIZJ(MultiGuestReserveResponse.ResponseData responseData) {
        C73495Sst c73495Sst = C75027TcV.LIZJ;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        return C76800UCe.LIZ;
    }

    @Override // X.U4B
    public void onFailed(Throwable th) {
        C73495Sst c73495Sst = C75027TcV.LIZJ;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        CJ5 event = (CJ5) obj;
        o.LJIIIZ(event, "event");
        if (event.LIZ != null) {
            return true;
        }
        return false;
    }

    public static final Float LJFF(Object obj, java.util.Map map) {
        Object obj2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (o.LJ(((Map.Entry) obj2).getValue(), obj)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }

    public static final C82632Wbs LJI(C82622Wbi inject, Class cls, String str) {
        o.LJIIJ(inject, "$this$inject");
        AbstractC82626Wbm LJIIIZ = inject.LJIIIZ(str, cls);
        if (LJIIIZ != null) {
            return new C82632Wbs(LJIIIZ);
        }
        throw new UCJ(C16880lQ.LLLZ("Dependency not registered %s", new Object[]{new C83683Qe(str, cls).LIZ()}));
    }

    public static final C82631Wbr LJII(C82622Wbi injectOrNull, Class cls, String str) {
        o.LJIIJ(injectOrNull, "$this$injectOrNull");
        return new C82631Wbr(injectOrNull.LJIIIZ(str, cls));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        if (r13 < ((java.lang.Number) r16.invoke(java.lang.Float.valueOf(r3), java.lang.Float.valueOf(r2))).floatValue()) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        if (r13 > ((java.lang.Number) r16.invoke(java.lang.Float.valueOf(r2), java.lang.Float.valueOf(r3))).floatValue()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float LJ(float r13, float r14, java.util.Set r15, X.InterfaceC88471Ynr r16, float r17, float r18) {
        /*
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r15.iterator()
        L9:
            boolean r0 = r8.hasNext()
            r4 = 1
            r6 = 0
            r11 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            if (r0 == 0) goto L2c
            java.lang.Object r5 = r8.next()
            r0 = r5
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            double r3 = (double) r0
            double r1 = (double) r13
            double r1 = r1 + r11
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L9
            r7.add(r5)
            goto L9
        L2c:
            java.lang.Float r7 = X.ORZ.LLI(r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r15.iterator()
        L39:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r8 = r10.next()
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            double r2 = (double) r0
            double r0 = (double) r13
            double r0 = r0 - r11
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 < 0) goto L39
            r9.add(r8)
            goto L39
        L55:
            java.lang.Float r1 = X.ORZ.LLIIII(r9)
            if (r7 != 0) goto Lcb
            java.util.List r1 = X.C47261Igj.LJJIJIIJIL(r1)
        L5f:
            int r0 = r1.size()
            if (r0 == 0) goto Lc9
            if (r0 == r4) goto Lbf
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r6)
            java.lang.Number r0 = (java.lang.Number) r0
            float r3 = r0.floatValue()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r4)
            java.lang.Number r0 = (java.lang.Number) r0
            float r2 = r0.floatValue()
            int r0 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            r4 = r16
            r1 = r18
            if (r0 > 0) goto L89
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 < 0) goto La7
            r3 = r2
        L88:
            return r3
        L89:
            float r0 = -r1
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 > 0) goto L8f
            goto L88
        L8f:
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            java.lang.Object r0 = r4.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lbd
        La5:
            r14 = r2
            goto Lc9
        La7:
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            java.lang.Object r0 = r4.invoke(r1, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto La5
        Lbd:
            r14 = r3
            goto Lc9
        Lbf:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r6)
            java.lang.Number r0 = (java.lang.Number) r0
            float r14 = r0.floatValue()
        Lc9:
            r3 = r14
            goto L88
        Lcb:
            if (r1 != 0) goto Ld2
            java.util.List r1 = X.C47261Igj.LJJIJ(r7)
            goto L5f
        Ld2:
            boolean r0 = kotlin.jvm.internal.o.LIZLLL(r7, r1)
            if (r0 == 0) goto Ldd
            java.util.List r1 = X.C47261Igj.LJJIJ(r7)
            goto L5f
        Ldd:
            r0 = 2
            java.lang.Float[] r0 = new java.lang.Float[r0]
            r0[r6] = r7
            r0[r4] = r1
            java.util.List r1 = X.C47261Igj.LJJIJIIJI(r0)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UCI.LJ(float, float, java.util.Set, X.Ynr, float, float):float");
    }
}
