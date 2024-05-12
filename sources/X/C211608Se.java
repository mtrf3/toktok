package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8Se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211608Se extends AbstractC65781Prl implements InterfaceC88471Ynr<InteractAreaComponent, C43I<? extends C70012ov>, C76800UCe> {
    public static final C211608Se LJLIL = new C211608Se();

    public C211608Se() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InteractAreaComponent interactAreaComponent, C43I<? extends C70012ov> c43i) {
        C70012ov c70012ov;
        InteractAreaComponent selectSubscribe = interactAreaComponent;
        C43I<? extends C70012ov> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c70012ov = (C70012ov) c43i2.LIZ) != null && c70012ov.LJLJJL) {
            selectSubscribe.B2(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).currentPosition, ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
            C211628Sg c211628Sg = selectSubscribe.LLFZ;
            if (c211628Sg != null) {
                c211628Sg.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
            }
        }
        return C76800UCe.LIZ;
    }
}
