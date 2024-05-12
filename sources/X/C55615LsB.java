package X;

import Y.ARunnableS45S0100000_9;
import android.os.Handler;
import com.ss.android.ugc.feed.platform.panel.dm.DMInnerPushComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.LsB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55615LsB implements C2MJ {
    public int LJLIL;
    public final /* synthetic */ DMInnerPushComponent LJLILLLLZI;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C55615LsB(DMInnerPushComponent dMInnerPushComponent) {
        this.LJLILLLLZI = dMInnerPushComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i == 1 && i != this.LJLIL) {
            DMInnerPushComponent dMInnerPushComponent = this.LJLILLLLZI;
            if (dMInnerPushComponent.LJLJJL == ((Number) dMInnerPushComponent.LJLJJI.getValue()).intValue()) {
                ((InterfaceC55617LsD) this.LJLILLLLZI.LJLJI.getValue()).LJI(0L, true);
                ((Handler) C61325O4z.LIZ.getValue()).postDelayed(new ARunnableS45S0100000_9(this.LJLILLLLZI, 10), 500L);
            }
        }
        this.LJLIL = i;
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        this.LJLILLLLZI.LJLJJL++;
    }
}
