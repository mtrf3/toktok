package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8lh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220898lh extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarLiveAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C220898lh LJLIL = new C220898lh();

    public C220898lh() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarLiveAssem feedAvatarLiveAssem, C43I<? extends Boolean> c43i) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        FeedAvatarLiveAssem selectSubscribe = feedAvatarLiveAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if ((!C53324KwK.LIZ() || ((Boolean) it.LIZ).booleanValue()) && (videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)) != null && (aweme = videoItemParams.getAweme()) != null && (aweme.isLive() || aweme.getStreamUrlModel() != null)) {
            C53887LCx c53887LCx = selectSubscribe.LLF;
            if (c53887LCx != null) {
                c53887LCx.LIZ();
                selectSubscribe.LLFII = true;
            } else {
                o.LJIJI("avatarBorderViewController");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
