package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225368su extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarDefaultAssem, C56252Ir, C76800UCe> {
    public static final C225368su LJLIL = new C225368su();

    public C225368su() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarDefaultAssem feedAvatarDefaultAssem, C56252Ir c56252Ir) {
        Aweme aweme;
        String str;
        FeedAvatarDefaultAssem selectSubscribe = feedAvatarDefaultAssem;
        C56252Ir c56252Ir2 = c56252Ir;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            if (c56252Ir2 != null) {
                str = c56252Ir2.LJLIL;
            } else {
                str = null;
            }
            if (o.LJ(str, aweme.getAid())) {
                selectSubscribe.Z3().mv0();
            }
        }
        return C76800UCe.LIZ;
    }
}
