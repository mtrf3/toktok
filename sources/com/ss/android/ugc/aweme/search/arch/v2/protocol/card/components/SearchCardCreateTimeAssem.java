package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C57105Mb7;
import X.C7MY;
import X.C8XO;
import X.InterfaceC49000JKy;
import X.JJC;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCardCreateTimeAssem extends ReusedUISlotAssem<SearchCardBottomBarAssem> implements C8XO<InterfaceC49000JKy> {
    public TuxTextView LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ci7;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchCardCreateTimeAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC49000JKy interfaceC49000JKy) {
        int i;
        InterfaceC49000JKy item = interfaceC49000JKy;
        o.LJIIIZ(item, "item");
        Aweme data = item.getAweme();
        o.LJIIIZ(data, "data");
        if (getContext() == null) {
            return;
        }
        TuxTextView tuxTextView = this.LLFF;
        if (tuxTextView != null) {
            tuxTextView.setText(C57105Mb7.LJI(data.getCreateTime() * 1000, tuxTextView.getContext()));
            if (data.isAd()) {
                i = 8;
            } else {
                i = 0;
            }
            tuxTextView.setVisibility(i);
            return;
        }
        o.LJIJI("createTimeLabel");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC49000JKy interfaceC49000JKy) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLFF = (TuxTextView) C7MY.LIZLLL(view, "view", R.id.n5x, "view.findViewById(R.id.video_holder_time_label)");
        JJC.LIZ.getClass();
        if (JJC.LIZ()) {
            TuxTextView tuxTextView = this.LLFF;
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(82);
            } else {
                o.LJIJI("createTimeLabel");
                throw null;
            }
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC49000JKy interfaceC49000JKy) {
    }
}
