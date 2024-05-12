package com.ss.android.ugc.aweme.uploader.factory;

import X.HLJ;
import X.JBR;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class AbstractVideoUploader {

    /* loaded from: classes3.dex */
    public static final class VideoUploadInfo {
        public long mErrorCode;
        public String mExtra;
        public String mTosKey;
        public String mVideoId;

        /* JADX WARN: Multi-variable type inference failed */
        public VideoUploadInfo() {
            this(null, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ VideoUploadInfo copy$default(VideoUploadInfo videoUploadInfo, String str, String str2, long j, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = videoUploadInfo.mTosKey;
            }
            if ((i & 2) != 0) {
                str2 = videoUploadInfo.mVideoId;
            }
            if ((i & 4) != 0) {
                j = videoUploadInfo.mErrorCode;
            }
            if ((i & 8) != 0) {
                str3 = videoUploadInfo.mExtra;
            }
            return videoUploadInfo.copy(str, str2, j, str3);
        }

        public final VideoUploadInfo copy(String str, String str2, long j, String str3) {
            return new VideoUploadInfo(str, str2, j, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoUploadInfo)) {
                return false;
            }
            VideoUploadInfo videoUploadInfo = (VideoUploadInfo) obj;
            return o.LJ(this.mTosKey, videoUploadInfo.mTosKey) && o.LJ(this.mVideoId, videoUploadInfo.mVideoId) && this.mErrorCode == videoUploadInfo.mErrorCode && o.LJ(this.mExtra, videoUploadInfo.mExtra);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.mTosKey;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.mVideoId;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int LIZJ = JBR.LIZJ(this.mErrorCode, (i2 + hashCode2) * 31, 31);
            String str3 = this.mExtra;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return LIZJ + i;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoUploadInfo(mTosKey=");
            LIZ.append(this.mTosKey);
            LIZ.append(", mVideoId=");
            LIZ.append(this.mVideoId);
            LIZ.append(", mErrorCode=");
            LIZ.append(this.mErrorCode);
            LIZ.append(", mExtra=");
            return q.LIZIZ(LIZ, this.mExtra, ')', LIZ);
        }

        public final long getMErrorCode() {
            return this.mErrorCode;
        }

        public final String getMExtra() {
            return this.mExtra;
        }

        public final String getMTosKey() {
            return this.mTosKey;
        }

        public final String getMVideoId() {
            return this.mVideoId;
        }

        public final void setMErrorCode(long j) {
            this.mErrorCode = j;
        }

        public final void setMExtra(String str) {
            this.mExtra = str;
        }

        public final void setMTosKey(String str) {
            this.mTosKey = str;
        }

        public final void setMVideoId(String str) {
            this.mVideoId = str;
        }

        public VideoUploadInfo(String str, String str2, long j, String str3) {
            this.mTosKey = str;
            this.mVideoId = str2;
            this.mErrorCode = j;
            this.mExtra = str3;
        }

        public /* synthetic */ VideoUploadInfo(String str, String str2, long j, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j, (i & 8) == 0 ? str3 : null);
        }
    }

    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public abstract void LIZLLL(HLJ hlj);

    public abstract void LJ(String str);

    public abstract void LJFF();
}
