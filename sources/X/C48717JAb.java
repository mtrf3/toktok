package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JAb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48717JAb extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends String>, C76800UCe> {
    public static final C48717JAb LJLIL = new C48717JAb();

    public C48717JAb() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends String> c43i) {
        Aweme aweme;
        MidAdCellComponent selectSubscribe = midAdCellComponent;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && ((aweme = selectSubscribe.A4().LJLJLLL) == null || !C63081OpJ.LJZL(aweme))) {
            selectSubscribe.LJJJ();
        }
        return C76800UCe.LIZ;
    }
}
