package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8Sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211598Sd extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractAreaComponent, C43I<? extends String>, C76800UCe> {
    public static final C211598Sd LJLIL = new C211598Sd();

    public C211598Sd() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractAreaComponent interactAreaComponent, C43I<? extends String> c43i) {
        InteractAreaComponent selectSubscribe = interactAreaComponent;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && c43i2.LIZ != 0) {
            C217628gQ.LIZIZ.LJII(selectSubscribe, selectSubscribe.a1().LIZ, ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
        }
        return C76800UCe.LIZ;
    }
}
