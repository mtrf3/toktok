package com.ss.android.ugc.aweme.story.guide;

import X.AbstractC38911fr;
import X.C110614Vt;
import X.C16880lQ;
import X.C48709J9t;
import X.C55723Ltv;
import X.C56358M9y;
import X.C56359M9z;
import X.C61328O5c;
import X.C77357UXp;
import X.C7F6;
import X.FMX;
import X.MA1;
import X.OSZ;
import Y.ACListenerS29S0100000_9;
import Y.ACListenerS35S0300000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoryWidgetGuideInboxCell extends PowerCell<C56358M9y> {
    public TuxIconView LJLIL;
    public TuxTextView LJLILLLLZI;
    public int LJLJI = 1;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String str;
        super.onViewAttachedToWindow();
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("notification_page", "enter_from");
        oszArr[1] = new OSZ(Integer.valueOf(this.LJLJI), "is_first");
        C56358M9y item = getItem();
        if (item != null) {
            str = item.LJLJJI;
        } else {
            str = null;
        }
        oszArr[2] = new OSZ(str, "widget_type");
        FMX.LJIILL("add_widget_show", oszArr);
        C77357UXp.LJJIJIIJIL(this, "widget", null, 0, null, null, 126);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        if (C48709J9t.LIZ) {
            return R.layout.hp;
        }
        return R.layout.ho;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        int i;
        super.onItemViewCreated();
        this.LJLIL = (TuxIconView) this.itemView.findViewById(R.id.ebu);
        this.LJLILLLLZI = (TuxTextView) this.itemView.findViewById(R.id.c7z);
        if (C48709J9t.LIZ) {
            i = 35;
        } else {
            i = 31;
        }
        TuxIconView tuxIconView = this.LJLIL;
        if (tuxIconView != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LIZJ = C61328O5c.LIZJ(i);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            tuxIconView.setBackground(c110614Vt.LIZ(context));
        }
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 68), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C56358M9y c56358M9y) {
        String str;
        AbstractC38911fr abstractC38911fr;
        C56358M9y t = c56358M9y;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.LJLJI = t.LJLIL ? 1 : 0;
        TuxIconView tuxIconView = this.LJLIL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(t.LJLILLLLZI);
        }
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setText(t.LJLJI);
        }
        C56358M9y item = getItem();
        if (item != null) {
            str = item.LJLJJI;
        } else {
            str = null;
        }
        if (o.LJ(str, "now")) {
            abstractC38911fr = C56359M9z.LJLILLLLZI;
        } else {
            abstractC38911fr = MA1.LJLILLLLZI;
        }
        if (t.LJLIL && abstractC38911fr.LJIIZILJ().getLong("keva_key_widget_guide_appear_time", -1L) < 0) {
            abstractC38911fr.LJIIZILJ().storeLong("keva_key_widget_guide_appear_time", System.currentTimeMillis());
        }
        TuxIconView tuxIconView2 = this.LJLIL;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS35S0300000_9(this, abstractC38911fr, t, 4));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return C7F6.LIZ(C55723Ltv.LIZIZ.LJIIIIZZ(), "story_inbox_top_cell_widget", parent.getContext(), getLayoutId(), null, parent, false, 40);
    }
}
