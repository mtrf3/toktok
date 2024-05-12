package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.JCj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48777JCj implements AudioManager.OnAudioFocusChangeListener {
    public static final C48777JCj LJLIL = new C48777JCj();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C47976IsG.INSTANCE);
    public static final Object LJLJI = new Object();
    public static boolean LJLJJI;
    public static boolean LJLJJL;
    public static boolean LJLJJLL;
    public static AudioFocusRequest LJLJL;
    public static AudioManager.OnAudioFocusChangeListener LJLJLJ;

    public static void LIZ() {
        int abandonAudioFocus;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioManager audioManager = (AudioManager) LJLILLLLZI.getValue();
            AudioFocusRequest audioFocusRequest = LJLJL;
            if (audioFocusRequest != null) {
                abandonAudioFocus = audioManager.abandonAudioFocusRequest(audioFocusRequest);
            } else {
                o.LJIJI("currentAudioFocusRequest");
                throw null;
            }
        } else {
            abandonAudioFocus = ((AudioManager) LJLILLLLZI.getValue()).abandonAudioFocus(LJLJLJ);
        }
        synchronized (LJLJI) {
            if (abandonAudioFocus == 1) {
                LJLJJI = false;
            }
        }
        C1DG.LIZ().setAutoAudioFocus(true);
    }

    public static void LIZIZ() {
        C48777JCj c48777JCj = LJLIL;
        C1DG.LIZ().setAutoAudioFocus(false);
        if (LJLJJI) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c48777JCj.LIZJ();
            return;
        }
        int LLJJJJLIIL = C16880lQ.LLJJJJLIIL((AudioManager) LJLILLLLZI.getValue(), c48777JCj, 3, 1);
        synchronized (LJLJI) {
            if (LLJJJJLIIL != 0) {
                if (LLJJJJLIIL == 1) {
                    LJLJJI = true;
                }
            } else {
                LJLJJI = false;
            }
        }
    }

    public final void LIZJ() {
        AudioManager audioManager = (AudioManager) LJLILLLLZI.getValue();
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setUsage(1);
        builder2.setContentType(2);
        builder.setAudioAttributes(builder2.build());
        builder.setAcceptsDelayedFocusGain(true);
        builder.setOnAudioFocusChangeListener(this);
        AudioFocusRequest it = builder.build();
        Object obj = LJLJI;
        synchronized (obj) {
            o.LJIIIIZZ(it, "it");
            LJLJL = it;
        }
        int LLJJJJJIL = C16880lQ.LLJJJJJIL(audioManager, it);
        synchronized (obj) {
            if (LLJJJJJIL != 0) {
                if (LLJJJJJIL != 1) {
                    if (LLJJJJJIL != 2) {
                        LJLJJI = false;
                    } else {
                        LJLJJI = false;
                        LJLJJL = true;
                    }
                } else {
                    LJLJJI = true;
                }
            } else {
                LJLJJI = false;
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = LJLJLJ;
        if (onAudioFocusChangeListener != null) {
            onAudioFocusChangeListener.onAudioFocusChange(i);
        }
        if (i != -2) {
            if (i != -1) {
                if (i != 1) {
                    return;
                }
                synchronized (LJLJI) {
                    LJLJJL = false;
                    LJLJJLL = false;
                    LJLJJI = true;
                }
                return;
            }
            synchronized (LJLJI) {
                LJLJJLL = false;
                LJLJJL = false;
                LJLJJI = false;
            }
            return;
        }
        synchronized (LJLJI) {
            LJLJJLL = true;
            LJLJJL = false;
            LJLJJI = false;
        }
    }
}
