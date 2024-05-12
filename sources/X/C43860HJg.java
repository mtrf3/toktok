package X;

import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploaderListener;

/* renamed from: X.HJg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43860HJg implements BDImageXUploaderListener {
    public final /* synthetic */ FUZ LIZ;

    public C43860HJg(FUZ fuz) {
        this.LIZ = fuz;
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final int imageXUploadCheckNetState(int i, int i2) {
        try {
            return C2NU.LIZ.LIZIZ() ? 1 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onLog(int i, int i2, String str) {
        this.LIZ.onLog(i, i2, str);
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
        AbstractImageUploader.ImageUploadInfo imageUploadInfo;
        FUZ fuz = this.LIZ;
        if (bDImageXInfo != null) {
            imageUploadInfo = new AbstractImageUploader.ImageUploadInfo(bDImageXInfo.mFileIndex, bDImageXInfo.mImageTosKey, bDImageXInfo.mErrorCode, null, bDImageXInfo.mEncryptionMeta, bDImageXInfo.mProgress, bDImageXInfo.mMetaInfo);
        } else {
            imageUploadInfo = null;
        }
        fuz.LIZ(i, j, imageUploadInfo);
    }
}
