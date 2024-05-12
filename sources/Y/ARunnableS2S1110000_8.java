package Y;

import X.C48059Itb;
import X.C48066Iti;
import X.C48072Ito;
import X.C48082Ity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class ARunnableS2S1110000_8 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C48072Ito c48072Ito;
        synchronized (((C48066Iti) this.l1).LJI) {
            Iterator<C48072Ito> it = ((C48066Iti) this.l1).LJI.get(this.z2 ? 1 : 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    c48072Ito = it.next();
                    if (TextUtils.equals(this.s0, c48072Ito.LJLJL)) {
                        it.remove();
                        break;
                    }
                } else {
                    c48072Ito = null;
                    break;
                }
            }
        }
        if (c48072Ito != null) {
            c48072Ito.LJIIIIZZ();
        }
    }

    public static final void run$0(ARunnableS2S1110000_8 aRunnableS2S1110000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS2S1110000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onSeekEnd(aRunnableS2S1110000_8.s0, aRunnableS2S1110000_8.z2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S1110000_8 aRunnableS2S1110000_8) {
        boolean LIZ;
        try {
            aRunnableS2S1110000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S1110000_8 aRunnableS2S1110000_8) {
        boolean LIZ;
        try {
            C48059Itb c48059Itb = (C48059Itb) aRunnableS2S1110000_8.l1;
            boolean z = aRunnableS2S1110000_8.z2;
            c48059Itb.LIZ(z ? 1 : 0, C48082Ity.LIZ(aRunnableS2S1110000_8.s0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S1110000_8(C48059Itb c48059Itb, String str, int i) {
        this.$t = i;
        this.l1 = c48059Itb;
        this.z2 = false;
        this.s0 = str;
    }

    public ARunnableS2S1110000_8(C48066Iti c48066Iti, String str, int i) {
        this.$t = i;
        this.l1 = c48066Iti;
        this.z2 = false;
        this.s0 = str;
    }

    public ARunnableS2S1110000_8(OnUIPlayListener onUIPlayListener, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = onUIPlayListener;
        this.s0 = str;
        this.z2 = z;
    }
}
