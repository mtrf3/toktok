package X;

import java.io.Serializable;

/* renamed from: X.PpE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65624PpE implements Serializable {
    public final AbstractC65611Pp1<?, ?> LJLIL;

    public Object readResolve() {
        return this.LJLIL.keys();
    }

    public C65624PpE(AbstractC65611Pp1<?, ?> abstractC65611Pp1) {
        this.LJLIL = abstractC65611Pp1;
    }
}
