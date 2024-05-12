package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RTm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69606RTm extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    public C69606RTm(String questionId, boolean z, int i) {
        o.LJIIIZ(questionId, "questionId");
        this.LJLIL = questionId;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }
}
