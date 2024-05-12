package X;

import Y.ACallableS117S0100000_14;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.Vt3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class HandlerC81149Vt3 extends Handler {
    public final WeakReference<C81150Vt4> LIZ;
    public final AudioManager LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public final boolean LJI;

    public final void LIZ() {
        try {
            if (this.LJI) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("currentVolume(setVolume) = ");
                LIZ.append(this.LJ);
                C36922EeM.LIZLLL(4, "VoiceAdjust", X1D.LIZIZ(LIZ));
                this.LIZIZ.setStreamVolume(3, this.LJ, 8);
            }
        } catch (SecurityException e) {
            C36922EeM.LJFF(e);
        }
        C10K.LIZIZ(new ACallableS117S0100000_14(this, 5), C10K.LJIIIIZZ, null);
    }

    public final void LIZIZ() {
        try {
            this.LJ = this.LIZIZ.getStreamVolume(3);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("currentVolume(syncCurrentVolume) = ");
            LIZ.append(this.LJ);
            C36922EeM.LIZLLL(4, "VoiceAdjust", X1D.LIZIZ(LIZ));
        } catch (NullPointerException e) {
            C36922EeM.LJFF(e);
            this.LJFF = true;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C36922EeM.LIZLLL(4, "VoiceAdjust", "execCutVolume");
                LIZIZ();
                int i2 = this.LJ - this.LIZLLL;
                this.LJ = i2;
                if (i2 < 0) {
                    this.LJ = 0;
                }
                LIZ();
                return;
            }
            C36922EeM.LIZLLL(4, "VoiceAdjust", "execAddVolume");
            LIZIZ();
            int i3 = this.LJ + this.LIZLLL;
            this.LJ = i3;
            int i4 = this.LIZJ;
            if (i3 > i4) {
                this.LJ = i4;
            }
            LIZ();
            return;
        }
        C36922EeM.LIZLLL(4, "VoiceAdjust", "initVolume");
        int LLLLLLZZ = C16880lQ.LLLLLLZZ(this.LIZIZ, 3);
        this.LIZJ = LLLLLLZZ;
        int i5 = LLLLLLZZ / 15;
        this.LIZLLL = i5;
        if (i5 == 0) {
            this.LIZLLL = 1;
        }
        LIZIZ();
    }

    public HandlerC81149Vt3(Looper looper, C81150Vt4 c81150Vt4) {
        super(looper);
        this.LJI = true;
        this.LIZ = new WeakReference<>(c81150Vt4);
        this.LIZIZ = (AudioManager) C16880lQ.LLILL(c81150Vt4.getContext(), "audio");
        sendEmptyMessage(1);
    }
}
