package X;

import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntranceAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8g4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217408g4 extends AbstractC65781Prl implements InterfaceC88471Ynr<LandscapeEntranceAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C217408g4 LJLIL = new C217408g4();

    public C217408g4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(LandscapeEntranceAssem landscapeEntranceAssem, C43I<? extends Integer> c43i) {
        LandscapeEntranceAssem selectSubscribe = landscapeEntranceAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && C79004UzY.LJJIJIIJIL(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) {
            selectSubscribe.LLI = true;
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            String str = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType;
            if (aweme != null) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", str);
                c188727au.LJIIIZ("group_id", aweme.getAid());
                c188727au.LIZLLL(aweme.getVideo().getDuration(), "item_duration");
                c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
                FMX.LJIIL("landscape_screen_entrance_show", c188727au.LIZ);
            }
            Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            String str2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType;
            o.LJIIIIZZ(str2, "item.eventType");
            C218678i7.LIZIZ(0, str2, aweme2);
        }
        return C76800UCe.LIZ;
    }
}
