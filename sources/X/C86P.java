package X;

import com.ss.android.ugc.aweme.experiment.ImageBitrate;

/* renamed from: X.86P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86P extends AbstractC65781Prl implements InterfaceC65784Pro<ImageBitrate> {
    public static final C86P LJLIL = new C86P();

    public C86P() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ImageBitrate invoke() {
        ImageBitrate imageBitrate;
        try {
            FFL.LJIIIZ().getClass();
            imageBitrate = (ImageBitrate) FFL.LJIILLIIL(ImageBitrate.class, "photomode_image_multi_rate_config", true);
        } catch (Throwable unused) {
        }
        if (imageBitrate == null) {
            return null;
        }
        return imageBitrate;
    }
}
