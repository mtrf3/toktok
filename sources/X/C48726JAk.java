package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JAk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48726JAk extends AbstractC65781Prl implements InterfaceC88471Ynr<MidAdCellComponent, C43I<? extends Boolean>, C76800UCe> {
    public static final C48726JAk LJLIL = new C48726JAk();

    public C48726JAk() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(MidAdCellComponent midAdCellComponent, C43I<? extends Boolean> c43i) {
        Aweme aweme;
        String aid;
        MidAdCellComponent selectSubscribe = midAdCellComponent;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && !((Boolean) c43i2.LIZ).booleanValue()) {
            selectSubscribe.C4(selectSubscribe.A4().LJLJLLL, false);
            MidAdVM A4 = selectSubscribe.A4();
            A4.setState(C48730JAo.LJLIL);
            A4.LJLLLL = false;
            A4.LJLLLLLL = false;
            A4.LJLLILLLL = false;
            A4.LJLZ = false;
            if (C1DJ.LJIJJLI(selectSubscribe.A4().LJLJLLL) && (aweme = selectSubscribe.A4().LJLJLLL) != null && (aid = aweme.getAid()) != null) {
                JAY.LJ.add(aid);
            }
        }
        return C76800UCe.LIZ;
    }
}
