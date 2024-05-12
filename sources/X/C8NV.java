package X;

import com.ss.android.ugc.aweme.experiment.ImagePreloadConfig;

/* renamed from: X.8NV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NV extends AbstractC65781Prl implements InterfaceC65784Pro<ImagePreloadConfig> {
    public static final C8NV LJLIL = new C8NV();

    public C8NV() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.experiment.ImagePreloadConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ImagePreloadConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        ImagePreloadConfig imagePreloadConfig = C8NU.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "photomode_image_preload_config", 31744, ImagePreloadConfig.class, imagePreloadConfig);
        if (LJIJ == 0) {
            return imagePreloadConfig;
        }
        return LJIJ;
    }
}
