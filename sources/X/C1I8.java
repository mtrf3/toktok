package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1I8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1I8 extends F9E {
    public final InterfaceC07760Se LJLIL;
    public final InterfaceC88472Yns<C23490w5, C23490w5> LJLILLLLZI;
    public final C1J4<C23490w5> LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Boolean.valueOf(this.LJLJJI)};
    }

    public C1I8(C1J4 animationSpec, InterfaceC07760Se alignment, InterfaceC88472Yns size, boolean z) {
        o.LJIIIZ(alignment, "alignment");
        o.LJIIIZ(size, "size");
        o.LJIIIZ(animationSpec, "animationSpec");
        this.LJLIL = alignment;
        this.LJLILLLLZI = size;
        this.LJLJI = animationSpec;
        this.LJLJJI = z;
    }
}
