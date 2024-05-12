package X;

import X.InterfaceC67808QjM;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.Qjd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67825Qjd<O extends InterfaceC67808QjM> implements InterfaceC67706Qhi, InterfaceC67707Qhj {
    public final InterfaceC67836Qjo LJLILLLLZI;
    public final C67719Qhv<O> LJLJI;
    public final C67834Qjm LJLJJI;
    public final int LJLJL;
    public final BinderC67831Qjj LJLJLJ;
    public boolean LJLJLLL;
    public final /* synthetic */ C67824Qjc LJLLJ;
    public final Queue<AbstractC67837Qjp> LJLIL = new LinkedList();
    public final java.util.Set<C67547Qf9> LJLJJL = new HashSet();
    public final java.util.Map<C67891Qkh<?>, C67902Qks> LJLJJLL = new HashMap();
    public final List<C67847Qjz> LJLL = new ArrayList();
    public ConnectionResult LJLLI = null;
    public int LJLLILLLL = 0;

    public final void LJ() {
        ArrayList arrayList = new ArrayList(this.LJLIL);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC67837Qjp abstractC67837Qjp = (AbstractC67837Qjp) ListProtector.get(arrayList, i);
            if (!this.LJLILLLLZI.isConnected()) {
                return;
            }
            if (LJIIIZ(abstractC67837Qjp)) {
                ((LinkedList) this.LJLIL).remove(abstractC67837Qjp);
            }
        }
    }

    public final void LJFF() {
        QH7.LIZJ(this.LJLLJ.LJLLL);
        this.LJLLI = null;
        LIZIZ(ConnectionResult.RESULT_SUCCESS);
        LJIIIIZZ();
        Iterator it = ((HashMap) this.LJLJJLL).values().iterator();
        while (it.hasNext()) {
            C67902Qks c67902Qks = (C67902Qks) it.next();
            if (LIZ(c67902Qks.LIZ.LIZIZ) != null) {
                it.remove();
            } else {
                try {
                    AbstractC67889Qkf<Object, ?> abstractC67889Qkf = c67902Qks.LIZ;
                    ((C67922QlC) abstractC67889Qkf).LIZLLL.LIZ.LIZ(this.LJLILLLLZI, new C67649Qgn());
                } catch (DeadObjectException unused) {
                    v7(3);
                    this.LJLILLLLZI.LJIIJ("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        LJ();
        LJII();
    }

    public final void LJII() {
        this.LJLLJ.LJLLL.removeMessages(12, this.LJLJI);
        HandlerC67272Qai handlerC67272Qai = this.LJLLJ.LJLLL;
        handlerC67272Qai.sendMessageDelayed(handlerC67272Qai.obtainMessage(12, this.LJLJI), this.LJLLJ.LJLIL);
    }

    public final void LJIIIIZZ() {
        if (this.LJLJLLL) {
            this.LJLLJ.LJLLL.removeMessages(11, this.LJLJI);
            this.LJLLJ.LJLLL.removeMessages(9, this.LJLJI);
            this.LJLJLLL = false;
        }
    }

    public final void LJIIL() {
        QH7.LIZJ(this.LJLLJ.LJLLL);
        if (this.LJLILLLLZI.isConnected() || this.LJLILLLLZI.LJIIJJI()) {
            return;
        }
        try {
            C67824Qjc c67824Qjc = this.LJLLJ;
            int LIZ = c67824Qjc.LJLJL.LIZ(c67824Qjc.LJLJJL, this.LJLILLLLZI);
            if (LIZ != 0) {
                ConnectionResult connectionResult = new ConnectionResult(LIZ, null);
                new StringBuilder(this.LJLILLLLZI.getClass().getName().length() + 35 + connectionResult.toString().length());
                LJIILJJIL(connectionResult, null);
                return;
            }
            C67824Qjc c67824Qjc2 = this.LJLLJ;
            InterfaceC67836Qjo interfaceC67836Qjo = this.LJLILLLLZI;
            C67829Qjh c67829Qjh = new C67829Qjh(c67824Qjc2, interfaceC67836Qjo, this.LJLJI);
            if (interfaceC67836Qjo.LIZIZ()) {
                BinderC67831Qjj binderC67831Qjj = this.LJLJLJ;
                QH7.LJIIIIZZ(binderC67831Qjj);
                InterfaceC67779Qit interfaceC67779Qit = binderC67831Qjj.LJLJJLL;
                if (interfaceC67779Qit != null) {
                    interfaceC67779Qit.LIZLLL();
                }
                binderC67831Qjj.LJLJJL.LJIIIIZZ = Integer.valueOf(System.identityHashCode(binderC67831Qjj));
                C67724Qi0 c67724Qi0 = binderC67831Qjj.LJLJI;
                Context context = binderC67831Qjj.LJLIL;
                Looper looper = binderC67831Qjj.LJLILLLLZI.getLooper();
                C67736QiC c67736QiC = binderC67831Qjj.LJLJJL;
                binderC67831Qjj.LJLJJLL = c67724Qi0.LIZIZ(context, looper, c67736QiC, c67736QiC.LJII, binderC67831Qjj, binderC67831Qjj);
                binderC67831Qjj.LJLJL = c67829Qjh;
                java.util.Set<Scope> set = binderC67831Qjj.LJLJJI;
                if (set == null || set.isEmpty()) {
                    binderC67831Qjj.LJLILLLLZI.post(new RunnableC67881QkX(binderC67831Qjj));
                } else {
                    binderC67831Qjj.LJLJJLL.LIZ();
                }
            }
            try {
                this.LJLILLLLZI.LJIIL(c67829Qjh);
            } catch (SecurityException e) {
                LJIILJJIL(new ConnectionResult(10), e);
            }
        } catch (IllegalStateException e2) {
            LJIILJJIL(new ConnectionResult(10), e2);
        }
    }

    public final void LJIILL() {
        QH7.LIZJ(this.LJLLJ.LJLLL);
        Status status = C67824Qjc.LJLLLLLL;
        LIZJ(status);
        C67834Qjm c67834Qjm = this.LJLJJI;
        c67834Qjm.getClass();
        c67834Qjm.LIZ(status, false);
        for (C67891Qkh c67891Qkh : (C67891Qkh[]) ((HashMap) this.LJLJJLL).keySet().toArray(new C67891Qkh[0])) {
            LJIILIIL(new C67832Qjk(c67891Qkh, new C67649Qgn()));
        }
        LIZIZ(new ConnectionResult(4));
        if (this.LJLILLLLZI.isConnected()) {
            this.LJLILLLLZI.LJIJ(new C67972Qm0(this));
        }
    }

    @Override // X.InterfaceC67784Qiy
    public final void H0(Bundle bundle) {
        if (Looper.myLooper() == this.LJLLJ.LJLLL.getLooper()) {
            LJFF();
        } else {
            this.LJLLJ.LJLLL.post(new RunnableC67917Ql7(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Feature LIZ(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] LJIJI = this.LJLILLLLZI.LJIJI();
            if (LJIJI == null) {
                LJIJI = new Feature[0];
            }
            C1HQ c1hq = new C1HQ(LJIJI.length);
            for (Feature feature : LJIJI) {
                c1hq.put(feature.zza, Long.valueOf(feature.LJJJJL()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) c1hq.getOrDefault(feature2.zza, null);
                if (l == null || l.longValue() < feature2.LJJJJL()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void LIZIZ(ConnectionResult connectionResult) {
        String str;
        Iterator it = ((HashSet) this.LJLJJL).iterator();
        while (it.hasNext()) {
            C67547Qf9 c67547Qf9 = (C67547Qf9) it.next();
            if (C64363PNv.LIZ(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                str = this.LJLILLLLZI.LJI();
            } else {
                str = null;
            }
            c67547Qf9.LIZ(this.LJLJI, connectionResult, str);
        }
        ((HashSet) this.LJLJJL).clear();
    }

    public final void LIZJ(Status status) {
        QH7.LIZJ(this.LJLLJ.LJLLL);
        LIZLLL(status, null, false);
    }

    public final void LJI(int i) {
        QH7.LIZJ(this.LJLLJ.LJLLL);
        this.LJLLI = null;
        this.LJLJLLL = true;
        C67834Qjm c67834Qjm = this.LJLJJI;
        String LJIIIIZZ = this.LJLILLLLZI.LJIIIIZZ();
        c67834Qjm.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (LJIIIIZZ != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(LJIIIIZZ);
        }
        c67834Qjm.LIZ(new Status(20, null, sb.toString()), true);
        HandlerC67272Qai handlerC67272Qai = this.LJLLJ.LJLLL;
        Message obtain = Message.obtain(handlerC67272Qai, 9, this.LJLJI);
        this.LJLLJ.getClass();
        handlerC67272Qai.sendMessageDelayed(obtain, 5000L);
        HandlerC67272Qai handlerC67272Qai2 = this.LJLLJ.LJLLL;
        Message obtain2 = Message.obtain(handlerC67272Qai2, 11, this.LJLJI);
        this.LJLLJ.getClass();
        handlerC67272Qai2.sendMessageDelayed(obtain2, 120000L);
        this.LJLLJ.LJLJL.LIZ.clear();
        Iterator it = ((HashMap) this.LJLJJLL).values().iterator();
        while (it.hasNext()) {
            ((C67902Qks) it.next()).LIZJ.run();
        }
    }

    public final boolean LJIIIZ(AbstractC67837Qjp abstractC67837Qjp) {
        if (!(abstractC67837Qjp instanceof AbstractC67893Qkj)) {
            abstractC67837Qjp.LIZLLL(this.LJLJJI, this.LJLILLLLZI.LIZIZ());
            try {
                abstractC67837Qjp.LIZJ(this);
            } catch (DeadObjectException unused) {
                v7(1);
                this.LJLILLLLZI.LJIIJ("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        AbstractC67893Qkj abstractC67893Qkj = (AbstractC67893Qkj) abstractC67837Qjp;
        Feature LIZ = LIZ(abstractC67893Qkj.LJI(this));
        if (LIZ == null) {
            abstractC67837Qjp.LIZLLL(this.LJLJJI, this.LJLILLLLZI.LIZIZ());
            try {
                abstractC67837Qjp.LIZJ(this);
            } catch (DeadObjectException unused2) {
                v7(1);
                this.LJLILLLLZI.LJIIJ("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.LJLILLLLZI.getClass().getName();
        String str = LIZ.zza;
        int length = name.length();
        new StringBuilder(length + 77 + String.valueOf(str).length());
        if (this.LJLLJ.LJLLLL && abstractC67893Qkj.LJFF(this)) {
            C67847Qjz c67847Qjz = new C67847Qjz(this.LJLJI, LIZ);
            int indexOf = ((ArrayList) this.LJLL).indexOf(c67847Qjz);
            if (indexOf >= 0) {
                Object obj = ListProtector.get(this.LJLL, indexOf);
                this.LJLLJ.LJLLL.removeMessages(15, obj);
                HandlerC67272Qai handlerC67272Qai = this.LJLLJ.LJLLL;
                Message obtain = Message.obtain(handlerC67272Qai, 15, obj);
                this.LJLLJ.getClass();
                handlerC67272Qai.sendMessageDelayed(obtain, 5000L);
                return false;
            }
            ((ArrayList) this.LJLL).add(c67847Qjz);
            HandlerC67272Qai handlerC67272Qai2 = this.LJLLJ.LJLLL;
            Message obtain2 = Message.obtain(handlerC67272Qai2, 15, c67847Qjz);
            this.LJLLJ.getClass();
            handlerC67272Qai2.sendMessageDelayed(obtain2, 5000L);
            HandlerC67272Qai handlerC67272Qai3 = this.LJLLJ.LJLLL;
            Message obtain3 = Message.obtain(handlerC67272Qai3, 16, c67847Qjz);
            this.LJLLJ.getClass();
            handlerC67272Qai3.sendMessageDelayed(obtain3, 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (LJIIJ(connectionResult)) {
                return false;
            }
            C67824Qjc c67824Qjc = this.LJLLJ;
            c67824Qjc.LJLJJLL.zah(c67824Qjc.LJLJJL, connectionResult, this.LJLJL);
            return false;
        }
        abstractC67893Qkj.LIZIZ(new C67920QlA(LIZ));
        return true;
    }

    public final boolean LJIIJ(ConnectionResult connectionResult) {
        synchronized (C67824Qjc.LJZ) {
            C67824Qjc c67824Qjc = this.LJLLJ;
            if (c67824Qjc.LJLLI != null && c67824Qjc.LJLLILLLL.contains(this.LJLJI)) {
                this.LJLLJ.LJLLI.LJIIL(connectionResult, this.LJLJL);
                return true;
            }
            return false;
        }
    }

    public final boolean LJIIJJI(boolean z) {
        QH7.LIZJ(this.LJLLJ.LJLLL);
        if (!this.LJLILLLLZI.isConnected() || ((HashMap) this.LJLJJLL).size() != 0) {
            return false;
        }
        C67834Qjm c67834Qjm = this.LJLJJI;
        if (!c67834Qjm.LIZ.isEmpty() || !c67834Qjm.LIZIZ.isEmpty()) {
            if (z) {
                LJII();
            }
            return false;
        }
        this.LJLILLLLZI.LJIIJ("Timing out service connection.");
        return true;
    }

    public final void LJIILIIL(AbstractC67837Qjp abstractC67837Qjp) {
        QH7.LIZJ(this.LJLLJ.LJLLL);
        if (this.LJLILLLLZI.isConnected()) {
            if (LJIIIZ(abstractC67837Qjp)) {
                LJII();
                return;
            } else {
                ((LinkedList) this.LJLIL).add(abstractC67837Qjp);
                return;
            }
        }
        ((LinkedList) this.LJLIL).add(abstractC67837Qjp);
        ConnectionResult connectionResult = this.LJLLI;
        if (connectionResult != null && connectionResult.LJJJJL()) {
            LJIILJJIL(this.LJLLI, null);
        } else {
            LJIIL();
        }
    }

    @Override // X.InterfaceC67712Qho
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        LJIILJJIL(connectionResult, null);
    }

    @Override // X.InterfaceC67784Qiy
    public final void v7(int i) {
        if (Looper.myLooper() == this.LJLLJ.LJLLL.getLooper()) {
            LJI(i);
        } else {
            this.LJLLJ.LJLLL.post(new RunnableC67916Ql6(this, i));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.Qjo] */
    public C67825Qjd(C67824Qjc c67824Qjc, AbstractC67791Qj5<O> abstractC67791Qj5) {
        this.LJLLJ = c67824Qjc;
        Looper looper = c67824Qjc.LJLLL.getLooper();
        C67793Qj7 LIZIZ = abstractC67791Qj5.LIZIZ();
        C67736QiC c67736QiC = new C67736QiC(LIZIZ.LIZ, LIZIZ.LIZIZ, null, LIZIZ.LIZJ, LIZIZ.LIZLLL, LIZIZ.LJ);
        AbstractC67715Qhr<?, O> abstractC67715Qhr = abstractC67791Qj5.LIZJ.LIZ;
        QH7.LJIIIIZZ(abstractC67715Qhr);
        ?? LIZIZ2 = abstractC67715Qhr.LIZIZ(abstractC67791Qj5.LIZ, looper, c67736QiC, abstractC67791Qj5.LIZLLL, this, this);
        String str = abstractC67791Qj5.LIZIZ;
        if (str != null) {
            if (LIZIZ2 instanceof AbstractC67863QkF) {
                ((AbstractC67863QkF) LIZIZ2).LLFFF = str;
            }
            if (LIZIZ2 instanceof ServiceConnectionC67840Qjs) {
                LIZIZ2.getClass();
            }
        }
        this.LJLILLLLZI = LIZIZ2;
        this.LJLJI = abstractC67791Qj5.LJ;
        this.LJLJJI = new C67834Qjm();
        this.LJLJL = abstractC67791Qj5.LJI;
        if (LIZIZ2.LIZIZ()) {
            Context context = c67824Qjc.LJLJJL;
            HandlerC67272Qai handlerC67272Qai = c67824Qjc.LJLLL;
            C67793Qj7 LIZIZ3 = abstractC67791Qj5.LIZIZ();
            this.LJLJLJ = new BinderC67831Qjj(context, handlerC67272Qai, new C67736QiC(LIZIZ3.LIZ, LIZIZ3.LIZIZ, null, LIZIZ3.LIZJ, LIZIZ3.LIZLLL, LIZIZ3.LJ));
            return;
        }
        this.LJLJLJ = null;
    }

    public final void LJIILJJIL(ConnectionResult connectionResult, Exception exc) {
        InterfaceC67779Qit interfaceC67779Qit;
        QH7.LIZJ(this.LJLLJ.LJLLL);
        BinderC67831Qjj binderC67831Qjj = this.LJLJLJ;
        if (binderC67831Qjj != null && (interfaceC67779Qit = binderC67831Qjj.LJLJJLL) != null) {
            interfaceC67779Qit.LIZLLL();
        }
        QH7.LIZJ(this.LJLLJ.LJLLL);
        this.LJLLI = null;
        this.LJLLJ.LJLJL.LIZ.clear();
        LIZIZ(connectionResult);
        if ((this.LJLILLLLZI instanceof C67858QkA) && connectionResult.zzb != 24) {
            C67824Qjc c67824Qjc = this.LJLLJ;
            c67824Qjc.LJLILLLLZI = true;
            HandlerC67272Qai handlerC67272Qai = c67824Qjc.LJLLL;
            handlerC67272Qai.sendMessageDelayed(handlerC67272Qai.obtainMessage(19), LivePreviewNetworkSpeedThresholdSetting.DEFAULT);
        }
        if (connectionResult.zzb == 4) {
            LIZJ(C67824Qjc.LJLZ);
            return;
        }
        if (this.LJLIL.isEmpty()) {
            this.LJLLI = connectionResult;
            return;
        }
        if (exc != null) {
            QH7.LIZJ(this.LJLLJ.LJLLL);
            LIZLLL(null, exc, false);
            return;
        }
        if (this.LJLLJ.LJLLLL) {
            LIZLLL(C67824Qjc.LIZLLL(this.LJLJI, connectionResult), null, true);
            if (this.LJLIL.isEmpty() || LJIIJ(connectionResult)) {
                return;
            }
            C67824Qjc c67824Qjc2 = this.LJLLJ;
            if (!c67824Qjc2.LJLJJLL.zah(c67824Qjc2.LJLJJL, connectionResult, this.LJLJL)) {
                if (connectionResult.zzb == 18) {
                    this.LJLJLLL = true;
                }
                if (this.LJLJLLL) {
                    HandlerC67272Qai handlerC67272Qai2 = this.LJLLJ.LJLLL;
                    Message obtain = Message.obtain(handlerC67272Qai2, 9, this.LJLJI);
                    this.LJLLJ.getClass();
                    handlerC67272Qai2.sendMessageDelayed(obtain, 5000L);
                    return;
                }
                LIZJ(C67824Qjc.LIZLLL(this.LJLJI, connectionResult));
                return;
            }
            return;
        }
        LIZJ(C67824Qjc.LIZLLL(this.LJLJI, connectionResult));
    }

    public final void LIZLLL(Status status, Exception exc, boolean z) {
        boolean z2;
        QH7.LIZJ(this.LJLLJ.LJLLL);
        boolean z3 = true;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc != null) {
            z3 = false;
        }
        if (z2 != z3) {
            Iterator<AbstractC67837Qjp> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                AbstractC67837Qjp next = it.next();
                if (!z || next.LIZ == 2) {
                    if (status != null) {
                        next.LIZ(status);
                    } else {
                        next.LIZIZ(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }
}
