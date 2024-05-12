package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes9.dex */
public final class JVT extends AbstractC028509h {
    public final int LJ = 1;
    public final /* synthetic */ JVP LJFF;

    public JVT(JVP jvp) {
        this.LJFF = jvp;
    }

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        GridLayoutManager gridLayoutManager;
        Integer valueOf = Integer.valueOf(this.LJFF.LLF(this.LJFF.getBasicItemViewType(i)));
        if (valueOf.intValue() > 0 || 0 != 0) {
            return valueOf.intValue();
        }
        List<T> list = this.LJFF.mmItems;
        if (list != 0 && C49152JQu.LIZIZ.contains(Integer.valueOf(((AbstractC49325JXl) ListProtector.get(list, i)).getFeedType()))) {
            return this.LJ;
        }
        C0A2 layoutManager = this.LJFF.LJLIL.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            return gridLayoutManager.LLIIIL;
        }
        return LFH.LIZIZ.LIZLLL().LJIIL().LJJIL();
    }
}
