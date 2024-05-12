package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.JvW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50726JvW implements InterfaceC50310Joo {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50726JvW) && o.LJ(this.LIZ, ((C50726JvW) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordClearAction(query=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C50726JvW(String str) {
        this.LIZ = str;
    }
}
