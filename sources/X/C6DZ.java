package X;

import Y.ACListenerS22S0100000_2;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import java.util.ArrayList;

/* renamed from: X.6DZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DZ implements InterfaceC156726Dc {
    public final /* synthetic */ ARunnableS38S0100000_2 LIZ;

    public C6DZ(ARunnableS38S0100000_2 aRunnableS38S0100000_2) {
        this.LIZ = aRunnableS38S0100000_2;
    }

    @Override // X.InterfaceC156726Dc
    public final void LIZ(AnchorTransData anchorTransData) {
        ((ArrayList) ((C42901Gsb) C78934UyQ.LJLIL.getWikiService()).LIZ).remove(this);
        ((C156796Dj) ((ACListenerS22S0100000_2) this.LIZ.l0).l0).LLIIII.postDelayed(new ARunnableS21S0200000_2(this, anchorTransData, 20), 500L);
    }
}
