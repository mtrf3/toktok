package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC35801aq<T> implements InterfaceC24420xa<T> {
    public final T LIZ;
    public final List<T> LIZIZ = new ArrayList();
    public T LIZJ;

    @Override // X.InterfaceC24420xa
    public /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC24420xa
    public final /* synthetic */ void LJFF() {
    }

    public abstract void LJIIIZ();

    @Override // X.InterfaceC24420xa
    public final void LJIIIIZZ() {
        if (!this.LIZIZ.isEmpty()) {
            this.LIZJ = (T) ListProtector.remove(this.LIZIZ, ((ArrayList) r1).size() - 1);
        } else {
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // X.InterfaceC24420xa
    public final void clear() {
        ((ArrayList) this.LIZIZ).clear();
        this.LIZJ = this.LIZ;
        LJIIIZ();
    }

    @Override // X.InterfaceC24420xa
    public final T LIZ() {
        return this.LIZJ;
    }

    public AbstractC35801aq(T t) {
        this.LIZ = t;
        this.LIZJ = t;
    }

    @Override // X.InterfaceC24420xa
    public final void LIZLLL(T t) {
        ((ArrayList) this.LIZIZ).add(this.LIZJ);
        this.LIZJ = t;
    }
}
