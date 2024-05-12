package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import kotlin.jvm.internal.o;

/* renamed from: X.7JI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7JI extends AbstractC65781Prl implements InterfaceC88471Ynr<UpvoteVideoAssemNew, C7JS, C76800UCe> {
    public static final C7JI LJLIL = new C7JI();

    public C7JI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UpvoteVideoAssemNew upvoteVideoAssemNew, C7JS c7js) {
        String str;
        UpvoteVideoAssemNew selectSubscribe = upvoteVideoAssemNew;
        C7JS c7js2 = c7js;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c7js2 != null) {
            String str2 = c7js2.LJLIL;
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (o.LJ(str2, str) && selectSubscribe.r4(true)) {
                if ((((Number) C7JV.LIZ.getValue()).intValue() & 4) == 4 && C7K1.LIZJ()) {
                    selectSubscribe.S4(c7js2.LJLIL, "like");
                } else {
                    selectSubscribe.a5();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
