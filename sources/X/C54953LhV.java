package X;

import com.ss.android.ugc.aweme.toptab.ui.LiveSingleFeedContentAssem;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LhV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54953LhV extends AbstractC65781Prl implements InterfaceC88472Yns<C223208pQ, C76800UCe> {
    public final /* synthetic */ LiveSingleFeedContentAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54953LhV(LiveSingleFeedContentAssem liveSingleFeedContentAssem) {
        super(1);
        this.LJLIL = liveSingleFeedContentAssem;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C223208pQ it) {
        o.LJIIIZ(it, "it");
        LiveSingleFeedContentAssem liveSingleFeedContentAssem = this.LJLIL;
        liveSingleFeedContentAssem.withState(liveSingleFeedContentAssem.v3(), new AqS175S0100000_9(this.LJLIL, 315));
        LiveSingleFeedContentAssem liveSingleFeedContentAssem2 = this.LJLIL;
        boolean z = false;
        liveSingleFeedContentAssem2.LJLJJI = false;
        InterfaceC50037JkP interfaceC50037JkP = liveSingleFeedContentAssem2.LJLJJL;
        if (interfaceC50037JkP != null) {
            int size = ((ArrayList) liveSingleFeedContentAssem2.v3().LJLJI).size();
            int i = liveSingleFeedContentAssem2.LJLJJLL;
            if (1 <= i && i < size) {
                z = true;
            }
            if (z) {
                interfaceC50037JkP.LIZ(((ArrayList) liveSingleFeedContentAssem2.v3().LJLJI).subList(liveSingleFeedContentAssem2.LJLJJLL, size), null);
            } else {
                interfaceC50037JkP.onFail(-1, "no result");
            }
            liveSingleFeedContentAssem2.LJLJJL = null;
        }
        return C76800UCe.LIZ;
    }
}
