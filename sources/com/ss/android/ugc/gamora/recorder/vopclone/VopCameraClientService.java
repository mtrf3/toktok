package com.ss.android.ugc.gamora.recorder.vopclone;

import X.C58096Mr6;
import X.C60903NvH;
import X.C62850Ola;
import X.C77339UWx;
import X.EnumC43651HBf;
import com.ss.android.ugc.aweme.services.audio.IVopCameraClientService;

/* loaded from: classes8.dex */
public final class VopCameraClientService implements IVopCameraClientService {
    public static IVopCameraClientService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IVopCameraClientService.class, false);
        if (LIZ != null) {
            return (IVopCameraClientService) LIZ;
        }
        if (C58096Mr6.F8 == null) {
            synchronized (IVopCameraClientService.class) {
                if (C58096Mr6.F8 == null) {
                    C58096Mr6.F8 = new VopCameraClientService();
                }
            }
        }
        return C58096Mr6.F8;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final String genVopSdkSavePath() {
        String LJIILJJIL;
        LJIILJJIL = C62850Ola.LJ().LJIILJJIL(EnumC43651HBf.VOP_CLONE, "");
        return LJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final String getCurrentUserId() {
        return C77339UWx.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final String getSDKVersion() {
        C60903NvH.LJIIJJI().getAccountService().getSDKVersion();
        return "2";
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final String getUserTTToken() {
        String userTTToken = C60903NvH.LJIIJJI().getAccountService().getUserTTToken();
        if (userTTToken == null) {
            return "";
        }
        return userTTToken;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final void initDownloadableModel() {
        C60903NvH.LJIIJJI().initDownloadableModel();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final void initVESdk() {
        C60903NvH.LJIIJJI().LJJII();
    }
}
