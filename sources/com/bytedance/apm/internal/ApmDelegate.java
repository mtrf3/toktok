package com.bytedance.apm.internal;

import X.AbstractC64084PDc;
import X.C09900aA;
import X.C09970aH;
import X.C10060aQ;
import X.C10070aR;
import X.C14570hh;
import X.C14590hj;
import X.C16880lQ;
import X.C171096nZ;
import X.C17N;
import X.C1PX;
import X.C245599kR;
import X.C25500zK;
import X.C36381bm;
import X.C36633EZh;
import X.C38467F7v;
import X.C39034FTq;
import X.C39038FTu;
import X.C39039FTv;
import X.C39050FUg;
import X.C39713FiH;
import X.C39714FiI;
import X.C43001GuD;
import X.C44061oA;
import X.C45439HsR;
import X.C48002Isg;
import X.C61491OBj;
import X.C63081OpJ;
import X.C64038PBi;
import X.C64089PDh;
import X.C64092PDk;
import X.C64094PDm;
import X.C64099PDr;
import X.C64108PEa;
import X.C64109PEb;
import X.C64111PEd;
import X.C64112PEe;
import X.C64113PEf;
import X.C64125PEr;
import X.C64131PEx;
import X.C64160PGa;
import X.C73994T2g;
import X.C78915Uy7;
import X.C79234V7u;
import X.C80036Vb6;
import X.C85108Xai;
import X.EGB;
import X.F9U;
import X.FUF;
import X.FUG;
import X.InterfaceC36632EZg;
import X.InterfaceC58333Muv;
import X.InterfaceC64103PDv;
import X.InterfaceC64110PEc;
import X.InterfaceC64117PEj;
import X.O6R;
import X.PAN;
import X.PAO;
import X.PBX;
import X.PC5;
import X.PCE;
import X.PD2;
import X.PDS;
import X.PDU;
import X.PDX;
import X.PE0;
import X.PE3;
import X.PER;
import X.PES;
import X.PET;
import X.PEU;
import X.PEW;
import X.PEX;
import X.PEY;
import X.PEZ;
import X.PFC;
import X.PG7;
import X.PGP;
import X.PGU;
import X.PH3;
import X.PK0;
import X.UCH;
import X.X1D;
import Y.ARunnableS15S0400000_11;
import Y.ARunnableS47S0100000_11;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.config.SlardarConfigManagerImpl;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.apm.impl.DefaultTTNetImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.ILaunchTrace;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.slardar.config.IConfigManager;
import com.google.android.play.core.appupdate.u;
import d5b.c;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ApmDelegate implements InterfaceC64103PDv {
    public static long LJLLLL;
    public static boolean LJLLLLLL;
    public PES LJLIL;
    public C64108PEa LJLILLLLZI;
    public C39034FTq LJLJI;
    public InterfaceC64117PEj LJLJJI;
    public C39039FTv LJLJJL;
    public SlardarConfigManagerImpl LJLJJLL;
    public volatile boolean LJLJL;
    public volatile boolean LJLJLJ;
    public volatile boolean LJLJLLL;
    public boolean LJLL;
    public Set<InterfaceC64110PEc> LJLLI;
    public C48002Isg LJLLILLLL;
    public boolean LJLLJ = true;
    public boolean LJLLL;

    private void initEvilMethodTraceInject() {
    }

    @Override // X.InterfaceC64103PDv
    public final void LIZ() {
        boolean z;
        boolean z2;
        this.LJLJL = true;
        InterfaceC64117PEj interfaceC64117PEj = this.LJLJJI;
        if (interfaceC64117PEj != null) {
            interfaceC64117PEj.LIZ();
        }
        JSONObject config = this.LJLJJLL.getConfig();
        if (this.LJLL) {
            new PGU().LJIIIZ();
        }
        if (C43001GuD.LJIJ("traffic", "enable_collect", config) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (C43001GuD.LJIJ("traffic", "enable_exception_collect", config) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ApmDelegate.onReady initializing traffic: normalHit=");
            LIZ.append(z);
            LIZ.append(" exceptionHit=");
            LIZ.append(z2);
            X1D.LIZIZ(LIZ);
        }
        if (C09970aH.LJII()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ApmDelegate initializing traffic: normalHit=");
            LIZ2.append(z);
            LIZ2.append(" exceptionHit=");
            LIZ2.append(z2);
            X1D.LIZIZ(LIZ2);
        }
        if (z || z2) {
            EGB.LIZ.LIZ(z, z2);
        }
        if (this.LJLJI.LJ && C43001GuD.LJIJ("battery", "enable_upload", config) == 1) {
            Context context = C09970aH.LIZ;
            String LJIIZILJ = C79234V7u.LJIIZILJ(Process.myPid());
            if (LJIIZILJ != null && !LJIIZILJ.contains(":") && LJIIZILJ.equals(context.getPackageName())) {
                new PGP() { // from class: X.1mS
                    public C14620hm LJLJL;
                    public IntentFilter LJLJLJ;
                    public boolean LJLJLLL;

                    @Override // X.PGP
                    public final boolean LJIIJ() {
                        return false;
                    }

                    @Override // X.PGP
                    public final long LJIILJJIL() {
                        return 0L;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.0hm] */
                    @Override // X.PGP
                    public final void LJIIJJI() {
                        this.LJLJL = new BroadcastReceiver() { // from class: X.0hm
                            public static void LIZ(Intent intent) {
                                final float intExtra = intent.getIntExtra("temperature", 0) / 10.0f;
                                final float intExtra2 = (intent.getIntExtra("level", 0) * 100.0f) / intent.getIntExtra("scale", 100);
                                final String topActivityClassName = ActivityLifeObserver.getInstance().getTopActivityClassName();
                                if (TextUtils.isEmpty(topActivityClassName)) {
                                    return;
                                }
                                F9U.LIZ.LIZJ(new Runnable() { // from class: X.0hl
                                    public final void LIZ() {
                                        try {
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("battery_temperature", intExtra);
                                            jSONObject.put("remaining_energy", intExtra2);
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put(WM7.SCENE_SERVICE, topActivityClassName);
                                            C64089PDh.LJIIJ().LIZLLL(new PEF("temperature", "", jSONObject, jSONObject2, null));
                                        } catch (Exception unused) {
                                        }
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean LIZ3;
                                        try {
                                            LIZ();
                                        } finally {
                                            if (LIZ3) {
                                            }
                                        }
                                    }
                                });
                            }

                            @Override // android.content.BroadcastReceiver
                            public final void onReceive(Context context2, Intent intent) {
                                if (!C84763XOl.LJIIJJI && intent != null) {
                                    if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                                        C35532Dx2.LIZIZ();
                                    }
                                }
                                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                    LIZ(intent);
                                } else {
                                    C38523F9z.LIZ();
                                    LIZ(intent);
                                }
                            }
                        };
                        this.LJLJLJ = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                    }

                    {
                        this.LJLJJL = "battery";
                    }

                    @Override // X.PGP, X.InterfaceC64217PIf
                    public final void LIZJ(Activity activity) {
                        super.LIZJ(activity);
                        if (this.LJLJLLL) {
                            return;
                        }
                        try {
                            C16880lQ.LJJLIIIJILLIZJL(this.LJLJL, C09970aH.LIZ, this.LJLJLJ);
                            this.LJLJLLL = true;
                        } catch (Exception unused) {
                        }
                    }

                    @Override // X.PGP, X.InterfaceC64217PIf
                    public final void LJII(Activity activity) {
                        super.LJII(activity);
                        if (!this.LJLJLLL) {
                            return;
                        }
                        try {
                            C16880lQ.LJJLIIIJL(C09970aH.LIZ, this.LJLJL);
                            this.LJLJLLL = false;
                        } catch (Exception unused) {
                        }
                    }

                    @Override // X.PGP
                    public final void LJIIIIZZ(JSONObject jSONObject) {
                        jSONObject.optInt("temperature_enable_upload", 0);
                    }
                }.LJIIIZ();
                C14590hj.LIZ.LJIIIZ();
            }
            new PGP() { // from class: X.1mR
                public boolean LJLJL;

                @Override // X.PGP
                public final long LJIILJJIL() {
                    return LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
                }

                @Override // X.PGP
                public final void LJIIL() {
                    Intent LJJLIIIJILLIZJL;
                    int intExtra;
                    if (!this.LJLJL || this.LJLILLLLZI || (LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, C09970aH.LIZ, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || (intExtra = LJJLIIIJILLIZJL.getIntExtra("status", -1)) == 2 || intExtra == 5) {
                        return;
                    }
                    float LIZJ = c.LIZJ(C09970aH.LIZ);
                    if (LIZJ < 10) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("timing_current", LIZJ);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(WM7.SCENE_SERVICE, ActivityLifeObserver.getInstance().getTopActivityClassName());
                        PGP.LJIILIIL(new PEF("battery", "", jSONObject, jSONObject2, null));
                    } catch (JSONException unused) {
                    }
                }

                {
                    this.LJLJJL = "battery";
                }

                @Override // X.PGP
                public final boolean LJIIJ() {
                    return this.LJLJL;
                }

                @Override // X.PGP, X.InterfaceC64217PIf
                public final void LIZJ(Activity activity) {
                    super.LIZJ(activity);
                    if (this.LJLJL) {
                        F9U.LIZ.LIZ(this);
                    }
                }

                @Override // X.PGP, X.InterfaceC64217PIf
                public final void LJII(Activity activity) {
                    super.LJII(activity);
                    F9U.LIZ.LJI(this);
                }

                @Override // X.PGP
                public final void LJIIIIZZ(JSONObject jSONObject) {
                    boolean z3 = false;
                    if (jSONObject.optInt("energy_enable", 0) == 1) {
                        z3 = true;
                    }
                    this.LJLJL = z3;
                }
            }.LJIIIZ();
            C14570hh.LIZ.LJIIIZ();
        }
        this.LJLJI.getClass();
    }

    public final void LJI() {
        String LIZ;
        PES pes;
        System.currentTimeMillis();
        InterfaceC58333Muv interfaceC58333Muv = this.LJLJI.LJIIIIZZ;
        synchronized (C09970aH.class) {
            C09970aH.LJJI = interfaceC58333Muv;
        }
        this.LJLJI.getClass();
        if (C17N.LJJIIZI(this.LJLJI.LIZ) && !C17N.LJJIIZI(null)) {
            this.LJLJI.LIZ = null;
        }
        if (C17N.LJJIIZI(this.LJLJI.LIZIZ) && !C17N.LJJIIZI(null)) {
            this.LJLJI.LIZIZ = null;
        }
        if (C17N.LJJIIZI(this.LJLJI.LIZJ) && !C17N.LJJIIZI(null)) {
            this.LJLJI.LIZJ = null;
        }
        C64099PDr.LIZ = new O6R(0);
        C10070aR c10070aR = C10060aQ.LIZ;
        c10070aR.LIZ = new PDS();
        PD2.LIZ.LJ = new C1PX(c10070aR);
        C09970aH.LJIIJJI(this.LJLJI.LJI);
        C09970aH.LJIIJ(this.LJLJI.LJII);
        C39034FTq c39034FTq = this.LJLJI;
        DefaultTTNetImpl defaultTTNetImpl = c39034FTq.LJIIIZ;
        if (defaultTTNetImpl != null) {
            C09970aH.LJIIIIZZ = defaultTTNetImpl;
        }
        C09970aH.LJIJJ = c39034FTq.LIZ;
        C09970aH.LJIJJLI = null;
        this.LJLJJL = c39034FTq.LJIILJJIL;
        this.LJLLILLLL = c39034FTq.LJIILL;
        this.LJLLI = c39034FTq.LJIIJ;
        PG7 pg7 = C38467F7v.LIZ;
        pg7.getClass();
        PER per = C64109PEb.LIZ;
        per.LIZJ();
        per.LIZLLL();
        per.LIZ();
        per.LIZIZ();
        if (this.LJLL && (pes = this.LJLIL) != null && pes.LJI) {
            C64160PGa c64160PGa = new C64160PGa();
            this.LJLJI.getClass();
            c64160PGa.LJIIIZ();
        }
        this.LJLJI.getClass();
        PC5.LJJIIZ();
        this.LJLJI.getClass();
        pg7.LIZIZ = this.LJLJI.LIZLLL;
        this.LJLJI.getClass();
        FUG LIZ2 = FUG.LIZ();
        FUF fuf = this.LJLJI.LJIILIIL;
        LIZ2.getClass();
        if (fuf != null) {
            try {
                LIZ2.LIZ.add(fuf);
            } catch (Throwable unused) {
            }
        }
        C64089PDh LJIIJ = C64089PDh.LJIIJ();
        LJIIJ.getClass();
        ((IConfigManager) C171096nZ.LIZ(IConfigManager.class)).registerConfigListener(LJIIJ);
        C64092PDk c64092PDk = C64094PDm.LIZ;
        c64092PDk.getClass();
        ((IConfigManager) C171096nZ.LIZ(IConfigManager.class)).registerConfigListener(c64092PDk);
        this.LJLJI.getClass();
        C73994T2g c73994T2g = this.LJLIL.LJIIIZ;
        if (O6R.LJLILLLLZI == null) {
            O6R.LJLILLLLZI = c73994T2g;
        }
        try {
            if (C64131PEx.LIZ == null) {
                LIZ = "";
            } else {
                LIZ = PK0.LIZ();
            }
            if (!TextUtils.isEmpty(LIZ)) {
                C09970aH.LJFF.put("bytrace_id", LIZ);
                C09970aH.LJFF.put("pid", String.valueOf(Process.myPid()));
            }
        } catch (Throwable unused2) {
        }
        long j = this.LJLJI.LJIIJJI;
        ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(this, 13);
        if (j <= 0) {
            F9U.LIZ.LIZJ(aRunnableS47S0100000_11);
        } else {
            F9U.LIZ.LIZLLL(1000 * j, aRunnableS47S0100000_11);
        }
        if (C09970aH.LJII()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("delayRequestSeconds:");
            LIZ3.append(j);
            C80036Vb6.LJIIIIZZ("apm_debug", X1D.LIZIZ(LIZ3));
        }
        if (this.LJLL) {
            C39713FiH c39713FiH = C39714FiI.LIZ;
            String string = c39713FiH.LIZ.getString("update_version_code", null);
            String optString = C09970aH.LJFF.optString("update_version_code");
            if (!TextUtils.equals(string, optString)) {
                C09970aH.LJIIJ = 1;
                c39713FiH.LIZ.edit().putString("update_version_code", optString).apply();
            } else {
                C09970aH.LJIIJ = 2;
            }
        }
        Set<InterfaceC64110PEc> set = this.LJLLI;
        if (set != null) {
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC64110PEc) it.next()).init();
                } catch (Throwable unused3) {
                }
            }
        }
        new C245599kR(0);
        Set<InterfaceC64110PEc> set2 = this.LJLLI;
        if (set2 != null) {
            Iterator it2 = ((HashSet) set2).iterator();
            while (it2.hasNext()) {
                try {
                    ((InterfaceC64110PEc) it2.next()).LIZ();
                } catch (Throwable unused4) {
                }
            }
        }
        Set<InterfaceC64110PEc> set3 = this.LJLLI;
        if (set3 != null) {
            Iterator it3 = ((HashSet) set3).iterator();
            while (it3.hasNext()) {
                try {
                    ((InterfaceC64110PEc) it3.next()).start();
                } catch (Throwable unused5) {
                }
            }
        }
        PE0 pe0 = F9U.LIZ;
        this.LJLJI.getClass();
        pe0.LIZ = null;
        PE3 pe3 = pe0.LIZJ;
        if (pe3 != null) {
            C39050FUg LIZJ = pe3.LIZJ();
            LIZJ.LJLJI = null;
            LIZJ.LJLJJI = null;
        }
        C39034FTq c39034FTq2 = this.LJLJI;
        List<String> list = c39034FTq2.LIZIZ;
        if (!C17N.LJJIIZI(list)) {
            try {
                String host = new URL((String) ListProtector.get(list, 0)).getHost();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("https://");
                LIZ4.append(host);
                LIZ4.append("/monitor/collect/c/logcollect");
                UCH.LJLJJL = X1D.LIZIZ(LIZ4);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("https://");
                LIZ5.append(host);
                LIZ5.append("/monitor/collect/c/code_coverage");
                UCH.LJLJJLL = X1D.LIZIZ(LIZ5);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("https://");
                LIZ6.append(host);
                LIZ6.append("/monitor/collect/c/logcollect");
                u.LIZLLL = X1D.LIZIZ(LIZ6);
            } catch (MalformedURLException unused6) {
            }
            ArrayList arrayList = new ArrayList(2);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    String host2 = new URL((String) ListProtector.get(list, i)).getHost();
                    if (!TextUtils.isEmpty(host2) && host2.indexOf(46) > 0) {
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("https://");
                        LIZ7.append(host2);
                        LIZ7.append("/monitor/collect/batch/");
                        arrayList.add(X1D.LIZIZ(LIZ7));
                    }
                } catch (Exception unused7) {
                }
            }
            PBX pbx = C64038PBi.LIZ;
            pbx.getClass();
            if (!C78915Uy7.LJIJJ(arrayList)) {
                ((ArrayList) pbx.LJFF).clear();
                ((ArrayList) pbx.LJFF).addAll(arrayList);
            }
        }
        PBX pbx2 = C64038PBi.LIZ;
        List<String> list2 = C39038FTu.LIZLLL;
        pbx2.getClass();
        if (!C78915Uy7.LJIJJ(list2)) {
            ((ArrayList) pbx2.LJII).clear();
            ((ArrayList) pbx2.LJII).addAll(list2);
        }
        List<String> list3 = C39038FTu.LJFF;
        if (!C78915Uy7.LJIJJ(list3)) {
            ((ArrayList) pbx2.LJIIIIZZ).clear();
            ((ArrayList) pbx2.LJIIIIZZ).addAll(list3);
        }
        List<String> list4 = c39034FTq2.LIZJ;
        if (!C78915Uy7.LJIJJ(list4)) {
            ((ArrayList) pbx2.LJIIIIZZ).clear();
            ((ArrayList) pbx2.LJIIIIZZ).addAll(list4);
        }
        if (!C17N.LJJIIZI(list)) {
            String str = (String) ListProtector.get(list4, 0);
            if (!TextUtils.isEmpty(str)) {
                PDU.LJLJLJ = str;
            }
        }
        InterfaceC64117PEj interfaceC64117PEj = this.LJLJI.LJIIL;
        this.LJLJJI = interfaceC64117PEj;
        if (interfaceC64117PEj != null) {
            interfaceC64117PEj.onStartComplete();
        }
        AutoLaunchTraceHelper.reportStats();
        C171096nZ.LIZ.put(IHttpService.class, new IHttpService() { // from class: com.bytedance.apm.internal.ApmDelegate.7
            @Override // com.bytedance.services.apm.api.IHttpService
            public C36633EZh doGet(String str2, Map<String, String> map) {
                return C09970aH.LJIIIIZZ.doGet(str2, map);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public InterfaceC36632EZg buildMultipartUpload(String str2, String str3, boolean z) {
                return C09970aH.LJIIIIZZ.buildMultipartUpload(str2, str3, z);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public C36633EZh doPost(String str2, byte[] bArr, Map<String, String> map) {
                return C09970aH.LJIIIIZZ.doPost(str2, bArr, map);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public C36633EZh uploadFiles(String str2, List<File> list5, Map<String, String> map) {
                return C09970aH.LJIIIIZZ.uploadFiles(str2, list5, map);
            }

            @Override // com.bytedance.services.apm.api.IHttpService
            public InterfaceC36632EZg buildMultipartUpload(String str2, String str3, boolean z, Map<String, String> map) {
                return C09970aH.LJIIIIZZ.buildMultipartUpload(str2, str3, z, map);
            }
        });
        PDX pdx = new PDX();
        PCE.LJII(pdx);
        C64089PDh.LJIIJ().LJLJJL = pdx;
        C64094PDm.LIZ.LJLJJL = pdx;
        if (C09970aH.LJII()) {
            if (this.LJLL) {
                DoctorManager.getInstance().LIZIZ("APM_START", null);
            } else {
                DoctorManager.getInstance().LIZIZ("APM_START_OTHER_PROCESS", null);
            }
        }
    }

    public static void initTraceEvilMethod() {
        PFC.LJIILJJIL(LJLLLL);
        PFC.LJLLJ = LJLLLLLL;
        PFC.LJLLILLLL = true;
        C36381bm.LJIL.LJIIIIZZ();
        C25500zK.LJI();
        new PFC(false).LJIILL();
        C64125PEr.LIZLLL().getClass();
    }

    public final PES LIZIZ() {
        PES pes = this.LJLIL;
        if (pes == null) {
            return new PES(new PET());
        }
        return pes;
    }

    public final void LJFF() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("init", C09970aH.LIZLLL);
            jSONObject.put("start", C09970aH.LJ);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_main_process", this.LJLL);
            C09900aA.LJI("apm_cost", jSONObject2, jSONObject, null);
        } catch (JSONException unused) {
        }
    }

    public final boolean LIZJ(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.LJLJL || (slardarConfigManagerImpl = this.LJLJJLL) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getLogTypeSwitch(str);
    }

    public final void LIZLLL(Context context, PES pes) {
        Context LLLLL;
        Application application;
        boolean z;
        boolean z2;
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ApmDelegate.init mInited=");
            LIZ.append(this.LJLJLJ);
            X1D.LIZIZ(LIZ);
        }
        if (!this.LJLJLJ) {
            long nanoTime = System.nanoTime();
            this.LJLJLJ = true;
            C09970aH.LJFF();
            C09970aH.LJIIJJI = true;
            this.LJLIL = pes;
            C64108PEa c64108PEa = this.LJLILLLLZI;
            if (c64108PEa != null) {
                pes.LIZ = c64108PEa.LIZIZ;
                pes.LIZIZ = c64108PEa.LIZ;
                pes.LIZJ = c64108PEa.LIZLLL;
                pes.LIZLLL = c64108PEa.LIZJ;
            }
            AbstractC64084PDc.LJLJJLL = 1000;
            AbstractC64084PDc.LJLJL = false;
            synchronized (PCE.class) {
                PCE.LJ = false;
            }
            C64092PDk.LLFFF = true;
            C64113PEf.LIZ.LIZ().getClass();
            C64092PDk.LLFF = 30000L;
            if (context == null) {
                application = null;
            } else {
                if (context instanceof Application) {
                    LLLLL = context;
                } else {
                    LLLLL = C16880lQ.LLLLL(context);
                }
                application = (Application) LLLLL;
                if (application != null) {
                    C09970aH.LIZ = application;
                }
            }
            ActivityLifeObserver.init(application);
            SlardarConfigManagerImpl slardarConfigManagerImpl = new SlardarConfigManagerImpl();
            this.LJLJJLL = slardarConfigManagerImpl;
            C171096nZ.LIZ.put(IConfigManager.class, slardarConfigManagerImpl);
            C171096nZ.LIZIZ(IMonitorLogManager.class, new PEX());
            C171096nZ.LIZIZ(IActivityLifeManager.class, new PEY());
            C171096nZ.LIZIZ(IApmAgent.class, new PEZ());
            C171096nZ.LIZIZ(PAN.class, new C64111PEd());
            C171096nZ.LIZIZ(PAO.class, new PEW());
            C171096nZ.LIZIZ(ILaunchTrace.class, new C64112PEe());
            C09970aH.LJIILL = null;
            this.LJLL = C09970aH.LJIIIIZZ();
            F9U.LIZ.LIZJ(new ARunnableS15S0400000_11(this, pes, context, C61491OBj.LJJZZIII(context), 0));
            if (this.LJLL) {
                this.LJLIL.getClass();
                if (pes.LIZ) {
                    C85108Xai c85108Xai = new C85108Xai();
                    c85108Xai.LJLJJLL = pes.LIZIZ;
                    c85108Xai.LJLJL = true;
                    ActivityLifeObserver.getInstance().register(c85108Xai);
                }
                AutoPageTraceHelper.setMaxValidTimeMs(pes.LIZIZ);
                AutoLaunchTraceHelper.setMaxValidTimeMs(LivePlayEnforceIntervalSetting.DEFAULT);
                LJLLLL = pes.LIZLLL;
                LJLLLLLL = pes.LIZJ;
                C44061oA.LJLJJL = false;
                boolean z3 = pes.LJ;
                C36381bm c36381bm = C36381bm.LJIL;
                c36381bm.LJIIIIZZ();
                this.LJLIL.getClass();
                c36381bm.LJIJ = this.LJLIL.LJII;
                if (new Random().nextInt(1000) < 0) {
                    z = true;
                } else {
                    z = false;
                }
                c36381bm.LJIJI = z;
                this.LJLIL.getClass();
                C45439HsR.LJLJI = this.LJLIL.LJIIIIZZ;
                if (z3) {
                    C44061oA c44061oA = new C44061oA();
                    PH3.LJIIL = c44061oA;
                    if (new Random().nextFloat() < pes.LJFF) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    PH3.LJIIJJI = z2;
                    PFC.LJLL = new PEU(c44061oA);
                    if (Build.VERSION.SDK_INT < 24 || !this.LJLIL.LJII) {
                        c36381bm.LIZLLL(c44061oA);
                    }
                    C36381bm.LJJ = c44061oA;
                }
                initEvilMethodTraceInject();
                C63081OpJ.LLILZLL();
                C09970aH.LJIIZILJ = false;
                C09970aH.LJIJ = false;
                C09970aH.LIZLLL = System.nanoTime() - nanoTime;
            }
            if (C09970aH.LJII()) {
                if (this.LJLL) {
                    DoctorManager.getInstance().LIZIZ("APM_INIT", null);
                } else {
                    DoctorManager.getInstance().LIZIZ("APM_INIT_OTHER_PROCESS", null);
                }
            }
            if (C80036Vb6.LJLIL && C80036Vb6.LJLILLLLZI != null) {
                C80036Vb6.LJIIIIZZ("apm_debug", "apm_init");
            }
            C61491OBj.LJJZZIII(context);
            C09970aH.LJJ = true;
        }
    }

    @Override // X.InterfaceC64103PDv
    public final void LJ(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        boolean z2 = false;
        if (optJSONObject != null && !C09970aH.LJII()) {
            this.LJLLJ = optJSONObject.optBoolean("enable_active_upload_alog", true);
            if (optJSONObject.optInt("enable_active_capture_trace_upload_alog", 0) == 1) {
                z2 = true;
            }
            this.LJLLL = z2;
            return;
        }
        this.LJLLJ = true;
        this.LJLLL = false;
    }
}
