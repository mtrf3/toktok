package X;

import X.InterfaceC80653En;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LmL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55253LmL<T extends InterfaceC80653En> implements InterfaceC55251LmJ<T> {
    public final C73849Syb<T> LIZ;
    public final List<InterfaceC92693kP> LIZIZ;

    @Override // X.InterfaceC55251LmJ
    public final void destroy() {
        Iterator<InterfaceC92693kP> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
    }

    @Override // X.InterfaceC55251LmJ
    public final T getSource() {
        T LJJZZIII = this.LIZ.LJJZZIII();
        o.LJI(LJJZZIII);
        return LJJZZIII;
    }

    public C55253LmL(T initialSource) {
        o.LJIIIZ(initialSource, "initialSource");
        C73849Syb<T> LJJZZI = C73849Syb.LJJZZI(initialSource);
        this.LIZ = LJJZZI;
        new C73426Srm(LJJZZI);
        this.LIZIZ = new ArrayList();
    }

    @Override // X.InterfaceC55251LmJ
    public final void LIZ(InterfaceC88472Yns<? super T, ? extends T> interfaceC88472Yns) {
        this.LIZ.onNext(interfaceC88472Yns.invoke(getSource()));
    }
}
