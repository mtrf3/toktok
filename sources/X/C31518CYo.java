package X;

import Y.ARunnableS24S0200000_5;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;

/* renamed from: X.CYo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31518CYo implements CKC {
    public final /* synthetic */ RankEntranceWidget LIZ;
    public final /* synthetic */ C31521CYr LIZIZ;

    public C31518CYo(RankEntranceWidget rankEntranceWidget, C31521CYr c31521CYr) {
        this.LIZ = rankEntranceWidget;
        this.LIZIZ = c31521CYr;
    }

    @Override // X.CKC
    public final void LIZ() {
        RankEntranceWidget rankEntranceWidget = this.LIZ;
        rankEntranceWidget.LJLLILLLL.postDelayed(new ARunnableS24S0200000_5(rankEntranceWidget, this.LIZIZ, 8), 1000L);
    }
}
