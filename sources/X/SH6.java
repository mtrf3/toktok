package X;

import com.ss.bduploader.BDImageXInfo;
import com.ss.bduploader.BDImageXUploaderListener;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SH6 implements BDImageXUploaderListener {
    public final /* synthetic */ SH7 LIZ;

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onLog(int i, int i2, String str) {
    }

    public SH6(Y8F y8f) {
        this.LIZ = y8f;
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final int imageXUploadCheckNetState(int i, int i2) {
        EF7.LIZIZ();
        try {
            return C2NU.LIZ.LIZIZ() ? 1 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.ss.bduploader.BDImageXUploaderListener
    public final void onNotify(int i, long j, BDImageXInfo bDImageXInfo) {
        if (i != 1) {
            if (i != 6) {
                if (i != 7) {
                    return;
                }
                this.LIZ.onError();
                C71Y.LIZLLL("CommentImageUploader", "upload onError:");
                return;
            }
            if (bDImageXInfo != null) {
                SH7 sh7 = this.LIZ;
                String str = bDImageXInfo.mImageTosKey;
                o.LJIIIIZZ(str, "info.mImageTosKey");
                sh7.onComplete(str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("upload onComplete: ");
                LIZ.append(bDImageXInfo.mImageTosKey);
                C71Y.LIZLLL("CommentImageUploader", X1D.LIZIZ(LIZ));
                return;
            }
            C71Y.LIZLLL("CommentImageUploader", "upload onComplete info is null!");
            this.LIZ.onError();
            return;
        }
        this.LIZ.onProgress(j);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("upload onProgress: ");
        LIZ2.append(j);
        C71Y.LIZLLL("CommentImageUploader", X1D.LIZIZ(LIZ2));
    }
}
