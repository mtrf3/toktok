package com.bytedance.android.live.wallet.data.api;

import X.AbstractC73672Svk;
import X.E8M;
import X.InterfaceC195727mC;
import com.bytedance.android.live.wallet.data.model.kyc.KYCIqaIdPhotoResult;
import com.bytedance.retrofit2.mime.TypedOutput;

/* loaded from: classes6.dex */
public interface IKYCApi {
    @E8M("/api/compliance/kyc/v1/iqa/id_photo/")
    AbstractC73672Svk<KYCIqaIdPhotoResult> iqaIdPhotoVerify(@InterfaceC195727mC TypedOutput typedOutput);
}
