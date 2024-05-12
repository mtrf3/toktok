package com.ss.android.ugc.aweme.creatortools;

import X.AE4;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import java.util.Map;

/* loaded from: classes5.dex */
public interface InboxCreatorApi {
    public static final AE4 LIZ = AE4.LIZ;

    @E8M("/tiktok/notice/creator_inbox_setting/update/v1/")
    @InterfaceC195757mF
    InterfaceC37276Ek4<String> updateInboxCreatorSetting(@InterfaceC36229EJt Map<String, Object> map);
}
