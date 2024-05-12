package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7JJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7JJ extends AbstractC65781Prl implements InterfaceC88471Ynr<UpvoteVideoAssem, C183887Jo, C76800UCe> {
    public static final C7JJ LJLIL = new C7JJ();

    public C7JJ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UpvoteVideoAssem upvoteVideoAssem, C183887Jo c183887Jo) {
        String str;
        UpvoteVideoAssem selectSubscribe = upvoteVideoAssem;
        C183887Jo c183887Jo2 = c183887Jo;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c183887Jo2 != null && c183887Jo2.LJLILLLLZI) {
            String str2 = c183887Jo2.LJLIL;
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (o.LJ(str2, str) && selectSubscribe.r4(true)) {
                if ((((Number) C7JV.LIZ.getValue()).intValue() & 4) == 4 && C7K1.LIZJ()) {
                    selectSubscribe.S4(c183887Jo2.LJLIL, "like");
                } else {
                    selectSubscribe.a5();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
