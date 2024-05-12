package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7AL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AL extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final java.util.Set<String> LJLJI;

    public C7AL() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C7AL(int i) {
        this(false, false, OQY.INSTANCE);
    }

    public C7AL(boolean z, boolean z2, java.util.Set<String> publishedEmojis) {
        o.LJIIIZ(publishedEmojis, "publishedEmojis");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = publishedEmojis;
    }

    public static C7AL L(C7AL c7al, boolean z, boolean z2, java.util.Set publishedEmojis, int i) {
        if ((i & 1) != 0) {
            z = c7al.LJLIL;
        }
        if ((i & 2) != 0) {
            z2 = c7al.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            publishedEmojis = c7al.LJLJI;
        }
        c7al.getClass();
        o.LJIIIZ(publishedEmojis, "publishedEmojis");
        return new C7AL(z, z2, publishedEmojis);
    }
}
