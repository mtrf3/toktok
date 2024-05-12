package X;

import Y.ARunnableS46S0100000_10;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.BottomSurveyAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OMB extends AbstractC65781Prl implements InterfaceC88471Ynr<BottomSurveyAssem, C43I<? extends Integer>, C76800UCe> {
    public static final OMB LJLIL = new OMB();

    public OMB() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(BottomSurveyAssem bottomSurveyAssem, C43I<? extends Integer> c43i) {
        BottomSurveyAssem selectSubscribe = bottomSurveyAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && ((Number) c43i2.LIZ).intValue() == ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).currentPosition) {
            OMI omi = selectSubscribe.LLIIIILZ;
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            omi.LJLIL = aweme;
            omi.LJLILLLLZI = OMU.LIZJ(aweme);
            omi.LJLJI = C79081V1x.LJIILLIIL(aweme);
            selectSubscribe.getContainerView().postDelayed(new ARunnableS46S0100000_10(selectSubscribe, 62), 1000L);
        }
        return C76800UCe.LIZ;
    }
}
