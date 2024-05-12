package X;

import Y.ARunnableS18S0101000_14;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: X.VIu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79520VIu implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager LJLILLLLZI;
    public final WeakReference<InterfaceC79519VIt> LJLJI;
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());
    public boolean LJLJJI = true;
    public int LJLJJL = 1;
    public boolean LJLJJLL = false;
    public final ARunnableS50S0100000_14 LJLJL = new ARunnableS50S0100000_14(this, 165);

    public final void LIZ(int i) {
        InterfaceC79519VIt interfaceC79519VIt = this.LJLJI.get();
        if (interfaceC79519VIt == null) {
            try {
                this.LJLILLLLZI.abandonAudioFocus(this);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            this.LJLIL.removeCallbacksAndMessages(null);
            return;
        }
        if (i == -2) {
            this.LJLJJLL = false;
            interfaceC79519VIt.onAudioFocusLoss(true);
        } else if (i == 1) {
            this.LJLJJLL = true;
            interfaceC79519VIt.onAudioFocusGain(true);
        } else {
            if (i != -1) {
                return;
            }
            this.LJLJJLL = false;
            interfaceC79519VIt.onAudioFocusLoss(true);
        }
    }

    public final void LIZIZ(int i) {
        InterfaceC79519VIt interfaceC79519VIt = this.LJLJI.get();
        if (interfaceC79519VIt == null) {
            return;
        }
        this.LJLJJL = i;
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (C16880lQ.LLJJJJLIIL(this.LJLILLLLZI, this, 3, i) == 1) {
            this.LJLJJI = true;
            this.LJLIL.removeCallbacksAndMessages(this.LJLJL);
            this.LJLJJLL = true;
            interfaceC79519VIt.onAudioFocusGain(false);
            return;
        }
        if (this.LJLJJI) {
            this.LJLJJI = false;
            this.LJLIL.removeCallbacksAndMessages(this.LJLJL);
            this.LJLIL.postDelayed(this.LJLJL, 1000L);
        } else {
            this.LJLJJLL = false;
            interfaceC79519VIt.onAudioFocusLoss(false);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("change audio:");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            this.LJLIL.post(new ARunnableS18S0101000_14(i, this, 17));
        } else {
            LIZ(i);
        }
    }

    public C79520VIu(Context context, InterfaceC79519VIt interfaceC79519VIt) {
        this.LJLILLLLZI = (AudioManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "audio");
        this.LJLJI = new WeakReference<>(interfaceC79519VIt);
    }
}
