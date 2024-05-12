package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.fragments.ReplyFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class A4W<T> implements InterfaceC64592gB {
    public final /* synthetic */ A4Y LJLIL;
    public final /* synthetic */ ReplyFragment LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public A4W(A4Y a4y, ReplyFragment replyFragment, long j, String str, String str2) {
        this.LJLIL = a4y;
        this.LJLILLLLZI = replyFragment;
        this.LJLJI = j;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            A4S.LIZ(new A4Y(this.LJLIL.getId(), this.LJLIL.getCreatorId(), this.LJLIL.getCollectionId(), this.LJLIL.getName(), this.LJLIL.getProfileUrl(), this.LJLIL.getNumStars(), this.LJLIL.getContentText(), this.LJLIL.getUnixTimestamp(), this.LJLIL.getCanReply(), this.LJLIL.getReplyRefId(), this.LJLIL.isReply(), this.LJLIL.isEditable(), this.LJLIL.isVerifiedUser(), this.LJLIL.getTempOverrideState(), false));
            A4Y a4y = (A4Y) this.LJLILLLLZI.LJLJJL.getValue();
            if (a4y != null) {
                A4S.LIZ(new A4Y(a4y.getId(), this.LJLIL.getCreatorId(), Long.valueOf(this.LJLJI), a4y.getName(), a4y.getProfileUrl(), a4y.getNumStars(), a4y.getContentText(), a4y.getUnixTimestamp(), false, a4y.getReplyRefId(), a4y.isReply(), a4y.isEditable(), a4y.isVerifiedUser(), a4y.getTempOverrideState(), a4y.isTransient()));
            }
            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity != null) {
                C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
                c26045AKb.LJIIIIZZ(R.string.qo0);
                c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                c26045AKb.LJII(R.attr.e8);
                c26045AKb.LJIIJ();
            }
            ReplyFragment replyFragment = this.LJLILLLLZI;
            CollectionDetailModel collectionDetailModel = replyFragment.LJLIL;
            if (collectionDetailModel != null) {
                C25589A2n.LJIILIIL(collectionDetailModel, (String) replyFragment.LJLILLLLZI.getValue(), true, this.LJLJJI, this.LJLJJL);
            }
            this.LJLILLLLZI.dismiss();
            return;
        }
        ReplyFragment.vl(this.LJLILLLLZI, this.LJLIL, this.LJLJJI, this.LJLJJL);
    }
}
