package X;

import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;

/* renamed from: X.Kza, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53526Kza implements AUS {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC65784Pro<Boolean> LIZLLL;
    public final LifecycleOwner LJ;
    public final C107724Kq LJFF;

    public C53526Kza() {
        this(null, null, null, 63);
    }

    public C53526Kza(AqS154S0100000_4 aqS154S0100000_4, M9F m9f, C107724Kq c107724Kq, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = R.color.dq;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            i3 = R.attr.gp;
        } else {
            i3 = 0;
        }
        aqS154S0100000_4 = (i & 8) != 0 ? null : aqS154S0100000_4;
        m9f = (i & 16) != 0 ? null : m9f;
        c107724Kq = (i & 32) != 0 ? null : c107724Kq;
        this.LIZ = i2;
        this.LIZIZ = i3;
        this.LIZJ = false;
        this.LIZLLL = aqS154S0100000_4;
        this.LJ = m9f;
        this.LJFF = c107724Kq;
    }
}
