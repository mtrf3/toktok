package X;

import Y.IDrS45S0100000_5;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.Badge;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public final class CDS extends CDI {
    public final ViewGroup LJLIL;
    public final GetSubPrivilegeDetailResponse.Data LJLILLLLZI;
    public final SubscriptionPrivilegeDetailFragment LJLJI;
    public final C47121t6 LJLJJI;
    public final C47121t6 LJLJJL;
    public final RecyclerView LJLJJLL;
    public final CDT LJLJL;
    public final IDrS45S0100000_5 LJLJLJ;

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        Iterable arrayList;
        Badge badge;
        o.LJIIIZ(holder, "holder");
        GetSubPrivilegeDetailResponse.Data data = this.LJLILLLLZI;
        if (data != null && (badge = data.badge) != null && badge.badgeType == 0) {
            C47121t6 c47121t6 = this.LJLJJI;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.ogj));
            }
            C47121t6 c47121t62 = this.LJLJJL;
            if (c47121t62 != null) {
                c47121t62.setText(C15380j0.LJIILJJIL(R.string.ogh));
            }
        } else {
            C47121t6 c47121t63 = this.LJLJJI;
            if (c47121t63 != null) {
                c47121t63.setText(C15380j0.LJIILJJIL(R.string.ogi));
            }
            C47121t6 c47121t64 = this.LJLJJL;
            if (c47121t64 != null) {
                c47121t64.setText(C15380j0.LJIILJJIL(R.string.ogg));
            }
        }
        RecyclerView recyclerView = this.LJLJJLL;
        if (recyclerView != null) {
            Context context = this.LJLIL.getContext();
            o.LJIIIIZZ(context, "parent.context");
            recyclerView.setLayoutManager(new C30964CDg(context));
        }
        RecyclerView recyclerView2 = this.LJLJJLL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LJLJL);
        }
        RecyclerView recyclerView3 = this.LJLJJLL;
        if (recyclerView3 != null) {
            recyclerView3.LJJLL(this.LJLJLJ);
        }
        RecyclerView recyclerView4 = this.LJLJJLL;
        if (recyclerView4 != null) {
            recyclerView4.LJIIJJI(this.LJLJLJ);
        }
        CDT cdt = this.LJLJL;
        GetSubPrivilegeDetailResponse.Data data2 = this.LJLILLLLZI;
        if (data2 == null || (arrayList = data2.allLevels) == null) {
            arrayList = new ArrayList();
        }
        cdt.getClass();
        ((ArrayList) cdt.LJLIL).clear();
        ORS.LJJLIIIJILLIZJL(arrayList, cdt.LJLIL);
        cdt.notifyDataSetChanged();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CDS(android.view.ViewGroup r4, webcast.api.sub.GetSubPrivilegeDetailResponse.Data r5, com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = X.C16880lQ.LLZIL(r0)
            r1 = 2131564066(0x7f0d1622, float:1.8753607E38)
            r0 = 0
            android.view.View r1 = X.C16880lQ.LLLLIILL(r2, r1, r4, r0)
            java.lang.String r0 = "from(parent.context).inf…dge, parent, false,\n    )"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.<init>(r1)
            r3.LJLIL = r4
            r3.LJLILLLLZI = r5
            r3.LJLJI = r6
            android.view.View r1 = r3.itemView
            r0 = 2131379781(0x7f0a4645, float:1.8379832E38)
            android.view.View r0 = r1.findViewById(r0)
            X.1t6 r0 = (X.C47121t6) r0
            r3.LJLJJI = r0
            android.view.View r1 = r3.itemView
            r0 = 2131379021(0x7f0a434d, float:1.837829E38)
            android.view.View r0 = r1.findViewById(r0)
            X.1t6 r0 = (X.C47121t6) r0
            r3.LJLJJL = r0
            android.view.View r1 = r3.itemView
            r0 = 2131363027(0x7f0a04d3, float:1.8345851E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r3.LJLJJLL = r0
            X.CDT r0 = new X.CDT
            r0.<init>()
            r3.LJLJL = r0
            Y.IDrS45S0100000_5 r1 = new Y.IDrS45S0100000_5
            r0 = 6
            r1.<init>(r3, r0)
            r3.LJLJLJ = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CDS.<init>(android.view.ViewGroup, webcast.api.sub.GetSubPrivilegeDetailResponse$Data, com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment):void");
    }
}
