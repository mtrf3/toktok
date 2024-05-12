package com.ss.android.ugc.aweme.notificationlive.ui;

import X.AYV;
import X.C34K;
import X.C68322mC;
import X.C72902SjK;
import X.C72909SjR;
import X.HG3;
import X.LB0;
import X.LB3;
import X.TBT;
import X.TC5;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.following.model.FollowingItemList;
import com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class PushSettingNotificationChoiceViewModel extends JediViewModel<NotificationChoiceState> {
    public final TC5 LJLJJLL = new TC5();
    public boolean LJLJL = true;
    public final int LJLJLJ;
    public boolean LJLJLLL;
    public final ListMiddleware<NotificationChoiceState, Object, C72909SjR> LJLL;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final NotificationChoiceState kv0() {
        return new NotificationChoiceState(null, null, false, null, false, 0, null, false, null, null, 1023, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        setState(C72902SjK.LJLIL);
        super.onCleared();
        this.LJLJJLL.release();
    }

    public PushSettingNotificationChoiceViewModel() {
        this.LJLJLJ = HG3.LJIILL().isUidContactPermisioned() ? 1 : 2;
        this.LJLL = new ListMiddleware<>(new AqS178S0100000_12(this, 242), new AqS178S0100000_12(this, 243), LB3.LJLIL, LB0.LJLIL);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        ListMiddleware<NotificationChoiceState, Object, C72909SjR> listMiddleware = this.LJLL;
        listMiddleware.LJ(new TBT() { // from class: X.SjP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((NotificationChoiceState) obj).getListState();
            }
        }, AYV.LJLIL);
        iv0(listMiddleware);
    }

    public final void Hv0(FollowingItemList followingItemList) {
        C34K c34k = new C34K();
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        withState(new AqS143S0200000_12(c34k, (C34K) c68322mC, (C68322mC<String>) 50));
        setState(new AqS116S0300000_12(c34k, (C34K) followingItemList, (FollowingItemList) c68322mC, (C68322mC<String>) 16));
    }
}
