package X;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;

/* renamed from: X.6Wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161726Wi extends AbstractC65781Prl implements InterfaceC65784Pro<ImageDecodeOptionsBuilder> {
    public static final C161726Wi LJLIL = new C161726Wi();

    public C161726Wi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ImageDecodeOptionsBuilder invoke() {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
        imageDecodeOptionsBuilder.LIZIZ(1);
        imageDecodeOptionsBuilder.LJ = false;
        return imageDecodeOptionsBuilder;
    }
}
