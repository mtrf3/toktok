package X;

import com.bytedance.android.live.rank.impl.list.RankListDialog;

/* renamed from: X.UiL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77937UiL extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ RankListDialog LJLJJL;
    public final /* synthetic */ C77942UiQ LJLJJLL;

    @Override // X.AbstractViewOnClickListenerC28292B8m
    public final void LIZ() {
        this.LJLJJL.wl().LIZJ(this.LJLJJL.getContext(), this.LJLJJLL);
        C31522CYs.LJIIIIZZ(this.LJLJJLL.LIZ, this.LJLJJL.dataChannel, "daily_rank_list");
    }

    public C77937UiL(RankListDialog rankListDialog, C77942UiQ c77942UiQ) {
        this.LJLJJL = rankListDialog;
        this.LJLJJLL = c77942UiQ;
    }
}
