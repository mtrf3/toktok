package X;

import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.bduploader.BDImageXUploader;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SH4 {
    public boolean LIZ;
    public final BDImageXUploader LIZIZ;

    public final void LIZ() {
        if (!this.LIZ) {
            this.LIZIZ.close();
            this.LIZ = true;
            C71Y.LIZLLL("CommentImageUploader", "close");
        }
    }

    public SH4(CommentImageUploadAuth config) {
        o.LJIIIZ(config, "config");
        BDImageXUploader bDImageXUploader = new BDImageXUploader();
        bDImageXUploader.setUploadDomain(config.getUploadDomain());
        bDImageXUploader.setTopAccessKey(config.getAccessKey());
        bDImageXUploader.setTopSecretKey(config.getSecretKey());
        bDImageXUploader.setTopSessionToken(config.getSessionToken());
        bDImageXUploader.setServiceID(config.getServiceId());
        this.LIZIZ = bDImageXUploader;
    }
}
