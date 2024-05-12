package X;

import X.AEC;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class AG6<T extends AEC> implements AG8 {
    public T LJLIL;
    public C72808Sho<InterfaceC57784Mm4> LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(AG7.LJLIL);

    public abstract T LJIIIIZZ();

    public void LJIIIZ(boolean z) {
    }

    @Override // X.AG8
    public void onViewDetachedFromWindow() {
    }

    public final T LJFF() {
        T t = this.LJLIL;
        if (t != null) {
            return t;
        }
        o.LJIJI("item");
        throw null;
    }

    public T LJI() {
        T LJIIIIZZ = LJIIIIZZ();
        o.LJIIIZ(LJIIIIZZ, "<set-?>");
        this.LJLIL = LJIIIIZZ;
        LJFF().LJLJJI = this;
        return LJFF();
    }

    public final void LJIIJ(InterfaceC88472Yns<? super T, ? extends T> onUpdateItem) {
        o.LJIIIZ(onUpdateItem, "onUpdateItem");
        ReentrantLock reentrantLock = (ReentrantLock) this.LJLJI.getValue();
        reentrantLock.lock();
        try {
            C72808Sho<InterfaceC57784Mm4> c72808Sho = this.LJLILLLLZI;
            if (c72808Sho != null) {
                int LJIIIZ = c72808Sho.LJIIIZ(LJFF());
                if (LJIIIZ == -1) {
                    return;
                }
                String str = LJFF().LJLJI;
                T invoke = onUpdateItem.invoke(LJFF());
                o.LJIIIZ(invoke, "<set-?>");
                this.LJLIL = invoke;
                T LJFF = LJFF();
                o.LJIIIZ(str, "<set-?>");
                LJFF.LJLJI = str;
                this.LJLIL = LJFF();
                LJFF().LJLJJI = this;
                C72808Sho<InterfaceC57784Mm4> c72808Sho2 = this.LJLILLLLZI;
                if (c72808Sho2 != null) {
                    c72808Sho2.LJIILL(LJIIIZ, LJFF());
                    return;
                } else {
                    o.LJIJI("state");
                    throw null;
                }
            }
            o.LJIJI("state");
            throw null;
        } finally {
            reentrantLock.unlock();
        }
    }
}
