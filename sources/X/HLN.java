package X;

import com.ss.android.ugc.aweme.services.external.IPrivacyConfig;

/* loaded from: classes8.dex */
public final class HLN implements IPrivacyConfig.IPermissionBridge {
    @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionBridge
    public final boolean isPrivateAvailable() {
        return C19N.LJ("private_available", true);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionBridge
    public final boolean getPublishPermissionDialogPublicQNA(boolean z) {
        return C60903NvH.LJIIJJI().LJJIL().getPublishPermissionDialogPublicQNA(z);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig.IPermissionBridge
    public final void setPublishPermissionDialogPublicQNA(boolean z) {
        C60903NvH.LJIIJJI().LJJIL().setPublishPermissionDialogPublicQNA(z);
    }
}
