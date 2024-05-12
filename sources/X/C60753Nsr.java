package X;

import android.os.Bundle;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nsr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60753Nsr extends AbstractC61008Nwy<Bundle, String> {
    public final InterfaceC61488OBg LIZ;
    public final C60737Nsb LIZIZ;

    public C60753Nsr(InterfaceC61488OBg interfaceC61488OBg, C60737Nsb c60737Nsb) {
        this.LIZ = interfaceC61488OBg;
        this.LIZIZ = c60737Nsb;
    }

    @Override // X.AbstractC61008Nwy
    public final void LIZ(C08200Tw c08200Tw, QXX qxx) {
        InterfaceC60710NsA interfaceC60710NsA;
        HybridSchemaParam LIZLLL;
        C60756Nsu LIZJ;
        long currentTimeMillis = System.currentTimeMillis();
        RunnableC60754Nss runnableC60754Nss = new RunnableC60754Nss(this, c08200Tw, qxx, currentTimeMillis);
        C60737Nsb c60737Nsb = this.LIZIZ;
        if (c60737Nsb != null && (interfaceC60710NsA = c60737Nsb.hybridParams) != null && (LIZLLL = interfaceC60710NsA.LIZLLL()) != null && LIZLLL.getStarlingFallback()) {
            C60737Nsb hybridContext = this.LIZIZ;
            Object obj = c08200Tw.LIZ;
            o.LJFF(obj, "request.url");
            C60755Nst c60755Nst = new C60755Nst(this, currentTimeMillis, qxx, runnableC60754Nss);
            o.LJIIJ(hybridContext, "hybridContext");
            if (C60757Nsv.LIZ && (LIZJ = C60757Nsv.LIZJ(hybridContext, null)) != null && o.LJ(LIZJ.LJIIIZ, obj)) {
                LIZJ.LIZ(c60755Nst);
                return;
            }
        }
        runnableC60754Nss.run();
    }
}
