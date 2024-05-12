package com.ss.android.ugc.aweme.services;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes16.dex */
public interface ILinkTypeTagsPriorityManager {
    boolean shouldShowAnchor(Aweme aweme);

    boolean shouldShowCommerce(Aweme aweme, boolean z, int i);

    boolean shouldShowMovie(Aweme aweme, boolean z, int i);

    boolean shouldShowOpenPlatform(Aweme aweme, boolean z, int i);

    boolean shouldShowSticker(Aweme aweme, boolean z, int i);

    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean shouldShowCommerce$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    aweme = null;
                }
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowCommerce(aweme, z, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowCommerce");
        }

        public static /* synthetic */ boolean shouldShowMovie$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    aweme = null;
                }
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowMovie(aweme, z, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowMovie");
        }

        public static /* synthetic */ boolean shouldShowOpenPlatform$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    aweme = null;
                }
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowOpenPlatform(aweme, z, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowOpenPlatform");
        }

        public static /* synthetic */ boolean shouldShowSticker$default(ILinkTypeTagsPriorityManager iLinkTypeTagsPriorityManager, Aweme aweme, boolean z, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    aweme = null;
                }
                if ((i2 & 2) != 0) {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    i = 0;
                }
                return iLinkTypeTagsPriorityManager.shouldShowSticker(aweme, z, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shouldShowSticker");
        }
    }
}
