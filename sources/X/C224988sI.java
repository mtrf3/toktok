package X;

import com.ss.android.ugc.aweme.feed.assem.GuideBackToFYPAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8sI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224988sI extends AbstractC65781Prl implements InterfaceC88471Ynr<GuideBackToFYPAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C224988sI LJLIL = new C224988sI();

    public C224988sI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(GuideBackToFYPAssem guideBackToFYPAssem, C43I<? extends C195357lb> c43i) {
        GuideBackToFYPAssem selectSubscribe = guideBackToFYPAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
            o.LJIIIIZZ(aid, "item.aweme.aid");
            if (C224948sE.LIZ(aid)) {
                selectSubscribe.p4("scroll");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("un selected item position: ");
                LIZ.append(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).currentPosition);
                C221018lt.LJFF("GuideFYPAssem", X1D.LIZIZ(LIZ));
            }
        }
        return C76800UCe.LIZ;
    }
}
