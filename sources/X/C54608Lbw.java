package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.AqS33S0001000_9;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.AqS62S1100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lbw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54608Lbw extends AbstractC65781Prl implements InterfaceC88472Yns<Assembler, C76800UCe> {
    public final /* synthetic */ Fragment LJLIL;
    public final /* synthetic */ int LJLILLLLZI = R.id.k3y;
    public final /* synthetic */ int LJLJI = R.id.k3x;
    public final /* synthetic */ int LJLJJI = R.id.bps;
    public final /* synthetic */ String LJLJJL = "homepage_friends";
    public final /* synthetic */ C54406LWw LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54608Lbw(Fragment fragment, C54406LWw c54406LWw) {
        super(1);
        this.LJLIL = fragment;
        this.LJLJJLL = c54406LWw;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Assembler assembler) {
        Assembler assemble = assembler;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.xv0(this.LJLIL, new AqS28S0001000_3(this.LJLILLLLZI, 17));
        assemble.xv0(this.LJLIL, new AqS36S0001000_12(this.LJLJI, 7));
        assemble.wv0(this.LJLIL, new AqS33S0001000_9(this.LJLJJI, 3));
        assemble.mv0(this.LJLIL, new AqS62S1100000_9(this.LJLJJL, this.LJLJJLL, 3));
        return C76800UCe.LIZ;
    }
}
