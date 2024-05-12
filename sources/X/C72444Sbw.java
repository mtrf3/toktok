package X;

import com.ss.android.ugc.aweme.relation.fragment.muflist.MufEmptyCell;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Sbw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72444Sbw extends SIT {
    public final MufListPageViewModel LJLJJLL;

    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        LJIIIIZZ(MufUserCell.class);
        LJIIIIZZ(MufEmptyCell.class);
    }

    @Override // X.SIT
    public final AbstractC72278SYg<String> LJII() {
        return (AbstractC72278SYg) this.LJLJJLL.LJLJJL.getValue();
    }

    public final boolean LJIIJ() {
        if (((ArrayList) this.LJLJJL.LJII()).size() == 1 && (ORZ.LJLLJ(this.LJLJJL.LJII()) instanceof C72472ScO)) {
            return true;
        }
        return false;
    }

    public C72444Sbw(MufListPageViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLJJLL = viewModel;
    }
}
