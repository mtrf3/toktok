package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.JAv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48737JAv extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends Boolean>, C76800UCe> {
    public static final C48737JAv LJLIL = new C48737JAv();

    public C48737JAv() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends Boolean> c43i) {
        MidAdCellComponent selectSubscribe = midAdCellComponent;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            boolean booleanValue = ((Boolean) c43i2.LIZ).booleanValue();
            selectSubscribe.LLIIL.LIZLLL = booleanValue;
            selectSubscribe.D4(booleanValue, true);
        }
        return C76800UCe.LIZ;
    }
}
