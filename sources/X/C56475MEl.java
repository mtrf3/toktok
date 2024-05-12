package X;

import Y.AObjectS13S0001000_9;
import Y.AObjectS8S0001000_1;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MEl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56475MEl implements InterfaceC197607pE {
    public final /* synthetic */ AwemeListFragmentImpl LIZ;

    @Override // X.InterfaceC197607pE
    public final void LIZ() {
    }

    @Override // X.InterfaceC197607pE
    public final void LIZIZ(String str) {
    }

    @Override // X.InterfaceC197607pE
    public final void LIZLLL(int i, String str) {
    }

    @Override // X.InterfaceC197607pE
    public final void LJ(Aweme aweme) {
    }

    @Override // X.InterfaceC197607pE
    public final void LJFF(Aweme aweme) {
    }

    public C56475MEl(AwemeListFragmentImpl awemeListFragmentImpl) {
        this.LIZ = awemeListFragmentImpl;
    }

    @Override // X.InterfaceC197607pE
    public final void LIZJ(Aweme aweme, String str) {
        AwemeListFragmentImpl awemeListFragmentImpl = this.LIZ;
        if (awemeListFragmentImpl.LJZL == null) {
            return;
        }
        List list = awemeListFragmentImpl.LJZ.mmItems;
        if (list == null) {
            list = new ArrayList();
            this.LIZ.LJZ.setData(list);
            this.LIZ.LL.setVisibility(4);
            AwemeListFragmentImpl awemeListFragmentImpl2 = this.LIZ;
            awemeListFragmentImpl2.LLILLIZIL = 0;
            MFC mfc = awemeListFragmentImpl2.LLF;
            if (mfc != null) {
                mfc.LIZ(awemeListFragmentImpl2.LJLL);
            }
        }
        C200037t9 c200037t9 = C200037t9.LIZIZ;
        int LIZIZ = c200037t9.LIZIZ(list, new AObjectS13S0001000_9(0, 1));
        if (LIZIZ < 0) {
            c200037t9.LJ(aweme, aweme);
            int LJIILLIIL = C55693LtR.LJIILLIIL(list);
            ListProtector.add(list, LJIILLIIL, aweme);
            C56473MEj c56473MEj = this.LIZ.LJZ;
            c56473MEj.notifyItemInserted(c56473MEj.LLF() + LJIILLIIL);
        } else {
            c200037t9.LJ((Aweme) ListProtector.get(list, LIZIZ), aweme);
            C56473MEj c56473MEj2 = this.LIZ.LJZ;
            c56473MEj2.notifyItemChanged(c56473MEj2.LLF() + LIZIZ);
        }
        T t = this.LIZ.LJZL.LJLIL;
        if (t == 0) {
            return;
        }
        List items = ((AbstractC51036K1g) t).getItems();
        if (items == null) {
            items = new ArrayList();
            ((AbstractC51036K1g) this.LIZ.LJZL.LJLIL).setItems(items);
        }
        int LIZIZ2 = c200037t9.LIZIZ(items, new AObjectS8S0001000_1(1, 1));
        if (LIZIZ2 < 0) {
            C55693LtR.LJIJJ(aweme, items);
        } else {
            c200037t9.LJ((Aweme) ListProtector.get(items, LIZIZ2), aweme);
        }
    }
}
