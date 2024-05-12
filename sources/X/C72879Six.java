package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Six, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72879Six extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    public C72879Six() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public /* synthetic */ C72879Six(int i) {
        this("", false, false);
    }

    public C72879Six(String text, boolean z, boolean z2) {
        o.LJIIIZ(text, "text");
        this.LJLIL = text;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    public static C72879Six L(C72879Six c72879Six, String text, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            text = c72879Six.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c72879Six.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z2 = c72879Six.LJLJI;
        }
        c72879Six.getClass();
        o.LJIIIZ(text, "text");
        return new C72879Six(text, z, z2);
    }
}
