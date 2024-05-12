package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VvO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81294VvO extends AbstractC214518bP<Boolean> {
    public final /* synthetic */ C81293VvN LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81294VvO(Object obj, C81293VvN c81293VvN) {
        super(obj);
        this.LIZIZ = c81293VvN;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, Boolean bool, Boolean bool2) {
        o.LJIIIZ(property, "property");
        if (bool2.booleanValue() ^ bool.booleanValue()) {
            C81293VvN c81293VvN = this.LIZIZ;
            c81293VvN.getMScrollingChild().computeVerticalScrollExtent();
            this.LIZIZ.getMScrollingChild().computeVerticalScrollRange();
            c81293VvN.getClass();
        }
    }
}
