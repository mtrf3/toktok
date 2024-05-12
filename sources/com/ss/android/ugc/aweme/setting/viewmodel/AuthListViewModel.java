package com.ss.android.ugc.aweme.setting.viewmodel;

import X.AYG;
import X.AYP;
import X.AYQ;
import X.C70839Rr9;
import X.InterfaceC88472Yns;
import X.TBT;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthInfoState;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;

/* loaded from: classes5.dex */
public final class AuthListViewModel extends JediViewModel<AuthInfoState> {
    public final AYG LJLJJLL = new AYG();
    public final MutableLiveData<AuthorizedStruct> LJLJL = new MutableLiveData<>();
    public final ListMiddleware<AuthInfoState, AuthorizedStruct, C70839Rr9> LJLJLJ = new ListMiddleware<>(new AqS170S0100000_4(this, 784), (InterfaceC88472Yns) null, new AqS186S0100000_4(this, 189), AYP.LJLIL);

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final AuthInfoState kv0() {
        return new AuthInfoState(null, 1, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        ListMiddleware<AuthInfoState, AuthorizedStruct, C70839Rr9> listMiddleware = this.LJLJLJ;
        listMiddleware.LJ(new TBT() { // from class: X.AYR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((AuthInfoState) obj).getListState();
            }
        }, AYQ.LJLIL);
        iv0(listMiddleware);
        this.LJLJLJ.refresh();
    }
}
