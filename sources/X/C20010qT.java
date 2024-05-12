package X;

import java.util.Deque;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0qT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20010qT {
    public Object LIZ;
    public Object LIZIZ;
    public Object LIZJ;

    public final void LIZ() {
        ((Deque) this.LIZ).clear();
        ((java.util.Map) this.LIZIZ).clear();
        this.LIZJ = null;
    }

    public /* synthetic */ C20010qT() {
    }

    public final void LIZIZ(PID pid) {
        if (this.LIZJ == null) {
            this.LIZJ = pid;
        } else if (!((Deque) this.LIZ).isEmpty()) {
            String LIZIZ = ((PIO) ((Deque) this.LIZ).peek()).LIZIZ();
            pid.LIZLLL = LIZIZ;
            PIO pio = (PIO) ((java.util.Map) this.LIZIZ).get(LIZIZ);
            if (pio != null) {
                pid.LJ = pio.LIZIZ();
            }
            ((java.util.Map) this.LIZIZ).put(LIZIZ, pid);
        } else {
            pid.LJ = ((PIO) this.LIZJ).LIZIZ();
        }
        ((Deque) this.LIZ).push(pid);
    }

    public /* synthetic */ C20010qT(String merchantId, List productIdList, String productType) {
        o.LJIIIZ(merchantId, "merchantId");
        o.LJIIIZ(productIdList, "productIdList");
        o.LJIIIZ(productType, "productType");
        this.LIZ = merchantId;
        this.LIZJ = productIdList;
        this.LIZIZ = productType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20010qT(java.lang.String r2, java.util.List r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 1
            if (r0 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r0 = r4 & 2
            if (r0 == 0) goto Lc
            X.OQg r3 = X.C61878OQg.INSTANCE
        Lc:
            r0 = r4 & 4
            if (r0 == 0) goto L16
            java.lang.String r0 = "inapp"
        L12:
            r1.<init>(r2, r3, r0)
            return
        L16:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20010qT.<init>(java.lang.String, java.util.List, int):void");
    }
}
