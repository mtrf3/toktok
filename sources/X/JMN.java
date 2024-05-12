package X;

import com.ss.android.ugc.aweme.search.pages.result.bot.component.TakoVideoPlayerAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JMN extends AbstractC65781Prl implements InterfaceC88472Yns<C8NH, C76800UCe> {
    public static final JMN LJLIL = new JMN();

    public JMN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8NH c8nh) {
        C8NH reusedUiSlotAssem = c8nh;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        reusedUiSlotAssem.LIZ = C65352Pkq.LIZ(TakoVideoPlayerAssem.class);
        reusedUiSlotAssem.LIZJ = new TakoVideoPlayerAssem();
        reusedUiSlotAssem.LIZLLL = R.id.n71;
        return C76800UCe.LIZ;
    }
}
