package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.assem.AdLightWebPageAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NXY extends AbstractC65781Prl implements InterfaceC88471Ynr<AdLightWebPageAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final NXY LJLIL = new NXY();

    public NXY() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdLightWebPageAssem adLightWebPageAssem, C43I<? extends C195357lb> c43i) {
        AdLightWebPageAssem selectSubscribe = adLightWebPageAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() || c43i != null) {
            if (C59982Xa.LIZIZ()) {
                selectSubscribe.LL.removeCallbacks(selectSubscribe.LLD);
                selectSubscribe.LL.post(selectSubscribe.LLD);
            } else {
                NVB nvb = selectSubscribe.LJZL;
                if (nvb != null) {
                    nvb.LJ();
                    C16880lQ.LJLLL(nvb, (ViewGroup) selectSubscribe.getContainerView());
                }
                selectSubscribe.LJZL = null;
            }
        }
        return C76800UCe.LIZ;
    }
}
