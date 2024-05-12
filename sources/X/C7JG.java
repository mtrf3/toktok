package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import kotlin.jvm.internal.o;

/* renamed from: X.7JG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7JG extends AbstractC65781Prl implements InterfaceC88471Ynr<UpvoteVideoAssemNew, C46276IEe, C76800UCe> {
    public static final C7JG LJLIL = new C7JG();

    public C7JG() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UpvoteVideoAssemNew upvoteVideoAssemNew, C46276IEe c46276IEe) {
        UpvoteVideoAssemNew selectSubscribe = upvoteVideoAssemNew;
        C46276IEe c46276IEe2 = c46276IEe;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().isPhotoMode() && c46276IEe2 != null && c46276IEe2.LJLIL == 7 && selectSubscribe.r4(true)) {
            C7IQ c7iq = selectSubscribe.z4().LJLJI;
            c7iq.getClass();
            int LIZ = C46406IJe.LIZ();
            int i = c7iq.LIZ;
            if (LIZ >= i) {
                c7iq.LIZ = i + 1;
            }
            if (C46406IJe.LIZ() == c7iq.LIZ) {
                if (selectSubscribe.z4().LJLJI.LIZ == C46406IJe.LIZ()) {
                    String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
                    o.LJIIIIZZ(aid, "item.aweme.aid");
                    C183607Im.LIZIZ(aid);
                }
                if ((((Number) C7JV.LIZ.getValue()).intValue() & 2) == 2 && C7K1.LIZJ()) {
                    selectSubscribe.S4(c46276IEe2.LJLILLLLZI, "loop");
                } else {
                    selectSubscribe.b5();
                }
            } else if (selectSubscribe.z4().LJLJI.LIZ == 1 && (((Number) C7JV.LIZ.getValue()).intValue() & 1) == 1 && C7K1.LIZJ()) {
                selectSubscribe.S4(c46276IEe2.LJLILLLLZI, "oneLoop");
            }
        }
        return C76800UCe.LIZ;
    }
}
