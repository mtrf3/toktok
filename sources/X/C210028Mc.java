package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.top.topwarn.TopWarnComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.8Mc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210028Mc extends AbstractC65781Prl implements InterfaceC88471Ynr<TopWarnComponent, C43I<? extends Integer>, C76800UCe> {
    public static final C210028Mc LJLIL = new C210028Mc();

    public C210028Mc() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(TopWarnComponent topWarnComponent, C43I<? extends Integer> c43i) {
        TopWarnComponent selectSubscribe = topWarnComponent;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            selectSubscribe.B2(((Number) c43i2.LIZ).intValue(), ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
        }
        return C76800UCe.LIZ;
    }
}
