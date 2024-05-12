package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1P7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P7 extends AbstractC09380Yk {
    public final InterfaceC07750Sd LIZIZ;

    public C1P7(InterfaceC07750Sd vertical) {
        o.LJIIIZ(vertical, "vertical");
        this.LIZIZ = vertical;
    }

    @Override // X.AbstractC09380Yk
    public final int LIZ(int i, EnumC23500w6 layoutDirection, AbstractC39201gK abstractC39201gK) {
        o.LJIIIZ(layoutDirection, "layoutDirection");
        return this.LIZIZ.LIZ(0, i);
    }
}
