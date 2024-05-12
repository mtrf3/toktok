package X;

import android.content.Context;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R5F extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C85531XhX LJLJJI;
    public final /* synthetic */ BaseLoginMethod LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5F(int i, int i2, int i3, C85531XhX c85531XhX, BaseLoginMethod baseLoginMethod, Context context) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = c85531XhX;
        this.LJLJJL = baseLoginMethod;
        this.LJLJJLL = context;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(this.LJLIL, new R5E(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL));
        actionGroup.LJIIIIZZ(this.LJLILLLLZI, null);
        return C76800UCe.LIZ;
    }
}
