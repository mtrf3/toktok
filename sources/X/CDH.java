package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class CDH extends CDI {
    public final C47061t0 LJLIL;

    public CDH(ViewGroup viewGroup) {
        super(C1DI.LIZ(viewGroup, "parent", R.layout.dh9, viewGroup, false, "from(parent.context).inf… parent, false,\n        )"));
        this.LJLIL = (C47061t0) this.itemView.findViewById(R.id.ds8);
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        o.LJIIIZ(holder, "holder");
        C15490jB.LJ(this.LJLIL, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_sub_gift.webp");
    }
}
