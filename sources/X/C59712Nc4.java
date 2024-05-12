package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.interactivead.AdInteractiveAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.Nc4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59712Nc4 extends AbstractC65781Prl implements InterfaceC88471Ynr<AdInteractiveAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C59712Nc4 LJLIL = new C59712Nc4();

    public C59712Nc4() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdInteractiveAssem adInteractiveAssem, C43I<? extends Integer> c43i) {
        AdInteractiveAssem selectSubscribe = adInteractiveAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            if (((Number) c43i2.LIZ).intValue() == 1) {
                selectSubscribe.LLFFF = false;
            }
            selectSubscribe.e4();
        }
        return C76800UCe.LIZ;
    }
}
