package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1P5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P5 extends AbstractC09380Yk {
    public final InterfaceC07740Sc LIZIZ;

    public C1P5(InterfaceC07740Sc horizontal) {
        o.LJIIIZ(horizontal, "horizontal");
        this.LIZIZ = horizontal;
    }

    @Override // X.AbstractC09380Yk
    public final int LIZ(int i, EnumC23500w6 layoutDirection, AbstractC39201gK abstractC39201gK) {
        o.LJIIIZ(layoutDirection, "layoutDirection");
        return this.LIZIZ.LIZ(0, i, layoutDirection);
    }
}
