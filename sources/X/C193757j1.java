package X;

import com.ss.android.ugc.aweme.nows.feed.ui.NowPostCoverAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7j1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193757j1 extends AbstractC65781Prl implements InterfaceC88471Ynr<NowPostCoverAssem, C43I<? extends EnumC196967oC>, C76800UCe> {
    public static final C193757j1 LJLIL = new C193757j1();

    public C193757j1() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowPostCoverAssem selectSubscribe, C43I<? extends EnumC196967oC> c43i) {
        Object obj;
        C43I<? extends EnumC196967oC> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (obj = c43i2.LIZ) != null && obj != EnumC196967oC.VERTICAL_SCROLL && obj != EnumC196967oC.HORIZONTAL_SCROLL && obj != EnumC196967oC.HOX_CHANGE) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("receive areaChangedEvent, reason=");
            LIZ.append(obj);
            C7XD.LIZ("NowPostCoverAssem", X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }
}
