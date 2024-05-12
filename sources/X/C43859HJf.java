package X;

import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.bduploader.BDImageXUploader;
import kotlin.jvm.internal.o;

/* renamed from: X.HJf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43859HJf extends AbstractImageUploader {
    public final BDImageXUploader LIZIZ;

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LIZ() {
        this.LIZ = true;
        this.LIZIZ.allowMergeUpload();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJI() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LIZIZ() {
        this.LIZIZ.cancelUpload();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LIZJ() {
        this.LIZIZ.close();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIL() {
        this.LIZIZ.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43859HJf(UploadImageConfig config) {
        super(config);
        o.LJIIIZ(config, "config");
        BDImageXUploader bDImageXUploader = new BDImageXUploader();
        bDImageXUploader.setUploadDomain(config.imageHostName);
        bDImageXUploader.setTopAccessKey(config.authorizationV2.accessKeyId);
        bDImageXUploader.setTopSecretKey(config.authorizationV2.secretAccessKey);
        bDImageXUploader.setTopSessionToken(config.authorizationV2.sessionToken);
        bDImageXUploader.setServiceID(config.authorizationV2.spaceName);
        bDImageXUploader.setNetworkType(403, ESI.LIZ());
        bDImageXUploader.setNetworkType(404, C39044FUa.LIZ());
        bDImageXUploader.setSocketNum(config.socketNumber);
        bDImageXUploader.setFileRetryCount(config.fileRetryCount);
        bDImageXUploader.setRWTimeout(config.rwTimeout);
        bDImageXUploader.setMaxFailTime(config.maxFailTime);
        this.LIZIZ = bDImageXUploader;
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIIZ(FUZ fuz) {
        this.LIZIZ.setListener(new C43860HJg(fuz));
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIJ(boolean z) {
        this.LIZIZ.setOpenBoe(z);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIJJI(String value) {
        o.LJIIIZ(value, "value");
        this.LIZIZ.setServerParameter(value);
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIIIZZ(int i, String[] filePaths) {
        o.LJIIIZ(filePaths, "filePaths");
        this.LIZIZ.setFilePath(i, filePaths);
    }
}
