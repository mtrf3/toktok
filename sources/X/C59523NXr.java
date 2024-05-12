package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AdPopUpWebPageAssem;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.NXr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59523NXr extends AbstractC65781Prl implements InterfaceC88471Ynr<AdPopUpWebPageAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C59523NXr LJLIL = new C59523NXr();

    public C59523NXr() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdPopUpWebPageAssem adPopUpWebPageAssem, C43I<? extends C76800UCe> c43i) {
        NWF nwf;
        AdPopUpWebPageAssem selectSubscribe = adPopUpWebPageAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if ((!C53324KwK.LIZ() || c43i != null) && (nwf = selectSubscribe.LLFF) != null && nwf.LJIIJJI()) {
            ((VideoPlayViewModel) selectSubscribe.LJZL.getValue()).LJJJJL();
        }
        return C76800UCe.LIZ;
    }
}
