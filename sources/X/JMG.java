package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JMG extends AbstractC65781Prl implements InterfaceC88472Yns<JMP<C49013JLl>, C76800UCe> {
    public static final JMG LJLIL = new JMG();

    public JMG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JMP<C49013JLl> jmp) {
        JMP<C49013JLl> ui = jmp;
        o.LJIIIZ(ui, "$this$ui");
        ui.LIZ = new JMI(C65352Pkq.LIZ(SearchMixLiveCardContentAssem.class), null);
        C48996JKu c48996JKu = C48996JKu.LJLIL;
        C65776Prg LIZ = SearchSingleCardTemplateServiceImpl.LIZJ().LIZ();
        C48997JKv c48997JKv = new C48997JKv(0);
        if (c48996JKu != null) {
            c48996JKu.invoke(c48997JKv);
        }
        ui.LIZIZ = new JMI(LIZ, c48997JKv);
        return C76800UCe.LIZ;
    }
}
