package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Nbf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59687Nbf extends AbstractC65781Prl implements InterfaceC88471Ynr<AdPlayFunAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C59687Nbf LJLIL = new C59687Nbf();

    public C59687Nbf() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdPlayFunAssem adPlayFunAssem, C43I<? extends C76800UCe> c43i) {
        AdPlayFunAssem selectSubscribe = adPlayFunAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() || c43i != null) {
            selectSubscribe.c4().resume();
        }
        return C76800UCe.LIZ;
    }
}
