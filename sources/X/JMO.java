package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchSingleLiveTagAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JMO extends AbstractC65781Prl implements InterfaceC88472Yns<C8NH, C76800UCe> {
    public static final JMO LJLIL = new JMO();

    public JMO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NH c8nh) {
        C8NH reusedUiSlotAssem = c8nh;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        reusedUiSlotAssem.LIZ = C65352Pkq.LIZ(SearchSingleLiveTagAssem.class);
        reusedUiSlotAssem.LIZJ = new SearchSingleLiveTagAssem();
        reusedUiSlotAssem.LIZLLL = R.id.dek;
        return C76800UCe.LIZ;
    }
}
