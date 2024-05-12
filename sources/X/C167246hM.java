package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig;

/* renamed from: X.6hM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167246hM {
    public static final VCOptConfig LIZ = new VCOptConfig(0, 0, 0, 7, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C167266hO.LJLIL);

    public static final VCOptConfig LIZ() {
        return (VCOptConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        if (LIZ().sampleRate > 0 && LIZ().bitRate > 0 && LIZ().channels > 0) {
            return true;
        }
        return false;
    }
}
