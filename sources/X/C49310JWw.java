package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JWw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49310JWw extends JSR {
    public final C62822Ol8 LJLILLLLZI;

    @Override // X.JSR
    public final void LJFF() {
        C49314JXa.LIZJ.LIZ((InterfaceC49318JXe) this.LJLILLLLZI.getValue());
    }

    @Override // X.JSR
    public final void LJI() {
        C49314JXa c49314JXa = C49314JXa.LIZJ;
        Object eventListener = this.LJLILLLLZI.getValue();
        c49314JXa.getClass();
        o.LJIIIZ(eventListener, "eventListener");
        Iterator<WeakReference<InterfaceC49318JXe<?>>> it = c49314JXa.LIZJ().iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC49318JXe<?>> next = it.next();
            if (eventListener == next.get() || next.get() == null) {
                it.remove();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49310JWw(JTS bulletContext) {
        super(bulletContext);
        o.LJIIIZ(bulletContext, "bulletContext");
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS158S0100000_8(bulletContext, 672));
    }
}
