package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MZB implements MZI {
    public final /* synthetic */ MZA LIZ;

    @Override // X.MZI
    public final void LIZJ() {
    }

    @Override // X.MZI
    public final List<BaseNotice> LJFF(List<BaseNotice> list) {
        o.LJIIIZ(list, "list");
        return list;
    }

    @Override // X.MZI
    public final String LIZ() {
        return this.LIZ.LIZIZ;
    }

    @Override // X.MZI
    public final String LIZIZ() {
        return C57018MZi.LIZ();
    }

    public MZB(MZA mza) {
        this.LIZ = mza;
    }

    @Override // X.MZI
    public final RecyclerView.ViewHolder LIZLLL(ViewGroup viewGroup) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.tf, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        MVZ mvz = new MVZ(view, new AqS175S0100000_9(this.LIZ, 572));
        mvz.LJLLILLLL = this.LIZ.LIZ();
        return mvz;
    }

    @Override // X.MZI
    public final void LJ(RecyclerView.ViewHolder holder, BaseNotice baseNotice, int i, HashMap<String, BaseNotice> readNoticeMap, boolean z) {
        boolean z2;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(readNoticeMap, "readNoticeMap");
        if ((baseNotice instanceof MusNotice) && (holder instanceof MVZ)) {
            MVZ mvz = (MVZ) holder;
            MZA mza = this.LIZ;
            String str = mza.LIZJ;
            String str2 = mza.LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            if (mza.LJ == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            MVZ.M(mvz, (MusNotice) baseNotice, i, "", str, str2, z2, MZR.LIZ(baseNotice.type), false, false, this.LIZ.LJ, 384);
        }
    }
}
