package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.8lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220878lf extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarLiveAssem, C56252Ir, C76800UCe> {
    public static final C220878lf LJLIL = new C220878lf();

    public C220878lf() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarLiveAssem feedAvatarLiveAssem, C56252Ir c56252Ir) {
        Aweme aweme;
        User author;
        String str;
        FeedAvatarLiveAssem selectSubscribe = feedAvatarLiveAssem;
        C56252Ir c56252Ir2 = c56252Ir;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (author = aweme.getAuthor()) != null) {
            if (c56252Ir2 != null) {
                str = c56252Ir2.LJLIL;
            } else {
                str = null;
            }
            if (o.LJ(str, aweme.getAid())) {
                C53887LCx c53887LCx = selectSubscribe.LLF;
                if (c53887LCx != null) {
                    c53887LCx.LIZIZ(author, FeedAvatarLiveAssem.class, selectSubscribe.LLI, aweme);
                } else {
                    o.LJIJI("avatarBorderViewController");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
