package X;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;

/* renamed from: X.6Wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161736Wj extends AbstractC65781Prl implements InterfaceC65784Pro<ImageDecodeOptionsBuilder> {
    public static final C161736Wj LJLIL = new C161736Wj();

    public C161736Wj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ImageDecodeOptionsBuilder invoke() {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        return imageDecodeOptionsBuilder;
    }
}
