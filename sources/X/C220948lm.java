package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.8lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220948lm extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarLiveAssem, C1IZ, C76800UCe> {
    public static final C220948lm LJLIL = new C220948lm();

    public C220948lm() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarLiveAssem feedAvatarLiveAssem, C1IZ c1iz) {
        Aweme aweme;
        User author;
        AwemeSplashInfo LJJJJZI;
        FeedAvatarLiveAssem selectSubscribe = feedAvatarLiveAssem;
        C1IZ c1iz2 = c1iz;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe);
        if (c1iz2 != null && videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (author = aweme.getAuthor()) != null && o.LJ(String.valueOf(c1iz2.LJLILLLLZI), author.getUid())) {
            C59872Wp c59872Wp = C59872Wp.LJLIL;
            if (c1iz2.LJLJI) {
                if (author.roomId != 0) {
                    InterfaceC220958ln liveStateManager = BusinessComponentServiceUtils.getLiveStateManager();
                    String uid = author.getUid();
                    o.LJIIIIZZ(uid, "author.uid");
                    ((C55077LjV) liveStateManager).LJIIIZ(CastLongProtector.parseLong(uid));
                    Boolean bool = Boolean.FALSE;
                    String uid2 = author.getUid();
                    o.LJIIIIZZ(uid2, "author.uid");
                    c59872Wp.invoke(bool, 0L, uid2);
                }
                author.roomId = 0L;
            } else if (c1iz2.LJLIL != 0) {
                if (author.roomId == 0) {
                    InterfaceC220958ln liveStateManager2 = BusinessComponentServiceUtils.getLiveStateManager();
                    String uid3 = author.getUid();
                    o.LJIIIIZZ(uid3, "author.uid");
                    ((C55077LjV) liveStateManager2).LJIIIZ(CastLongProtector.parseLong(uid3));
                    Boolean bool2 = Boolean.TRUE;
                    Long valueOf = Long.valueOf(c1iz2.LJLIL);
                    String uid4 = author.getUid();
                    o.LJIIIIZZ(uid4, "author.uid");
                    c59872Wp.invoke(bool2, valueOf, uid4);
                }
                author.roomId = c1iz2.LJLIL;
            }
            if (C63081OpJ.LLIIIILZ(aweme) && (LJJJJZI = C63081OpJ.LJJJJZI(aweme)) != null) {
                LJJJJZI.hasUpdateLiving = true;
            }
            C53887LCx c53887LCx = selectSubscribe.LLF;
            if (c53887LCx != null) {
                c53887LCx.LIZIZ(author, FeedAvatarLiveAssem.class, selectSubscribe.LLI, aweme);
            } else {
                o.LJIJI("avatarBorderViewController");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
