package com.ss.android.ugc.aweme.uploader.factory;

import X.FUZ;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class AbstractImageUploader {
    public boolean LIZ;

    /* loaded from: classes8.dex */
    public static final class ImageUploadInfo {
        public String mEncryptionImageTosKey;
        public long mErrorCode;
        public String mExtra;
        public int mFileIndex;
        public String mImageToskey;
        public String mMetaInfo;
        public long mProgress;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ImageUploadInfo() {
            /*
                r12 = this;
                r1 = 0
                r2 = 0
                r3 = 0
                r10 = 127(0x7f, float:1.78E-43)
                r0 = r12
                r5 = r2
                r6 = r2
                r7 = r3
                r9 = r2
                r11 = r2
                r0.<init>(r1, r2, r3, r5, r6, r7, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader.ImageUploadInfo.<init>():void");
        }

        public static /* synthetic */ ImageUploadInfo copy$default(ImageUploadInfo imageUploadInfo, int i, String str, long j, String str2, String str3, long j2, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = imageUploadInfo.mFileIndex;
            }
            if ((i2 & 2) != 0) {
                str = imageUploadInfo.mImageToskey;
            }
            if ((i2 & 4) != 0) {
                j = imageUploadInfo.mErrorCode;
            }
            if ((i2 & 8) != 0) {
                str2 = imageUploadInfo.mExtra;
            }
            if ((i2 & 16) != 0) {
                str3 = imageUploadInfo.mEncryptionImageTosKey;
            }
            if ((i2 & 32) != 0) {
                j2 = imageUploadInfo.mProgress;
            }
            if ((i2 & 64) != 0) {
                str4 = imageUploadInfo.mMetaInfo;
            }
            return imageUploadInfo.copy(i, str, j, str2, str3, j2, str4);
        }

        public final ImageUploadInfo copy(int i, String str, long j, String str2, String str3, long j2, String str4) {
            return new ImageUploadInfo(i, str, j, str2, str3, j2, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageUploadInfo)) {
                return false;
            }
            ImageUploadInfo imageUploadInfo = (ImageUploadInfo) obj;
            return this.mFileIndex == imageUploadInfo.mFileIndex && o.LJ(this.mImageToskey, imageUploadInfo.mImageToskey) && this.mErrorCode == imageUploadInfo.mErrorCode && o.LJ(this.mExtra, imageUploadInfo.mExtra) && o.LJ(this.mEncryptionImageTosKey, imageUploadInfo.mEncryptionImageTosKey) && this.mProgress == imageUploadInfo.mProgress && o.LJ(this.mMetaInfo, imageUploadInfo.mMetaInfo);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int i = this.mFileIndex * 31;
            String str = this.mImageToskey;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int LIZJ = JBR.LIZJ(this.mErrorCode, (i + hashCode) * 31, 31);
            String str2 = this.mExtra;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (LIZJ + hashCode2) * 31;
            String str3 = this.mEncryptionImageTosKey;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int LIZJ2 = JBR.LIZJ(this.mProgress, (i3 + hashCode3) * 31, 31);
            String str4 = this.mMetaInfo;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return LIZJ2 + i2;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ImageUploadInfo(mFileIndex=");
            LIZ.append(this.mFileIndex);
            LIZ.append(", mImageToskey=");
            LIZ.append(this.mImageToskey);
            LIZ.append(", mErrorCode=");
            LIZ.append(this.mErrorCode);
            LIZ.append(", mExtra=");
            LIZ.append(this.mExtra);
            LIZ.append(", mEncryptionImageTosKey=");
            LIZ.append(this.mEncryptionImageTosKey);
            LIZ.append(", mProgress=");
            LIZ.append(this.mProgress);
            LIZ.append(", mMetaInfo=");
            return q.LIZIZ(LIZ, this.mMetaInfo, ')', LIZ);
        }

        public final String getMEncryptionImageTosKey() {
            return this.mEncryptionImageTosKey;
        }

        public final long getMErrorCode() {
            return this.mErrorCode;
        }

        public final String getMExtra() {
            return this.mExtra;
        }

        public final int getMFileIndex() {
            return this.mFileIndex;
        }

        public final String getMImageToskey() {
            return this.mImageToskey;
        }

        public final String getMMetaInfo() {
            return this.mMetaInfo;
        }

        public final long getMProgress() {
            return this.mProgress;
        }

        public final void setMEncryptionImageTosKey(String str) {
            this.mEncryptionImageTosKey = str;
        }

        public final void setMErrorCode(long j) {
            this.mErrorCode = j;
        }

        public final void setMExtra(String str) {
            this.mExtra = str;
        }

        public final void setMFileIndex(int i) {
            this.mFileIndex = i;
        }

        public final void setMImageToskey(String str) {
            this.mImageToskey = str;
        }

        public final void setMMetaInfo(String str) {
            this.mMetaInfo = str;
        }

        public final void setMProgress(long j) {
            this.mProgress = j;
        }

        public ImageUploadInfo(int i, String str, long j, String str2, String str3, long j2, String str4) {
            this.mFileIndex = i;
            this.mImageToskey = str;
            this.mErrorCode = j;
            this.mExtra = str2;
            this.mEncryptionImageTosKey = str3;
            this.mProgress = j2;
            this.mMetaInfo = str4;
        }

        public /* synthetic */ ImageUploadInfo(int i, String str, long j, String str2, String str3, long j2, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) == 0 ? j2 : 0L, (i2 & 64) == 0 ? str4 : null);
        }
    }

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public abstract void LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ();

    public abstract void LJFF();

    public abstract void LJI();

    public abstract void LJII();

    public abstract void LJIIIIZZ(int i, String[] strArr);

    public abstract void LJIIIZ(FUZ fuz);

    public abstract void LJIIJ(boolean z);

    public abstract void LJIIJJI(String str);

    public abstract void LJIIL();

    public AbstractImageUploader(UploadImageConfig config) {
        o.LJIIIZ(config, "config");
    }
}
