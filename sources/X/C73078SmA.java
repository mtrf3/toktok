package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SmA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73078SmA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(long j) {
        C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.f64J;
        c48459J0d.LIZJ().remove(String.valueOf(j));
        c48459J0d.LIZ(c48459J0d.LIZJ());
    }

    public static void LIZJ(String id) {
        o.LJIIIZ(id, "id");
        C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.f64J;
        c48459J0d.LIZJ().remove(id);
        c48459J0d.LIZ(c48459J0d.LIZJ());
    }

    public static void LIZ(long j, String url) {
        o.LJIIIZ(url, "url");
        C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.f64J;
        java.util.Map<String, String> LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_REPLAY_SCHEDULED_DOWNLOAD_VIDEO_LIST.value");
        LIZJ.put(String.valueOf(j), url);
        c48459J0d.LIZ(c48459J0d.LIZJ());
    }
}
