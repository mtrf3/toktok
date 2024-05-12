package com.ss.android.ugc.aweme.canvas;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoDownloadPartialResult implements Serializable {

    @InterfaceC65349Pkn("cacheSizeFromZero")
    public final long cacheSizeFromZero;

    @InterfaceC65349Pkn("localFilePath")
    public final String localFilePath;

    @InterfaceC65349Pkn("mediaSize")
    public final long mediaSize;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoDownloadPartialResult() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            r6 = 7
            r0 = r8
            r3 = r1
            r7 = r5
            r0.<init>(r1, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult.<init>():void");
    }

    public static /* synthetic */ VideoDownloadPartialResult copy$default(VideoDownloadPartialResult videoDownloadPartialResult, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = videoDownloadPartialResult.mediaSize;
        }
        if ((i & 2) != 0) {
            j2 = videoDownloadPartialResult.cacheSizeFromZero;
        }
        if ((i & 4) != 0) {
            str = videoDownloadPartialResult.localFilePath;
        }
        return videoDownloadPartialResult.copy(j, j2, str);
    }

    public final VideoDownloadPartialResult copy(long j, long j2, String str) {
        return new VideoDownloadPartialResult(j, j2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDownloadPartialResult)) {
            return false;
        }
        VideoDownloadPartialResult videoDownloadPartialResult = (VideoDownloadPartialResult) obj;
        return this.mediaSize == videoDownloadPartialResult.mediaSize && this.cacheSizeFromZero == videoDownloadPartialResult.cacheSizeFromZero && o.LJ(this.localFilePath, videoDownloadPartialResult.localFilePath);
    }

    public int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.cacheSizeFromZero, C16880lQ.LLJIJIL(this.mediaSize) * 31, 31);
        String str = this.localFilePath;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZJ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoDownloadPartialResult[mediaSize:");
        LIZ.append(this.mediaSize);
        LIZ.append(",cacheSizeFromZero:");
        LIZ.append(this.cacheSizeFromZero);
        LIZ.append(",localFilePath:");
        return q.LIZIZ(LIZ, this.localFilePath, ']', LIZ);
    }

    public final long getCacheSizeFromZero() {
        return this.cacheSizeFromZero;
    }

    public final String getLocalFilePath() {
        return this.localFilePath;
    }

    public final long getMediaSize() {
        return this.mediaSize;
    }

    public VideoDownloadPartialResult(long j, long j2, String str) {
        this.mediaSize = j;
        this.cacheSizeFromZero = j2;
        this.localFilePath = str;
    }

    public /* synthetic */ VideoDownloadPartialResult(long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) == 0 ? j2 : 0L, (i & 4) != 0 ? null : str);
    }
}
