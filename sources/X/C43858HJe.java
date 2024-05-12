package X;

import com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDUploadUtil;
import kotlin.jvm.internal.o;

/* renamed from: X.HJe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43858HJe {
    public static final /* synthetic */ int LIZIZ = 0;
    public final BDImageXUploader LIZ;

    public C43858HJe(AIGCAvatarAuthConfig config) {
        o.LJIIIZ(config, "config");
        BDUploadUtil.setEnableNativeLog(Boolean.TRUE);
        BDImageXUploader bDImageXUploader = new BDImageXUploader();
        bDImageXUploader.setUploadDomain(config.uploadHost);
        bDImageXUploader.setTopAccessKey(config.accessKeyId);
        bDImageXUploader.setTopSecretKey(config.secretAccessKey);
        bDImageXUploader.setTopSessionToken(config.sessionToken);
        bDImageXUploader.setServiceID(config.serviceId);
        bDImageXUploader.setNetworkType(403, ESI.LIZ());
        bDImageXUploader.setNetworkType(404, C39044FUa.LIZ());
        this.LIZ = bDImageXUploader;
    }
}
