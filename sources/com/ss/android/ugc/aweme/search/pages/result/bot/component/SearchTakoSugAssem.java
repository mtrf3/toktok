package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C62822Ol8;
import X.C8XO;
import X.C90193gN;
import X.JN1;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import q03.IDaS201S0200000_8;

/* loaded from: classes9.dex */
public final class SearchTakoSugAssem extends ReusedUISlotAssem<SearchTakoSugAssem> implements C8XO<JN1> {
    public final C62822Ol8 LLFF;
    public TuxIconView LLFFF;
    public TuxTextView LLFII;
    public LinearLayoutCompat LLFZ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.che;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchTakoSugAssem() {
        new LinkedHashMap();
        this.LLFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 218));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(JN1 jn1) {
        int i;
        int i2;
        int i3;
        JN1 item = jn1;
        o.LJIIIZ(item, "item");
        if (item.LJLILLLLZI.LJLIL == 0) {
            i = R.attr.c0;
        } else {
            i = R.attr.gu;
        }
        C2068389v c2068389v = new C2068389v();
        if (C90193gN.LIZ()) {
            i2 = R.raw.icon_arrow_left_ltr;
        } else {
            i2 = R.raw.icon_arrow_right_ltr;
        }
        c2068389v.LIZ = i2;
        c2068389v.LJ = Integer.valueOf(i);
        TuxIconView tuxIconView = this.LLFFF;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c2068389v);
        }
        TuxTextView tuxTextView = this.LLFII;
        if (tuxTextView != null) {
            tuxTextView.setText(item.LJLILLLLZI.LJLILLLLZI);
        }
        TuxTextView tuxTextView2 = this.LLFII;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColorRes(i);
        }
        LinearLayoutCompat linearLayoutCompat = this.LLFZ;
        if (linearLayoutCompat != null) {
            if (item.LJLILLLLZI.LJLIL == 0) {
                i3 = R.drawable.c20;
            } else {
                i3 = R.drawable.c1z;
            }
            linearLayoutCompat.setBackgroundResource(i3);
        }
        C16880lQ.LJIIJ(new IDaS201S0200000_8(this, item, 0), getContainerView());
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JN1 jn1) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFFF = (TuxIconView) getContainerView().findViewById(R.id.ex3);
        this.LLFII = (TuxTextView) getContainerView().findViewById(R.id.ly1);
        this.LLFZ = (LinearLayoutCompat) getContainerView().findViewById(R.id.g1a);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(JN1 jn1) {
    }
}
