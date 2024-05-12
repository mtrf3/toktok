package X;

import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;

/* renamed from: X.5cO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138685cO {
    public static final int LIZ() {
        return C00F.LIZ(31744, 0, "text_reading_timbre_expr", true);
    }

    static {
        boolean z = true;
        if (LIZ() != 1) {
            z = false;
        }
        AnonymousClass699.LJFF = z;
    }

    public static final boolean LIZIZ(boolean z) {
        if (LIZ() == 2) {
            return true;
        }
        if (LIZ() == 3 || LIZ() == 4) {
            return !z;
        }
        return !SpeakerCenter.LJFF();
    }
}
