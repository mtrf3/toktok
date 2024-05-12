package X;

import android.view.View;
import android.widget.SeekBar;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WPs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82248WPs {
    public final InterfaceC88472Yns<? super TDY, C76800UCe> LIZ;
    public final boolean LIZIZ;
    public final AbstractC030109x LIZJ;
    public final InterfaceC88472Yns<? super SeekBar, C76800UCe> LIZLLL;
    public final InterfaceC88472Yns<? super C80695Vlj, C76800UCe> LJ;
    public final InterfaceC88472Yns<? super View, C76800UCe> LJFF;
    public final C74466TKk LJI;
    public final InterfaceC88472Yns<? super View, C76800UCe> LJII;

    public C82248WPs(AqS180S0100000_14 aqS180S0100000_14, AqS180S0100000_14 aqS180S0100000_142, C74466TKk filterListViewConfig, AqS180S0100000_14 aqS180S0100000_143, int i) {
        boolean z;
        C40171ht c40171ht;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            c40171ht = new C40171ht();
        } else {
            c40171ht = null;
        }
        aqS180S0100000_14 = (i & 16) != 0 ? null : aqS180S0100000_14;
        aqS180S0100000_142 = (i & 32) != 0 ? null : aqS180S0100000_142;
        filterListViewConfig = (i & 64) != 0 ? new C74466TKk(null, 63) : filterListViewConfig;
        aqS180S0100000_143 = (i & 128) != 0 ? null : aqS180S0100000_143;
        o.LJIIIZ(filterListViewConfig, "filterListViewConfig");
        this.LIZ = null;
        this.LIZIZ = z;
        this.LIZJ = c40171ht;
        this.LIZLLL = null;
        this.LJ = aqS180S0100000_14;
        this.LJFF = aqS180S0100000_142;
        this.LJI = filterListViewConfig;
        this.LJII = aqS180S0100000_143;
    }
}
