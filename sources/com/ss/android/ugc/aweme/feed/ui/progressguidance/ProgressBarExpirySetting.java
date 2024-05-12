package com.ss.android.ugc.aweme.feed.ui.progressguidance;

import X.J9A;

/* loaded from: classes2.dex */
public final class ProgressBarExpirySetting {
    public static final ProgressBarExpirySetting INSTANCE = new ProgressBarExpirySetting();
    public static final long DEFAULT = -1;

    public final long getExpiry() {
        return J9A.LIZIZ("progress_expiry_config", -1L);
    }

    public final long getDEFAULT() {
        return DEFAULT;
    }
}
