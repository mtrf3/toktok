package X;

import Y.ARunnableS38S0100000_2;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.AqS168S0100000_2;

/* renamed from: X.6kF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169036kF extends AbstractC169046kG {
    public final View LIZLLL;
    public final TDV LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;

    @Override // X.AbstractC169046kG
    public final void LIZ() {
        TDV tdv = this.LJ;
        if (tdv != null) {
            tdv.setProgress(0);
        }
    }

    @Override // X.AbstractC169046kG
    public final void LIZIZ() {
        TDV tdv = this.LJ;
        if (tdv != null) {
            tdv.setProgress(100);
        }
        TDV tdv2 = this.LJ;
        if (tdv2 == null) {
            return;
        }
        tdv2.setVisibility(8);
    }

    @Override // X.AbstractC169046kG
    public final void LJFF() {
        LIZLLL(this.LJI);
        LIZJ(this.LJIIIIZZ);
    }

    @Override // X.AbstractC169046kG
    public final void LJ(boolean z) {
        if (z) {
            LIZLLL(this.LJFF);
            LIZJ(this.LJII);
        }
    }

    @Override // X.AbstractC169046kG
    public final void LJI(AqS168S0100000_2 aqS168S0100000_2) {
        aqS168S0100000_2.invoke(Integer.valueOf(LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
        TDV tdv = this.LJ;
        if (tdv != null) {
            tdv.postDelayed(new ARunnableS38S0100000_2(this, 155), LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        }
    }

    public C169036kF(C81232VuO c81232VuO, View view, TDV tdv) {
        super(c81232VuO, view);
        this.LIZLLL = view;
        this.LJ = tdv;
        this.LJFF = 72;
        this.LJI = 71;
        this.LJII = -1;
        this.LJIIIIZZ = -1;
    }
}
