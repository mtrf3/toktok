package com.ss.android.ugc.aweme.views;

import X.C0A2;
import X.C0A3;
import X.C0A7;
import X.C0AC;
import X.C40161hs;
import X.KRU;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.compliance.business.phl.feed.PhlFeedFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class PagerLayoutManager extends LinearLayoutManager implements C0A3 {
    public final C40161hs LLIIIJ = new C40161hs();
    public KRU LLIIIL;

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        if (this.LLIIIL != null) {
            C0A2.LJJJLL(view);
        }
    }

    @Override // X.C0A3
    public final void LJJIFFI(View view) {
        if (this.LLIIIL != null && LJJJI() == 1) {
            this.LLIIIL.LIZ(C0A2.LJJJLL(view));
        }
    }

    @Override // X.C0A2
    public final void LJJLIL(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.LJIIIZ(this);
            this.LLIIIJ.LIZIZ(recyclerView);
            return;
        }
        throw new IllegalArgumentException("The attach RecycleView must not null!!");
    }

    @Override // X.C0A2
    public final void LJLJLLL(int i) {
        int i2;
        String str;
        if (i == 0) {
            View LJFF = this.LLIIIJ.LJFF(this);
            if (LJFF != null) {
                i2 = C0A2.LJJJLL(LJFF);
            } else {
                i2 = 0;
            }
            int LJJJI = LJJJI();
            KRU kru = this.LLIIIL;
            if (kru != null && LJJJI == 1) {
                PhlFeedFragment phlFeedFragment = kru.LIZ;
                int i3 = phlFeedFragment.LJLJL;
                if (i2 > i3) {
                    str = "swipe_up";
                } else {
                    str = "swipe_down";
                }
                phlFeedFragment.xl(i3, str);
                kru.LIZ.Gl(i2);
                kru.LIZ.Al(i2, str);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJJLJ(RecyclerView recyclerView, C0A7 c0a7) {
        List<C0A3> list = recyclerView.LLIFFJFJJ;
        if (list != null) {
            ((ArrayList) list).remove(this);
        }
        super.LJJLJ(recyclerView, c0a7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        super.LJLJJI(c0a7, c0ac);
    }
}
