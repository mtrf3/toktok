package com.ss.android.ugc.aweme.feed.cell;

import X.C110614Vt;
import X.C16880lQ;
import X.C221108m2;
import X.C54453LYr;
import X.C55661Lsv;
import X.C61328O5c;
import X.C62822Ol8;
import X.C86V;
import X.FMX;
import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowLiveSkylightWidgetCell extends PowerCell<C54453LYr> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 215));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 216));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 214));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.avz;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        HashMap hashMap = new HashMap();
        hashMap.put("position", "follow_tab_cover");
        FMX.LJIIL("livesdk_widget_tutorial_show", hashMap);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C54453LYr t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-root>(...)");
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 173), (View) value);
        Object value2 = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value2, "<get-tvName>(...)");
        ((TextView) value2).setText(C86V.LJFF(R.string.rt9));
        Object value3 = this.LJLJI.getValue();
        o.LJIIIIZZ(value3, "<get-ivCircleWidget>(...)");
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.ch);
        c110614Vt.LIZJ = C61328O5c.LIZJ(35);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        ((View) value3).setBackground(c110614Vt.LIZ(context));
        LiveOuterService.LJJJLL().LJIIJJI();
        C55661Lsv.LJIIZILJ();
    }
}
