package com.ss.android.ugc.aweme.canvas;

import X.C79062V1e;
import X.InterfaceC36436ERs;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StreamEditConfigure implements Serializable {

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("cacheDir")
    public final String cacheDir;

    @InterfaceC65349Pkn("fileName")
    public final String fileName;

    @InterfaceC65349Pkn("partialResult")
    public final VideoDownloadPartialResult partialResult;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamEditConfigure() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StreamEditConfigure copy$default(StreamEditConfigure streamEditConfigure, String str, String str2, VideoDownloadPartialResult videoDownloadPartialResult, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamEditConfigure.cacheDir;
        }
        if ((i & 2) != 0) {
            str2 = streamEditConfigure.fileName;
        }
        if ((i & 4) != 0) {
            videoDownloadPartialResult = streamEditConfigure.partialResult;
        }
        return streamEditConfigure.copy(str, str2, videoDownloadPartialResult);
    }

    public final StreamEditConfigure copy(String cacheDir, String fileName, VideoDownloadPartialResult videoDownloadPartialResult) {
        o.LJIIIZ(cacheDir, "cacheDir");
        o.LJIIIZ(fileName, "fileName");
        return new StreamEditConfigure(cacheDir, fileName, videoDownloadPartialResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamEditConfigure)) {
            return false;
        }
        StreamEditConfigure streamEditConfigure = (StreamEditConfigure) obj;
        return o.LJ(this.cacheDir, streamEditConfigure.cacheDir) && o.LJ(this.fileName, streamEditConfigure.fileName) && o.LJ(this.partialResult, streamEditConfigure.partialResult);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StreamEditConfigure(cacheDir=");
        LIZ.append(this.cacheDir);
        LIZ.append(", fileName=");
        LIZ.append(this.fileName);
        LIZ.append(", partialResult=");
        LIZ.append(this.partialResult);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.fileName, this.cacheDir.hashCode() * 31, 31);
        VideoDownloadPartialResult videoDownloadPartialResult = this.partialResult;
        if (videoDownloadPartialResult == null) {
            hashCode = 0;
        } else {
            hashCode = videoDownloadPartialResult.hashCode();
        }
        return LJ + hashCode;
    }

    public final String getCacheDir() {
        return this.cacheDir;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final VideoDownloadPartialResult getPartialResult() {
        return this.partialResult;
    }

    public StreamEditConfigure(String cacheDir, String fileName, VideoDownloadPartialResult videoDownloadPartialResult) {
        o.LJIIIZ(cacheDir, "cacheDir");
        o.LJIIIZ(fileName, "fileName");
        this.cacheDir = cacheDir;
        this.fileName = fileName;
        this.partialResult = videoDownloadPartialResult;
    }

    public /* synthetic */ StreamEditConfigure(String str, String str2, VideoDownloadPartialResult videoDownloadPartialResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : videoDownloadPartialResult);
    }
}
