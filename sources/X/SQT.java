package X;

import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS143S0200000_12;

/* loaded from: classes13.dex */
public final class SQT extends AbstractC73234Sog<Object> {
    public final /* synthetic */ C70846RrG LJLJJL;

    @Override // X.AbstractC73235Soh
    public final void LJLLLLLL(C73242Soo c73242Soo) {
        Iterator it = ((ArrayList) this.LJLJJL.LIZ).iterator();
        while (it.hasNext()) {
            OSJ osj = (OSJ) it.next();
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) osj.getFirst();
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) osj.getSecond();
            c73242Soo.LJFF(new AqS143S0200000_12(interfaceC88471Ynr, this, c73242Soo, 101), interfaceC88472Yns, (InterfaceC88471Ynr) osj.getThird());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQT(C70846RrG c70846RrG, LifecycleOwner lifecycleOwner, C73246Sos c73246Sos) {
        super(lifecycleOwner, c73246Sos);
        this.LJLJJL = c70846RrG;
    }
}
