package X;

import android.view.View;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;

/* renamed from: X.R3u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68938R3u<T> implements Observer {
    public final /* synthetic */ BaseLoginMethod LJLIL;
    public final /* synthetic */ LoginMethodListFragment LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    public C68938R3u(int i, View view, BaseLoginMethod baseLoginMethod, LoginMethodListFragment loginMethodListFragment, boolean z) {
        this.LJLIL = baseLoginMethod;
        this.LJLILLLLZI = loginMethodListFragment;
        this.LJLJI = i;
        this.LJLJJI = view;
        this.LJLJJL = z;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (obj != EnumC68524Quu.FINAL) {
            return;
        }
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) ORZ.LJLLLL(C68517Qun.LIZ.LJI(this.LJLIL.getUid()));
        LoginMethodListFragment loginMethodListFragment = this.LJLILLLLZI;
        if (baseLoginMethod == null) {
            baseLoginMethod = this.LJLIL;
        }
        loginMethodListFragment.Hl(baseLoginMethod, this.LJLJI, this.LJLJJI, this.LJLJJL);
    }
}
