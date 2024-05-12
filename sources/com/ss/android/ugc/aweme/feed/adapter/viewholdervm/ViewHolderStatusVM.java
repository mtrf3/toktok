package com.ss.android.ugc.aweme.feed.adapter.viewholdervm;

import X.C221108m2;
import X.C62822Ol8;
import X.C76800UCe;
import X.C86343Xud;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes16.dex */
public final class ViewHolderStatusVM extends LiveWidgetViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 262));
    public final MutableLiveData<C76800UCe> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<Integer> LJLJL = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJLJ = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJLLL = new MutableLiveData<>();
    public final NextLiveData<C76800UCe> LJLL = new NextLiveData<>();
    public final NextLiveData<Boolean> LJLLI = new NextLiveData<>();

    public final void gv0() {
        LiveRoomStruct liveRoomStruct;
        User user;
        this.LJLJLLL.setValue(C76800UCe.LIZ);
        C86343Xud c86343Xud = (C86343Xud) this.LJLIL.getValue();
        if (c86343Xud == null || (liveRoomStruct = c86343Xud.LIZIZ) == null || (user = liveRoomStruct.owner) == null) {
            return;
        }
        user.roomId = liveRoomStruct.id;
    }
}
