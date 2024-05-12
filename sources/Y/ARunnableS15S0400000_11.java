package Y;

import X.AbstractC67354Qc2;
import X.AbstractC67375QcN;
import X.C06130Lx;
import X.C09970aH;
import X.C16880lQ;
import X.C171096nZ;
import X.C17N;
import X.C217818gj;
import X.C25410zB;
import X.C36381bm;
import X.C43001GuD;
import X.C63985P9h;
import X.C64009PAf;
import X.C64020PAq;
import X.C64089PDh;
import X.C64092PDk;
import X.C64102PDu;
import X.C64113PEf;
import X.C64124PEq;
import X.C64125PEr;
import X.C64127PEt;
import X.C64129PEv;
import X.C64130PEw;
import X.C64131PEx;
import X.C64185PGz;
import X.C64797Pbt;
import X.C65102Pgo;
import X.C67376QcO;
import X.C67384QcW;
import X.C68494QuQ;
import X.C68496QuS;
import X.C72545SdZ;
import X.C78866UxK;
import X.C84134X0g;
import X.EnumC84152X0y;
import X.F9J;
import X.F9U;
import X.InterfaceC37591dj;
import X.InterfaceC54346LUo;
import X.InterfaceC64016PAm;
import X.InterfaceC64132PEy;
import X.InterfaceC65104Pgq;
import X.InterfaceC67412Qcy;
import X.InterfaceC68509Quf;
import X.OIO;
import X.PEF;
import X.PEL;
import X.PES;
import X.PFS;
import X.PH0;
import X.PH2;
import X.PH3;
import X.PH7;
import X.PH9;
import X.UC7;
import X.WM7;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.services.apm.api.IHttpService;
import com.ss.android.ttvecamera.TECameraCapture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS15S0400000_11 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        PackageInfo packageInfo;
        C64009PAf c64009PAf = (C64009PAf) this.l3;
        Context context = (Context) this.l0;
        JSONObject jSONObject = (JSONObject) this.l1;
        InterfaceC64016PAm interfaceC64016PAm = (InterfaceC64016PAm) this.l2;
        c64009PAf.getClass();
        if (context != null && jSONObject != null) {
            c64009PAf.LJIJ = true;
            c64009PAf.LIZ = C16880lQ.LLLLL(context);
            c64009PAf.LIZIZ = jSONObject;
            try {
                jSONObject.put("aid", c64009PAf.LJIJJLI);
                c64009PAf.LIZIZ.put("os", "Android");
                c64009PAf.LIZIZ.put("device_platform", "android");
                c64009PAf.LIZIZ.put("os_version", Build.VERSION.RELEASE);
                c64009PAf.LIZIZ.put("os_api", Build.VERSION.SDK_INT);
                c64009PAf.LIZIZ.put("device_model", Build.MODEL);
                c64009PAf.LIZIZ.put("device_brand", Build.BRAND);
                c64009PAf.LIZIZ.put("device_manufacturer", Build.MANUFACTURER);
                c64009PAf.LIZIZ.put("sdkmonitor_version", "2.0.42-rc.0-ttp");
                c64009PAf.LIZIZ.put("monitor_from", "sdk");
                if (TextUtils.isEmpty(c64009PAf.LIZIZ.optString("package_name"))) {
                    c64009PAf.LIZIZ.put("package_name", context.getPackageName());
                }
                JSONObject jSONObject2 = null;
                if (TextUtils.isEmpty(c64009PAf.LIZIZ.optString("version_name"))) {
                    packageInfo = C16880lQ.LLLLLLZ(c64009PAf.LIZ.getPackageManager(), c64009PAf.LIZ.getPackageName(), 0);
                    c64009PAf.LIZIZ.put("version_name", packageInfo.versionName);
                } else {
                    packageInfo = null;
                }
                if (TextUtils.isEmpty(c64009PAf.LIZIZ.optString("version_code"))) {
                    if (packageInfo == null) {
                        packageInfo = C16880lQ.LLLLLLZ(c64009PAf.LIZ.getPackageManager(), c64009PAf.LIZ.getPackageName(), 0);
                    }
                    c64009PAf.LIZIZ.put("version_code", packageInfo.versionCode);
                }
                c64009PAf.LJIILJJIL = interfaceC64016PAm;
                if (interfaceC64016PAm == null) {
                    c64009PAf.LJIILJJIL = new C64020PAq();
                }
                Map<String, String> commonParams = c64009PAf.LJIILJJIL.getCommonParams();
                c64009PAf.LJIILL = commonParams;
                if (commonParams == null) {
                    c64009PAf.LJIILL = new HashMap();
                }
                c64009PAf.LJIL = TextUtils.equals(c64009PAf.LJIILL.get("oversea"), "1");
                c64009PAf.LJIILL.put("aid", c64009PAf.LJIJJLI);
                c64009PAf.LJIILL.put("device_id", c64009PAf.LIZIZ.optString("device_id"));
                c64009PAf.LJIILL.put("device_platform", "android");
                c64009PAf.LJIILL.put("os", "Android");
                c64009PAf.LJIILL.put("package_name", c64009PAf.LIZIZ.optString("package_name"));
                c64009PAf.LJIILL.put("channel", c64009PAf.LIZIZ.optString("channel"));
                c64009PAf.LJIILL.put("app_version", c64009PAf.LIZIZ.optString("app_version"));
                c64009PAf.LJIILL.put("sdkmonitor_version", "2.0.42-rc.0-ttp");
                c64009PAf.LJIILL.put("minor_version", "1");
                c64009PAf.LJIILL.put("host_aid", c64009PAf.LIZIZ.optString("host_aid"));
                synchronized (C63985P9h.class) {
                    if (C63985P9h.LIZ == null) {
                        C63985P9h.LIZ = context;
                    }
                }
                Map<String, String> map = c64009PAf.LJIILL;
                if (map != null && !map.isEmpty()) {
                    if (C63985P9h.LIZJ == null) {
                        C63985P9h.LIZJ = new HashMap();
                    }
                    ((HashMap) C63985P9h.LIZJ).putAll(map);
                    ((HashMap) C63985P9h.LIZJ).remove("aid");
                }
                String str = c64009PAf.LJIJJLI;
                JSONObject jSONObject3 = c64009PAf.LIZIZ;
                if (jSONObject3 != null) {
                    try {
                        jSONObject2 = new JSONObject(jSONObject3.toString());
                    } catch (Exception unused) {
                        jSONObject2 = jSONObject3;
                    }
                }
                C63985P9h.LJ(str, jSONObject2);
                c64009PAf.LJII = (IHttpService) C171096nZ.LIZ(IHttpService.class);
                c64009PAf.LJII();
            } catch (Exception unused2) {
            }
        }
        if (((C64009PAf) this.l3).LJIJI) {
            C64009PAf c64009PAf2 = (C64009PAf) this.l3;
            c64009PAf2.LJIJJ.LIZIZ(c64009PAf2);
        }
    }

    public final void LIZ$2() {
        try {
            if (C17N.LJJIIZI((List) this.l0)) {
                return;
            }
            float f = PH9.LIZ;
            int i = PH9.LIZIZ;
            int i2 = i - 1;
            int i3 = i2 + 1;
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            for (Integer num : (List) this.l0) {
                int intValue = num.intValue() / ((int) (f * 100.0f));
                if (intValue > 0) {
                    i5 += intValue;
                }
                if (num.intValue() >= 833.0d) {
                    i6 += num.intValue() / 100;
                }
                int max = Math.max(Math.min(intValue, i2), i4);
                iArr[max] = iArr[max] + 1;
                iArr2[max] = (int) ((num.intValue() / 100.0d) + iArr2[max]);
                i7 += num.intValue() / 100;
                i4 = 0;
            }
            int size = ((((List) this.l0).size() * 100) * i) / (((List) this.l0).size() + i5);
            PH3 ph3 = (PH3) this.l3;
            Map map = (Map) this.l1;
            float f2 = (float) (size / 100.0d);
            PH7 ph7 = ph3.LIZLLL;
            if (ph7 != null) {
                ph7.LIZLLL(f2);
            }
            C64185PGz c64185PGz = PH2.LIZ;
            String str = ph3.LIZ;
            c64185PGz.getClass();
            F9U.LIZ.LIZJ(new PH0(c64185PGz, str, map, f2));
            int size2 = (int) ((((List) this.l0).size() + i5) * f);
            JSONObject jSONObject = new JSONObject();
            for (int i8 = 0; i8 <= i2; i8++) {
                if (iArr[i8] > 0) {
                    jSONObject.put(String.valueOf(i8), iArr[i8]);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            for (int i9 = 0; i9 <= i2; i9++) {
                if (iArr2[i9] > 0.1d) {
                    jSONObject2.put(String.valueOf(i9), iArr2[i9]);
                }
            }
            if (((PH3) this.l3).LJ != null) {
                ((PH3) this.l3).LJ.LIZJ(C43001GuD.LJI(jSONObject));
            }
            ((PH3) this.l3).getClass();
            ((PH3) this.l3).getClass();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(WM7.SCENE_SERVICE, ((PH3) this.l3).LIZ);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("total_scroll_time", i7);
            jSONObject4.put("dur", size2);
            jSONObject4.put("hitch_dur_dic", jSONObject2);
            jSONObject4.put("hitch_dur", i6);
            StringBuilder LIZ = X1D.LIZ();
            ((PH3) this.l3).getClass();
            LIZ.append(0.0f);
            LIZ.append(",");
            ((PH3) this.l3).getClass();
            LIZ.append(0.0f);
            jSONObject4.put("velocity", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            ((PH3) this.l3).getClass();
            LIZ2.append(0.0f);
            LIZ2.append(",");
            ((PH3) this.l3).getClass();
            LIZ2.append(0.0f);
            jSONObject4.put("distance", X1D.LIZIZ(LIZ2));
            jSONObject4.put("frame_count", ((List) this.l0).size());
            jSONObject4.put("drop_count", i5);
            JSONObject jSONObject5 = ((PH3) this.l3).LJIIJ;
            if (jSONObject5 != null) {
                jSONObject4.put("extra", jSONObject5);
            }
            jSONObject4.put("drop_time_rate", 1.0f - ((((List) this.l0).size() * 1.0f) / ((int) (i7 / f))));
            PEF pef = new PEF("fps_drop", ((PH3) this.l3).LIZ, jSONObject, jSONObject3, jSONObject4);
            C78866UxK.LJLI(pef, true);
            pef.LJFF.put("refresh_rate", i);
            Map map2 = (Map) this.l1;
            if (map2 != null && !map2.isEmpty()) {
                for (Map.Entry entry : ((Map) this.l1).entrySet()) {
                    pef.LJFF.put((String) entry.getKey(), entry.getValue());
                }
            }
            C64089PDh.LJIIJ().LIZLLL(pef);
        } catch (Exception e) {
            if (C09970aH.LJII()) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LIZ$3() {
        InterfaceC68509Quf LJIJ = ((C68494QuQ) this.l0).LIZLLL().LJIJ();
        List list = (List) this.l1;
        C68496QuS c68496QuS = (C68496QuS) LJIJ;
        c68496QuS.LIZ.LIZJ();
        try {
            c68496QuS.LIZIZ.LJ(list);
            c68496QuS.LIZ.LJIILLIIL();
            c68496QuS.LIZ.LJIIJJI();
            InterfaceC68509Quf LJIJ2 = ((C68494QuQ) this.l0).LIZLLL().LJIJ();
            List list2 = (List) this.l2;
            c68496QuS = (C68496QuS) LJIJ2;
            c68496QuS.LIZ.LIZJ();
            try {
                c68496QuS.LIZJ.LJ(list2);
                c68496QuS.LIZ.LJIILLIIL();
                c68496QuS.LIZ.LJIIJJI();
                InterfaceC68509Quf LJIJ3 = ((C68494QuQ) this.l0).LIZLLL().LJIJ();
                List<String> list3 = (List) this.l3;
                c68496QuS = (C68496QuS) LJIJ3;
                c68496QuS.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE from t_sync_cursor where sync_id in (");
                C217818gj.LIZ(list3.size(), sb);
                sb.append(")");
                InterfaceC37591dj LJ = c68496QuS.LIZ.LJ(sb.toString());
                int i = 1;
                for (String str : list3) {
                    if (str == null) {
                        LJ.LLLLLLJ(i);
                    } else {
                        LJ.LJJII(i, str);
                    }
                    i++;
                }
                c68496QuS.LIZ.LIZJ();
                try {
                    LJ.LJIJJLI();
                    c68496QuS.LIZ.LJIILLIIL();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.1HO] */
    public final void LIZ$0() {
        int i;
        boolean z;
        C09970aH.LJII();
        ((ApmDelegate) this.l3).LJLJJLL.registerConfigListener(OIO.LIZ);
        ((PES) this.l0).getClass();
        C64092PDk.LLFFF = true;
        ((PES) this.l0).getClass();
        C64113PEf.LIZ.LIZ().getClass();
        C64092PDk.LLFF = 30000L;
        Context context = (Context) this.l1;
        if (!C64102PDu.LIZ) {
            C64102PDu.LIZ = true;
            if (C64102PDu.LIZIZ == null) {
                C64102PDu.LIZIZ = F9J.LIZIZ(context, 0, "monitor_switch_config");
            }
            SharedPreferences sharedPreferences = C64102PDu.LIZIZ;
            if (sharedPreferences != null) {
                int i2 = sharedPreferences.getInt("monitor_switch_config_first_flag", 0);
                C64102PDu.LIZJ = i2;
                C64102PDu.LIZLLL = i2;
                C64102PDu.LJ = C64102PDu.LIZIZ.getLong("monitor_switch_config_atrace_flag", 0L);
            }
        }
        if (((ApmDelegate) this.l3).LJLL) {
            C36381bm c36381bm = C36381bm.LJIL;
            c36381bm.LJIILIIL.LIZ.start();
            c36381bm.LJIILL.LIZ.start();
            if (C64102PDu.LIZ(256)) {
                i = 2;
            } else {
                i = 0;
            }
            if (C64102PDu.LIZ(512)) {
                i |= 4;
            }
            if (C09970aH.LJII() && i > 0) {
                i |= 8;
            }
            if (C09970aH.LJII()) {
                UC7.LIZLLL("buildSocketModeFromSwitch=", i);
            }
            C64127PEt c64127PEt = new C64127PEt();
            long j = C64102PDu.LJ;
            c64127PEt.LJFF = j;
            if (j != 0 && C64102PDu.LIZ(2)) {
                z = true;
            } else {
                z = false;
            }
            c64127PEt.LIZ = z;
            ((PES) this.l0).getClass();
            c64127PEt.LIZIZ = false;
            c64127PEt.LJ = C64102PDu.LIZ(64);
            c64127PEt.LJII = 0;
            c64127PEt.LIZJ = false;
            c64127PEt.LIZLLL = C64102PDu.LIZ(128);
            c64127PEt.LJI = ((-536870912) & C64102PDu.LIZJ) >>> 29;
            C64125PEr LIZLLL = C64125PEr.LIZLLL();
            Context context2 = C09970aH.LIZ;
            C64124PEq c64124PEq = new C64124PEq(c64127PEt);
            synchronized (LIZLLL) {
                LIZLLL.LJII(c64124PEq.LJII);
                if (LIZLLL.LIZIZ) {
                    LIZLLL.LJI(c64124PEq);
                } else if (C64125PEr.LJFF(context2)) {
                    try {
                        if (C64125PEr.LJIIJJI) {
                            MonitorJni.doInit();
                        }
                    } catch (Throwable unused) {
                    }
                    LIZLLL.LJI(c64124PEq);
                    LIZLLL.LIZIZ = true;
                }
            }
            C64125PEr LIZLLL2 = C64125PEr.LIZLLL();
            for (int i3 = 0; i3 < ((CopyOnWriteArrayList) LIZLLL2.LIZ).size(); i3++) {
                ((PEL) ListProtector.get(LIZLLL2.LIZ, i3)).LIZJ();
            }
            LIZLLL2.LIZJ = true;
            C64125PEr LIZLLL3 = C64125PEr.LIZLLL();
            ((ApmDelegate) this.l3).LJLIL.getClass();
            LIZLLL3.getClass();
        } else {
            C64125PEr.LJFF(C09970aH.LIZ);
        }
        C06130Lx.LIZ().getClass();
        ?? r1 = new InterfaceC64132PEy() { // from class: X.1HO
        };
        if (PFS.LIZ != null) {
            C64129PEv c64129PEv = new C64129PEv(r1);
            if (C64131PEx.LIZ != null) {
                Npth.addAttachUserData(new C64130PEw(c64129PEv), CrashType.ALL);
            }
        }
        Runnable runnable = (Runnable) this.l2;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void run$0(ARunnableS15S0400000_11 aRunnableS15S0400000_11) {
        boolean LIZ;
        try {
            aRunnableS15S0400000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS15S0400000_11 aRunnableS15S0400000_11) {
        boolean LIZ;
        try {
            aRunnableS15S0400000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS15S0400000_11 aRunnableS15S0400000_11) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS15S0400000_11.l3).switchCamera((TECameraCapture) aRunnableS15S0400000_11.l0, (C84134X0g) aRunnableS15S0400000_11.l1, (Cert) aRunnableS15S0400000_11.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS15S0400000_11 aRunnableS15S0400000_11) {
        boolean LIZ;
        try {
            aRunnableS15S0400000_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS15S0400000_11 aRunnableS15S0400000_11) {
        boolean LIZ;
        try {
            aRunnableS15S0400000_11.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS15S0400000_11 aRunnableS15S0400000_11) {
        final C67384QcW c67384QcW = (C67384QcW) aRunnableS15S0400000_11.l0;
        final AbstractC67354Qc2 abstractC67354Qc2 = (AbstractC67354Qc2) aRunnableS15S0400000_11.l1;
        C72545SdZ c72545SdZ = (C72545SdZ) aRunnableS15S0400000_11.l2;
        AbstractC67375QcN abstractC67375QcN = (AbstractC67375QcN) aRunnableS15S0400000_11.l3;
        c67384QcW.getClass();
        try {
            InterfaceC67412Qcy interfaceC67412Qcy = c67384QcW.LIZJ.get(abstractC67354Qc2.LIZIZ());
            if (interfaceC67412Qcy == null) {
                String LLLZ = C16880lQ.LLLZ("Transport backend '%s' is not registered", new Object[]{abstractC67354Qc2.LIZIZ()});
                C67384QcW.LJFF.warning(LLLZ);
                new IllegalArgumentException(LLLZ);
                c72545SdZ.getClass();
            } else {
                final C67376QcO LIZIZ = interfaceC67412Qcy.LIZIZ(abstractC67375QcN);
                c67384QcW.LJ.LIZLLL(new InterfaceC54346LUo() { // from class: X.Qci
                    @Override // X.InterfaceC54346LUo
                    public final Object execute() {
                        C67384QcW c67384QcW2 = C67384QcW.this;
                        AbstractC67354Qc2 abstractC67354Qc22 = abstractC67354Qc2;
                        c67384QcW2.LIZLLL.r(abstractC67354Qc22, LIZIZ);
                        c67384QcW2.LIZ.LIZ(abstractC67354Qc22, 1);
                        return null;
                    }
                });
                c72545SdZ.getClass();
            }
        } catch (Exception e) {
            Logger logger = C67384QcW.LJFF;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error scheduling event ");
            LIZ.append(e.getMessage());
            logger.warning(X1D.LIZIZ(LIZ));
            c72545SdZ.getClass();
        }
    }

    public static final void run$6(ARunnableS15S0400000_11 aRunnableS15S0400000_11) {
        boolean LIZ;
        try {
            Iterator it = ((ArrayList) ((C65102Pgo) aRunnableS15S0400000_11.l0).LJLJJL).iterator();
            while (it.hasNext()) {
                ((InterfaceC65104Pgq) it.next()).LJIIIIZZ((Request) aRunnableS15S0400000_11.l1, (C64797Pbt) aRunnableS15S0400000_11.l2, (Throwable) aRunnableS15S0400000_11.l3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS15S0400000_11(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
    }

    public ARunnableS15S0400000_11(PH3 ph3, List list, Map map, C25410zB c25410zB, List list2, int i) {
        this.$t = i;
        this.l3 = ph3;
        this.l0 = list;
        this.l1 = map;
        this.l2 = list2;
    }
}
