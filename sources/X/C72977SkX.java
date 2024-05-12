package X;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.SkX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72977SkX<T> {
    public static final /* synthetic */ int LIZJ = 0;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C72978SkY.LJLIL);
    public T LIZIZ;

    public final void LIZ() {
        Iterator it = ((AbstractSequentialList) this.LIZ.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC88472Yns) it.next()).invoke(this.LIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C72977SkX(Object obj) {
        LIZIZ(obj);
    }

    public final void LIZIZ(T t) {
        if (o.LJ(this.LIZIZ, t)) {
            return;
        }
        this.LIZIZ = t;
        Iterator it = ((AbstractSequentialList) this.LIZ.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC88472Yns) it.next()).invoke(t);
        }
    }
}
