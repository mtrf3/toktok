package X;

import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.bduploader.BDImageUploader;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FUX extends AbstractImageUploader {
    public final BDImageUploader LIZIZ;

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
    public final void LIZJ() {
        this.LIZIZ.close();
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIL() {
        this.LIZIZ.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FUX(UploadImageConfig config) {
        super(config);
        o.LJIIIZ(config, "config");
        BDImageUploader bDImageUploader = new BDImageUploader();
        this.LIZIZ = bDImageUploader;
        bDImageUploader.setUploadDomain(config.imageHostName);
        bDImageUploader.setNetworkType(403, ESI.LIZ());
        bDImageUploader.setNetworkType(404, C39044FUa.LIZ());
        bDImageUploader.setSliceSize(config.sliceSize);
        bDImageUploader.setFileRetryCount(config.fileRetryCount);
        bDImageUploader.setEnableHttps(config.enableHttps);
        STSAuthConfig sTSAuthConfig = config.authorizationV2;
        if (sTSAuthConfig != null) {
            bDImageUploader.setTopAccessKey(sTSAuthConfig.accessKeyId);
            bDImageUploader.setTopSecretKey(config.authorizationV2.secretAccessKey);
            bDImageUploader.setTopSessionToken(config.authorizationV2.sessionToken);
            bDImageUploader.setSpaceName(config.authorizationV2.spaceName);
            return;
        }
        H78.LIZJ("ImageUploader Config no authorizationV2");
    }

    @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader
    public final void LJIIIZ(FUZ fuz) {
        this.LIZIZ.setListener(new FUY(fuz));
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
    public final void LJIIIIZZ(int i, String[] strArr) {
        this.LIZIZ.setFilePath(1, strArr);
    }
}
