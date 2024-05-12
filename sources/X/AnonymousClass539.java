package X;

import kotlin.jvm.internal.o;

/* renamed from: X.539, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass539 extends F9E {
    public final String LJLIL;
    public final AnonymousClass523 LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public AnonymousClass539(String oldFuncType, AnonymousClass523 newFunctionItem, boolean z) {
        o.LJIIIZ(oldFuncType, "oldFuncType");
        o.LJIIIZ(newFunctionItem, "newFunctionItem");
        this.LJLIL = oldFuncType;
        this.LJLILLLLZI = newFunctionItem;
        this.LJLJI = z;
    }
}
