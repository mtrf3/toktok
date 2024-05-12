package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.jvm.internal.o;

/* renamed from: X.Ekc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37310Ekc implements InterfaceC65753PrJ<VideoCreation> {
    public final /* synthetic */ InterfaceC67352kd<String> LIZ;

    public C37310Ekc(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        InterfaceC67352kd<String> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(VideoCreation videoCreation) {
        if (videoCreation instanceof UploadAuthKeyConfig) {
            String json = GsonProtectorUtils.toJson(ET1.LIZ, videoCreation);
            InterfaceC67352kd<String> interfaceC67352kd = this.LIZ;
            C3C5.m7constructorimpl(json);
            interfaceC67352kd.resumeWith(json);
            return;
        }
        InterfaceC67352kd<String> interfaceC67352kd2 = this.LIZ;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd2.resumeWith(null);
    }
}
