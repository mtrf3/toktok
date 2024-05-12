package X;

import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.right.InteractRightAreaComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.7zR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203937zR extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractRightAreaComponent, C43I<? extends Integer>, C76800UCe> {
    public static final C203937zR LJLIL = new C203937zR();

    public C203937zR() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractRightAreaComponent interactRightAreaComponent, C43I<? extends Integer> c43i) {
        InteractRightAreaComponent selectSubscribe = interactRightAreaComponent;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && C51029K0z.LJIIZILJ(selectSubscribe) == ((Number) c43i2.LIZ).intValue() && FavoriteServiceImpl.LJIJJLI().LJI() <= 0) {
            C203857zJ.LIZIZ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
        }
        return C76800UCe.LIZ;
    }
}
