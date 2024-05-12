package X;

import X.C94389agD;
import X.InterfaceC94376ag0;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.alT, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public abstract class AbstractC94715alT<D extends InterfaceC94376ag0, VH extends C94389agD> extends AbstractC94514aiE<D, VH> {
    public abstract boolean LLF(int i, int i2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC94715alT(List<? extends D> data) {
        super(ORZ.LLJILJILJ(data));
        o.LJIIIZ(data, "data");
    }

    public final void LLFF(boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < this.LJLIL.size(); i2++) {
            i++;
        }
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                int size = this.LJLIL.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (!((InterfaceC93998aZu) ListProtector.get(this.LJLIL, i4)).LJJJLZIJ() && ((InterfaceC93998aZu) ListProtector.get(this.LJLIL, i4)).LIZLLL()) {
                        List<InterfaceC93998aZu> LIZIZ = ((InterfaceC93998aZu) ListProtector.get(this.LJLIL, i4)).LIZIZ();
                        if (LIZIZ != null) {
                            List LIZIZ2 = C65777Prh.LIZIZ(LIZIZ);
                            if (!((InterfaceC93998aZu) ListProtector.get(this.LJLIL, i4)).LJJJLZIJ()) {
                                this.LJLIL.addAll(i4 + 1, LIZIZ2);
                                LIZIZ2.size();
                                ((InterfaceC93998aZu) ListProtector.get(this.LJLIL, i4)).LIZJ(true);
                            }
                            if (z) {
                                notifyDataSetChanged();
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<D>");
                        }
                    }
                }
                if (i3 != i) {
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final List<D> LLFFF(int i) {
        if (i >= this.LJLIL.size() || i < 0) {
            return null;
        }
        InterfaceC93998aZu interfaceC93998aZu = (InterfaceC93998aZu) ListProtector.get(this.LJLIL, i);
        if (!interfaceC93998aZu.LIZLLL()) {
            return null;
        }
        List<InterfaceC93998aZu> LIZIZ = interfaceC93998aZu.LIZIZ();
        if (LIZIZ != null) {
            return C65777Prh.LIZIZ(LIZIZ);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<D>");
    }
}
