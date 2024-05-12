package X;

import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;

/* renamed from: X.JfJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49721JfJ extends C49917JiT<C49823Jgx> {
    @Override // X.C49917JiT, X.C51031K1b, X.C8BR, X.C8BT
    public final void onSuccess() {
        JVQ jvq;
        super.onSuccess();
        InterfaceC49928Jie interfaceC49928Jie = this.LJLJJL;
        if (interfaceC49928Jie instanceof SearchFeedFragment) {
            String str = ((SearchMix) this.LJLIL.getData()).feedbackType;
            C8HS nm = ((SearchFragment) interfaceC49928Jie).nm();
            if ((nm instanceof JVQ) && (jvq = (JVQ) nm) != null) {
                jvq.LJLLI = str;
            }
        }
    }

    @Override // X.C49917JiT
    /* renamed from: LJJIJ, reason: merged with bridge method [inline-methods] */
    public final void LJJ(C49823Jgx c49823Jgx) {
        super.LJJ(c49823Jgx);
        if (c49823Jgx != null) {
            c49823Jgx.onModelBound();
        }
    }
}
