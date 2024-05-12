package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MZE implements MZI {
    public final /* synthetic */ C57010MZa LIZ;

    @Override // X.MZI
    public final void LIZJ() {
    }

    @Override // X.MZI
    public final String LIZ() {
        return C1DD.LIZLLL(R.string.ceh, "AppContextManager.getApp…ng.business_account_name)");
    }

    @Override // X.MZI
    public final String LIZIZ() {
        return C57018MZi.LIZ();
    }

    public MZE(C57010MZa c57010MZa) {
        this.LIZ = c57010MZa;
    }

    @Override // X.MZI
    public final RecyclerView.ViewHolder LIZLLL(ViewGroup viewGroup) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.sw, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new MV9(view, this.LIZ.LIZ());
    }

    @Override // X.MZI
    public final List<BaseNotice> LJFF(List<BaseNotice> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "list");
        for (BaseNotice baseNotice : list) {
            if (baseNotice.businessAccountNotice != null) {
                LJ.add(baseNotice);
            } else if (baseNotice.templateNotice != null) {
                LJ.add(baseNotice);
            }
        }
        return LJ;
    }

    @Override // X.MZI
    public final void LJ(RecyclerView.ViewHolder holder, BaseNotice baseNotice, int i, HashMap<String, BaseNotice> readNoticeMap, boolean z) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(readNoticeMap, "readNoticeMap");
        if (holder instanceof MV9) {
            ((MV9) holder).M(baseNotice);
        }
    }
}
