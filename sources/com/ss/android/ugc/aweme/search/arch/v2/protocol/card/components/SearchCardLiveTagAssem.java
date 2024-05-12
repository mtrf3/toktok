package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C8XO;
import X.C90193gN;
import X.InterfaceC48999JKx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class SearchCardLiveTagAssem extends ReusedUISlotAssem<SearchCardLiveTagAssem> implements C8XO<InterfaceC48999JKx> {
    public TuxIconView LLFF;
    public TuxTextView LLFFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cf8;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchCardLiveTagAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC48999JKx interfaceC48999JKx) {
        return true;
    }

    @Override // X.C8XO
    /* renamed from: m4, reason: merged with bridge method [inline-methods] */
    public void q4(InterfaceC48999JKx item) {
        int i;
        o.LJIIIZ(item, "item");
        TuxIconView tuxIconView = this.LLFF;
        if (tuxIconView != null) {
            if (item.n()) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView.setVisibility(i);
        }
        TuxTextView tuxTextView = this.LLFFF;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(item.A());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = (TuxIconView) view.findViewById(R.id.f6a);
        this.LLFFF = (TuxTextView) view.findViewById(R.id.mqn);
        if (C90193gN.LIZIZ(getContext())) {
            view.findViewById(R.id.g4b).setBackgroundResource(R.drawable.c1_);
            view.findViewById(R.id.g74).setBackgroundResource(R.drawable.c1b);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC48999JKx interfaceC48999JKx) {
    }
}
