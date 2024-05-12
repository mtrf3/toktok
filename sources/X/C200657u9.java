package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7u9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200657u9 extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedVideoAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C200657u9 LJLIL = new C200657u9();

    public C200657u9() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedVideoAssem feedVideoAssem, C43I<? extends Integer> c43i) {
        InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJ;
        FeedVideoAssem selectSubscribe = feedVideoAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && !C8MS.LIZ() && (LJ = selectSubscribe.c4().LJ()) != null) {
            boolean z = true;
            if (((Number) C200687uC.LIZ.getValue()).intValue() == 0) {
                if (selectSubscribe.c4().LIZLLL(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme(), selectSubscribe.LL)) {
                    C8VR.LIZJ(selectSubscribe, LJ);
                }
            } else {
                if ((!o.LJ(selectSubscribe.LL.eventType, "personal_homepage") && !o.LJ(selectSubscribe.LL.eventType, "others_homepage")) || !o.LJ(selectSubscribe.LL.param.getFrom(), "REPOSTED_LIST_ENTRANCE")) {
                    z = false;
                }
                InterfaceC200587u2 c4 = selectSubscribe.c4();
                Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
                BaseFeedPageParams baseFeedPageParams = selectSubscribe.LL;
                if (c4.LIZ(aweme, baseFeedPageParams.eventType, C183877Jn.LIZ(baseFeedPageParams), Boolean.valueOf(z))) {
                    C8VR.LIZJ(selectSubscribe, LJ);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
