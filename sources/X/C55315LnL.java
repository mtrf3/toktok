package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.LnL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55315LnL extends KQB {
    public M89 LJLJJI;
    public final /* synthetic */ C55322LnS LJLJJL;

    @Override // X.KQB, X.C8BR, X.C8BT
    public final void onSuccess() {
        OSZ osz;
        Aweme aweme;
        String upvoteId;
        super.onSuccess();
        M89 m89 = this.LJLJJI;
        if ((m89 == null || (upvoteId = m89.getUpvoteId()) == null || upvoteId.length() == 0) && (osz = (OSZ) this.LJLIL.getData()) != null && (aweme = (Aweme) osz.getSecond()) != null) {
            C55888Lwa.LIZIZ.LJIILJJIL().LIZIZ(aweme);
        }
    }

    public C55315LnL(C55322LnS c55322LnS) {
        this.LJLJJL = c55322LnS;
    }

    @Override // X.KQB, X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        if (!this.LJLJJL.LJLJJI) {
            super.onFailed(exc);
        }
    }
}
