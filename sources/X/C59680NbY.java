package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.NbY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59680NbY extends AbstractC65781Prl implements InterfaceC88471Ynr<AdPlayFunAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C59680NbY LJLIL = new C59680NbY();

    public C59680NbY() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AdPlayFunAssem adPlayFunAssem, C43I<? extends Boolean> c43i) {
        float f;
        AdPlayFunAssem selectSubscribe = adPlayFunAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        InterfaceC59688Nbg c4 = selectSubscribe.c4();
        if (c43i2 != null && !((Boolean) c43i2.LIZ).booleanValue()) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        c4.setAlpha(f);
        return C76800UCe.LIZ;
    }
}
