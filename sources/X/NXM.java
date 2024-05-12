package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.assem.AdLightWebPageAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NXM extends AbstractC65781Prl implements InterfaceC88471Ynr<AdLightWebPageAssem, C43I<? extends Integer>, C76800UCe> {
    public static final NXM LJLIL = new NXM();

    public NXM() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdLightWebPageAssem adLightWebPageAssem, C43I<? extends Integer> c43i) {
        VideoItemParams gv0;
        Fragment fragment;
        VideoItemParams gv02;
        AdLightWebPageAssem selectSubscribe = adLightWebPageAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if ((!C53324KwK.LIZ() || c43i != null) && (gv0 = selectSubscribe.Z3().gv0()) != null && (fragment = gv0.fragment) != null && fragment.mo49getActivity() != null && (gv02 = selectSubscribe.Z3().gv0()) != null && gv02.getAweme() != null) {
            selectSubscribe.b4();
        }
        return C76800UCe.LIZ;
    }
}
