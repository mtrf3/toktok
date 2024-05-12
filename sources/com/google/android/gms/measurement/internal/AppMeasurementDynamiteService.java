package com.google.android.gms.measurement.internal;

import X.AbstractBinderC68208Qpo;
import X.BinderC68153Qov;
import X.C1HQ;
import X.C67281Qar;
import X.C68033Qmz;
import X.C68082Qnm;
import X.C68083Qnn;
import X.C68084Qno;
import X.C68085Qnp;
import X.C68123QoR;
import X.C68132Qoa;
import X.C68136Qoe;
import X.C68175QpH;
import X.C68555QvP;
import X.C78540Us4;
import X.InterfaceC68072Qnc;
import X.InterfaceC68137Qof;
import X.InterfaceC68139Qoh;
import X.InterfaceC68140Qoi;
import X.InterfaceC68145Qon;
import X.InterfaceC68163Qp5;
import X.OUP;
import X.QH7;
import X.RunnableC67273Qaj;
import X.RunnableC67294Qb4;
import X.RunnableC67633QgX;
import X.RunnableC67634QgY;
import X.RunnableC67644Qgi;
import X.RunnableC67655Qgt;
import X.RunnableC68038Qn4;
import X.RunnableC68080Qnk;
import X.RunnableC68081Qnl;
import X.RunnableC68112QoG;
import X.RunnableC68113QoH;
import X.RunnableC68116QoK;
import X.RunnableC68120QoO;
import X.RunnableC68121QoP;
import X.RunnableC68131QoZ;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC68208Qpo {
    public C68033Qmz LJLIL;
    public final C1HQ LJLILLLLZI = new C1HQ();

    public final void LLJI() {
        if (this.LJLIL != null) {
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void clearMeasurementEnabled(long j) {
        LLJI();
        C68082Qnm LJIJ = this.LJLIL.LJIJ();
        LJIJ.LJI();
        LJIJ.LIZ.LIZIZ().LJIILIIL(new RunnableC68131QoZ(LJIJ, null));
    }

    @Override // X.InterfaceC68207Qpn
    public void generateEventId(InterfaceC68139Qoh interfaceC68139Qoh) {
        LLJI();
        long LJJLIIIJ = this.LJLIL.LJIL().LJJLIIIJ();
        LLJI();
        this.LJLIL.LJIL().LJJIIJ(interfaceC68139Qoh, LJJLIIIJ);
    }

    @Override // X.InterfaceC68207Qpn
    public void getAppInstanceId(InterfaceC68139Qoh interfaceC68139Qoh) {
        LLJI();
        this.LJLIL.LIZIZ().LJIILIIL(new RunnableC68081Qnl(0, this, interfaceC68139Qoh));
    }

    @Override // X.InterfaceC68207Qpn
    public void getCachedAppInstanceId(InterfaceC68139Qoh interfaceC68139Qoh) {
        LLJI();
        LLJJIII(this.LJLIL.LJIJ().LJJIFFI(), interfaceC68139Qoh);
    }

    @Override // X.InterfaceC68207Qpn
    public void getCurrentScreenClass(InterfaceC68139Qoh interfaceC68139Qoh) {
        String str;
        LLJI();
        C68132Qoa c68132Qoa = this.LJLIL.LJIJ().LIZ.LJIJI().LIZJ;
        if (c68132Qoa != null) {
            str = c68132Qoa.LIZIZ;
        } else {
            str = null;
        }
        LLJJIII(str, interfaceC68139Qoh);
    }

    @Override // X.InterfaceC68207Qpn
    public void getCurrentScreenName(InterfaceC68139Qoh interfaceC68139Qoh) {
        String str;
        LLJI();
        C68132Qoa c68132Qoa = this.LJLIL.LJIJ().LIZ.LJIJI().LIZJ;
        if (c68132Qoa != null) {
            str = c68132Qoa.LIZ;
        } else {
            str = null;
        }
        LLJJIII(str, interfaceC68139Qoh);
    }

    @Override // X.InterfaceC68207Qpn
    public void getGmpAppId(InterfaceC68139Qoh interfaceC68139Qoh) {
        LLJI();
        C68082Qnm LJIJ = this.LJLIL.LJIJ();
        C68033Qmz c68033Qmz = LJIJ.LIZ;
        String str = c68033Qmz.LIZIZ;
        if (str == null) {
            try {
                str = C78540Us4.LJJIJ(c68033Qmz.LIZ, c68033Qmz.LJIJ);
            } catch (IllegalStateException e) {
                LJIJ.LIZ.LIZJ().LJFF.LIZIZ(e, "getGoogleAppId failed with exception");
                str = null;
            }
        }
        LLJJIII(str, interfaceC68139Qoh);
    }

    @Override // X.InterfaceC68207Qpn
    public void initForTests(Map map) {
        LLJI();
    }

    @Override // X.InterfaceC68207Qpn
    public void isDataCollectionEnabled(InterfaceC68139Qoh interfaceC68139Qoh) {
        LLJI();
        this.LJLIL.LIZIZ().LJIILIIL(new RunnableC68121QoP(this, interfaceC68139Qoh));
    }

    @Override // X.InterfaceC68207Qpn
    public void registerOnMeasurementEventListener(InterfaceC68137Qof interfaceC68137Qof) {
        Object obj;
        LLJI();
        synchronized (this.LJLILLLLZI) {
            obj = (InterfaceC68140Qoi) this.LJLILLLLZI.getOrDefault(Integer.valueOf(interfaceC68137Qof.LIZLLL()), null);
            if (obj == null) {
                obj = new C68123QoR(this, interfaceC68137Qof);
                this.LJLILLLLZI.put(Integer.valueOf(interfaceC68137Qof.LIZLLL()), obj);
            }
        }
        C68082Qnm LJIJ = this.LJLIL.LJIJ();
        LJIJ.LJI();
        if (!((CopyOnWriteArraySet) LJIJ.LJ).add(obj)) {
            LJIJ.LIZ.LIZJ().LJIIIIZZ.LIZ("OnEventListener already registered");
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void resetAnalyticsData(long j) {
        LLJI();
        C68082Qnm LJIJ = this.LJLIL.LJIJ();
        LJIJ.LJI.set(null);
        LJIJ.LIZ.LIZIZ().LJIILIIL(new RunnableC68120QoO(LJIJ, j));
    }

    @Override // X.InterfaceC68207Qpn
    public void setDataCollectionEnabled(boolean z) {
        LLJI();
        C68082Qnm LJIJ = this.LJLIL.LJIJ();
        LJIJ.LJI();
        LJIJ.LIZ.LIZIZ().LJIILIIL(new RunnableC67633QgX(LJIJ, z));
    }

    @Override // X.InterfaceC68207Qpn
    public void setDefaultEventParameters(Bundle bundle) {
        final Bundle bundle2;
        LLJI();
        final C68082Qnm LJIJ = this.LJLIL.LJIJ();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        LJIJ.LIZ.LIZIZ().LJIILIIL(new Runnable() { // from class: X.Qng
            public final void LIZ() {
                C68082Qnm c68082Qnm = C68082Qnm.this;
                Bundle bundle3 = bundle2;
                if (bundle3 == null) {
                    c68082Qnm.LIZ.LJIILLIIL().LJIJJLI.LIZIZ(new Bundle());
                    return;
                }
                Bundle LIZ = c68082Qnm.LIZ.LJIILLIIL().LJIJJLI.LIZ();
                for (String str : bundle3.keySet()) {
                    Object LLJJIII = C16880lQ.LLJJIII(bundle3, str);
                    if (LLJJIII != null && !(LLJJIII instanceof String) && !(LLJJIII instanceof Long) && !(LLJJIII instanceof Double)) {
                        c68082Qnm.LIZ.LJIL().getClass();
                        if (C68083Qnn.LJJJI(LLJJIII)) {
                            C68083Qnn LJIL = c68082Qnm.LIZ.LJIL();
                            OJ3 oj3 = c68082Qnm.LJIILL;
                            LJIL.getClass();
                            C68083Qnn.LJIJJLI(oj3, null, 27, null, null, 0);
                        }
                        c68082Qnm.LIZ.LIZJ().LJIIJ.LIZJ(str, LLJJIII, "Invalid default event parameter type. Name, value");
                    } else if (C68083Qnn.LJJJJ(str)) {
                        c68082Qnm.LIZ.LIZJ().LJIIJ.LIZIZ(str, "Invalid default event parameter name. Name");
                    } else if (LLJJIII == null) {
                        LIZ.remove(str);
                    } else if (c68082Qnm.LIZ.LJIL().LJJIJLIJ(100, "param", str, LLJJIII)) {
                        c68082Qnm.LIZ.LJIL().LJIL(LIZ, str, LLJJIII);
                    }
                }
                c68082Qnm.LIZ.LJIL();
                int LJIIIIZZ = c68082Qnm.LIZ.LJI.LJIIIIZZ();
                if (LIZ.size() > LJIIIIZZ) {
                    Iterator it = new TreeSet(LIZ.keySet()).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        i++;
                        if (i > LJIIIIZZ) {
                            LIZ.remove(str2);
                        }
                    }
                    C68083Qnn LJIL2 = c68082Qnm.LIZ.LJIL();
                    OJ3 oj32 = c68082Qnm.LJIILL;
                    LJIL2.getClass();
                    C68083Qnn.LJIJJLI(oj32, null, 26, null, null, 0);
                    c68082Qnm.LIZ.LIZJ().LJIIJ.LIZ("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                c68082Qnm.LIZ.LJIILLIIL().LJIJJLI.LIZIZ(LIZ);
                C68022Qmo LJIJJ = c68082Qnm.LIZ.LJIJJ();
                LJIJJ.LJFF();
                LJIJJ.LJI();
                LJIJJ.LJIIZILJ(new RunnableC68039Qn5(LJIJJ, LJIJJ.LJIILJJIL(false), LIZ));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC68207Qpn
    public void setEventInterceptor(InterfaceC68137Qof interfaceC68137Qof) {
        boolean z;
        LLJI();
        C68136Qoe c68136Qoe = new C68136Qoe(this, interfaceC68137Qof);
        if (this.LJLIL.LIZIZ().LJIILL()) {
            C68082Qnm LJIJ = this.LJLIL.LJIJ();
            LJIJ.LJFF();
            LJIJ.LJI();
            C68136Qoe c68136Qoe2 = LJIJ.LIZLLL;
            if (c68136Qoe != c68136Qoe2) {
                if (c68136Qoe2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                QH7.LJIIJ("EventInterceptor already set.", z);
            }
            LJIJ.LIZLLL = c68136Qoe;
            return;
        }
        this.LJLIL.LIZIZ().LJIILIIL(new RunnableC68116QoK(this, c68136Qoe));
    }

    @Override // X.InterfaceC68207Qpn
    public void setInstanceIdProvider(InterfaceC68145Qon interfaceC68145Qon) {
        LLJI();
    }

    @Override // X.InterfaceC68207Qpn
    public void setMinimumSessionDuration(long j) {
        LLJI();
    }

    @Override // X.InterfaceC68207Qpn
    public void setSessionTimeoutDuration(long j) {
        LLJI();
        C68082Qnm LJIJ = this.LJLIL.LJIJ();
        LJIJ.LIZ.LIZIZ().LJIILIIL(new RunnableC67273Qaj(LJIJ, j));
    }

    @Override // X.InterfaceC68207Qpn
    public void unregisterOnMeasurementEventListener(InterfaceC68137Qof interfaceC68137Qof) {
        Object obj;
        LLJI();
        synchronized (this.LJLILLLLZI) {
            obj = (InterfaceC68140Qoi) this.LJLILLLLZI.remove(Integer.valueOf(interfaceC68137Qof.LIZLLL()));
        }
        if (obj == null) {
            obj = new C68123QoR(this, interfaceC68137Qof);
        }
        C68082Qnm LJIJ = this.LJLIL.LJIJ();
        LJIJ.LJI();
        if (!((CopyOnWriteArraySet) LJIJ.LJ).remove(obj)) {
            LJIJ.LIZ.LIZJ().LJIIIIZZ.LIZ("OnEventListener had not been registered");
        }
    }

    public final void LLJJIII(String str, InterfaceC68139Qoh interfaceC68139Qoh) {
        LLJI();
        this.LJLIL.LJIL().LJJIIJZLJL(str, interfaceC68139Qoh);
    }

    @Override // X.InterfaceC68207Qpn
    public void beginAdUnitExposure(String str, long j) {
        LLJI();
        this.LJLIL.LJIIL().LJI(j, str);
    }

    @Override // X.InterfaceC68207Qpn
    public void endAdUnitExposure(String str, long j) {
        LLJI();
        this.LJLIL.LJIIL().LJII(j, str);
    }

    @Override // X.InterfaceC68207Qpn
    public void getMaxUserProperties(String str, InterfaceC68139Qoh interfaceC68139Qoh) {
        LLJI();
        this.LJLIL.LJIJ().getClass();
        QH7.LJI(str);
        LLJI();
        this.LJLIL.LJIL().LJJIII(interfaceC68139Qoh, 25);
    }

    @Override // X.InterfaceC68207Qpn
    public void getTestFlag(InterfaceC68139Qoh interfaceC68139Qoh, int i) {
        LLJI();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                        C68083Qnn LJIL = this.LJLIL.LJIL();
                        C68082Qnm LJIJ = this.LJLIL.LJIJ();
                        LJIJ.getClass();
                        AtomicReference atomicReference = new AtomicReference();
                        LJIL.LJJ(interfaceC68139Qoh, ((Boolean) LJIJ.LIZ.LIZIZ().LJIIJ(atomicReference, LivePlayEnforceIntervalSetting.DEFAULT, "boolean test flag value", new RunnableC67655Qgt(0, LJIJ, atomicReference))).booleanValue());
                        return;
                    }
                    C68083Qnn LJIL2 = this.LJLIL.LJIL();
                    C68082Qnm LJIJ2 = this.LJLIL.LJIJ();
                    LJIJ2.getClass();
                    AtomicReference atomicReference2 = new AtomicReference();
                    LJIL2.LJJIII(interfaceC68139Qoh, ((Integer) LJIJ2.LIZ.LIZIZ().LJIIJ(atomicReference2, LivePlayEnforceIntervalSetting.DEFAULT, "int test flag value", new RunnableC67634QgY(LJIJ2, atomicReference2))).intValue());
                    return;
                }
                C68083Qnn LJIL3 = this.LJLIL.LJIL();
                C68082Qnm LJIJ3 = this.LJLIL.LJIJ();
                LJIJ3.getClass();
                AtomicReference atomicReference3 = new AtomicReference();
                double doubleValue = ((Double) LJIJ3.LIZ.LIZIZ().LJIIJ(atomicReference3, LivePlayEnforceIntervalSetting.DEFAULT, "double test flag value", new RunnableC67644Qgi(0, LJIJ3, atomicReference3))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    interfaceC68139Qoh.LJJJZ(bundle);
                    return;
                } catch (RemoteException e) {
                    LJIL3.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Error returning double value to wrapper");
                    return;
                }
            }
            C68083Qnn LJIL4 = this.LJLIL.LJIL();
            C68082Qnm LJIJ4 = this.LJLIL.LJIJ();
            LJIJ4.getClass();
            AtomicReference atomicReference4 = new AtomicReference();
            LJIL4.LJJIIJ(interfaceC68139Qoh, ((Long) LJIJ4.LIZ.LIZIZ().LJIIJ(atomicReference4, LivePlayEnforceIntervalSetting.DEFAULT, "long test flag value", new RunnableC67294Qb4(0, LJIJ4, atomicReference4))).longValue());
            return;
        }
        C68083Qnn LJIL5 = this.LJLIL.LJIL();
        C68082Qnm LJIJ5 = this.LJLIL.LJIJ();
        LJIJ5.getClass();
        AtomicReference atomicReference5 = new AtomicReference();
        LJIL5.LJJIIJZLJL((String) LJIJ5.LIZ.LIZIZ().LJIIJ(atomicReference5, LivePlayEnforceIntervalSetting.DEFAULT, "String test flag value", new RunnableC68038Qn4(LJIJ5, atomicReference5)), interfaceC68139Qoh);
    }

    @Override // X.InterfaceC68207Qpn
    public void onActivityDestroyed(InterfaceC68163Qp5 interfaceC68163Qp5, long j) {
        LLJI();
        C68085Qnp c68085Qnp = this.LJLIL.LJIJ().LIZJ;
        if (c68085Qnp != null) {
            this.LJLIL.LJIJ().LJIIJ();
            c68085Qnp.onActivityDestroyed((Activity) BinderC68153Qov.LLJJIII(interfaceC68163Qp5));
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void onActivityPaused(InterfaceC68163Qp5 interfaceC68163Qp5, long j) {
        LLJI();
        C68085Qnp c68085Qnp = this.LJLIL.LJIJ().LIZJ;
        if (c68085Qnp != null) {
            this.LJLIL.LJIJ().LJIIJ();
            c68085Qnp.onActivityPaused((Activity) BinderC68153Qov.LLJJIII(interfaceC68163Qp5));
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void onActivityResumed(InterfaceC68163Qp5 interfaceC68163Qp5, long j) {
        LLJI();
        C68085Qnp c68085Qnp = this.LJLIL.LJIJ().LIZJ;
        if (c68085Qnp != null) {
            this.LJLIL.LJIJ().LJIIJ();
            c68085Qnp.onActivityResumed((Activity) BinderC68153Qov.LLJJIII(interfaceC68163Qp5));
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void onActivityStarted(InterfaceC68163Qp5 interfaceC68163Qp5, long j) {
        LLJI();
        if (this.LJLIL.LJIJ().LIZJ != null) {
            this.LJLIL.LJIJ().LJIIJ();
            BinderC68153Qov.LLJJIII(interfaceC68163Qp5);
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void onActivityStopped(InterfaceC68163Qp5 interfaceC68163Qp5, long j) {
        LLJI();
        if (this.LJLIL.LJIJ().LIZJ != null) {
            this.LJLIL.LJIJ().LJIIJ();
            BinderC68153Qov.LLJJIII(interfaceC68163Qp5);
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void setConditionalUserProperty(Bundle bundle, long j) {
        LLJI();
        if (bundle == null) {
            this.LJLIL.LIZJ().LJFF.LIZ("Conditional user property must not be null");
        } else {
            this.LJLIL.LJIJ().LJIILLIIL(j, bundle);
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void setConsent(final Bundle bundle, final long j) {
        LLJI();
        final C68082Qnm LJIJ = this.LJLIL.LJIJ();
        LJIJ.getClass();
        ((InterfaceC68072Qnc) C68175QpH.LJLILLLLZI.LJLIL.zza()).zza();
        if (LJIJ.LIZ.LJI.LJIILJJIL(null, C68555QvP.LJJLIIIJILLIZJL)) {
            LJIJ.LIZ.LIZIZ().LJIILJJIL(new Runnable() { // from class: X.QoX
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        C68082Qnm.this.LJIL(j, bundle);
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            LJIJ.LJIL(j, bundle);
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void setConsentThirdParty(Bundle bundle, long j) {
        LLJI();
        this.LJLIL.LJIJ().LJIIZILJ(bundle, -20, j);
    }

    @Override // X.InterfaceC68207Qpn
    public void setMeasurementEnabled(boolean z, long j) {
        LLJI();
        C68082Qnm LJIJ = this.LJLIL.LJIJ();
        Boolean valueOf = Boolean.valueOf(z);
        LJIJ.LJI();
        LJIJ.LIZ.LIZIZ().LJIILIIL(new RunnableC68131QoZ(LJIJ, valueOf));
    }

    @Override // X.InterfaceC68207Qpn
    public void setUserId(final String str, long j) {
        LLJI();
        final C68082Qnm LJIJ = this.LJLIL.LJIJ();
        if (str != null && TextUtils.isEmpty(str)) {
            LJIJ.LIZ.LIZJ().LJIIIIZZ.LIZ("User ID must be non-empty or null");
        } else {
            LJIJ.LIZ.LIZIZ().LJIILIIL(new Runnable() { // from class: X.QnH
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    boolean z;
                    try {
                        C68082Qnm c68082Qnm = C68082Qnm.this;
                        String str2 = str;
                        C68031Qmx LJIILJJIL = c68082Qnm.LIZ.LJIILJJIL();
                        String str3 = LJIILJJIL.LJIILL;
                        if (str3 != null && !str3.equals(str2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LJIILJJIL.LJIILL = str2;
                        if (z) {
                            c68082Qnm.LIZ.LJIILJJIL().LJIIL();
                        }
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            LJIJ.LJIJJ(null, "_id", str, true, j);
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        LLJI();
        this.LJLIL.LJIJ().LJIIIZ(str, str2, bundle);
    }

    @Override // X.InterfaceC68207Qpn
    public void getConditionalUserProperties(String str, String str2, InterfaceC68139Qoh interfaceC68139Qoh) {
        LLJI();
        this.LJLIL.LIZIZ().LJIILIIL(new RunnableC68113QoH(this, interfaceC68139Qoh, str, str2));
    }

    @Override // X.InterfaceC68207Qpn
    public void initialize(InterfaceC68163Qp5 interfaceC68163Qp5, zzcl zzclVar, long j) {
        C68033Qmz c68033Qmz = this.LJLIL;
        if (c68033Qmz == null) {
            Context context = (Context) BinderC68153Qov.LLJJIII(interfaceC68163Qp5);
            QH7.LJIIIIZZ(context);
            this.LJLIL = C68033Qmz.LJIIZILJ(context, zzclVar, Long.valueOf(j));
            return;
        }
        c68033Qmz.LIZJ().LJIIIIZZ.LIZ("Attempting to initialize multiple times");
    }

    @Override // X.InterfaceC68207Qpn
    public void onActivityCreated(InterfaceC68163Qp5 interfaceC68163Qp5, Bundle bundle, long j) {
        LLJI();
        C68085Qnp c68085Qnp = this.LJLIL.LJIJ().LIZJ;
        if (c68085Qnp != null) {
            this.LJLIL.LJIJ().LJIIJ();
            c68085Qnp.onActivityCreated((Activity) BinderC68153Qov.LLJJIII(interfaceC68163Qp5), bundle);
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void onActivitySaveInstanceState(InterfaceC68163Qp5 interfaceC68163Qp5, InterfaceC68139Qoh interfaceC68139Qoh, long j) {
        LLJI();
        C68085Qnp c68085Qnp = this.LJLIL.LJIJ().LIZJ;
        Bundle bundle = new Bundle();
        if (c68085Qnp != null) {
            this.LJLIL.LJIJ().LJIIJ();
            c68085Qnp.onActivitySaveInstanceState((Activity) BinderC68153Qov.LLJJIII(interfaceC68163Qp5), bundle);
        }
        try {
            interfaceC68139Qoh.LJJJZ(bundle);
        } catch (RemoteException e) {
            this.LJLIL.LIZJ().LJIIIIZZ.LIZIZ(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // X.InterfaceC68207Qpn
    public void performAction(Bundle bundle, InterfaceC68139Qoh interfaceC68139Qoh, long j) {
        LLJI();
        interfaceC68139Qoh.LJJJZ(null);
    }

    @Override // X.InterfaceC68207Qpn
    public void getUserProperties(String str, String str2, boolean z, InterfaceC68139Qoh interfaceC68139Qoh) {
        LLJI();
        this.LJLIL.LIZIZ().LJIILIIL(new RunnableC68112QoG(this, interfaceC68139Qoh, str, str2, z));
    }

    @Override // X.InterfaceC68207Qpn
    public void setCurrentScreen(InterfaceC68163Qp5 interfaceC68163Qp5, String str, String str2, long j) {
        String str3;
        LLJI();
        C68084Qno LJIJI = this.LJLIL.LJIJI();
        Activity activity = (Activity) BinderC68153Qov.LLJJIII(interfaceC68163Qp5);
        if (!LJIJI.LIZ.LJI.LJIILL()) {
            LJIJI.LIZ.LIZJ().LJIIJ.LIZ("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C68132Qoa c68132Qoa = LJIJI.LIZJ;
        if (c68132Qoa == null) {
            LJIJI.LIZ.LIZJ().LJIIJ.LIZ("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (((ConcurrentHashMap) LJIJI.LJFF).get(activity) == null) {
            LJIJI.LIZ.LIZJ().LJIIJ.LIZ("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = LJIJI.LJIILIIL(activity.getClass());
        }
        boolean LJJLIIIJJI = OUP.LJJLIIIJJI(c68132Qoa.LIZIZ, str2);
        boolean LJJLIIIJJI2 = OUP.LJJLIIIJJI(c68132Qoa.LIZ, str);
        if (!LJJLIIIJJI || !LJJLIIIJJI2) {
            if (str == null || (str.length() > 0 && str.length() <= 100)) {
                if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                    C67281Qar c67281Qar = LJIJI.LIZ.LIZJ().LJIILIIL;
                    if (str == null) {
                        str3 = "null";
                    } else {
                        str3 = str;
                    }
                    c67281Qar.LIZJ(str3, str2, "Setting current screen to name, class");
                    C68132Qoa c68132Qoa2 = new C68132Qoa(str, str2, LJIJI.LIZ.LJIL().LJJLIIIJ());
                    ((ConcurrentHashMap) LJIJI.LJFF).put(activity, c68132Qoa2);
                    LJIJI.LJIIIZ(activity, c68132Qoa2, true);
                    return;
                }
                LJIJI.LIZ.LIZJ().LJIIJ.LIZIZ(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
                return;
            }
            LJIJI.LIZ.LIZJ().LJIIJ.LIZIZ(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        LJIJI.LIZ.LIZJ().LJIIJ.LIZ("setCurrentScreen cannot be called with the same class and name");
    }

    @Override // X.InterfaceC68207Qpn
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC68139Qoh interfaceC68139Qoh, long j) {
        Bundle bundle2;
        LLJI();
        QH7.LJI(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.LJLIL.LIZIZ().LJIILIIL(new RunnableC68080Qnk(this, interfaceC68139Qoh, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    @Override // X.InterfaceC68207Qpn
    public void logHealthData(int i, String str, InterfaceC68163Qp5 interfaceC68163Qp5, InterfaceC68163Qp5 interfaceC68163Qp52, InterfaceC68163Qp5 interfaceC68163Qp53) {
        Object LLJJIII;
        Object LLJJIII2;
        LLJI();
        Object obj = null;
        if (interfaceC68163Qp5 == null) {
            LLJJIII = null;
        } else {
            LLJJIII = BinderC68153Qov.LLJJIII(interfaceC68163Qp5);
        }
        if (interfaceC68163Qp52 == null) {
            LLJJIII2 = null;
        } else {
            LLJJIII2 = BinderC68153Qov.LLJJIII(interfaceC68163Qp52);
        }
        if (interfaceC68163Qp53 != null) {
            obj = BinderC68153Qov.LLJJIII(interfaceC68163Qp53);
        }
        this.LJLIL.LIZJ().LJIILIIL(i, true, false, str, LLJJIII, LLJJIII2, obj);
    }

    @Override // X.InterfaceC68207Qpn
    public void setUserProperty(String str, String str2, InterfaceC68163Qp5 interfaceC68163Qp5, boolean z, long j) {
        LLJI();
        this.LJLIL.LJIJ().LJIJJ(str, str2, BinderC68153Qov.LLJJIII(interfaceC68163Qp5), z, j);
    }

    @Override // X.InterfaceC68207Qpn
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        LLJI();
        this.LJLIL.LJIJ().LJIIJJI(str, str2, bundle, z, z2, j);
    }
}
