package X;

import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.common.interfaces.IExceptionMonitor;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import com.bytedance.pumbaa.common.interfaces.IStore;
import com.bytedance.pumbaa.pdp.api.IPolicyDecision;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import kotlin.jvm.internal.o;

/* renamed from: X.Pvu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66038Pvu implements InterfaceC66045Pw1 {
    public final /* synthetic */ C66226Pyw LIZ;
    public final /* synthetic */ C66031Pvn LIZIZ;

    @Override // X.InterfaceC66045Pw1
    public final C66143Pxb LIZ() {
        Object obj = this.LIZ.LL;
        o.LJI(obj);
        Object obj2 = this.LIZ.LLD;
        o.LJI(obj2);
        return new C66143Pxb((IRuleEngineService) obj, (IPolicyDecision) obj2);
    }

    @Override // X.InterfaceC66045Pw1
    public final C65992PvA LIZIZ() {
        IExceptionMonitor iExceptionMonitor = this.LIZ.LJZL;
        o.LJI(iExceptionMonitor);
        return new C65992PvA(iExceptionMonitor);
    }

    @Override // X.InterfaceC66045Pw1
    public final C66071PwR LIZJ() {
        ILogger iLogger = this.LIZ.LJLLLLLL;
        o.LJI(iLogger);
        return new C66071PwR(iLogger);
    }

    @Override // X.InterfaceC66045Pw1
    public final C65958Puc LIZLLL() {
        IEventMonitor iEventMonitor = this.LIZ.LJZ;
        o.LJI(iEventMonitor);
        return new C65958Puc(iEventMonitor);
    }

    @Override // X.InterfaceC66045Pw1
    public final C66055PwB LJ() {
        IStore iStore = this.LIZ.LJZI;
        o.LJI(iStore);
        return new C66055PwB(iStore);
    }

    @Override // X.InterfaceC66045Pw1
    public final C66031Pvn LJFF() {
        return this.LIZIZ;
    }

    public C66038Pvu(C66226Pyw c66226Pyw, C66031Pvn c66031Pvn) {
        this.LIZ = c66226Pyw;
        this.LIZIZ = c66031Pvn;
    }
}
