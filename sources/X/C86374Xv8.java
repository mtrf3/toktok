package X;

import com.ss.android.ugc.aweme.ab.SurfaceViewConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Xv8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86374Xv8 extends AbstractC65781Prl implements InterfaceC65784Pro<SurfaceViewConfig> {
    public static final C86374Xv8 LJLIL = new C86374Xv8();

    public C86374Xv8() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final SurfaceViewConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        SurfaceViewConfig surfaceViewConfig = C86373Xv7.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "live_card_use_surface_view", 31744, SurfaceViewConfig.class, surfaceViewConfig);
        if (LJIJ != 0) {
            surfaceViewConfig = LJIJ;
        }
        o.LJIIIIZZ(surfaceViewConfig, "ABManager.getInstance().…a)\n            ?: DEFAULT");
        return surfaceViewConfig;
    }
}
