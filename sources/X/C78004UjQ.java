package X;

import android.view.View;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankLeagueFragment;

/* renamed from: X.UjQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78004UjQ implements InterfaceC78031Ujr {
    public final /* synthetic */ RankLeagueFragment LIZ;

    @Override // X.InterfaceC78031Ujr
    public final void LJIILIIL(long j) {
    }

    @Override // X.InterfaceC78031Ujr
    public final void LIZ() {
        View view = this.LIZ.LLIIIL;
        if (view != null) {
            view.setVisibility(8);
        }
        this.LIZ.LLIILII = false;
    }

    public C78004UjQ(RankLeagueFragment rankLeagueFragment) {
        this.LIZ = rankLeagueFragment;
    }
}
