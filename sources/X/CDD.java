package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public class CDD extends CDI {
    public final C28291B8l LJLIL;
    public final C28291B8l LJLILLLLZI;
    public final C28291B8l LJLJI;
    public final /* synthetic */ CDG LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDD(CDG cdg, ViewGroup parent) {
        super(C1FL.LIZIZ(parent, R.layout.dh5, parent, false, "from(parent.context).inf… parent, false,\n        )"));
        o.LJIIIZ(parent, "parent");
        this.LJLJJI = cdg;
        this.LJLIL = (C28291B8l) this.itemView.findViewById(R.id.frl);
        this.LJLILLLLZI = (C28291B8l) this.itemView.findViewById(R.id.frm);
        this.LJLJI = (C28291B8l) this.itemView.findViewById(R.id.frn);
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        GetSubPrivilegeDetailResponse.Data.SubNoteInfo subNoteInfo;
        o.LJIIIZ(holder, "holder");
        C28291B8l c28291B8l = this.LJLIL;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.ode);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_sub_page_chat_title)");
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.ogp);
        o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_subpage_chats_desc)");
        M(c28291B8l, LJIILJJIL, LJIILJJIL2, "ttlive_sub_privilege_detail_sub_only_chat.png");
        C28291B8l c28291B8l2 = this.LJLILLLLZI;
        String LJIILJJIL3 = C15380j0.LJIILJJIL(R.string.ogm);
        o.LJIIIIZZ(LJIILJJIL3, "getString(R.string.pm_su…age_benefit_subonly_live)");
        String LJIILJJIL4 = C15380j0.LJIILJJIL(R.string.oh5);
        o.LJIIIIZZ(LJIILJJIL4, "getString(R.string.pm_subpage_live_desc2)");
        M(c28291B8l2, LJIILJJIL3, LJIILJJIL4, "ttlive_sub_privilege_detail_sub_only_live.png");
        GetSubPrivilegeDetailResponse.Data data = this.LJLJJI.LJLJI;
        if (data != null && (subNoteInfo = data.subNoteInfo) != null && subNoteInfo.showNoteDetail) {
            C28291B8l c28291B8l3 = this.LJLJI;
            if (c28291B8l3 != null) {
                c28291B8l3.setVisibility(0);
            }
            C28291B8l c28291B8l4 = this.LJLJI;
            String LJIILJJIL5 = C15380j0.LJIILJJIL(R.string.occ);
            o.LJIIIIZZ(LJIILJJIL5, "getString(R.string.pm_sub_note_host_title)");
            String LJIILJJIL6 = C15380j0.LJIILJJIL(R.string.oh8);
            o.LJIIIIZZ(LJIILJJIL6, "getString(R.string.pm_subpage_so_live_desc)");
            M(c28291B8l4, LJIILJJIL5, LJIILJJIL6, "ttlive_sub_privilege_detail_sub_note.png");
            return;
        }
        C28291B8l c28291B8l5 = this.LJLJI;
        if (c28291B8l5 == null) {
            return;
        }
        c28291B8l5.setVisibility(8);
    }

    public static void M(C28291B8l c28291B8l, String str, String str2, String str3) {
        if (c28291B8l != null) {
            c28291B8l.getTitle().setText(str);
            c28291B8l.getSubtitle().setText(str2);
            C15490jB.LJ(c28291B8l.getIcon(), "tiktok_live_watch_resource_demand_1", str3);
        }
    }
}
