package com.ss.android.ugc.aweme.utils;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC36229EJt;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import java.util.Map;

/* loaded from: classes7.dex */
public interface AuthKeyApi {
    @InterfaceC195787mI
    @E4T("/aweme/v1/upload/authkey/")
    AbstractC73672Svk<UploadAuthKeyConfig> getUploadAuthKeyConfig(@InterfaceC36229EJt Map<String, String> map);
}
