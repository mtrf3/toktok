package X;

import X.C0M9;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.consumer.AnchorExtra;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.PxX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66139PxX extends AbstractC66136PxU {
    @Override // X.AbstractC66136PxU
    public final String LIZIZ() {
        return "floating_view";
    }

    @Override // X.AbstractC66136PxU
    public final boolean LJ() {
        return false;
    }

    @Override // X.AbstractC66136PxU
    public final boolean LIZJ(AnchorInfoModel model, Object obj) {
        java.util.Set<Object> floatingViewEvents;
        o.LJIIIZ(model, "model");
        o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
        if (model.resourcePages.contains(PQ0.LIZLLL())) {
            return true;
        }
        if (obj != null && (obj instanceof C66155Pxn) && obj != null) {
            Iterator it = ((C0M9.b) C66138PxW.LIZ.entrySet()).iterator();
            while (it.hasNext()) {
                Iterator<C66120PxE> it2 = ((InterfaceC66176Py8) ((Map.Entry) it.next()).getValue()).LIZ().iterator();
                while (it2.hasNext()) {
                    AnchorExtra anchorExtra = it2.next().LLII;
                    if (anchorExtra != null && (floatingViewEvents = anchorExtra.getFloatingViewEvents()) != null) {
                        for (Object obj2 : floatingViewEvents) {
                            if (obj2 != null) {
                                C66155Pxn c66155Pxn = (C66155Pxn) obj2;
                                C66155Pxn c66155Pxn2 = (C66155Pxn) obj;
                                if (c66155Pxn.LJLIL == c66155Pxn2.LJLIL && c66155Pxn.LJLILLLLZI == c66155Pxn2.LJLILLLLZI) {
                                    return true;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.helios.sdk.anchor.FloatingViewEvent");
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final String LJIIIIZZ(Object obj, String str) {
        if (obj != null && (obj instanceof C66155Pxn) && obj != null) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("key=", str, ",viewId=");
            C66155Pxn c66155Pxn = (C66155Pxn) obj;
            LIZIZ.append(c66155Pxn.LJLIL);
            LIZIZ.append(",hashCode=");
            LIZIZ.append(c66155Pxn.LJLILLLLZI);
            return X1D.LIZIZ(LIZIZ);
        }
        return str;
    }

    @Override // X.AbstractC66136PxU
    public final void LIZ(AnchorInfoModel anchorInfoModel, Object obj, String key) {
        o.LJIIIZ(key, "key");
        super.LIZ(anchorInfoModel, obj, LJIIIIZZ(obj, key));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0018, code lost:
    
        continue;
     */
    @Override // X.AbstractC66136PxU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C66120PxE> LIZLLL(java.util.List<X.C66120PxE> r9, com.bytedance.helios.api.config.AnchorInfoModel r10, java.lang.Object r11) {
        /*
            r8 = this;
            java.lang.String r0 = "model"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            if (r11 == 0) goto L75
            boolean r0 = r11 instanceof X.C66155Pxn
            if (r0 == 0) goto L75
            if (r11 == 0) goto L75
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r7 = r9.iterator()
        L18:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r6 = r7.next()
            r1 = r6
            X.PxE r1 = (X.C66120PxE) r1
            com.bytedance.helios.api.consumer.AnchorExtra r0 = r1.LLII
            if (r0 == 0) goto L6b
            java.util.Set r0 = r0.getFloatingViewEvents()
        L2d:
            if (r0 == 0) goto L35
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
        L35:
            com.bytedance.helios.api.consumer.AnchorExtra r0 = r1.LLII
            if (r0 == 0) goto L18
            java.util.Set r1 = r0.getHistoryFloatingViewEvents()
            if (r1 == 0) goto L18
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L46
            goto L18
        L46:
            java.util.Iterator r4 = r1.iterator()
        L4a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r3 = r4.next()
            if (r3 == 0) goto L6d
            X.Pxn r3 = (X.C66155Pxn) r3
            int r1 = r3.LJLIL
            r2 = r11
            X.Pxn r2 = (X.C66155Pxn) r2
            int r0 = r2.LJLIL
            if (r1 != r0) goto L4a
            int r1 = r3.LJLILLLLZI
            int r0 = r2.LJLILLLLZI
            if (r1 != r0) goto L4a
            r5.add(r6)
            goto L18
        L6b:
            r0 = 0
            goto L2d
        L6d:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.helios.sdk.anchor.FloatingViewEvent"
            r1.<init>(r0)
            throw r1
        L75:
            X.OQg r5 = X.C61878OQg.INSTANCE
        L77:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66139PxX.LIZLLL(java.util.List, com.bytedance.helios.api.config.AnchorInfoModel, java.lang.Object):java.util.List");
    }

    @Override // X.AbstractC66136PxU
    public final void LJI(String key, Object obj, String tag) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(tag, "tag");
        super.LJI(LJIIIIZZ(obj, key), obj, tag);
    }
}
