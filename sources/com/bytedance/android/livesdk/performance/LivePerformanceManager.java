package com.bytedance.android.livesdk.performance;

import X.B57;
import X.BGZ;
import X.BLB;
import X.BTA;
import X.BZI;
import X.C03880Dg;
import X.C07250Qf;
import X.C0H1;
import X.C0NB;
import X.C15380j0;
import X.C15510jD;
import X.C15610jN;
import X.C16880lQ;
import X.C221108m2;
import X.C278417k;
import X.C28787BRn;
import X.C29044Baa;
import X.C29051Bah;
import X.C29223BdT;
import X.C29306Beo;
import X.C31023CFn;
import X.C31024CFo;
import X.C31026CFq;
import X.C31028CFs;
import X.C31032CFw;
import X.C31033CFx;
import X.C31034CFy;
import X.C31035CFz;
import X.C38995FSd;
import X.C39187FZn;
import X.C39188FZo;
import X.C39519Ff9;
import X.C3O;
import X.C5H3;
import X.C61898ORa;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C74838TYs;
import X.C76800UCe;
import X.C770930v;
import X.C771030w;
import X.C78857UxB;
import X.C78862UxG;
import X.CGN;
import X.CN1;
import X.EnumC221088m0;
import X.InterfaceC06390Mx;
import X.InterfaceC30442Bx8;
import X.InterfaceC31013CFd;
import X.InterfaceC88472Yns;
import X.O6R;
import X.OSZ;
import X.RunnableC31025CFp;
import X.X1D;
import Y.ACallableS108S0100000_5;
import Y.AObjectS47S0101000_2;
import Y.ARunnableS41S0100000_5;
import Y.IDRunnableS6S1000000;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.function.RoomFunctionService;
import com.bytedance.android.livesdk.game.setting.EnableCalculateOcrToClientDurationSwitcher;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnvLightCaptureSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkHeartBeatReportOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorReportSetting;
import com.bytedance.android.livesdk.livesetting.other.LivePerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.CollectPerformanceAfterEnterRoomSetting;
import com.bytedance.android.livesdk.livesetting.performance.CollectPerformanceDelayTime;
import com.bytedance.android.livesdk.livesetting.performance.LiveGpuOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveOpenStreamerGpuSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePerformanceSettingSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePullSdkGetDataIntervalSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchThreadPriorityOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;
import com.bytedance.android.livesdk.model.PerformanceSetting;
import com.bytedance.android.livesdk.model.message.GameOCRPingMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes6.dex */
public final class LivePerformanceManager implements InterfaceC06390Mx, SensorEventListener {
    public static final C5H3<LivePerformanceManager> LLJJIJIIJIL = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C31033CFx.LJLIL);
    public boolean LJLIL;
    public LiveMode LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public String LJLJL = "";
    public String LJLJLJ = "";
    public final int LJLJLLL = 1;
    public final int LJLL = 2;
    public final int LJLLI = 3;
    public String LJLLILLLL;
    public final IHostPerformanceMonitor LJLLJ;
    public HandlerThread LJLLL;
    public final Handler LJLLLL;
    public Handler LJLLLLLL;
    public final PerformanceSetting LJLZ;
    public final boolean LJZ;
    public final C771030w LJZI;
    public float LJZL;
    public double LL;
    public float LLD;
    public Map<String, String> LLF;
    public Map<String, String> LLFF;
    public Map<String, Double> LLFFF;
    public Map<String, Long> LLFII;
    public float LLFZ;
    public int LLI;
    public long LLIFFJFJJ;
    public long LLII;
    public long LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public String LLIIJI;
    public Map<String, String> LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public final List<InterfaceC88472Yns<Map<String, String>, C76800UCe>> LLIIZ;
    public BLB LLIL;
    public final C29223BdT LLILII;
    public Sensor LLILIL;
    public String LLILL;
    public long LLILLIZIL;
    public InterfaceC88472Yns<? super Map<String, String>, C76800UCe> LLILLJJLI;
    public RoomFunctionService LLILLL;
    public CGN LLILZ;
    public final C62822Ol8 LLILZIL;
    public int LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public OSZ<Float, Float> LLJI;
    public int LLJIJIL;
    public AObjectS47S0101000_2 LLJILJIL;
    public WeakReference<InterfaceC31013CFd> LLJILJILJ;
    public final ARunnableS41S0100000_5 LLJILLL;
    public final ARunnableS41S0100000_5 LLJJ;
    public final ARunnableS41S0100000_5 LLJJI;
    public final ARunnableS41S0100000_5 LLJJIII;
    public final ARunnableS41S0100000_5 LLJJIJI;

    public final synchronized Handler LJIJI() {
        Handler handler;
        handler = new Handler(LJIJJ().getLooper());
        this.LJLLLLLL = handler;
        return handler;
    }

    public final synchronized HandlerThread LJIJJ() {
        HandlerThread handlerThread;
        handlerThread = this.LJLLL;
        if (handlerThread == null) {
            handlerThread = new HandlerThread("LivePerformanceManagerThread", 0);
            this.LJLLL = handlerThread;
            handlerThread.start();
        }
        return handlerThread;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    public static String LJII() {
        boolean z;
        float longProperty;
        JSONObject jSONObject = new JSONObject();
        try {
            C31024CFo c31024CFo = C31032CFw.LIZ;
            c31024CFo.LIZIZ();
            jSONObject.put("battery_level", c31024CFo.LJ);
            if (!LiveMonitorReportSetting.INSTANCE.getValue()) {
                jSONObject.put("temperature", c31024CFo.LIZLLL);
            }
            jSONObject.put("voltage", c31024CFo.LJIIIZ);
            jSONObject.put("battery_scale", c31024CFo.LJFF);
            jSONObject.put("health", c31024CFo.LJII);
            jSONObject.put("present", c31024CFo.LJIIIIZZ);
            jSONObject.put("charge_status", c31024CFo.LJI);
            Context LIZLLL = C15380j0.LIZLLL();
            boolean z2 = true;
            if (LIZLLL == null || C3O.LIZ(LIZLLL) == null) {
                z = false;
            } else {
                z = true;
            }
            float f = -1.0f;
            if (!z) {
                longProperty = -1.0f;
            } else {
                longProperty = ((float) C3O.LIZ(LIZLLL).getLongProperty(2)) / 1000.0f;
            }
            jSONObject.put("battery_current", longProperty);
            Context LIZLLL2 = C15380j0.LIZLLL();
            if (LIZLLL2 == null || C3O.LIZ(LIZLLL2) == null) {
                z2 = false;
            }
            if (z2) {
                f = ((float) C3O.LIZ(LIZLLL2).getLongProperty(3)) / 1000.0f;
            }
            jSONObject.put("battery_average", f);
            jSONObject.put("battery_energy", C3O.LIZIZ(C15380j0.LIZLLL()));
        } catch (Exception unused) {
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "batteryInfo.toString()");
        return jSONObject2;
    }

    public static boolean LJIL() {
        return C29306Beo.LJJIFFI(InterfaceC30442Bx8.LJJJJZI.LIZJ());
    }

    public final long LJI() {
        int i = this.LLILZLL;
        if (i <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/");
            LIZ.append(((Number) this.LLILZIL.getValue()).intValue());
            LIZ.append("/task/");
            String LIZIZ = X1D.LIZIZ(LIZ);
            String[] list = new File(LIZIZ).list();
            int i2 = 0;
            if (list == null) {
                i = 0;
            } else {
                C61898ORa.LJJIIJ(list);
                try {
                    int length = list.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        String str = list[i3];
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(LIZIZ);
                        LIZ2.append('/');
                        LIZ2.append(str);
                        LIZ2.append("/stat");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ2))), 100);
                        String load = bufferedReader.readLine();
                        bufferedReader.close();
                        o.LJIIIIZZ(load, "load");
                        if (s.LJJLIIIJL(load, "HeapTaskDaemon", 0, false, 6) < 0) {
                            i3++;
                        } else if (str != null) {
                            i2 = CastIntegerProtector.parseInt(str);
                        }
                    }
                    this.LLILZLL = i2;
                } catch (Throwable unused) {
                }
                i = this.LLILZLL;
            }
        }
        int myPid = Process.myPid();
        long j = -1;
        if (i == 0) {
            return -1L;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("/proc/");
        LIZ3.append(myPid);
        LIZ3.append("/stat");
        long LJIIIIZZ = LJIIIIZZ(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("/proc/");
        LIZ4.append(myPid);
        LIZ4.append("/task/");
        LIZ4.append(i);
        LIZ4.append("/stat");
        long LJIIIIZZ2 = LJIIIIZZ(X1D.LIZIZ(LIZ4));
        if (LJIIIIZZ != -1 && LJIIIIZZ2 != -1) {
            long j2 = this.LLIZLLLIL;
            if (j2 > 0) {
                long j3 = this.LLIZ;
                if (j3 > 0) {
                    j = ((LJIIIIZZ2 - j2) * 1000) / (LJIIIIZZ - j3);
                }
            }
            this.LLIZ = LJIIIIZZ;
            this.LLIZLLLIL = LJIIIIZZ2;
        }
        return j;
    }

    public final Map<String, String> LJIIJJI() {
        HashMap hashMap = new HashMap(2);
        if (this.LJZ) {
            if (this.LJLLJ != null) {
                if ((!this.LJLJI || LiveOpenStreamerGpuSetting.INSTANCE.getValue()) && PerformanceSampleSetting.INSTANCE.isReportGpu()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    IHostPerformanceMonitor iHostPerformanceMonitor = this.LJLLJ;
                    if (iHostPerformanceMonitor != null) {
                        double IZ = iHostPerformanceMonitor.IZ();
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        if (IZ > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                            if (!this.LJLJI) {
                                hashMap.put("gpu_cost", String.valueOf(currentTimeMillis2));
                            }
                            hashMap.put("gpu_usage_android", String.valueOf(IZ));
                        }
                    } else {
                        o.LJIJI("mPerformanceMonitor");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("mPerformanceMonitor");
                throw null;
            }
        }
        return hashMap;
    }

    public final JSONObject LJIILJJIL() {
        HashMap hashMap = new HashMap();
        LIZ(hashMap);
        Map<String, String> map = this.LLIIJLIL;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("cpu", this.LLIIIILZ);
        hashMap.put("pss", this.LLIIIJ);
        hashMap.put("thermal", this.LLIIIL);
        hashMap.put("stream", this.LLIIIZ);
        if (!this.LJLJI) {
            hashMap.put("battery", this.LLIIJI);
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final JSONObject LJIILL() {
        boolean z;
        boolean z2 = false;
        if (CollectPerformanceAfterEnterRoomSetting.INSTANCE.getEnable()) {
            if (this.LLIILII || this.LLIILZL) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return new JSONObject();
            }
        }
        if (System.currentTimeMillis() - this.LLIIII > LivePullSdkGetDataIntervalSettings.INSTANCE.getValue()) {
            z2 = true;
        }
        if (z2 || TextUtils.isEmpty(this.LLIIIJ)) {
            FutureTask futureTask = new FutureTask(new ACallableS108S0100000_5(this, 1));
            Handler handler = this.LJLLLLLL;
            if (handler == null) {
                handler = LJIJI();
            }
            handler.post(futureTask);
            try {
                Object obj = futureTask.get();
                if (obj != null) {
                    return (JSONObject) obj;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            } catch (Exception e) {
                C0NB.LJI("LivePerformanceManager", e);
            }
        }
        return LJIILJJIL();
    }

    public final String LJIIZILJ() {
        JSONObject LIZIZ;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.LJLJI) {
                BTA bta = (BTA) DataChannelGlobal.LJLJJI.mv0(C29051Bah.class);
                if (bta != null && (LIZIZ = bta.LIZIZ()) != null) {
                    if (!LiveMonitorReportSetting.INSTANCE.getValue()) {
                        jSONObject.put("preview_fps", LIZIZ.optDouble("render_fps:", -1.0d));
                    }
                    jSONObject.put("real_fps", LIZIZ.optDouble("push_client_fps:", -1.0d));
                    jSONObject.put("pull_cdn_ip", LIZIZ.optString("cdn_ip:", ""));
                    jSONObject.put("pull_play_url", LIZIZ.optString("url:", ""));
                    jSONObject.put("pull_download_speed", LIZIZ.optLong("download_Speed:", -1L));
                }
            } else {
                jSONObject.put("preview_fps", this.LLD);
                jSONObject.put("in_cap_fps", this.LJZL);
                jSONObject.put("real_fps", this.LL);
            }
        } catch (Exception unused) {
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "streamInfo.toString()");
        return jSONObject2;
    }

    public final void LJIJJLI() {
        if (!this.LJLZ.enable) {
            return;
        }
        Handler handler = this.LJLLLLLL;
        if (handler == null) {
            handler = LJIJI();
        }
        handler.postDelayed(new ARunnableS41S0100000_5(this, 326), 0L);
    }

    public final void LJJIIJ() {
        int i;
        String str;
        Integer num;
        OSZ<Float, Float> osz;
        if (!this.LJLZ.enable) {
            return;
        }
        C31024CFo c31024CFo = C31032CFw.LIZ;
        if (!c31024CFo.LJIIJJI) {
            c31024CFo.LIZIZ();
        }
        if (c31024CFo.LJIIJJI) {
            return;
        }
        Integer num2 = null;
        if (C15380j0.LIZLLL() == null) {
            i = c31024CFo.LJ;
        } else {
            Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, C15380j0.LIZLLL(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (LJJLIIIJILLIZJL != null) {
                c31024CFo.LIZ(LJJLIIIJILLIZJL);
            }
            i = c31024CFo.LJ;
        }
        int i2 = this.LLI;
        int i3 = i2 - i;
        if (i2 <= 0 || i <= 0 || i3 < 0 || i3 >= 100) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LLIFFJFJJ;
        double d = (((i3 * 1000) * 100) * 1.0d) / currentTimeMillis;
        HashMap hashMap = new HashMap();
        hashMap.put("room_type", LJIILLIIL(this.LJLILLLLZI));
        if (this.LJLJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LLI);
        LIZ.append("");
        hashMap.put("non_live_powder", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i);
        LIZ2.append("");
        hashMap.put("live_powder", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        hashMap.put("live_duration", C0H1.LIZJ(LIZ3, currentTimeMillis, "", LIZ3));
        String str2 = B57.LIZ.LIZLLL;
        if (str2 == null) {
            str2 = "-1";
        }
        hashMap.put("live_session_id", str2);
        long j = currentTimeMillis / 1000;
        if (j <= 0) {
            hashMap.put("battery_usage_rate", CardStruct.IStatusCode.DEFAULT);
        } else {
            hashMap.put("battery_usage_rate", String.valueOf(((this.LLI - i) * 100.0f) / ((float) j)));
        }
        hashMap.put("battery_usage_value", String.valueOf(this.LLI - i));
        hashMap.put("live_session_duration", String.valueOf(j));
        BZI LIZ4 = C28787BRn.LIZ("livesdk_performance_monitor_battery_drainage");
        LIZ4.LJJIFFI(hashMap);
        LIZ4.LJIJJLI("battery_drainage_rate", Double.valueOf(d));
        RoomFunctionService roomFunctionService = this.LLILLL;
        if (roomFunctionService != null) {
            num = Integer.valueOf(roomFunctionService.u4(this.LLII));
        } else {
            num = null;
        }
        LIZ4.LJIJJ(num, "server_heat_level");
        RoomFunctionService roomFunctionService2 = this.LLILLL;
        if (roomFunctionService2 != null) {
            num2 = Integer.valueOf(roomFunctionService2.F(this.LLII));
        }
        LIZ4.LJIJJ(num2, "client_heat_level");
        if (this.LJLJI && (osz = this.LLJI) != null) {
            LIZ4.LJIL("avg_qps", osz.getFirst());
            LIZ4.LJIL("max_qps", osz.getSecond());
        }
        LIZ4.LJIIZILJ();
        LIZ4.LJJIIJZLJL();
    }

    public final void LJJIIZI() {
        if (!CollectPerformanceAfterEnterRoomSetting.INSTANCE.getEnable()) {
            return;
        }
        this.LLIILII = false;
        Handler handler = this.LJLLLLLL;
        if (handler == null) {
            handler = LJIJI();
        }
        handler.removeCallbacks(this.LLJJIJI);
        this.LLIILZL = false;
        Handler handler2 = this.LJLLLLLL;
        if (handler2 == null) {
            handler2 = LJIJI();
        }
        handler2.postDelayed(this.LLJJIJI, CollectPerformanceDelayTime.INSTANCE.getDelayTime());
    }

    public final void LJJIJ() {
        Sensor defaultSensor;
        if (!this.LJLZ.enable || this.LLIIL) {
            return;
        }
        this.LLIIL = true;
        if (this.LJZ && ((!this.LJLJI || LiveOpenStreamerGpuSetting.INSTANCE.getValue()) && PerformanceSampleSetting.INSTANCE.isReportGpu())) {
            Handler handler = this.LJLLLLLL;
            if (handler == null) {
                handler = LJIJI();
            }
            handler.post(new ARunnableS41S0100000_5(this, 177));
        }
        Handler handler2 = this.LJLLLLLL;
        if (handler2 == null) {
            handler2 = LJIJI();
        }
        handler2.removeCallbacks(this.LLJJ);
        Handler handler3 = this.LJLLLLLL;
        if (handler3 == null) {
            handler3 = LJIJI();
        }
        handler3.post(this.LLJJ);
        if (this.LJLILLLLZI == LiveMode.VIDEO) {
            LiveEnvLightCaptureSetting liveEnvLightCaptureSetting = LiveEnvLightCaptureSetting.INSTANCE;
            if (!liveEnvLightCaptureSetting.enableControlGroup() && this.LJLJI) {
                Object LLILL = C16880lQ.LLILL(C15380j0.LIZLLL(), "sensor");
                o.LJII(LLILL, "null cannot be cast to non-null type android.hardware.SensorManager");
                SensorManager sensorManager = (SensorManager) LLILL;
                C03880Dg c03880Dg = new C03880Dg(2);
                Object[] objArr = {5};
                C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Sensor;", "-2643795989311580037");
                C39519Ff9 LIZJ = c03880Dg.LIZJ(100703, "android/hardware/SensorManager", "getDefaultSensor", sensorManager, objArr, "android.hardware.Sensor", c65300Pk0);
                if (LIZJ.LIZ) {
                    c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", null, objArr, sensorManager, c65300Pk0, false);
                    defaultSensor = (Sensor) LIZJ.LIZIZ;
                } else {
                    defaultSensor = sensorManager.getDefaultSensor(5);
                    c03880Dg.LIZIZ(100703, "android/hardware/SensorManager", "getDefaultSensor", defaultSensor, objArr, sensorManager, c65300Pk0, true);
                }
                this.LLILIL = defaultSensor;
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415491, "bpea-monitor_environment_brightness");
                if (liveEnvLightCaptureSetting.enableGroup1()) {
                    C39187FZn c39187FZn = C39188FZo.LIZ;
                    Sensor sensor = this.LLILIL;
                    c39187FZn.getClass();
                    C39187FZn.LIZJ(sensorManager, this, sensor, 3, LJJIIJ);
                } else if (liveEnvLightCaptureSetting.enableGroup2()) {
                    C39187FZn c39187FZn2 = C39188FZo.LIZ;
                    Sensor sensor2 = this.LLILIL;
                    c39187FZn2.getClass();
                    C39187FZn.LIZJ(sensorManager, this, sensor2, 15000000, LJJIIJ);
                } else if (liveEnvLightCaptureSetting.enableGroup3()) {
                    C39187FZn c39187FZn3 = C39188FZo.LIZ;
                    Sensor sensor3 = this.LLILIL;
                    c39187FZn3.getClass();
                    C39187FZn.LIZJ(sensorManager, this, sensor3, 200000000, LJJIIJ);
                } else if (liveEnvLightCaptureSetting.enableGroup4()) {
                    C39187FZn c39187FZn4 = C39188FZo.LIZ;
                    Sensor sensor4 = this.LLILIL;
                    c39187FZn4.getClass();
                    C39187FZn.LIZJ(sensorManager, this, sensor4, 300000000, LJJIIJ);
                }
            }
        }
        this.LLJ = SystemClock.elapsedRealtime();
        if (RoomSlowFunctionOptSetting.roomBuildOpt()) {
            Handler handler4 = this.LJLLLLLL;
            if (handler4 == null) {
                handler4 = LJIJI();
            }
            handler4.post(RunnableC31025CFp.LJLIL);
            return;
        }
        C31026CFq.LIZ.LJ();
    }

    public final void LJJIJIIJI() {
        if (!this.LJLZ.enable || !this.LLIIL) {
            return;
        }
        this.LLIIL = false;
        Handler handler = this.LJLLLLLL;
        if (handler == null) {
            handler = LJIJI();
        }
        handler.removeCallbacks(this.LLJJ);
        if (this.LJZ && ((!this.LJLJI || LiveOpenStreamerGpuSetting.INSTANCE.getValue()) && PerformanceSampleSetting.INSTANCE.isReportGpu())) {
            Handler handler2 = this.LJLLLLLL;
            if (handler2 == null) {
                handler2 = LJIJI();
            }
            handler2.post(new ARunnableS41S0100000_5(this, 178));
        }
        if (this.LJLILLLLZI == LiveMode.VIDEO && !LiveEnvLightCaptureSetting.INSTANCE.enableControlGroup() && this.LJLJI) {
            if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
                C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(this, 179));
            } else {
                Object LLILL = C16880lQ.LLILL(C15380j0.LIZLLL(), "sensor");
                o.LJII(LLILL, "null cannot be cast to non-null type android.hardware.SensorManager");
                C39187FZn c39187FZn = C39188FZo.LIZ;
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476415491, "bpea-monitor_environment_brightness");
                c39187FZn.getClass();
                C39187FZn.LIZLLL((SensorManager) LLILL, this, LJJIIJ);
            }
        }
        C31026CFq.LJFF();
        this.LLILIL = null;
    }

    public final String getBroadcastScene() {
        AObjectS47S0101000_2 aObjectS47S0101000_2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.roomLayout == 2) {
            return "video_anchor_order";
        }
        if (TextUtils.equals("manual_pk", this.LJLLILLLL)) {
            return this.LJLJLJ;
        }
        if (TextUtils.equals("anchor", this.LJLLILLLL)) {
            return "video_anchor_connect";
        }
        LiveSdkHeartBeatReportOptSetting liveSdkHeartBeatReportOptSetting = LiveSdkHeartBeatReportOptSetting.INSTANCE;
        if ((!liveSdkHeartBeatReportOptSetting.isEnable() && C74838TYs.LJ().LJIIIZ) || (liveSdkHeartBeatReportOptSetting.isEnable() && (aObjectS47S0101000_2 = this.LLJILJIL) != null && ((Boolean) aObjectS47S0101000_2.invoke()).booleanValue())) {
            if (this.LJLJI) {
                return "video_anchor_guest_connect";
            }
            if (this.LJLIL) {
                return "video_anchor_guest_connect_guest";
            }
            return "video_anchor_guest_connect_viewer";
        }
        return "normal_video_live";
    }

    public final void release() {
        ((CopyOnWriteArrayList) this.LLIIZ).clear();
        if (!this.LJLZ.enable) {
            return;
        }
        C31024CFo c31024CFo = C31032CFw.LIZ;
        synchronized (c31024CFo) {
            c31024CFo.LJIIJJI = false;
            c31024CFo.LJ = -1;
            if (c31024CFo.LIZJ) {
                try {
                    C16880lQ.LJJLIIIJL(C15380j0.LIZLLL(), c31024CFo.LIZ);
                    c31024CFo.LIZJ = false;
                } catch (Exception unused) {
                }
            }
        }
        if (LiveWatchThreadPriorityOptSetting.INSTANCE.enableQuitGpu()) {
            Handler handler = this.LJLLLLLL;
            if (handler == null) {
                handler = LJIJI();
            }
            handler.post(new ARunnableS41S0100000_5(handler, 176));
        } else {
            Handler handler2 = this.LJLLLLLL;
            if (handler2 == null) {
                handler2 = LJIJI();
            }
            handler2.removeCallbacks(this.LLJILLL);
            Handler handler3 = this.LJLLLLLL;
            if (handler3 == null) {
                handler3 = LJIJI();
            }
            handler3.removeCallbacksAndMessages(null);
        }
        Handler handler4 = this.LJLLLL;
        if (handler4 != null) {
            handler4.removeCallbacksAndMessages(null);
            C31023CFn.LIZJ(false);
            this.LLFFF = null;
            this.LLFII = null;
            this.LLFZ = -1.0f;
            this.LLI = -1;
            this.LLIFFJFJJ = 0L;
            this.LJLIL = false;
            this.LJLJI = false;
            this.LJLJJL = false;
            this.LJLJJLL = false;
            this.LLIZ = 0L;
            this.LLIZLLLIL = 0L;
            this.LJLJJI = 0L;
            ((C278417k) C15510jD.LIZ.getValue()).LIZJ();
            LinkedHashSet<String> linkedHashSet = C15510jD.LIZIZ;
            if (linkedHashSet != null) {
                linkedHashSet.clear();
            }
            IDRunnableS6S1000000 iDRunnableS6S1000000 = C15510jD.LIZJ;
            if (iDRunnableS6S1000000 != null) {
                C15610jN.LIZLLL(iDRunnableS6S1000000);
                return;
            }
            return;
        }
        o.LJIJI("mMainHandler");
        throw null;
    }

    public LivePerformanceManager() {
        PerformanceSetting value = LivePerformanceSettingSetting.INSTANCE.getValue();
        this.LJLZ = value;
        this.LJZ = LiveGpuOptSetting.INSTANCE.getValue();
        this.LJZI = new C771030w();
        this.LJZL = -1.0f;
        this.LL = -1.0d;
        this.LLD = -1.0f;
        this.LLFZ = -1.0f;
        this.LLI = -1;
        String jSONObject = new JSONObject().toString();
        o.LJIIIIZZ(jSONObject, "JSONObject().toString()");
        this.LLIIIILZ = jSONObject;
        String jSONObject2 = new JSONObject().toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().toString()");
        this.LLIIIJ = jSONObject2;
        String jSONObject3 = new JSONObject().toString();
        o.LJIIIIZZ(jSONObject3, "JSONObject().toString()");
        this.LLIIIL = jSONObject3;
        String jSONObject4 = new JSONObject().toString();
        o.LJIIIIZZ(jSONObject4, "JSONObject().toString()");
        this.LLIIIZ = jSONObject4;
        String jSONObject5 = new JSONObject().toString();
        o.LJIIIIZZ(jSONObject5, "JSONObject().toString()");
        this.LLIIJI = jSONObject5;
        this.LLIIJLIL = new HashMap();
        this.LLIIZ = new CopyOnWriteArrayList();
        this.LLILII = new C29223BdT();
        this.LLILL = "";
        this.LLILZIL = C221108m2.LIZIZ(C31028CFs.LJLIL);
        if (value.enable) {
            this.LJLLLLLL = new Handler(LJIJJ().getLooper());
            this.LJLLLL = new Handler(C16880lQ.LLJJJJ());
            InterfaceC06390Mx LIZ = CN1.LIZ(IHostPerformanceMonitor.class);
            o.LJIIIIZZ(LIZ, "getService(IHostPerformanceMonitor::class.java)");
            this.LJLLJ = (IHostPerformanceMonitor) LIZ;
            C31024CFo c31024CFo = C31032CFw.LIZ;
            if (!c31024CFo.LIZJ) {
                synchronized (c31024CFo) {
                    if (!c31024CFo.LIZJ) {
                        try {
                            c31024CFo.LIZJ = true;
                            Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(c31024CFo.LIZ, C15380j0.LIZLLL(), c31024CFo.LIZIZ);
                            if (LJJLIIIJILLIZJL != null) {
                                c31024CFo.LIZ(LJJLIIIJILLIZJL);
                            }
                        } catch (Exception unused) {
                            c31024CFo.LJIIJ = true;
                        }
                    }
                }
            }
        }
        this.LLJILLL = new ARunnableS41S0100000_5(this, 172);
        this.LLJJ = new ARunnableS41S0100000_5(this, 180);
        this.LLJJI = new ARunnableS41S0100000_5(this, 173);
        this.LLJJIII = new ARunnableS41S0100000_5(this, 175);
        this.LLJJIJI = new ARunnableS41S0100000_5(this, 171);
    }

    public static long LJIIIIZZ(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)), 1000);
            String load = bufferedReader.readLine();
            bufferedReader.close();
            o.LJIIIIZZ(load, "load");
            List LJLJJL = s.LJLJJL(load, new String[]{" "}, 0, 6);
            return CastLongProtector.parseLong((String) ListProtector.get(LJLJJL, 13)) + CastLongProtector.parseLong((String) ListProtector.get(LJLJJL, 14)) + CastLongProtector.parseLong((String) ListProtector.get(LJLJJL, 15)) + CastLongProtector.parseLong((String) ListProtector.get(LJLJJL, 16));
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static String LJIILLIIL(LiveMode liveMode) {
        if (liveMode == null) {
            return "";
        }
        switch (BGZ.LIZ[liveMode.ordinal()]) {
            case 1:
                return "official";
            case 2:
                return "game";
            case 3:
                return "audio";
            case 4:
                return "third_party";
            case 5:
                return "video_live";
            case 6:
                return "live_voice";
            default:
                return "";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:5)|6|(2:8|(1:10))|11|(2:13|(1:21))|22|(1:24)(1:73)|25|(13:55|(2:57|(2:59|(2:61|(2:63|(2:65|(1:67))(1:68))(1:69))(1:70))(1:71))(1:72)|28|29|30|(4:33|(2:37|38)|39|31)|42|43|(1:45)(1:52)|46|(1:51)|48|49)|27|28|29|30|(1:31)|42|43|(0)(0)|46|(0)|48|49) */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7 A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:30:0x00d5, B:31:0x00e1, B:33:0x00e7, B:35:0x00f5, B:37:0x00fd, B:39:0x0102), top: B:29:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.LivePerformanceManager.LIZ(java.util.Map):void");
    }

    public final void LJ(BZI bzi) {
        int LJJIIZ = O6R.LJJIIZ(((float) (SystemClock.elapsedRealtime() - this.LLJ)) / 1000);
        CGN cgn = this.LLILZ;
        if (cgn != null) {
            OSZ LIZIZ = cgn.LIZIZ(LJJIIZ);
            if (((Number) LIZIZ.getFirst()).floatValue() >= 0.0f && ((Number) LIZIZ.getSecond()).floatValue() >= 0.0f) {
                bzi.LJIL("avg_qps", (Float) LIZIZ.getFirst());
                bzi.LJIL("max_qps", (Float) LIZIZ.getSecond());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a3, code lost:
    
        if (r2 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x037a: IPUT (r0v1 ?? I:long), (r11 I:com.bytedance.android.livesdk.performance.LivePerformanceManager) (LINE:16778106) com.bytedance.android.livesdk.performance.LivePerformanceManager.LLIIII long, block:B:161:0x0376 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188 A[Catch: all -> 0x0356, TryCatch #1 {all -> 0x0356, blocks: (B:3:0x0008, B:8:0x0021, B:10:0x0025, B:12:0x002f, B:13:0x0035, B:15:0x007e, B:16:0x0098, B:18:0x009c, B:19:0x00a5, B:21:0x00ad, B:40:0x00ba, B:42:0x00c6, B:44:0x00cc, B:45:0x00d5, B:23:0x00e0, B:25:0x00e6, B:28:0x00f2, B:30:0x00f6, B:31:0x0104, B:33:0x010e, B:34:0x0112, B:36:0x011b, B:37:0x011f, B:38:0x00e9, B:49:0x0126, B:51:0x012a, B:54:0x0136, B:56:0x0158, B:60:0x0176, B:62:0x0188, B:66:0x01a6, B:68:0x01b2, B:70:0x01bc, B:72:0x01c6, B:73:0x01d2, B:74:0x02fb, B:75:0x0305, B:77:0x0193, B:79:0x019f, B:81:0x0163, B:83:0x016f, B:85:0x01d8, B:87:0x01e0, B:89:0x01f0, B:92:0x01fa, B:94:0x0210, B:95:0x0214, B:97:0x0222, B:98:0x0226, B:104:0x0246, B:105:0x024d, B:107:0x0274, B:109:0x027b, B:115:0x0287, B:117:0x0290, B:119:0x0294, B:120:0x02a2, B:122:0x02b0, B:123:0x02c4, B:125:0x02da, B:127:0x02e2, B:130:0x02f4, B:131:0x0306, B:135:0x0310, B:137:0x0316, B:139:0x031e, B:140:0x032a, B:143:0x0336, B:144:0x0345, B:146:0x0349, B:147:0x034c, B:151:0x033b, B:153:0x033f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2 A[Catch: all -> 0x0356, TryCatch #1 {all -> 0x0356, blocks: (B:3:0x0008, B:8:0x0021, B:10:0x0025, B:12:0x002f, B:13:0x0035, B:15:0x007e, B:16:0x0098, B:18:0x009c, B:19:0x00a5, B:21:0x00ad, B:40:0x00ba, B:42:0x00c6, B:44:0x00cc, B:45:0x00d5, B:23:0x00e0, B:25:0x00e6, B:28:0x00f2, B:30:0x00f6, B:31:0x0104, B:33:0x010e, B:34:0x0112, B:36:0x011b, B:37:0x011f, B:38:0x00e9, B:49:0x0126, B:51:0x012a, B:54:0x0136, B:56:0x0158, B:60:0x0176, B:62:0x0188, B:66:0x01a6, B:68:0x01b2, B:70:0x01bc, B:72:0x01c6, B:73:0x01d2, B:74:0x02fb, B:75:0x0305, B:77:0x0193, B:79:0x019f, B:81:0x0163, B:83:0x016f, B:85:0x01d8, B:87:0x01e0, B:89:0x01f0, B:92:0x01fa, B:94:0x0210, B:95:0x0214, B:97:0x0222, B:98:0x0226, B:104:0x0246, B:105:0x024d, B:107:0x0274, B:109:0x027b, B:115:0x0287, B:117:0x0290, B:119:0x0294, B:120:0x02a2, B:122:0x02b0, B:123:0x02c4, B:125:0x02da, B:127:0x02e2, B:130:0x02f4, B:131:0x0306, B:135:0x0310, B:137:0x0316, B:139:0x031e, B:140:0x032a, B:143:0x0336, B:144:0x0345, B:146:0x0349, B:147:0x034c, B:151:0x033b, B:153:0x033f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019f A[Catch: all -> 0x0356, TryCatch #1 {all -> 0x0356, blocks: (B:3:0x0008, B:8:0x0021, B:10:0x0025, B:12:0x002f, B:13:0x0035, B:15:0x007e, B:16:0x0098, B:18:0x009c, B:19:0x00a5, B:21:0x00ad, B:40:0x00ba, B:42:0x00c6, B:44:0x00cc, B:45:0x00d5, B:23:0x00e0, B:25:0x00e6, B:28:0x00f2, B:30:0x00f6, B:31:0x0104, B:33:0x010e, B:34:0x0112, B:36:0x011b, B:37:0x011f, B:38:0x00e9, B:49:0x0126, B:51:0x012a, B:54:0x0136, B:56:0x0158, B:60:0x0176, B:62:0x0188, B:66:0x01a6, B:68:0x01b2, B:70:0x01bc, B:72:0x01c6, B:73:0x01d2, B:74:0x02fb, B:75:0x0305, B:77:0x0193, B:79:0x019f, B:81:0x0163, B:83:0x016f, B:85:0x01d8, B:87:0x01e0, B:89:0x01f0, B:92:0x01fa, B:94:0x0210, B:95:0x0214, B:97:0x0222, B:98:0x0226, B:104:0x0246, B:105:0x024d, B:107:0x0274, B:109:0x027b, B:115:0x0287, B:117:0x0290, B:119:0x0294, B:120:0x02a2, B:122:0x02b0, B:123:0x02c4, B:125:0x02da, B:127:0x02e2, B:130:0x02f4, B:131:0x0306, B:135:0x0310, B:137:0x0316, B:139:0x031e, B:140:0x032a, B:143:0x0336, B:144:0x0345, B:146:0x0349, B:147:0x034c, B:151:0x033b, B:153:0x033f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0210 A[Catch: all -> 0x0356, TryCatch #1 {all -> 0x0356, blocks: (B:3:0x0008, B:8:0x0021, B:10:0x0025, B:12:0x002f, B:13:0x0035, B:15:0x007e, B:16:0x0098, B:18:0x009c, B:19:0x00a5, B:21:0x00ad, B:40:0x00ba, B:42:0x00c6, B:44:0x00cc, B:45:0x00d5, B:23:0x00e0, B:25:0x00e6, B:28:0x00f2, B:30:0x00f6, B:31:0x0104, B:33:0x010e, B:34:0x0112, B:36:0x011b, B:37:0x011f, B:38:0x00e9, B:49:0x0126, B:51:0x012a, B:54:0x0136, B:56:0x0158, B:60:0x0176, B:62:0x0188, B:66:0x01a6, B:68:0x01b2, B:70:0x01bc, B:72:0x01c6, B:73:0x01d2, B:74:0x02fb, B:75:0x0305, B:77:0x0193, B:79:0x019f, B:81:0x0163, B:83:0x016f, B:85:0x01d8, B:87:0x01e0, B:89:0x01f0, B:92:0x01fa, B:94:0x0210, B:95:0x0214, B:97:0x0222, B:98:0x0226, B:104:0x0246, B:105:0x024d, B:107:0x0274, B:109:0x027b, B:115:0x0287, B:117:0x0290, B:119:0x0294, B:120:0x02a2, B:122:0x02b0, B:123:0x02c4, B:125:0x02da, B:127:0x02e2, B:130:0x02f4, B:131:0x0306, B:135:0x0310, B:137:0x0316, B:139:0x031e, B:140:0x032a, B:143:0x0336, B:144:0x0345, B:146:0x0349, B:147:0x034c, B:151:0x033b, B:153:0x033f), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0222 A[Catch: all -> 0x0356, TryCatch #1 {all -> 0x0356, blocks: (B:3:0x0008, B:8:0x0021, B:10:0x0025, B:12:0x002f, B:13:0x0035, B:15:0x007e, B:16:0x0098, B:18:0x009c, B:19:0x00a5, B:21:0x00ad, B:40:0x00ba, B:42:0x00c6, B:44:0x00cc, B:45:0x00d5, B:23:0x00e0, B:25:0x00e6, B:28:0x00f2, B:30:0x00f6, B:31:0x0104, B:33:0x010e, B:34:0x0112, B:36:0x011b, B:37:0x011f, B:38:0x00e9, B:49:0x0126, B:51:0x012a, B:54:0x0136, B:56:0x0158, B:60:0x0176, B:62:0x0188, B:66:0x01a6, B:68:0x01b2, B:70:0x01bc, B:72:0x01c6, B:73:0x01d2, B:74:0x02fb, B:75:0x0305, B:77:0x0193, B:79:0x019f, B:81:0x0163, B:83:0x016f, B:85:0x01d8, B:87:0x01e0, B:89:0x01f0, B:92:0x01fa, B:94:0x0210, B:95:0x0214, B:97:0x0222, B:98:0x0226, B:104:0x0246, B:105:0x024d, B:107:0x0274, B:109:0x027b, B:115:0x0287, B:117:0x0290, B:119:0x0294, B:120:0x02a2, B:122:0x02b0, B:123:0x02c4, B:125:0x02da, B:127:0x02e2, B:130:0x02f4, B:131:0x0306, B:135:0x0310, B:137:0x0316, B:139:0x031e, B:140:0x032a, B:143:0x0336, B:144:0x0345, B:146:0x0349, B:147:0x034c, B:151:0x033b, B:153:0x033f), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.performance.LivePerformanceManager.LJFF(java.lang.String):void");
    }

    public final long LJIIJ(int i) {
        if (i == this.LJLJLLL) {
            long j = this.LJLZ.residentInterval;
            if (j <= 0) {
                return LivePlayEnforceIntervalSetting.DEFAULT;
            }
            return j;
        }
        if (i == this.LJLL) {
            long j2 = this.LJLZ.minMonitorInterval;
            if (j2 > 0) {
                return j2;
            }
            return 8000L;
        }
        if (i != this.LJLLI) {
            return LivePlayEnforceIntervalSetting.DEFAULT;
        }
        long j3 = this.LJLZ.monitorDelay;
        if (j3 > 0) {
            return j3;
        }
        if (CollectPerformanceAfterEnterRoomSetting.INSTANCE.getEnable()) {
            return CollectPerformanceDelayTime.INSTANCE.getDelayTime();
        }
        return 1000L;
    }

    public final String LJIJ(float f) {
        boolean z;
        Map<String, String> map;
        Map<String, String> map2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", f);
            if (!this.LJLJI && (map2 = this.LLIIJLIL) != null) {
                map2.put("temperature", String.valueOf(f));
            }
            float f2 = this.LLFZ;
            if (f2 == -1.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                jSONObject.put("non_live_value", f2);
                if (!this.LJLJI && (map = this.LLIIJLIL) != null) {
                    map.put("non_live_temperature", String.valueOf(this.LLFZ));
                }
            }
        } catch (Exception unused) {
        }
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "temperatureInfo.toString()");
        return jSONObject2;
    }

    public final void LJJI(String scene) {
        o.LJIIIZ(scene, "scene");
        if (!this.LJLZ.enable || o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            return;
        }
        if (!LivePerformanceOptSetting.INSTANCE.isEnable(this.LJLJI)) {
            if (!this.LJLJJL && System.currentTimeMillis() - this.LJLJJI > LJIIJ(this.LJLL)) {
                this.LJLJJL = true;
            } else {
                return;
            }
        } else if (!this.LJLJJLL) {
            if (this.LJLJI) {
                this.LJLJJLL = true;
            } else {
                Handler handler = this.LJLLLLLL;
                if (handler == null) {
                    handler = LJIJI();
                }
                handler.postDelayed(new ARunnableS41S0100000_5(this, 174), 8000L);
            }
        }
        this.LJLJL = scene;
        Handler handler2 = this.LJLLLLLL;
        if (handler2 == null) {
            handler2 = LJIJI();
        }
        handler2.removeCallbacks(this.LLJJIII);
        Handler handler3 = this.LJLLLLLL;
        if (handler3 == null) {
            handler3 = LJIJI();
        }
        handler3.postDelayed(this.LLJJIII, LJIIJ(this.LJLLI));
        if (!o.LJ("resident", scene) && this.LLIIL) {
            Handler handler4 = this.LJLLLLLL;
            if (handler4 == null) {
                handler4 = LJIJI();
            }
            handler4.removeCallbacks(this.LLJJ);
            Handler handler5 = this.LJLLLLLL;
            if (handler5 == null) {
                handler5 = LJIJI();
            }
            handler5.postDelayed(this.LLJJ, LJIIJ(this.LJLJLLL));
        }
    }

    public final void LJJII(String str) {
        if (!this.LJLZ.enable) {
            return;
        }
        C771030w c771030w = this.LJZI;
        c771030w.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c771030w.LIZ.remove(str);
    }

    public final void LJJIIZ(boolean z) {
        this.LJLJI = z;
        C31023CFn.LJII = z;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Float f;
        float[] fArr;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null) {
            f = Float.valueOf(fArr[0]);
        } else {
            f = null;
        }
        this.LLILL = String.valueOf(f);
    }

    public static void LJJIII(Map map, boolean z) {
        if (!LiveMonitorReportSetting.INSTANCE.getValue()) {
            return;
        }
        if (z) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            concurrentHashMap.remove("cpu_cost");
            concurrentHashMap.remove("gpu_cost");
            concurrentHashMap.remove("gpu_usage");
            concurrentHashMap.remove("net");
            concurrentHashMap.remove("non_live_pss_total");
            concurrentHashMap.remove("pss");
            concurrentHashMap.remove("pss_total");
            concurrentHashMap.remove("temperature");
            concurrentHashMap.remove("encode_fps");
            concurrentHashMap.remove("encoder_process_time");
            concurrentHashMap.remove("encoder_to_transport_time");
            concurrentHashMap.remove("filter_level");
            concurrentHashMap.remove("filter_use_time");
            concurrentHashMap.remove("gift_cnt");
            concurrentHashMap.remove("in_cap_fps");
            concurrentHashMap.remove("is_hw");
            concurrentHashMap.remove("live_state");
            concurrentHashMap.remove("out_cap_fps");
            concurrentHashMap.remove("preview_fps");
            concurrentHashMap.remove("push_fps");
            concurrentHashMap.remove("push_protocol");
            concurrentHashMap.remove("resolution_height");
            concurrentHashMap.remove("resolution_width");
            concurrentHashMap.remove("sticker_use_time");
            concurrentHashMap.remove("time_elapsed_in_room");
            concurrentHashMap.remove("video_codec");
            concurrentHashMap.remove("voice_use_time");
            concurrentHashMap.remove("cpu");
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) map;
        concurrentHashMap2.remove("gpu_cost");
        concurrentHashMap2.remove("gpu_usage");
        concurrentHashMap2.remove("gpu_usage_android");
        concurrentHashMap2.remove("non_live_cpu_rate");
        concurrentHashMap2.remove("non_live_cpu_speed");
        concurrentHashMap2.remove("non_live_pss_total");
        concurrentHashMap2.remove("pss");
        concurrentHashMap2.remove("pss_total");
        concurrentHashMap2.remove("temperature");
        concurrentHashMap2.remove("cpu_cost");
        concurrentHashMap2.remove("net");
    }

    public final void LIZLLL(BZI bzi, long j) {
        GameOCRPingMessage gameOCRPingMessage;
        EnableCalculateOcrToClientDurationSwitcher enableCalculateOcrToClientDurationSwitcher = EnableCalculateOcrToClientDurationSwitcher.INSTANCE;
        boolean isEnable = enableCalculateOcrToClientDurationSwitcher.isEnable();
        if (this.LJLILLLLZI == LiveMode.SCREEN_RECORD && isEnable) {
            C31034CFy c31034CFy = C31035CFz.LIZIZ;
            if (!c31034CFy.LIZIZ && c31034CFy.LIZ != null && !c31034CFy.LIZIZ && (gameOCRPingMessage = c31034CFy.LIZ) != null && gameOCRPingMessage.isCurrentRoom(j)) {
                c31034CFy.LIZIZ = true;
                if (enableCalculateOcrToClientDurationSwitcher.isEnable()) {
                    bzi.LJIJJ(Long.valueOf(c31034CFy.LIZJ), "game_ping_ocr_server_to_client_duration");
                }
                GameOCRPingMessage gameOCRPingMessage2 = c31034CFy.LIZ;
                if (gameOCRPingMessage2 == null) {
                    return;
                }
                bzi.LJIJJLI("game_ping_ocr_confidence", Double.valueOf(gameOCRPingMessage2.confidence));
                C07250Qf.LIZJ(gameOCRPingMessage2.pingValue, bzi, "game_ping_value", "screen_share_game", "broadcast_scene");
                bzi.LJIJJ(gameOCRPingMessage2.gameFusionLabel, "game_fusion_label");
            }
        }
    }

    public final String LJIIIZ(long j, Map map) {
        Double d;
        String d2;
        Map<String, String> map2;
        Double d3;
        String d4;
        Map<String, String> map3;
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                if (PerformanceSampleSetting.INSTANCE.isReportCpu(this.LJLJI)) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        jSONObject.put("cpu_speed", map.get("cpu_speed"));
                        Map<String, Double> map4 = this.LLFFF;
                        if (map4 != null) {
                            jSONObject.put("non_live_cpu_speed", map4.get("cpu_speed"));
                            Map<String, Double> map5 = this.LLFFF;
                            if (map5 != null && (d3 = map5.get("cpu_speed")) != null && (d4 = d3.toString()) != null && !this.LJLJI && (map3 = this.LLIIJLIL) != null) {
                            }
                        }
                    } else {
                        jSONObject.put("cpu_rate", map.get("cpu_rate"));
                        Map<String, Double> map6 = this.LLFFF;
                        if (map6 != null) {
                            jSONObject.put("non_live_cpu_rate", map6.get("cpu_rate"));
                            Map<String, Double> map7 = this.LLFFF;
                            if (map7 != null && (d = map7.get("cpu_rate")) != null && (d2 = d.toString()) != null && !this.LJLJI && (map2 = this.LLIIJLIL) != null) {
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        jSONObject.put("cost", j);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "cpuInfo.toString()");
        return jSONObject2;
    }

    public final String LJIILIIL(long j, Map map) {
        String l;
        Map<String, String> map2;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        String l10;
        Map<String, String> map3;
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                if (PerformanceSampleSetting.INSTANCE.isReportMem(this.LJLJI)) {
                    jSONObject.put("java_total", map.get("mem_java_total"));
                    jSONObject.put("java_free", map.get("mem_java_free"));
                    jSONObject.put("java_used", map.get("mem_java_used"));
                    jSONObject.put("pss_dalvik", map.get("mem_pss_dalvik"));
                    jSONObject.put("pss_native", map.get("mem_pss_native"));
                    jSONObject.put("pss_total", map.get("mem_pss_total"));
                    jSONObject.put("graphics", map.get("mem_graphics"));
                    jSONObject.put("vmsize", map.get("mem_vmsize"));
                    Long l11 = (Long) map.get("mem_pss_total");
                    if (l11 != null && (l = l11.toString()) != null && !this.LJLJI && (map2 = this.LLIIJLIL) != null) {
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (this.LLFII != null && PerformanceSampleSetting.INSTANCE.isReportMem(this.LJLJI)) {
            Map<String, Long> map4 = this.LLFII;
            Long l12 = null;
            if (map4 != null) {
                l2 = map4.get("mem_java_total");
            } else {
                l2 = null;
            }
            jSONObject.put("non_live_java_total", l2);
            Map<String, Long> map5 = this.LLFII;
            if (map5 != null) {
                l3 = map5.get("mem_java_free");
            } else {
                l3 = null;
            }
            jSONObject.put("non_live_java_free", l3);
            Map<String, Long> map6 = this.LLFII;
            if (map6 != null) {
                l4 = map6.get("mem_java_used");
            } else {
                l4 = null;
            }
            jSONObject.put("non_live_java_used", l4);
            Map<String, Long> map7 = this.LLFII;
            if (map7 != null) {
                l5 = map7.get("mem_pss_dalvik");
            } else {
                l5 = null;
            }
            jSONObject.put("non_live_pss_dalvik", l5);
            Map<String, Long> map8 = this.LLFII;
            if (map8 != null) {
                l6 = map8.get("mem_pss_native");
            } else {
                l6 = null;
            }
            jSONObject.put("non_live_pss_native", l6);
            Map<String, Long> map9 = this.LLFII;
            if (map9 != null) {
                l7 = map9.get("mem_pss_total");
            } else {
                l7 = null;
            }
            jSONObject.put("non_live_pss_total", l7);
            Map<String, Long> map10 = this.LLFII;
            if (map10 != null && (l9 = map10.get("mem_pss_total")) != null && (l10 = l9.toString()) != null && !this.LJLJI && (map3 = this.LLIIJLIL) != null) {
            }
            Map<String, Long> map11 = this.LLFII;
            if (map11 != null) {
                l8 = map11.get("mem_graphics");
            } else {
                l8 = null;
            }
            jSONObject.put("non_live_graphics", l8);
            Map<String, Long> map12 = this.LLFII;
            if (map12 != null) {
                l12 = map12.get("mem_vmsize");
            }
            jSONObject.put("non_live_vmsize", l12);
        }
        jSONObject.put("cost", j);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "memInfo.toString()");
        return jSONObject2;
    }

    public final void LJJ(int i, String str) {
        if (!this.LJLZ.enable) {
            return;
        }
        if (o.LJ(str, "resident")) {
            this.LJLJLJ = "";
            LJJI("resident");
            return;
        }
        this.LJLJLJ = str;
        Handler handler = this.LJLLLLLL;
        if (handler == null) {
            handler = LJIJI();
        }
        handler.removeCallbacks(this.LLJJIII);
        Handler handler2 = this.LJLLLLLL;
        if (handler2 == null) {
            handler2 = LJIJI();
        }
        handler2.postDelayed(this.LLJJIII, LJIIJ(this.LJLLI));
        if (!this.LLIIL) {
            return;
        }
        Handler handler3 = this.LJLLLLLL;
        if (handler3 == null) {
            handler3 = LJIJI();
        }
        handler3.removeCallbacks(this.LLJJ);
        Handler handler4 = this.LJLLLLLL;
        if (handler4 == null) {
            handler4 = LJIJI();
        }
        handler4.postDelayed(this.LLJJ, LJIIJ(i));
    }

    public final void LJJIFFI(String str, Map<String, String> map) {
        if (!this.LJLZ.enable) {
            return;
        }
        C771030w c771030w = this.LJZI;
        c771030w.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c771030w.LIZ.put(str, new C770930v(str, map));
    }
}
