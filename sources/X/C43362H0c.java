package X;

import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import kotlin.jvm.internal.o;

/* renamed from: X.H0c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43362H0c implements InterfaceC65753PrJ<VideoCreation> {
    public final /* synthetic */ C43360H0a LIZ;

    public C43362H0c(C43360H0a c43360H0a) {
        this.LIZ = c43360H0a;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        XFL xfl = this.LIZ.LJI;
        if (xfl != null) {
            xfl.LIZIZ();
        }
    }

    @Override // X.InterfaceC65753PrJ
    public final /* bridge */ /* synthetic */ void onSuccess(VideoCreation videoCreation) {
    }
}
