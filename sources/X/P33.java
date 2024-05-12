package X;

import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.view.Surface;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class P33 {
    public static VirtualDisplay LIZ(MediaProjection createVirtualDisplay, String str, int i, int i2, int i3, Surface surface, C0JZ c0jz, Cert cert) {
        o.LJIIJ(createVirtualDisplay, "$this$createVirtualDisplay");
        C29174Bcg.LIZ.getClass();
        OHW LIZ = P34.LIZ(0, cert, "screenRecord_createVirtualDisplay");
        C78929UyL.LIZIZ(LIZ, "android/media/projection/MediaProjection", "createVirtualDisplay(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;", C113554cx.LJJL(new OSZ("name", str), new OSZ("width", Integer.valueOf(i)), new OSZ("height", Integer.valueOf(i2)), new OSZ("dpi", Integer.valueOf(i3)), new OSZ("flags", 3), new OSZ("surface", surface), new OSZ("callback", c0jz), new OSZ("handler", null)));
        return (VirtualDisplay) C39207Fa7.LIZ(LIZ, new P30(createVirtualDisplay, str, i, i2, i3, surface, c0jz));
    }
}
