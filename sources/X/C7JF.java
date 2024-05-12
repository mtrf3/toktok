package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7JF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7JF extends AbstractC65781Prl implements InterfaceC88471Ynr<UpvoteVideoAssem, C46276IEe, C76800UCe> {
    public static final C7JF LJLIL = new C7JF();

    public C7JF() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UpvoteVideoAssem upvoteVideoAssem, C46276IEe c46276IEe) {
        UpvoteVideoAssem selectSubscribe = upvoteVideoAssem;
        C46276IEe c46276IEe2 = c46276IEe;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().isPhotoMode() && c46276IEe2 != null && c46276IEe2.LJLIL == 7 && selectSubscribe.r4(true)) {
            C183577Ij c183577Ij = selectSubscribe.A4().LJLJI;
            c183577Ij.getClass();
            int LIZ = C46406IJe.LIZ();
            int i = c183577Ij.LIZ;
            if (LIZ >= i) {
                c183577Ij.LIZ = i + 1;
            }
            if (C46406IJe.LIZ() == c183577Ij.LIZ) {
                if (selectSubscribe.A4().LJLJI.LIZ == C46406IJe.LIZ()) {
                    String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
                    o.LJIIIIZZ(aid, "item.aweme.aid");
                    C183607Im.LIZIZ(aid);
                }
                if ((((Number) C7JV.LIZ.getValue()).intValue() & 2) == 2 && C7K1.LIZJ()) {
                    selectSubscribe.S4(c46276IEe2.LJLILLLLZI, "loop");
                } else {
                    selectSubscribe.b5();
                }
            } else if (selectSubscribe.A4().LJLJI.LIZ == 1 && (((Number) C7JV.LIZ.getValue()).intValue() & 1) == 1 && C7K1.LIZJ()) {
                selectSubscribe.S4(c46276IEe2.LJLILLLLZI, "oneLoop");
            }
        }
        return C76800UCe.LIZ;
    }
}
