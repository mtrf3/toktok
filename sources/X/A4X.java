package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.model.RatingUpdateResponse;
import com.ss.android.ugc.aweme.paidcontent.fragments.RatingFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A4X<T> implements InterfaceC64592gB {
    public final /* synthetic */ A4Y LJLIL;
    public final /* synthetic */ RatingFragment LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public A4X(A4Y a4y, RatingFragment ratingFragment, int i) {
        this.LJLIL = a4y;
        this.LJLILLLLZI = ratingFragment;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        RatingUpdateResponse ratingUpdateResponse = (RatingUpdateResponse) obj;
        if (ratingUpdateResponse.status_code == 0) {
            A4S.LIZ(new A4Y(this.LJLIL.getId(), this.LJLIL.getCreatorId(), this.LJLIL.getCollectionId(), this.LJLIL.getName(), this.LJLIL.getProfileUrl(), this.LJLIL.getNumStars(), this.LJLIL.getContentText(), this.LJLIL.getUnixTimestamp(), this.LJLIL.getCanReply(), this.LJLIL.getReplyRefId(), this.LJLIL.isReply(), this.LJLIL.isEditable(), this.LJLIL.isVerifiedUser(), this.LJLIL.getTempOverrideState(), false));
            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity != null) {
                C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
                c26045AKb.LJIIIIZZ(R.string.qo0);
                c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                c26045AKb.LJII(R.attr.e8);
                c26045AKb.LJIIJ();
            }
            ASQ.LJ(this.LJLILLLLZI, ASX.LIZ);
            Dialog dialog = this.LJLILLLLZI.LJLJL;
            if (dialog != null) {
                V1B.LJLILLLLZI(dialog);
            }
            RatingFragment ratingFragment = this.LJLILLLLZI;
            ratingFragment.vl(this.LJLJI, ratingFragment.LJLLI, ratingUpdateResponse.updatedReview.getId(), true);
            if (this.LJLILLLLZI.mo49getActivity() instanceof InterfaceC25633A4f) {
                InterfaceC36571c5 mo49getActivity2 = this.LJLILLLLZI.mo49getActivity();
                o.LJII(mo49getActivity2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.paidcontent.fragments.RatingFragment.RatingListener");
                ((InterfaceC25633A4f) mo49getActivity2).LIZ();
                return;
            }
            this.LJLILLLLZI.LJLJLLL.getValue().setState(new AqS29S0001000_4(this.LJLILLLLZI.LJLJLJ, 9));
            return;
        }
        RatingFragment.wl(this.LJLILLLLZI, this.LJLIL);
    }
}
