package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* renamed from: X.HhI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44748HhI {
    public static final /* synthetic */ int LIZ = 0;

    public static final float LIZ() {
        String json;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key : video_bitrate, byteBenchValue : ");
        C44770Hhe c44770Hhe = InterfaceC44780Hho.LIZ;
        Float valueOf = Float.valueOf(c44770Hhe.videoBitrate());
        if (C30581Hy.LJJIFFI(Float.class)) {
            json = String.valueOf(valueOf);
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), valueOf);
        }
        LIZ2.append(json);
        C5Z6.LIZ(X1D.LIZIZ(LIZ2));
        return c44770Hhe.videoBitrate();
    }
}
