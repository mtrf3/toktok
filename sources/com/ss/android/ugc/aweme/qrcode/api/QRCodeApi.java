package com.ss.android.ugc.aweme.qrcode.api;

import X.AbstractC36908Ee8;
import X.C46104I7o;
import X.C76L;
import X.E4T;
import X.EFJ;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC789838c;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;
import java.util.concurrent.ExecutionException;

/* loaded from: classes11.dex */
public final class QRCodeApi {
    public static final InterfaceC789838c LIZ = C46104I7o.LJIILL(EFJ.LIZJ);

    /* loaded from: classes11.dex */
    public interface RealApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/qrcode/info/")
        C76L<QRCodeInfo> getQRCodeInfo(@InterfaceC64987Pex("schema_type") int i, @InterfaceC64987Pex("object_id") String str, @InterfaceC64987Pex("edition_uid") String str2);

        @InterfaceC195787mI
        @E4T("/aweme/v1/fancy/qrcode/info/")
        C76L<QRCodeInfo> getQRCodeInfoV2(@InterfaceC64987Pex("schema_type") int i, @InterfaceC64987Pex("object_id") String str, @InterfaceC64987Pex("meta_params") String str2);
    }

    public static QRCodeInfo LIZ(int i, String str, String str2) {
        try {
            return ((RealApi) LIZ.create(RealApi.class)).getQRCodeInfoV2(i, str, str2).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }
}
