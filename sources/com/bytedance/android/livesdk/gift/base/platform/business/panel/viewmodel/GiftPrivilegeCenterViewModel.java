package com.bytedance.android.livesdk.gift.base.platform.business.panel.viewmodel;

import X.C1EW;
import X.C29580BjE;
import X.EnumC29511Bi7;
import X.Q7L;
import Y.AfS25S0110000_5;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.api.revenue.privilege.api.PrivilegeApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes6.dex */
public final class GiftPrivilegeCenterViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LJLIL = new MutableLiveData<>();

    public final void gv0(boolean z, Room room) {
        Long l;
        PrivilegeApi privilegeApi = (PrivilegeApi) Q7L.LIZIZ(PrivilegeApi.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        }
        C1EW.LIZ(privilegeApi.getUserPrivilegeInfo(false, valueOf, String.valueOf(l2), EnumC29511Bi7.REQUEST_FROM_SCENE_GIFT_PANEL.getType())).LJJJLIIL(new AfS25S0110000_5(this, z, 3), C29580BjE.LJLIL);
    }
}
