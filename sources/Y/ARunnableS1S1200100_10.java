package Y;

import X.C10K;
import X.C39048FUe;
import X.C60439Nnn;
import X.C60606NqU;
import X.C60726NsQ;
import X.C60737Nsb;
import X.C60746Nsk;
import X.C60747Nsl;
import X.C60756Nsu;
import X.C60757Nsv;
import X.C61831OOl;
import X.C61845OOz;
import X.C78613UtF;
import X.InterfaceC60710NsA;
import X.InterfaceC65784Pro;
import X.InterfaceC68342mE;
import X.QGE;
import X.QGH;
import X.W5O;
import X.XKX;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ARunnableS1S1200100_10 implements Runnable {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    public final void LIZ$0() {
        HybridSchemaParam LIZLLL;
        C60756Nsu LIZJ;
        InterfaceC68342mE<TemplateData> interfaceC68342mE;
        TemplateData templateData;
        TemplateBundle templateBundle;
        C60606NqU c60606NqU;
        InterfaceC65784Pro<? extends InterfaceC68342mE<TemplateData>> interfaceC65784Pro;
        C60737Nsb hybridContext = ((C60726NsQ) this.l1).getHybridContext();
        long currentTimeMillis = System.currentTimeMillis() - this.j3;
        o.LJIIJ(hybridContext, "hybridContext");
        TemplateBundle templateBundle2 = null;
        if (C60757Nsv.LIZ) {
            C39048FUe.LIZIZ(C39048FUe.LIZIZ, C61845OOz.LIZ("block time recorded: ", currentTimeMillis), null, "LYNX_I18N", 2);
            InterfaceC60710NsA interfaceC60710NsA = hybridContext.hybridParams;
            if (interfaceC60710NsA != null && (LIZLLL = interfaceC60710NsA.LIZLLL()) != null && LIZLLL.getStarlingFallback() && (LIZJ = C60757Nsv.LIZJ(hybridContext, null)) != null) {
                LIZJ.LIZIZ = currentTimeMillis;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        C60606NqU c60606NqU2 = ((C60726NsQ) this.l1).LJLJI;
        if (c60606NqU2 != null && (interfaceC65784Pro = c60606NqU2.LJIIJ) != null) {
            interfaceC68342mE = interfaceC65784Pro.invoke();
        } else {
            interfaceC68342mE = null;
        }
        String str = ((C60726NsQ) this.l1).getHybridContext().initData;
        if (str != null && (c60606NqU = ((C60726NsQ) this.l1).LJLJI) != null) {
            c60606NqU.LJIIIIZZ = TemplateData.LJFF(str);
        }
        C60606NqU c60606NqU3 = ((C60726NsQ) this.l1).LJLJI;
        if (c60606NqU3 != null) {
            C60439Nnn c60439Nnn = c60606NqU3.LJJII;
            if (c60439Nnn == null || (templateData = c60439Nnn.LIZ) == null) {
                templateData = c60606NqU3.LJIIIIZZ;
            }
        } else {
            templateData = null;
        }
        if (interfaceC68342mE == null || interfaceC68342mE.isCancelled()) {
            C60726NsQ c60726NsQ = (C60726NsQ) this.l1;
            C60606NqU c60606NqU4 = c60726NsQ.LJLJI;
            if (c60606NqU4 != null && c60606NqU4.LJJIIZ != null) {
                if (c60606NqU4 != null) {
                    templateBundle2 = c60606NqU4.LJJIIZ;
                }
                if (templateData == null) {
                    templateData = TemplateData.LJ(new HashMap());
                }
                c60726NsQ.LJIIZILJ(templateBundle2, templateData, this.s0, currentTimeMillis2);
                return;
            }
            c60726NsQ.LJIILLIIL((byte[]) this.l2, templateData, this.s0, currentTimeMillis2);
            return;
        }
        if (interfaceC68342mE.isCompleted()) {
            XKX.LIZLLL(((C60726NsQ) this.l1).getScope(), C78613UtF.LIZIZ, null, new C60746Nsk(interfaceC68342mE, currentTimeMillis2, null, this), 2);
            return;
        }
        C60726NsQ c60726NsQ2 = (C60726NsQ) this.l1;
        C60606NqU c60606NqU5 = c60726NsQ2.LJLJI;
        if (c60606NqU5 != null && c60606NqU5.LJJIIZ != null) {
            if (c60606NqU5 != null) {
                templateBundle = c60606NqU5.LJJIIZ;
            } else {
                templateBundle = null;
            }
            if (templateData == null) {
                templateData = TemplateData.LJ(new HashMap());
            }
            c60726NsQ2.LJIIZILJ(templateBundle, templateData, this.s0, currentTimeMillis2);
        } else {
            c60726NsQ2.LJIILLIIL((byte[]) this.l2, templateData, this.s0, currentTimeMillis2);
        }
        XKX.LIZLLL(((C60726NsQ) this.l1).getScope(), null, null, new C60747Nsl(interfaceC68342mE, null, this), 3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        QGH qgh;
        QGE qge = (QGE) this.l2;
        W5O w5o = (W5O) this.l1;
        String str = this.s0;
        long j = this.j3;
        qge.getClass();
        try {
            if (C61831OOl.LJIIIZ(w5o.LIZIZ.getHost()) && (qgh = qge.LIZ.get(str)) != null) {
                C10K.LIZJ(new ACallableS4S0300100_10(j, w5o, qgh, null, 1));
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void run$0(ARunnableS1S1200100_10 aRunnableS1S1200100_10) {
        boolean LIZ;
        try {
            aRunnableS1S1200100_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S1200100_10 aRunnableS1S1200100_10) {
        boolean LIZ;
        try {
            aRunnableS1S1200100_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S1200100_10(Object obj, long j, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.j3 = j;
        this.s0 = str;
        this.l2 = obj2;
    }
}
