package X;

import android.media.ImageReader;
import com.google.ar.core.SharedCamera;

/* renamed from: X.aSQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final /* synthetic */ class C93534aSQ implements ImageReader.OnImageAvailableListener {
    public static final ImageReader.OnImageAvailableListener LJLIL = new C93534aSQ();

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0$SharedCamera(imageReader);
    }
}
