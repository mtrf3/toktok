package X;

import Y.ARunnableS47S0100000_11;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Pd4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64870Pd4 extends AbstractC64867Pd1<C64873Pd7> {
    public InterfaceC64879PdD LIZIZ;
    public Handler LIZJ;
    public final AtomicBoolean LIZLLL;
    public final ARunnableS47S0100000_11 LJ;
    public final ARunnableS47S0100000_11 LJFF;

    @Override // X.AbstractC64867Pd1
    public final void LIZIZ() {
    }

    @Override // X.AbstractC64867Pd1
    public final void LIZLLL() {
        this.LIZJ.removeCallbacks(this.LJ);
        this.LIZJ.removeCallbacks(this.LJFF);
        this.LIZLLL.set(false);
    }

    @Override // X.AbstractC64867Pd1
    public final void LJ() {
        this.LIZLLL.set(true);
        this.LIZJ.removeCallbacks(this.LJ);
        this.LIZJ.postDelayed(this.LJ, ((C64873Pd7) this.LIZ).LIZIZ);
    }

    @Override // X.AbstractC64867Pd1
    public final void LJFF() {
        this.LIZLLL.set(false);
        this.LIZJ.removeCallbacks(this.LJ);
    }

    public C64870Pd4(C64876PdA c64876PdA) {
        super(c64876PdA);
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new ARunnableS47S0100000_11(this, 101);
        this.LJFF = new ARunnableS47S0100000_11(this, 102);
    }

    @Override // X.AbstractC64867Pd1
    public final void LIZJ(C64598PWw c64598PWw) {
        C64873Pd7 c64873Pd7 = (C64873Pd7) this.LIZ;
        if (c64873Pd7.LIZ == -1) {
            if (c64598PWw == null) {
                c64873Pd7.LIZ = 270000L;
            } else {
                String LIZ = c64598PWw.LIZ("Handshake-Options", null);
                if (LIZ != null) {
                    String[] split = LIZ.split(";");
                    int length = split.length;
                    long j = -1;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        String str = split[i];
                        if (!TextUtils.isEmpty(str)) {
                            String[] split2 = str.split("=");
                            if ("ping-interval".equals(split2[0])) {
                                try {
                                    j = 1000 * CastLongProtector.parseLong(split2[1]);
                                    break;
                                } catch (NumberFormatException unused) {
                                    j = 270000;
                                }
                            } else {
                                continue;
                            }
                        }
                        i++;
                    }
                    if (j != -1) {
                        ((C64873Pd7) this.LIZ).LIZ = j;
                    }
                }
                ((C64873Pd7) this.LIZ).LIZ = 270000L;
            }
        }
        long j2 = ((C64873Pd7) this.LIZ).LIZ;
        this.LIZJ.removeCallbacks(this.LJFF);
        this.LIZJ.postDelayed(this.LJFF, j2);
    }

    @Override // X.AbstractC64867Pd1
    public final void LIZ(C64874Pd8 c64874Pd8, WeakHandler weakHandler) {
        this.LIZIZ = c64874Pd8;
        this.LIZJ = weakHandler;
    }
}
