package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TBk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74232TBk extends AbstractC74233TBl implements InterfaceC65778Pri, InterfaceC74235TBn {
    public final int arity;
    public final int flags;

    @Override // X.AbstractC74233TBl
    public InterfaceC74234TBm computeReflected() {
        C65352Pkq.LIZ.getClass();
        return this;
    }

    @Override // X.AbstractC74233TBl
    public InterfaceC74235TBn getReflected() {
        return (InterfaceC74235TBn) super.getReflected();
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // X.InterfaceC74235TBn
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // X.InterfaceC74235TBn
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // X.InterfaceC74235TBn
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // X.InterfaceC74235TBn
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm, X.InterfaceC74235TBn
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC74234TBm compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("function ");
        LIZ.append(getName());
        LIZ.append(" (Kotlin reflection is not available)");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC65778Pri
    public int getArity() {
        return this.arity;
    }

    public C74232TBk(int i) {
        this(i, AbstractC74233TBl.NO_RECEIVER, null, null, null, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C74232TBk) {
            C74232TBk c74232TBk = (C74232TBk) obj;
            if (getName().equals(c74232TBk.getName()) && getSignature().equals(c74232TBk.getSignature()) && this.flags == c74232TBk.flags && this.arity == c74232TBk.arity && o.LJ(getBoundReceiver(), c74232TBk.getBoundReceiver()) && o.LJ(getOwner(), c74232TBk.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC74235TBn)) {
            return false;
        }
        return obj.equals(compute());
    }

    public C74232TBk(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C74232TBk(int r8, java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r7 = this;
            r1 = r13 & 1
            r0 = 1
            if (r1 != r0) goto L15
            r6 = 1
        L6:
            r2 = r9
            r1 = r7
            r3 = r10
            r5 = r12
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r1.arity = r8
            int r0 = r13 >> 1
            r1.flags = r0
            return
        L15:
            r6 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74232TBk.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }
}
