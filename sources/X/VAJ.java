package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import ccb.t;
import com.ss.videoarch.strategy.LiveStrategyManager;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VAJ implements VBH {
    public final Context LIZ;
    public final t LIZIZ;
    public final int LIZLLL;
    public final VAD LJ;
    public String LJFF;
    public String LJI;
    public int LJII;
    public int LJIIJJI;
    public int LJIIL;
    public HandlerThread LJJII;
    public VAR LJJIII;
    public HandlerThread LJJIIJZLJL;
    public Handler LJJIIZ;
    public C79304VAm LJJIJIIJI;
    public int LJIIIIZZ = 3;
    public int LJIIIZ = 1000;
    public int LJIIJ = 5000;
    public int LJIILIIL = 3;
    public int LJIILJJIL = -1;
    public String LJIILL = "";
    public String LJIILLIIL = "";
    public int LJIIZILJ = 1;
    public int LJIJ = 1;
    public int LJIJI = 1;
    public int LJIJJ = 1;
    public final C79306VAo LJIJJLI = new C79306VAo();
    public final C79308VAq LJIL = new C79308VAq();
    public volatile boolean LJJ = false;
    public boolean LJJI = false;
    public final Object LJJIFFI = new Object();
    public final Object LJJIIJ = new Object();
    public final VAU LJJIIZI = new VAU(this);
    public boolean LJJIJ = false;
    public int LJJIJIIJIL = -999;
    public final AtomicBoolean LJJIJIL = new AtomicBoolean(false);
    public int LJJIJL = 0;
    public int LJJIJLIJ = 0;
    public int LJJIL = 0;
    public int LJJIZ = 0;
    public int LJJJ = 0;
    public final Object LJJJI = new Object();
    public final ArrayList<C79311VAt> LJJJIL = new ArrayList<>();
    public final C79299VAh LIZJ = new C79299VAh(this);

    public final void LIZIZ() {
        C79299VAh c79299VAh = this.LIZJ;
        c79299VAh.getClass();
        try {
            if (c79299VAh.LIZ != null) {
                C79299VAh.LJIIJJI.setAccessible(true);
                Object LIZ = C79299VAh.LIZ(c79299VAh.LIZ, C79299VAh.LJIIJJI, new Object[0]);
                if (LIZ != null) {
                    ((Integer) LIZ).intValue();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZJ() {
        if (!this.LJJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[playerID : ");
            LIZ.append(this.LIZLLL);
            LIZ.append("] cancelPreload: PreloadHelper initialize error: ");
            LIZ.append(this.LJJIJIIJIL);
            X1D.LIZIZ(LIZ);
            C46496IMq.LJ();
            return;
        }
        if (!this.LJJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[playerID : ");
            LIZ2.append(this.LIZLLL);
            LIZ2.append("] cancelPreload: PreloadHelper no running");
            X1D.LIZIZ(LIZ2);
            C46496IMq.LJ();
            return;
        }
        if (this.LJIIZILJ == 1) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[playerID : ");
            LIZ3.append(this.LIZLLL);
            LIZ3.append("] cancelPreload: don't need cancel because ignore stall");
            X1D.LIZIZ(LIZ3);
            C46496IMq.LJ();
            return;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("[playerID : ");
        LIZ4.append(this.LIZLLL);
        LIZ4.append("] cancelPreload");
        X1D.LIZIZ(LIZ4);
        C46496IMq.LIZ();
        this.LJJIJIL.set(true);
        synchronized (this.LJJIFFI) {
            VAR var = this.LJJIII;
            if (var != null) {
                var.sendEmptyMessage(1);
            }
        }
    }

    public final int LJFF() {
        return this.LJIJJLI.LIZJ();
    }

    public final void LJIIL() {
        if (!this.LJJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[playerID : ");
            LIZ.append(this.LIZLLL);
            LIZ.append("] startPreload: PreloadHelper initialize error: ");
            LIZ.append(this.LJJIJIIJIL);
            X1D.LIZIZ(LIZ);
            C46496IMq.LJ();
            return;
        }
        if (this.LJJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[playerID : ");
            LIZ2.append(this.LIZLLL);
            LIZ2.append("] startPreload: PreloadHelper have running");
            X1D.LIZIZ(LIZ2);
            C46496IMq.LJ();
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("[playerID : ");
        LIZ3.append(this.LIZLLL);
        LIZ3.append("] startPreload");
        X1D.LIZIZ(LIZ3);
        C46496IMq.LIZ();
        C79299VAh c79299VAh = this.LIZJ;
        int i = this.LIZLLL;
        c79299VAh.getClass();
        try {
            Class<?> cls = Class.forName("com.ss.videoarch.live.ttquic.PreloadListener");
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C79298VAg(c79299VAh.LIZIZ));
            C79299VAh.LJI.setAccessible(true);
            C79299VAh.LIZ(c79299VAh.LIZ, C79299VAh.LJI, new Object[]{Integer.valueOf(i), newProxyInstance});
        } catch (Exception unused) {
        }
        Handler handler = this.LJJIIZ;
        if (handler != null) {
            handler.post(this.LJJIIZI);
        }
        this.LJJ = true;
    }

    public final void LJIILIIL() {
        synchronized (this.LJJIFFI) {
            VAR var = this.LJJIII;
            if (var != null) {
                var.removeCallbacksAndMessages(null);
            }
        }
    }

    public final void LJIILJJIL() {
        if (!this.LJJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[playerID : ");
            LIZ.append(this.LIZLLL);
            LIZ.append("] stopPreload: PreloadHelper initialize error: ");
            LIZ.append(this.LJJIJIIJIL);
            X1D.LIZIZ(LIZ);
            C46496IMq.LJ();
            return;
        }
        if (!this.LJJ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[playerID : ");
            LIZ2.append(this.LIZLLL);
            LIZ2.append("] stopPreload: PreloadHelper no running");
            X1D.LIZIZ(LIZ2);
            C46496IMq.LJ();
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("[playerID : ");
        LIZ3.append(this.LIZLLL);
        LIZ3.append("] stopPreload");
        X1D.LIZIZ(LIZ3);
        C46496IMq.LIZ();
        C79299VAh c79299VAh = this.LIZJ;
        int i = this.LIZLLL;
        c79299VAh.getClass();
        try {
            if (c79299VAh.LIZ != null) {
                C79299VAh.LJII.setAccessible(true);
                C79299VAh.LIZ(c79299VAh.LIZ, C79299VAh.LJII, new Object[]{Integer.valueOf(i)});
            }
        } catch (Exception unused) {
        }
        this.LJJIII.sendEmptyMessage(1);
        LJIILL();
        LJIILIIL();
        synchronized (this.LJJJI) {
            this.LJJJIL.clear();
        }
        this.LJIJJLI.LIZ();
        this.LJIL.LIZ();
        this.LJJIJL = 0;
        this.LJJIJLIJ = 0;
        this.LJJIL = 0;
        this.LJJIZ = 0;
        this.LJJJ = 0;
        this.LJJIJ = false;
        this.LJJ = false;
    }

    public final void LJIILL() {
        synchronized (this.LJJIIJ) {
            Handler handler = this.LJJIIZ;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }
    }

    public static Bundle LJIIIIZZ(JSONObject jSONObject) {
        JSONArray jSONArray;
        Bundle bundle = new Bundle();
        try {
            if (jSONObject.has("StrategyList")) {
                jSONArray = jSONObject.optJSONArray("StrategyList");
            } else {
                jSONArray = null;
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    if (jSONObject2 != null && jSONObject2.has("Name")) {
                        String optString = jSONObject2.optString("Name");
                        if (!TextUtils.isEmpty(optString)) {
                            bundle.putInt(optString, jSONObject2.optInt("Enable"));
                            if (jSONObject2.has("Time")) {
                                bundle.putInt("smooth_switch_interval", jSONObject2.optInt("Time"));
                            }
                            if (jSONObject2.has("FallbackToPlayerAbr")) {
                                bundle.putInt("enable_strategy_fallback", jSONObject2.optInt("FallbackToPlayerAbr"));
                            }
                            if (jSONObject2.has("Repeat")) {
                                bundle.putInt("enable_repeat_strategy", jSONObject2.optInt("Repeat"));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return bundle;
    }

    public final void LIZ(int i) {
        C79299VAh c79299VAh = this.LIZJ;
        c79299VAh.getClass();
        try {
            if (c79299VAh.LIZ != null) {
                C79299VAh.LJ.setAccessible(true);
                C79299VAh.LIZ(c79299VAh.LIZ, C79299VAh.LJ, new Object[]{Integer.valueOf(i)});
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZLLL(int i) {
        C79299VAh c79299VAh = this.LIZJ;
        c79299VAh.getClass();
        try {
            if (c79299VAh.LIZ != null) {
                C79299VAh.LJFF.setAccessible(true);
                C79299VAh.LIZ(c79299VAh.LIZ, C79299VAh.LJFF, new Object[]{Integer.valueOf(i)});
            }
        } catch (Exception unused) {
        }
    }

    public final Bundle LJ(String str) {
        if (!this.LJJI) {
            return new Bundle();
        }
        C79299VAh c79299VAh = this.LIZJ;
        c79299VAh.getClass();
        try {
            if (c79299VAh.LIZ != null) {
                C79299VAh.LJIILIIL.setAccessible(true);
                Object LIZ = C79299VAh.LIZ(c79299VAh.LIZ, C79299VAh.LJIILIIL, new Object[]{str, 1});
                if (LIZ != null) {
                    return (Bundle) LIZ;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final JSONObject LJI(VAN van) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("PLAY-BitrateList", van.LIZJ(21, "main"));
            jSONObject2.put("stream_session_vv_id", this.LJ.LLLI);
            jSONObject = (JSONObject) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(0, 21, null, jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJII(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAJ.LJII(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIIZ(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r4 = -1
            if (r0 != 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L1c
        Ld:
            java.lang.String r1 = ""
        Lf:
            int r0 = r9.LJIILJJIL
            if (r0 == r4) goto L1b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = X.C69382nu.LIZ(r1, r0)
        L1b:
            return r1
        L1c:
            r11.getClass()
            int r0 = r11.hashCode()
            r3 = 2
            r2 = 4
            r1 = 5
            switch(r0) {
                case 3274: goto L8e;
                case 101607: goto L83;
                case 114657: goto L78;
                case 114939: goto L6d;
                case 3482174: goto L62;
                case 107947511: goto L57;
                default: goto L29;
            }
        L29:
            r0 = -1
        L2a:
            r5 = 80
            java.lang.String r8 = "httpq"
            java.lang.String r7 = "https"
            if (r0 == r3) goto L54
            if (r0 == r2) goto L52
            if (r0 == r1) goto L52
            r5 = 443(0x1bb, float:6.21E-43)
            r6 = r7
        L39:
            java.lang.String r1 = "httpx"
            boolean r0 = r10.startsWith(r1)
            if (r0 == 0) goto L50
            java.lang.String r1 = r10.replaceAll(r1, r7)
        L45:
            boolean r0 = r10.startsWith(r8)
            if (r0 == 0) goto L99
            java.lang.String r1 = r10.replaceAll(r8, r7)
            goto L99
        L50:
            r1 = r10
            goto L45
        L52:
            r6 = r8
            goto L39
        L54:
            java.lang.String r6 = "http"
            goto L39
        L57:
            java.lang.String r0 = "quicu"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L60
            goto L29
        L60:
            r0 = 5
            goto L2a
        L62:
            java.lang.String r0 = "quic"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L6b
            goto L29
        L6b:
            r0 = 4
            goto L2a
        L6d:
            java.lang.String r0 = "tls"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L76
            goto L29
        L76:
            r0 = 3
            goto L2a
        L78:
            java.lang.String r0 = "tcp"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L81
            goto L29
        L81:
            r0 = 2
            goto L2a
        L83:
            java.lang.String r0 = "h2q"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L8c
            goto L29
        L8c:
            r0 = 1
            goto L2a
        L8e:
            java.lang.String r0 = "h2"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L97
            goto L29
        L97:
            r0 = 0
            goto L2a
        L99:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> Lc6
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r3 = r0.getHost()     // Catch: java.lang.Exception -> Lc6
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Exception -> Lc6
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> Lc6
            r1.append(r6)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r0 = "://"
            r1.append(r0)     // Catch: java.lang.Exception -> Lc6
            r1.append(r3)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r0 = ":"
            r1.append(r0)     // Catch: java.lang.Exception -> Lc6
            r1.append(r5)     // Catch: java.lang.Exception -> Lc6
            r1.append(r2)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> Lc6
            goto Lf
        Lc6:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAJ.LJIIIZ(java.lang.String, java.lang.String):java.lang.String");
    }

    public final void LJIIJ(int i, Bundle bundle) {
        JSONObject LJFF;
        VAD vad = this.LJ;
        if (vad == null || vad.LJLJJL == null || (LJFF = vad.LJFF()) == null) {
            return;
        }
        try {
            LJFF.put("event_key", "live_preload").put("preload_event", i).put("preload_url", bundle.getString("preload_url", "")).put("preload_code", bundle.getInt("preload_code", 0)).put("preload_sub_code", bundle.getInt("preload_sub_code", 0)).put("preload_error", bundle.getString("preload_error", "")).put("preload_num", bundle.getInt("preload_num", 0)).put("video_cached_num", bundle.getInt("video_cached_num", 0)).put("audio_cached_num", bundle.getInt("audio_cached_num", 0)).put("video_init_section_cached", bundle.getInt("video_init_section_cached", 0)).put("audio_init_section_cached", bundle.getInt("audio_init_section_cached", 0)).put("io_read_Bytes", bundle.getLong("io_read_Bytes", 0L)).put("cache_write_bytes", bundle.getLong("cache_write_bytes", 0L)).put("cache_waste_bytes", bundle.getLong("cache_waste_bytes", 0L)).put("cache_mode", bundle.getInt("cache_mode", 0)).put("cache_frame_count", bundle.getInt("cache_frame_count", 0)).put("cache_duration", bundle.getLong("cache_duration", 0L)).put("cancel_cost_time", bundle.getLong("cancel_cost_time", 0L)).put("pull_data", bundle.getString("pull_data", "")).put("enable_probe_startup_bitrate", bundle.getInt("enable_probe_startup_bitrate", 0)).put("probe_startup_bitrate", bundle.getInt("probe_startup_bitrate", 0));
            vad.LJJI("live_client_monitor_log", LJFF);
            long j = vad.LLLLII;
            if (j <= 0) {
                return;
            }
            vad.LLLLII = j + 1;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public VAJ(Context context, t tVar, VAD vad) {
        this.LIZ = C16880lQ.LLLLL(context);
        this.LIZIZ = tVar;
        this.LIZLLL = tVar.hashCode();
        this.LJ = vad;
    }

    public final void LJIIJJI(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        C79304VAm c79304VAm;
        if (i == 1 || i == 2) {
            synchronized (this.LJJIFFI) {
                VAR var = this.LJJIII;
                if (var != null) {
                    if (i2 == 0) {
                        if (i == 1) {
                            i4 = 2;
                        } else {
                            i4 = 3;
                        }
                        var.sendEmptyMessage(i4);
                    } else {
                        if (i == 1) {
                            i3 = 5;
                        } else {
                            i3 = 6;
                        }
                        var.sendEmptyMessage(i3);
                    }
                }
            }
        }
        if (i2 == 0 && (c79304VAm = this.LJJIJIIJI) != null) {
            bundle.putInt("enable_probe_startup_bitrate", c79304VAm.LJI);
            bundle.putInt("probe_startup_bitrate", this.LJJIJIIJI.LJII);
            if (i == 1 || i == 2) {
                bundle.putString("pull_data", this.LJJIJIIJI.LJ);
            }
            LJIIJ(i, bundle);
        }
    }
}
