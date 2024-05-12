package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jni, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50242Jni extends AbstractC214518bP<Boolean> {
    public final /* synthetic */ C50241Jnh LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50242Jni(Object obj, C50241Jnh c50241Jnh) {
        super(obj);
        this.LIZIZ = c50241Jnh;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, Boolean bool, Boolean bool2) {
        o.LJIIIZ(property, "property");
        boolean booleanValue = bool2.booleanValue();
        if (bool.booleanValue() != booleanValue) {
            if (booleanValue) {
                this.LIZIZ.LJLILLLLZI.LIZIZ();
            } else {
                this.LIZIZ.LJLILLLLZI.LIZ();
            }
        }
    }
}
