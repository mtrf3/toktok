package X;

import Y.ARunnableS15S0301000_15;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YAC implements Runnable {
    public final /* synthetic */ YAB LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = true;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ List<SGH> LJLJJI;

    public YAC(YAB yab, int i, List list) {
        this.LJLIL = yab;
        this.LJLJI = i;
        this.LJLJJI = list;
    }

    public final void LIZ() {
        if (this.LJLIL.LJLIL.getParent() != null) {
            if (this.LJLILLLLZI) {
                this.LJLIL.LJLJJL = -1;
            }
            YAB yab = this.LJLIL;
            List<SGH> dataList = this.LJLJJI;
            yab.LJLJL = dataList;
            SGF sgf = yab.LJLJI;
            sgf.getClass();
            o.LJIIIZ(dataList, "dataList");
            sgf.LJLILLLLZI = dataList;
            sgf.notifyDataSetChanged();
            YAB yab2 = this.LJLIL;
            YAE yae = yab2.LJLJJI;
            yab2.LJLJJI = null;
            yab2.LJLIL.post(new ARunnableS15S0301000_15(this.LJLJI, yae, yab2, this.LJLJJI, 1));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
