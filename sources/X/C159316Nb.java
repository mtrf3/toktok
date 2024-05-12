package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6Nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159316Nb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, String stickerType, String str, boolean z) {
        o.LJIIIZ(stickerType, "stickerType");
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(z ? 1 : 0, "success");
        c188727au.LJ(j, "duration");
        c188727au.LJIIIZ("sticker_type", stickerType);
        if (!z) {
            c188727au.LJI("error_msg", str);
        }
        FMX.LJIIL("new_engine_sticker_compile_result", c188727au.LIZ);
    }
}
