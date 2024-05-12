package X;

import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K4X implements InterfaceC51344KDc {
    public final /* synthetic */ AbstractSearchIntermediateFragmentNew LIZ;

    public K4X(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew) {
        this.LIZ = abstractSearchIntermediateFragmentNew;
    }

    @Override // X.InterfaceC51344KDc
    public final void LIZ() {
        String str;
        AbstractC029409q adapter = this.LIZ.xl().getAdapter();
        if ((adapter instanceof C51323KCh) && (str = ((C51323KCh) adapter).LJLL) != null) {
            AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew = this.LIZ;
            K4H LIZ = K4S.LIZ(str);
            String Gl = abstractSearchIntermediateFragmentNew.Gl();
            LIZ.getClass();
            LIZ.LJI = Gl;
            String Hl = abstractSearchIntermediateFragmentNew.Hl();
            if (Hl == null) {
                Hl = abstractSearchIntermediateFragmentNew.Gl();
            }
            LIZ.LJIIIIZZ = Hl;
            LIZ.LJII = C50605JtZ.LJFF(abstractSearchIntermediateFragmentNew.LJLLL);
            LIZ.LIZ();
            if (o.LJ(str, abstractSearchIntermediateFragmentNew.LJLL)) {
                C40438Fty.LJFF();
            }
        }
    }
}
