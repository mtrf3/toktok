package Y;

import X.C141335gf;
import X.C16880lQ;
import X.C36836Ecy;
import X.C36837Ecz;
import X.C38485F8n;
import X.C3C5;
import X.C64329PMn;
import X.C64330PMo;
import X.C64401PPh;
import X.C65926Pu6;
import X.C65932PuC;
import X.C65935PuF;
import X.C76800UCe;
import X.C77275UUl;
import X.EnumC84152X0y;
import X.InterfaceC64332PMq;
import X.InterfaceC66223Pyt;
import X.P7T;
import X.PMB;
import X.PVC;
import X.QOP;
import X.QOS;
import X.X1D;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.SkynetConfig;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.common.interfaces.IStore;
import com.ss.android.ttvecamera.TECameraCapture;
import defpackage.i0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public class ARunnableS10S0210000_11 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        if (((Context) this.l0) == null) {
            return;
        }
        WeakReference<Context> weakReference = ((QOS) this.l1).LIZJ;
        if (weakReference == null || weakReference.get() == null) {
            ((QOS) this.l1).LIZJ = new WeakReference<>(C16880lQ.LLLLL((Context) this.l0));
        }
        try {
            ComponentName componentName = new ComponentName((Context) this.l0, (Class<?>) WsChannelService.class);
            QOP qop = new QOP();
            if (this.z2) {
                i = 9;
            } else {
                i = 11;
            }
            qop.LIZJ = i;
            ((QOS) this.l1).LJ.offer(qop);
            ((QOS) this.l1).LJ(componentName);
        } catch (Throwable unused) {
        }
    }

    public final void LIZ$1() {
        InterfaceC66223Pyt interfaceC66223Pyt;
        long j;
        HashSet hashSet;
        String str;
        String str2;
        String str3;
        boolean z;
        int length;
        BufferedReader bufferedReader;
        String LIZ = C36836Ecy.LIZ((Context) this.l0);
        String LJFF = i0.LJFF("key_skynet_analyze_timestamp_", LIZ);
        long currentTimeMillis = System.currentTimeMillis();
        IStore store = NetworkComponent.INSTANCE.getStore();
        if (store != null) {
            interfaceC66223Pyt = store.getRepo("sky_eye_repo", 1);
        } else {
            interfaceC66223Pyt = null;
        }
        if (interfaceC66223Pyt != null) {
            j = interfaceC66223Pyt.getLong(LJFF);
        } else {
            j = 0;
        }
        if (currentTimeMillis - j >= ((SkynetConfig) this.l1).analyzeIntervalTime) {
            if (interfaceC66223Pyt != null) {
                interfaceC66223Pyt.putLong(LJFF, currentTimeMillis);
            }
            Context context = (Context) this.l0;
            if (context == null || C16880lQ.LLIIIL(context) == null) {
                hashSet = new HashSet();
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(C16880lQ.LLIIIL(context).getAbsolutePath());
                String str4 = File.separator;
                LIZ2.append(str4);
                LIZ2.append("skynet:");
                LIZ2.append(C36837Ecz.LIZ(context));
                File file = new File(X1D.LIZIZ(LIZ2));
                if (!file.exists()) {
                    hashSet = new HashSet();
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(file.getAbsolutePath());
                    LIZ3.append(str4);
                    LIZ3.append("dns_dump");
                    File file2 = new File(X1D.LIZIZ(LIZ3));
                    if (!file2.exists()) {
                        hashSet = new HashSet();
                    } else {
                        long[] jArr = {0};
                        File[] listFiles = file2.listFiles(new PMB(jArr));
                        if (listFiles == null || listFiles.length <= 1) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("less = ");
                            if (listFiles == null) {
                                length = 0;
                            } else {
                                length = listFiles.length;
                            }
                            LIZ4.append(length);
                            X1D.LIZIZ(LIZ4);
                            hashSet = new HashSet();
                        } else {
                            File[] fileArr = new File[listFiles.length - 1];
                            int i = 0;
                            for (File file3 : listFiles) {
                                if (file3.lastModified() < jArr[0]) {
                                    fileArr[i] = file3;
                                    i++;
                                }
                            }
                            hashSet = new HashSet();
                            for (File file4 : fileArr) {
                                try {
                                    bufferedReader = new BufferedReader(new FileReader(file4));
                                    while (true) {
                                        try {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null) {
                                                break;
                                            } else {
                                                hashSet.add(readLine.split(",")[1]);
                                            }
                                        } catch (Exception unused) {
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                bufferedReader.close();
                                            } catch (Exception unused2) {
                                            }
                                            throw th;
                                        }
                                    }
                                    C16880lQ.LLLZZIL(file4);
                                } catch (Exception unused3) {
                                    bufferedReader = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = null;
                                }
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused4) {
                                }
                            }
                        }
                    }
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String domain = (String) next;
                Set<String> set = ((SkynetConfig) this.l1).domainAllowList;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    for (String str5 : set) {
                        o.LJIIIIZZ(domain, "domain");
                        if (ujb.o.LJJJJ(domain, str5, false)) {
                            break;
                        }
                    }
                }
                arrayList.add(next);
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            if ((((SkynetConfig) this.l1).domainBlockList.isEmpty() || this.z2) && (!arrayList.isEmpty())) {
                jSONObject.put("type", "dns_domain");
                jSONObject.put("sdk_version", "5.2.0-rc.4");
                NetworkComponent networkComponent = NetworkComponent.INSTANCE;
                SettingsModel settings = networkComponent.getSettings();
                if (settings != null) {
                    str = settings.version;
                } else {
                    str = null;
                }
                jSONObject.put("settings_version", str);
                jSONObject.put("action", "report");
                C65935PuF appInfo = networkComponent.getAppInfo();
                if (appInfo != null) {
                    str2 = appInfo.LJLJLJ;
                } else {
                    str2 = null;
                }
                jSONObject.put("network_env", str2);
                C65935PuF appInfo2 = networkComponent.getAppInfo();
                if (appInfo2 != null) {
                    str3 = appInfo2.LJLJLLL;
                } else {
                    str3 = null;
                }
                jSONObject.put("network_lane", str3);
                C65935PuF appInfo3 = networkComponent.getAppInfo();
                if (appInfo3 != null) {
                    z = appInfo3.LJLJJL;
                } else {
                    z = false;
                }
                jSONObject.put("is_debug", z);
                jSONObject.put("report_tags", C77275UUl.LJII("analyze"));
                jSONObject2.put("origin_size", hashSet.size());
                jSONObject2.put("report_size", arrayList.size());
                jSONObject2.put("parse_cost", currentTimeMillis2 - currentTimeMillis);
                jSONObject2.put("filter_cost", currentTimeMillis3 - currentTimeMillis2);
                jSONObject3.put("domains", arrayList);
                jSONObject3.put("analyze_sample_rate", ((SkynetConfig) this.l1).sampleRate);
                IEventMonitor eventMonitor = networkComponent.getEventMonitor();
                if (eventMonitor != null) {
                    eventMonitor.monitorEvent("pns_network", jSONObject, jSONObject2, jSONObject3);
                }
            }
            C65926Pu6.LIZIZ("Helios:Network-Skynet", new C65932PuC(LIZ, true, currentTimeMillis, j, jSONObject, jSONObject2, jSONObject3, hashSet), 4, null, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$2() {
        String LLLFFI;
        boolean z;
        Object LIZ;
        String LLLFFI2;
        ComponentName componentName;
        boolean z2;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        int i = 0;
        if (this.z2) {
            Object LLIZ = C16880lQ.LLIZ("activity", (Application) this.l0);
            if (LLIZ != null) {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) LLIZ).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        componentName = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = next;
                        if (runningAppProcessInfo2.uid == Process.myUid() && runningAppProcessInfo2.importance <= 100) {
                            if (next != null) {
                                z2 = true;
                            }
                        }
                    }
                    z2 = false;
                    Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            runningAppProcessInfo = it2.next();
                            if (runningAppProcessInfo.pid == Process.myPid()) {
                                break;
                            }
                        } else {
                            runningAppProcessInfo = null;
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo3 = runningAppProcessInfo;
                    if (runningAppProcessInfo3 != null) {
                        i = runningAppProcessInfo3.importanceReasonCode;
                    }
                    C64401PPh.LJ = i;
                    if (runningAppProcessInfo3 != null) {
                        componentName = runningAppProcessInfo3.importanceReasonComponent;
                    }
                    C64401PPh.LJFF = componentName;
                    z = z2;
                } else {
                    try {
                        LLLFFI2 = C38485F8n.LLLFFI(new File("/proc/self/oom_adj"), PVC.LIZ);
                        if (CastIntegerProtector.parseInt(s.LJZI(LLLFFI2).toString()) <= 1) {
                            i = 1;
                        }
                        LIZ = C76800UCe.LIZ;
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    z = i;
                    C3C5.m6boximpl(LIZ);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
        } else {
            LLLFFI = C38485F8n.LLLFFI(new File("/proc/self/oom_adj"), PVC.LIZ);
            if (CastIntegerProtector.parseInt(s.LJZI(LLLFFI).toString()) <= 1) {
                i = 1;
            }
            z = i;
        }
        Application ctx = (Application) this.l0;
        boolean z3 = this.z2;
        o.LJIIIZ(ctx, "ctx");
        if (C64329PMn.LJI == null) {
            C64329PMn.LIZLLL = z;
            C64329PMn.LJI = ctx;
            C64329PMn.LJII = z3;
            if (!z3) {
                C64330PMo c64330PMo = C64330PMo.LIZLLL;
                c64330PMo.getClass();
                if (C64330PMo.LIZ == null) {
                    synchronized (c64330PMo) {
                        if (C64330PMo.LIZ == null) {
                            File file = new File(C16880lQ.LLIIJLIL(ctx), "process_status");
                            C64330PMo.LIZIZ = file;
                            file.mkdirs();
                            File file2 = new File(C64330PMo.LIZIZ, String.valueOf(Process.myPid()));
                            C64330PMo.LIZJ = file2;
                            if (!file2.isFile()) {
                                File file3 = C64330PMo.LIZJ;
                                o.LJI(file3);
                                file3.createNewFile();
                                File file4 = C64330PMo.LIZJ;
                                o.LJI(file4);
                                C16880lQ.LLZ(file4);
                            }
                            C64330PMo.LIZ = new FileOutputStream(C64330PMo.LIZJ).getChannel().lock();
                            C64330PMo.LIZ();
                        }
                    }
                }
            }
            C64329PMn.LIZ();
            C64329PMn.LIZLLL(C64329PMn.LIZLLL);
        }
        C64401PPh.LIZLLL = z;
        C64401PPh.LIZIZ.set(true);
        Set<InterfaceC64332PMq> initCallbacks = C64401PPh.LJI;
        o.LJIIIIZZ(initCallbacks, "initCallbacks");
        Iterator<InterfaceC64332PMq> it3 = initCallbacks.iterator();
        while (it3.hasNext()) {
            it3.next().LIZ();
        }
        C64401PPh.LJI.clear();
    }

    public static final void run$0(ARunnableS10S0210000_11 aRunnableS10S0210000_11) {
        boolean LIZ;
        try {
            aRunnableS10S0210000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS10S0210000_11 aRunnableS10S0210000_11) {
        boolean LIZ;
        try {
            aRunnableS10S0210000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS10S0210000_11 aRunnableS10S0210000_11) {
        boolean LIZ;
        try {
            P7T.LIZ("TECameraServer-post-stop");
            ((EnumC84152X0y) aRunnableS10S0210000_11.l1).stop((TECameraCapture) aRunnableS10S0210000_11.l0, aRunnableS10S0210000_11.z2);
            if (aRunnableS10S0210000_11.z2) {
                ((EnumC84152X0y) aRunnableS10S0210000_11.l1).mCameraClientCondition.open();
            }
            P7T.LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS10S0210000_11 aRunnableS10S0210000_11) {
        boolean LIZ;
        try {
            aRunnableS10S0210000_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS10S0210000_11(QOS qos, Context context, int i) {
        this.$t = i;
        this.l1 = qos;
        this.l0 = context;
        this.z2 = true;
    }

    public ARunnableS10S0210000_11(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
