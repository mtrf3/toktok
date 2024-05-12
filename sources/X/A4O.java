package X;

import com.ss.android.ugc.aweme.paidcontent.fragments.ReplyFragment;

/* loaded from: classes5.dex */
public final class A4O<T> implements InterfaceC64592gB {
    public final /* synthetic */ ReplyFragment LJLIL;
    public final /* synthetic */ A4Y LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    public A4O(ReplyFragment replyFragment, A4Y a4y, String str, String str2) {
        this.LJLIL = replyFragment;
        this.LJLILLLLZI = a4y;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        ReplyFragment.vl(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
    }
}
