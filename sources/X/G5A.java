package X;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes7.dex */
public final class G5A {
    public AudioManager LIZ;
    public final G5B LIZIZ = new G5B();

    public G5A(Context context) {
        this.LIZ = (AudioManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "audio");
    }

    public final void LIZ(Context context) {
        G5B g5b;
        try {
            if (this.LIZ == null) {
                this.LIZ = (AudioManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "audio");
            }
            AudioManager audioManager = this.LIZ;
            if (audioManager != null && (g5b = this.LIZIZ) != null) {
                audioManager.abandonAudioFocus(g5b);
            }
            this.LIZ = null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZIZ(Context context) {
        G5B g5b;
        try {
            if (this.LIZ == null) {
                this.LIZ = (AudioManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "audio");
            }
            AudioManager audioManager = this.LIZ;
            if (audioManager != null && (g5b = this.LIZIZ) != null) {
                C16880lQ.LLJJJJLIIL(audioManager, g5b, 3, 2);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
