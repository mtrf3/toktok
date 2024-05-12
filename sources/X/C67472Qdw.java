package X;

import android.content.Context;

/* renamed from: X.Qdw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67472Qdw extends AbstractC67473Qdx {
    public final Context LIZ;
    public final InterfaceC67370QcI LIZIZ;
    public final InterfaceC67370QcI LIZJ;
    public final String LIZLLL;

    public final int hashCode() {
        return ((((((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode()) * 1000003) ^ this.LIZJ.hashCode()) * 1000003) ^ this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreationContext{applicationContext=");
        LIZ.append(this.LIZ);
        LIZ.append(", wallClock=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", monotonicClock=");
        LIZ.append(this.LIZJ);
        LIZ.append(", backendName=");
        return JBR.LJFF(LIZ, this.LIZLLL, "}", LIZ);
    }

    @Override // X.AbstractC67473Qdx
    public final Context LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC67473Qdx
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC67473Qdx
    public final InterfaceC67370QcI LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC67473Qdx
    public final InterfaceC67370QcI LIZLLL() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67473Qdx)) {
            return false;
        }
        AbstractC67473Qdx abstractC67473Qdx = (AbstractC67473Qdx) obj;
        if (this.LIZ.equals(abstractC67473Qdx.LIZ()) && this.LIZIZ.equals(abstractC67473Qdx.LIZLLL()) && this.LIZJ.equals(abstractC67473Qdx.LIZJ()) && this.LIZLLL.equals(abstractC67473Qdx.LIZIZ())) {
            return true;
        }
        return false;
    }

    public C67472Qdw(Context context, InterfaceC67370QcI interfaceC67370QcI, InterfaceC67370QcI interfaceC67370QcI2, String str) {
        if (context != null) {
            this.LIZ = context;
            if (interfaceC67370QcI != null) {
                this.LIZIZ = interfaceC67370QcI;
                if (interfaceC67370QcI2 != null) {
                    this.LIZJ = interfaceC67370QcI2;
                    if (str != null) {
                        this.LIZLLL = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }
}
