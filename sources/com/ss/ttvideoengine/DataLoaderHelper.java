package com.ss.ttvideoengine;

import X.C06540Nm;
import X.C146165oS;
import X.C16880lQ;
import X.C25620zW;
import X.C46921IbF;
import X.C47069Idd;
import X.C47070Ide;
import X.C47083Idr;
import X.C47114IeM;
import X.C47120IeS;
import X.C47121IeT;
import X.C47147Iet;
import X.C47148Ieu;
import X.C47149Iev;
import X.C47160If6;
import X.C47164IfA;
import X.C47396Iiu;
import X.C47398Iiw;
import X.C47529Il3;
import X.C47538IlC;
import X.C47570Ili;
import X.C47572Ilk;
import X.C47573Ill;
import X.C47578Ilq;
import X.C47708Inw;
import X.C47710Iny;
import X.C47711Inz;
import X.C47714Io2;
import X.C47715Io3;
import X.C47717Io5;
import X.C47720Io8;
import X.C47725IoD;
import X.C47726IoE;
import X.C47729IoH;
import X.C47735IoN;
import X.C47748Ioa;
import X.C47749Iob;
import X.C47756Ioi;
import X.C47804IpU;
import X.C47850IqE;
import X.C47878Iqg;
import X.C47903Ir5;
import X.C47906Ir8;
import X.C47956Irw;
import X.C48433Izd;
import X.C5ML;
import X.C77117UOj;
import X.C78253UnR;
import X.EnumC47157If3;
import X.EnumC47176IfM;
import X.EnumC47718Io6;
import X.EnumC47719Io7;
import X.IY1;
import X.IYN;
import X.InterfaceC46923IbH;
import X.InterfaceC47098Ie6;
import X.InterfaceC47122IeU;
import X.InterfaceC47535Il9;
import X.InterfaceC47565Ild;
import X.InterfaceC47584Ilw;
import X.InterfaceC47616ImS;
import X.InterfaceC47696Ink;
import X.JBR;
import X.X1D;
import X.YE1;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.vcloud.vctrace.VCTrace;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.ss.mediakit.medialoader.AVMDLStartCompleteListener;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class DataLoaderHelper implements AVMDLDataLoaderListener, AVMDLStartCompleteListener, InterfaceC47535Il9 {
    public volatile int LIZJ;
    public AVMDLDataLoaderConfigure LJIIJ;
    public final C47748Ioa LJIIL;
    public final C47720Io8 LJJ;
    public final C47573Ill LIZ = new C47573Ill();
    public InterfaceC47696Ink LIZIZ = null;
    public final C47711Inz LIZLLL = new C47711Inz();
    public final C47711Inz LJ = new C47711Inz();
    public final C47711Inz LJFF = new C47711Inz();
    public final C47711Inz LJI = new C47711Inz();
    public final HashMap<String, ArrayList<WeakReference<TTVideoEngine>>> LJII = new HashMap<>();
    public final ReentrantLock LJIIIIZZ = new ReentrantLock();
    public AVMDLDataLoader LJIIIZ = null;
    public Context LJIIJJI = null;
    public String LJIILIIL = null;
    public C47725IoD LJIILJJIL = null;
    public InterfaceC47565Ild LJIILL = null;
    public int LJIILLIIL = 0;
    public boolean LJIIZILJ = false;
    public long LJIJ = -1;
    public long LJIJI = 0;
    public boolean LJIJJ = true;
    public int LJIJJLI = 0;
    public boolean LJIL = false;
    public int LJJI = 0;
    public int LJJIFFI = 0;
    public C47572Ilk LJJII = null;
    public WeakReference<InterfaceC47584Ilw> LJJIII = null;
    public int LJJIIJ = -1;
    public int LJJIIJZLJL = 0;
    public boolean LJJIIZ = false;
    public int LJJIIZI = 0;
    public int LJJIJ = 0;
    public boolean LJJIJIIJI = false;
    public boolean LJJIJIIJIL = false;
    public int LJJIJIL = 0;
    public boolean LJJIJL = false;
    public C47114IeM LJJIJLIJ = null;
    public int LJJIL = 0;
    public int LJJIZ = 0;
    public int LJJJ = 0;
    public int LJJJI = 0;
    public int LJJJIL = 0;
    public int LJJJJ = 0;
    public int LJJJJI = 0;
    public int LJJJJIZL = 0;
    public int LJJJJJ = 0;
    public boolean LJJJJJL = false;
    public final C47710Iny LJJJJL = new C47710Iny();
    public int LJJJJLI = 0;
    public int LJJJJLL = 0;
    public int LJJJJZ = 0;
    public int LJJJJZI = 0;
    public int LJJJLIIL = 0;
    public int LJJJLL = 0;
    public int LJJJLZIJ = 0;
    public final ArrayList<Integer> LJJJZ = new ArrayList<>();
    public int LJJL = EnumC47719Io7.None.ordinal();
    public int LJJLI = EnumC47718Io6.Default.ordinal();
    public volatile boolean LJJLIIIIJ = false;
    public String LJJLIIIJ = null;

    /* JADX WARN: Can't wrap try/catch for region: R(18:11|(1:13)|14|(5:16|(1:18)|19|(1:21)|22)|53|(1:59)|60|(1:64)|(6:66|(1:68)(1:91)|69|(1:90)(1:73)|74|(2:76|52)(2:77|(2:81|(9:89|25|(1:27)|28|(7:30|31|32|(2:35|33)|36|37|38)|42|43|(1:47)|48))))|24|25|(0)|28|(0)|42|43|(2:45|47)|48) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (com.ss.mediakit.medialoader.AVMDLDataLoader.initWithLibraryManager() == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f4, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("mInnerDataloader create error:");
        r1.append(r2.toString());
        r10.LJJLIIIJ = X.X1D.LIZIZ(r1);
        com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJIIJI() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.LJJIJIIJI():boolean");
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final long getInt64Value(int i, long j) {
        return 0L;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLStartCompleteListener
    public final void onStartComplete() {
        this.LJJLIIIIJ = true;
        if (this.LJJLI == EnumC47718Io6.Initializing.ordinal()) {
            this.LJJLI = EnumC47718Io6.InitializeComplete.ordinal();
        }
        TTVideoEngineLog.d("DataLoaderHelper", "MediaDataLoader start complete");
        C47735IoN c47735IoN = C47538IlC.LIZ;
        c47735IoN.LIZIZ();
        c47735IoN.LJI();
        int i = C47906Ir8.LIZLLL().LIZ;
        this.LJJIIJ = i;
        AVMDLDataLoader aVMDLDataLoader = this.LJIIIZ;
        if (aVMDLDataLoader != null) {
            aVMDLDataLoader.setIntValue(7219, i);
            if (!C47147Iet.LIZ.LJII()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("strategy center running failed, set mdl preload strategy back ");
                C47956Irw.LIZIZ(LIZ, this.LJJIZ, LIZ, "DataLoaderHelper");
                this.LJIIIZ.setIntValue(1030, this.LJJIZ);
            }
        }
        C47573Ill c47573Ill = this.LIZ;
        if (c47573Ill != null) {
            c47573Ill.LIZJ(11, 0L, 0L, "mdl start complete");
        }
        this.LIZ.onStartComplete();
    }

    public final void LJIIL() {
        if (this.LJIIIZ == null) {
            C78253UnR.LIZLLL("DataLoaderHelper", "[preload] need load mdl first.");
            return;
        }
        C47711Inz c47711Inz = this.LIZLLL;
        c47711Inz.LIZ.lock();
        if (c47711Inz.LIZIZ.size() == 0) {
            c47711Inz.LIZ.unlock();
            return;
        }
        C47708Inw c47708Inw = (C47708Inw) ListProtector.get(c47711Inz.LIZIZ, r1.size() - 1);
        c47711Inz.LIZ.unlock();
        if (c47708Inw != null && this.LJ.LIZJ(c47708Inw)) {
            this.LIZLLL.LJ();
            if (c47708Inw.LIZIZ != null || c47708Inw.LJIIJ != null) {
                LJFF(c47708Inw);
            } else {
                LJIILIIL(c47708Inw);
            }
        }
    }

    public final void LJIJJ() {
        if (this.LJIIIZ == null || this.LIZJ != 0) {
            C78253UnR.LIZLLL("DataLoaderHelper", "need start mdl first");
            return;
        }
        if (this.LJJJJ == 1) {
            C47529Il3 c47529Il3 = C47147Iet.LIZ;
            if (c47529Il3.LJII()) {
                c47529Il3.LJ().businessEvent(31205, 1);
            }
        }
        this.LJJ.LIZJ(1);
        try {
            LJIJJLI();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void LJIJJLI() {
        ArrayList arrayList = new ArrayList();
        if (this.LJ.LIZIZ() > 0) {
            while (true) {
                C47708Inw LJ = this.LJ.LJ();
                if (LJ == null) {
                    break;
                }
                if (LJ.LIZLLL >= 10000) {
                    arrayList.add(LJ);
                } else {
                    C47804IpU c47804IpU = LJ.LJFF;
                    if (c47804IpU != null) {
                        c47804IpU.LJI();
                    }
                    LJII(LJ);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                this.LJ.LIZJ((C47708Inw) ListProtector.get(arrayList, i));
            }
            arrayList.clear();
        }
        if (this.LIZLLL.LIZIZ() > 0) {
            while (true) {
                C47708Inw LJ2 = this.LIZLLL.LJ();
                if (LJ2 == null) {
                    break;
                }
                if (LJ2.LIZLLL >= 10000) {
                    arrayList.add(LJ2);
                } else {
                    C47804IpU c47804IpU2 = LJ2.LJFF;
                    if (c47804IpU2 != null) {
                        c47804IpU2.LJI();
                    }
                    LJII(LJ2);
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.LIZLLL.LIZJ((C47708Inw) ListProtector.get(arrayList, i2));
            }
            arrayList.clear();
        }
        if (this.LJFF.LIZIZ() > 0) {
            boolean z = false;
            while (true) {
                C47708Inw LJ3 = this.LJFF.LJ();
                if (LJ3 == null) {
                    break;
                }
                if (LJ3.LIZLLL >= 10000) {
                    arrayList.add(LJ3);
                } else {
                    LJII(LJ3);
                    z = true;
                }
            }
            if (z) {
                this.LJIIIZ.cancelAll();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.LJFF.LIZJ((C47708Inw) ListProtector.get(arrayList, i3));
            }
            arrayList.clear();
        }
    }

    public final boolean LJJIJIIJIL() {
        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = this.LJIIJ;
        if (aVMDLDataLoaderConfigure == null || TextUtils.isEmpty(aVMDLDataLoaderConfigure.mPrecisePreloadConfigStr)) {
            return false;
        }
        try {
            if (JSONObjectProtectorUtils.getInt(new JSONObject(this.LJIIJ.mPrecisePreloadConfigStr), "enable") <= 0) {
                return false;
            }
            return true;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public final boolean LJJIJIL() {
        boolean z;
        this.LJJ.LIZJ(0);
        try {
            if (this.LIZJ != 0) {
                z = false;
            } else {
                z = true;
            }
            return z;
        } finally {
            this.LJJ.LJ(0);
        }
    }

    public final void LJJJIL() {
        boolean z;
        Throwable targetException;
        int i;
        this.LJJ.LIZJ(2);
        try {
            if (this.LIZJ == 0) {
                C78253UnR.LIZLLL("DataLoaderHelper", "DataLoader has started not need start");
                if (i > 0) {
                    return;
                } else {
                    return;
                }
            }
            this.LJJLI = EnumC47718Io6.Initializing.ordinal();
            if (LJJIJIIJI()) {
                this.LJ.LIZJ = 4L;
                this.LIZLLL.LIZJ = 20L;
                if (this.LJIIJ == null) {
                    this.LJIIJ = AVMDLDataLoaderConfigure.getDefaultonfigure();
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    if (!TextUtils.isEmpty(C146165oS.LIZJ)) {
                        jSONObject.put("app_channel", C146165oS.LIZJ);
                    }
                    if (!TextUtils.isEmpty(C146165oS.LIZIZ)) {
                        jSONObject.put("app_name", C146165oS.LIZIZ);
                    }
                    if (!TextUtils.isEmpty(C146165oS.LJIIIIZZ)) {
                        jSONObject.put("device_id_secret", C146165oS.LJIIIIZZ);
                    }
                    if (!TextUtils.isEmpty(C146165oS.LJ)) {
                        jSONObject.put("device_id", C146165oS.LJ);
                    }
                    if (!TextUtils.isEmpty(C146165oS.LIZLLL)) {
                        jSONObject.put("app_version", C146165oS.LIZLLL);
                    }
                    int i2 = C146165oS.LIZ;
                    if (i2 >= 0) {
                        jSONObject.put("app_id", i2);
                    }
                    if (jSONObject.has("app_id")) {
                        this.LJIIJ.mAppInfo = jSONObject.toString();
                    }
                } catch (JSONException e) {
                    TTVideoEngineLog.d(e);
                }
                if (this.LJIILL != null) {
                    this.LJIIJ.mEnableReportTaskLog = 1;
                }
                if (this.LJJIJIIJI) {
                    this.LJIIJ.mCloseLocalServer = 1;
                }
                this.LJIIIZ.setConfigure(this.LJIIJ);
                if (this.LJIIIZ.start() >= 0) {
                    C78253UnR.LJI("DataLoaderHelper", "[preload] preload strategy " + this.LJJIL);
                    LJJJJIZL();
                    long longValue = this.LJIIIZ.getLongValue(7218);
                    this.LJIJ = longValue;
                    if (longValue == -1) {
                        this.LJIJJ = true;
                    }
                    if (this.LJJIJ == 1 && this.LJIL && longValue > 0) {
                        try {
                            Class<?> LJI = C47756Ioi.LJI(200, "com.ss.ttm.player.TTPlayer");
                            Method declaredMethod = LJI.getDeclaredMethod("registerNativeMdl", Long.TYPE);
                            declaredMethod.setAccessible(true);
                            if (((Integer) declaredMethod.invoke(LJI, Long.valueOf(this.LJIJ))).intValue() == 0) {
                                C78253UnR.LJI("DataLoaderHelper", "firstNativeMDL effect");
                                TTVideoEngineImpl.W7 = true;
                                this.LJIJJ = false;
                            }
                        } catch (Throwable th) {
                            C78253UnR.LIZLLL("DataLoaderHelper", th.toString());
                            if ((th instanceof InvocationTargetException) && (targetException = th.getTargetException()) != null) {
                                C78253UnR.LIZLLL("DataLoaderHelper", targetException.toString());
                            }
                        }
                    }
                    if (this.LJIIIZ.getLongValue(9407) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJJIJL = z;
                    C78253UnR.LJI("DataLoaderHelper", "start: get mdlprotocolHandle: " + this.LJIJ);
                    C47725IoD c47725IoD = this.LJIILJJIL;
                    AVMDLDataLoader aVMDLDataLoader = this.LJIIIZ;
                    int i3 = this.LJJI;
                    if (c47725IoD.LIZIZ == null && c47725IoD.LIZ == null && i3 > 0) {
                        c47725IoD.LIZIZ = new C47717Io5(aVMDLDataLoader);
                        PthreadTimer pthreadTimer = new PthreadTimer("DataLoaderHelper$DataLoaderHeartBeat");
                        c47725IoD.LIZ = pthreadTimer;
                        long j = i3;
                        pthreadTimer.schedule(c47725IoD.LIZIZ, j, j);
                    }
                    this.LIZJ = 0;
                    if (this.LJJLIIIIJ && this.LJJLI == EnumC47718Io6.Initializing.ordinal()) {
                        this.LJJLI = EnumC47718Io6.InitializeComplete.ordinal();
                    }
                    this.LJJII = new C47572Ilk(this);
                    this.LJJIII = new WeakReference<>(this.LJJII);
                    C47906Ir8.LIZLLL().LJII(this.LJJIII);
                    int longValue2 = (int) this.LJIIIZ.getLongValue(7433);
                    this.LJIJI = C48433Izd.LJJI(longValue2);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("KeyIsGetDemuxerVersion: ");
                    LIZ.append(longValue2);
                    LIZ.append(", handle: ");
                    LIZ.append(this.LJIJI);
                    TTVideoEngineLog.d("DataLoaderHelper", X1D.LIZIZ(LIZ));
                    if (this.LJIJI != 0) {
                        TTVideoEngineLog.d("DataLoaderHelper", "set KeyIsSetDemuxerHandle");
                        this.LJIIIZ.setLongValue(7432, this.LJIJI);
                    }
                    TTVideoEngineLog.d("DataLoaderHelper", "DataLoader start.");
                    this.LJJ.LJ(2);
                    if (C47149Iev.LIZ.LJIILJJIL > 0) {
                        this.LJJ.LJFF(1);
                        return;
                    }
                    return;
                }
                this.LJJLI = EnumC47718Io6.InitializeError.ordinal();
                this.LJJLIIIJ = "start data loader fail";
                throw new Exception("start data loader fail");
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("initMdlFail:");
            LIZ2.append(AVMDLDataLoader.getLoadFailMsg());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            this.LJJLI = EnumC47718Io6.InitializeError.ordinal();
            throw new Exception(LIZIZ);
        } finally {
            this.LJJ.LJ(2);
            if (C47149Iev.LIZ.LJIILJJIL > 0) {
                this.LJJ.LJFF(1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJIZL() {
        /*
            r10 = this;
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r10.LJIIJ
            int r0 = r0.mEnableIOManager
            if (r0 == 0) goto L40
            com.ss.mediakit.medialoader.AVMDLDataLoader r1 = r10.LJIIIZ
            r0 = 7390(0x1cde, float:1.0356E-41)
            long r4 = r1.getLongValue(r0)
            com.ss.mediakit.medialoader.AVMDLDataLoader r1 = r10.LJIIIZ
            r0 = 7402(0x1cea, float:1.0372E-41)
            long r1 = r1.getLongValue(r0)
            r8 = 0
            java.lang.String r3 = "DataLoaderHelper"
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L2e
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L2e
            r6 = -998(0xfffffffffffffc1a, double:NaN)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L2e
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 >= 0) goto L41
        L2e:
            java.lang.String r6 = "tryStartStrategyCenter iomanagerHandle or iomanagerVersion is not validiomanagerHandle="
            java.lang.String r0 = " iomanagerVersion="
            java.lang.StringBuilder r0 = X.V10.LIZJ(r6, r4, r0)
            r0.append(r1)
            java.lang.String r0 = X.X1D.LIZIZ(r0)
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r3, r0)
        L40:
            return
        L41:
            X.IeM r0 = new X.IeM
            r0.<init>()
            r10.LJJIJLIJ = r0
            X.Il3 r6 = X.C47147Iet.LIZ
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJIILJJIL
            r0.lock()
            r6.LJFF = r4     // Catch: java.lang.Throwable -> Le7
            r6.LJI = r1     // Catch: java.lang.Throwable -> Le7
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJIILJJIL
            r0.unlock()
            android.content.Context r0 = r10.LJIIJJI
            r6.LJII = r0
            r6.LJ()
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJIILJJIL
            r0.lock()
            r6.LJI()     // Catch: java.lang.Throwable -> L68
            goto L72
        L68:
            r0 = move-exception
            java.lang.String r1 = "VCStrategy"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Le0
            X.C78253UnR.LJI(r1, r0)     // Catch: java.lang.Throwable -> Le0
        L72:
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJIILJJIL
            r0.unlock()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "after start strategy center running="
            r1.append(r0)
            X.Il3 r4 = X.C47147Iet.LIZ
            boolean r0 = r4.LJII()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r3, r0)
            java.lang.String r1 = X.C146165oS.LJFF()
            r0 = 0
            r4.LIZLLL(r1, r0)
            com.bytedance.vcloud.strategy.StrategyCenter r2 = r4.LJ()
            r1 = 31211(0x79eb, float:4.3736E-41)
            java.lang.String r0 = X.C47752Ioe.LJLIL
            r2.businessEvent(r1, r0)
            com.bytedance.vcloud.strategy.StrategyCenter r2 = r4.LJ()
            com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure r0 = r10.LJIIJ
            java.lang.String r1 = r0.mCacheDir
            r0 = 31209(0x79e9, float:4.3733E-41)
            r2.businessEvent(r0, r1)
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = r10.LJIIIZ
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L40
            boolean r0 = r4.LJII()
            r2 = 1030(0x406, float:1.443E-42)
            if (r0 != 0) goto Ld7
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "strategy center start failed, set mdl preload strategy back "
            r1.append(r0)
            int r0 = r10.LJJIZ
            X.C47956Irw.LIZIZ(r1, r0, r1, r3)
            com.ss.mediakit.medialoader.AVMDLDataLoader r1 = r10.LJIIIZ
            int r0 = r10.LJJIZ
            r1.setIntValue(r2, r0)
            goto L40
        Ld7:
            com.ss.mediakit.medialoader.AVMDLDataLoader r1 = r10.LJIIIZ
            int r0 = r10.LJJIL
            r1.setIntValue(r2, r0)
            goto L40
        Le0:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJIILJJIL
            r0.unlock()
            throw r1
        Le7:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r6.LJIILJJIL
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.LJJJJIZL():void");
    }

    public final void LJJJJJ() {
        if (this.LIZJ != 0) {
            TTVideoEngineLog.d("DataLoaderHelper", "dataloader not started, not allow set play info");
            return;
        }
        if (this.LJJJIL <= 0) {
            return;
        }
        this.LJJ.LIZJ(1);
        this.LJIIIZ.setIntValue(7410, C47906Ir8.LIZLLL().LIZIZ);
        C47578Ilq.LIZ().getClass();
        this.LJIIIZ.setIntValue(7409, -1);
        this.LJJ.LJ(1);
    }

    public DataLoaderHelper() {
        this.LIZJ = 1;
        this.LJIIJ = null;
        this.LJIIL = null;
        this.LJIIL = C47748Ioa.LIZIZ();
        this.LIZJ = 1;
        this.LJIIJ = AVMDLDataLoaderConfigure.getDefaultonfigure();
        new VCTrace();
        this.LJJ = new C47720Io8(C47149Iev.LIZ.LJIILIIL);
    }

    public static DataLoaderHelper LJJIIJ() {
        return C47148Ieu.LIZ;
    }

    public static void LJII(C47708Inw c47708Inw) {
        if (c47708Inw.LJIIJJI) {
            return;
        }
        c47708Inw.LJIIJJI = true;
        if (c47708Inw.LIZJ() != null) {
            c47708Inw.LIZJ().LIZ(new C47121IeT(5));
        }
    }

    public static C47729IoH LJIIIZ(String str) {
        C47729IoH c47729IoH = null;
        if (str == null) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length >= 4) {
            c47729IoH = new C47729IoH();
            c47729IoH.LIZJ = split[3];
            if (!TextUtils.isEmpty(split[0])) {
                c47729IoH.LIZIZ = CastLongProtector.valueOf(split[0]).longValue();
            }
            if (!TextUtils.isEmpty(split[1])) {
                c47729IoH.LIZ = CastLongProtector.valueOf(split[1]).longValue();
            }
        }
        return c47729IoH;
    }

    public final void LIZJ(C47708Inw c47708Inw) {
        ArrayList<C47708Inw> LJII = this.LJI.LJII();
        for (int i = 0; i < LJII.size(); i++) {
            C47708Inw c47708Inw2 = (C47708Inw) ListProtector.get(LJII, i);
            if (!TextUtils.isEmpty(c47708Inw2.LIZ) && !TextUtils.isEmpty(c47708Inw.LIZ) && c47708Inw2.LIZ.equals(c47708Inw.LIZ)) {
                return;
            }
        }
        this.LJJ.LIZJ(0);
        C47710Iny c47710Iny = this.LJJJJL;
        String str = c47708Inw.LIZ;
        c47710Iny.LIZJ.lock();
        if (!c47710Iny.LIZLLL.containsKey(str)) {
            if (c47710Iny.LIZLLL.size() >= 2) {
                c47710Iny.LIZLLL.clear();
            }
            c47710Iny.LIZLLL.put(str, new C47726IoE());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("key :");
        LIZ.append(str);
        LIZ.append(" cache end.");
        TTVideoEngineLog.d("PreloadUtil", X1D.LIZIZ(LIZ));
        C47726IoE c47726IoE = c47710Iny.LIZLLL.get(str);
        if (c47726IoE != null) {
            c47726IoE.LIZLLL = true;
            if (!c47726IoE.LJ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("cached video trigger preload ");
                LIZ2.append(str);
                LIZ2.append(" cache end ");
                TTVideoEngineLog.d("PreloadUtil", X1D.LIZIZ(LIZ2));
                DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
                long j = c47726IoE.LIZ;
                C47573Ill c47573Ill = dataLoaderHelper.LIZ;
                if (c47573Ill != null) {
                    c47573Ill.LIZJ(9, 0L, j, "");
                }
                c47726IoE.LJ = true;
            }
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("key :");
            LIZ3.append(str);
            LIZ3.append(" play info null");
            TTVideoEngineLog.d("PreloadUtil", X1D.LIZIZ(LIZ3));
        }
        c47710Iny.LIZJ.unlock();
        this.LJJ.LJ(0);
        String str2 = c47708Inw.LIZ;
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.LJIIIIZZ.lock();
            ArrayList<WeakReference<TTVideoEngine>> arrayList2 = this.LJII.get(str2);
            if (arrayList2 != null) {
                arrayList = new ArrayList();
                arrayList.addAll(arrayList2);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("get engine ref,rawKey = ");
                LIZ4.append(str2);
                LIZ4.append(" engine ref count: ");
                LIZ4.append(arrayList.size());
                C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ4));
            }
            if (arrayList == null || arrayList.size() == 0) {
                return;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Reference reference = (Reference) ListProtector.get(arrayList, i2);
                if (reference.get() != null) {
                    ((TTVideoEngine) reference.get()).LJJJLZIJ();
                }
            }
        } finally {
            this.LJIIIIZZ.unlock();
        }
    }

    public final void LJ(C47069Idd c47069Idd) {
        C46921IbF c46921IbF;
        InterfaceC46923IbH interfaceC46923IbH = c47069Idd.LJFF;
        C47120IeS c47120IeS = null;
        if (interfaceC46923IbH != null) {
            c46921IbF = new C46921IbF(interfaceC46923IbH);
        } else {
            c46921IbF = null;
        }
        InterfaceC47122IeU interfaceC47122IeU = c47069Idd.LIZJ;
        if (interfaceC47122IeU != null) {
            c47120IeS = new C47120IeS(this, interfaceC47122IeU);
        }
        C47147Iet.LIZ.LJ().addPriorityTask(c47069Idd.LIZ(), c46921IbF, c47120IeS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x013b, code lost:
    
        if (r0 < r4) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C47708Inw r26) {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.LJFF(X.Inw):void");
    }

    public final String LJI(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("mdl://")) {
                return str;
            }
            int indexOf = str.indexOf("?");
            if (indexOf == -1) {
                return null;
            }
            String localAddr = this.LJIIIZ.getLocalAddr();
            if (TextUtils.isEmpty(localAddr)) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer("http://");
            stringBuffer.append(localAddr);
            stringBuffer.append(str.substring(indexOf));
            String stringBuffer2 = stringBuffer.toString();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("_proxyUrl: ");
            LIZ.append(stringBuffer2);
            C78253UnR.LIZLLL("DataLoaderHelper", X1D.LIZIZ(LIZ));
            return stringBuffer2;
        } catch (Exception unused) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("get proxy url failed: ");
            LIZ2.append(str);
            C78253UnR.LIZLLL("DataLoaderHelper", X1D.LIZIZ(LIZ2));
            return str;
        }
    }

    public final void LJIILIIL(C47708Inw c47708Inw) {
        String str;
        String str2;
        C47749Iob LIZ;
        if (c47708Inw.LJI != null && ((CopyOnWriteArrayList) c47708Inw.LJIILL).size() == 1) {
            ListProtector.remove(c47708Inw.LJIILL, 0);
        }
        HashMap hashMap = new HashMap();
        if (c47708Inw.LJI == null) {
            if (this.LIZ != null && TextUtils.isEmpty(c47708Inw.LJII)) {
                str = this.LIZ.LJI(hashMap, c47708Inw.LIZ, c47708Inw.LJ);
                str2 = this.LIZ.LIZLLL(c47708Inw.LIZ, c47708Inw.LJ);
                c47708Inw.LJI.getClass();
                c47708Inw.LJII = C77117UOj.LIZ(str);
            } else {
                str = null;
                str2 = null;
            }
            C47578Ilq.LIZ().getClass();
            String LIZ2 = C77117UOj.LIZ(str);
            synchronized (C5ML.class) {
                LIZ = this.LJIIL.LIZ(c47708Inw.LIZ, LIZ2);
            }
            if (LIZ != null && !LIZ.LIZJ) {
                c47708Inw.LIZIZ = LIZ.LIZ;
                C78253UnR.LJI("DataLoaderHelper", C16880lQ.LLLZ("[preload] get videoModel , videoId = %s", new Object[]{c47708Inw.LIZ}));
                LJFF(c47708Inw);
                return;
            }
            if (c47708Inw.LJI == null) {
                return;
            }
            C47804IpU c47804IpU = new C47804IpU(this.LJIIJJI);
            c47708Inw.LJFF = c47804IpU;
            c47804IpU.LJII = new C47715Io3(c47708Inw);
            C47804IpU c47804IpU2 = c47708Inw.LJFF;
            c47708Inw.LJI.getClass();
            c47804IpU2.LJIIIZ = null;
            C47804IpU c47804IpU3 = c47708Inw.LJFF;
            c47708Inw.LJI.getClass();
            c47804IpU3.LJIIL = null;
            C47804IpU c47804IpU4 = c47708Inw.LJFF;
            c47804IpU4.LJIILIIL = true;
            C47903Ir5.LIZ(c47804IpU4.LJIIJJI);
            C47804IpU c47804IpU5 = c47708Inw.LJFF;
            c47708Inw.LJI.getClass();
            c47708Inw.LJI.getClass();
            c47708Inw.LJI.getClass();
            c47804IpU5.LJII(0, LIZ2, str2, null);
            return;
        }
        throw null;
    }

    public final boolean LJIILL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("mdl://") || lowerCase.startsWith("http://127.0.0.1") || lowerCase.startsWith("http://localhost") || lowerCase.startsWith("file://") || lowerCase.startsWith("/") || C47878Iqg.LIZIZ(str)) {
            return false;
        }
        if ((this.LJJIJIL != 1 || !this.LJJIJL) && C47878Iqg.LIZ(str)) {
            return false;
        }
        return true;
    }

    public final void LJIILLIIL(C47396Iiu c47396Iiu) {
        this.LJJ.LIZJ(1);
        try {
            LIZIZ(c47396Iiu.LIZ, c47396Iiu.LIZJ, c47396Iiu.LJ, null, c47396Iiu);
        } finally {
            this.LJJ.LJ(1);
        }
    }

    public final void LJIIZILJ(C47398Iiw c47398Iiw) {
        EnumC47176IfM enumC47176IfM;
        String str;
        C47164IfA c47164IfA = c47398Iiw.LIZ;
        if (c47164IfA == null || (enumC47176IfM = c47398Iiw.LIZIZ) == null) {
            C78253UnR.LIZLLL("DataLoaderHelper", "[preload] addTask videoModel input invalid");
            c47398Iiw.LIZ();
            return;
        }
        C47160If6 LJIJJLI = c47164IfA.LJIJJLI(enumC47176IfM, c47398Iiw.LJFF, true);
        if (LJIJJLI != null) {
            str = LJIJJLI.LIZIZ(15);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            C78253UnR.LIZLLL("DataLoaderHelper", "[preload] key invalid.");
            c47398Iiw.LIZ();
            return;
        }
        String LJJI = c47398Iiw.LIZ.LJJI(2);
        if (TextUtils.isEmpty(LJJI)) {
            C78253UnR.LIZLLL("DataLoaderHelper", "[preload] videoId invalid.");
            c47398Iiw.LIZ();
        } else {
            this.LJJ.LIZJ(1);
            try {
                LIZIZ(str, LJJI, c47398Iiw.LIZJ, c47398Iiw, null);
            } finally {
                this.LJJ.LJ(1);
            }
        }
    }

    public final C47083Idr LJIJ(String str) {
        C47729IoH LJJII = LJJII(str);
        if (LJJII != null) {
            C47083Idr c47083Idr = new C47083Idr();
            c47083Idr.LIZ = LJJII.LIZ;
            c47083Idr.LIZIZ = LJJII.LIZIZ;
            return c47083Idr;
        }
        return null;
    }

    public final void LJIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.LJIIIZ == null || this.LIZJ != 0) {
            C78253UnR.LIZLLL("DataLoaderHelper", "need start mdl first");
            return;
        }
        this.LJJ.LIZJ(1);
        try {
            C47708Inw LJFF = this.LIZLLL.LJFF(str);
            if (LJFF != null) {
                LJII(LJFF);
            } else {
                C47708Inw LJFF2 = this.LJ.LJFF(str);
                if (LJFF2 != null) {
                    C47804IpU c47804IpU = LJFF2.LJFF;
                    if (c47804IpU != null) {
                        c47804IpU.LJI();
                    }
                    LJII(LJFF2);
                } else {
                    C47708Inw LJFF3 = this.LJFF.LJFF(str);
                    if (LJFF3 != null) {
                        this.LJIIIZ.cancel(str);
                        LJII(LJFF3);
                    }
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[preload] cancel preload task. key = ");
            LIZ.append(str);
            C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ));
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void LJJ(int i) {
        this.LJJ.LIZJ(1);
        if (this.LJIIJ.mLoaderType == i || i == 0) {
            return;
        }
        try {
            try {
                this.LJIIIZ.setIntValue(7227, i);
            } catch (Exception unused) {
                TTVideoEngineLog.d("DataLoaderHelper", "set backup loader type failed");
            }
        } finally {
            this.LJJ.LJ(1);
        }
    }

    public final void LJJIFFI(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LJJ.LIZJ(1);
        if (this.LJIIIZ == null) {
            C78253UnR.LIZLLL("DataLoaderHelper", "mInnerDataLoader == null");
            this.LJJ.LJ(1);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" force remove mdl file. key ");
        LIZ.append(str);
        C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ));
        this.LJIIIZ.forceRemoveFileCache(str);
        this.LJJ.LJ(1);
    }

    public final C47729IoH LJJII(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LJJ.LIZJ(1);
        try {
            if (this.LJIIIZ != null && this.LIZJ == 0) {
                return LJIIIZ(this.LJIIIZ.getStringCacheInfo(str));
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    public final long LJJIII(String str) {
        long j = 0;
        if (this.LIZJ != 0) {
            return 0L;
        }
        this.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader = this.LJIIIZ;
            if (aVMDLDataLoader != null) {
                long cacheSize = aVMDLDataLoader.getCacheSize(str);
                if (cacheSize > 0) {
                    j = cacheSize;
                }
            }
        } catch (Throwable unused) {
        }
        this.LJJ.LJ(1);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LJJIIJZLJL(int i) {
        int i2;
        this.LJJ.LIZJ(1);
        try {
            switch (i) {
                case 1:
                    i2 = this.LJIIJ.mMaxCacheSize;
                    break;
                case 7:
                    i2 = this.LJIIJ.mEnableExternDNS;
                    break;
                case 8:
                    i2 = this.LJIIJ.mEnableSocketReuse;
                    break;
                case 12:
                    i2 = this.LJJIL;
                    break;
                case 90:
                    i2 = this.LJIIJ.mDNSMainType;
                    break;
                case 100:
                    i2 = this.LJIIJ.mMaxTlsVersion;
                    break;
                case 101:
                    i2 = this.LJIIJ.mEnableSessionReuse;
                    break;
                case 103:
                    i2 = AVMDLDNSParser.getIntValue(4);
                    break;
                case 105:
                    i2 = AVMDLDNSParser.getIntValue(6);
                    break;
                case 114:
                    i2 = 0;
                    return i2;
                case 115:
                    i2 = this.LJJIIZI;
                    break;
                case 1001:
                    i2 = this.LJIIJ.mEnablePreconnect;
                    break;
                case 1008:
                    i2 = this.LJJIIJ;
                    break;
                case 1150:
                    i2 = this.LJIIJ.mEnableIOManager;
                    break;
                case 9009:
                    i2 = this.LJJIJL;
                    break;
                case 9016:
                    i2 = this.LJJJJLL;
                    break;
                case 9018:
                    i2 = this.LJJJLL;
                    break;
                case 9019:
                    i2 = this.LJJJLZIJ;
                    break;
                case 9021:
                    i2 = this.LJJJJZ;
                    break;
                default:
                    i2 = -1;
                    return i2;
            }
            return i2;
        } finally {
            this.LJJ.LJ(1);
        }
    }

    public final long LJJIIZ(int i) {
        this.LJJ.LIZJ(1);
        long j = -1;
        try {
            if (i != 1003) {
                if (i != 1152) {
                    if (i != 1153) {
                        return -1L;
                    }
                    j = this.LJIIJ.mMonitorMinAllowLoadSize;
                } else {
                    j = this.LJIIJ.mMonitorTimeInternal;
                }
            } else if (this.LJIL) {
                j = this.LJIJ;
            }
            return j;
        } finally {
            this.LJJ.LJ(1);
        }
    }

    public final String LJJIIZI(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.LJJ.LIZJ(1);
        try {
            try {
                AVMDLDataLoader aVMDLDataLoader = this.LJIIIZ;
                if (aVMDLDataLoader != null) {
                    str2 = aVMDLDataLoader.getStringValueByStr(str, 1010);
                }
            } catch (Exception e) {
                TTVideoEngineLog.d(e);
            }
            return str2;
        } finally {
            this.LJJ.LJ(1);
        }
    }

    public final String LJJIJ(int i) {
        String str;
        AVMDLDataLoader aVMDLDataLoader;
        this.LJJ.LIZJ(1);
        try {
            try {
            } catch (Exception e) {
                TTVideoEngineLog.d(e);
            }
            if (i != 0) {
                if (i != 6) {
                    if (i != 1509) {
                        if (i == 9010) {
                            str = this.LJIIJ.mSocketTraingCenterConfigStr;
                        }
                        this.LJJ.LJ(1);
                        return null;
                    }
                    str = this.LJIIJ.mCustomUA;
                } else {
                    if (this.LJIILIIL == null && (aVMDLDataLoader = this.LJIIIZ) != null) {
                        this.LJIILIIL = aVMDLDataLoader.getStringValue(11);
                    }
                    str = this.LJIILIIL;
                }
            } else {
                str = this.LJIIJ.mCacheDir;
            }
            return str;
        } finally {
            this.LJJ.LJ(1);
        }
    }

    public final synchronized void LJJIZ(C47570Ili c47570Ili) {
        this.LJIILL = c47570Ili;
    }

    public final boolean LJJJJ(String str) {
        boolean z = false;
        if (this.LIZJ != 0) {
            return false;
        }
        this.LJJ.LIZJ(1);
        try {
            if (this.LJIIIZ != null && !TextUtils.isEmpty(str)) {
                this.LJIIIZ.downloadResource(str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[downloader] start download resource = ");
                LIZ.append(str);
                C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ));
                z = true;
            }
        } catch (Throwable th) {
            try {
                TTVideoEngineLog.d(th);
            } catch (Throwable unused) {
            }
        }
        this.LJJ.LJ(1);
        return z;
    }

    public final long LJJJJI(String str) {
        long j = 0;
        if (this.LIZJ != 0) {
            return 0L;
        }
        this.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader = this.LJIIIZ;
            if (aVMDLDataLoader != null) {
                long tryQuickGetCacheSize = aVMDLDataLoader.tryQuickGetCacheSize(str);
                if (tryQuickGetCacheSize > 0) {
                    j = tryQuickGetCacheSize;
                }
            }
        } catch (Throwable unused) {
        }
        this.LJJ.LJ(1);
        return j;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getCheckSumInfo(String str) {
        String str2 = null;
        try {
            if (this.LIZ == null || TextUtils.isEmpty(str)) {
                return null;
            }
            str2 = this.LIZ.getCheckSumInfo(str);
            return str2;
        } catch (Exception e) {
            TTVideoEngineLog.d(e);
            return str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x0357, code lost:
    
        if (r1 == null) goto L155;
     */
    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNotify(com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r29) {
        /*
            Method dump skipped, instructions count: 2506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.onNotify(com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo):void");
    }

    public static void LJIIIIZZ(C47160If6 c47160If6, C47708Inw c47708Inw) {
        C47398Iiw c47398Iiw;
        String[] LJIIIZ = c47160If6.LJIIIZ();
        String LIZIZ = c47160If6.LIZIZ(15);
        C47714Io2 LIZIZ2 = c47708Inw.LIZIZ(LIZIZ);
        if (LJIIIZ == null || LJIIIZ.length < 1) {
            C78253UnR.LIZLLL("DataLoaderHelper", "[preload] url info, urls info invalid");
            c47708Inw.LIZ(-100001);
            return;
        }
        String[] strArr = (String[]) LJIIIZ.clone();
        if (c47708Inw.LJI == null && (c47398Iiw = c47708Inw.LJIIIZ) != null && c47398Iiw.LJ) {
            for (int i = 0; i < strArr.length; i++) {
                if (!TextUtils.isEmpty(strArr[i])) {
                    strArr[i] = C47756Ioi.LIZ(strArr[i]);
                }
            }
        }
        if (LIZIZ2 == null && (LIZIZ2 = c47708Inw.LIZIZ(LIZIZ)) == null) {
            c47708Inw.LIZ(-100001);
            return;
        }
        LIZIZ2.LIZ = LIZIZ;
        LIZIZ2.LJ = c47160If6;
        LIZIZ2.LIZLLL = c47160If6.LIZIZ(5);
        LIZIZ2.LIZJ = c47160If6.getResolution();
        LIZIZ2.LJFF = strArr;
        LIZIZ2.LJIIL = null;
        StringBuilder sb = new StringBuilder("fileId=");
        String LIZIZ3 = c47160If6.LIZIZ(28);
        String str = "";
        if (LIZIZ3 == null) {
            LIZIZ3 = "";
        }
        String LIZIZ4 = c47160If6.LIZIZ(29);
        if (LIZIZ4 != null) {
            str = LIZIZ4;
        }
        int LIZLLL = c47160If6.LIZLLL(44);
        sb.append(LIZIZ3);
        sb.append("&bitrate=");
        sb.append(LIZLLL);
        sb.append("&pcrc=");
        sb.append(C47756Ioi.LJ(str));
        sb.append("&tag=");
        sb.append(C47756Ioi.LJ(c47708Inw.LJIIL));
        if (!TextUtils.isEmpty(c47708Inw.LJIILIIL)) {
            sb.append("&stag=");
            sb.append(C47756Ioi.LJ(c47708Inw.LJIILIIL));
        }
        LIZIZ2.LJI = sb.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[preload] prepare url info. videoId = ");
        YE1.LIZLLL(LIZ, c47708Inw.LIZ, ", key is ", LIZIZ, ", resolution = ");
        LIZ.append(LIZIZ2.LIZJ.toString());
        TTVideoEngineLog.d("DataLoaderHelper", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC47535Il9
    public final void LIZ(Object obj, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
            str2 = jSONObject.toString();
        } catch (JSONException e) {
            TTVideoEngineLog.d(e);
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            TTVideoEngineLog.d("DataLoaderHelper", "onPortraitChange enginePortait: " + str2);
            this.LJIIIZ.setStringValue(7446, str2);
        }
    }

    public final void LIZLLL(C47069Idd c47069Idd, String str) {
        C46921IbF c46921IbF;
        InterfaceC47616ImS interfaceC47616ImS;
        List<C47160If6> LIZLLL;
        if (c47069Idd != null) {
            InterfaceC46923IbH interfaceC46923IbH = c47069Idd.LJFF;
            C47120IeS c47120IeS = null;
            if (interfaceC46923IbH != null) {
                c46921IbF = new C46921IbF(interfaceC46923IbH);
            } else {
                c46921IbF = null;
            }
            InterfaceC47122IeU interfaceC47122IeU = c47069Idd.LIZJ;
            if (interfaceC47122IeU != null) {
                c47120IeS = new C47120IeS(this, interfaceC47122IeU);
            }
            String LJIIIIZZ = c47069Idd.LIZLLL.LJIIIIZZ();
            if (c47069Idd.LJIIJ != -1 || c47069Idd.LJIIIZ != null || c47069Idd.LJIILJJIL.length() > 0 || c47069Idd.LJIILL.length() > 0) {
                String LIZ = c47069Idd.LIZ();
                if (!TextUtils.isEmpty(LIZ)) {
                    LJIIIIZZ = LIZ;
                }
            }
            if (this.LJJJJI == 1 && (interfaceC47616ImS = c47069Idd.LIZLLL) != null && (LIZLLL = interfaceC47616ImS.LIZLLL()) != null && !LIZLLL.isEmpty()) {
                Iterator<C47160If6> it = LIZLLL.iterator();
                while (it.hasNext()) {
                    for (String str2 : it.next().LJIIIZ()) {
                        if (!LJIILL(str2)) {
                            return;
                        }
                    }
                }
            }
            C47147Iet.LIZ.LJ().addMedia(LJIIIIZZ, c46921IbF, c47120IeS, str, c47069Idd.LJIIZILJ, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0 A[Catch: Exception -> 0x0264, TryCatch #0 {Exception -> 0x0264, blocks: (B:11:0x001b, B:14:0x0039, B:16:0x003d, B:18:0x0054, B:20:0x005c, B:23:0x0064, B:25:0x006c, B:27:0x0085, B:29:0x0098, B:32:0x00b0, B:35:0x00b6, B:37:0x00cb, B:39:0x00dc, B:45:0x00e1, B:46:0x0109, B:48:0x010f, B:49:0x0115, B:52:0x0121, B:55:0x012f, B:58:0x0145, B:61:0x014f, B:64:0x015e, B:66:0x0162, B:69:0x0178, B:71:0x018a, B:73:0x018e, B:74:0x0193, B:76:0x0199, B:77:0x01a2, B:81:0x01b4, B:83:0x01ba, B:86:0x01bf, B:88:0x01ca, B:90:0x01d9, B:91:0x01ef, B:94:0x021a, B:95:0x0240, B:97:0x0244, B:100:0x01d0, B:101:0x01a9, B:103:0x0140, B:104:0x011f, B:105:0x00e6, B:107:0x00ee, B:109:0x0105), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9 A[Catch: Exception -> 0x0264, TryCatch #0 {Exception -> 0x0264, blocks: (B:11:0x001b, B:14:0x0039, B:16:0x003d, B:18:0x0054, B:20:0x005c, B:23:0x0064, B:25:0x006c, B:27:0x0085, B:29:0x0098, B:32:0x00b0, B:35:0x00b6, B:37:0x00cb, B:39:0x00dc, B:45:0x00e1, B:46:0x0109, B:48:0x010f, B:49:0x0115, B:52:0x0121, B:55:0x012f, B:58:0x0145, B:61:0x014f, B:64:0x015e, B:66:0x0162, B:69:0x0178, B:71:0x018a, B:73:0x018e, B:74:0x0193, B:76:0x0199, B:77:0x01a2, B:81:0x01b4, B:83:0x01ba, B:86:0x01bf, B:88:0x01ca, B:90:0x01d9, B:91:0x01ef, B:94:0x021a, B:95:0x0240, B:97:0x0244, B:100:0x01d0, B:101:0x01a9, B:103:0x0140, B:104:0x011f, B:105:0x00e6, B:107:0x00ee, B:109:0x0105), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e A[Catch: Exception -> 0x0264, TryCatch #0 {Exception -> 0x0264, blocks: (B:11:0x001b, B:14:0x0039, B:16:0x003d, B:18:0x0054, B:20:0x005c, B:23:0x0064, B:25:0x006c, B:27:0x0085, B:29:0x0098, B:32:0x00b0, B:35:0x00b6, B:37:0x00cb, B:39:0x00dc, B:45:0x00e1, B:46:0x0109, B:48:0x010f, B:49:0x0115, B:52:0x0121, B:55:0x012f, B:58:0x0145, B:61:0x014f, B:64:0x015e, B:66:0x0162, B:69:0x0178, B:71:0x018a, B:73:0x018e, B:74:0x0193, B:76:0x0199, B:77:0x01a2, B:81:0x01b4, B:83:0x01ba, B:86:0x01bf, B:88:0x01ca, B:90:0x01d9, B:91:0x01ef, B:94:0x021a, B:95:0x0240, B:97:0x0244, B:100:0x01d0, B:101:0x01a9, B:103:0x0140, B:104:0x011f, B:105:0x00e6, B:107:0x00ee, B:109:0x0105), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0199 A[Catch: Exception -> 0x0264, TryCatch #0 {Exception -> 0x0264, blocks: (B:11:0x001b, B:14:0x0039, B:16:0x003d, B:18:0x0054, B:20:0x005c, B:23:0x0064, B:25:0x006c, B:27:0x0085, B:29:0x0098, B:32:0x00b0, B:35:0x00b6, B:37:0x00cb, B:39:0x00dc, B:45:0x00e1, B:46:0x0109, B:48:0x010f, B:49:0x0115, B:52:0x0121, B:55:0x012f, B:58:0x0145, B:61:0x014f, B:64:0x015e, B:66:0x0162, B:69:0x0178, B:71:0x018a, B:73:0x018e, B:74:0x0193, B:76:0x0199, B:77:0x01a2, B:81:0x01b4, B:83:0x01ba, B:86:0x01bf, B:88:0x01ca, B:90:0x01d9, B:91:0x01ef, B:94:0x021a, B:95:0x0240, B:97:0x0244, B:100:0x01d0, B:101:0x01a9, B:103:0x0140, B:104:0x011f, B:105:0x00e6, B:107:0x00ee, B:109:0x0105), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ca A[Catch: Exception -> 0x0264, TryCatch #0 {Exception -> 0x0264, blocks: (B:11:0x001b, B:14:0x0039, B:16:0x003d, B:18:0x0054, B:20:0x005c, B:23:0x0064, B:25:0x006c, B:27:0x0085, B:29:0x0098, B:32:0x00b0, B:35:0x00b6, B:37:0x00cb, B:39:0x00dc, B:45:0x00e1, B:46:0x0109, B:48:0x010f, B:49:0x0115, B:52:0x0121, B:55:0x012f, B:58:0x0145, B:61:0x014f, B:64:0x015e, B:66:0x0162, B:69:0x0178, B:71:0x018a, B:73:0x018e, B:74:0x0193, B:76:0x0199, B:77:0x01a2, B:81:0x01b4, B:83:0x01ba, B:86:0x01bf, B:88:0x01ca, B:90:0x01d9, B:91:0x01ef, B:94:0x021a, B:95:0x0240, B:97:0x0244, B:100:0x01d0, B:101:0x01a9, B:103:0x0140, B:104:0x011f, B:105:0x00e6, B:107:0x00ee, B:109:0x0105), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9 A[Catch: Exception -> 0x0264, TryCatch #0 {Exception -> 0x0264, blocks: (B:11:0x001b, B:14:0x0039, B:16:0x003d, B:18:0x0054, B:20:0x005c, B:23:0x0064, B:25:0x006c, B:27:0x0085, B:29:0x0098, B:32:0x00b0, B:35:0x00b6, B:37:0x00cb, B:39:0x00dc, B:45:0x00e1, B:46:0x0109, B:48:0x010f, B:49:0x0115, B:52:0x0121, B:55:0x012f, B:58:0x0145, B:61:0x014f, B:64:0x015e, B:66:0x0162, B:69:0x0178, B:71:0x018a, B:73:0x018e, B:74:0x0193, B:76:0x0199, B:77:0x01a2, B:81:0x01b4, B:83:0x01ba, B:86:0x01bf, B:88:0x01ca, B:90:0x01d9, B:91:0x01ef, B:94:0x021a, B:95:0x0240, B:97:0x0244, B:100:0x01d0, B:101:0x01a9, B:103:0x0140, B:104:0x011f, B:105:0x00e6, B:107:0x00ee, B:109:0x0105), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0244 A[Catch: Exception -> 0x0264, TRY_LEAVE, TryCatch #0 {Exception -> 0x0264, blocks: (B:11:0x001b, B:14:0x0039, B:16:0x003d, B:18:0x0054, B:20:0x005c, B:23:0x0064, B:25:0x006c, B:27:0x0085, B:29:0x0098, B:32:0x00b0, B:35:0x00b6, B:37:0x00cb, B:39:0x00dc, B:45:0x00e1, B:46:0x0109, B:48:0x010f, B:49:0x0115, B:52:0x0121, B:55:0x012f, B:58:0x0145, B:61:0x014f, B:64:0x015e, B:66:0x0162, B:69:0x0178, B:71:0x018a, B:73:0x018e, B:74:0x0193, B:76:0x0199, B:77:0x01a2, B:81:0x01b4, B:83:0x01ba, B:86:0x01bf, B:88:0x01ca, B:90:0x01d9, B:91:0x01ef, B:94:0x021a, B:95:0x0240, B:97:0x0244, B:100:0x01d0, B:101:0x01a9, B:103:0x0140, B:104:0x011f, B:105:0x00e6, B:107:0x00ee, B:109:0x0105), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.LJIIJ(com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo, boolean):void");
    }

    public final void LJIILJJIL(C47708Inw c47708Inw, C47714Io2 c47714Io2) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[preload] start mdl preload task.  key = ");
        JBR.LJIIIZ(LIZ, c47714Io2.LIZ, LIZ, "DataLoaderHelper");
        String str = c47714Io2.LJIILIIL;
        String str2 = c47714Io2.LIZ;
        C47396Iiu c47396Iiu = c47708Inw.LJIIJ;
        if (c47396Iiu != null && c47396Iiu.LJII != null) {
            String LJJIL = LJJIL(c47708Inw.LIZLLL, str2, c47708Inw.LIZ, c47708Inw.LJIIIIZZ);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(LJJIL);
            stringBuffer.append("&header_size=");
            stringBuffer.append(c47714Io2.LJII);
            stringBuffer.append("&timestamp=0");
            c47708Inw.LJIIJ.getClass();
            String stringBuffer2 = stringBuffer.toString();
            c47714Io2.LIZIZ = stringBuffer2;
            if (!TextUtils.isEmpty(stringBuffer2)) {
                this.LJFF.LJFF(str2);
                this.LJFF.LIZJ(c47708Inw);
                long j = c47714Io2.LJIIIIZZ;
                if (j > 0 && j < c47714Io2.LJII + 102400) {
                    c47714Io2.LJIIIZ += j;
                    c47714Io2.LJIIIIZZ = 0L;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[preload] preload offset ");
                LIZ2.append(c47714Io2.LJIIIIZZ);
                LIZ2.append(" header size = ");
                LIZ2.append(c47714Io2.LJII);
                LIZ2.append(" preload size = ");
                LIZ2.append(c47714Io2.LJIIIZ);
                C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ2));
                if (c47714Io2.LJIIIIZZ > 0) {
                    long j2 = c47714Io2.LJII;
                    if (j2 > 0) {
                        this.LJIIIZ.preloadResource(c47714Io2.LIZIZ, (int) j2);
                    }
                    this.LJIIIZ.preloadResource(c47714Io2.LIZIZ, (int) c47714Io2.LJIIIIZZ, (int) c47714Io2.LJIIIZ);
                } else {
                    this.LJIIIZ.preloadResource(c47714Io2.LIZIZ, (int) c47714Io2.LJIIIZ);
                }
            } else {
                c47708Inw.LIZ(-100001);
            }
            C78253UnR.LJI("DataLoaderHelper", C16880lQ.LLLZ("[preload] exect preload task by provider mode, key is %s; videoId = %s proxyurl:%s", new Object[]{str2, c47708Inw.LIZ, c47714Io2.LIZIZ}));
            return;
        }
        String[] strArr = c47714Io2.LJFF;
        if (strArr != null) {
            C47164IfA c47164IfA = c47708Inw.LIZIZ;
            if (c47164IfA != null) {
                z = c47164IfA.LJFF(EnumC47157If3.HLS);
            } else {
                z = false;
            }
            if (strArr.length > 0 && !TextUtils.isEmpty(strArr[0]) && C47878Iqg.LIZ(strArr[0])) {
                z = true;
            }
            if (c47708Inw.LJIIL != null) {
                if (c47714Io2.LJI == null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("tag=");
                    LIZ3.append(C47756Ioi.LJ(c47708Inw.LJIIL));
                    c47714Io2.LJI = X1D.LIZIZ(LIZ3);
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(c47714Io2.LJI);
                    LIZ4.append("&tag=");
                    LIZ4.append(C47756Ioi.LJ(c47708Inw.LJIIL));
                    c47714Io2.LJI = X1D.LIZIZ(LIZ4);
                }
            }
            if (c47708Inw.LJIILIIL != null) {
                if (c47714Io2.LJI == null) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("stag=");
                    LIZ5.append(C47756Ioi.LJ(c47708Inw.LJIILIIL));
                    c47714Io2.LJI = X1D.LIZIZ(LIZ5);
                } else {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append(c47714Io2.LJI);
                    LIZ6.append("&stag=");
                    LIZ6.append(C47756Ioi.LJ(c47708Inw.LJIILIIL));
                    c47714Io2.LJI = X1D.LIZIZ(LIZ6);
                }
            }
            String LJJIJL = LJJIJL(str2, c47708Inw.LIZ, c47714Io2.LJIIIIZZ, 0L, strArr, c47714Io2.LJIIL, c47714Io2.LJI, c47708Inw.LIZLLL, str, z, null, 0, c47708Inw.LJIIIIZZ, c47708Inw.LJIILJJIL);
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(LJJIJL);
            stringBuffer3.append("&header_size=");
            stringBuffer3.append(c47714Io2.LJII);
            if (c47708Inw.LJIIIZ != null) {
                stringBuffer3.append("&timestamp=0");
                c47708Inw.LJIIIZ.getClass();
            }
            String stringBuffer4 = stringBuffer3.toString();
            c47714Io2.LIZIZ = stringBuffer4;
            if (!TextUtils.isEmpty(stringBuffer4)) {
                this.LJFF.LJFF(str2);
                this.LJFF.LIZJ(c47708Inw);
                long j3 = c47714Io2.LJIIIIZZ;
                if (j3 > 0 && j3 < c47714Io2.LJII + 102400) {
                    c47714Io2.LJIIIZ += j3;
                    c47714Io2.LJIIIIZZ = 0L;
                }
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("[preload] preload offset ");
                LIZ7.append(c47714Io2.LJIIIIZZ);
                LIZ7.append(" header size = ");
                LIZ7.append(c47714Io2.LJII);
                LIZ7.append(" preload size = ");
                LIZ7.append(c47714Io2.LJIIIZ);
                C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ7));
                if (c47714Io2.LJIIIIZZ > 0) {
                    long j4 = c47714Io2.LJII;
                    if (j4 > 0) {
                        this.LJIIIZ.preloadResource(c47714Io2.LIZIZ, (int) j4);
                    }
                    this.LJIIIZ.preloadResource(c47714Io2.LIZIZ, (int) c47714Io2.LJIIIIZZ, (int) c47714Io2.LJIIIZ);
                } else {
                    this.LJIIIZ.preloadResource(c47714Io2.LIZIZ, (int) c47714Io2.LJIIIZ);
                }
                C78253UnR.LJI("DataLoaderHelper", C16880lQ.LLLZ("[preload] exect preload task ,key is %s; videoId = %s", new Object[]{c47714Io2.LIZ, c47708Inw.LIZ}));
                return;
            }
            c47708Inw.LIZ(-100001);
            return;
        }
        c47708Inw.LIZ(-100001);
    }

    public final void LJJJ(int i, int i2) {
        this.LJJ.LIZJ(1);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setIntValue key = ");
        LIZ.append(i);
        LIZ.append(", value = ");
        C47956Irw.LIZIZ(LIZ, i2, LIZ, "DataLoaderHelper");
        try {
            try {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 7) {
                                        if (i != 8) {
                                            if (i != 9) {
                                                if (i != 55) {
                                                    if (i != 56) {
                                                        if (i != 60) {
                                                            if (i != 61) {
                                                                if (i != 100) {
                                                                    if (i != 101) {
                                                                        switch (i) {
                                                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                                                this.LJIIJ.mPreloadParallelNum = i2;
                                                                                AVMDLDataLoader aVMDLDataLoader = this.LJIIIZ;
                                                                                if (aVMDLDataLoader != null) {
                                                                                    aVMDLDataLoader.setIntValue(102, i2);
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 12:
                                                                                if (i2 >= 100) {
                                                                                    AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure = this.LJIIJ;
                                                                                    this.LJJIZ = aVMDLDataLoaderConfigure.mPreloadStrategy;
                                                                                    aVMDLDataLoaderConfigure.mPreloadStrategy = 100;
                                                                                } else {
                                                                                    AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure2 = this.LJIIJ;
                                                                                    this.LJJIZ = aVMDLDataLoaderConfigure2.mPreloadStrategy;
                                                                                    aVMDLDataLoaderConfigure2.mPreloadStrategy = i2;
                                                                                }
                                                                                this.LJJIL = i2;
                                                                                if (i2 == 200) {
                                                                                    this.LJIIJ.mEnableIOManager = 1;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                                                                this.LJIIJ.mCheckSumLevel = i2;
                                                                                break;
                                                                            case 14:
                                                                                this.LJIIJ.mTestSpeedTypeVersion = i2;
                                                                                break;
                                                                            case 15:
                                                                                this.LJIILLIIL = i2;
                                                                                break;
                                                                            default:
                                                                                if (i != 112) {
                                                                                    if (i != 113) {
                                                                                        switch (i) {
                                                                                            case 17:
                                                                                                StringBuilder LIZ2 = X1D.LIZ();
                                                                                                LIZ2.append("set write file notify intervalMS ");
                                                                                                LIZ2.append(i2);
                                                                                                C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ2));
                                                                                                this.LJIIJ.mWriteFileNotifyIntervalMS = i2;
                                                                                                break;
                                                                                            case 18:
                                                                                            case 19:
                                                                                            case 20:
                                                                                            case 1155:
                                                                                            case 2037:
                                                                                            case 9000:
                                                                                            case 12002:
                                                                                                break;
                                                                                            case 21:
                                                                                                this.LJIIJ.mEnableDownloaderLog = i2;
                                                                                                break;
                                                                                            case 22:
                                                                                                this.LJIIJ.mEnableTTNetLoader = i2;
                                                                                                break;
                                                                                            case 23:
                                                                                                this.LJIIJ.mTTNetLoaderCronetBufSizeKB = i2;
                                                                                                break;
                                                                                            case 24:
                                                                                                this.LJIIJ.mEnableTTQuicHeLoader = i2;
                                                                                                break;
                                                                                            case 25:
                                                                                                this.LJIIJ.mEnableTTQuicHeLoaderCheckWithNetworkType = i2;
                                                                                                break;
                                                                                            case 50:
                                                                                                this.LJIIJ.mIsCloseFileCache = i2;
                                                                                                break;
                                                                                            case 80:
                                                                                                this.LJIIJ.mPreloadWaitListType = i2;
                                                                                                break;
                                                                                            case 119:
                                                                                                C47735IoN.LJFF().LJIIIIZZ(i2);
                                                                                                break;
                                                                                            case 121:
                                                                                                this.LJIIJ.mUseNewSpeedTestForSingle = i2;
                                                                                                break;
                                                                                            case 123:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mDeviceScoreEx = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 200:
                                                                                                this.LJIIJ.mEnableEventInfo = i2;
                                                                                                break;
                                                                                            case 1115:
                                                                                                this.LJIIJ.mMaxIPV6Num = i2;
                                                                                                break;
                                                                                            case 1116:
                                                                                                this.LJIIJ.mMaxIPV4Num = i2;
                                                                                                break;
                                                                                            case 1117:
                                                                                                this.LJIIJ.mForbidByPassCookie = i2;
                                                                                                break;
                                                                                            case 1118:
                                                                                                this.LJIIJ.mEnableLazyBufferpool = i2;
                                                                                                break;
                                                                                            case 1119:
                                                                                                this.LJIIJ.mSessionTimeout = i2;
                                                                                                break;
                                                                                            case 1120:
                                                                                                this.LJIIJ.mEnableNewBufferpool = i2;
                                                                                                break;
                                                                                            case 1121:
                                                                                                this.LJIIJ.mNewBufferPoolBlockSize = i2;
                                                                                                break;
                                                                                            case 1122:
                                                                                                this.LJIIJ.mNewBufferPoolResidentSize = i2;
                                                                                                break;
                                                                                            case 1123:
                                                                                                this.LJIIJ.mNewBufferPoolGrowBlockCount = i2;
                                                                                                break;
                                                                                            case 1124:
                                                                                                this.LJIIJ.mEnablePlayInfoCache = i2;
                                                                                                break;
                                                                                            case 1125:
                                                                                                this.LJIIJ.mControlCDNRangeType = i2;
                                                                                                break;
                                                                                            case 1126:
                                                                                                this.LJIIJ.mEnableP2PPreDown = i2;
                                                                                                break;
                                                                                            case 1127:
                                                                                                this.LJIIJ.mEnablePlayLog = i2;
                                                                                                break;
                                                                                            case 1128:
                                                                                                this.LJIIJ.mEnableNetScheduler = i2;
                                                                                                break;
                                                                                            case 1129:
                                                                                                this.LJIIJ.mNetSchedulerBlockAllNetErr = i2;
                                                                                                break;
                                                                                            case 1130:
                                                                                                this.LJIIJ.mNetSchedulerBlockErrCount = i2;
                                                                                                break;
                                                                                            case 1131:
                                                                                                this.LJIIJ.mNetSChedulerBlockDurationMs = i2;
                                                                                                break;
                                                                                            case 1132:
                                                                                                this.LJIIJ.mFirstRangeLeftThreshold = i2;
                                                                                                break;
                                                                                            case 1133:
                                                                                                this.LJIIJ.mIsAllowTryTheLastUrl = i2;
                                                                                                break;
                                                                                            case 1134:
                                                                                                this.LJIIJ.mEnableCacheReqRange = i2;
                                                                                                break;
                                                                                            case 1135:
                                                                                                this.LJIIJ.mEnableLoaderSeek = i2;
                                                                                                break;
                                                                                            case 1136:
                                                                                                this.LJIIJ.mP2PPreDownPeerCount = i2;
                                                                                                break;
                                                                                            case 1137:
                                                                                                this.LJIIJ.mEnableDynamicTimeout = i2;
                                                                                                break;
                                                                                            case 1138:
                                                                                                this.LJIIJ.mSocketInitialTimeout = i2;
                                                                                                break;
                                                                                            case 1139:
                                                                                                this.LJIIJ.mMaxSocketReuseCount = i2;
                                                                                                break;
                                                                                            case 1140:
                                                                                                AVMDLDNSParser.setIntValue(10, i2);
                                                                                                break;
                                                                                            case 1141:
                                                                                                AVMDLDNSParser.setIntValue(2, i2);
                                                                                                break;
                                                                                            case 1143:
                                                                                                this.LJIIJ.mP2PFirstRangeLoaderType = i2;
                                                                                                break;
                                                                                            case 1145:
                                                                                                this.LJIIJ.mMaxAliveHostNum = i2;
                                                                                                break;
                                                                                            case 1146:
                                                                                                this.LJIIJ.mFileExtendSizeKB = i2;
                                                                                                break;
                                                                                            case 1147:
                                                                                                this.LJIIJ.mMinAllowSpeed = i2;
                                                                                                break;
                                                                                            case 1148:
                                                                                                this.LJIIJ.mNetSchedulerBlockHostIpErrCount = i2;
                                                                                                break;
                                                                                            case 1150:
                                                                                                this.LJIIJ.mEnableIOManager = i2;
                                                                                                break;
                                                                                            case 1151:
                                                                                                this.LJIIJ.mEnableOwnVDPPreloadNotify = i2;
                                                                                                break;
                                                                                            case 1154:
                                                                                                this.LJJJ = i2;
                                                                                                break;
                                                                                            case 1156:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJJJJL.LIZ = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 1157:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJJJJL.LIZIZ = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 1158:
                                                                                                this.LJIIJ.mMaxFileMemCacheSize = i2;
                                                                                                break;
                                                                                            case 1159:
                                                                                                this.LJIIJ.mMaxFileMemCacheNum = i2;
                                                                                                break;
                                                                                            case 1160:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIJ.mEnableEarlyData = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 1161:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mSocketRecvBufferSize = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 1162:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mEnableSpeedPredict = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 1163:
                                                                                                this.LJJJI = i2;
                                                                                                break;
                                                                                            case 1164:
                                                                                                this.LJIIJ.mEnableUseOriginalUrl = i2;
                                                                                                break;
                                                                                            case 1166:
                                                                                                this.LJIIJ.mEnableLoaderLogExtractUrls = i2;
                                                                                                break;
                                                                                            case 1167:
                                                                                                this.LJIIJ.mMaxLoaderLogNum = i2;
                                                                                                break;
                                                                                            case 1168:
                                                                                                this.LJIIJ.mCheckContentTypeMethod = i2;
                                                                                                break;
                                                                                            case 1169:
                                                                                                this.LJIIJ.mCloseThreadPool = i2;
                                                                                                break;
                                                                                            case 1170:
                                                                                                this.LJJJIL = i2;
                                                                                                break;
                                                                                            case 1171:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mEnableSpeedEngine = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 1172:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mEnableSpeedReport = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 1501:
                                                                                                this.LJIIJ.mEnableCellularUp = i2;
                                                                                                break;
                                                                                            case 1503:
                                                                                                this.LJJJJIZL = i2;
                                                                                                break;
                                                                                            case 1504:
                                                                                                this.LJJJJJ = i2;
                                                                                                break;
                                                                                            case 1505:
                                                                                                this.LJJJJ = i2;
                                                                                                break;
                                                                                            case 1513:
                                                                                                this.LJJJJI = i2;
                                                                                                break;
                                                                                            case 1514:
                                                                                                this.LJIIJ.mGetCookieTokenLevel = i2;
                                                                                                break;
                                                                                            case 1701:
                                                                                                this.LJIIJ.mEnableByteMediaNetLoader = i2;
                                                                                                break;
                                                                                            case LiveNetAdaptiveHurryTimeSetting.DEFAULT /* 2000 */:
                                                                                                this.LJIIJ.mEnableStorageModule = i2;
                                                                                                break;
                                                                                            case 2001:
                                                                                                this.LJIIJ.mStoPlayDldWinSizeKBNM = i2;
                                                                                                break;
                                                                                            case 2002:
                                                                                                this.LJIIJ.mStoPlayDldWinSizeKBLS = i2;
                                                                                                break;
                                                                                            case 2003:
                                                                                                this.LJIIJ.mStoRingBufferSizeKB = i2;
                                                                                                break;
                                                                                            case 2004:
                                                                                                this.LJIIJ.mStoIoWriteLimitKBTh1 = i2;
                                                                                                break;
                                                                                            case 2005:
                                                                                                this.LJIIJ.mStoIoWriteLimitKBTh2 = i2;
                                                                                                break;
                                                                                            case 2006:
                                                                                                this.LJIIJ.mStoMaxIdleTimeSec = i2;
                                                                                                break;
                                                                                            case 2008:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIJ.mThreadStackSizeLevel = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2009:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mThreadPoolMinCount = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2010:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mEnableThreadPoolCheckIdle = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2011:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mThreadPoolTTLSecond = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2012:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mMaxIpNum = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2013:
                                                                                                this.LJIIJ.mNonBlockRangeMode = i2;
                                                                                                break;
                                                                                            case 2014:
                                                                                                this.LJIIJ.mNonBlockRangeMaxSizeKB = i2;
                                                                                                break;
                                                                                            case 2015:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIJ.mNetUnreachableStopRetry = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2016:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIJ.mEnableWaitNetReachable = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2017:
                                                                                                this.LJIIJ.mEnableFileMutexOptimize = i2;
                                                                                                break;
                                                                                            case 2018:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mSkipCDNBeforeExpiredSec = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2019:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mNetUnreachableTimeout = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2020:
                                                                                            case 2021:
                                                                                                if (i2 >= 1 && i2 <= 32) {
                                                                                                    if (!TextUtils.isEmpty(this.LJIIJ.mP2PCostTag)) {
                                                                                                        StringBuilder LIZ3 = X1D.LIZ();
                                                                                                        AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure3 = this.LJIIJ;
                                                                                                        LIZ3.append(aVMDLDataLoaderConfigure3.mP2PCostTag);
                                                                                                        LIZ3.append(',');
                                                                                                        LIZ3.append(Integer.toString(i2));
                                                                                                        aVMDLDataLoaderConfigure3.mP2PCostTag = X1D.LIZIZ(LIZ3);
                                                                                                    } else {
                                                                                                        this.LJIIJ.mP2PCostTag = Integer.toString(i2);
                                                                                                    }
                                                                                                    StringBuilder LIZ4 = X1D.LIZ();
                                                                                                    LIZ4.append("cur p2p cost tag is: ");
                                                                                                    LIZ4.append(this.LJIIJ.mP2PCostTag);
                                                                                                    TTVideoEngineLog.d("DataLoaderHelper", X1D.LIZIZ(LIZ4));
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2022:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mIgnoreTextSpeedTest = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2023:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mEnableOptimizeRange = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2024:
                                                                                                if (i2 > 0) {
                                                                                                    this.LJIIJ.mDownLogMaxSize = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2025:
                                                                                                this.LJIIJ.mCheckCacheDir = i2;
                                                                                                break;
                                                                                            case 2026:
                                                                                                this.LJIIJ.mEnableUseGroupId = i2;
                                                                                                break;
                                                                                            case 2027:
                                                                                                this.LJIIJ.mDisableRecentCache = i2;
                                                                                                break;
                                                                                            case 2028:
                                                                                                this.LJIIJ.mUpdateCacheFileInternal = i2;
                                                                                                break;
                                                                                            case 2031:
                                                                                                this.LJIIJ.mEnableMissReason = i2;
                                                                                                break;
                                                                                            case 2032:
                                                                                                this.LJIIJ.mPreloadInfoRecordMaxCnt = i2;
                                                                                                break;
                                                                                            case 2033:
                                                                                                this.LJIIJ.mEnableTraceIdPreloadLog = i2;
                                                                                                break;
                                                                                            case 2034:
                                                                                                this.LJIIJ.mSessionCacheInterval = i2;
                                                                                                break;
                                                                                            case 2035:
                                                                                                this.LJIIJ.mFileManagerInterval = i2;
                                                                                                break;
                                                                                            case 2036:
                                                                                                this.LJIIJ.mEnableEnginePortrait = i2;
                                                                                                break;
                                                                                            case 2100:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIJ.mEnableP2pUpload = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2102:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIJ.mDevDiskSizeMB = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 2104:
                                                                                                if (i2 >= 0) {
                                                                                                    this.LJIIJ.mDevMemorySizeMB = i2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 9001:
                                                                                                this.LJIIJ.mIgnorePlayInfo = i2;
                                                                                                break;
                                                                                            case 9008:
                                                                                                this.LJJIJIL = i2;
                                                                                                break;
                                                                                            case 9013:
                                                                                                this.LJJJJLI = i2;
                                                                                                break;
                                                                                            case 9014:
                                                                                                if (i2 == 1 || i2 == 0) {
                                                                                                    this.LJIIJ.mEnableMultiDownloadPath = i2;
                                                                                                    break;
                                                                                                }
                                                                                            case 9016:
                                                                                                this.LJJJJLL = i2;
                                                                                                break;
                                                                                            case 9017:
                                                                                                this.LJJJLIIL = i2;
                                                                                                break;
                                                                                            case 9018:
                                                                                                this.LJJJLL = i2;
                                                                                                break;
                                                                                            case 9019:
                                                                                                this.LJJJLZIJ = i2;
                                                                                                break;
                                                                                            case 9021:
                                                                                                this.LJJJJZ = i2;
                                                                                                break;
                                                                                            case 9030:
                                                                                                this.LJJJJZI = i2;
                                                                                                break;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case 103:
                                                                                                        AVMDLDNSParser.setIntValue(4, i2);
                                                                                                        break;
                                                                                                    case 104:
                                                                                                        AVMDLDNSParser.setIntValue(5, i2);
                                                                                                        break;
                                                                                                    case 105:
                                                                                                        AVMDLDNSParser.setIntValue(6, i2);
                                                                                                        break;
                                                                                                    case 106:
                                                                                                        AVMDLDNSParser.setIntValue(7, i2);
                                                                                                        break;
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case LiveMaxRetainAlogMessageSizeSetting.DEFAULT /* 500 */:
                                                                                                                this.LJIIJ.mLiveP2pAllow = i2;
                                                                                                                break;
                                                                                                            case 501:
                                                                                                                this.LJIIJ.mLiveLoaderType = i2;
                                                                                                                break;
                                                                                                            case 502:
                                                                                                                this.LJIIJ.mLiveLoaderEnable = i2;
                                                                                                                break;
                                                                                                            default:
                                                                                                                switch (i) {
                                                                                                                    case 505:
                                                                                                                        this.LJIIJ.mLiveWatchDurationThreshold = i2;
                                                                                                                        break;
                                                                                                                    case 506:
                                                                                                                        this.LJIIJ.mLiveCacheThresholdHttpToP2p = i2;
                                                                                                                        break;
                                                                                                                    case 507:
                                                                                                                        this.LJIIJ.mLiveCacheThresholdP2pToHttp = i2;
                                                                                                                        break;
                                                                                                                    case 508:
                                                                                                                        this.LJIIJ.mLiveMaxTrySwitchP2pTimes = i2;
                                                                                                                        break;
                                                                                                                    case 509:
                                                                                                                        this.LJIIJ.mLiveWaitP2pReadyThreshold = i2;
                                                                                                                        break;
                                                                                                                    case 510:
                                                                                                                        this.LJIIJ.mLiveMobileUploadAllow = i2;
                                                                                                                        break;
                                                                                                                    case 511:
                                                                                                                        this.LJIIJ.mLiveMobileDownloadAllow = i2;
                                                                                                                        break;
                                                                                                                    case 512:
                                                                                                                        this.LJIIJ.mAlogEnable = i2;
                                                                                                                        AVMDLDataLoader aVMDLDataLoader2 = this.LJIIIZ;
                                                                                                                        if (aVMDLDataLoader2 != null) {
                                                                                                                            aVMDLDataLoader2.setIntValue(7225, i2);
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 513:
                                                                                                                        this.LJIIJ.mLiveRecvDataTimeout = i2;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        switch (i) {
                                                                                                                            case 1000:
                                                                                                                                if (this.LJJIFFI == 1) {
                                                                                                                                    this.LJJ.LIZJ(1);
                                                                                                                                    try {
                                                                                                                                        AVMDLDataLoader aVMDLDataLoader3 = this.LJIIIZ;
                                                                                                                                        if (aVMDLDataLoader3 != null) {
                                                                                                                                            aVMDLDataLoader3.clearNetinfoCache();
                                                                                                                                        }
                                                                                                                                    } catch (Throwable unused) {
                                                                                                                                    }
                                                                                                                                    this.LJJ.LJ(1);
                                                                                                                                    AVMDLDataLoader aVMDLDataLoader4 = this.LJIIIZ;
                                                                                                                                    if (aVMDLDataLoader4 != null) {
                                                                                                                                        aVMDLDataLoader4.setIntValue(7217, 1);
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1001:
                                                                                                                                this.LJIIJ.mEnablePreconnect = i2;
                                                                                                                                break;
                                                                                                                            case 1002:
                                                                                                                                this.LJIIJ.mPreconnectNum = i2;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                boolean z = false;
                                                                                                                                switch (i) {
                                                                                                                                    case 1004:
                                                                                                                                        if (i2 != 0) {
                                                                                                                                            z = true;
                                                                                                                                        }
                                                                                                                                        this.LJIJJ = z;
                                                                                                                                        StringBuilder LIZ5 = X1D.LIZ();
                                                                                                                                        LIZ5.append("setIntValue: mInvalidMdlProcotol: ");
                                                                                                                                        LIZ5.append(this.LJIJJ);
                                                                                                                                        C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ5));
                                                                                                                                        break;
                                                                                                                                    case 1005:
                                                                                                                                        if (i2 == 1) {
                                                                                                                                            z = true;
                                                                                                                                        }
                                                                                                                                        this.LJIL = z;
                                                                                                                                        if (this.LJJIJIIJI) {
                                                                                                                                            this.LJIL = true;
                                                                                                                                        }
                                                                                                                                        StringBuilder LIZ6 = X1D.LIZ();
                                                                                                                                        LIZ6.append("config DATALOADER_KEY_SET_MDL_PROTOCOL_ENABLE: ");
                                                                                                                                        LIZ6.append(this.LJIL);
                                                                                                                                        C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ6));
                                                                                                                                        break;
                                                                                                                                    case 1006:
                                                                                                                                        this.LJIIJ.mRingBufferSizeKB = i2;
                                                                                                                                        break;
                                                                                                                                    case 1007:
                                                                                                                                        this.LJIIJ.mEnableFileCacheV2 = i2;
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        switch (i) {
                                                                                                                                            case 1009:
                                                                                                                                                this.LJIIJ.mEnableFileRingBuffer = i2;
                                                                                                                                                break;
                                                                                                                                            case 1010:
                                                                                                                                                this.LJIIJ.mEnableUseFileExtendLoaderBuffer = i2;
                                                                                                                                                break;
                                                                                                                                            case 1011:
                                                                                                                                                this.LJJIFFI = i2;
                                                                                                                                                break;
                                                                                                                                            case 1012:
                                                                                                                                                this.LJJIJ = i2;
                                                                                                                                                break;
                                                                                                                                            case 1013:
                                                                                                                                                if (i2 == 1) {
                                                                                                                                                    z = true;
                                                                                                                                                }
                                                                                                                                                this.LJJIJIIJI = z;
                                                                                                                                                if (z) {
                                                                                                                                                    this.LJIL = true;
                                                                                                                                                    this.LJJIJIIJIL = true;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 1014:
                                                                                                                                                if (i2 == 1) {
                                                                                                                                                    z = true;
                                                                                                                                                }
                                                                                                                                                this.LJJIJIIJIL = z;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                switch (i) {
                                                                                                                                                    case 1100:
                                                                                                                                                        break;
                                                                                                                                                    case 1101:
                                                                                                                                                        this.LJIIJ.mEnableLoaderPreempt = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 1102:
                                                                                                                                                        this.LJIIJ.mAccessCheckLevel = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 1103:
                                                                                                                                                        this.LJIIJ.mNextDownloadThreshold = i2;
                                                                                                                                                        break;
                                                                                                                                                    case 1104:
                                                                                                                                                        AVMDLDataLoader aVMDLDataLoader5 = this.LJIIIZ;
                                                                                                                                                        if (aVMDLDataLoader5 != null) {
                                                                                                                                                            aVMDLDataLoader5.setIntValue(7219, i2);
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 1105:
                                                                                                                                                        this.LJIIJ.mSocketSendBufferKB = i2;
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        switch (i) {
                                                                                                                                                            case 1108:
                                                                                                                                                                this.LJIIJ.mEnableSyncDnsForPcdn = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1109:
                                                                                                                                                                AVMDLDataLoader aVMDLDataLoader6 = this.LJIIIZ;
                                                                                                                                                                if (aVMDLDataLoader6 != null) {
                                                                                                                                                                    aVMDLDataLoader6.setIntValue(7227, i2);
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            case 1110:
                                                                                                                                                                this.LJIIJ.mXYLibValue = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1111:
                                                                                                                                                                this.LJIIJ.mCheckPreloadLevel = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1112:
                                                                                                                                                                this.LJJIIJZLJL = i2;
                                                                                                                                                                break;
                                                                                                                                                            case 1113:
                                                                                                                                                                if (i2 != 0) {
                                                                                                                                                                    z = true;
                                                                                                                                                                }
                                                                                                                                                                this.LJJIIZ = z;
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                switch (i) {
                                                                                                                                                                    case 30:
                                                                                                                                                                        this.LJIIJ.mEncryptVersion = i2;
                                                                                                                                                                        break;
                                                                                                                                                                    case 31:
                                                                                                                                                                        this.LJIIJ.mEnableOkHttpLoader = i2;
                                                                                                                                                                        break;
                                                                                                                                                                    case 32:
                                                                                                                                                                        if (i2 > 0) {
                                                                                                                                                                            z = true;
                                                                                                                                                                        }
                                                                                                                                                                        this.LJJJJJL = z;
                                                                                                                                                                        break;
                                                                                                                                                                    case 33:
                                                                                                                                                                        if (i2 != 0) {
                                                                                                                                                                            z = true;
                                                                                                                                                                        }
                                                                                                                                                                        this.LJIIZILJ = z;
                                                                                                                                                                        break;
                                                                                                                                                                    case 34:
                                                                                                                                                                        this.LJIIJ.mEnablePcdnAuto = i2;
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        switch (i) {
                                                                                                                                                                            case 63:
                                                                                                                                                                                this.LJIIJ.mMaxIpCountEachDomain = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            case 64:
                                                                                                                                                                                this.LJIIJ.mEnableIpBucket = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            case 65:
                                                                                                                                                                                this.LJIIJ.mErrorStateTrustTime = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            case 66:
                                                                                                                                                                                this.LJIIJ.mOnlyUseCdn = i2;
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                switch (i) {
                                                                                                                                                                                    case 90:
                                                                                                                                                                                        this.LJIIJ.mDNSMainType = i2;
                                                                                                                                                                                        AVMDLDNSParser.setIntValue(0, i2);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 91:
                                                                                                                                                                                        this.LJIIJ.mDNSBackType = i2;
                                                                                                                                                                                        AVMDLDNSParser.setIntValue(1, i2);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 92:
                                                                                                                                                                                        this.LJIIJ.mMainToBackUpDelayedTime = i2;
                                                                                                                                                                                        AVMDLDNSParser.setIntValue(3, i2);
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 93:
                                                                                                                                                                                        this.LJIIJ.mEnableBenchMarkIOSpeed = i2;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 94:
                                                                                                                                                                                        this.LJIIJ.mSpeedCoefficientValue = i2;
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                        }
                                                                                                                                                                }
                                                                                                                                                        }
                                                                                                                                                }
                                                                                                                                        }
                                                                                                                                }
                                                                                                                        }
                                                                                                                }
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                    } else {
                                                                                        this.LJIIJ.mGlobalSpeedSampleInterval = i2;
                                                                                        AVMDLDataLoader aVMDLDataLoader7 = this.LJIIIZ;
                                                                                        if (aVMDLDataLoader7 != null) {
                                                                                            aVMDLDataLoader7.setIntValue(7370, i2);
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    this.LJIIJ.mSpeedSampleInterval = i2;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.LJIIJ.mEnableSessionReuse = i2;
                                                                    }
                                                                } else {
                                                                    this.LJIIJ.mMaxTlsVersion = i2;
                                                                }
                                                            } else {
                                                                this.LJJI = i2;
                                                            }
                                                        } else {
                                                            this.LJIIJ.mEnablePreloadReUse = i2;
                                                        }
                                                    } else {
                                                        this.LJIIJ.mEnableMaxCacheAgeForAllDir = i2;
                                                    }
                                                } else {
                                                    this.LJIIJ.mMaxCacheAge = i2;
                                                }
                                            } else {
                                                this.LJIIJ.mSocketIdleTimeOut = i2;
                                            }
                                        } else {
                                            this.LJIIJ.mEnableSocketReuse = i2;
                                        }
                                    } else {
                                        this.LJIIJ.mEnableExternDNS = i2;
                                    }
                                } else {
                                    this.LJIIJ.mLoaderType = i2;
                                }
                            } else {
                                this.LJIIJ.mTryCount = i2;
                            }
                        } else {
                            this.LJIIJ.mOpenTimeOut = i2;
                        }
                    } else {
                        this.LJIIJ.mRWTimeOut = i2;
                    }
                } else {
                    this.LJIIJ.mMaxCacheSize = i2;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            this.LJJ.LJ(1);
        }
    }

    public final void LJJJJJL(JSONObject jSONObject, long j) {
        String next;
        if (jSONObject == null) {
            C78253UnR.LIZLLL("DataLoaderHelper", "ip direct info invalid");
            return;
        }
        long j2 = C47850IqE.LIZ;
        if (j2 != -1 && 1000 * j < j2) {
            C78253UnR.LIZLLL("DataLoaderHelper", "network did change, dnsinfo is invalid");
            return;
        }
        this.LJJ.LIZJ(1);
        try {
            try {
                Iterator<String> keys = jSONObject.keys();
                do {
                    next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    String str = "";
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str);
                        LIZ.append(optJSONArray.optString(i));
                        str = X1D.LIZIZ(LIZ);
                        if (i < optJSONArray.length() - 1) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str);
                            LIZ2.append(",");
                            str = X1D.LIZIZ(LIZ2);
                        }
                    }
                    AVMDLDNSParser.updateDNSInfo(next, str, j);
                    if (!keys.hasNext()) {
                        break;
                    }
                } while (!TextUtils.isEmpty(next));
            } catch (Exception e) {
                C78253UnR.LIZLLL("DataLoaderHelper", e.toString());
            }
        } finally {
            this.LJJ.LJ(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47083Idr LJIJI(java.lang.String r7, long r8, java.util.concurrent.TimeUnit r10) {
        /*
            r6 = this;
            java.lang.String r3 = "DataLoaderHelper"
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r5 = 0
            if (r0 == 0) goto La
        L9:
            return r5
        La:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.InterruptedException -> L78
            java.lang.String r0 = "****try get cacheinfo lock timeout"
            r1.append(r0)     // Catch: java.lang.InterruptedException -> L78
            r1.append(r8)     // Catch: java.lang.InterruptedException -> L78
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.InterruptedException -> L78
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r3, r0)     // Catch: java.lang.InterruptedException -> L78
            X.Io8 r0 = r6.LJJ     // Catch: java.lang.InterruptedException -> L78
            boolean r0 = r0.LIZLLL(r8, r10)     // Catch: java.lang.InterruptedException -> L78
            if (r0 == 0) goto L64
            java.lang.String r0 = "####get cacheinfo lock suc"
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r3, r0)     // Catch: java.lang.InterruptedException -> L78
            r2 = 1
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = r6.LJIIIZ     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L33
            int r0 = r6.LIZJ     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L3e
        L33:
            java.lang.String r0 = "get cacheinfo fail mdl not start"
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r3, r0)     // Catch: java.lang.Throwable -> L50
            X.Io8 r0 = r6.LJJ     // Catch: java.lang.InterruptedException -> L78
            r0.LJ(r2)     // Catch: java.lang.InterruptedException -> L78
            goto L9
        L3e:
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = r6.LJIIIZ     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r0.getStringCacheInfo(r7)     // Catch: java.lang.Throwable -> L50
            X.IoH r4 = LJIIIZ(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "get cacheinfo native end"
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r3, r0)     // Catch: java.lang.Throwable -> L4e
            goto L55
        L4e:
            r0 = move-exception
            goto L52
        L50:
            r0 = move-exception
            r4 = r5
        L52:
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r0)     // Catch: java.lang.Throwable -> L5b
        L55:
            X.Io8 r0 = r6.LJJ     // Catch: java.lang.InterruptedException -> L62
            r0.LJ(r2)     // Catch: java.lang.InterruptedException -> L62
            goto L93
        L5b:
            r1 = move-exception
            X.Io8 r0 = r6.LJJ     // Catch: java.lang.InterruptedException -> L62
            r0.LJ(r2)     // Catch: java.lang.InterruptedException -> L62
            throw r1     // Catch: java.lang.InterruptedException -> L62
        L62:
            r2 = move-exception
            goto L7a
        L64:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.InterruptedException -> L78
            java.lang.String r0 = "####not get cacheinfo lock timeout"
            r1.append(r0)     // Catch: java.lang.InterruptedException -> L78
            r1.append(r8)     // Catch: java.lang.InterruptedException -> L78
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.InterruptedException -> L78
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r3, r0)     // Catch: java.lang.InterruptedException -> L78
            goto L92
        L78:
            r2 = move-exception
            r4 = r5
        L7a:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "get cacheinfo interrupt exception:"
            r1.append(r0)
            java.lang.String r0 = r2.getLocalizedMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r3, r0)
            goto L93
        L92:
            r4 = r5
        L93:
            java.lang.String r0 = "get cacheinfo all end"
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r3, r0)
            if (r4 == 0) goto L9
            X.Idr r2 = new X.Idr
            r2.<init>()
            long r0 = r4.LIZ
            r2.LIZ = r0
            long r0 = r4.LIZIZ
            r2.LIZIZ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.LJIJI(java.lang.String, long, java.util.concurrent.TimeUnit):X.Idr");
    }

    public final void LJJJI(int i, String str, long j) {
        if (this.LIZJ != 0) {
            TTVideoEngineLog.d("DataLoaderHelper", "dataloader not started, not allow set play info");
            return;
        }
        if (this.LJJJI <= 0) {
            return;
        }
        this.LJJ.LIZJ(1);
        C47710Iny c47710Iny = this.LJJJJL;
        if (c47710Iny.LIZ > 0 && c47710Iny.LIZIZ > 0) {
            c47710Iny.LIZJ.lock();
            if (!c47710Iny.LIZLLL.containsKey(str)) {
                if (c47710Iny.LIZLLL.size() >= 2) {
                    c47710Iny.LIZLLL.clear();
                }
                c47710Iny.LIZLLL.put(str, new C47726IoE());
            }
            C47726IoE c47726IoE = c47710Iny.LIZLLL.get(str);
            if (c47726IoE == null) {
                c47710Iny.LIZJ.unlock();
            } else {
                if (i != 22) {
                    if (i != 23) {
                        if (i != 25) {
                            if (i == 27) {
                                c47726IoE.LIZ = j;
                                c47710Iny.LIZIZ(str);
                            }
                        } else {
                            C47710Iny.LIZ("buffering", str);
                        }
                    } else {
                        c47726IoE.LIZIZ = j;
                        c47710Iny.LIZIZ(str);
                    }
                } else {
                    c47726IoE.LIZJ = j;
                }
                c47710Iny.LIZJ.unlock();
            }
        }
        this.LJJ.LJ(1);
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getStringValue(int i, long j, String str) {
        C47708Inw c47708Inw;
        C47396Iiu c47396Iiu;
        InterfaceC47098Ie6 interfaceC47098Ie6;
        String str2;
        String str3 = str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[preload] getStringValue, key = ");
        LIZ.append(str3);
        C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ));
        String str4 = null;
        if (i != 1506) {
            if (i == 1509 && this.LIZ != null && !TextUtils.isEmpty(str3)) {
                HashMap<String, String> LJII = this.LIZ.LJII(str3);
                if (LJII == null || LJII.size() == 0) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (String str5 : LJII.keySet()) {
                    if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(LJII.get(str5))) {
                        sb.append(str5);
                        sb.append(": ");
                        sb.append(LJII.get(str5));
                        sb.append("\r\n");
                    }
                }
                C78253UnR.LJI("DataLoaderHelper", C16880lQ.LLLZ("[customheader] get custom header:%s url: %s", new Object[]{str3, sb.toString()}));
                return sb.toString();
            }
        } else {
            C47711Inz c47711Inz = this.LJFF;
            if (c47711Inz != null) {
                c47708Inw = c47711Inz.LIZLLL(str3);
            } else {
                c47708Inw = null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[preload] getStringValue, key = ");
            LIZ2.append(str3);
            C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ2));
            if (c47708Inw != null && (c47396Iiu = c47708Inw.LJIIJ) != null && (interfaceC47098Ie6 = c47396Iiu.LJII) != null) {
                C47070Ide c47070Ide = (C47070Ide) interfaceC47098Ie6;
                if (c47070Ide.LIZ == null) {
                    c47070Ide.LIZ();
                }
                c47070Ide.LJII.LIZIZ(c47070Ide.LIZIZ, c47070Ide.LJ, c47070Ide.LIZ.LIZJ);
                IY1 iy1 = c47070Ide.LIZ;
                if (iy1 != null) {
                    str2 = iy1.LIZJ;
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(c47070Ide.LJFF)) {
                    c47070Ide.LJII.LJJ(str2, c47070Ide.LJFF);
                }
                StringBuilder LIZIZ = C25620zW.LIZIZ("getKey key:", str2, ", sourceId:");
                LIZIZ.append(c47070Ide.LJFF);
                X1D.LIZIZ(LIZIZ);
                EnginePreloader.LJIJJ();
                String[] LIZ3 = ((C47070Ide) c47708Inw.LJIIJ.LJII).LIZ();
                C47714Io2 LIZLLL = c47708Inw.LIZLLL(str3);
                C47070Ide c47070Ide2 = (C47070Ide) c47708Inw.LJIIJ.LJII;
                if (c47070Ide2.LIZ == null) {
                    c47070Ide2.LIZ();
                }
                int i2 = c47070Ide2.LJ;
                if (c47070Ide2.LIZ != null) {
                    int PlayerAbPreloadSizeOffsetThresholdExp = c47070Ide2.LJII.LJIJJLI.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
                    IYN iyn = c47070Ide2.LIZ.LIZLLL;
                    if (iyn != null) {
                        if (iyn.getSize() > c47070Ide2.LJ && c47070Ide2.LIZ.LIZLLL.getSize() - c47070Ide2.LJ <= PlayerAbPreloadSizeOffsetThresholdExp) {
                            i2 = c47070Ide2.LIZ.LIZLLL.getSize();
                        }
                    } else if (c47070Ide2.LIZIZ.getSize() > c47070Ide2.LJ && c47070Ide2.LIZIZ.getSize() - c47070Ide2.LJ <= PlayerAbPreloadSizeOffsetThresholdExp) {
                        i2 = (int) c47070Ide2.LIZIZ.getSize();
                    }
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("use_preload_size:");
                LIZ4.append(i2);
                X1D.LIZIZ(LIZ4);
                EnginePreloader.LJIJJ();
                long j2 = i2;
                C47070Ide c47070Ide3 = (C47070Ide) c47708Inw.LJIIJ.LJII;
                String LJIIIIZZ = c47070Ide3.LJII.LJIIIIZZ(c47070Ide3.LJI.LIZ);
                if (c47708Inw.LJIIL != null) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("tag=");
                    LIZ5.append(C47756Ioi.LJ(c47708Inw.LJIIL));
                    str4 = X1D.LIZIZ(LIZ5);
                }
                str4 = LJJIJLIJ(str2, str2, LIZLLL.LJIIIIZZ, j2, LIZ3, LJIIIIZZ, str4, false, null);
                if (!TextUtils.isEmpty(str2)) {
                    str3 = str2;
                }
                LIZLLL.LIZ = str3;
                C78253UnR.LJI("DataLoaderHelper", C16880lQ.LLLZ("[preload] get proxxy url from url: %s", new Object[]{str4}));
            }
        }
        return str4;
    }

    public static String LJJIL(int i, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String LJ = C47756Ioi.LJ(str);
        if (TextUtils.isEmpty(LJ)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = str;
        }
        String LJ2 = C47756Ioi.LJ(str2);
        if (!TextUtils.isEmpty(LJ2)) {
            str = LJ2;
        }
        StringBuffer stringBuffer = new StringBuffer("?rk=");
        stringBuffer.append(str);
        stringBuffer.append("&k=");
        stringBuffer.append(LJ);
        stringBuffer.append("&pv=1");
        if (!TextUtils.isEmpty(str3)) {
            stringBuffer.append("&gid=");
            stringBuffer.append(str3);
        }
        if (i > 0) {
            stringBuffer.append("&l=");
            stringBuffer.append(i);
        }
        return stringBuffer.toString();
    }

    public final void LIZIZ(String str, String str2, long j, C47398Iiw c47398Iiw, C47396Iiu c47396Iiu) {
        String str3;
        EnumC47176IfM enumC47176IfM;
        if (TextUtils.isEmpty(str)) {
            C78253UnR.LIZLLL("DataLoaderHelper", "[preload] key invalid.");
            return;
        }
        if (this.LJIIIZ == null || this.LIZJ != 0) {
            C78253UnR.LIZLLL("DataLoaderHelper", "[preload] need load mdl first.");
            return;
        }
        if (this.LJ.LIZ(str) || this.LIZLLL.LIZ(str)) {
            TTVideoEngineLog.d("DataLoaderHelper", "[preload] add the same key task.");
            return;
        }
        if (TTVideoEngineLog.d()) {
            StringBuilder LIZLLL = C06540Nm.LIZLLL("[preload] _addTask key=", str, ", videoId=", str2, ", preloadSize=");
            LIZLLL.append(j);
            LIZLLL.append(", vidItem=");
            LIZLLL.append((Object) null);
            LIZLLL.append(", videoModelItem=");
            LIZLLL.append(c47398Iiw);
            LIZLLL.append(", urlItem=");
            LIZLLL.append(c47396Iiu);
            TTVideoEngineLog.d("DataLoaderHelper", X1D.LIZIZ(LIZLLL));
        }
        EnumC47176IfM enumC47176IfM2 = EnumC47176IfM.Undefine;
        if (c47398Iiw != null && (enumC47176IfM = c47398Iiw.LIZIZ) != null) {
            enumC47176IfM2 = enumC47176IfM;
        }
        int i = -1;
        String str4 = "unknown";
        if (c47396Iiu != null) {
            str3 = "";
            if (!TextUtils.isEmpty("")) {
                str4 = "";
            }
            if (TextUtils.isEmpty("")) {
                str3 = null;
            }
        } else if (c47398Iiw != null) {
            if (!TextUtils.isEmpty(c47398Iiw.LJI)) {
                str4 = c47398Iiw.LJI;
            }
            if (!TextUtils.isEmpty(c47398Iiw.LJII)) {
                str3 = c47398Iiw.LJII;
            } else {
                str3 = null;
            }
            int i2 = c47398Iiw.LJIIIIZZ;
            if (i2 != -1) {
                i = i2;
            }
        } else {
            str4 = null;
            str3 = null;
        }
        C47708Inw c47708Inw = new C47708Inw();
        if (((CopyOnWriteArrayList) c47708Inw.LJIILL).size() == 0) {
            C47714Io2 c47714Io2 = new C47714Io2();
            c47714Io2.LIZ = str;
            c47714Io2.LIZJ = enumC47176IfM2;
            c47714Io2.LJIIIZ = j;
            ((CopyOnWriteArrayList) c47708Inw.LJIILL).add(c47714Io2);
        } else {
            C78253UnR.LIZLLL("DataLoaderHelper", "[preload] DataLoaderTaskItem setup fail");
        }
        c47708Inw.LJ = enumC47176IfM2;
        c47708Inw.LIZJ = j;
        c47708Inw.LIZ = str2;
        c47708Inw.LJI = null;
        c47708Inw.LJIIIZ = c47398Iiw;
        c47708Inw.LJIIJ = c47396Iiu;
        c47708Inw.LJIIL = str4;
        c47708Inw.LJIILIIL = str3;
        c47708Inw.LJIILJJIL = i;
        if (c47396Iiu != null) {
            c47708Inw.LIZLLL = c47396Iiu.LJFF;
            c47708Inw.LJIIIIZZ = c47396Iiu.LIZLLL;
        }
        if (c47398Iiw != null) {
            c47708Inw.LIZIZ = c47398Iiw.LIZ;
            c47708Inw.LIZLLL = 0;
            c47708Inw.LJIIIIZZ = c47398Iiw.LJIIIZ;
        }
        if (this.LIZLLL.LIZJ(c47708Inw)) {
            LJIIL();
        } else {
            c47708Inw.LIZ(-1002);
        }
    }

    public final String LJJI(String str, String str2, String[] strArr, int i, String str3) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length < 1) {
            return null;
        }
        return LJJIJL(str, str2, 0L, 0L, strArr, str3, null, 0, null, false, null, i, "", -1);
    }

    public final String LJJIJLIJ(String str, String str2, long j, long j2, String[] strArr, String str3, String str4, boolean z, String str5) {
        return LJJIJL(str, str2, j, j2, strArr, str3, str4, 0, null, z, str5, 0, "", -1);
    }

    public final String LJIIJJI(String str, String str2, long j, String[] strArr, EnumC47176IfM enumC47176IfM, String str3, C47160If6 c47160If6, String str4, String str5, boolean z, boolean z2, String str6) {
        boolean z3;
        boolean z4;
        String str7 = null;
        if (this.LIZJ != 0) {
            this.LJJL = EnumC47719Io7.StateError.ordinal();
            return null;
        }
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length < 1) {
            this.LJJL = EnumC47719Io7.ParamsWrong.ordinal();
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            if (!LJIILL(strArr2[i])) {
                this.LJJL = EnumC47719Io7.ProxyNotSupport.ordinal();
                TTVideoEngineLog.d("DataLoaderHelper", "not support");
                return strArr2[i];
            }
        }
        if (this.LJIIIZ == null) {
            C78253UnR.LIZLLL("DataLoaderHelper", "start mdl first");
            this.LJJL = EnumC47719Io7.StateError.ordinal();
            if (!this.LJJIJIIJIL) {
                return null;
            }
            return strArr2[0];
        }
        if (this.LJJIJIL == 1) {
            if (z2 || C47878Iqg.LIZ(strArr2[0])) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                z = true;
            }
        } else {
            z3 = false;
        }
        this.LJJL = EnumC47719Io7.StateError.ordinal();
        this.LJJ.LIZJ(1);
        try {
            String str8 = "";
            if (this.LJJIJIIJI) {
                if (!this.LJIIIZ.isRunning()) {
                    C78253UnR.LIZLLL("DataLoaderHelper", "dataloader is not running");
                    if (this.LJJIJIIJIL) {
                        str7 = strArr2[0];
                    }
                    this.LJJ.LJ(1);
                    return str7;
                }
            } else {
                str8 = this.LJIIIZ.getLocalAddr();
                if (TextUtils.isEmpty(str8)) {
                    C78253UnR.LIZLLL("DataLoaderHelper", "local host error");
                    if (this.LJJIJIIJIL) {
                        str7 = strArr2[0];
                    }
                    this.LJJ.LJ(1);
                    return str7;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("proxy url, mInvalidMdlProcotol: ");
            LIZ.append(this.LJIJJ);
            C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ));
            boolean z5 = this.LJIL;
            if (!this.LJJIJIIJI && this.LJJJJJL && !C47756Ioi.LJIIJJI(strArr2)) {
                C78253UnR.LJI("DataLoaderHelper", "url not transcode, not use native mdl");
                z5 = false;
            }
            if (z || this.LJIJJ || !z5) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.LJJIJIIJI && z4) {
                str8 = this.LJIIIZ.getLocalAddr();
                if (TextUtils.isEmpty(str8)) {
                    C78253UnR.LIZLLL("DataLoaderHelper", "use local server but local server closed");
                    if (this.LJJIJIIJIL) {
                        str7 = strArr2[0];
                    }
                    this.LJJ.LJ(1);
                    return str7;
                }
            }
            String LJJIJLIJ = LJJIJLIJ(str, str2, 0L, j, strArr2, str4, str5, z3, str6);
            if (TextUtils.isEmpty(LJJIJLIJ)) {
                if (this.LJJIJIIJIL) {
                    str7 = strArr2[0];
                }
                this.LJJ.LJ(1);
                return str7;
            }
            StringBuffer stringBuffer = new StringBuffer();
            int i2 = this.LJIJJLI;
            this.LJIJJLI = i2 + 1;
            if (!z4) {
                stringBuffer.append("mdl://");
                stringBuffer.append("id");
                stringBuffer.append(i2);
                stringBuffer.append("/");
            } else {
                stringBuffer.append("http://");
                stringBuffer.append(str8);
                stringBuffer.append("/");
                stringBuffer.append(i2);
            }
            stringBuffer.append(LJJIJLIJ);
            new StringBuffer().append(LJJIJLIJ);
            String auth = this.LJIIIZ.getAuth(LJJIJLIJ);
            if (!TextUtils.isEmpty(auth)) {
                stringBuffer.append("&ah=");
                stringBuffer.append(auth);
            }
            String stringBuffer2 = stringBuffer.toString();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("_proxyUrl: ");
            LIZ2.append(stringBuffer2);
            C78253UnR.LJI("DataLoaderHelper", X1D.LIZIZ(LIZ2));
            this.LJJ.LJ(1);
            C47708Inw LJI = this.LJI.LJI(str2);
            if (LJI == null) {
                LJI = new C47708Inw();
            }
            C47714Io2 LIZIZ = LJI.LIZIZ(str);
            if (LIZIZ != null) {
                LIZIZ.LIZ = str;
                LJI.LIZ = str2;
                LIZIZ.LIZIZ = stringBuffer2;
                LIZIZ.LIZJ = enumC47176IfM;
                LIZIZ.LIZLLL = str3;
                LIZIZ.LJ = c47160If6;
                LIZIZ.LJFF = strArr2;
                LIZIZ.LJIIL = str4;
                LIZIZ.LJI = str5;
                this.LJI.LIZJ(LJI);
            }
            this.LJJL = EnumC47719Io7.None.ordinal();
            return stringBuffer2;
        } catch (Throwable th) {
            this.LJJ.LJ(1);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0226 A[LOOP:1: B:67:0x017e->B:78:0x0226, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ca A[EDGE_INSN: B:79:0x01ca->B:80:0x01ca BREAK  A[LOOP:1: B:67:0x017e->B:78:0x0226], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJIJL(java.lang.String r12, java.lang.String r13, long r14, long r16, java.lang.String[] r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, boolean r23, java.lang.String r24, int r25, java.lang.String r26, int r27) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.DataLoaderHelper.LJJIJL(java.lang.String, java.lang.String, long, long, java.lang.String[], java.lang.String, java.lang.String, int, java.lang.String, boolean, java.lang.String, int, java.lang.String, int):java.lang.String");
    }
}
