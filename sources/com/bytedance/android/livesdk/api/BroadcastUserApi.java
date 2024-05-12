package com.bytedance.android.livesdk.api;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195727mC;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.retrofit2.mime.TypedOutput;

/* loaded from: classes6.dex */
public interface BroadcastUserApi {
    @E8M("/webcast/room/upload/image/")
    AbstractC73638SvC<C28467BFf<CoverImageModel>> uploadAvatar(@InterfaceC195727mC TypedOutput typedOutput);
}
