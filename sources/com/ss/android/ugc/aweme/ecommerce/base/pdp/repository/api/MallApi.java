package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api;

import X.AbstractC73672Svk;
import X.C69965Rd3;
import X.E4T;
import X.InterfaceC27211Am7;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ReminderRsp;

/* loaded from: classes13.dex */
public interface MallApi {
    public static final C69965Rd3 LIZ = C69965Rd3.LIZ;

    @E4T("/api/v1/mall/flash_sale/set_reminder")
    AbstractC73672Svk<Response<ReminderRsp>> setReminder(@InterfaceC27211Am7 ReminderRequest reminderRequest);
}
