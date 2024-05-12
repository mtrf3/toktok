package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7JH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7JH extends AbstractC65781Prl implements InterfaceC88471Ynr<UpvoteVideoAssem, C7JS, C76800UCe> {
    public static final C7JH LJLIL = new C7JH();

    public C7JH() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UpvoteVideoAssem upvoteVideoAssem, C7JS c7js) {
        String str;
        String str2;
        UpvoteVideoAssem selectSubscribe = upvoteVideoAssem;
        C7JS c7js2 = c7js;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        String str3 = null;
        if (c7js2 != null) {
            str = c7js2.LJLIL;
        } else {
            str = null;
        }
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (o.LJ(str, str2) && selectSubscribe.r4(true)) {
            if ((((Number) C7JV.LIZ.getValue()).intValue() & 4) == 4 && C7K1.LIZJ()) {
                if (c7js2 != null) {
                    str3 = c7js2.LJLIL;
                }
                selectSubscribe.S4(str3, "like");
            } else {
                selectSubscribe.a5();
            }
        }
        return C76800UCe.LIZ;
    }
}
