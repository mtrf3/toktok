package X;

import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.bduploader.BDImageInfo;
import com.ss.bduploader.BDImageUploaderListener;

/* loaded from: classes7.dex */
public final class FUY implements BDImageUploaderListener {
    public final /* synthetic */ FUZ LIZ;

    public FUY(FUZ fuz) {
        this.LIZ = fuz;
    }

    @Override // com.ss.bduploader.BDImageUploaderListener
    public final int imageUploadCheckNetState(int i, int i2) {
        try {
            return C2NU.LIZ.LIZIZ() ? 1 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.bduploader.BDImageUploaderListener
    public final void onLog(int i, int i2, String str) {
        this.LIZ.onLog(i, i2, str);
    }

    @Override // com.ss.bduploader.BDImageUploaderListener
    public final void onNotify(int i, long j, BDImageInfo bDImageInfo) {
        int i2;
        long j2;
        String str;
        String str2;
        long j3;
        String str3;
        FUZ fuz = this.LIZ;
        if (bDImageInfo != null) {
            i2 = bDImageInfo.mFileIndex;
        } else {
            i2 = -1;
        }
        String str4 = null;
        if (bDImageInfo != null) {
            str4 = bDImageInfo.mImageTosKey;
            j2 = bDImageInfo.mErrorCode;
            str = bDImageInfo.mErrorMsg;
            str2 = bDImageInfo.mEncryptionMeta;
            j3 = bDImageInfo.mProgress;
            str3 = bDImageInfo.mMetaInfo;
        } else {
            j2 = -237;
            str = null;
            str2 = null;
            j3 = 0;
            str3 = null;
        }
        fuz.LIZ(i, j, new AbstractImageUploader.ImageUploadInfo(i2, str4, j2, str, str2, j3, str3));
    }
}
