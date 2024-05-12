package X;

import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JMV extends AbstractC65781Prl implements InterfaceC88472Yns<JMW, C76800UCe> {
    public static final JMV LJLIL = new JMV();

    public JMV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JMW jmw) {
        JMW searchReusedUiSlotAssem = jmw;
        o.LJIIIZ(searchReusedUiSlotAssem, "$this$searchReusedUiSlotAssem");
        searchReusedUiSlotAssem.LIZ = SearchComponentCenter.SoundIcon.LIZ;
        searchReusedUiSlotAssem.LIZIZ = R.id.lb_;
        return C76800UCe.LIZ;
    }
}
