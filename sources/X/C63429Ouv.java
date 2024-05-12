package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ouv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63429Ouv extends AbstractC63432Ouy {
    public final C63426Ous LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C63429Ouv) && o.LJ(this.LIZ, ((C63429Ouv) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnWsMessageReceived(newMsgNotifyBufferItem=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C63429Ouv(C63426Ous c63426Ous) {
        this.LIZ = c63426Ous;
    }
}
