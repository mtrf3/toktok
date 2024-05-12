package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aQu, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93440aQu {
    public final EnumC93441aQv LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C93440aQu)) {
            obj = null;
        }
        C93440aQu c93440aQu = (C93440aQu) obj;
        if (c93440aQu == null || this.LIZ != c93440aQu.LIZ || this.LIZIZ != c93440aQu.LIZIZ) {
            return false;
        }
        return true;
    }

    public C93440aQu(int i, EnumC93441aQv viewType) {
        o.LJIIIZ(viewType, "viewType");
        this.LIZ = viewType;
        this.LIZIZ = i;
    }
}
