package X;

import android.util.Range;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.Position;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JnY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50232JnY extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ TextView LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI = R.attr.bx;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ List<Position> LJLJJLL;
    public final /* synthetic */ Range<Integer> LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50232JnY(TuxTextView tuxTextView, String str, String str2, boolean z, List list, Range range, boolean z2, int i, InterfaceC88472Yns interfaceC88472Yns) {
        super(0);
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJL = z;
        this.LJLJJLL = list;
        this.LJLJL = range;
        this.LJLJLJ = z2;
        this.LJLJLLL = i;
        this.LJLL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (C50233JnZ.LIZLLL(this.LJLIL)) {
            TextView textView = this.LJLIL;
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            int i = this.LJLJJI;
            boolean z = this.LJLJJL;
            AbstractC65590Pog copyOf = AbstractC65590Pog.copyOf((Collection) this.LJLJJLL);
            o.LJIIIIZZ(copyOf, "copyOf(truncatedBoldPositions)");
            C50233JnZ.LIZJ(textView, str, str2, i, z, copyOf, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL);
        }
        return C76800UCe.LIZ;
    }
}
