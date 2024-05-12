package X;

import com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.jvm.internal.o;

/* renamed from: X.H5d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43493H5d implements InterfaceC65753PrJ<VideoCreation> {
    public final /* synthetic */ InterfaceC67352kd<AIGCAvatarAuthConfig> LIZ;

    public C43493H5d(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        InterfaceC67352kd<AIGCAvatarAuthConfig> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(VideoCreation videoCreation) {
        UploadAuthKeyConfig uploadAuthKeyConfig;
        VideoCreation videoCreation2 = videoCreation;
        InterfaceC67352kd<AIGCAvatarAuthConfig> interfaceC67352kd = this.LIZ;
        AIGCAvatarAuthConfig aIGCAvatarAuthConfig = null;
        if ((videoCreation2 instanceof UploadAuthKeyConfig) && (uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation2) != null) {
            aIGCAvatarAuthConfig = uploadAuthKeyConfig.aigcAvatarAuthConfig;
        }
        C3C5.m7constructorimpl(aIGCAvatarAuthConfig);
        interfaceC67352kd.resumeWith(aIGCAvatarAuthConfig);
    }
}
