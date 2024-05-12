package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Nc6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59714Nc6 extends AbstractC65781Prl implements InterfaceC88471Ynr<AdInteractiveAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C59714Nc6 LJLIL = new C59714Nc6();

    public C59714Nc6() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdInteractiveAssem adInteractiveAssem, C43I<? extends C76800UCe> c43i) {
        AdInteractiveAssem selectSubscribe = adInteractiveAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if ((!C53324KwK.LIZ() || c43i != null) && !selectSubscribe.c4().isShowing()) {
            selectSubscribe.c4().reset();
        }
        return C76800UCe.LIZ;
    }
}
