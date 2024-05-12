package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.assem.AdPopUpWebPageAssem;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.NXv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59527NXv extends AbstractC65781Prl implements InterfaceC88471Ynr<AdPopUpWebPageAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C59527NXv LJLIL = new C59527NXv();

    public C59527NXv() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdPopUpWebPageAssem adPopUpWebPageAssem, C43I<? extends C76800UCe> c43i) {
        AdPopUpWebPageAssem selectSubscribe = adPopUpWebPageAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((VideoPlayViewModel) selectSubscribe.LJZL.getValue()).hv0();
        return C76800UCe.LIZ;
    }
}
