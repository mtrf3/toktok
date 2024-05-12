package com.google.android.play.core.review;

import X.FP1;
import android.app.PendingIntent;

/* loaded from: classes7.dex */
public final class a extends ReviewInfo {
    public final PendingIntent a;

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent LIZ() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.a.equals(((ReviewInfo) obj).LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return FP1.LIZLLL(new StringBuilder(valueOf.length() + 26), "ReviewInfo{pendingIntent=", valueOf, "}");
    }
}
