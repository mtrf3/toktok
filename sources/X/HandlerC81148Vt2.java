package X;

import Y.ACallableS117S0100000_14;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Vt2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class HandlerC81148Vt2 extends Handler {
    public final WeakReference<C81147Vt1> LIZ;
    public final AudioManager LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;

    public final void LIZ() {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("currentVolume(setVolume) = ");
            LIZ.append(this.LJ);
            C36922EeM.LIZLLL(4, "VoiceAdjust", X1D.LIZIZ(LIZ));
            this.LIZIZ.setStreamVolume(3, this.LJ, 8);
        } catch (SecurityException e) {
            C36922EeM.LJFF(e);
        }
        C10K.LIZIZ(new ACallableS117S0100000_14(this, 0), C10K.LJIIIIZZ, null);
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
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC81148Vt2(Looper looper, C81147Vt1 audioControlView) {
        super(looper);
        o.LJIIIZ(audioControlView, "audioControlView");
        this.LIZ = new WeakReference<>(audioControlView);
        Object LLILL = C16880lQ.LLILL(audioControlView.getContext(), "audio");
        o.LJII(LLILL, "null cannot be cast to non-null type android.media.AudioManager");
        this.LIZIZ = (AudioManager) LLILL;
        sendEmptyMessage(1);
    }
}
