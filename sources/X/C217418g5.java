package X;

import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntranceAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8g5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217418g5 extends AbstractC65781Prl implements InterfaceC88471Ynr<LandscapeEntranceAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C217418g5 LJLIL = new C217418g5();

    public C217418g5() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(LandscapeEntranceAssem landscapeEntranceAssem, C43I<? extends C76800UCe> c43i) {
        LandscapeEntranceAssem selectSubscribe = landscapeEntranceAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && selectSubscribe.LLI && selectSubscribe.getContainerView().getVisibility() == 0) {
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            String str = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType;
            o.LJIIIIZZ(str, "item.eventType");
            C218678i7.LIZIZ(0, str, aweme);
        }
        return C76800UCe.LIZ;
    }
}
