package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardCreateTimeAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JMK extends AbstractC65781Prl implements InterfaceC88472Yns<C8NH, C76800UCe> {
    public static final JMK LJLIL = new JMK();

    public JMK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NH c8nh) {
        C8NH reusedUiSlotAssem = c8nh;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        reusedUiSlotAssem.LIZ = C65352Pkq.LIZ(SearchCardCreateTimeAssem.class);
        reusedUiSlotAssem.LIZJ = new SearchCardCreateTimeAssem();
        reusedUiSlotAssem.LIZLLL = R.id.n96;
        return C76800UCe.LIZ;
    }
}
