package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEditingOptConfig;
import com.zhiliaoapp.musically.R;

/* renamed from: X.62A, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62A {
    public static final C62A LIZ = new C62A();
    public static final AudioEditingOptConfig LIZIZ = new AudioEditingOptConfig(false, 0, 0, 7, null);

    public static int LIZ() {
        if (!LIZLLL()) {
            return R.string.zr;
        }
        int i = LIZIZ().entranceNameType;
        if (i != 1) {
            if (i != 2) {
                return R.string.zr;
            }
            return R.string.bv_;
        }
        return R.string.bvb;
    }

    public static final AudioEditingOptConfig LIZIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        AudioEditingOptConfig audioEditingOptConfig = LIZIZ;
        LJIIIZ.getClass();
        AudioEditingOptConfig audioEditingOptConfig2 = (AudioEditingOptConfig) FFL.LJIJ(true, "audio_editing_panel_opt", 31744, AudioEditingOptConfig.class, audioEditingOptConfig);
        if (audioEditingOptConfig2 == null) {
            return audioEditingOptConfig;
        }
        return audioEditingOptConfig2;
    }

    public static boolean LIZJ() {
        if (LIZIZ().panelStyle == 2) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL() {
        if (LIZIZ().openOpt && !C1DG.LJIIIIZZ()) {
            return true;
        }
        return false;
    }
}
