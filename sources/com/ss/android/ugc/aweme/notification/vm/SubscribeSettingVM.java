package com.ss.android.ugc.aweme.notification.vm;

import X.C221108m2;
import X.C57108MbA;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.T16;
import Y.AfS61S0100000_9;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.bean.NotificationSubscribeSettingsList;

/* loaded from: classes10.dex */
public final class SubscribeSettingVM extends ViewModel {
    public static final /* synthetic */ int LJLJI = 0;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C57108MbA.LJLIL);
    public final MutableLiveData<NotificationSubscribeSettingsList> LJLILLLLZI = new MutableLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLIL.getValue()).LIZLLL();
    }

    public final void gv0(int i) {
        C78999UzT.LJFF(NotificationApi.LIZ().getSubscribeSettingsStatus(i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 11), new AfS61S0100000_9(this, 12)), (C73318Sq2) this.LJLIL.getValue());
    }
}
