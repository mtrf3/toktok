package X;

import com.ss.bduploader.BDObjectInfo;
import com.ss.bduploader.BDObjectUploader;
import com.ss.bduploader.BDObjectUploaderListener;
import kotlin.jvm.internal.o;
import v5.n;

/* renamed from: X.ETa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36470ETa implements BDObjectUploaderListener {
    public final /* synthetic */ n<String> LIZ;
    public final /* synthetic */ BDObjectUploader LIZIZ;

    @Override // com.ss.bduploader.BDObjectUploaderListener
    public final int objectUploadCheckNetState(int i, int i2) {
        return 0;
    }

    @Override // com.ss.bduploader.BDObjectUploaderListener
    public final void onLog(int i, int i2, String info) {
        o.LJIIIZ(info, "info");
    }

    public C36470ETa(n<String> nVar, BDObjectUploader bDObjectUploader) {
        this.LIZ = nVar;
        this.LIZIZ = bDObjectUploader;
    }

    @Override // com.ss.bduploader.BDObjectUploaderListener
    public final void onNotify(int i, long j, BDObjectInfo info) {
        o.LJIIIZ(info, "info");
        if (i != 6) {
            if (i != 7) {
                return;
            }
            this.LIZ.LIZJ("failed");
            this.LIZIZ.close();
            return;
        }
        this.LIZ.LIZJ(info.mImageTosKey);
        this.LIZIZ.close();
    }
}
