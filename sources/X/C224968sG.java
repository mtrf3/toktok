package X;

import com.ss.android.ugc.aweme.feed.assem.GuideBackToFYPAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8sG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224968sG extends AbstractC65781Prl implements InterfaceC88471Ynr<GuideBackToFYPAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C224968sG LJLIL = new C224968sG();

    public C224968sG() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(GuideBackToFYPAssem guideBackToFYPAssem, C43I<? extends Integer> c43i) {
        LXS LIZ;
        GuideBackToFYPAssem selectSubscribe = guideBackToFYPAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
            o.LJIIIIZZ(aid, "item.aweme.aid");
            if (C224948sE.LIZ(aid) && ((LIZ = LXU.LIZ()) == null || !LIZ.LIZIZ)) {
                selectSubscribe.getContainerView().setVisibility(0);
                C29701Eo c29701Eo = selectSubscribe.LLFII;
                if (c29701Eo != null) {
                    c29701Eo.playAnimation();
                }
                LXS LIZ2 = LXU.LIZ();
                if (LIZ2 != null) {
                    LIZ2.LIZJ(true);
                }
                C221018lt.LJFF("GuideFYPAssem", "show guide!");
                GuideBackToFYPAssem.q4("show");
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("selected position:");
            LIZ3.append(((Number) c43i2.LIZ).intValue());
            C221018lt.LJFF("GuideFYPAssem", X1D.LIZIZ(LIZ3));
        }
        return C76800UCe.LIZ;
    }
}
