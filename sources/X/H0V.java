package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;

/* loaded from: classes8.dex */
public class H0V implements InterfaceC65753PrJ<VideoCreation> {
    public final long LIZ;

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable th) {
    }

    public H0V(long j) {
        this.LIZ = j;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(VideoCreation videoCreation) {
        VideoCreation videoCreation2 = videoCreation;
        if (videoCreation2 instanceof UploadAuthKeyConfig) {
            C43379H0t.LJFF(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), videoCreation2));
            C43379H0t.LJI((UploadAuthKeyConfig) videoCreation2, this.LIZ);
        }
    }
}
