package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* renamed from: X.CDr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30975CDr extends CDI {
    public final ViewGroup LJLIL;
    public final GetSubPrivilegeDetailResponse.Data LJLILLLLZI;
    public final int LJLJI;
    public final RecyclerView LJLJJI;
    public final C30963CDf LJLJJL;

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        EmoteConfig emoteConfig;
        List<EmoteModel> list;
        EmoteListResult emoteListResult;
        List<EmoteModel> emoteList;
        o.LJIIIZ(holder, "holder");
        ArrayList arrayList = new ArrayList();
        GetSubPrivilegeDetailResponse.Data data = this.LJLILLLLZI;
        if (data != null && (emoteListResult = data.emoteDetail) != null && (emoteList = emoteListResult.getEmoteList()) != null) {
            arrayList.addAll(emoteList);
        }
        GetSubPrivilegeDetailResponse.Data data2 = this.LJLILLLLZI;
        if (data2 != null && (emoteConfig = data2.emoteConfig) != null && (list = emoteConfig.defaultEmoteList) != null) {
            arrayList.addAll(list);
        }
        RecyclerView recyclerView = this.LJLJJI;
        if (recyclerView != null) {
            this.LJLIL.getContext();
            recyclerView.setLayoutManager(new SSGridLayoutManager(this.LJLJI));
        }
        RecyclerView recyclerView2 = this.LJLJJI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LJLJJL);
        }
        RecyclerView recyclerView3 = this.LJLJJI;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
        }
        RecyclerView recyclerView4 = this.LJLJJI;
        if (recyclerView4 != null) {
            recyclerView4.setItemViewCacheSize(36);
        }
        C30963CDf c30963CDf = this.LJLJJL;
        c30963CDf.getClass();
        ((ArrayList) c30963CDf.LJLJJI).clear();
        ORS.LJJLIIIJILLIZJL(arrayList, c30963CDf.LJLJJI);
        c30963CDf.notifyDataSetChanged();
        RecyclerView recyclerView5 = this.LJLJJI;
        if (recyclerView5 != null) {
            recyclerView5.LJII(new C30976CDs(), -1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C30975CDr(android.view.ViewGroup r4, webcast.api.sub.GetSubPrivilegeDetailResponse.Data r5, com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = X.C16880lQ.LLZIL(r0)
            r1 = 2131564075(0x7f0d162b, float:1.8753625E38)
            r0 = 0
            android.view.View r1 = X.C16880lQ.LLLLIILL(r2, r1, r4, r0)
            java.lang.String r0 = "from(parent.context).inf…tes, parent, false,\n    )"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.<init>(r1)
            r3.LJLIL = r4
            r3.LJLILLLLZI = r5
            r2 = 6
            r3.LJLJI = r2
            android.view.View r1 = r3.itemView
            r0 = 2131366322(0x7f0a11b2, float:1.8352534E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r3.LJLJJI = r0
            int r1 = X.C15380j0.LJIIL()
            r0 = 1117913088(0x42a20000, float:81.0)
            int r0 = X.C15380j0.LIZ(r0)
            int r1 = r1 - r0
            int r1 = r1 / r2
            X.CDf r0 = new X.CDf
            r0.<init>(r4, r1, r6)
            r3.LJLJJL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30975CDr.<init>(android.view.ViewGroup, webcast.api.sub.GetSubPrivilegeDetailResponse$Data, com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment):void");
    }
}
