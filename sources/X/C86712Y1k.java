package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusAssem;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS57S0110000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86712Y1k extends AbstractC65781Prl implements InterfaceC88471Ynr<TranslationStatusAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C86712Y1k LJLIL = new C86712Y1k();

    public C86712Y1k() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(TranslationStatusAssem translationStatusAssem, C43I<? extends Integer> c43i) {
        InterfaceC88472Yns<? super String[], C76800UCe> interfaceC88472Yns;
        Aweme aweme;
        TranslationStatusAssem selectSubscribe = translationStatusAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            ICLACaptionService LIZ = IQD.LIZ();
            Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            o.LJIIIIZZ(aweme2, "item.aweme");
            if (LIZ.LJFF(aweme2)) {
                selectSubscribe.Y3().setVisibility(8);
            } else {
                selectSubscribe.Y3().setVisibility(0);
                TranslationStatusViewModel u4 = selectSubscribe.u4();
                u4.LJLLLL = true;
                u4.LJZL = null;
                if (C53150KtW.LIZ() || (!C52929Kpx.LIZ())) {
                    ITranslationLangKevaService LIZ2 = C25792AAi.LIZ();
                    if (!C52929Kpx.LIZ()) {
                        interfaceC88472Yns = new XMI(u4);
                    } else {
                        interfaceC88472Yns = u4.LLF;
                    }
                    LIZ2.LIZJ(interfaceC88472Yns);
                    u4.LJZ = C25792AAi.LIZ().LJIIIIZZ();
                }
                if (C41032G8m.LIZ()) {
                    u4.setState(Y38.LJLIL);
                }
                boolean ov0 = u4.ov0();
                if (C2305192x.LIZIZ() && C2305192x.LIZ(u4.LJLJI)) {
                    VideoItemParams gv0 = u4.gv0();
                    if (gv0 != null && (aweme = gv0.getAweme()) != null) {
                        ((C93Z) u4.LL.getValue()).LJ(aweme, u4.LLD);
                    }
                    u4.tv0(false, ov0, ov0);
                }
                if (((Number) C53054Kry.LIZ.getValue()).intValue() == 0) {
                    u4.withState(new AqS57S0110000_15(u4.ov0(), u4, 1));
                }
                C46290IEs.LIZ().LJ(new AqS165S0100000_15(selectSubscribe, 662));
            }
        }
        return C76800UCe.LIZ;
    }
}
