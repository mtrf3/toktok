package X;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NyS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61100NyS {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Cert LIZ;
    public WeakReference<Activity> LIZIZ;
    public final C61101NyT LIZJ;

    public C61100NyS(Cert cert) {
        this.LIZ = cert;
        this.LIZJ = new C61101NyT(cert);
    }

    public final C61100NyS LIZ(AbstractC61106NyY abstractC61106NyY) {
        C61101NyT c61101NyT = this.LIZJ;
        c61101NyT.getClass();
        abstractC61106NyY.LIZ = c61101NyT;
        if (abstractC61106NyY instanceof AbstractC61103NyV) {
            ListProtector.add(c61101NyT.LIZJ, 0, abstractC61106NyY);
        } else {
            ((ArrayList) c61101NyT.LIZJ).add(abstractC61106NyY);
        }
        return this;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public final C61100NyS LIZIZ(String... strArr) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        C61101NyT c61101NyT = this.LIZJ;
        List LJJZZIII = ORY.LJJZZIII(strArr);
        c61101NyT.getClass();
        o.LJIIIZ(LJJZZIII, OHQ.LIZIZ);
        c61101NyT.LIZIZ.addAll(LJJZZIII);
        C61102NyU c61102NyU = new C61102NyU();
        C61101NyT c61101NyT2 = this.LIZJ;
        c61101NyT2.getClass();
        c61102NyU.LIZ = c61101NyT2;
        if (c61102NyU instanceof AbstractC61103NyV) {
            ListProtector.add(c61101NyT2.LIZJ, 0, c61102NyU);
        } else {
            ((ArrayList) c61101NyT2.LIZJ).add(c61102NyU);
        }
        return this;
    }

    public final void LIZJ(InterfaceC61107NyZ interfaceC61107NyZ) {
        int i = 0;
        C17J.LJJJJLI(0);
        this.LIZJ.LJFF = interfaceC61107NyZ;
        WeakReference<Activity> weakReference = this.LIZIZ;
        if (weakReference != null) {
            Activity activity = weakReference.get();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                C61101NyT c61101NyT = this.LIZJ;
                c61101NyT.getClass();
                if (!new ArrayList(c61101NyT.LIZIZ).isEmpty() || !((ArrayList) this.LIZJ.LIZJ).isEmpty()) {
                    ArrayList arrayList = (ArrayList) this.LIZJ.LIZJ;
                    Iterator it = arrayList.iterator();
                    int i2 = -1;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i3 = i + 1;
                        if (i >= 0) {
                            if ((next instanceof C61102NyU) && i2 == -1) {
                                i2 = i;
                            }
                            i = i3;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    if (i2 >= 0) {
                        Iterator<AbstractC61106NyY> it2 = C61099NyR.LIZLLL.iterator();
                        while (it2.hasNext()) {
                            C61104NyW c61104NyW = new C61104NyW(it2.next());
                            C61101NyT dispatcher = this.LIZJ;
                            o.LJIIIZ(dispatcher, "dispatcher");
                            c61104NyW.LIZ = dispatcher;
                            ListProtector.add(arrayList, i2, c61104NyW);
                        }
                        C61112Nye c61112Nye = new C61112Nye(activity, interfaceC61107NyZ);
                        C61101NyT dispatcher2 = this.LIZJ;
                        o.LJIIIZ(dispatcher2, "dispatcher");
                        c61112Nye.LIZ = dispatcher2;
                        ListProtector.add(arrayList, i2, c61112Nye);
                    }
                    this.LIZJ.LIZIZ();
                    C17J.LJJJJLI(2);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
            }
            C17J.LJJJJLI(1);
            return;
        }
        C17J.LJJJJLI(13);
    }
}
