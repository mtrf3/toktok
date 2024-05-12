package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uiq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77968Uiq extends RecyclerView.ViewHolder {
    public final C29825BnB LJLIL;
    public final C29825BnB LJLILLLLZI;
    public final C29825BnB LJLJI;

    public C77968Uiq(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.lrd);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.ttlive_rank_1)");
        this.LJLIL = (C29825BnB) findViewById;
        View findViewById2 = view.findViewById(R.id.lre);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.ttlive_rank_2)");
        this.LJLILLLLZI = (C29825BnB) findViewById2;
        View findViewById3 = view.findViewById(R.id.lrf);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.ttlive_rank_3)");
        this.LJLJI = (C29825BnB) findViewById3;
    }

    public final void L(C77980Uj2 topItem, boolean z, DataChannel dataChannel, CZ9 itemEventListener) {
        o.LJIIIZ(topItem, "topItem");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(itemEventListener, "itemEventListener");
        Iterator<RankListV2Response.RankInfo> it = topItem.LIZ.iterator();
        while (it.hasNext()) {
            itemEventListener.LIZ(it.next());
        }
        List<RankListV2Response.RankInfo> list = topItem.LIZ;
        this.LJLIL.setBackground(C15380j0.LJI(R.drawable.ctg));
        this.LJLILLLLZI.setBackground(C15380j0.LJI(R.drawable.cth));
        this.LJLJI.setBackground(C15380j0.LJI(R.drawable.cti));
        this.LJLIL.LIZIZ(new C29826BnC(topItem.LIZIZ.LIZIZ.rankName, dataChannel, (RankListV2Response.RankInfo) ListProtector.get(list, 0), true, new C77974Uiw(itemEventListener), z, topItem.LIZIZ.LJ));
        this.LJLILLLLZI.LIZIZ(new C29826BnC(topItem.LIZIZ.LIZIZ.rankName, dataChannel, (RankListV2Response.RankInfo) ListProtector.get(list, 1), false, new C77975Uix(itemEventListener), z, topItem.LIZIZ.LJ));
        this.LJLJI.LIZIZ(new C29826BnC(topItem.LIZIZ.LIZIZ.rankName, dataChannel, (RankListV2Response.RankInfo) ListProtector.get(list, 2), false, new C77976Uiy(itemEventListener), z, topItem.LIZIZ.LJ));
    }
}
