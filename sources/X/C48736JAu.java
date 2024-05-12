package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.JAu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48736JAu extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends Boolean>, C76800UCe> {
    public static final C48736JAu LJLIL = new C48736JAu();

    public C48736JAu() {
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
            selectSubscribe.LLIIL.LIZIZ = booleanValue;
            selectSubscribe.D4(booleanValue, true);
        }
        return C76800UCe.LIZ;
    }
}
