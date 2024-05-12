package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Nc5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59713Nc5 extends AbstractC65781Prl implements InterfaceC88471Ynr<AdInteractiveAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C59713Nc5 LJLIL = new C59713Nc5();

    public C59713Nc5() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdInteractiveAssem adInteractiveAssem, C43I<? extends Integer> c43i) {
        AdInteractiveAssem selectSubscribe = adInteractiveAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && ((Number) c43i2.LIZ).intValue() == 1) {
            selectSubscribe.LLFFF = true;
        }
        return C76800UCe.LIZ;
    }
}
