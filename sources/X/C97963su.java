package X;

/* renamed from: X.3su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97963su {
    public static void LIZ(String str, boolean z) {
        LFH lfh = LFH.LIZIZ;
        InterfaceC97983sw LIZ = lfh.LIZLLL().LJIIIIZZ().LIZ();
        if (z) {
            if (LIZ != null) {
                LIZ.LIZIZ();
            }
        } else {
            if (LIZ == null || !LIZ.LIZJ(str)) {
                return;
            }
            lfh.LIZLLL().LIZIZ();
            LFE.LIZIZ("DM-BookMode", "TabletBookModeHelper tryShowDefaultGuideSubPage");
            LIZ.LIZ();
        }
    }
}
