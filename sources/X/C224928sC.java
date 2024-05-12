package X;

import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.GuideBackToFYPAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8sC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224928sC extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedVideoAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C224928sC LJLIL = new C224928sC();

    public C224928sC() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedVideoAssem feedVideoAssem, C43I<? extends Integer> c43i) {
        FeedVideoAssem selectSubscribe = feedVideoAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            int intValue = ((Number) c43i2.LIZ).intValue();
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
            o.LJIIIIZZ(aid, "item.aweme.aid");
            if (C224948sE.LIZ(aid)) {
                C8VR.LIZJ(selectSubscribe, C65352Pkq.LIZ(GuideBackToFYPAssem.class));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("trigger lazy load! pos: ");
                LIZ.append(intValue);
                C221018lt.LJFF("GuideFYPAssem", X1D.LIZIZ(LIZ));
            }
        }
        return C76800UCe.LIZ;
    }
}
