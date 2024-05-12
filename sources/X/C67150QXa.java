package X;

import com.bytedance.sdk.account.idv.model.IDVDecisionConf;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.QXa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67150QXa implements InterfaceC67153QXd {
    public final /* synthetic */ IDVDecisionConf LIZ;
    public final /* synthetic */ CountDownLatch LIZIZ;
    public final /* synthetic */ AtomicBoolean LIZJ;
    public final /* synthetic */ AtomicBoolean LIZLLL;
    public final /* synthetic */ java.util.Map LJ;

    @Override // X.InterfaceC67153QXd
    public final void LIZ() {
        this.LIZIZ.countDown();
    }

    @Override // X.InterfaceC67153QXd
    public final void LIZIZ(EnumC58915NAh result) {
        boolean z;
        o.LJIIJ(result, "result");
        boolean z2 = true;
        if (result == EnumC58915NAh.SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        AtomicBoolean atomicBoolean = this.LIZJ;
        if (!z || !this.LIZ.needReplay) {
            z2 = false;
        }
        atomicBoolean.set(z2);
        this.LIZLLL.set(z);
        this.LJ.put("passport_ticket", this.LIZ.passportTicket);
    }

    public C67150QXa(IDVDecisionConf iDVDecisionConf, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, java.util.Map map) {
        this.LIZ = iDVDecisionConf;
        this.LIZIZ = countDownLatch;
        this.LIZJ = atomicBoolean;
        this.LIZLLL = atomicBoolean2;
        this.LJ = map;
    }
}
