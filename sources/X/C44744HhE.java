package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.HhE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44744HhE {
    public static final String LIZ() {
        String json;
        String json2;
        FFL.LJIIIZ().getClass();
        String LJIILJJIL = FFL.LJIILJJIL(31744, "ve_camera_preview_size", "", true);
        o.LJIIIIZZ(LJIILJJIL, "getInstance().getStringV…aPreviewSize::class.java)");
        String veCameraPreviewSize = InterfaceC44776Hhk.LJIIIZ.veCameraPreviewSize();
        if (C44796Hi4.LIZ() || C44797Hi5.LIZ()) {
            StringBuilder sb = new StringBuilder("key : ve_camera_preview_size , byteBenchValue : ");
            if (C30581Hy.LJJIFFI(String.class)) {
                json = String.valueOf(veCameraPreviewSize);
            } else {
                json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), veCameraPreviewSize);
            }
            C0DC.LIZLLL(sb, json);
            return veCameraPreviewSize;
        }
        StringBuilder sb2 = new StringBuilder("key : ve_camera_preview_size , libraValue : ");
        if (C30581Hy.LJJIFFI(String.class)) {
            json2 = LJIILJJIL;
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), LJIILJJIL);
        }
        C0DC.LIZLLL(sb2, json2);
        return LJIILJJIL;
    }
}
