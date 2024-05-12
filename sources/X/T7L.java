package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T7L extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final T7H LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public T7L(String str, int i, T7H bottomSheetActionEnum) {
        o.LJIIIZ(bottomSheetActionEnum, "bottomSheetActionEnum");
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = bottomSheetActionEnum;
    }
}
