package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C242689fk;
import X.C77123UOp;
import X.C7MY;
import X.C8XO;
import X.C90193gN;
import X.InterfaceC49000JKy;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCardVideoDiggAssem extends ReusedUISlotAssem<SearchCardBottomBarAssem> implements C8XO<InterfaceC49000JKy> {
    public TuxTextView LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ci8;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchCardVideoDiggAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC49000JKy interfaceC49000JKy) {
        long j;
        InterfaceC49000JKy item = interfaceC49000JKy;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        TuxTextView tuxTextView = this.LLFF;
        if (tuxTextView != null) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j = statistics.getDiggCount();
            } else {
                j = 0;
            }
            tuxTextView.setText(C77123UOp.LJJIIJ(j));
            Drawable LIZ = C242689fk.LIZ(getContext(), aweme, R.drawable.c2k);
            if (C90193gN.LIZ()) {
                TuxTextView tuxTextView2 = this.LLFF;
                if (tuxTextView2 != null) {
                    tuxTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, LIZ, (Drawable) null);
                    return;
                } else {
                    o.LJIJI("videoDiggCount");
                    throw null;
                }
            }
            TuxTextView tuxTextView3 = this.LLFF;
            if (tuxTextView3 != null) {
                tuxTextView3.setCompoundDrawablesWithIntrinsicBounds(LIZ, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            } else {
                o.LJIJI("videoDiggCount");
                throw null;
            }
        }
        o.LJIJI("videoDiggCount");
        throw null;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC49000JKy interfaceC49000JKy) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLFF = (TuxTextView) C7MY.LIZLLL(view, "view", R.id.n40, "view.findViewById(R.id.videoDiggCount)");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC49000JKy interfaceC49000JKy) {
    }
}
