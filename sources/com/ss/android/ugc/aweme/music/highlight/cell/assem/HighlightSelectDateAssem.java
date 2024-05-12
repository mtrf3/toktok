package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.C240479cB;
import X.C8XO;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightSelectDateAssem extends ReusedUISlotAssem<HighlightSelectDateAssem> implements C8XO<C240479cB> {
    public TuxTextView LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c7m;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public HighlightSelectDateAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    public final void F0(C240479cB c240479cB) {
        C240479cB item = c240479cB;
        o.LJIIIZ(item, "item");
        TuxTextView tuxTextView = this.LLFF;
        if (tuxTextView != null) {
            tuxTextView.setText(tuxTextView.getContext().getString(R.string.imv, item.LJLIL));
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240479cB c240479cB) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = (TuxTextView) view.findViewById(R.id.m4_);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240479cB c240479cB) {
    }
}
