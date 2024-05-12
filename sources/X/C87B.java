package X;

import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.87B, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87B extends AbstractC65781Prl implements InterfaceC88471Ynr<RightAreaContainerAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C87B LJLIL = new C87B();

    public C87B() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(RightAreaContainerAssem rightAreaContainerAssem, C43I<? extends Integer> c43i) {
        Aweme aweme;
        RightAreaContainerAssem selectSubscribe = rightAreaContainerAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && ((Number) c43i2.LIZ).intValue() == C51029K0z.LJIIZILJ(selectSubscribe) && FavoriteServiceImpl.LJIJJLI().LJI() <= 0) {
            VideoItemParams gv0 = selectSubscribe.Z3().gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            C203857zJ.LIZIZ(aweme);
        }
        return C76800UCe.LIZ;
    }
}
