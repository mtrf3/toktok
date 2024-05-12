package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.ui.share.UpdateFollowStatusOperator$invoke$1", f = "UpdateFollowStatusOperator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2z5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76312z5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<Aweme> LJLIL;
    public final /* synthetic */ C76322z6 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C76312z5(List<? extends Aweme> list, C76322z6 c76322z6, int i, InterfaceC67352kd<? super C76312z5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c76322z6;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76312z5(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        VideoBaseCell videoBaseCell;
        VideoBaseCell videoBaseCell2;
        C141335gf.LIZJ(obj);
        List<Aweme> list = this.LJLIL;
        C76322z6 c76322z6 = this.LJLILLLLZI;
        int i = this.LJLJI;
        for (Aweme aweme : list) {
            C2MA viewHolderByAwemeId = c76322z6.LIZ.getViewHolderByAwemeId(aweme.getAid());
            if (viewHolderByAwemeId != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("refresh sharer(");
                User sharer = aweme.getSharer();
                String str = null;
                if (sharer != null) {
                    str = sharer.getNickname();
                }
                LIZ.append(str);
                LIZ.append("), toStatus:");
                LIZ.append(i);
                C221018lt.LJFF("@LinkRelation_Video", X1D.LIZIZ(LIZ));
                boolean z = viewHolderByAwemeId instanceof VideoBaseCell;
                if (z && (((videoBaseCell = (VideoBaseCell) viewHolderByAwemeId) != null && videoBaseCell.LJLJJLL() == 2) || (z && (videoBaseCell2 = (VideoBaseCell) viewHolderByAwemeId) != null && videoBaseCell2.LJLJJLL() == 6))) {
                    VideoExposeSharerInformationVM LIZIZ = C88293dJ.LIZIZ(viewHolderByAwemeId);
                    if (LIZIZ != null) {
                        LIZIZ.tv0(0, R.attr.cl, false);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
