package X;

import com.ss.android.ugc.aweme.feed.assem.GuideBackToFYPAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8sH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224978sH extends AbstractC65781Prl implements InterfaceC88471Ynr<GuideBackToFYPAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C224978sH LJLIL = new C224978sH();

    public C224978sH() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(GuideBackToFYPAssem guideBackToFYPAssem, C43I<? extends Integer> c43i) {
        GuideBackToFYPAssem selectSubscribe = guideBackToFYPAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
        o.LJIIIIZZ(aid, "item.aweme.aid");
        if (C224948sE.LIZ(aid) && c43i2 != null) {
            int intValue = ((Number) c43i2.LIZ).intValue();
            if (intValue == 1 || intValue == 5) {
                selectSubscribe.p4("scroll");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("holder pause item position: ");
            LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).currentPosition);
            LIZ.append(", mode:");
            LIZ.append(intValue);
            C221018lt.LJFF("GuideFYPAssem", X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }
}
