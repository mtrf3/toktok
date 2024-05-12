package X;

import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.o;

/* renamed from: X.aY1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93881aY1 {
    public static final /* synthetic */ int LIZ = 0;

    public static VECameraSettings LIZ(VESize size) {
        o.LJIIIZ(size, "size");
        VECameraSettings.Builder builder = new VECameraSettings.Builder();
        builder.setCameraType(VECameraSettings.CAMERA_TYPE.TYPE2);
        builder.setPreviewSize(size.width, size.height);
        builder.setFps(40);
        VECameraSettings build = builder.build();
        o.LJIIIIZZ(build, "VECameraSettings.Builder…(40)\n            .build()");
        return build;
    }
}
