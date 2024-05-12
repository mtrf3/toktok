package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.NbZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59681NbZ extends AbstractC65781Prl implements InterfaceC88471Ynr<AdPlayFunAssem, C43I<? extends NL9>, C76800UCe> {
    public static final C59681NbZ LJLIL = new C59681NbZ();

    public C59681NbZ() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdPlayFunAssem adPlayFunAssem, C43I<? extends NL9> c43i) {
        AdPlayFunAssem selectSubscribe = adPlayFunAssem;
        C43I<? extends NL9> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C53324KwK.LIZ() ? c43i2 != null : c43i2 != null) {
            NL9 nl9 = (NL9) c43i2.LIZ;
            if (nl9 != null) {
                selectSubscribe.c4().LIZLLL(nl9);
            }
        }
        return C76800UCe.LIZ;
    }
}
