package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C16880lQ;
import X.C221108m2;
import X.C49024JLw;
import X.C62822Ol8;
import X.C8VR;
import X.C8XO;
import X.JMQ;
import Y.IDTListenerS117S0100000_8;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import q03.IDaS201S0200000_8;

/* loaded from: classes9.dex */
public final class SearchTakoVideoRootAssem extends ReusedUISlotAssem<SearchTakoVideoRootAssem> implements C8XO<C49024JLw> {
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.chf;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchTakoVideoRootAssem() {
        new LinkedHashMap();
        this.LLFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 220));
        this.LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 221));
    }

    @Override // X.C8XO
    public final void F0(C49024JLw c49024JLw) {
        C49024JLw item = c49024JLw;
        o.LJIIIZ(item, "item");
        C16880lQ.LJIIJ(new IDaS201S0200000_8(this, item, 1), getContainerView());
        View containerView = getContainerView();
        JMQ jmq = new JMQ(this, getContainerView().getContext());
        jmq.LJLJLLL = new IDTListenerS117S0100000_8(this, 1);
        containerView.setOnTouchListener(jmq);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C49024JLw c49024JLw) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS174S0100000_8(this, 81));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C49024JLw c49024JLw) {
    }
}
