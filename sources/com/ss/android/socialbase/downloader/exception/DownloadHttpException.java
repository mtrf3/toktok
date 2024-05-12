package com.ss.android.socialbase.downloader.exception;

/* loaded from: classes16.dex */
public class DownloadHttpException extends BaseException {
    public final int httpStatusCode;

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadHttpException(int i, int i2, String str) {
        super(i, str);
        this.httpStatusCode = i2;
    }
}
