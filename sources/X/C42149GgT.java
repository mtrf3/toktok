package X;

import Y.ACallableS110S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.publish.publishcheck.CheckManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GgT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42149GgT {
    public final String LIZ;
    public final int LIZIZ;
    public final ArrayList<AbstractC42152GgW<?>> LIZJ;
    public long LIZLLL;
    public long LJ;
    public final java.util.Set<AbstractC42152GgW<?>> LJFF;
    public final List<InterfaceC42153GgX> LJI;
    public AbstractC42152GgW<?> LJII;
    public final C42150GgU LJIIIIZZ;
    public final Handler LJIIIZ;
    public boolean LJIIJ;
    public EnumC42155GgZ LJIIJJI;
    public int LJIIL;
    public InterfaceC65784Pro<C76800UCe> LJIILIIL;

    public final void LIZLLL() {
        synchronized (this) {
            EnumC42155GgZ enumC42155GgZ = this.LJIIJJI;
            EnumC42155GgZ enumC42155GgZ2 = EnumC42155GgZ.CANCELED;
            if (enumC42155GgZ != enumC42155GgZ2 && enumC42155GgZ != EnumC42155GgZ.END) {
                int i = this.LJIIL;
                if (i >= 0 && i < this.LIZJ.size()) {
                    String LIZJ = this.LIZJ.get(this.LJIIL).LIZJ();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("canceled by: ");
                    LIZ.append(LIZJ);
                    LIZ.append(", total time: ");
                    LIZ.append(System.currentTimeMillis() - this.LIZLLL);
                    LJ(X1D.LIZIZ(LIZ));
                    C42151GgV.LIZ(this.LIZLLL, this.LIZ, LIZJ, this.LJIIJ);
                }
                this.LJIIJJI = enumC42155GgZ2;
                Iterator it = ((ArrayList) this.LJI).iterator();
                while (it.hasNext()) {
                    ((InterfaceC42153GgX) it.next()).onCancel();
                }
                CheckManager.LIZ.LIZLLL(this);
            }
        }
    }

    public final void LJI() {
        synchronized (this) {
            if (this.LJIIJJI != EnumC42155GgZ.NEW) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start: click in illegal state: ");
                LIZ.append(this.LJIIJJI);
                LJ(X1D.LIZIZ(LIZ));
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("check start, checker: ");
            LIZ2.append(this.LIZ);
            LJ(X1D.LIZIZ(LIZ2));
            Iterator it = ((ArrayList) this.LJI).iterator();
            while (it.hasNext()) {
                ((InterfaceC42153GgX) it.next()).LIZIZ();
            }
            this.LJFF.clear();
            long currentTimeMillis = System.currentTimeMillis();
            this.LIZLLL = currentTimeMillis;
            this.LJ = currentTimeMillis;
            this.LJIIJJI = EnumC42155GgZ.RUNNING;
            this.LJIIL = -1;
            Iterator<AbstractC42152GgW<?>> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                AbstractC42152GgW<?> next = it2.next();
                next.getClass();
                next.LJLILLLLZI = new MutableLiveData<>();
                next.LJLJI = new MutableLiveData<>(Boolean.FALSE);
                C10K.LIZJ(new ACallableS110S0100000_7(next, 62));
            }
            String checkerName = this.LIZ;
            long j = this.LIZLLL;
            o.LJIIIZ(checkerName, "checkerName");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("checker_name", checkerName);
            c188727au.LJ(j, "start_time");
            FMX.LJIIL("tool_performance_publish_check_start", c188727au.LIZ);
            this.LJIIIIZZ.LIZIZ(null);
        }
    }

    public final boolean LIZIZ() {
        EnumC42155GgZ enumC42155GgZ = this.LJIIJJI;
        if (enumC42155GgZ != EnumC42155GgZ.RUNNING && enumC42155GgZ != EnumC42155GgZ.PENDING) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LIZLLL <= this.LIZIZ) {
            return false;
        }
        int i = this.LJIIL;
        if (i >= 0 && i < this.LIZJ.size()) {
            StringBuilder LIZIZ = C07780Sg.LIZIZ("time out by: ", ((AbstractC42152GgW) ListProtector.get(this.LIZJ, this.LJIIL)).LIZJ(), ", total time: ");
            LIZIZ.append(currentTimeMillis - this.LIZLLL);
            LJ(LIZIZ.toString());
        }
        this.LJIIJ = true;
        LIZLLL();
        return true;
    }

    public static void LJ(String str) {
        H78.LIZIZ("PublishCheckerLog", str);
    }

    public final void LIZ(AbstractC42152GgW abstractC42152GgW) {
        int size = this.LIZJ.size();
        if (abstractC42152GgW == null || this.LJIIJJI != EnumC42155GgZ.NEW) {
            return;
        }
        abstractC42152GgW.LJLIL = this;
        if (size > this.LIZJ.size() - 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addCheck: ");
            LIZ.append(abstractC42152GgW.LIZJ());
            LJ(X1D.LIZIZ(LIZ));
            this.LIZJ.add(abstractC42152GgW);
            return;
        }
        if (size < 0) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("addCheck: ");
        LIZ2.append(abstractC42152GgW.LIZJ());
        LIZ2.append(", index: ");
        LIZ2.append(size);
        LJ(X1D.LIZIZ(LIZ2));
        ListProtector.add(this.LIZJ, size, abstractC42152GgW);
    }

    public final void LIZJ(InterfaceC65784Pro interfaceC65784Pro) {
        if (this.LJIIJJI != EnumC42155GgZ.NEW) {
            return;
        }
        this.LJIILIIL = interfaceC65784Pro;
    }

    public final void LJFF(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            interfaceC65784Pro.invoke();
        } else {
            this.LJIIIZ.post(new ARunnableS43S0100000_7((InterfaceC65784Pro) interfaceC65784Pro, 148));
        }
    }

    public C42149GgT(String name, int i) {
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = i;
        this.LIZJ = new ArrayList<>();
        this.LJFF = new LinkedHashSet();
        this.LJI = new ArrayList();
        this.LJIIIIZZ = new C42150GgU(this);
        this.LJIIIZ = new Handler(C16880lQ.LLJJJJ());
        this.LJIIJJI = EnumC42155GgZ.NEW;
        this.LJIIL = -1;
    }
}
