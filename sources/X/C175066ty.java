package X;

import Y.AObjectS42S0101000_5;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentlist.api.UserBatchBlockResponse;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175066ty implements InterfaceC73463SsN<UserBatchBlockResponse> {
    public final /* synthetic */ java.util.Set LJLIL;
    public final /* synthetic */ CommentListFragment LJLILLLLZI;

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        if (th instanceof C38333F2r) {
            if (this.LJLILLLLZI.LLLF == null) {
                return;
            }
            C38333F2r c38333F2r = (C38333F2r) th;
            switch (c38333F2r.getErrorCode()) {
                case 3001210:
                case 3001211:
                    C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI.mo49getActivity());
                    c26045AKb.LJIIIZ(this.LJLILLLLZI.getString(R.string.dj4));
                    c26045AKb.LJIIJ();
                    return;
                case 3002038:
                    this.LJLILLLLZI.eo(c38333F2r, this.LJLIL);
                    ARI ari = new ARI(this.LJLILLLLZI.getContext());
                    ari.LJI(R.string.p4r, new AObjectS42S0101000_5(2, this, 18));
                    ari.LJIIIIZZ(R.string.p4q, null);
                    CommentListFragment commentListFragment = this.LJLILLLLZI;
                    C26227ARb LIZ = C3AW.LIZ(commentListFragment.requireContext());
                    LIZ.LIZIZ(this.LJLILLLLZI.mo49getActivity().getResources().getString(R.string.p4s));
                    LIZ.LJIIL = ari;
                    LIZ.LJII = false;
                    commentListFragment.LLLLLL = LIZ.LJI();
                    this.LJLILLLLZI.LLLLLL.LIZLLL();
                    return;
                case 3002058:
                    this.LJLILLLLZI.eo(c38333F2r, this.LJLIL);
                    return;
                default:
                    C178296zB.LIZJ(this.LJLILLLLZI.getContext(), c38333F2r, R.string.dj4);
                    return;
            }
        }
        C26045AKb c26045AKb2 = new C26045AKb(this.LJLILLLLZI.mo49getActivity());
        c26045AKb2.LJIIIIZZ(R.string.dj4);
        c26045AKb2.LJIIJ();
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(UserBatchBlockResponse userBatchBlockResponse) {
        CommentListFragment commentListFragment = this.LJLILLLLZI;
        if (commentListFragment.LLLF == null) {
            return;
        }
        commentListFragment.mm(this.LJLIL);
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI.mo49getActivity());
        c26045AKb.LJIIIIZZ(R.string.bnl);
        c26045AKb.LJIIJ();
        this.LJLILLLLZI.Rn(1);
    }

    public C175066ty(CommentListFragment commentListFragment, java.util.Set set) {
        this.LJLILLLLZI = commentListFragment;
        this.LJLIL = set;
    }
}
