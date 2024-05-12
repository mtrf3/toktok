package X;

import Y.ARunnableS15S0101000_11;
import com.bytedance.vmsdk.worker.JsWorker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.Epe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37622Epe implements InterfaceC37628Epk {
    public static volatile C66090Pwk LJII;
    public volatile InterfaceC37636Eps LIZ;
    public final String LIZIZ;
    public final JsWorker LIZJ;
    public final String LIZLLL;
    public final C37631Epn LJ;
    public final C66098Pws LJFF;
    public final List<InterfaceC37628Epk> LJI;

    public final int hashCode() {
        return Objects.hash(this.LIZIZ, this.LIZLLL);
    }

    public C37622Epe(JsWorker jsWorker) {
        String str;
        if (LJII == null) {
            LJII = new C66090Pwk();
            C66090Pwk c66090Pwk = LJII;
            c66090Pwk.getClass();
            new PthreadThread(new ARunnableS15S0101000_11(2, c66090Pwk, 12), "LocalSocketServer").start();
        }
        this.LJI = new LinkedList();
        if (jsWorker.EngineType() == JsWorker.EngineType.V8) {
            str = "V8";
        } else {
            str = "QuickJS";
        }
        this.LIZIZ = i0.LJFF("VMSDK_JSWorker_", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("/inspector/");
        LIZ.append(jsWorker.getNativePtr());
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.LIZLLL = LIZIZ;
        this.LIZJ = jsWorker;
        C37631Epn c37631Epn = new C37631Epn(LIZIZ);
        this.LJ = c37631Epn;
        C66098Pws c66098Pws = new C66098Pws(new C68148Qoq(this));
        this.LJFF = c66098Pws;
        C66090Pwk c66090Pwk2 = LJII;
        C66092Pwm c66092Pwm = c66090Pwk2.LIZLLL;
        synchronized (c66092Pwm.LIZIZ) {
            if (!((ArrayList) c66092Pwm.LIZIZ).contains(this)) {
                ((ArrayList) c66092Pwm.LIZIZ).add(this);
            }
        }
        c66090Pwk2.LJ.LIZIZ(c37631Epn, c66098Pws);
    }

    @Override // X.InterfaceC37628Epk
    public final void LIZ(C66099Pwt c66099Pwt) {
        this.LIZ = c66099Pwt;
        Iterator<InterfaceC37628Epk> it = this.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(c66099Pwt);
        }
        this.LIZJ.onOpenInspectorSession();
    }

    @Override // X.InterfaceC37628Epk
    public final void LIZIZ(InterfaceC37636Eps interfaceC37636Eps) {
        this.LIZ = null;
        this.LIZJ.onCloseInspectorSession();
        Iterator<InterfaceC37628Epk> it = this.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(interfaceC37636Eps);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37622Epe.class != obj.getClass()) {
            return false;
        }
        C37622Epe c37622Epe = (C37622Epe) obj;
        if (Objects.equals(this.LIZIZ, c37622Epe.LIZIZ) && Objects.equals(this.LIZLLL, c37622Epe.LIZLLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37628Epk
    public final boolean LIZJ(C66099Pwt c66099Pwt, String str) {
        Iterator<InterfaceC37628Epk> it = this.LJI.iterator();
        while (it.hasNext()) {
            if (it.next().LIZJ(c66099Pwt, str)) {
                return true;
            }
        }
        this.LIZJ.onInspectorMessage(str);
        return false;
    }
}
