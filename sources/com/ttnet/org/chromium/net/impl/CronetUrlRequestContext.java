package com.ttnet.org.chromium.net.impl;

import J.N;
import X.AbstractC66659QEd;
import X.AbstractC66666QEk;
import X.AbstractC66669QEn;
import X.C06540Nm;
import X.C0ON;
import X.C16880lQ;
import X.C1RF;
import X.C36598EXy;
import X.C48263Iwt;
import X.C66652QDw;
import X.C66653QDx;
import X.C66655QDz;
import X.C66662QEg;
import X.C66668QEm;
import X.C66671QEp;
import X.C66683QFb;
import X.C66684QFc;
import X.C74432w3;
import X.C78939UyV;
import X.EnumC66657QEb;
import X.KMP;
import X.PU3;
import X.QE0;
import X.QE6;
import X.QE7;
import X.QE8;
import X.QEH;
import X.QEK;
import X.QEM;
import X.QEN;
import X.QER;
import X.QF0;
import X.QF1;
import X.QF2;
import X.QF4;
import X.QF5;
import X.QFK;
import X.QFM;
import X.QFS;
import X.QFU;
import X.X1D;
import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class CronetUrlRequestContext extends QEM {
    public static final HashSet<String> LJJIJIL;
    public final Object LIZ;
    public final ConditionVariable LIZIZ;
    public final AtomicInteger LIZJ;
    public final long LIZLLL;
    public Thread LJ;
    public final boolean LJFF;
    public final Object LJI;
    public final Object LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final C66684QFc<QF5> LJIIL;
    public final C66684QFc<QF4> LJIILIIL;
    public final Map<AbstractC66666QEk, C66668QEm> LJIILJJIL;
    public final Object LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public String[] LJIJJ;
    public int[] LJIJJLI;
    public int[] LJIL;
    public final double[] LJJ;
    public final double[] LJJI;
    public final double[] LJJIFFI;
    public final double[] LJJII;
    public final TTAppInfoProvider LJJIII;
    public final QE6 LJJIIJ;
    public final C66652QDw LJJIIJZLJL;
    public final boolean LJJIIZ;
    public final ConditionVariable LJJIIZI;
    public final long LJJIJ;
    public final int LJJIJIIJI;
    public final AbstractC66669QEn LJJIJIIJIL;

    static {
        C16880lQ.LJLLJ(CronetUrlRequestContext.class);
        LJJIJIL = new HashSet<>();
    }

    private void onColdStartFinish() {
        C66652QDw c66652QDw = this.LJJIIJZLJL;
        if (c66652QDw != null && c66652QDw.LIZ) {
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetAppProviderManager", "onColdStartFinish ");
            }
            try {
                Object obj = LIZIZ.LIZ;
                if (obj != null) {
                    new C36598EXy(obj).LIZIZ("onColdStartFinish");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0296 A[Catch: all -> 0x0526, LOOP:0: B:47:0x0290->B:49:0x0296, LOOP_END, TryCatch #1 {all -> 0x0526, blocks: (B:6:0x0009, B:12:0x0016, B:17:0x008b, B:19:0x0095, B:20:0x009b, B:22:0x017b, B:24:0x018f, B:26:0x01a3, B:33:0x0213, B:35:0x0219, B:36:0x0261, B:44:0x0282, B:46:0x0288, B:47:0x0290, B:49:0x0296, B:51:0x02c4, B:53:0x02d6, B:54:0x02ee, B:61:0x0312, B:63:0x0318, B:64:0x0320, B:66:0x0326, B:68:0x0354, B:70:0x0362, B:82:0x020d, B:83:0x01dd, B:84:0x01e2, B:85:0x01e7, B:86:0x01ec, B:93:0x0525, B:8:0x000a, B:10:0x000e, B:11:0x0015, B:28:0x01f4, B:30:0x01f8, B:81:0x01fd), top: B:5:0x0009, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d6 A[Catch: all -> 0x0526, TryCatch #1 {all -> 0x0526, blocks: (B:6:0x0009, B:12:0x0016, B:17:0x008b, B:19:0x0095, B:20:0x009b, B:22:0x017b, B:24:0x018f, B:26:0x01a3, B:33:0x0213, B:35:0x0219, B:36:0x0261, B:44:0x0282, B:46:0x0288, B:47:0x0290, B:49:0x0296, B:51:0x02c4, B:53:0x02d6, B:54:0x02ee, B:61:0x0312, B:63:0x0318, B:64:0x0320, B:66:0x0326, B:68:0x0354, B:70:0x0362, B:82:0x020d, B:83:0x01dd, B:84:0x01e2, B:85:0x01e7, B:86:0x01ec, B:93:0x0525, B:8:0x000a, B:10:0x000e, B:11:0x0015, B:28:0x01f4, B:30:0x01f8, B:81:0x01fd), top: B:5:0x0009, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0326 A[Catch: all -> 0x0526, LOOP:1: B:64:0x0320->B:66:0x0326, LOOP_END, TryCatch #1 {all -> 0x0526, blocks: (B:6:0x0009, B:12:0x0016, B:17:0x008b, B:19:0x0095, B:20:0x009b, B:22:0x017b, B:24:0x018f, B:26:0x01a3, B:33:0x0213, B:35:0x0219, B:36:0x0261, B:44:0x0282, B:46:0x0288, B:47:0x0290, B:49:0x0296, B:51:0x02c4, B:53:0x02d6, B:54:0x02ee, B:61:0x0312, B:63:0x0318, B:64:0x0320, B:66:0x0326, B:68:0x0354, B:70:0x0362, B:82:0x020d, B:83:0x01dd, B:84:0x01e2, B:85:0x01e7, B:86:0x01ec, B:93:0x0525, B:8:0x000a, B:10:0x000e, B:11:0x0015, B:28:0x01f4, B:30:0x01f8, B:81:0x01fd), top: B:5:0x0009, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0362 A[Catch: all -> 0x0526, TRY_LEAVE, TryCatch #1 {all -> 0x0526, blocks: (B:6:0x0009, B:12:0x0016, B:17:0x008b, B:19:0x0095, B:20:0x009b, B:22:0x017b, B:24:0x018f, B:26:0x01a3, B:33:0x0213, B:35:0x0219, B:36:0x0261, B:44:0x0282, B:46:0x0288, B:47:0x0290, B:49:0x0296, B:51:0x02c4, B:53:0x02d6, B:54:0x02ee, B:61:0x0312, B:63:0x0318, B:64:0x0320, B:66:0x0326, B:68:0x0354, B:70:0x0362, B:82:0x020d, B:83:0x01dd, B:84:0x01e2, B:85:0x01e7, B:86:0x01ec, B:93:0x0525, B:8:0x000a, B:10:0x000e, B:11:0x0015, B:28:0x01f4, B:30:0x01f8, B:81:0x01fd), top: B:5:0x0009, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02fe A[Catch: all -> 0x030e, TRY_LEAVE, TryCatch #5 {all -> 0x030e, blocks: (B:56:0x02f9, B:74:0x02fe), top: B:55:0x02f9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.ttnet.org.chromium.net.TTAppInfoProvider.AppInfo onGetAppInfo() {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.onGetAppInfo():com.ttnet.org.chromium.net.TTAppInfoProvider$AppInfo");
    }

    @Override // X.QEK
    public final QFS LIZ() {
        return new TTCronetMpaService(this);
    }

    @Override // X.AbstractC66650QDu
    public final void LJII() {
        synchronized (this.LIZ) {
            N.MK0SE_Ub(this.LIZLLL, this);
        }
    }

    @Override // X.AbstractC66650QDu
    public final int LJIIL() {
        int i;
        if (this.LJFF) {
            synchronized (this.LJI) {
                i = this.LJIIJJI;
                if (i == -1) {
                    i = -1;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // X.AbstractC66650QDu
    public final int LJIILIIL() {
        int i;
        if (this.LJFF) {
            synchronized (this.LJI) {
                i = this.LJIIIIZZ;
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // X.AbstractC66650QDu
    public final int LJIILJJIL() {
        int i;
        synchronized (this.LJIILL) {
            i = this.LJIIZILJ;
        }
        return i;
    }

    @Override // X.AbstractC66650QDu
    public final int LJIILL() {
        int i;
        synchronized (this.LJIILL) {
            i = this.LJIJI;
        }
        return i;
    }

    @Override // X.AbstractC66650QDu
    public final int LJIILLIIL() {
        int i;
        synchronized (this.LJIILL) {
            i = this.LJIJ;
        }
        return i;
    }

    @Override // X.AbstractC66650QDu
    public final Map<String, int[]> LJIIZILJ() {
        if (this.LJFF) {
            HashMap hashMap = new HashMap();
            synchronized (this.LJI) {
                if (this.LJIJJ == null) {
                    return hashMap;
                }
                int i = 0;
                while (true) {
                    String[] strArr = this.LJIJJ;
                    if (i < strArr.length) {
                        hashMap.put(strArr[i], new int[]{this.LJIJJLI[i], this.LJIL[i]});
                        i++;
                    } else {
                        return hashMap;
                    }
                }
            }
        } else {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
    }

    @Override // X.AbstractC66650QDu
    public final int LJIJ() {
        int i;
        if (this.LJFF) {
            synchronized (this.LJI) {
                i = this.LJIIIZ;
                if (i == -1) {
                    i = -1;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // X.AbstractC66650QDu
    public final int LJIJI() {
        int i;
        synchronized (this.LJIILL) {
            i = this.LJIILLIIL;
        }
        return i;
    }

    @Override // X.AbstractC66650QDu
    public final List<Long> LJIJJ() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.LIZ) {
            for (long j : N.MlOQJZ8w()) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC66650QDu
    public final int LJIJJLI() {
        int i;
        if (this.LJFF) {
            synchronized (this.LJI) {
                i = this.LJIIJ;
                if (i == -1) {
                    i = -1;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIJIIJI() {
        synchronized (this.LIZ) {
            N.MaSOyuXL(this.LIZLLL, this);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIL() {
        synchronized (this.LIZ) {
            N.MAl9i79w(this.LIZLLL, this);
        }
    }

    public final void LJJJJLI() {
        if (this.LIZLLL != 0) {
        } else {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    public final long LJJJJZ() {
        long j;
        synchronized (this.LIZ) {
            LJJJJLI();
            j = this.LIZLLL;
        }
        return j;
    }

    public void stopNetLogCompleted() {
        this.LJJIIZI.open();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.2w3] */
    public static C74432w3 LJJJJL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cronet/");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("107.0.5273.2@");
        LIZ2.append("2fdb62f9");
        LIZ.append(X1D.LIZIZ(LIZ2));
        final String str = X1D.LIZIZ(LIZ).split("/")[1].split("@")[0];
        return new Object(str) { // from class: X.2w3
            public final int LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final int LIZLLL;

            public final String toString() {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("");
                LIZ3.append(this.LIZ);
                LIZ3.append(".");
                LIZ3.append(this.LIZIZ);
                LIZ3.append(".");
                LIZ3.append(this.LIZJ);
                LIZ3.append(".");
                LIZ3.append(this.LIZLLL);
                return X1D.LIZIZ(LIZ3);
            }

            {
                String[] split = str.split("\\.");
                this.LIZ = CastIntegerProtector.parseInt(split[0]);
                this.LIZIZ = CastIntegerProtector.parseInt(split[1]);
                this.LIZJ = CastIntegerProtector.parseInt(split[2]);
                this.LIZLLL = CastIntegerProtector.parseInt(split[3]);
            }
        };
    }

    private void initNetworkThread() {
        this.LJ = C16880lQ.LLLLIIIILLL();
        this.LIZIZ.open();
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChromiumNet");
        LIZ.append(Process.getThreadPriority(0));
        LLLLIIIILLL.setName(X1D.LIZIZ(LIZ));
        C66652QDw c66652QDw = this.LJJIIJZLJL;
        if (c66652QDw != null && c66652QDw.LIZ) {
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetAppProviderManager", "onCronetBootSucceed ");
            }
            try {
                Object obj = LIZIZ.LIZ;
                if (obj != null) {
                    new C36598EXy(obj).LIZIZ("onCronetBootSucceed");
                }
            } catch (Throwable unused) {
            }
        }
    }

    public CronetUrlRequestContext(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        boolean MLLAskZ0;
        AbstractC66669QEn abstractC66669QEn;
        Bundle bundle;
        Class<? extends U> asSubclass;
        Object obj = new Object();
        this.LIZ = obj;
        this.LIZIZ = new ConditionVariable(false);
        this.LIZJ = new AtomicInteger(0);
        this.LJI = new Object();
        this.LJII = new Object();
        this.LJIIIIZZ = 0;
        this.LJIIIZ = -1;
        this.LJIIJ = -1;
        this.LJIIJJI = -1;
        C66684QFc<QF5> c66684QFc = new C66684QFc<>();
        this.LJIIL = c66684QFc;
        C66684QFc<QF4> c66684QFc2 = new C66684QFc<>();
        this.LJIILIIL = c66684QFc2;
        this.LJIILJJIL = new HashMap();
        this.LJIILL = new Object();
        this.LJIIZILJ = -1;
        this.LJIJ = -1;
        this.LJIJI = -1;
        this.LJJ = new double[]{-1.0d, -1.0d};
        this.LJJI = new double[]{-1.0d, -1.0d};
        this.LJJIFFI = new double[]{-1.0d, -1.0d};
        this.LJJII = new double[]{-1.0d, -1.0d};
        this.LJJIIZI = new ConditionVariable();
        this.LJJIJ = -1L;
        this.LJJIJIIJI = hashCode();
        c66684QFc.LJLJJL = false;
        c66684QFc2.LJLJJL = false;
        this.LJFF = cronetEngineBuilderImpl.LJIIJJI;
        CronetLibraryLoader.LIZ(cronetEngineBuilderImpl.LIZ, cronetEngineBuilderImpl);
        N.MyyJ5zsH(3);
        if (cronetEngineBuilderImpl.LJIIIZ.LJLIL == 1) {
            String str = cronetEngineBuilderImpl.LJFF;
            HashSet<String> hashSet = LJJIJIL;
            synchronized (hashSet) {
                if (!hashSet.add(str)) {
                    throw new IllegalStateException("Disk cache storage path already in use");
                }
            }
        }
        this.LJJIII = cronetEngineBuilderImpl.LJIILL;
        this.LJJIIJ = cronetEngineBuilderImpl.LJIILLIIL;
        this.LJJIIJZLJL = cronetEngineBuilderImpl.LJIIZILJ;
        this.LJJIIZ = cronetEngineBuilderImpl.LJJIIJ;
        synchronized (obj) {
            long MuixiOYs = N.MuixiOYs(LJJJJLL(cronetEngineBuilderImpl));
            this.LIZLLL = MuixiOYs;
            if (MuixiOYs != 0) {
                MLLAskZ0 = N.MLLAskZ0(MuixiOYs, this);
            } else {
                throw new NullPointerException("Context Adapter creation failed.");
            }
        }
        if (MLLAskZ0) {
            this.LJJIJIIJIL = QF0.LIZ;
        } else {
            Context context = cronetEngineBuilderImpl.LIZ;
            QEK.class.getClassLoader().equals(CronetUrlRequest.class.getClassLoader());
            try {
                bundle = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (bundle != null) {
                if (bundle.getBoolean("com.ttnet.org.chromium.net.CronetMetricsOptIn") && Build.VERSION.SDK_INT >= 30) {
                    try {
                        asSubclass = QF0.class.getClassLoader().loadClass("com.google.net.cronet.telemetry.CronetLoggerImpl").asSubclass(AbstractC66669QEn.class);
                    } catch (ClassNotFoundException unused2) {
                    }
                    if (asSubclass != 0) {
                        try {
                            abstractC66669QEn = (AbstractC66669QEn) asSubclass.getConstructor(Integer.TYPE).newInstance(1);
                        } catch (Exception unused3) {
                            abstractC66669QEn = QF0.LIZ;
                        }
                        this.LJJIJIIJIL = abstractC66669QEn;
                    } else {
                        abstractC66669QEn = QF0.LIZ;
                        this.LJJIJIIJIL = abstractC66669QEn;
                    }
                }
            }
            abstractC66669QEn = QF0.LIZ;
            this.LJJIJIIJIL = abstractC66669QEn;
        }
        try {
            AbstractC66669QEn abstractC66669QEn2 = this.LJJIJIIJIL;
            new C66662QEg(cronetEngineBuilderImpl);
            LJJJJL();
            QEK.class.getClassLoader().equals(CronetUrlRequest.class.getClassLoader());
            abstractC66669QEn2.LIZ();
        } catch (RuntimeException e) {
            C78939UyV.LJII("Error while trying to log CronetEngine creation: ", e);
        }
        ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(this, 70);
        HandlerThread handlerThread = CronetLibraryLoader.LIZIZ;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            aRunnableS47S0100000_11.run();
        } else {
            new Handler(handlerThread.getLooper()).post(aRunnableS47S0100000_11);
        }
    }

    public static long LJJJJLL(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String str;
        String str2 = "";
        try {
            File LLIIJLIL = C16880lQ.LLIIJLIL(cronetEngineBuilderImpl.LIZ);
            str = LLIIJLIL != null ? LLIIJLIL.getAbsolutePath() : "";
        } catch (Throwable unused) {
            str = "";
        }
        String str3 = cronetEngineBuilderImpl.LJ;
        String str4 = cronetEngineBuilderImpl.LJFF;
        boolean z = cronetEngineBuilderImpl.LJI;
        if (z) {
            str2 = cronetEngineBuilderImpl.LIZ.getPackageName() + " Cronet/TTNetVersion:2fdb62f9 2023-09-06 QuicVersion:bb24d47c 2023-07-19";
        }
        boolean z2 = cronetEngineBuilderImpl.LJII;
        boolean z3 = cronetEngineBuilderImpl.LJIIIIZZ;
        EnumC66657QEb enumC66657QEb = cronetEngineBuilderImpl.LJIIIZ;
        boolean z4 = !enumC66657QEb.LJLILLLLZI;
        int i = enumC66657QEb.LJLIL;
        long j = cronetEngineBuilderImpl.LJIIJ;
        boolean z5 = cronetEngineBuilderImpl.LJIIJJI;
        boolean z6 = cronetEngineBuilderImpl.LIZLLL;
        boolean z7 = cronetEngineBuilderImpl.LJIILIIL;
        boolean z8 = cronetEngineBuilderImpl.LJIILJJIL;
        int i2 = cronetEngineBuilderImpl.LJIIL;
        if (i2 == 20) {
            i2 = 0;
        }
        long Mmo_MQVE = N.Mmo_MQVE(str3, str4, z, str2, z2, z3, z4, i, j, null, 0L, z5, z6, z7, z8, str, i2);
        if (Mmo_MQVE != 0) {
            for (C66671QEp c66671QEp : cronetEngineBuilderImpl.LIZIZ) {
                N.M6WZ7Wt0(Mmo_MQVE, c66671QEp.LIZ, c66671QEp.LIZIZ, c66671QEp.LIZJ);
            }
            Iterator<QF1> it = cronetEngineBuilderImpl.LIZJ.iterator();
            if (!it.hasNext()) {
                String str5 = cronetEngineBuilderImpl.LJIJ;
                if (str5 != null) {
                    N.M91PEePw(Mmo_MQVE, str5);
                }
                ArrayList<byte[]> arrayList = cronetEngineBuilderImpl.LJIJI;
                if (arrayList != null && !arrayList.isEmpty()) {
                    N.MPSDM6Fi(Mmo_MQVE, (byte[][]) arrayList.toArray(new byte[arrayList.size()]));
                }
                Map<String[], Pair<byte[], byte[]>> map = cronetEngineBuilderImpl.LJIJJ;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String[], Pair<byte[], byte[]>> entry : map.entrySet()) {
                        N.MTZ7mkhc(Mmo_MQVE, entry.getKey(), (byte[]) entry.getValue().first, (byte[]) entry.getValue().second);
                    }
                }
                String str6 = cronetEngineBuilderImpl.LJIJJLI;
                if (str6 != null) {
                    N.MOF$UaiJ(Mmo_MQVE, str6);
                }
                String str7 = cronetEngineBuilderImpl.LJIL;
                if (str7 != null) {
                    N.Mgj4Pmlq(Mmo_MQVE, str7);
                }
                String str8 = cronetEngineBuilderImpl.LJJ;
                if (str8 != null) {
                    N.MRbsmdgu(Mmo_MQVE, str8);
                }
                N.MtcJpO95(Mmo_MQVE, cronetEngineBuilderImpl.LJJI);
                N.MYC$giLM(Mmo_MQVE, cronetEngineBuilderImpl.LJJIFFI);
                N.Mz2XAXls(Mmo_MQVE, cronetEngineBuilderImpl.LJJIIJZLJL);
                N.MjS9m1YQ(cronetEngineBuilderImpl.LJJII);
                return Mmo_MQVE;
            }
            it.next().getClass();
            throw null;
        }
        throw new IllegalArgumentException("Experimental options parsing failed.");
    }

    private void onClientIPChanged(String str) {
        C66652QDw c66652QDw = this.LJJIIJZLJL;
        if (c66652QDw != null && c66652QDw.LIZ) {
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetAppProviderManager", "onClientIPChanged ");
            }
            try {
                Object obj = LIZIZ.LIZ;
                if (obj != null) {
                    new C36598EXy(obj).LIZJ("onClientIPChanged", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.LJI) {
            this.LJIIIIZZ = i;
            if (this.LJJIIJZLJL != null) {
                C66652QDw.LIZIZ(i);
            }
        }
    }

    private void onNQLChanged(int i) {
        synchronized (this.LJIILL) {
            this.LJIILLIIL = i;
            if (this.LJJIIJZLJL != null) {
                C66652QDw.LIZJ(i);
            }
        }
    }

    private void onTTNetDetectInfoChanged(String str) {
        C66652QDw c66652QDw = this.LJJIIJZLJL;
        if (c66652QDw != null && c66652QDw.LIZ) {
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0 LIZ = QE0.LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onTTNetDetectInfoChanged info str = ");
                LIZ2.append(str);
                LIZ.loggerD("CronetAppProviderManager", X1D.LIZIZ(LIZ2));
            }
            try {
                Object obj = LIZIZ.LIZ;
                if (obj != null) {
                    new C36598EXy(obj).LIZJ("onTTNetDetectInfoChanged", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void onUserSpecifyingNetworkEnabled(boolean z) {
        C66652QDw c66652QDw = this.LJJIIJZLJL;
        if (c66652QDw != null) {
            c66652QDw.getClass();
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0 LIZ = QE0.LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onUserSpecifyingNetworkEnabled, enable = ");
                LIZ2.append(z);
                LIZ.loggerD("CronetAppProviderManager", X1D.LIZIZ(LIZ2));
            }
            try {
                Object obj = LIZIZ.LIZ;
                if (obj != null) {
                    new C36598EXy(obj).LIZJ("onUserSpecifyingNetworkEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.QEK
    public final URLConnection LJ(URL url) {
        if (Proxy.NO_PROXY.type() == Proxy.Type.DIRECT) {
            String protocol = url.getProtocol();
            if ("http".equals(protocol) || "https".equals(protocol)) {
                return new CronetHttpURLConnection(url, this);
            }
            throw new UnsupportedOperationException(i0.LJFF("Unexpected protocol:", protocol));
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.AbstractC66650QDu
    public final void LJI(AbstractC66666QEk abstractC66666QEk) {
        synchronized (this.LJII) {
            ((HashMap) this.LJIILJJIL).put(abstractC66666QEk, new C66668QEm(abstractC66666QEk));
        }
    }

    @Override // X.AbstractC66650QDu
    public final List<InetAddress> LJIIIIZZ(String str) {
        String[] strArr;
        DnsQuery dnsQuery = new DnsQuery(str);
        synchronized (this.LIZ) {
            LJJJJLI();
            N.MWO0Al6e(this.LIZLLL, this, dnsQuery);
        }
        dnsQuery.LIZLLL.LIZ(0);
        if (dnsQuery.LIZIZ == 0 && (strArr = dnsQuery.LIZJ) != null && strArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : dnsQuery.LIZJ) {
                byte[] address = InetAddress.getByName(str2).getAddress();
                if (address != null) {
                    arrayList.add(InetAddress.getByAddress(dnsQuery.LIZ, address));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new UnknownHostException(dnsQuery.LIZ);
        }
        throw new UnknownHostException(str);
    }

    @Override // X.AbstractC66650QDu
    public final double LJIIJ(int i) {
        double d;
        LJJJJZI(i);
        synchronized (this.LJI) {
            d = this.LJJ[i];
        }
        return d;
    }

    @Override // X.AbstractC66650QDu
    public final void LJIIJJI(int i) {
        LJJJJZI(i);
        synchronized (this.LJI) {
        }
    }

    @Override // X.AbstractC66650QDu
    public final double LJIL(int i) {
        double d;
        LJJJJZI(i);
        synchronized (this.LJI) {
            d = this.LJJ[i];
        }
        return d;
    }

    @Override // X.AbstractC66650QDu
    public final void LJJ(int i) {
        LJJJJZI(i);
        synchronized (this.LJI) {
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIFFI(boolean z) {
        synchronized (this.LIZ) {
            N.Mbnl3sIw(this.LIZLLL, this, z);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIII(String str) {
        synchronized (this.LIZ) {
            LJJJJLI();
            N.MBtj30QU(this.LIZLLL, this, str, 1);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIIJ(String str) {
        synchronized (this.LIZ) {
            N.Mcfn2q8$(this.LIZLLL, this, str);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIIJZLJL(String str) {
        synchronized (this.LIZ) {
            N.MPONMQm_(this.LIZLLL, this, str);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIIZ(boolean z) {
        synchronized (this.LIZ) {
            N.MWOUQ7KG(this.LIZLLL, this, z);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIIZI(long j) {
        synchronized (this.LIZ) {
            LJJJJLI();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Set alog func addr: ");
            LIZ.append(j);
            C78939UyV.LJII(X1D.LIZIZ(LIZ), new Object[0]);
            N.Me3xdZoU(this.LIZLLL, this, j);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIJ(int i) {
        synchronized (this.LIZ) {
            N.MksRT8QX(this.LIZLLL, this, i);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIJIIJIL(String str) {
        synchronized (this.LIZ) {
            LJJJJLI();
            N.MlH1XMiR(this.LIZLLL, this, str);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIJIL(String str) {
        synchronized (this.LIZ) {
            N.Mj4Pi_Pa(this.LIZLLL, this, str);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIZ(boolean z) {
        synchronized (this.LIZ) {
            N.MryGlWzK(this.LIZLLL, this, z);
        }
    }

    @Override // X.AbstractC66650QDu
    public final Map<String, String> LJJJIL(String str) {
        URLDispatch uRLDispatch = new URLDispatch();
        synchronized (this.LIZ) {
            LJJJJLI();
            N.MRTGlzo1(this.LIZLLL, this, uRLDispatch, str);
        }
        uRLDispatch.LIZLLL.LIZ(300);
        HashMap hashMap = new HashMap();
        hashMap.put("final_url", uRLDispatch.LIZ);
        hashMap.put("epoch", uRLDispatch.LIZIZ);
        hashMap.put("etag", uRLDispatch.LIZJ);
        return hashMap;
    }

    public final void LJJJJZI(int i) {
        if (this.LJFF) {
            if (i == 0 || i == 1) {
                return;
            } else {
                throw new IllegalStateException(KMP.LJ("Error protocol: ", i));
            }
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public final void LJJJLIIL(C66655QDz c66655QDz) {
        synchronized (this.LJII) {
            if (((HashMap) this.LJIILJJIL).isEmpty()) {
                return;
            }
            Iterator it = new ArrayList(((HashMap) this.LJIILJJIL).values()).iterator();
            while (it.hasNext()) {
                C66668QEm c66668QEm = (C66668QEm) it.next();
                try {
                    c66668QEm.getExecutor().execute(new ARunnableS30S0200000_11(c66655QDz, c66668QEm, 26));
                } catch (RejectedExecutionException e) {
                    C78939UyV.LJII("Exception posting task to executor", e);
                }
            }
        }
    }

    private void onDropReasonChanged(boolean z, int[] iArr) {
        if (this.LJJIIJZLJL != null) {
            Object arrayList = new ArrayList();
            if (iArr != null) {
                arrayList = Arrays.stream(iArr).boxed().collect(Collectors.toList());
            }
            if (this.LJJIIJZLJL.LIZ) {
                C66653QDx LIZIZ = C66653QDx.LIZIZ();
                LIZIZ.getClass();
                if (QE0.LIZ().loggerDebug()) {
                    QE0 LIZ = QE0.LIZ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("onDropReasonChanged ");
                    LIZ2.append(z);
                    LIZ2.append(", Drop Reason List ");
                    LIZ2.append(arrayList);
                    LIZ.loggerD("CronetAppProviderManager", X1D.LIZIZ(LIZ2));
                }
                try {
                    Object obj = LIZIZ.LIZ;
                    if (obj != null) {
                        new C36598EXy(obj).LIZJ("onDropReasonChanged", new Class[]{Boolean.TYPE, List.class}, Boolean.valueOf(z), arrayList);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void onMultiNetworkStateChanged(int i, int i2) {
        C66652QDw c66652QDw = this.LJJIIJZLJL;
        if (c66652QDw != null) {
            c66652QDw.getClass();
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetAppProviderManager", C48263Iwt.LIZLLL("onMultiNetworkStateChanged, prev state = ", i, ", curr state = ", i2));
            }
            try {
                Object obj = LIZIZ.LIZ;
                if (obj != null) {
                    C36598EXy c36598EXy = new C36598EXy(obj);
                    Class<?> cls = Integer.TYPE;
                    c36598EXy.LIZJ("onMultiNetworkStateChanged", new Class[]{cls, cls}, Integer.valueOf(i), Integer.valueOf(i2));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void onPublicIPsChanged(String[] strArr, String[] strArr2) {
        if (this.LJJIIJZLJL != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            Collections.addAll(arrayList, strArr);
            Collections.addAll(arrayList2, strArr2);
            if (this.LJJIIJZLJL.LIZ) {
                C66653QDx LIZIZ = C66653QDx.LIZIZ();
                LIZIZ.getClass();
                if (QE0.LIZ().loggerDebug()) {
                    QE0.LIZ().loggerD("CronetAppProviderManager", "onPublicIPsChanged ");
                }
                try {
                    Object obj = LIZIZ.LIZ;
                    if (obj != null) {
                        new C36598EXy(obj).LIZJ("onPublicIPsChanged", new Class[]{List.class, List.class}, arrayList, arrayList2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void onSendAppMonitorEvent(String str, String str2) {
        QE6 qe6 = this.LJJIIJ;
        if (qe6 != null) {
            qe6.getClass();
            C66653QDx.LIZIZ().LIZJ(str, str2);
        }
    }

    private void onTNCUpdateFailed(String[] strArr, String str) {
        C66652QDw c66652QDw = this.LJJIIJZLJL;
        if (c66652QDw != null && c66652QDw.LIZ) {
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetAppProviderManager", "onTNCUpdateFailed ");
            }
            try {
                if (LIZIZ.LIZ != null && strArr != null && strArr.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : strArr) {
                        arrayList.add(str2);
                    }
                    new C36598EXy(LIZIZ.LIZ).LIZJ("onTNCUpdateFailed", new Class[]{ArrayList.class, String.class}, arrayList, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIJL(String str, String str2) {
        synchronized (this.LIZ) {
            N.MhbNiNFL(this.LIZLLL, this, str, str2);
        }
    }

    private void onDnsLookupComplete(DnsQuery dnsQuery, int i, String[] strArr) {
        dnsQuery.LIZIZ = i;
        dnsQuery.LIZJ = strArr;
        try {
            dnsQuery.LIZLLL.execute(new ARunnableS47S0100000_11(dnsQuery, 71));
        } catch (RejectedExecutionException e) {
            C78939UyV.LJII("Exception DnsQuery resume ", e);
        }
    }

    private void onNetworkQualityRttAndThroughputNotified(int i, int i2, int i3) {
        synchronized (this.LJIILL) {
            this.LJIIZILJ = i;
            this.LJIJ = i2;
            this.LJIJI = i3;
            if (this.LJJIIJZLJL != null) {
                C66652QDw.LIZLLL(i, i2, i3);
            }
        }
    }

    private void onRttObservation(int i, long j, int i2) {
        synchronized (this.LJI) {
            C66683QFb c66683QFb = (C66683QFb) this.LJIIL.iterator();
            if (c66683QFb.hasNext()) {
                ((QF5) c66683QFb.next()).getClass();
                throw null;
            }
        }
    }

    private void onServerConfigUpdated(String str, String str2, String str3) {
        C66652QDw c66652QDw = this.LJJIIJZLJL;
        if (c66652QDw != null && c66652QDw.LIZ) {
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0 LIZ = QE0.LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onServerConfigUpdated json = ");
                LIZ2.append(str);
                LIZ.loggerD("CronetAppProviderManager", X1D.LIZIZ(LIZ2));
            }
            try {
                Object obj = LIZIZ.LIZ;
                if (obj != null) {
                    new C36598EXy(obj).LIZJ("onServerConfigEtagChanged", new Class[]{String.class}, str2);
                    new C36598EXy(LIZIZ.LIZ).LIZJ("onServerConfigABTestChanged", new Class[]{String.class}, str3);
                    new C36598EXy(LIZIZ.LIZ).LIZJ("onServerConfigUpdated", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.LJI) {
            C66683QFb c66683QFb = (C66683QFb) this.LJIILIIL.iterator();
            if (c66683QFb.hasNext()) {
                ((QF4) c66683QFb.next()).getClass();
                throw null;
            }
        }
    }

    @Override // X.QEM, X.AbstractC66650QDu, X.QEK
    public final QEH LIZJ(String str, QE8 qe8, PU3 pu3) {
        return new QEN(str, qe8, pu3, this);
    }

    @Override // X.AbstractC66650QDu
    public final void LJFF(String[] strArr, byte[] bArr, byte[] bArr2) {
        synchronized (this.LIZ) {
            N.MWb1lJ5e(this.LIZLLL, this, strArr, bArr, bArr2);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJJ(String[] strArr, int i, int i2) {
        synchronized (this.LIZ) {
            N.MA5SsGAv(this.LIZLLL, this, strArr, i, i2);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJJI(String str, int i, String str2) {
        synchronized (this.LIZ) {
            N.MH0muaR3(this.LIZLLL, this, str, i, str2);
        }
    }

    private void onUrlDispatchComplete(URLDispatch uRLDispatch, String str, String str2, String str3) {
        uRLDispatch.LIZ = str;
        uRLDispatch.LIZJ = str2;
        uRLDispatch.LIZIZ = str3;
        try {
            uRLDispatch.LIZLLL.execute(new ARunnableS47S0100000_11(uRLDispatch, 72));
        } catch (RejectedExecutionException e) {
            C78939UyV.LJII("Exception URLDispatch resume ", e);
        }
    }

    private void onPacketLossComputed(int i, double d, double d2, double d3, double d4) {
        synchronized (this.LJI) {
            if (i != 0 && i != 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Error protocol from native. Protocol: ");
                LIZ.append(i);
                C78939UyV.LJII(X1D.LIZIZ(LIZ), new Object[0]);
                return;
            }
            this.LJJ[i] = d;
            this.LJJI[i] = d2;
            this.LJJIFFI[i] = d3;
            this.LJJII[i] = d4;
            if (this.LJJIIJZLJL != null) {
                C66652QDw.LJ(i, d, d2, d3, d4);
            }
        }
    }

    private void onStoreIdcChanged(String str, String str2, String str3, String str4, String str5) {
        C66652QDw c66652QDw = this.LJJIIJZLJL;
        if (c66652QDw != null && c66652QDw.LIZ) {
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetAppProviderManager", "onStoreIdcChanged ");
            }
            try {
                Object obj = LIZIZ.LIZ;
                if (obj != null) {
                    new C36598EXy(obj).LIZJ("onStoreIdcChanged", new Class[]{String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str5);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3, String[] strArr, int[] iArr, int[] iArr2) {
        synchronized (this.LJI) {
            this.LJIIIZ = i;
            this.LJIIJ = i2;
            this.LJIIJJI = i3;
            this.LJIJJ = strArr;
            this.LJIJJLI = iArr;
            this.LJIL = iArr2;
            if (this.LJJIIJZLJL != null) {
                C66652QDw.LJFF(i, i2, i3);
            }
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJIIIZ(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        synchronized (this.LIZ) {
            N.M2ni33Tk(this.LIZLLL, this, z, str, str2, str3, z2, str4);
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJII(String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (this.LIZ) {
            N.MvNr6crm(this.LIZLLL, this, str, str2, str3, str4, str5, str6);
        }
    }

    @Override // X.QEM
    public final QFK LJJJJJL(QFM qfm, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return new CronetWebsocketConnection(this, qfm, executor, list, map, map2, z);
    }

    private void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, String[] strArr, String str3) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL(" onTTDnsResolveResult, uuid: ", str, " host: ", str2, " ret: ");
        LIZLLL.append(i);
        LIZLLL.append(" ips: ");
        LIZLLL.append(strArr.length);
        X1D.LIZIZ(LIZLLL);
        ArrayList arrayList = new ArrayList(strArr.length);
        Collections.addAll(arrayList, strArr);
        C66652QDw c66652QDw = this.LJJIIJZLJL;
        if (c66652QDw != null) {
            c66652QDw.getClass();
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetAppProviderManager", C0ON.LIZJ("onTTDnsResolveResult info uuid = ", str, " host: ", str2));
            }
            try {
                Object obj = LIZIZ.LIZ;
                if (obj != null) {
                    C36598EXy c36598EXy = new C36598EXy(obj);
                    Class<?> cls = Integer.TYPE;
                    c36598EXy.LIZJ("onTTDnsResolveResult", new Class[]{String.class, String.class, cls, cls, cls, List.class, String.class}, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), arrayList, str3);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.QEM
    public final QFU LJJJJI(QF2 qf2, Executor executor, int i, List<String> list, int i2, int i3, int i4) {
        return new TTCronetNetExpRequest(this, qf2, executor, i, list, i2, i3, i4);
    }

    @Override // X.AbstractC66650QDu
    public final void LJJIJLIJ(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        synchronized (this.LIZ) {
            try {
                LJJJJLI();
                try {
                    N.MIs1FVFz(this.LIZLLL, this, j, j2, j3, j4, j5, j6, j7, j8);
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // X.AbstractC66650QDu
    public final void LJJJJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        synchronized (this.LIZ) {
            N.MqjX8qD1(this.LIZLLL, this, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }
    }

    @Override // X.QEM
    public final AbstractC66659QEd LJJJJIZL(String str, QER qer, Executor executor, int i, boolean z, boolean z2, int i2, boolean z3, int i3, long j) {
        CronetUrlRequest cronetUrlRequest;
        long j2 = j;
        if (j2 == -1) {
            j2 = this.LJJIJ;
        }
        synchronized (this.LIZ) {
            LJJJJLI();
            cronetUrlRequest = new CronetUrlRequest(this, str, i, qer, executor, z, z2, i2, z3, i3, j2);
        }
        return cronetUrlRequest;
    }

    @Override // X.QEM
    public final QFK LJJJJJ(QFM qfm, Executor executor, List list, int i, String str, long j, int i2, long j2, String str2, int i3, Map map, Map map2, boolean z) {
        return new CronetWebsocketConnection(this, qfm, executor, list, i, str, j, i2, j2, str2, i3, map, map2, z);
    }

    private void onContextInitCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.LIZIZ.open();
        if (this.LJJIIJZLJL != null) {
            QE7 LIZ = QE7.LIZ();
            LIZ.LIZJ = Process.getThreadPriority(0);
            LIZ.LJIIJ = CronetLibraryLoader.LJFF;
            LIZ.LJIIJJI = CronetLibraryLoader.LJI;
            LIZ.LJIJI = CronetLibraryLoader.LJII;
            LIZ.LJIIL = j;
            LIZ.LJIILIIL = j2;
            LIZ.LJIILJJIL = j3;
            LIZ.LJIILL = j4;
            LIZ.LJIILLIIL = j5;
            LIZ.LJIIZILJ = j6;
            LIZ.LJIJJ = j7;
            LIZ.LJIJJLI = j8;
            LIZ.LJIL = j9;
            LIZ.LJJ = j10;
            LIZ.LJJI = j11;
            LIZ.LJJIFFI = j12;
            LIZ.LJJII = j13;
            LIZ.LJJIII = j14;
            LIZ.LJJIIJ = j15;
            LIZ.LJJIIJZLJL = j16;
            LIZ.LJJIIZ = j17;
            LIZ.LJJIIZI = j18;
            QE7.LJJIJ = true;
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            QE7 LIZ2 = QE7.LIZ();
            LIZ2.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject.put("mode", LIZ2.LIZ.LJLIL);
                jSONObject.put("is_main_process", LIZ2.LIZIZ);
                jSONObject.put("net_thread_priority", LIZ2.LIZJ);
                jSONObject2.put("ttnet_start", LIZ2.LIZLLL);
                jSONObject2.put("ttnet_end", LIZ2.LJ);
                jSONObject2.put("engine_start", LIZ2.LJIIIIZZ);
                jSONObject2.put("engine_end", LIZ2.LJIIIZ);
                jSONObject2.put("init_start", LIZ2.LJIIJ);
                jSONObject2.put("init_end", LIZ2.LJIIJJI);
                jSONObject2.put("network_start", LIZ2.LJIILJJIL);
                jSONObject2.put("network_end", LIZ2.LJIILL);
                jSONObject2.put("exec_wait_end", LIZ2.LJIILLIIL);
                jSONObject2.put("preconnect_start", LIZ2.LJIIZILJ);
                jSONObject3.put("builder_build", LIZ2.LJIJ);
                jSONObject3.put("load_cronet", LIZ2.LJIJI);
                jSONObject3.put("init_mssdk", LIZ2.LJII);
                QE7.LIZJ(jSONObject3, "init_ttnet", LIZ2.LIZLLL, LIZ2.LJ);
                QE7.LIZJ(jSONObject3, "init_metasec", LIZ2.LJFF, LIZ2.LJI);
                QE7.LIZJ(jSONObject3, "create_engine", LIZ2.LJIIIIZZ, LIZ2.LJIIIZ);
                QE7.LIZJ(jSONObject3, "init_thread", LIZ2.LJIIJ, LIZ2.LJIIJJI);
                QE7.LIZJ(jSONObject3, "native_init_thread", LIZ2.LJIIL, LIZ2.LJIILIIL);
                QE7.LIZJ(jSONObject3, "network_thread", LIZ2.LJIILJJIL, LIZ2.LJIILL);
                QE7.LIZJ(jSONObject3, "exec_tasks", LIZ2.LJIILL, LIZ2.LJIILLIIL);
                QE7.LIZJ(jSONObject3, "init_total", LIZ2.LIZLLL, LIZ2.LJIILL);
                QE7.LIZJ(jSONObject3, "init_preconnect", LIZ2.LIZLLL, LIZ2.LJIIZILJ);
                jSONObject3.put("nqe_init", LIZ2.LJIJJ);
                jSONObject3.put("prefs_init", LIZ2.LJIJJLI);
                jSONObject3.put("channel_init", LIZ2.LJIL);
                jSONObject3.put("context_build", LIZ2.LJJ);
                jSONObject3.put("tnc_config", LIZ2.LJJI);
                jSONObject3.put("update_appinfo", LIZ2.LJJIFFI);
                jSONObject3.put("netlog_init", LIZ2.LJJII);
                jSONObject3.put("nqe_detect", LIZ2.LJJIII);
                jSONObject3.put("preconnect", LIZ2.LJJIIJ);
                jSONObject3.put("ssl_session", LIZ2.LJJIIJZLJL);
                jSONObject3.put("ttnet_config", LIZ2.LJJIIZ);
                jSONObject3.put("install_cert", LIZ2.LJJIIZI);
                jSONObject.put("ttnet_timestamp", jSONObject2);
                jSONObject.put("ttnet_duration", jSONObject3);
            } catch (JSONException unused) {
            }
            Logger.debug();
            LIZIZ.LIZJ(jSONObject.toString(), "ttnet_init");
        }
    }

    private void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        IOException iOException;
        if (this.LJJIIJ != null) {
            C66653QDx LIZIZ = C66653QDx.LIZIZ();
            LIZIZ.getClass();
            if (QE0.LIZ().loggerDebug()) {
                QE0.LIZ().loggerD("CronetAppProviderManager", "handleApiResult ");
            }
            try {
                if (LIZIZ.LIZ != null) {
                    if (z) {
                        iOException = null;
                    } else {
                        iOException = C1RF.LJI(C1RF.LIZJ(i, i2, str7));
                    }
                    C36598EXy c36598EXy = new C36598EXy(LIZIZ.LIZ);
                    Class<?> cls = Boolean.TYPE;
                    Class<?> cls2 = Long.TYPE;
                    c36598EXy.LIZJ("handleApiResult", new Class[]{cls, String.class, String.class, String.class, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls, cls2, cls2, String.class, String.class, String.class, Exception.class}, Boolean.valueOf(z), str, str2, str3, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Boolean.valueOf(z2), Long.valueOf(j11), Long.valueOf(j12), str4, str5, str6, iOException);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
