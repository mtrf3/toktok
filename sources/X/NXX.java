package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AdPopUpWebPageAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NXX extends AbstractC65781Prl implements InterfaceC88471Ynr<AdPopUpWebPageAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final NXX LJLIL = new NXX();

    public NXX() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdPopUpWebPageAssem adPopUpWebPageAssem, C43I<? extends C195357lb> c43i) {
        AdPopUpWebPageAssem selectSubscribe = adPopUpWebPageAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() || c43i != null) {
            NWF nwf = selectSubscribe.LLFF;
            if (nwf != null) {
                nwf.LJIJ();
                C16880lQ.LJLLL(nwf, (ViewGroup) selectSubscribe.getContainerView());
            }
            selectSubscribe.LLFF = null;
            selectSubscribe.a4().LJLLILLLL = false;
        }
        return C76800UCe.LIZ;
    }
}
