package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS50S1200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JmF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50151JmF extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ TuxTextView LJLIL;
    public final /* synthetic */ QueryDesc LJLILLLLZI;
    public final /* synthetic */ List<Position> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C50150JmE LJLJJL;
    public final /* synthetic */ QueryCorrectComponentInfo LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50151JmF(TuxTextView tuxTextView, QueryDesc queryDesc, List<Position> list, String str, C50150JmE c50150JmE, QueryCorrectComponentInfo queryCorrectComponentInfo) {
        super(0);
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = queryDesc;
        this.LJLJI = list;
        this.LJLJJI = str;
        this.LJLJJL = c50150JmE;
        this.LJLJJLL = queryCorrectComponentInfo;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean LIZLLL = C50233JnZ.LIZLLL(this.LJLIL);
        TuxTextView tuxTextView = this.LJLIL;
        String str = this.LJLILLLLZI.text;
        AbstractC65590Pog copyOf = AbstractC65590Pog.copyOf((Collection) this.LJLJI);
        o.LJIIIIZZ(copyOf, "copyOf(positions)");
        C50233JnZ.LIZ(tuxTextView, LIZLLL, str, copyOf, this.LJLJJI, this.LJLILLLLZI.clickable, !this.LJLJI.isEmpty(), 43, new AqS50S1200000_8(this.LJLJJL, this.LJLJJLL, this.LJLJJI, 7));
        return C76800UCe.LIZ;
    }
}
