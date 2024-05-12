package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8Sf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211618Sf extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractAreaComponent, C43I<? extends Integer>, C76800UCe> {
    public static final C211618Sf LJLIL = new C211618Sf();

    public C211618Sf() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractAreaComponent interactAreaComponent, C43I<? extends Integer> c43i) {
        C211628Sg c211628Sg;
        InteractAreaComponent selectSubscribe = interactAreaComponent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && ((selectSubscribe.a1().LIZ == 1 || !C54838Lfe.LJIIZILJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) && (c211628Sg = selectSubscribe.LLFZ) != null)) {
            c211628Sg.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
        }
        return C76800UCe.LIZ;
    }
}
