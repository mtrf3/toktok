package X;

import android.widget.TextView;
import kotlin.jvm.internal.AqS180S0100000_14;

/* renamed from: X.TKk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74466TKk {
    public final int LIZ;
    public final boolean LIZIZ;
    public final InterfaceC88472Yns<? super C74462TKg, C76800UCe> LIZJ;
    public final InterfaceC88472Yns<? super TextView, C76800UCe> LIZLLL;
    public final int LJ;
    public final int LJFF;

    public C74466TKk(AqS180S0100000_14 aqS180S0100000_14, int i) {
        int i2;
        boolean z;
        if ((i & 1) != 0) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        aqS180S0100000_14 = (i & 4) != 0 ? null : aqS180S0100000_14;
        this.LIZ = i2;
        this.LIZIZ = z;
        this.LIZJ = aqS180S0100000_14;
        this.LIZLLL = null;
        this.LJ = 0;
        this.LJFF = 0;
    }
}
