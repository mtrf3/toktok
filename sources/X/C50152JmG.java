package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryDesc;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS50S1200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JmG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50152JmG extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ TuxTextView LJLIL;
    public final /* synthetic */ QueryDesc LJLILLLLZI;
    public final /* synthetic */ List<Position> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJL;
    public final /* synthetic */ QueryDesc LJLJJLL;
    public final /* synthetic */ TuxTextView LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ C50150JmE LJLJLLL;
    public final /* synthetic */ QueryCorrectComponentInfo LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50152JmG(TuxTextView tuxTextView, QueryDesc queryDesc, List list, String str, AqS50S1200000_8 aqS50S1200000_8, QueryDesc queryDesc2, TuxTextView tuxTextView2, String str2, C50150JmE c50150JmE, QueryCorrectComponentInfo queryCorrectComponentInfo) {
        super(0);
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = queryDesc;
        this.LJLJI = list;
        this.LJLJJI = str;
        this.LJLJJL = aqS50S1200000_8;
        this.LJLJJLL = queryDesc2;
        this.LJLJL = tuxTextView2;
        this.LJLJLJ = str2;
        this.LJLJLLL = c50150JmE;
        this.LJLL = queryCorrectComponentInfo;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean LIZLLL = C50233JnZ.LIZLLL(this.LJLIL);
        TuxTextView tuxTextView = this.LJLIL;
        String str = this.LJLILLLLZI.text;
        AbstractC65590Pog copyOf = AbstractC65590Pog.copyOf((Collection) this.LJLJI);
        o.LJIIIIZZ(copyOf, "copyOf(positions)");
        C50233JnZ.LIZ(tuxTextView, LIZLLL, str, copyOf, this.LJLJJI, this.LJLILLLLZI.clickable, !this.LJLJI.isEmpty(), 43, this.LJLJJL);
        QueryDesc queryDesc = this.LJLJJLL;
        if (queryDesc != null) {
            TuxTextView tuxTextView2 = this.LJLJL;
            List<Position> list = this.LJLJI;
            String str2 = this.LJLJLJ;
            C50150JmE c50150JmE = this.LJLJLLL;
            QueryCorrectComponentInfo queryCorrectComponentInfo = this.LJLL;
            String str3 = queryDesc.text;
            AbstractC65590Pog copyOf2 = AbstractC65590Pog.copyOf((Collection) list);
            o.LJIIIIZZ(copyOf2, "copyOf(positions)");
            C50233JnZ.LIZ(tuxTextView2, LIZLLL, str3, copyOf2, str2, queryDesc.clickable, false, 0, new AqS50S1200000_8(c50150JmE, queryCorrectComponentInfo, str2, 6));
        }
        return C76800UCe.LIZ;
    }
}
