package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS11S1201000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R5R extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C68322mC<R5M> LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5R(String str, int i, C68322mC c68322mC, ActivityC45651qj activityC45651qj, InterfaceC65784Pro interfaceC65784Pro) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = c68322mC;
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.j_7, new AqS11S1201000_11(this.LJLIL, (String) this.LJLILLLLZI, (int) this.LJLJI, (C68322mC<R5M>) this.LJLJJI, (Activity) 1));
        actionGroup.LJIIIIZZ(R.string.jah, new R5S(this.LJLILLLLZI, this.LJLIL, this.LJLJJL));
        return C76800UCe.LIZ;
    }
}
