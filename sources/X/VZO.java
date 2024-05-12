package X;

import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VZO implements OWR {
    public final /* synthetic */ BaseLynxViewPager LIZ;
    public final /* synthetic */ int LIZIZ;

    @Override // X.OWR
    public final void LIZ(String tag) {
        o.LJIIJ(tag, "tag");
        VZM LJIL = this.LIZ.LJIL();
        int i = this.LIZIZ;
        LJIL.getClass();
        List<String> list = LJIL.LJLLI;
        if (LJIL.LJLIL != null) {
            i--;
        }
        ListProtector.set(list, i, tag);
        LJIL.LJLJJLL.notifyDataSetChanged();
        LJIL.LJI();
    }

    public VZO(BaseLynxViewPager baseLynxViewPager, int i) {
        this.LIZ = baseLynxViewPager;
        this.LIZIZ = i;
    }
}
