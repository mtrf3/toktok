package com.ss.android.ugc.effectmanager.common.download;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class DownloadException extends Exception {
    public static final Companion Companion = new Companion();
    public final int errorCode;

    /* loaded from: classes16.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public DownloadException(int i) {
        this.errorCode = i;
    }
}
