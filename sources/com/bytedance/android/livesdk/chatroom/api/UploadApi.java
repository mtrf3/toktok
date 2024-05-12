package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195727mC;
import com.bytedance.android.live.base.model.user.UploadResult;
import com.bytedance.retrofit2.mime.TypedOutput;

/* loaded from: classes6.dex */
public interface UploadApi {
    @E8M("/webcast/certification/submit_cert_data/")
    AbstractC73638SvC<C28467BFf<UploadResult>> upload(@InterfaceC195727mC TypedOutput typedOutput);

    @E8M("/webcast/certification/submit_cert_data/")
    AbstractC73672Svk<C28467BFf<UploadResult>> upload2(@InterfaceC195727mC TypedOutput typedOutput);
}
