package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AYv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26429AYv extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;

    public C26429AYv() {
        this(0, 3);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C26429AYv(int i, int i2) {
        String title;
        i = (i2 & 1) != 0 ? 0 : i;
        if ((i2 & 2) != 0) {
            title = "";
        } else {
            title = null;
        }
        o.LJIIIZ(title, "title");
        this.LJLIL = i;
        this.LJLILLLLZI = title;
    }
}
