package X;

import X.InterfaceC94376ag0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ahX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractC94471ahX<T extends InterfaceC94376ag0> implements InterfaceC94376ag0 {
    public boolean LIZ;
    public List<Object> LIZIZ;

    public abstract C94220adU LJFF();

    public abstract String LJI();

    public abstract List<C94291aed> LJII();

    public abstract boolean LJIIIIZZ();

    public abstract boolean LJIIIZ();

    public abstract boolean LJIIJ();

    public abstract boolean LJIIJJI();

    public abstract void LJIIL(boolean z);

    public abstract void LJIILIIL(boolean z);

    @Override // X.InterfaceC93998aZu
    public final List<InterfaceC93998aZu> LIZIZ() {
        List<Object> list = this.LIZIZ;
        if (list != null) {
            return C65777Prh.LIZIZ(list);
        }
        return null;
    }

    @Override // X.InterfaceC93998aZu
    public final boolean LIZLLL() {
        List<Object> list = this.LIZIZ;
        if (list != null && ((ArrayList) list).size() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC93998aZu
    public final boolean LJJJLZIJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC93998aZu
    public final void LIZJ(boolean z) {
        this.LIZ = z;
    }
}
