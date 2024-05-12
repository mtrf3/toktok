package X;

import com.bytedance.android.live.rank.impl.list.RankLeagueListDialog;

/* renamed from: X.UiM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77938UiM extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ RankLeagueListDialog LJLJJL;
    public final /* synthetic */ C77942UiQ LJLJJLL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        this.LJLJJL.wl().LIZJ(this.LJLJJL.getContext(), this.LJLJJLL);
        C31522CYs.LJIIIIZZ(this.LJLJJLL.LIZ, this.LJLJJL.dataChannel, "champion_tournament_list");
    }

    public C77938UiM(RankLeagueListDialog rankLeagueListDialog, C77942UiQ c77942UiQ) {
        this.LJLJJL = rankLeagueListDialog;
        this.LJLJJLL = c77942UiQ;
    }
}
