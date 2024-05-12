package com.bytedance.android.livesdk.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.api.model.CheckGiftUserNameResult;

/* loaded from: classes2.dex */
public interface StickerGiftApi {
    @E8L("/webcast/gift/user_name/check/")
    AbstractC73672Svk<C28467BFf<CheckGiftUserNameResult>> checkUserNameLegality(@InterfaceC64986Pew("name") String str);
}
