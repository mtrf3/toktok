package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TWj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74777TWj extends F9E {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;

    public C74777TWj() {
        this(false, "", -1);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, Integer.valueOf(this.LJLJI)};
    }

    public C74777TWj(boolean z, String prompt, int i) {
        o.LJIIIZ(prompt, "prompt");
        this.LJLIL = z;
        this.LJLILLLLZI = prompt;
        this.LJLJI = i;
    }
}
