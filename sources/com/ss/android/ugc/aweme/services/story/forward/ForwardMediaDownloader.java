package com.ss.android.ugc.aweme.services.story.forward;

import X.C48339Iy7;
import X.C79062V1e;
import X.HH1;
import X.V0N;
import X.X1D;
import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public interface ForwardMediaDownloader {

    /* loaded from: classes8.dex */
    public static final class DownloadConfig {
        public final String cacheDir;
        public final String fileName;
        public final String filePath;
        public final boolean force2UseStreamDownloader;
        public final boolean forceCopyUnfinished;
        public final boolean streamEditMode;
        public final boolean waitDownloadFinished;

        public static /* synthetic */ DownloadConfig copy$default(DownloadConfig downloadConfig, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downloadConfig.cacheDir;
            }
            if ((i & 2) != 0) {
                str2 = downloadConfig.fileName;
            }
            if ((i & 4) != 0) {
                str3 = downloadConfig.filePath;
            }
            if ((i & 8) != 0) {
                z = downloadConfig.streamEditMode;
            }
            if ((i & 16) != 0) {
                z2 = downloadConfig.forceCopyUnfinished;
            }
            if ((i & 32) != 0) {
                z3 = downloadConfig.force2UseStreamDownloader;
            }
            if ((i & 64) != 0) {
                z4 = downloadConfig.waitDownloadFinished;
            }
            return downloadConfig.copy(str, str2, str3, z, z2, z3, z4);
        }

        public final DownloadConfig copy(String cacheDir, String fileName, String filePath, boolean z, boolean z2, boolean z3, boolean z4) {
            o.LJIIIZ(cacheDir, "cacheDir");
            o.LJIIIZ(fileName, "fileName");
            o.LJIIIZ(filePath, "filePath");
            return new DownloadConfig(cacheDir, fileName, filePath, z, z2, z3, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DownloadConfig)) {
                return false;
            }
            DownloadConfig downloadConfig = (DownloadConfig) obj;
            return o.LJ(this.cacheDir, downloadConfig.cacheDir) && o.LJ(this.fileName, downloadConfig.fileName) && o.LJ(this.filePath, downloadConfig.filePath) && this.streamEditMode == downloadConfig.streamEditMode && this.forceCopyUnfinished == downloadConfig.forceCopyUnfinished && this.force2UseStreamDownloader == downloadConfig.force2UseStreamDownloader && this.waitDownloadFinished == downloadConfig.waitDownloadFinished;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int LJ = C79062V1e.LJ(this.filePath, C79062V1e.LJ(this.fileName, this.cacheDir.hashCode() * 31, 31), 31);
            boolean z = this.streamEditMode;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (LJ + i2) * 31;
            boolean z2 = this.forceCopyUnfinished;
            int i4 = z2;
            if (z2 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            boolean z3 = this.force2UseStreamDownloader;
            int i6 = z3;
            if (z3 != 0) {
                i6 = 1;
            }
            int i7 = (i5 + i6) * 31;
            if (!this.waitDownloadFinished) {
                i = 0;
            }
            return i7 + i;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DownloadConfig[cacheDir:");
            LIZ.append(this.cacheDir);
            LIZ.append(",fileName:");
            LIZ.append(this.fileName);
            LIZ.append(",streamEditMode:");
            LIZ.append(this.streamEditMode);
            LIZ.append(",forceCopyUnfinished:");
            LIZ.append(this.forceCopyUnfinished);
            LIZ.append(",force2UseStreamDownloader:");
            return C48339Iy7.LIZJ(LIZ, this.force2UseStreamDownloader, ']', LIZ);
        }

        public final String getCacheDir() {
            return this.cacheDir;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getFilePath() {
            return this.filePath;
        }

        public final boolean getForce2UseStreamDownloader() {
            return this.force2UseStreamDownloader;
        }

        public final boolean getForceCopyUnfinished() {
            return this.forceCopyUnfinished;
        }

        public final boolean getStreamEditMode() {
            return this.streamEditMode;
        }

        public final boolean getWaitDownloadFinished() {
            return this.waitDownloadFinished;
        }

        public DownloadConfig(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
            HH1.LIZ(str, "cacheDir", str2, "fileName", str3, "filePath");
            this.cacheDir = str;
            this.fileName = str2;
            this.filePath = str3;
            this.streamEditMode = z;
            this.forceCopyUnfinished = z2;
            this.force2UseStreamDownloader = z3;
            this.waitDownloadFinished = z4;
        }

        public /* synthetic */ DownloadConfig(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? true : z4);
        }
    }

    void download(ForwardVideo forwardVideo, DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, DownloadListener downloadListener);

    /* loaded from: classes8.dex */
    public enum DownloadErrorType {
        LOCAL_FILE_UNAVAILABLE(-11111),
        PLAYER_CACHE_UNAVAILABLE(-22222),
        DATA_UNAVAILABLE(-33333);

        public final int value;

        public static DownloadErrorType valueOf(String str) {
            return (DownloadErrorType) V0N.LJJJ(DownloadErrorType.class, str);
        }

        public final int getValue() {
            return this.value;
        }

        DownloadErrorType(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes8.dex */
    public interface DownloadListener {
        void onError(int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult);

        void onFileHeaderInfoReady(boolean z);

        void onSuccess(String str);

        /* loaded from: classes8.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void onError$default(DownloadListener downloadListener, int i, String str, Exception exc, VideoDownloadPartialResult videoDownloadPartialResult, int i2, Object obj) {
                if (obj == null) {
                    if ((i2 & 8) != 0) {
                        videoDownloadPartialResult = null;
                    }
                    downloadListener.onError(i, str, exc, videoDownloadPartialResult);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
            }
        }
    }
}
