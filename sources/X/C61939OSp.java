package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.OSp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61939OSp extends C56613MJt {
    public final C61938OSo LIZIZ;

    public C61939OSp(C61938OSo c61938OSo) {
        this.LIZIZ = c61938OSo;
    }

    @Override // X.C56613MJt, X.AbstractC56614MJu
    public final void LIZIZ(int i) {
        super.LIZIZ(i);
        if (i == 2) {
            KUR kur = this.LIZ;
            if (kur != null) {
                kur.setVisibility(8);
            }
            C61938OSo c61938OSo = this.LIZIZ;
            KUR kur2 = this.LIZ;
            if (kur2 == null) {
                c61938OSo.getClass();
                return;
            }
            Iterator<C61942OSs> it = c61938OSo.LJLJI.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (o.LJ(it.next().itemView, kur2)) {
                    if (i2 < 0 || i2 >= c61938OSo.LJLJI.size()) {
                        return;
                    }
                    Object remove = ListProtector.remove(c61938OSo.LJLJI, i2);
                    o.LJIIIIZZ(remove, "mFooterViewHolderList.removeAt(pos)");
                    C61942OSs c61942OSs = (C61942OSs) remove;
                    c61938OSo.LJLJJL.LJII(c61942OSs.LJLIL);
                    c61942OSs.setIsRecyclable(false);
                    c61938OSo.LJLJJLL.LIZIZ.addLast(Integer.valueOf(c61942OSs.LJLIL));
                    c61938OSo.notifyItemRemoved(i2);
                    return;
                }
                i2++;
            }
        }
    }
}
