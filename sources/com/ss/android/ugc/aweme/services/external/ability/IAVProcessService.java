package com.ss.android.ugc.aweme.services.external.ability;

import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public interface IAVProcessService {

    /* loaded from: classes8.dex */
    public interface IConvertImageToVideoCallback {
        void onFailure();

        void onProgress(float f);

        void onSuccess(String str);
    }

    /* loaded from: classes8.dex */
    public interface IProcessCallback<T> {
        void finish(T t);
    }

    void compressPhoto(String str, Integer num, Integer num2, IProcessCallback<String> iProcessCallback);

    void convertImageToVideo(String str, String str2, String str3, long j, IConvertImageToVideoCallback iConvertImageToVideoCallback);

    void createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, IProcessCallback<String[]> iProcessCallback);

    void createWaterMarkImages(String str, String str2, String str3, String str4, boolean z, IProcessCallback<String[]> iProcessCallback);

    int[] getVideoFileInfo(String str);

    void muteVideo(String str, String str2, IProcessCallback<Integer> iProcessCallback);

    /* loaded from: classes8.dex */
    public static final class CompileParam {
        public final String rawVideoPath;
        public int videoHeight;
        public int videoWidth;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CompileParam{rawVideoPath=");
            LIZ.append(this.rawVideoPath);
            LIZ.append(", videoWidth=");
            LIZ.append(this.videoWidth);
            LIZ.append(", videoHeight=");
            return b0.LIZJ(LIZ, this.videoHeight, '}', LIZ);
        }

        public final String getRawVideoPath() {
            return this.rawVideoPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final void setVideoHeight(int i) {
            this.videoHeight = i;
        }

        public final void setVideoWidth(int i) {
            this.videoWidth = i;
        }

        public CompileParam(String rawVideoPath, int i, int i2) {
            o.LJIIIZ(rawVideoPath, "rawVideoPath");
            this.rawVideoPath = rawVideoPath;
            this.videoWidth = i;
            this.videoHeight = i2;
        }
    }

    /* loaded from: classes8.dex */
    public static final class CompileResult {
        public String checkPic;
        public String thumbnailPath;
        public String videoMd5;
        public String videoPath;
        public int videoWidth = -1;
        public int videoHeight = -1;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CompileResult{videoPath=");
            LIZ.append(this.videoPath);
            LIZ.append(", videoMd5=");
            LIZ.append(this.videoMd5);
            LIZ.append(", checkPic=");
            LIZ.append(this.checkPic);
            LIZ.append(", thumbnailPath=");
            LIZ.append(this.thumbnailPath);
            LIZ.append(", width=");
            LIZ.append(this.videoWidth);
            LIZ.append(", height=");
            return b0.LIZJ(LIZ, this.videoHeight, '}', LIZ);
        }

        public final String getCheckPic() {
            return this.checkPic;
        }

        public final String getThumbnailPath() {
            return this.thumbnailPath;
        }

        public final int getVideoHeight() {
            return this.videoHeight;
        }

        public final String getVideoMd5() {
            return this.videoMd5;
        }

        public final String getVideoPath() {
            return this.videoPath;
        }

        public final int getVideoWidth() {
            return this.videoWidth;
        }

        public final void setCheckPic(String str) {
            this.checkPic = str;
        }

        public final void setThumbnailPath(String str) {
            this.thumbnailPath = str;
        }

        public final void setVideoHeight(int i) {
            this.videoHeight = i;
        }

        public final void setVideoMd5(String str) {
            this.videoMd5 = str;
        }

        public final void setVideoPath(String str) {
            this.videoPath = str;
        }

        public final void setVideoWidth(int i) {
            this.videoWidth = i;
        }
    }
}
