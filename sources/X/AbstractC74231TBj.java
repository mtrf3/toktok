package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TBj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74231TBj extends AbstractC74233TBl implements InterfaceC74236TBo {
    public abstract /* synthetic */ InterfaceC39094FVy getGetter();

    @Override // X.AbstractC74233TBl
    public InterfaceC74236TBo getReflected() {
        return (InterfaceC74236TBo) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // X.InterfaceC74236TBo
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // X.InterfaceC74236TBo
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC74234TBm compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("property ");
        LIZ.append(getName());
        LIZ.append(" (Kotlin reflection is not available)");
        return X1D.LIZIZ(LIZ);
    }

    public AbstractC74231TBj() {
    }

    public AbstractC74231TBj(Object obj) {
        super(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC74231TBj) {
            AbstractC74233TBl abstractC74233TBl = (AbstractC74233TBl) obj;
            if (getOwner().equals(abstractC74233TBl.getOwner()) && getName().equals(abstractC74233TBl.getName()) && getSignature().equals(abstractC74233TBl.getSignature()) && o.LJ(getBoundReceiver(), abstractC74233TBl.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC74236TBo)) {
            return false;
        }
        return obj.equals(compute());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC74231TBj(java.lang.Object r3, java.lang.Class r4, java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r1 = 1
            r0 = r7 & 1
            if (r0 != r1) goto La
            r7 = 1
        L6:
            r2.<init>(r3, r4, r5, r6, r7)
            return
        La:
            r7 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC74231TBj.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }
}
