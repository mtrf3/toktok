package X;

import android.view.View;

/* renamed from: X.WEk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81954WEk {
    public View LIZ;
    public C80925VpR LIZIZ;
    public InterfaceC81963WEt LIZJ;

    public final void LIZ(C80841Vo5 c80841Vo5) {
        C81949WEf transferConfig;
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        InterfaceC81963WEt interfaceC81963WEt = this.LIZJ;
        if (interfaceC81963WEt == null || (transferConfig = ((C81947WEd) interfaceC81963WEt).getTransferConfig()) == null) {
            return;
        }
        int i = transferConfig.LJIJJ;
        this.LIZIZ.setRealSize(i);
        this.LIZIZ.setViewPager(c80841Vo5);
        if (i <= 1) {
            this.LIZIZ.setVisibility(8);
        } else {
            this.LIZIZ.setVisibility(0);
        }
    }
}
