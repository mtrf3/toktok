package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.M2p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56167M2p<T> {
    public final String LIZ;
    public final T LIZIZ;
    public final List<String> LIZJ;
    public final boolean LIZLLL;
    public final List<String> LJ;
    public final boolean LJFF;
    public final InterfaceC88472Yns<List<? extends C56167M2p<?>>, C76800UCe> LJI;
    public final java.util.Map<String, Boolean> LJII;

    public C56167M2p() {
        this(null, null, null, false, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56167M2p)) {
            return false;
        }
        C56167M2p c56167M2p = (C56167M2p) obj;
        return o.LJ(this.LIZ, c56167M2p.LIZ) && o.LJ(this.LIZIZ, c56167M2p.LIZIZ) && o.LJ(this.LIZJ, c56167M2p.LIZJ) && this.LIZLLL == c56167M2p.LIZLLL && o.LJ(this.LJ, c56167M2p.LJ) && this.LJFF == c56167M2p.LJFF && o.LJ(this.LJI, c56167M2p.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() * 31;
        T t = this.LIZIZ;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZJ, (hashCode2 + hashCode) * 31, 31);
        boolean z = this.LIZLLL;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int LIZIZ2 = AnonymousClass391.LIZIZ(this.LJ, (LIZIZ + i3) * 31, 31);
        if (!this.LJFF) {
            i2 = 0;
        }
        int i4 = (LIZIZ2 + i2) * 31;
        InterfaceC88472Yns<List<? extends C56167M2p<?>>, C76800UCe> interfaceC88472Yns = this.LJI;
        if (interfaceC88472Yns != null) {
            i = interfaceC88472Yns.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TriggerMessage(key=");
        LIZ.append(this.LIZ);
        LIZ.append(", value=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", triggerKeys=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isAllowRepeat=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isIncompatibleKeys=");
        LIZ.append(this.LJ);
        LIZ.append(", isBaseTrigger=");
        LIZ.append(this.LJFF);
        LIZ.append(", triggerFun=");
        return C249109q6.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public static C56167M2p LIZ(C56167M2p c56167M2p) {
        String key = c56167M2p.LIZ;
        T t = c56167M2p.LIZIZ;
        List<String> triggerKeys = c56167M2p.LIZJ;
        boolean z = c56167M2p.LIZLLL;
        List<String> isIncompatibleKeys = c56167M2p.LJ;
        boolean z2 = c56167M2p.LJFF;
        InterfaceC88472Yns<List<? extends C56167M2p<?>>, C76800UCe> interfaceC88472Yns = c56167M2p.LJI;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(triggerKeys, "triggerKeys");
        o.LJIIIZ(isIncompatibleKeys, "isIncompatibleKeys");
        return new C56167M2p(key, t, triggerKeys, z, isIncompatibleKeys, z2, interfaceC88472Yns);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C56167M2p(java.lang.String r9, java.lang.Object r10, java.util.List r11, boolean r12, X.InterfaceC88472Yns r13, int r14) {
        /*
            r8 = this;
            r6 = r12
            r3 = r11
            r1 = r9
            r2 = r10
            r0 = r14 & 1
            if (r0 == 0) goto La
            java.lang.String r1 = ""
        La:
            r0 = r14 & 2
            r7 = 0
            if (r0 == 0) goto L10
            r2 = r7
        L10:
            r0 = r14 & 4
            if (r0 == 0) goto L16
            X.OQg r3 = X.C61878OQg.INSTANCE
        L16:
            r0 = r14 & 8
            if (r0 == 0) goto L33
            r4 = 1
        L1b:
            r0 = r14 & 16
            if (r0 == 0) goto L31
            X.OQg r5 = X.C61878OQg.INSTANCE
        L21:
            r0 = r14 & 32
            if (r0 == 0) goto L26
            r6 = 0
        L26:
            r0 = r14 & 64
            if (r0 == 0) goto L2f
        L2a:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L2f:
            r7 = r13
            goto L2a
        L31:
            r5 = r7
            goto L21
        L33:
            r4 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56167M2p.<init>(java.lang.String, java.lang.Object, java.util.List, boolean, X.Yns, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C56167M2p(String key, T t, List<String> triggerKeys, boolean z, List<String> isIncompatibleKeys, boolean z2, InterfaceC88472Yns<? super List<? extends C56167M2p<?>>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(triggerKeys, "triggerKeys");
        o.LJIIIZ(isIncompatibleKeys, "isIncompatibleKeys");
        this.LIZ = key;
        this.LIZIZ = t;
        this.LIZJ = triggerKeys;
        this.LIZLLL = z;
        this.LJ = isIncompatibleKeys;
        this.LJFF = z2;
        this.LJI = interfaceC88472Yns;
        this.LJII = new LinkedHashMap();
        Iterator<String> it = triggerKeys.iterator();
        while (it.hasNext()) {
            this.LJII.put(it.next(), Boolean.FALSE);
        }
    }
}
