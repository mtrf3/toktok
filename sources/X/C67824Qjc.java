package X;

import X.C0M9;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Qjc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67824Qjc implements Handler.Callback {
    public static final Status LJLLLLLL = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status LJLZ = new Status(4, "The user must be signed in to make this API call.");
    public static final Object LJZ = new Object();
    public static C67824Qjc LJZI;
    public boolean LJLILLLLZI;
    public TelemetryData LJLJI;
    public C67823Qjb LJLJJI;
    public final Context LJLJJL;
    public final GoogleApiAvailability LJLJJLL;
    public final C67856Qk8 LJLJL;
    public final HandlerC67272Qai LJLLL;
    public volatile boolean LJLLLL;
    public long LJLIL = 10000;
    public final AtomicInteger LJLJLJ = new AtomicInteger(1);
    public final AtomicInteger LJLJLLL = new AtomicInteger(0);
    public final java.util.Map<C67719Qhv<?>, C67825Qjd<?>> LJLL = new ConcurrentHashMap(5, 0.75f, 1);
    public C67295Qb5 LJLLI = null;
    public final C0M4 LJLLILLLL = new C0M4();
    public final C0M4 LJLLJ = new C0M4();

    public static void LIZ() {
        synchronized (LJZ) {
            C67824Qjc c67824Qjc = LJZI;
            if (c67824Qjc != null) {
                c67824Qjc.LJLJLLL.incrementAndGet();
                HandlerC67272Qai handlerC67272Qai = c67824Qjc.LJLLL;
                handlerC67272Qai.sendMessageAtFrontOfQueue(handlerC67272Qai.obtainMessage(10));
            }
        }
    }

    public final boolean LIZJ() {
        if (this.LJLILLLLZI) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = C67932QlM.LIZ().LIZ;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.zzb) {
            return false;
        }
        int i = this.LJLJL.LIZ.get(203400000, -1);
        if (i != -1 && i != 0) {
            return false;
        }
        return true;
    }

    public static C67824Qjc LJI(Context context) {
        C67824Qjc c67824Qjc;
        synchronized (LJZ) {
            if (LJZI == null) {
                LJZI = new C67824Qjc(C16880lQ.LLLLL(context), AbstractC67866QkI.LIZIZ().getLooper(), GoogleApiAvailability.getInstance());
            }
            c67824Qjc = LJZI;
        }
        return c67824Qjc;
    }

    public final void LIZIZ(C67295Qb5 c67295Qb5) {
        synchronized (LJZ) {
            if (this.LJLLI != c67295Qb5) {
                this.LJLLI = c67295Qb5;
                this.LJLLILLLL.clear();
            }
            this.LJLLILLLL.addAll(c67295Qb5.LJLJJLL);
        }
    }

    public final C67825Qjd<?> LJ(AbstractC67791Qj5<?> abstractC67791Qj5) {
        C67719Qhv<?> c67719Qhv = abstractC67791Qj5.LJ;
        C67825Qjd<?> c67825Qjd = (C67825Qjd) ((ConcurrentHashMap) this.LJLL).get(c67719Qhv);
        if (c67825Qjd == null) {
            c67825Qjd = new C67825Qjd<>(this, abstractC67791Qj5);
            ((ConcurrentHashMap) this.LJLL).put(c67719Qhv, c67825Qjd);
        }
        if (c67825Qjd.LJLILLLLZI.LIZIZ()) {
            this.LJLLJ.add(c67719Qhv);
        }
        c67825Qjd.LJIIL();
        return c67825Qjd;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        Feature[] LJI;
        int i = message.what;
        long j = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.LJLIL = j;
                this.LJLLL.removeMessages(12);
                for (Object obj : ((ConcurrentHashMap) this.LJLL).keySet()) {
                    HandlerC67272Qai handlerC67272Qai = this.LJLLL;
                    handlerC67272Qai.sendMessageDelayed(handlerC67272Qai.obtainMessage(12, obj), this.LJLIL);
                }
                return true;
            case 2:
                C67547Qf9 c67547Qf9 = (C67547Qf9) message.obj;
                Iterator it = ((C0M9.c) c67547Qf9.LIZ.keySet()).iterator();
                while (true) {
                    C0M7 c0m7 = (C0M7) it;
                    if (c0m7.hasNext()) {
                        C67719Qhv<?> c67719Qhv = (C67719Qhv) c0m7.next();
                        C67825Qjd c67825Qjd = (C67825Qjd) ((ConcurrentHashMap) this.LJLL).get(c67719Qhv);
                        if (c67825Qjd == null) {
                            c67547Qf9.LIZ(c67719Qhv, new ConnectionResult(13), null);
                        } else if (c67825Qjd.LJLILLLLZI.isConnected()) {
                            c67547Qf9.LIZ(c67719Qhv, ConnectionResult.RESULT_SUCCESS, c67825Qjd.LJLILLLLZI.LJI());
                        } else {
                            QH7.LIZJ(c67825Qjd.LJLLJ.LJLLL);
                            ConnectionResult connectionResult = c67825Qjd.LJLLI;
                            if (connectionResult != null) {
                                c67547Qf9.LIZ(c67719Qhv, connectionResult, null);
                            } else {
                                QH7.LIZJ(c67825Qjd.LJLLJ.LJLLL);
                                ((HashSet) c67825Qjd.LJLJJL).add(c67547Qf9);
                                c67825Qjd.LJIIL();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (C67825Qjd c67825Qjd2 : ((ConcurrentHashMap) this.LJLL).values()) {
                    QH7.LIZJ(c67825Qjd2.LJLLJ.LJLLL);
                    c67825Qjd2.LJLLI = null;
                    c67825Qjd2.LJIIL();
                }
                return true;
            case 4:
            case 8:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                C67894Qkk c67894Qkk = (C67894Qkk) message.obj;
                C67825Qjd<?> c67825Qjd3 = (C67825Qjd) ((ConcurrentHashMap) this.LJLL).get(c67894Qkk.LIZJ.LJ);
                if (c67825Qjd3 == null) {
                    c67825Qjd3 = LJ(c67894Qkk.LIZJ);
                }
                if (c67825Qjd3.LJLILLLLZI.LIZIZ() && this.LJLJLLL.get() != c67894Qkk.LIZIZ) {
                    c67894Qkk.LIZ.LIZ(LJLLLLLL);
                    c67825Qjd3.LJIILL();
                } else {
                    c67825Qjd3.LJIILIIL(c67894Qkk.LIZ);
                }
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult2 = (ConnectionResult) message.obj;
                Iterator it2 = ((ConcurrentHashMap) this.LJLL).values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C67825Qjd c67825Qjd4 = (C67825Qjd) it2.next();
                        if (c67825Qjd4.LJLJL == i2) {
                            if (connectionResult2.zzb == 13) {
                                String errorString = this.LJLJJLL.getErrorString(connectionResult2.zzb);
                                String str = connectionResult2.zzd;
                                StringBuilder sb = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(str).length());
                                sb.append("Error resolution was canceled by the user, original error message: ");
                                sb.append(errorString);
                                sb.append(": ");
                                sb.append(str);
                                c67825Qjd4.LIZJ(new Status(17, null, sb.toString()));
                            } else {
                                c67825Qjd4.LIZJ(LIZLLL(c67825Qjd4.LJLJI, connectionResult2));
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(76);
                        sb2.append("Could not find API instance ");
                        sb2.append(i2);
                        sb2.append(" while trying to fail enqueued calls.");
                        android.util.Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    }
                }
                return true;
            case 6:
                if (C16880lQ.LLLLL(this.LJLJJL) instanceof Application) {
                    ComponentCallbacks2C67197QYv.LIZJ((Application) C16880lQ.LLLLL(this.LJLJJL));
                    ComponentCallbacks2C67197QYv componentCallbacks2C67197QYv = ComponentCallbacks2C67197QYv.LJLJJL;
                    componentCallbacks2C67197QYv.LIZ(new QZN(this));
                    if (!componentCallbacks2C67197QYv.LJLILLLLZI.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!componentCallbacks2C67197QYv.LJLILLLLZI.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            componentCallbacks2C67197QYv.LJLIL.set(true);
                        }
                    }
                    if (!componentCallbacks2C67197QYv.LJLIL.get()) {
                        this.LJLIL = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
                    }
                }
                return true;
            case 7:
                LJ((AbstractC67791Qj5) message.obj);
                return true;
            case 9:
                if (((ConcurrentHashMap) this.LJLL).containsKey(message.obj)) {
                    C67825Qjd c67825Qjd5 = (C67825Qjd) ((ConcurrentHashMap) this.LJLL).get(message.obj);
                    QH7.LIZJ(c67825Qjd5.LJLLJ.LJLLL);
                    if (c67825Qjd5.LJLJLLL) {
                        c67825Qjd5.LJIIL();
                    }
                }
                return true;
            case 10:
                Iterator it3 = this.LJLLJ.iterator();
                while (true) {
                    C0M7 c0m72 = (C0M7) it3;
                    if (c0m72.hasNext()) {
                        C67825Qjd c67825Qjd6 = (C67825Qjd) ((ConcurrentHashMap) this.LJLL).remove(c0m72.next());
                        if (c67825Qjd6 != null) {
                            c67825Qjd6.LJIILL();
                        }
                    } else {
                        this.LJLLJ.clear();
                        return true;
                    }
                }
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                if (((ConcurrentHashMap) this.LJLL).containsKey(message.obj)) {
                    C67825Qjd c67825Qjd7 = (C67825Qjd) ((ConcurrentHashMap) this.LJLL).get(message.obj);
                    QH7.LIZJ(c67825Qjd7.LJLLJ.LJLLL);
                    if (c67825Qjd7.LJLJLLL) {
                        c67825Qjd7.LJIIIIZZ();
                        C67824Qjc c67824Qjc = c67825Qjd7.LJLLJ;
                        if (C16880lQ.LLLLLZIL(c67824Qjc.LJLJJLL, c67824Qjc.LJLJJL) == 18) {
                            status = new Status(21, null, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, null, "API failed to connect while resuming due to an unknown error.");
                        }
                        c67825Qjd7.LIZJ(status);
                        c67825Qjd7.LJLILLLLZI.LJIIJ("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (((ConcurrentHashMap) this.LJLL).containsKey(message.obj)) {
                    ((C67825Qjd) ((ConcurrentHashMap) this.LJLL).get(message.obj)).LJIIJJI(true);
                }
                return true;
            case 14:
                message.obj.getClass();
                if (!((ConcurrentHashMap) this.LJLL).containsKey(null)) {
                    throw null;
                }
                ((C67825Qjd) ((ConcurrentHashMap) this.LJLL).get(null)).LJIIJJI(false);
                throw null;
            case 15:
                C67847Qjz c67847Qjz = (C67847Qjz) message.obj;
                if (((ConcurrentHashMap) this.LJLL).containsKey(c67847Qjz.LIZ)) {
                    C67825Qjd c67825Qjd8 = (C67825Qjd) ((ConcurrentHashMap) this.LJLL).get(c67847Qjz.LIZ);
                    if (((ArrayList) c67825Qjd8.LJLL).contains(c67847Qjz) && !c67825Qjd8.LJLJLLL) {
                        if (!c67825Qjd8.LJLILLLLZI.isConnected()) {
                            c67825Qjd8.LJIIL();
                        } else {
                            c67825Qjd8.LJ();
                        }
                    }
                }
                return true;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                C67847Qjz c67847Qjz2 = (C67847Qjz) message.obj;
                if (((ConcurrentHashMap) this.LJLL).containsKey(c67847Qjz2.LIZ)) {
                    C67825Qjd<?> c67825Qjd9 = (C67825Qjd) ((ConcurrentHashMap) this.LJLL).get(c67847Qjz2.LIZ);
                    if (((ArrayList) c67825Qjd9.LJLL).remove(c67847Qjz2)) {
                        c67825Qjd9.LJLLJ.LJLLL.removeMessages(15, c67847Qjz2);
                        c67825Qjd9.LJLLJ.LJLLL.removeMessages(16, c67847Qjz2);
                        Feature feature = c67847Qjz2.LIZIZ;
                        ArrayList arrayList = new ArrayList(((LinkedList) c67825Qjd9.LJLIL).size());
                        for (AbstractC67837Qjp abstractC67837Qjp : c67825Qjd9.LJLIL) {
                            if ((abstractC67837Qjp instanceof AbstractC67893Qkj) && (LJI = ((AbstractC67893Qkj) abstractC67837Qjp).LJI(c67825Qjd9)) != null) {
                                int length = LJI.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length) {
                                        break;
                                    }
                                    if (C64363PNv.LIZ(LJI[i3], feature)) {
                                        if (i3 >= 0) {
                                            arrayList.add(abstractC67837Qjp);
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            AbstractC67837Qjp abstractC67837Qjp2 = (AbstractC67837Qjp) ListProtector.get(arrayList, i4);
                            ((LinkedList) c67825Qjd9.LJLIL).remove(abstractC67837Qjp2);
                            abstractC67837Qjp2.LIZIZ(new C67920QlA(feature));
                        }
                    }
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.LJLJI;
                if (telemetryData != null) {
                    if (telemetryData.zaa > 0 || LIZJ()) {
                        if (this.LJLJJI == null) {
                            this.LJLJJI = new C67823Qjb(this.LJLJJL);
                        }
                        this.LJLJJI.LJ(telemetryData);
                    }
                    this.LJLJI = null;
                }
                return true;
            case 18:
                C67924QlE c67924QlE = (C67924QlE) message.obj;
                if (c67924QlE.LIZJ == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(c67924QlE.LIZIZ, Arrays.asList(c67924QlE.LIZ));
                    if (this.LJLJJI == null) {
                        this.LJLJJI = new C67823Qjb(this.LJLJJL);
                    }
                    this.LJLJJI.LJ(telemetryData2);
                } else {
                    TelemetryData telemetryData3 = this.LJLJI;
                    if (telemetryData3 != null) {
                        List<MethodInvocation> list = telemetryData3.zab;
                        if (telemetryData3.zaa != c67924QlE.LIZIZ || (list != null && list.size() >= c67924QlE.LIZLLL)) {
                            this.LJLLL.removeMessages(17);
                            TelemetryData telemetryData4 = this.LJLJI;
                            if (telemetryData4 != null) {
                                if (telemetryData4.zaa > 0 || LIZJ()) {
                                    if (this.LJLJJI == null) {
                                        this.LJLJJI = new C67823Qjb(this.LJLJJL);
                                    }
                                    this.LJLJJI.LJ(telemetryData4);
                                }
                                this.LJLJI = null;
                            }
                        } else {
                            TelemetryData telemetryData5 = this.LJLJI;
                            MethodInvocation methodInvocation = c67924QlE.LIZ;
                            if (telemetryData5.zab == null) {
                                telemetryData5.zab = new ArrayList();
                            }
                            telemetryData5.zab.add(methodInvocation);
                        }
                    }
                    if (this.LJLJI == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c67924QlE.LIZ);
                        this.LJLJI = new TelemetryData(c67924QlE.LIZIZ, arrayList2);
                        HandlerC67272Qai handlerC67272Qai2 = this.LJLLL;
                        handlerC67272Qai2.sendMessageDelayed(handlerC67272Qai2.obtainMessage(17), c67924QlE.LIZJ);
                    }
                }
                return true;
            case 19:
                this.LJLILLLLZI = false;
                return true;
            default:
                return false;
        }
    }

    public static Status LIZLLL(C67719Qhv<?> c67719Qhv, ConnectionResult connectionResult) {
        String str = c67719Qhv.LIZIZ.LIZJ;
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(1, 17, sb.toString(), connectionResult.zzc, connectionResult);
    }

    public final void LJII(ConnectionResult connectionResult, int i) {
        if (!this.LJLJJLL.zah(this.LJLJJL, connectionResult, i)) {
            HandlerC67272Qai handlerC67272Qai = this.LJLLL;
            handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public C67824Qjc(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.LJLLLL = true;
        this.LJLJJL = context;
        HandlerC67272Qai handlerC67272Qai = new HandlerC67272Qai(looper, this);
        this.LJLLL = handlerC67272Qai;
        this.LJLJJLL = googleApiAvailability;
        this.LJLJL = new C67856Qk8(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (C67261QaX.LIZLLL == null) {
            C67261QaX.LIZLLL = Boolean.valueOf(C44389HbV.LIZ() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (C67261QaX.LIZLLL.booleanValue()) {
            this.LJLLLL = false;
        }
        handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(6));
    }

    public final <T> void LJFF(C67649Qgn<T> c67649Qgn, int i, AbstractC67791Qj5 abstractC67791Qj5) {
        long j;
        long j2;
        if (i != 0) {
            C67719Qhv<O> c67719Qhv = abstractC67791Qj5.LJ;
            if (!LIZJ()) {
                return;
            }
            RootTelemetryConfiguration rootTelemetryConfiguration = C67932QlM.LIZ().LIZ;
            boolean z = true;
            if (rootTelemetryConfiguration != null) {
                if (!rootTelemetryConfiguration.zzb) {
                    return;
                }
                z = rootTelemetryConfiguration.zzc;
                C67825Qjd c67825Qjd = (C67825Qjd) ((ConcurrentHashMap) this.LJLL).get(c67719Qhv);
                if (c67825Qjd != null) {
                    Object obj = c67825Qjd.LJLILLLLZI;
                    if (!(obj instanceof AbstractC67863QkF)) {
                        return;
                    }
                    AbstractC67863QkF abstractC67863QkF = (AbstractC67863QkF) obj;
                    if (abstractC67863QkF.LLI != null && !abstractC67863QkF.LJIIJJI()) {
                        ConnectionTelemetryConfiguration LIZ = C67826Qje.LIZ(c67825Qjd, abstractC67863QkF, i);
                        if (LIZ == null) {
                            return;
                        }
                        c67825Qjd.LJLLILLLL++;
                        z = LIZ.zzc;
                    }
                }
            }
            if (z) {
                j = System.currentTimeMillis();
                j2 = SystemClock.elapsedRealtime();
            } else {
                j = 0;
                j2 = 0;
            }
            C67826Qje c67826Qje = new C67826Qje(this, i, c67719Qhv, j, j2);
            C67646Qgk<T> c67646Qgk = c67649Qgn.LIZ;
            final HandlerC67272Qai handlerC67272Qai = this.LJLLL;
            handlerC67272Qai.getClass();
            c67646Qgk.LIZJ(new Executor() { // from class: X.QlB
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handlerC67272Qai.post(runnable);
                }
            }, c67826Qje);
        }
    }
}
