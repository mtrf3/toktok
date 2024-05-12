package com.ss.android.ugc.aweme.services.external;

import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;

/* loaded from: classes8.dex */
public interface IPrivacyConfig {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes8.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    CheckDuetReactPermissionResponse checkDuetReactPermission(String str, int i);

    IPermissionBridge permissionBridge();

    /* loaded from: classes13.dex */
    public interface IPermissionBridge {
        boolean getPublishPermissionDialogPublicQNA(boolean z);

        boolean isPrivateAvailable();

        void setPublishPermissionDialogPublicQNA(boolean z);

        /* loaded from: classes13.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ boolean getPublishPermissionDialogPublicQNA$default(IPermissionBridge iPermissionBridge, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = true;
                    }
                    return iPermissionBridge.getPublishPermissionDialogPublicQNA(z);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPublishPermissionDialogPublicQNA");
            }
        }
    }
}
