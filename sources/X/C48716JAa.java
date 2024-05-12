package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.JAa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48716JAa extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends Boolean>, C76800UCe> {
    public static final C48716JAa LJLIL = new C48716JAa();

    public C48716JAa() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends Boolean> c43i) {
        IMidAdAbility z4;
        MidAdCellComponent selectSubscribe = midAdCellComponent;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (((Boolean) it.LIZ).booleanValue() && (z4 = selectSubscribe.z4()) != null) {
            z4.LJJIIZ();
        }
        return C76800UCe.LIZ;
    }
}
