package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* loaded from: classes8.dex */
public final class H31 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(H3N.LJLIL);

    public static final H5I LIZ() {
        String string = ((Keva) LIZ.getValue()).getString("upload_param_key", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return (H5I) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), string, H5I.class);
    }

    public static final void LIZIZ(H5I h5i) {
        ((Keva) LIZ.getValue()).storeString("upload_param_key", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), h5i));
    }
}
