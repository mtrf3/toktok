package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.MOy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56748MOy implements InterfaceC56881MUb {
    public final /* synthetic */ C56743MOt LIZ;

    @Override // X.InterfaceC56881MUb
    public final void LIZ() {
        C56743MOt c56743MOt = this.LIZ;
        if (c56743MOt.LJLLLL) {
            int indexOf = c56743MOt.getData().indexOf(c56743MOt.LJZ);
            if (indexOf != -1) {
                c56743MOt.LJLLLL = false;
                c56743MOt.LJLZ = false;
                List<MusNotice> list = c56743MOt.LJLLJ;
                if (list != null) {
                    c56743MOt.getData().addAll(indexOf, list);
                    c56743MOt.notifyItemRangeInserted(indexOf, ((ArrayList) list).size());
                }
            }
            c56743MOt.LJLLLL = false;
        }
        int indexOf2 = c56743MOt.getData().indexOf(c56743MOt.LJZ);
        if (indexOf2 != -1) {
            int size = c56743MOt.getData().size();
            List LLJILJILJ = ORZ.LLJILJILJ(c56743MOt.getData().subList(0, indexOf2));
            c56743MOt.getData().clear();
            c56743MOt.getData().addAll(LLJILJILJ);
            c56743MOt.notifyItemRangeRemoved(indexOf2, size - c56743MOt.getData().size());
            c56743MOt.LJZI(c56743MOt.getData());
            MRG mrg = c56743MOt.LJZI;
            if (mrg != null) {
                c56743MOt.getData();
                mrg.Wd();
            }
        }
    }

    @Override // X.InterfaceC56881MUb
    public final MSP LIZIZ() {
        return this.LIZ.LJLLI;
    }

    @Override // X.InterfaceC56881MUb
    public final InterfaceC56771MPv LIZJ() {
        return this.LIZ.LLD();
    }

    @Override // X.InterfaceC56881MUb
    public final List<MusNotice> getData() {
        List<MusNotice> LLJI;
        Collection collection = this.LIZ.mmItems;
        if (collection == null || (LLJI = ORZ.LLJI(collection)) == null) {
            return C61878OQg.INSTANCE;
        }
        return LLJI;
    }

    @Override // X.InterfaceC56881MUb
    public final Fragment getFragment() {
        return this.LIZ.LJLIL;
    }

    public C56748MOy(C56743MOt c56743MOt) {
        this.LIZ = c56743MOt;
    }

    @Override // X.InterfaceC56881MUb
    public final void LIZLLL(int i) {
        this.LIZ.onDeleteItem(i);
    }
}
