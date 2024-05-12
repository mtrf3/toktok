package com.ss.android.ugc.aweme.share.api;

import X.C10K;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;

/* loaded from: classes11.dex */
public final class ShareQRCodeApi {

    /* loaded from: classes11.dex */
    public interface RealApi {
        @E8M("/tiktok/share/qrcode/create/v1/")
        @InterfaceC195757mF
        C10K<QRCodeInfo> getUserQRCodeInfo(@InterfaceC64985Pev("schema_type") int i, @InterfaceC64985Pev("object_id") String str);
    }
}
