package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H0P implements InterfaceC65753PrJ<VideoCreation> {
    public final /* synthetic */ XJL<UploadImageConfig> LIZ;

    public H0P(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        XJL<UploadImageConfig> xjl = this.LIZ;
        C3C5.m7constructorimpl(null);
        xjl.resumeWith(null);
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(VideoCreation videoCreation) {
        VideoCreation videoCreation2 = videoCreation;
        if (videoCreation2 instanceof UploadAuthKeyConfig) {
            XJL<UploadImageConfig> xjl = this.LIZ;
            UploadImageConfig uploadImageConfig = ((UploadAuthKeyConfig) videoCreation2).frameUploadConfig;
            C3C5.m7constructorimpl(uploadImageConfig);
            xjl.resumeWith(uploadImageConfig);
            return;
        }
        XJL<UploadImageConfig> xjl2 = this.LIZ;
        C3C5.m7constructorimpl(null);
        xjl2.resumeWith(null);
    }
}
