package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.811, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass811 extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedPhotoSlideAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final AnonymousClass811 LJLIL = new AnonymousClass811();

    public AnonymousClass811() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedPhotoSlideAssem feedPhotoSlideAssem, C43I<? extends C76800UCe> c43i) {
        FeedPhotoSlideAssem selectSubscribe = feedPhotoSlideAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        IAutoAScrollAbility LIZ = C224888s8.LIZ(null);
        if (LIZ != null) {
            LIZ.wm(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
        }
        return C76800UCe.LIZ;
    }
}
