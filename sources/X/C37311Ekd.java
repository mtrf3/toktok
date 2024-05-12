package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.jvm.internal.o;

/* renamed from: X.Ekd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37311Ekd implements InterfaceC65753PrJ<VideoCreation> {
    public final /* synthetic */ InterfaceC67352kd<UploadAuthKeyConfig> LIZ;

    public C37311Ekd(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fail to get auth key: ");
        LIZ.append(t);
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
        InterfaceC67352kd<UploadAuthKeyConfig> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(VideoCreation videoCreation) {
        VideoCreation videoCreation2 = videoCreation;
        InterfaceC67352kd<UploadAuthKeyConfig> interfaceC67352kd = this.LIZ;
        if (!(videoCreation2 instanceof UploadAuthKeyConfig)) {
            videoCreation2 = null;
        }
        C3C5.m7constructorimpl(videoCreation2);
        interfaceC67352kd.resumeWith(videoCreation2);
    }
}
