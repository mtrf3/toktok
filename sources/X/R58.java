package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;

/* loaded from: classes12.dex */
public final class R58 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ LoginMethodListFragment LJLIL;
    public final /* synthetic */ BaseLoginMethod LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ View LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R58(LoginMethodListFragment loginMethodListFragment, BaseLoginMethod baseLoginMethod, int i, View view) {
        super(0);
        this.LJLIL = loginMethodListFragment;
        this.LJLILLLLZI = baseLoginMethod;
        this.LJLJI = i;
        this.LJLJJI = view;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.Kl(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, true);
        return C76800UCe.LIZ;
    }
}
