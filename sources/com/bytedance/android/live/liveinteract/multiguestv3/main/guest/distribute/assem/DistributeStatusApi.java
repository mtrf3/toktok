package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem;

import X.E8L;
import X.E8M;
import X.EKC;
import X.EnumC29608Bjg;
import X.InterfaceC195727mC;
import X.InterfaceC36228EJs;
import X.InterfaceC65131PhH;
import X.InterfaceC67352kd;
import X.R2P;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingResponse;
import java.util.Map;

/* loaded from: classes14.dex */
public interface DistributeStatusApi {
    @E8L("/webcast/linkmic_multi_guest/get_guest_setting/")
    Object getState(InterfaceC67352kd<? super R2P<GetGuestSettingResponse.ResponseData>> interfaceC67352kd);

    @E8M("/webcast/linkmic_multi_guest/update_guest_setting/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @EKC({"request-use-body: 1"})
    Object updateGuestSetting(@InterfaceC195727mC UpdateGuestSettingParams updateGuestSettingParams, InterfaceC67352kd<? super R2P<UpdateGuestSettingResponse.ResponseData>> interfaceC67352kd);

    @E8L("/webcast/linkmic_multi_guest/update_guest_setting/")
    Object updateGuestSettingUseMap(@InterfaceC36228EJs Map<String, String> map, InterfaceC67352kd<? super R2P<UpdateGuestSettingResponse.ResponseData>> interfaceC67352kd);
}
