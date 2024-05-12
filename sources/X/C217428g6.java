package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntranceAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8g6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217428g6 extends AbstractC65781Prl implements InterfaceC88471Ynr<LandscapeEntranceAssem, C43I<? extends Aweme>, C76800UCe> {
    public static final C217428g6 LJLIL = new C217428g6();

    public C217428g6() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(LandscapeEntranceAssem landscapeEntranceAssem, C43I<? extends Aweme> c43i) {
        int i;
        LandscapeEntranceAssem selectSubscribe = landscapeEntranceAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            View containerView = selectSubscribe.getContainerView();
            if (C79004UzY.LJJIJIIJIL(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) {
                i = 0;
            } else {
                i = 8;
            }
            containerView.setVisibility(i);
        }
        return C76800UCe.LIZ;
    }
}
