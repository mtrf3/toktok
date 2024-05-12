package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C110614Vt;
import X.C19N;
import X.C61328O5c;
import X.C7MX;
import X.C7MY;
import X.C8XO;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SearchCardVideoLabelAssem extends ReusedUISlotAssem<SearchCardBottomBarAssem> implements C8XO<C7MX> {
    public TuxTextView LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ci_;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchCardVideoLabelAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C7MX c7mx) {
        C7MX item = c7mx;
        o.LJIIIZ(item, "item");
        int index = item.getIndex();
        TuxTextView tuxTextView = this.LLFF;
        if (tuxTextView != null) {
            tuxTextView.setText(String.valueOf(index));
        } else {
            o.LJIJI("tvVideoLabel");
            throw null;
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C7MX c7mx) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView = (TuxTextView) C7MY.LIZLLL(view, "view", R.id.lyj, "view.findViewById(R.id.tvVideoLabel)");
        this.LLFF = tuxTextView;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = C19N.LIZIZ(view, "view.context", R.attr.cd);
        c110614Vt.LJIIIIZZ = C61328O5c.LIZJ(4);
        c110614Vt.LJIIJJI = C61328O5c.LIZJ(4);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        tuxTextView.setBackground(c110614Vt.LIZ(context));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C7MX c7mx) {
    }
}
