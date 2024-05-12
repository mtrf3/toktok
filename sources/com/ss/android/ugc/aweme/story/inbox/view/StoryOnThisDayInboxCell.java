package com.ss.android.ugc.aweme.story.inbox.view;

import X.C119354mJ;
import X.C119614mj;
import X.C16880lQ;
import X.C48708J9s;
import X.C48709J9t;
import X.C48710J9u;
import X.C55723Ltv;
import X.C56349M9p;
import X.C77357UXp;
import X.C78765Uvh;
import X.C7F6;
import X.E7Q;
import X.HG3;
import X.RBX;
import Y.ACListenerS28S0100000_8;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class StoryOnThisDayInboxCell extends PowerCell<C48710J9u> {
    public C119614mj LJLIL;
    public TuxIconView LJLILLLLZI;
    public C119354mJ LJLJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Aweme aweme;
        super.onViewAttachedToWindow();
        C48710J9u item = getItem();
        if (item != null && (aweme = item.LJLIL) != null) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aid");
            C77357UXp.LJJIJIIJIL(this, "on_this_day", null, 0, aid, null, 94);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.bxy);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.cover_on_this_day)");
        this.LJLIL = (C119614mj) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.g7p);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.load_success_cover)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.status_view)");
        this.LJLJI = (C119354mJ) findViewById3;
        o.LJIIIIZZ(this.itemView.findViewById(R.id.gw7), "itemView.findViewById(R.id.name_tv)");
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 40), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C48710J9u c48710J9u) {
        C48710J9u t = c48710J9u;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        if (C48708J9s.LIZ() == 1) {
            C119354mJ c119354mJ = this.LJLJI;
            if (c119354mJ != null) {
                c119354mJ.setVisibility(4);
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        } else if (C48708J9s.LIZ() == 2) {
            Keva keva = E7Q.LIZ;
            boolean z = !o.LJ(E7Q.LIZ(keva.getLong("click_on_this_day_inbox_entrance_time", -1L)), E7Q.LIZ(System.currentTimeMillis()));
            boolean z2 = !o.LJ(keva.getString("click_on_this_day_inbox_entrance_user_id", ""), ((RBX) HG3.LJIILL()).getCurUserId());
            if (z || z2) {
                C119354mJ c119354mJ2 = this.LJLJI;
                if (c119354mJ2 != null) {
                    c119354mJ2.setVisibility(0);
                } else {
                    o.LJIJI("statusView");
                    throw null;
                }
            }
        }
        UrlModel cover = t.LJLIL.getVideo().getCover();
        C119614mj c119614mj = this.LJLIL;
        if (c119614mj != null) {
            C78765Uvh.LJII(c119614mj, cover, new C56349M9p(this));
        } else {
            o.LJIJI("cover");
            throw null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        int i;
        o.LJIIIZ(parent, "parent");
        if (C48709J9t.LIZ) {
            i = R.layout.co7;
        } else {
            i = R.layout.co6;
        }
        return C7F6.LIZ(C55723Ltv.LIZIZ.LJIIIIZZ(), "story_inbox_top_cell_on_that_day", parent.getContext(), i, null, parent, false, 40);
    }
}
