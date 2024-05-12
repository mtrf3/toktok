package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0n8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17940n8 {
    public EnumC17880n2 LIZ;
    public C17900n4 LIZIZ;
    public C17930n7 LIZJ;
    public String LIZLLL;

    public final void LIZ(String newPath) {
        o.LJIIIZ(newPath, "newPath");
        if (this.LIZJ == null) {
            this.LIZJ = new C17930n7(newPath);
            return;
        }
        C17930n7 c17930n7 = new C17930n7(newPath);
        C17930n7 c17930n72 = this.LIZJ;
        while (c17930n72 != null) {
            if (c17930n72.LIZIZ != null) {
                C17930n7 c17930n73 = this.LIZJ;
                if (c17930n73 == null) {
                    return;
                } else {
                    c17930n72 = c17930n73.LIZIZ;
                }
            } else {
                if (c17930n72 == null) {
                    return;
                }
                c17930n72.LIZIZ = c17930n7;
                return;
            }
        }
    }
}
