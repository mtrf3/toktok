package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OP3 {
    public final String LIZ;
    public boolean LIZIZ;

    public OP3() {
        this(null, 3);
    }

    public OP3(String name, int i) {
        name = (i & 1) != 0 ? "" : name;
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = false;
    }
}
