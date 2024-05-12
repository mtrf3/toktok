package X;

import Y.ARunnableS15S0000000_8;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ioc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47750Ioc implements InterfaceC47731IoJ {
    public static int LLL = 1;
    public static final java.util.Map LLLF = new HashMap();
    public final InterfaceC46858IaE LIZ;
    public final C47759Iol LIZJ;
    public final C47762Ioo LIZLLL;
    public final C47765Ior LJ;
    public final C47774Ip0 LJFF;
    public C47752Ioe LJI;
    public final C47828Ips LJII;
    public final C47634Imk LJIIIIZZ;
    public final C47808IpY LJIIIZ;
    public C47761Ion LJIIJ;
    public boolean LJIIJJI;
    public ArrayList LJIILJJIL;
    public ArrayList<String> LJIILL;
    public ArrayList LJIILLIIL;
    public ArrayList LJIIZILJ;
    public ArrayList LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public int LJJIIZ;
    public boolean LJJIIZI;
    public java.util.Map LJJIJ;
    public String LJJJ;
    public long LJJJI;
    public int LJJJJI;
    public long LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public String LJJJJLL;
    public int LJJJJZ;
    public int LJJJJZI;
    public InterfaceC47616ImS LJJJLIIL;
    public long LJJJZ;
    public long LJJL;
    public int LJJLI;
    public final Context LJJLIIIIJ;
    public boolean LJJZZIII;
    public boolean LJL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public String LJLJL;
    public C47582Ilu LJLJLJ;
    public C47579Ilr LJLJLLL;
    public int LJLL;
    public int LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public C47833Ipx LJLLLL;
    public C47862IqQ LJLLLLLL;
    public C47786IpC LJLZ;
    public C47797IpN LJZ;
    public C47577Ilp LJZI;
    public String LJZL;
    public final C47625Imb LL;
    public C11030bz LLD;
    public C47798IpO LLILLIZIL;
    public final C47766Ios LLJZIJLIL;
    public int LJIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJIILIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LJJI = "";
    public String LJJIFFI = "";
    public int LJJII = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LJJIII = "";
    public String LJJIIJ = "";
    public int LJJIIJZLJL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJIJIIJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJIJIIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJIJL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJIJLIJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public long LJJIZ = -2147483648L;
    public int LJJJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJJJLI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public long LJJJLL = -2147483648L;
    public long LJJJLZIJ = -2147483648L;
    public String LJJLIIIJ = "";
    public int LJJLIIIJILLIZJL = -1002;
    public long LJJLIIIJJI = -2147483648L;
    public long LJJLIIIJJIZ = -2147483648L;
    public int LJJLIIIJL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJLIIIJLJLI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJLIIIJLLLLLLLZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJLIIJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJLJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public long LJJLJLI = -2147483648L;
    public long LJJLL = -2147483648L;
    public long LJJZ = -2147483648L;
    public int LJJZZI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJLI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJLIIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJLIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public float LJLJJLL = Float.MIN_VALUE;
    public int LJLLI = 100;
    public int LLF = 12;
    public final java.util.Map LLFF = new HashMap();
    public int LLFFF = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLFII = 0;
    public int LLFZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLIFFJFJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLII = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLIIII = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLIIIILZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LLIIIJ = "";
    public String LLIIIL = "";
    public String LLIIIZ = "";
    public int LLIIJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LLIIJLIL = null;
    public C47631Imh LLIIL = null;
    public int LLIILII = 0;
    public int LLIILZL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLIIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLILII = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LLILIL = "";
    public long LLILL = -2147483648L;
    public ArrayList<String> LLILLJJLI = new ArrayList<>();
    public ArrayList<String> LLILLL = new ArrayList<>();
    public ArrayList<String> LLILZ = new ArrayList<>();
    public ArrayList<String> LLILZIL = new ArrayList<>();
    public ArrayList<String> LLILZLL = new ArrayList<>();
    public ArrayList<String> LLIZ = new ArrayList<>();
    public ArrayList<String> LLIZLLLIL = new ArrayList<>();
    public ArrayList<Integer> LLJ = new ArrayList<>();
    public ArrayList<Integer> LLJI = new ArrayList<>();
    public ArrayList<String> LLJIJIL = new ArrayList<>();
    public boolean LLJILJIL = false;
    public C47789IpF LLJILJILJ = null;
    public int LLJILLL = -1;
    public long LLJJ = -2147483648L;
    public long LLJJI = -2147483648L;
    public long LLJJIII = -2147483648L;
    public long LLJJIJI = -2147483648L;
    public long LLJJIJIIJIL = -2147483648L;
    public int LLJJIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LLJJJ = "default";
    public int LLJJJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLJJJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LLJJJJJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public ArrayList<String> LLJJJJLIIL = new ArrayList<>();
    public float LLJJL = Float.MIN_VALUE;
    public int LLJJLIIIJLLLLLLLZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public long LLJL = -2147483648L;
    public HashMap<String, Object> LLJLIL = null;
    public int LLJLILLLLZIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LLJLL = "";
    public ArrayList<String> LLJLLIL = new ArrayList<>();
    public String LLJLLL = "";
    public String LLJZ = "";
    public C47751Iod LIZIZ = new C47751Iod();

    public static int LJIIZILJ(int i, int i2) {
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    i3 = 4;
                    if (i != 4) {
                        return i2;
                    }
                }
            }
        }
        return (i2 * 10) - i3;
    }

    public final void LJJIFFI() {
        WeakReference<InterfaceC47584Ilw> weakReference;
        this.LJIIJJI = true;
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = new ArrayList<>();
        this.LJIILLIIL = new ArrayList();
        this.LJIIZILJ = new ArrayList();
        this.LJIJ = new ArrayList();
        this.LJIJI = null;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        this.LJIL = null;
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = null;
        this.LJJII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJIIJ = "";
        this.LJJIJ = null;
        this.LJJIJIIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJJJJ = 0;
        this.LJJJJJL = 0;
        this.LJJJJI = 0;
        this.LJJJJL = 0;
        this.LJJJJIZL = 0L;
        this.LJJJJZI = 0;
        this.LJJJJZ = 0;
        this.LJJJZ = 0L;
        this.LJJL = 0L;
        this.LJJZZI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLIIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJL = false;
        this.LJJZZIII = false;
        this.LJJLIIJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJIJL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJIJLIJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJIII = null;
        this.LJJJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        C47752Ioe c47752Ioe = this.LJI;
        int i = c47752Ioe.LJJZ;
        boolean z = c47752Ioe.LJJLI;
        C47906Ir8 c47906Ir8 = C47752Ioe.LJLIIL;
        if (c47906Ir8 != null && (weakReference = c47752Ioe.LIZJ) != null) {
            ((ReentrantLock) c47906Ir8.LIZJ).lock();
            c47906Ir8.LIZLLL.remove(weakReference);
            ((ReentrantLock) c47906Ir8.LIZJ).unlock();
        }
        C47752Ioe c47752Ioe2 = new C47752Ioe(this.LIZ, this.LJLJI, this.LJJLIIIIJ);
        this.LJI = c47752Ioe2;
        c47752Ioe2.LJJZ = i;
        c47752Ioe2.LJJLI = z;
        C47761Ion c47761Ion = new C47761Ion(c47752Ioe2);
        this.LJIIJ = c47761Ion;
        c47761Ion.LIZIZ = this.LJLJJLL;
        C47759Iol c47759Iol = this.LIZJ;
        C47752Ioe c47752Ioe3 = this.LJI;
        c47759Iol.LIZ = c47752Ioe3;
        this.LIZLLL.LIZ = c47752Ioe3;
        this.LJ.LIZ = c47752Ioe3;
        this.LJII.LIZ = c47752Ioe3;
        this.LJFF.LIZ = c47752Ioe3;
        this.LLILLIZIL = new C47798IpO();
        this.LJZ = new C47797IpN();
        this.LLD = new C11030bz(2);
        C47766Ios c47766Ios = this.LLJZIJLIL;
        if (!((java.util.Map) c47766Ios.LIZ).isEmpty()) {
            c47766Ios.LIZ = new HashMap();
        }
        this.LLIIIZ = null;
        this.LLIIJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIL = null;
        this.LLIIJLIL = null;
        this.LLIILII = 0;
        this.LLFII = 0;
    }

    public final void LIZJ() {
        java.util.Map<String, Long> LIZ;
        InterfaceC46858IaE interfaceC46858IaE = this.LIZ;
        if (interfaceC46858IaE != null && (LIZ = ((C47619ImV) interfaceC46858IaE).LIZ()) != null) {
            HashMap hashMap = (HashMap) LIZ;
            long LJIJI = C47756Ioi.LJIJI((Long) hashMap.get("vps"));
            long LJIJI2 = C47756Ioi.LJIJI((Long) hashMap.get("vds"));
            this.LJJJZ += LJIJI;
            this.LJJL += LJIJI2;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("_accumulateVPS accumVPS:");
            LIZ2.append(this.LJJJZ);
            LIZ2.append(", accumVDS:");
            LIZ2.append(this.LJJL);
            C0MT.LIZLLL(LIZ2, ", vps:", LJIJI, ", vds:");
            LIZ2.append(LJIJI2);
            C78253UnR.LJI("VideoEventLoggerV2", X1D.LIZIZ(LIZ2));
        }
    }

    public final void LIZLLL() {
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = new ArrayList<>();
        this.LJIILLIIL = new ArrayList();
        this.LJIIZILJ = new ArrayList();
        C47774Ip0 c47774Ip0 = this.LJFF;
        c47774Ip0.getClass();
        c47774Ip0.LIZIZ = new C47784IpA();
        c47774Ip0.LJII = null;
        c47774Ip0.LJI = null;
        c47774Ip0.LIZJ = false;
        c47774Ip0.LIZLLL = 0;
        c47774Ip0.LJ = -2147483648L;
        c47774Ip0.LJFF = 0;
        this.LJJLI = 0;
        this.LJJJLL = -2147483648L;
        this.LJJJZ = 0L;
        this.LJJL = 0L;
        this.LJJLIIIJJI = -2147483648L;
        this.LJJLIIIJJIZ = -2147483648L;
        this.LJIIJJI = true;
        this.LJJJJJ = 0;
        this.LJJJJJL = 0;
        this.LJJJJI = 0;
        this.LJJJJL = 0;
        this.LJJJJIZL = 0L;
        this.LJJIIZ = 0;
        this.LJJIIZI = false;
        this.LJJJJZ = 0;
        this.LJJJJZI = 0;
        this.LJJJLZIJ = -2147483648L;
        this.LJJLJLI = -2147483648L;
        this.LJJZ = -2147483648L;
        this.LJJLL = -2147483648L;
        this.LJJZZI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJL = false;
        this.LJJZZIII = false;
        this.LJLI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJJ = null;
        this.LJJIZ = -2147483648L;
        this.LLILLJJLI = new ArrayList<>();
        this.LLILLL = new ArrayList<>();
        this.LLILZ = new ArrayList<>();
        this.LLILZIL = new ArrayList<>();
        this.LLILZLL = new ArrayList<>();
        this.LLIZ = new ArrayList<>();
        this.LLIZLLLIL = new ArrayList<>();
        this.LLJ = new ArrayList<>();
        this.LLJI = new ArrayList<>();
        this.LLJIJIL = new ArrayList<>();
        this.LLJILJILJ = null;
        this.LLJJ = -2147483648L;
        this.LLJILLL = -1;
        this.LLJJI = -2147483648L;
        this.LLJJIII = -2147483648L;
        this.LLJJIJI = -2147483648L;
        this.LLJJIJIIJIL = -2147483648L;
        this.LLJILJIL = false;
        this.LLI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIFFJFJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIIILZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIIL = null;
        this.LLIIIJ = null;
        this.LLIIIZ = null;
        this.LLFZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLFII = 0;
        this.LLIILZL = LiveLayoutPreloadThreadPriority.DEFAULT;
        C47798IpO c47798IpO = this.LLILLIZIL;
        c47798IpO.LJIJI = 0;
        c47798IpO.LJIJJ = 0;
        c47798IpO.LJIJJLI = 0;
        this.LJLLLL = new C47833Ipx();
        this.LJLLLLLL = new C47862IqQ();
        C47786IpC c47786IpC = this.LJLZ;
        if (c47786IpC.LIZJ) {
            c47786IpC.LIZJ = false;
            c47786IpC.LIZ.getContentResolver().unregisterContentObserver(c47786IpC.LJ);
        }
        this.LJLZ = new C47786IpC(this.LJJLIIIIJ);
        C47797IpN c47797IpN = this.LJZ;
        c47797IpN.LIZ = 0;
        c47797IpN.LIZIZ = 0;
        c47797IpN.LJ.clear();
        ((HashMap) this.LLFF).clear();
        C47808IpY c47808IpY = this.LJIIIZ;
        c47808IpY.LIZJ = 0L;
        c47808IpY.LIZ.clear();
        C47798IpO c47798IpO2 = this.LLILLIZIL;
        c47798IpO2.LJJIII = 0;
        c47798IpO2.LJJIIJ = 0;
        this.LLJJJ = "after clear V2";
        this.LLJJJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJJJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJJJJJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJJJJLIIL = new ArrayList<>();
        this.LLJJL = Float.MIN_VALUE;
        this.LLJJLIIIJLLLLLLLZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJL = -2147483648L;
        this.LJLJL = null;
        this.LLILL = -2147483648L;
        this.LLILII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLILIL = "";
        this.LLIIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJLLIL = new ArrayList<>();
        this.LLJLLL = "";
        this.LLJZ = "";
        this.LLJLILLLLZIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJLL = "";
        this.LLIIJLIL = null;
        this.LLIIL = null;
        this.LLIIJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIILII = 0;
    }

    public final void LJ() {
        HashMap<String, Object> hashMap = this.LLJLIL;
        if (hashMap != null) {
            if (hashMap.containsKey("is_cast_live")) {
                this.LIZIZ.f0 = ((Integer) this.LLJLIL.get("is_cast_live")).intValue();
            }
            if (this.LLJLIL.containsKey("cast_source_app_id")) {
                this.LIZIZ.g0 = ((Integer) this.LLJLIL.get("cast_source_app_id")).intValue();
            }
            if (this.LLJLIL.containsKey("cast_scene_id")) {
                this.LIZIZ.h0 = ((Integer) this.LLJLIL.get("cast_scene_id")).intValue();
            }
            if (this.LLJLIL.containsKey("cast_protocal")) {
                this.LIZIZ.i0 = (String) this.LLJLIL.get("cast_protocal");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("get CastInfo, castLive:");
            LIZ.append(this.LIZIZ.f0);
            LIZ.append(", sourceAppId:");
            LIZ.append(this.LIZIZ.g0);
            LIZ.append(", sceneId:");
            LIZ.append(this.LIZIZ.h0);
            LIZ.append(", protocal:");
            LIZ.append(this.LIZIZ.i0);
            TTVideoEngineLog.d("VideoEventLoggerV2", X1D.LIZIZ(LIZ));
        }
    }

    public final java.util.Map LJFF() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("format_open_input", Long.valueOf(this.LIZIZ.LJII));
        hashMap.put("tran_connect", Long.valueOf(this.LIZIZ.LJJLIIIJL));
        hashMap.put("http_response", Long.valueOf(this.LIZIZ.LJJLIIIJLJLI));
        hashMap.put("receive_first_video_frame", Long.valueOf(this.LIZIZ.LJJLJLI));
        hashMap.put("decode_first_video_frame", Long.valueOf(this.LIZIZ.LJJZ));
        hashMap.put("render_first_video_frame", Long.valueOf(this.LIZIZ.LJIIJJI));
        hashMap.put("prepared", Long.valueOf(this.LIZIZ.LJJIII));
        return hashMap;
    }

    public final void LJI() {
        if (this.LLIIIILZ > 0) {
            HashMap hashMap = new HashMap(11);
            C60903NvH.LJJIJ(this.LIZIZ.q, "mask_open_ts", hashMap);
            C60903NvH.LJJIJ(this.LIZIZ.r, "mask_opened_ts", hashMap);
            C60903NvH.LJJIIZI(this.LLIIII, "mask_enable", hashMap);
            C60903NvH.LJJIIZI(this.LLIIIILZ, "mask_thread_enable", hashMap);
            C60903NvH.LJJIIZI(this.LLIIZ, "mask_range_opt", hashMap);
            C60903NvH.LJJIIZI(this.LLIL, "mask_enable_mdl", hashMap);
            C60903NvH.LJJIIZI(this.LLILII, "mask_delay_loading", hashMap);
            C60903NvH.LJJIJ(this.LLILL, "mask_file_size", hashMap);
            int i = this.LLIILZL;
            if (i < 0) {
                C60903NvH.LJJIIZI(i, "mask_errc", hashMap);
                C60903NvH.LJJIJIIJI("mask_url", this.LLIIIL, hashMap);
                C60903NvH.LJJIJIIJI("mask_file_hash", this.LLILIL, hashMap);
            }
            this.LIZIZ.LLJJI = hashMap;
        }
    }

    public final void LJII() {
        if (this.LLII > 0) {
            HashMap hashMap = new HashMap(13);
            C60903NvH.LJJIIZI(this.LLFZ, "sub_langs_c", hashMap);
            C60903NvH.LJJIJ(this.LIZIZ.o, "sub_req_fin_ts", hashMap);
            C60903NvH.LJJIJ(this.LIZIZ.p, "sub_load_fin_ts", hashMap);
            C60903NvH.LJJIIZI(this.LLFII, "sub_switch_c", hashMap);
            C60903NvH.LJJIIZI(this.LLI, "sub_enable", hashMap);
            C60903NvH.LJJIIZI(this.LLIFFJFJJ, "sub_enable_opt_load", hashMap);
            C60903NvH.LJJIIZI(this.LLII, "sub_thread_enable", hashMap);
            if (!TextUtils.isEmpty(this.LLIIIZ)) {
                C60903NvH.LJJIJIIJI("sub_error", this.LLIIIZ, hashMap);
                C60903NvH.LJJIJIIJI("sub_req_url", this.LLIIIJ, hashMap);
            }
            C60903NvH.LJJIIZI(this.LLIILII, "sub_switch_s_c", hashMap);
            C60903NvH.LJJIIZI(this.LLIIJI, "sub_errc", hashMap);
            C60903NvH.LJJIJIIJI("sub_cur_url", this.LLIIJLIL, hashMap);
            int i = 1;
            if (this.LIZIZ.N0 != 1) {
                i = 0;
            }
            C60903NvH.LJJIIZI(i, "sub_new_cb", hashMap);
            this.LIZIZ.LLJJ = hashMap;
        }
    }

    public final void LJIIIIZZ() {
        String str;
        String substring;
        if (!TextUtils.isEmpty(this.LJIJJ)) {
            str = this.LJIJJ;
        } else if (!TextUtils.isEmpty(this.LJJIII)) {
            str = this.LJJIII;
        } else if (!TextUtils.isEmpty(this.LJIJJLI)) {
            str = this.LJIJJLI;
        } else {
            return;
        }
        try {
            str = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("exception:");
            LIZ.append(e.toString());
            C78253UnR.LIZLLL("VideoEventLoggerV2", X1D.LIZIZ(LIZ));
        } catch (IllegalArgumentException e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("exception:");
            LIZ2.append(e2.toString());
            C78253UnR.LIZLLL("VideoEventLoggerV2", X1D.LIZIZ(LIZ2));
        }
        int indexOf = str.indexOf("&l=");
        if (indexOf > 0) {
            int indexOf2 = str.indexOf("&", indexOf + 1);
            if (indexOf2 > 0) {
                substring = str.substring(indexOf + 3, indexOf2);
            } else {
                substring = str.substring(indexOf + 3);
            }
            this.LIZIZ.LLLLLLZ = substring;
        }
    }

    public final void LJIIJ() {
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(LLLF);
        treeMap.putAll(this.LLFF);
        int i = this.LJI.LJJIII;
        if (i != 0) {
            treeMap.put("v_hw", Integer.valueOf(i));
        }
        int i2 = this.LJI.LJJIIJZLJL;
        if (i2 != 0) {
            treeMap.put("a_hw", Integer.valueOf(i2));
        }
        int i3 = this.LJIIL;
        if (i3 > 0) {
            treeMap.put("async_init", Integer.valueOf(i3));
        }
        int i4 = this.LJIILIIL;
        if (i4 > 0) {
            treeMap.put("codec_pool", Integer.valueOf(i4));
        }
        if (this.LJI.LJJIJ.equals("bytevc1")) {
            treeMap.put("bytevc1", 1);
        } else if (this.LJI.LJJIJ.equals("bytevc2")) {
            treeMap.put("bytevc2", 1);
        }
        int i5 = this.LJJLJ;
        if (i5 > 0) {
            treeMap.put("network_timeout", Integer.valueOf(i5));
        }
        int i6 = this.LJJLIL;
        if (i6 > 0) {
            treeMap.put("buffer_timeout", Integer.valueOf(i6));
        }
        int i7 = this.LLILLIZIL.LIZ;
        if (i7 > 0) {
            treeMap.put("buffer_directly", Integer.valueOf(i7));
        }
        int i8 = this.LLILLIZIL.LIZIZ;
        if (i8 > 0) {
            treeMap.put("first_buf_end_ms", Integer.valueOf(i8));
        }
        int i9 = this.LIZIZ.LLLILZJ;
        if (i9 > 0) {
            treeMap.put("oes_texture", Integer.valueOf(i9));
        }
        int i10 = this.LJLIIIL;
        if (i10 > 0) {
            treeMap.put("sr", Integer.valueOf(i10));
        }
        C47798IpO c47798IpO = this.LLILLIZIL;
        if (c47798IpO.LIZJ > 0) {
            int i11 = c47798IpO.LIZLLL;
            if (i11 == 0) {
                treeMap.put("volume_balance", 1);
                LJJJJZI(Integer.valueOf(((C47619ImV) this.LIZ).LIZJ(81)), "volume_balance");
            } else if (i11 == 1) {
                treeMap.put("volume_balancev2", 1);
                LJJJJZI(Integer.valueOf(((C47619ImV) this.LIZ).LIZJ(81)), "volume_balancev2");
            } else if (i11 == 4) {
                treeMap.put("volume_balance_tob", 1);
            }
        }
        int i12 = this.LJJJJ;
        if (i12 > 0) {
            treeMap.put("bash", Integer.valueOf(i12));
        }
        int i13 = this.LJI.LJJLIL;
        if (i13 > 0) {
            treeMap.put("abr", Integer.valueOf(i13));
        }
        int i14 = this.LLILLIZIL.LJ;
        if (i14 > 0) {
            treeMap.put("engine_looper", Integer.valueOf(i14));
        }
        int i15 = this.LLILLIZIL.LJFF;
        if (i15 > 0) {
            treeMap.put("auto_range", Integer.valueOf(i15));
        }
        int i16 = this.LLILLIZIL.LJI;
        if (i16 > 0) {
            treeMap.put("hw_drop", Integer.valueOf(i16));
        }
        int i17 = this.LLILLIZIL.LJII;
        if (i17 > 0) {
            treeMap.put("enable_https", Integer.valueOf(i17));
        }
        int i18 = this.LIZIZ.LLJLILLLLZIIL;
        if (i18 > 0) {
            treeMap.put("enable_hijack", Integer.valueOf(i18));
        }
        int i19 = this.LIZIZ.LLJLL;
        if (i19 > 0) {
            treeMap.put("hijack_retry", Integer.valueOf(i19));
        }
        int i20 = this.LLILLIZIL.LJIIIIZZ;
        if (i20 > 0) {
            treeMap.put("fallback_api", Integer.valueOf(i20));
        }
        int i21 = this.LLILLIZIL.LJIIIZ;
        if (i21 > 0) {
            treeMap.put("async_pos", Integer.valueOf(i21));
        }
        this.LJI.getClass();
        int i22 = this.LJI.LJJZ;
        if (i22 > 0) {
            treeMap.put("mdl_type", Integer.valueOf(i22));
        }
        int i23 = this.LLILLIZIL.LJIIJ;
        if (i23 > 0) {
            treeMap.put("enable_loadcontrol", Integer.valueOf(i23));
        }
        int i24 = this.LLILLIZIL.LJIIJJI;
        if (i24 == 5) {
            if (this.LJI.LJJIII == 0) {
                treeMap.put("render_type", 5);
            } else {
                treeMap.put("render_type", 3);
            }
        } else if (i24 >= 0) {
            treeMap.put("render_type", Integer.valueOf(i24));
        }
        treeMap.put("image_scale", Integer.valueOf(this.LLILLIZIL.LJIIL));
        int i25 = this.LJJLIIJ;
        if (i25 >= 0) {
            treeMap.put("mc_render", Integer.valueOf(i25));
        }
        int i26 = this.LLILLIZIL.LJIILIIL;
        if (i26 >= 0) {
            treeMap.put("audio_render_type", Integer.valueOf(i26));
        }
        int i27 = this.LLILLIZIL.LJIILJJIL;
        if (i27 > 0) {
            treeMap.put("skip_find_stream", Integer.valueOf(i27));
        }
        int i28 = this.LLILLIZIL.LJIILL;
        if (i28 > 0) {
            treeMap.put("async_prepare", Integer.valueOf(i28));
        }
        int i29 = this.LLILLIZIL.LJIILLIIL;
        if (i29 > 0) {
            treeMap.put("frc_level", Integer.valueOf(i29));
        }
        int i30 = this.LLILLIZIL.LJIIZILJ;
        if (i30 > 0) {
            treeMap.put("lazy_seek", Integer.valueOf(i30));
        }
        int i31 = this.LLILLIZIL.LJIJ;
        if (i31 > 0) {
            treeMap.put("keep_formater_alive", Integer.valueOf(i31));
        }
        int i32 = this.LIZIZ.LLJIJIL;
        if (i32 > 0) {
            treeMap.put("dis_short_seek", Integer.valueOf(i32));
        }
        int i33 = this.LIZIZ.LLJI;
        if (i33 > 0) {
            treeMap.put("pref_near_sample", Integer.valueOf(i33));
        }
        int i34 = this.LLII;
        if (i34 > 0) {
            treeMap.put("sub_thread_enable", Integer.valueOf(i34));
        }
        int i35 = this.LLIIIILZ;
        if (i35 > 0) {
            treeMap.put("mask_thread_enable", Integer.valueOf(i35));
        }
        if ((this.LLILLIZIL.LJIJI & 1) == 1) {
            treeMap.put("hdr_pq", 1);
        }
        if ((this.LLILLIZIL.LJIJI & 2) == 2) {
            treeMap.put("hdr_hlg", 1);
        }
        if (this.LLILLIZIL.LJIJJ > 0) {
            treeMap.put("abr_startup", 1);
        }
        int i36 = this.LLILLIZIL.LJJIII;
        if (i36 > 0) {
            treeMap.put("gear_strategy", Integer.valueOf(i36));
        }
        int i37 = this.LLILLIZIL.LJJIIJ;
        if (i37 > 0) {
            treeMap.put("sr_strategy", Integer.valueOf(i37));
        }
        if (this.LLILLIZIL.LJIJJLI > 0) {
            treeMap.put("thread_priority", 1);
        }
        if (this.LLILLIZIL.LJIL > 0) {
            treeMap.put("smooth_clock", 1);
        }
        if (this.LLILLIZIL.LJJ > 0) {
            treeMap.put("disable_split_voice", 1);
        }
        if (this.LJI.LJJIII == 0 && this.LLILLIZIL.LJJI > 0) {
            treeMap.put("yv12", 1);
        }
        if (this.LIZIZ.LLLLZ == 28) {
            treeMap.put("heaacv2", 1);
        }
        if (this.LLILLIZIL.LJJIFFI > 0) {
            treeMap.put("strategy_center", 1);
        } else {
            treeMap.put("strategy_center", 0);
        }
        int i38 = this.LLILLIZIL.LJJII;
        if (i38 >= 0) {
            treeMap.put("drop_limit", Integer.valueOf(i38));
        }
        if (this.LLILLIZIL.LJJIIJZLJL == 1) {
            treeMap.put("loop_way", 1);
        }
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        int LJJIIJZLJL = dataLoaderHelper.LJJIIJZLJL(8);
        if (LJJIIJZLJL > 0) {
            treeMap.put("mdl_socket_reuse", Integer.valueOf(LJJIIJZLJL));
        }
        int LJJIIJZLJL2 = dataLoaderHelper.LJJIIJZLJL(1001);
        if (LJJIIJZLJL2 > 0) {
            treeMap.put("mdl_preconn", Integer.valueOf(LJJIIJZLJL2));
        }
        if (dataLoaderHelper.LJJIIJZLJL(7) > 0) {
            treeMap.put("mdl_externdns", 1);
            if (TextUtils.equals(this.LJI.LJIJJ, "httpDNS_own") || TextUtils.equals(this.LJI.LJIJJ, "httpDNS_google") || TextUtils.equals(this.LJI.LJIJJ, "customDNSInnerByteDanceHTTPDNS")) {
                treeMap.put("mdl_httpdns", 1);
            }
        }
        int LJJIIJZLJL3 = dataLoaderHelper.LJJIIJZLJL(114);
        if (LJJIIJZLJL3 > 0) {
            treeMap.put("mdl_predns", Integer.valueOf(LJJIIJZLJL3));
        }
        int LJJIIJZLJL4 = dataLoaderHelper.LJJIIJZLJL(105);
        if (LJJIIJZLJL4 > 0) {
            treeMap.put("mdl_dns_refresh", Integer.valueOf(LJJIIJZLJL4));
        }
        int LJJIIJZLJL5 = dataLoaderHelper.LJJIIJZLJL(103);
        if (LJJIIJZLJL5 > 0) {
            treeMap.put("mdl_dns_parallel", Integer.valueOf(LJJIIJZLJL5));
        }
        int LJJIIJZLJL6 = dataLoaderHelper.LJJIIJZLJL(115);
        if (LJJIIJZLJL6 > 0) {
            treeMap.put("mdl_backip", Integer.valueOf(LJJIIJZLJL6));
        }
        int LJJIIJZLJL7 = dataLoaderHelper.LJJIIJZLJL(101);
        if (LJJIIJZLJL7 > 0) {
            treeMap.put("mdl_session_reuse", Integer.valueOf(LJJIIJZLJL7));
        }
        int LJJIIJZLJL8 = dataLoaderHelper.LJJIIJZLJL(100);
        if (LJJIIJZLJL8 == 3) {
            treeMap.put("mdl_tls_ver", Integer.valueOf(LJJIIJZLJL8));
        }
        long LJJIIZ = dataLoaderHelper.LJJIIZ(1152);
        String LJJIJ = dataLoaderHelper.LJJIJ(9010);
        if (LJJIIZ > 0 && !TextUtils.isEmpty(LJJIJ)) {
            treeMap.put("mdl_socket_monitor", 1);
        }
        this.LIZIZ.LLZIL = treeMap;
    }

    public final void LJJ() {
        C47751Iod c47751Iod = this.LIZIZ;
        if (c47751Iod.LJJIIJ <= 0) {
            c47751Iod.LJJII = System.currentTimeMillis();
        }
    }

    public final void LJJI() {
        C47751Iod c47751Iod = this.LIZIZ;
        if (c47751Iod.LJJIIJ <= 0) {
            c47751Iod.LJJIFFI = System.currentTimeMillis();
        }
    }

    public final void LJJJJLI() {
        Object obj;
        long longValue;
        Object obj2;
        Object obj3;
        if (this.LJJLI != 4 || this.LJIIJJI) {
            this.LJJLI = 2;
            this.LJIIJJI = false;
            long j = 0;
            if (this.LJLI == 1) {
                C47751Iod c47751Iod = this.LIZIZ;
                if (c47751Iod.LJJII <= 0) {
                    c47751Iod.LJJII = System.currentTimeMillis();
                }
            }
            C47751Iod c47751Iod2 = this.LIZIZ;
            if (c47751Iod2.LJJIIJ <= 0) {
                c47751Iod2.LJJIIJ = System.currentTimeMillis();
                C47759Iol c47759Iol = this.LIZJ;
                if (c47759Iol != null) {
                    c47759Iol.LJI = System.currentTimeMillis();
                }
                C47765Ior c47765Ior = this.LJ;
                if (c47765Ior != null) {
                    c47765Ior.LJFF = System.currentTimeMillis();
                }
                C47774Ip0 c47774Ip0 = this.LJFF;
                if (c47774Ip0 != null) {
                    c47774Ip0.LJ = System.currentTimeMillis();
                }
                C47752Ioe c47752Ioe = this.LJI;
                InterfaceC46858IaE interfaceC46858IaE = c47752Ioe.LIZ;
                if (interfaceC46858IaE != null) {
                    c47752Ioe.LJJIJ = ((C47619ImV) interfaceC46858IaE).LJ(0);
                    c47752Ioe.LJJIJIIJI = ((C47619ImV) c47752Ioe.LIZ).LJ(146);
                    if (c47752Ioe.LJJIJL < 0) {
                        c47752Ioe.LJJIJL = ((C47619ImV) c47752Ioe.LIZ).LIZJ(49);
                    }
                }
                java.util.Map map = c47752Ioe.LJJJJLL;
                if (map != null) {
                    java.util.Map map2 = (java.util.Map) ((HashMap) map).get("size");
                    if (map2 == null || (obj = map2.get(c47752Ioe.LJJJ)) == null) {
                        longValue = 0;
                    } else {
                        longValue = ((Number) obj).longValue();
                    }
                    java.util.Map map3 = (java.util.Map) ((HashMap) c47752Ioe.LJJJJLL).get("audio_size");
                    if (map3 != null && map3.size() > 0 && c47752Ioe.LJJLIIIJ != -1 && (obj3 = map3.get(Integer.valueOf(c47752Ioe.LJJLIIIJ))) != null) {
                        j = ((Number) obj3).longValue();
                    }
                    c47752Ioe.LJJIIZI = longValue + j;
                    java.util.Map map4 = (java.util.Map) ((HashMap) c47752Ioe.LJJJJLL).get("vtype");
                    if (map4 != null && (obj2 = map4.get(c47752Ioe.LJJJ)) != null) {
                        c47752Ioe.LJJIJLIJ = (String) obj2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("showedOneFrame vtype:");
                        LIZ.append(c47752Ioe.LJJIJLIJ);
                        LIZ.append(", currentResolution:");
                        JBR.LJIIIZ(LIZ, c47752Ioe.LJJJ, LIZ, "VideoEventBase");
                    }
                }
                InterfaceC46858IaE interfaceC46858IaE2 = this.LIZ;
                if (interfaceC46858IaE2 != null) {
                    this.LIZIZ.LLLLLZL = ((C47619ImV) interfaceC46858IaE2).LIZJ(63);
                    this.LIZIZ.LLLLZ = ((C47619ImV) this.LIZ).LIZJ(64);
                }
                if (this.LJIIL == 1 && ((C47619ImV) this.LIZ).LIZJ(97) == 0) {
                    this.LJIIL = -1;
                }
            }
            LJIIIZ(-2001, true);
        }
    }

    public final void LJIIL() {
        LIZJ();
    }

    public final void LIZ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVNoRenderEnd, type: ");
        LIZ.append(i);
        TTVideoEngineLog.d("VideoEventLoggerV2", X1D.LIZIZ(LIZ));
        C47774Ip0 c47774Ip0 = this.LJFF;
        if (!c47774Ip0.LIZJ) {
            C78253UnR.LJI("VideoEventLoggerV2", "AVNoRenderEnd, not started before, abort");
            return;
        }
        if (c47774Ip0.LIZIZ.LIZ == i) {
            c47774Ip0.LIZ("wait");
            LJIILL(i);
            if (i == 0) {
                LJIIIZ(-2007, false);
                return;
            } else {
                if (i != 1) {
                    return;
                }
                LJIIIZ(-2008, false);
                return;
            }
        }
        C78253UnR.LJI("VideoEventLoggerV2", "AVNoRenderEnd, type does not match, abort");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI(int i) {
        C47172IfI LJIIJ;
        int i2;
        this.LIZIZ.LLJJIJIIJIL = i;
        C47582Ilu c47582Ilu = this.LJLJLJ;
        if (c47582Ilu != null) {
            c47582Ilu.cancel();
            this.LJLJLJ = null;
        }
        C47579Ilr c47579Ilr = this.LJLJLLL;
        if (c47579Ilr != null) {
            c47579Ilr.cancel();
            this.LJLJLLL = null;
        }
        if (this.LJLJJL) {
            this.LJIIJ.LJFF();
        }
        if (this.LIZIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendEvent pt_new:");
            LIZ.append(this.LIZIZ.LIZLLL);
            LIZ.append(", mEvent:");
            LIZ.append(this.LIZIZ);
            LIZ.append(", eventBase:");
            LIZ.append(this.LJI);
            C78253UnR.LJI("VideoEventLoggerV2", X1D.LIZIZ(LIZ));
            if (this.LIZIZ.LIZLLL > 0 || this.LJJZ > 0) {
                InterfaceC46858IaE interfaceC46858IaE = this.LIZ;
                if (interfaceC46858IaE != null) {
                    java.util.Map<String, Long> LIZ2 = ((C47619ImV) interfaceC46858IaE).LIZ();
                    if (LIZ2 != null) {
                        HashMap hashMap = (HashMap) LIZ2;
                        long longValue = ((Number) hashMap.get("vps")).longValue();
                        long longValue2 = ((Number) hashMap.get("vds")).longValue();
                        long longValue3 = ((Number) hashMap.get("single_vds")).longValue();
                        long longValue4 = ((Number) hashMap.get("accu_vds")).longValue();
                        C47751Iod c47751Iod = this.LIZIZ;
                        c47751Iod.LJJIJL = this.LJJJZ + longValue;
                        if (this.LJJIIZI) {
                            c47751Iod.LJJIJLIJ = this.LJJL + longValue3;
                        } else {
                            c47751Iod.LJJIJLIJ = this.LJJL + longValue2;
                        }
                        c47751Iod.LJJIL = this.LJJL + longValue4;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("_sendEvent accumVDS:");
                        LIZ3.append(this.LJJL);
                        C0MT.LIZLLL(LIZ3, ", vds:", longValue2, ", single_vds:");
                        LIZ3.append(longValue3);
                        LIZ3.append(", mEvent.vds:");
                        LIZ3.append(this.LIZIZ.LJJIJLIJ);
                        LIZ3.append(", accu_vds:");
                        LIZ3.append(longValue4);
                        C78253UnR.LJI("VideoEventLoggerV2", X1D.LIZIZ(LIZ3));
                        EngineThreadPool.addExecuteTask(new RunnableC47312IhY(this.LIZIZ.LJJIJL));
                    }
                    this.LIZIZ.LLIIIILZ = ((C47619ImV) this.LIZ).LJ(1);
                    LJIJJ(((C47619ImV) this.LIZ).LJ(2));
                    this.LIZIZ.LLIIIJ = ((C47619ImV) this.LIZ).LJ(3);
                    this.LIZIZ.LLIIIL = ((C47619ImV) this.LIZ).LJ(4);
                    this.LIZIZ.LJLLI = ((C47619ImV) this.LIZ).LIZJ(23);
                    this.LIZIZ.LLJI = ((C47619ImV) this.LIZ).LIZJ(34);
                    this.LIZIZ.LLJ = ((C47619ImV) this.LIZ).LIZJ(35);
                    this.LIZIZ.LLJIJIL = ((C47619ImV) this.LIZ).LIZJ(36);
                    if (this.LIZIZ.LJLLJ == null) {
                        String LJ = ((C47619ImV) this.LIZ).LJ(5);
                        if (LJ == null) {
                            LJ = "";
                        }
                        this.LIZIZ.LJLLJ = LJ;
                    }
                    String LJ2 = ((C47619ImV) this.LIZ).LJ(33);
                    if (!TextUtils.isEmpty(LJ2)) {
                        this.LIZIZ.LJLLL = LJ2;
                    }
                    C47751Iod c47751Iod2 = this.LIZIZ;
                    if (c47751Iod2.LJJLIIIJJIZ <= 0) {
                        c47751Iod2.LLLFFI = 1;
                        c47751Iod2.LJJLIIIJJIZ = ((C47619ImV) this.LIZ).LIZLLL(7);
                    }
                    if (this.LIZIZ.LJJLIIIJL <= 0) {
                        long LIZLLL = ((C47619ImV) this.LIZ).LIZLLL(10);
                        if (LIZLLL > this.LJJZ) {
                            this.LIZIZ.LJJLIIIJL = LIZLLL;
                        }
                    }
                    if (this.LIZIZ.LJJLIIIJLLLLLLLZ <= 0) {
                        long LIZLLL2 = ((C47619ImV) this.LIZ).LIZLLL(11);
                        if (LIZLLL2 > this.LJJZ) {
                            this.LIZIZ.LJJLIIIJLLLLLLLZ = LIZLLL2;
                        }
                    }
                    C47751Iod c47751Iod3 = this.LIZIZ;
                    if (c47751Iod3.LJJLIIJ <= 0) {
                        c47751Iod3.LJJLIIJ = ((C47619ImV) this.LIZ).LIZLLL(51);
                    }
                    if (this.LIZIZ.LJJLIL <= 0) {
                        long LIZLLL3 = ((C47619ImV) this.LIZ).LIZLLL(52);
                        if (LIZLLL3 > this.LJJZ) {
                            this.LIZIZ.LJJLIL = LIZLLL3;
                        }
                    }
                    if (this.LIZIZ.LJJLJ <= 0) {
                        long LIZLLL4 = ((C47619ImV) this.LIZ).LIZLLL(53);
                        if (LIZLLL4 > this.LJJZ) {
                            this.LIZIZ.LJJLJ = LIZLLL4;
                        }
                    }
                    C47751Iod c47751Iod4 = this.LIZIZ;
                    if (c47751Iod4.LJJLJLI <= 0) {
                        c47751Iod4.LJJLJLI = ((C47619ImV) this.LIZ).LIZLLL(12);
                    }
                    C47751Iod c47751Iod5 = this.LIZIZ;
                    if (c47751Iod5.LJJLL <= 0) {
                        c47751Iod5.LJJLL = ((C47619ImV) this.LIZ).LIZLLL(13);
                    }
                    C47751Iod c47751Iod6 = this.LIZIZ;
                    if (c47751Iod6.LJJZ <= 0) {
                        c47751Iod6.LJJZ = ((C47619ImV) this.LIZ).LIZLLL(14);
                    }
                    C47751Iod c47751Iod7 = this.LIZIZ;
                    if (c47751Iod7.LJJZZI <= 0) {
                        c47751Iod7.LJJZZI = ((C47619ImV) this.LIZ).LIZLLL(15);
                    }
                    C47751Iod c47751Iod8 = this.LIZIZ;
                    if (c47751Iod8.LJLJI <= 0) {
                        c47751Iod8.LJLJI = ((C47619ImV) this.LIZ).LIZLLL(17);
                    }
                    C47751Iod c47751Iod9 = this.LIZIZ;
                    if (c47751Iod9.LJLJJL <= 0) {
                        c47751Iod9.LJLJJL = ((C47619ImV) this.LIZ).LIZLLL(16);
                    }
                    C47751Iod c47751Iod10 = this.LIZIZ;
                    if (c47751Iod10.LJLJJI <= 0) {
                        c47751Iod10.LJLJJI = ((C47619ImV) this.LIZ).LIZLLL(19);
                    }
                    C47751Iod c47751Iod11 = this.LIZIZ;
                    if (c47751Iod11.LJLJJLL <= 0) {
                        c47751Iod11.LJLJJLL = ((C47619ImV) this.LIZ).LIZLLL(18);
                    }
                    C47751Iod c47751Iod12 = this.LIZIZ;
                    if (c47751Iod12.LLJZ <= 0) {
                        c47751Iod12.LLJZ = ((C47619ImV) this.LIZ).LIZLLL(38);
                    }
                    C47751Iod c47751Iod13 = this.LIZIZ;
                    if (c47751Iod13.LLJZIJLIL <= 0) {
                        c47751Iod13.LLJZIJLIL = ((C47619ImV) this.LIZ).LIZLLL(39);
                    }
                    C47751Iod c47751Iod14 = this.LIZIZ;
                    if (c47751Iod14.LJIIZILJ <= 0) {
                        c47751Iod14.LJIIZILJ = ((C47619ImV) this.LIZ).LIZLLL(115);
                    }
                    C47751Iod c47751Iod15 = this.LIZIZ;
                    if (c47751Iod15.LJIJ <= 0) {
                        c47751Iod15.LJIJ = ((C47619ImV) this.LIZ).LIZLLL(116);
                    }
                    C47751Iod c47751Iod16 = this.LIZIZ;
                    if (c47751Iod16.LJIJI <= 0) {
                        c47751Iod16.LJIJI = ((C47619ImV) this.LIZ).LIZLLL(117);
                    }
                    C47751Iod c47751Iod17 = this.LIZIZ;
                    if (c47751Iod17.LJIJJ <= 0) {
                        c47751Iod17.LJIJJ = ((C47619ImV) this.LIZ).LIZLLL(118);
                    }
                    C47751Iod c47751Iod18 = this.LIZIZ;
                    if (c47751Iod18.LJIJJLI <= 0) {
                        c47751Iod18.LJIJJLI = ((C47619ImV) this.LIZ).LIZLLL(119);
                    }
                    C47751Iod c47751Iod19 = this.LIZIZ;
                    if (c47751Iod19.LJIL <= 0) {
                        c47751Iod19.LJIL = ((C47619ImV) this.LIZ).LIZLLL(LiveTryModeCountDownThresholdSetting.DEFAULT);
                    }
                    this.LIZIZ.LLIIJLIL = ((C47619ImV) this.LIZ).LIZJ(61);
                    this.LIZIZ.LLIIL = ((C47619ImV) this.LIZ).LIZJ(27);
                    this.LIZIZ.LJLLLLLL = ((C47619ImV) this.LIZ).LIZJ(30);
                    this.LIZIZ.LLILZIL = ((C47619ImV) this.LIZ).LJ(31);
                    this.LIZIZ.LLILZLL = ((C47619ImV) this.LIZ).LJ(32);
                    this.LIZIZ.LLIZ = ((C47619ImV) this.LIZ).LJ(111);
                    C47798IpO c47798IpO = this.LLILLIZIL;
                    if (c47798IpO.LIZJ > 0) {
                        int i3 = c47798IpO.LIZLLL;
                        if (i3 == 0) {
                            this.LIZIZ.LLILL = 0;
                        } else if (i3 == 1) {
                            this.LIZIZ.LLILL = 1;
                        }
                    }
                    if (LLL == 0) {
                        this.LIZIZ.LLLLIIL = ((C47619ImV) this.LIZ).LIZLLL(54);
                        this.LIZIZ.LLLLIILL = ((C47619ImV) this.LIZ).LIZLLL(57);
                        this.LIZIZ.LLLLIILLL = ((C47619ImV) this.LIZ).LIZLLL(58);
                    }
                    int LIZJ = ((C47619ImV) this.LIZ).LIZJ(100);
                    if (LIZJ != 0) {
                        this.LIZIZ.LLLIZZ = LIZJ;
                    }
                    C47751Iod c47751Iod20 = this.LIZIZ;
                    if (c47751Iod20.LLLLLZL == Integer.MIN_VALUE) {
                        c47751Iod20.LLLLLZL = ((C47619ImV) this.LIZ).LIZJ(63);
                    }
                    C47751Iod c47751Iod21 = this.LIZIZ;
                    if (c47751Iod21.LLLLZ == Integer.MIN_VALUE) {
                        c47751Iod21.LLLLZ = ((C47619ImV) this.LIZ).LIZJ(64);
                    }
                    this.LIZIZ.LLLLJI = ((C47619ImV) this.LIZ).LIZJ(77);
                    this.LIZIZ.LLLLL = ((C47619ImV) this.LIZ).LIZJ(147);
                    this.LIZIZ.LLLLLIL = ((C47619ImV) this.LIZ).LIZJ(155);
                    int LIZJ2 = ((C47619ImV) this.LIZ).LIZJ(157);
                    if (LIZJ2 > 0) {
                        this.LIZIZ.LLLLLILLIL = ((C47619ImV) this.LIZ).LIZJ(156) / LIZJ2;
                    }
                    this.LIZIZ.K = ((C47619ImV) this.LIZ).LIZJ(87);
                    HashMap<String, Object> LJI = this.LJI.LJI();
                    if (LJI != null) {
                        this.LLJ.add(LJI.get("power"));
                        this.LLJI.add(LJI.get("isCharging"));
                    }
                    ((C47619ImV) this.LIZ).LIZ.get();
                    this.LIZIZ.LLLIL = ((C47619ImV) this.LIZ).LIZJ(114);
                    long LIZLLL5 = ((C47619ImV) this.LIZ).LIZLLL(137);
                    if (LIZLLL5 > 0) {
                        this.LIZIZ.W = LIZLLL5;
                    }
                    long LIZLLL6 = ((C47619ImV) this.LIZ).LIZLLL(138);
                    if (LIZLLL6 > 0) {
                        this.LIZIZ.f74X = LIZLLL6;
                    }
                    this.LIZIZ.E0 = ((C47619ImV) this.LIZ).LIZJ(94);
                }
                int i4 = this.LJJIJIIJIL;
                if (i4 > 0) {
                    this.LJI.LJJIIZ = i4;
                }
                Context context = this.LJJLIIIIJ;
                if (context != null) {
                    SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "VideoEventLogger");
                    this.LIZIZ.LLLLLLZZ = LIZIZ.getString("playersessionid", "");
                    SharedPreferences.Editor edit = LIZIZ.edit();
                    edit.putString("playersessionid", this.LJI.LJIILL);
                    edit.apply();
                }
                C47751Iod c47751Iod22 = this.LIZIZ;
                C47752Ioe c47752Ioe = this.LJI;
                c47751Iod22.LLLLLLLZIL = c47752Ioe.LJIILL;
                c47751Iod22.LLJJIII = this.LJJLIIIJILLIZJL;
                c47751Iod22.LJLLLL = this.LJJJJLI;
                c47751Iod22.LJLZ = this.LJJJJLL;
                c47751Iod22.LLF = this.LJJIJIL;
                c47751Iod22.LLFF = this.LJJIL;
                c47751Iod22.LJJIJIL = this.LJIJ;
                c47751Iod22.LJJJJ = c47752Ioe.LJJIZ;
                c47751Iod22.LJJJIL = c47752Ioe.LJJJ;
                c47751Iod22.LJJLIIIJILLIZJL = this.LJJIIJZLJL;
                c47751Iod22.LJZI = this.LJJIIZ;
                c47751Iod22.LJJIZ = this.LJJIJL;
                c47751Iod22.LJJJ = this.LJJIJLIJ;
                c47751Iod22.LLFFF = this.LJJIJIIJI;
                c47751Iod22.LLFII = this.LJIIL;
                c47751Iod22.LLIIZ = this.LJJJIL;
                if (SystemClock.elapsedRealtime() - C78609UtB.LJLJL >= LivePreviewNetworkSpeedThresholdSetting.DEFAULT) {
                    EngineThreadPool.addExecuteTask(new ARunnableS15S0000000_8(5));
                }
                c47751Iod22.LLILII = C78609UtB.LJLJJLL;
                C47751Iod c47751Iod23 = this.LIZIZ;
                c47751Iod23.LJJIJIIJI = this.LJJJJJ;
                c47751Iod23.LJJIJIIJIL = this.LJJJJL;
                c47751Iod23.LLLL = this.LJJLIIIJJI;
                c47751Iod23.LLLLII = this.LJJLIIIJJIZ;
                c47751Iod23.LLLLIL = this.LJJLIIIJL;
                c47751Iod23.LLLLILI = this.LJJLIIIJLJLI;
                c47751Iod23.LLLLJ = this.LJJLIIIJLLLLLLLZ;
                c47751Iod23.LLLLLJLJLL = this.LJJZZI;
                c47751Iod23.LLLLLLIL = this.LJL;
                c47751Iod23.LLLLLL = this.LJJZZIII;
                c47751Iod23.LLLLLLJ = this.LJLI;
                c47751Iod23.LLLILZ = this.LJJLIIJ;
                c47751Iod23.LLLJ = this.LJIILIIL;
                long j = this.LJJIZ;
                if (j > 0) {
                    c47751Iod23.LJLJL = j;
                }
                c47751Iod23.LJLJLJ = this.LJJJ;
                c47751Iod23.LJLJLLL = this.LJLJL;
                C47759Iol c47759Iol = this.LIZJ;
                if (c47759Iol != null) {
                    c47751Iod23.LLFZ = c47759Iol.LJ;
                }
                c47751Iod23.LLI = this.LJJJJIZL;
                c47751Iod23.LLIIII = this.LJJJJZI;
                c47751Iod23.LJZL = this.LJJJJZ;
                c47751Iod23.LLLLLLL = this.LJLIIIL;
                c47751Iod23.LLLLLLLLLL = this.LJLIIL;
                c47751Iod23.LLLLLLLLL = this.LJLIL;
                c47751Iod23.LLIZLLLIL = this.LJJLIL;
                c47751Iod23.LLZLLIL = this.LLJJIJIIJIL;
                c47751Iod23.LLZLL = this.LLJJIJI;
                C47751Iod c47751Iod24 = this.LIZIZ;
                c47751Iod24.LLZLI = this.LLJJIII;
                c47751Iod24.LLZL = this.LLJJI;
                c47751Iod24.t = this.LLFFF;
                if (C146165oS.LJI <= 0) {
                    Context context2 = this.LJJLIIIIJ;
                    Point point = new Point();
                    ((WindowManager) C16880lQ.LLILL(context2, "window")).getDefaultDisplay().getRealSize(point);
                    C146165oS.LJI = point.x;
                }
                c47751Iod24.u = C146165oS.LJI;
                C47751Iod c47751Iod25 = this.LIZIZ;
                if (C146165oS.LJII <= 0) {
                    Context context3 = this.LJJLIIIIJ;
                    Point point2 = new Point();
                    ((WindowManager) C16880lQ.LLILL(context3, "window")).getDefaultDisplay().getRealSize(point2);
                    C146165oS.LJII = point2.y;
                }
                c47751Iod25.v = C146165oS.LJII;
                this.LIZIZ.w = Resources.getSystem().getDisplayMetrics().densityDpi;
                this.LIZIZ.x = Resources.getSystem().getDisplayMetrics().xdpi;
                this.LIZIZ.y = Resources.getSystem().getDisplayMetrics().ydpi;
                if (this.LJLLLL.LIZIZ() > 0.0f) {
                    this.LIZIZ.z = this.LJLLLL.LIZIZ();
                }
                if (this.LJLLLL.LIZ() > 0.0f) {
                    this.LIZIZ.A = this.LJLLLL.LIZ();
                }
                C47751Iod c47751Iod26 = this.LIZIZ;
                C47833Ipx c47833Ipx = this.LJLLLL;
                c47751Iod26.B = c47833Ipx.LIZJ;
                c47751Iod26.C = c47833Ipx.LIZLLL;
                c47751Iod26.D = c47833Ipx.LIZ;
                c47751Iod26.E = c47833Ipx.LIZIZ;
                c47751Iod26.F = this.LJLLLLLL.LIZIZ;
                c47751Iod26.G = this.LJLZ.LIZIZ;
                C47797IpN c47797IpN = this.LJZ;
                c47797IpN.getClass();
                c47751Iod26.H = new ArrayList<>(c47797IpN.LJ);
                C47751Iod c47751Iod27 = this.LIZIZ;
                c47751Iod27.C0 = this.LLD;
                c47751Iod27.k0 = this.LLJJIJIL;
                c47751Iod27.l0 = this.LLJJJ;
                c47751Iod27.m0 = this.LLJJJIL;
                c47751Iod27.n0 = this.LLJJJJ;
                c47751Iod27.o0 = this.LLJJJJJIL;
                HashMap hashMap2 = new HashMap();
                for (int i5 = 0; i5 < this.LJIILJJIL.size() && i5 < 3; i5++) {
                    try {
                        hashMap2.put(C16880lQ.LLLZ("fetchretry%d", new Object[]{Integer.valueOf(i5)}), ListProtector.get(this.LJIILJJIL, i5));
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                for (int i6 = 0; i6 < this.LJIILLIIL.size() && i6 < 3; i6++) {
                    hashMap2.put(C16880lQ.LLLZ("ldns%d", new Object[]{Integer.valueOf(i6)}), ((C47789IpF) ListProtector.get(this.LJIILLIIL, i6)).LJFF());
                }
                for (int i7 = 0; i7 < this.LJIIZILJ.size(); i7++) {
                    if (i7 >= 2) {
                        i2 = 1;
                        if (i7 != this.LJIIZILJ.size() - 1) {
                        }
                    } else {
                        i2 = 1;
                    }
                    Object[] objArr = new Object[i2];
                    objArr[0] = Integer.valueOf(i7);
                    hashMap2.put(C16880lQ.LLLZ("error%d", objArr), ListProtector.get(this.LJIIZILJ, i7));
                }
                if (!TextUtils.isEmpty(this.LJJIIJ)) {
                    hashMap2.put("log", this.LJJIIJ);
                }
                if (!TextUtils.isEmpty(this.LIZIZ.LLLILZLLLI)) {
                    hashMap2.put("tr_err_msg", this.LIZIZ.LLLILZLLLI);
                }
                this.LJJIIJ = "";
                this.LIZIZ.LJJLIIIJJI = hashMap2;
                this.LJJLIIIJ = hashMap2.toString();
                String str = this.LJIJI;
                if (str != null) {
                    this.LIZIZ.LJJJJZ = str;
                }
                String str2 = this.LJIJJ;
                if (str2 != null) {
                    this.LIZIZ.LJJJJZI = str2;
                }
                if (this.LJIJJLI != null) {
                    this.LIZIZ.getClass();
                }
                String str3 = this.LJIL;
                if (str3 != null) {
                    this.LIZIZ.LJJJLIIL = str3;
                }
                String str4 = this.LJJ;
                if (str4 != null) {
                    this.LIZIZ.LJJJLL = str4;
                }
                String str5 = this.LJJI;
                if (str5 != null) {
                    this.LIZIZ.LJJJLZIJ = str5;
                }
                String str6 = this.LJJIFFI;
                if (str6 != null) {
                    this.LIZIZ.LJJJZ = str6;
                }
                C47751Iod c47751Iod28 = this.LIZIZ;
                c47751Iod28.LJJL = this.LJJII;
                java.util.Map map = this.LJJIJ;
                if (map != null) {
                    c47751Iod28.LJZ = map;
                }
                if (c47751Iod28.r <= 0) {
                    c47751Iod28.r = -2147483648L;
                }
                if (c47751Iod28.q <= 0) {
                    c47751Iod28.q = -2147483648L;
                }
                if (c47751Iod28.o <= 0) {
                    c47751Iod28.o = -2147483648L;
                }
                if (c47751Iod28.p <= 0) {
                    c47751Iod28.p = -2147483648L;
                }
                c47751Iod28.getClass();
                this.LIZIZ.getClass();
                this.LIZIZ.getClass();
                this.LIZIZ.getClass();
                C47751Iod c47751Iod29 = this.LIZIZ;
                c47751Iod29.LLIILII = this.LJJJJ;
                c47751Iod29.LLIILZL = this.LJI.LJJZ;
                c47751Iod29.LLILZ = LiveLayoutPreloadThreadPriority.DEFAULT;
                c47751Iod29.LLLLIIIILLL = LLL;
                LLL = 0;
                if (c47751Iod29.LLJJJIL < c47751Iod29.LLJJJ) {
                    c47751Iod29.LLJJJIL = -2147483648L;
                }
                if (c47751Iod29.LLJJL < c47751Iod29.LLJJJJLIIL) {
                    c47751Iod29.LLJJL = -2147483648L;
                }
                c47751Iod29.LIZ = this.LJJLJLI;
                c47751Iod29.LIZIZ = this.LJJLL;
                c47751Iod29.LJJ = c47751Iod29.LIZLLL;
                c47751Iod29.LIZJ = this.LJJZ;
                if (c47751Iod29.LJJIIZ <= 0 && c47751Iod29.LJJIIJ > 0) {
                    c47751Iod29.LJJIIZ = System.currentTimeMillis();
                }
                C47751Iod c47751Iod30 = this.LIZIZ;
                c47751Iod30.LLZZLLIL = this.LLILLJJLI;
                c47751Iod30.LLZZZIL = this.LLILLL;
                c47751Iod30.LLZZZZ = this.LLILZ;
                c47751Iod30.a = this.LLILZIL;
                c47751Iod30.b = this.LLILZLL;
                c47751Iod30.c = this.LLIZ;
                c47751Iod30.d = this.LLIZLLLIL;
                c47751Iod30.e = this.LIZJ.LJFF;
                c47751Iod30.f = this.LIZLLL.LJI;
                C47808IpY c47808IpY = this.LJIIIZ;
                c47808IpY.getClass();
                c47751Iod30.h = new ArrayList<>(c47808IpY.LIZ);
                C47751Iod c47751Iod31 = this.LIZIZ;
                C47765Ior c47765Ior = this.LJ;
                c47751Iod31.g = c47765Ior.LIZJ;
                c47751Iod31.f76n = c47765Ior.LIZLLL;
                c47751Iod31.I = this.LJIILL;
                c47751Iod31.k = this.LLJ;
                c47751Iod31.l = this.LLJI;
                c47751Iod31.m = this.LLJIJIL;
                c47751Iod31.O0 = new ArrayList<>(Arrays.asList(Float.valueOf(this.LJI.LJJJJL), Float.valueOf(this.LJI.LJJJJJL)));
                C47751Iod c47751Iod32 = this.LIZIZ;
                c47751Iod32.b0 = this.LLJJJJLIIL;
                c47751Iod32.c0 = this.LLJJL;
                c47751Iod32.d0 = this.LLJJLIIIJLLLLLLLZ;
                c47751Iod32.e0 = this.LLJL;
                C47774Ip0 c47774Ip0 = this.LJFF;
                if (c47774Ip0.LIZJ) {
                    c47774Ip0.LIZ("exit");
                    LJIILL(this.LJFF.LIZIZ.LIZ);
                }
                C47751Iod c47751Iod33 = this.LIZIZ;
                C47774Ip0 c47774Ip02 = this.LJFF;
                c47751Iod33.i = c47774Ip02.LJII;
                c47751Iod33.j = c47774Ip02.LJI;
                c47751Iod33.s0 = this.LLJLLIL;
                c47751Iod33.t0 = this.LLJLLL;
                c47751Iod33.v0 = this.LLJZ;
                c47751Iod33.w0 = this.LLJLILLLLZIIL;
                c47751Iod33.x0 = this.LLJLL;
                LJI();
                LJII();
                if (TextUtils.isEmpty(this.LIZIZ.LLLLLLZ)) {
                    LJIIIIZZ();
                }
                if (this.LJJJLL > 0) {
                    this.LIZIZ.LLJJIJI = (int) (SystemClock.elapsedRealtime() - this.LJJJLL);
                }
                C47762Ioo c47762Ioo = this.LIZLLL;
                if (c47762Ioo != null) {
                    this.LIZIZ.LLJJIJIL = c47762Ioo.LJFF;
                }
                if (C47885Iqn.LIZ()) {
                    this.LIZIZ.LLJL = System.currentTimeMillis() - System.currentTimeMillis();
                }
                LJIIJ();
                LJ();
                InterfaceC47616ImS interfaceC47616ImS = this.LJJJLIIL;
                if (interfaceC47616ImS != null && (LJIIJ = interfaceC47616ImS.LJIIJ()) != null && LJIIJ.LIZIZ(0) == 1) {
                    C47751Iod c47751Iod34 = this.LIZIZ;
                    c47751Iod34.f75Y = 1;
                    c47751Iod34.Z = LJIIJ.LIZIZ(1);
                    this.LIZIZ.a0 = LJIIJ.LIZIZ(2);
                    this.LIZIZ.j0 = LJIIJ.LIZIZ(3);
                }
                this.LLJZIJLIL.LIZIZ(this.LJI, this.LIZIZ);
                EngineThreadPool.addExecuteTask(new RunnableC47624Ima(this.LJJLIIIIJ, this.LIZIZ, this.LJI, this.LJZI, this.LL));
                LIZLLL();
            }
        }
        this.LIZIZ = new C47751Iod();
        this.LJIIJ.LJFF = this.LJI;
        C47759Iol c47759Iol2 = this.LIZJ;
        synchronized (c47759Iol2.LIZJ) {
            c47759Iol2.LIZJ = new HashMap();
        }
        c47759Iol2.LJ = 0L;
        c47759Iol2.LJFF = new ArrayList<>();
        c47759Iol2.LJI = -2147483648L;
        c47759Iol2.LJII = 0;
        this.LIZLLL.LIZJ();
        C47765Ior c47765Ior2 = this.LJ;
        c47765Ior2.getClass();
        c47765Ior2.LIZJ = new ArrayList<>();
        c47765Ior2.LIZLLL = 0;
        c47765Ior2.LJ = 0;
        c47765Ior2.LJFF = -2147483648L;
        c47765Ior2.LJI = -2147483648L;
        c47765Ior2.LJIIIZ = 0;
        this.LJII.LIZIZ.clear();
    }

    public final void LJIILJJIL(java.util.Map<String, Object> map) {
        C11030bz c11030bz = this.LLD;
        c11030bz.getClass();
        if (((HashMap) map).isEmpty()) {
            return;
        }
        ((ConcurrentHashMap) c11030bz.LIZ).putAll(map);
    }

    public final void LJIILL(int i) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("type", Integer.valueOf(i));
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        InterfaceC46858IaE interfaceC46858IaE = this.LIZ;
        if (interfaceC46858IaE != null) {
            ((C47619ImV) interfaceC46858IaE).LJI(6, hashMap);
        }
    }

    public final void LJIJ(InterfaceC47616ImS interfaceC47616ImS) {
        if (interfaceC47616ImS != null) {
            LJJJLL(interfaceC47616ImS);
            C47751Iod c47751Iod = this.LIZIZ;
            if (c47751Iod.LJJIIJ <= 0) {
                c47751Iod.LJJI = System.currentTimeMillis();
            }
            int i = this.LIZIZ.LLLFFI;
            if (i == 1) {
                LJIIIZ(-1005, true);
            } else {
                if (i != 0) {
                    return;
                }
                LJIIIZ(-1004, true);
            }
        }
    }

    public final void LJIJI(C47789IpF c47789IpF) {
        C47751Iod c47751Iod = this.LIZIZ;
        if (c47751Iod != null && c47751Iod.LJJJJJL == Integer.MIN_VALUE && c47751Iod.LJJJJJ == Integer.MIN_VALUE && c47751Iod.LJJJJL == Integer.MIN_VALUE) {
            c47751Iod.LJJJJJ = c47789IpF.LIZJ();
            C47751Iod c47751Iod2 = this.LIZIZ;
            c47751Iod2.LJJJJJL = c47789IpF.LIZ;
            c47751Iod2.LJJJJL = c47789IpF.LIZIZ;
        }
    }

    public final void LJIJJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            this.LJJIIJ = JBR.LJFF(LIZ, this.LJJIIJ, str, LIZ);
        }
    }

    public final void LJIL(int i) {
        long j;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        if (i != 5) {
            if (this.LJJLI == 4) {
                this.LIZLLL.LIZ(0, "wait");
                z = false;
            } else {
                z = true;
            }
            if (this.LJJLI == 3) {
                this.LIZJ.LIZIZ("wait");
                this.LIZIZ.LLJJJJJIL = currentTimeMillis;
            } else if (z) {
                this.LJI.LJIILJJIL();
            }
        }
        if (this.LLJILJIL) {
            InterfaceC46858IaE interfaceC46858IaE = this.LIZ;
            if (interfaceC46858IaE != null) {
                j = ((C47619ImV) interfaceC46858IaE).LIZJ(67);
            } else {
                j = -1;
            }
            this.LJ.LIZ((int) j, "finish");
            this.LLJILJIL = false;
        }
        if (this.LJIIJJI) {
            C47751Iod c47751Iod = this.LIZIZ;
            if (c47751Iod.LJJIIJ <= 0) {
                c47751Iod.LJJIIZI = currentTimeMillis;
                LJIIJJI(i);
            }
        }
        this.LIZIZ.LJJIIZ = currentTimeMillis;
        LJIIJJI(i);
    }

    public final void LJJII(String str) {
        if (this.LJI != null && str != null && !str.isEmpty()) {
            this.LJI.LJIJ = str;
        }
    }

    public final void LJJIII(int i) {
        this.LJJIL = i;
    }

    public final void LJJIIJ(String str) {
        this.LJI.LJJJJIZL = str;
    }

    public final void LJJIIJZLJL(int i) {
        this.LJI.LJJJJI = i;
    }

    public final void LJJIJ(int i) {
        this.LJI.LJJLIL = i;
    }

    public final void LJJIJIIJI(int i) {
        this.LJI.LJJLJ = i;
    }

    public final void LJJIJIIJIL(int i) {
        C47794IpK c47794IpK;
        C47794IpK c47794IpK2;
        C47794IpK c47794IpK3;
        long currentTimeMillis = System.currentTimeMillis();
        switch (i) {
            case 63:
                if (this.LJJLL > 0) {
                    return;
                }
                this.LJJLL = currentTimeMillis;
                return;
            case 64:
                C47751Iod c47751Iod = this.LIZIZ;
                if (c47751Iod.LIZLLL > 0) {
                    return;
                }
                c47751Iod.LIZLLL = currentTimeMillis;
                return;
            case 65:
                if (this.LJJLJLI > 0) {
                    return;
                }
                this.LJJLJLI = currentTimeMillis;
                return;
            default:
                switch (i) {
                    case 169:
                        C47762Ioo c47762Ioo = this.LIZLLL;
                        if (c47762Ioo == null || (c47794IpK3 = c47762Ioo.LIZJ) == null) {
                            return;
                        }
                        c47794IpK3.LJIJJ = currentTimeMillis;
                        return;
                    case 170:
                        C47762Ioo c47762Ioo2 = this.LIZLLL;
                        if (c47762Ioo2 == null || (c47794IpK2 = c47762Ioo2.LIZJ) == null) {
                            return;
                        }
                        c47794IpK2.LJIJJLI = currentTimeMillis;
                        return;
                    case 171:
                        C47762Ioo c47762Ioo3 = this.LIZLLL;
                        if (c47762Ioo3 == null || (c47794IpK = c47762Ioo3.LIZJ) == null) {
                            return;
                        }
                        c47794IpK.LJIL = currentTimeMillis;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void LJJIJL(boolean z) {
        this.LJJIIZI = z;
    }

    public final void LJJIJLIJ(String str) {
        this.LLIIIL = str;
    }

    public final void LJJIL(int i) {
        this.LJJLIIJ = i;
    }

    public final void LJJIZ(C46886Iag c46886Iag) {
        if (this.LIZIZ == null) {
            return;
        }
        int i = -1;
        if (TTVideoEngine.LJIIZILJ == 0) {
            float f = c46886Iag.LIZLLL;
            HashMap hashMap = new HashMap(3);
            hashMap.put("AFMode", Integer.valueOf(c46886Iag.LIZIZ));
            hashMap.put("pitch", Float.valueOf(c46886Iag.LIZJ));
            hashMap.put("speed", Float.valueOf(f));
            this.LJJIJ = hashMap;
            if (this.LJI.LJJJJJ != f || this.LLILZIL.isEmpty()) {
                this.LJI.LJJJJJ = f;
                HashMap hashMap2 = new HashMap(3);
                InterfaceC46858IaE interfaceC46858IaE = this.LIZ;
                if (interfaceC46858IaE != null) {
                    i = ((C47619ImV) interfaceC46858IaE).LIZJ(67);
                }
                hashMap2.put("to", Float.valueOf(this.LJI.LJJJJJ));
                hashMap2.put("p", Integer.valueOf(i));
                hashMap2.put("t", Long.valueOf(System.currentTimeMillis()));
                C77117UOj.LIZJ(new JSONObject(hashMap2).toString(), this.LLILZIL);
            }
            if (f > 0.0f) {
                C47752Ioe c47752Ioe = this.LJI;
                c47752Ioe.LJJJJJL = Math.max(c47752Ioe.LJJJJJL, Math.min(f, 20.0f));
                C47752Ioe c47752Ioe2 = this.LJI;
                c47752Ioe2.LJJJJL = Math.min(c47752Ioe2.LJJJJL, Math.max(f, 0.0f));
                return;
            }
            return;
        }
        float f2 = c46886Iag.LIZLLL;
        C47752Ioe c47752Ioe3 = this.LJI;
        if (c47752Ioe3.LJJJJJ != f2) {
            c47752Ioe3.LJJJJJ = f2;
            HashMap hashMap3 = new HashMap(3);
            InterfaceC46858IaE interfaceC46858IaE2 = this.LIZ;
            if (interfaceC46858IaE2 != null) {
                i = ((C47619ImV) interfaceC46858IaE2).LIZJ(67);
            }
            hashMap3.put("to", Float.valueOf(this.LJI.LJJJJJ));
            hashMap3.put("p", Integer.valueOf(i));
            hashMap3.put("t", Long.valueOf(System.currentTimeMillis()));
            C77117UOj.LIZJ(new JSONObject(hashMap3).toString(), this.LLILZIL);
        }
        if (f2 <= 0.0f) {
            return;
        }
        C47752Ioe c47752Ioe4 = this.LJI;
        c47752Ioe4.LJJJJJL = Math.max(c47752Ioe4.LJJJJJL, Math.min(f2, 20.0f));
        C47752Ioe c47752Ioe5 = this.LJI;
        c47752Ioe5.LJJJJL = Math.min(c47752Ioe5.LJJJJL, Math.max(f2, 0.0f));
    }

    public final void LJJJI(String str) {
        this.LJJIII = str;
    }

    public final void LJJJIL(java.util.Map<String, Object> map) {
        this.LIZIZ.LLZZJLIL = map;
    }

    public final void LJJJJI(int i) {
        this.LJI.LJJLIIJ = i;
    }

    public final void LJJJJJ(String str) {
        if (TextUtils.isEmpty(this.LJJJ)) {
            this.LJJJ = str;
        }
        if (this.LJJIZ <= 0) {
            this.LJJIZ = System.currentTimeMillis();
        }
    }

    public final void LJJJJJL(float f) {
        HashMap hashMap = new HashMap(2);
        long currentTimeMillis = System.currentTimeMillis();
        hashMap.put("distc", Float.valueOf(f));
        hashMap.put("t", Long.valueOf(currentTimeMillis));
        this.LLJJJJLIIL.add(new JSONObject(hashMap).toString());
    }

    public final void LJJJJL(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    public final void LJJJJZ(boolean z) {
        int i;
        if (z) {
            if (this.LJJLI == 4) {
                this.LIZLLL.LIZ(0, "wait");
            }
            if (this.LJJLI == 3) {
                this.LJJLI = 2;
            }
        }
        C47751Iod c47751Iod = this.LIZIZ;
        if (c47751Iod != null) {
            c47751Iod.LLJJL = System.currentTimeMillis();
            C47751Iod c47751Iod2 = this.LIZIZ;
            long j = c47751Iod2.LLJJJJLIIL;
            if (j > 0) {
                long j2 = c47751Iod2.LLJJL - j;
                InterfaceC46858IaE interfaceC46858IaE = this.LIZ;
                if (interfaceC46858IaE != null) {
                    i = ((C47619ImV) interfaceC46858IaE).LIZJ(67);
                } else {
                    i = -1;
                }
                HashMap hashMap = new HashMap(5);
                hashMap.put("to", this.LJI.LJJJ);
                hashMap.put("p", Integer.valueOf(i));
                hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                hashMap.put("c", Long.valueOf(j2));
                hashMap.put("seam", Boolean.valueOf(z));
                C77117UOj.LIZJ(new JSONObject(hashMap).toString(), this.LLILZ);
            }
        }
        if (z) {
            LJIIIZ(-2005, false);
        }
    }

    public final void LJJJLL(InterfaceC47616ImS interfaceC47616ImS) {
        if (interfaceC47616ImS == null) {
            return;
        }
        this.LJI.LJIIJJI(interfaceC47616ImS);
        this.LJJJLIIL = interfaceC47616ImS;
        C11030bz c11030bz = this.LLD;
        c11030bz.getClass();
        String LJJI = interfaceC47616ImS.LJJI(245);
        if (!TextUtils.isEmpty(LJJI)) {
            try {
                ((ConcurrentHashMap) c11030bz.LIZ).putAll(C11030bz.LJJIIZ(new JSONObject(LJJI)));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJJJZ(int i) {
        this.LJIILIIL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47750Ioc.LIZIZ(int, int):void");
    }

    public final void LJIIIZ(int i, boolean z) {
        if (this.LIZIZ == null) {
            return;
        }
        if (z) {
            this.LJJLIIIJILLIZJL = i;
            if (i == -1002 || i == -1003 || i == -1004 || i == -1005) {
                if (this.LJJJLL <= 0) {
                    this.LJJJLL = SystemClock.elapsedRealtime();
                    return;
                }
                return;
            } else if (i == -2003 || i == -2002) {
                this.LJJJLL = SystemClock.elapsedRealtime();
                return;
            } else {
                this.LJJJLL = -2147483648L;
                return;
            }
        }
        this.LJJLIIIJILLIZJL = -2001;
        this.LJJJLL = -2147483648L;
    }

    public final void LJIILIIL(Object obj, String str) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        ((HashMap) this.LLFF).put(str, obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addFeature, key:");
        LIZ.append(str);
        LIZ.append(", value:");
        LIZ.append(obj);
        TTVideoEngineLog.d("VideoEventLoggerV2", X1D.LIZIZ(LIZ));
    }

    public final void LJIILLIIL(String str, String str2) {
        this.LJI.LIZJ(str, str2);
    }

    public final void LJJIIZ(float f, int i) {
        if (i != 20) {
            if (i != 162) {
                if (i != 164) {
                    if (i != 166) {
                        if (i != 167) {
                            return;
                        }
                        this.LJLLLL.LIZJ = f;
                        return;
                    }
                    this.LJLLLL.LIZLLL = f;
                    return;
                }
                this.LIZIZ.u0 = Float.valueOf(f);
                return;
            }
            this.LIZIZ.r0 = Float.valueOf(f);
            return;
        }
        this.LJLJJLL = f;
        this.LJIIJ.LIZIZ = f;
    }

    public final void LJJIIZI(int i, int i2) {
        C47794IpK c47794IpK;
        int i3;
        if (i != 54) {
            if (i != 55) {
                if (i != 59) {
                    if (i != 60) {
                        if (i != 111) {
                            boolean z = false;
                            if (i != 112) {
                                if (i != 126) {
                                    if (i != 127) {
                                        switch (i) {
                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                this.LJJZZI = i2;
                                                return;
                                            case 12:
                                                if (i2 == 1) {
                                                    z = true;
                                                }
                                                this.LJJZZIII = z;
                                                return;
                                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                                if (i2 == 1) {
                                                    z = true;
                                                }
                                                this.LJL = z;
                                                return;
                                            case 14:
                                                this.LJLI = i2;
                                                return;
                                            default:
                                                switch (i) {
                                                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                                        this.LJI.LJJIIJZLJL = i2;
                                                        return;
                                                    case 17:
                                                        C47761Ion c47761Ion = this.LJIIJ;
                                                        if (i2 > 0) {
                                                            c47761Ion.LIZLLL = i2;
                                                            return;
                                                        } else {
                                                            c47761Ion.getClass();
                                                            return;
                                                        }
                                                    case 18:
                                                        if (i2 != 0) {
                                                            this.LJLJJL = true;
                                                            C47761Ion c47761Ion2 = this.LJIIJ;
                                                            c47761Ion2.getClass();
                                                            if (Math.random() > c47761Ion2.LIZIZ) {
                                                                c47761Ion2.LIZJ = false;
                                                                return;
                                                            } else {
                                                                c47761Ion2.LIZJ = true;
                                                                return;
                                                            }
                                                        }
                                                        this.LJLJJL = false;
                                                        this.LJIIJ.LJFF();
                                                        return;
                                                    case 19:
                                                        C47761Ion c47761Ion3 = this.LJIIJ;
                                                        if (i2 > 0) {
                                                            c47761Ion3.LIZ = i2;
                                                            return;
                                                        } else {
                                                            c47761Ion3.getClass();
                                                            return;
                                                        }
                                                    default:
                                                        switch (i) {
                                                            case 22:
                                                                this.LJLL = i2;
                                                                return;
                                                            case 23:
                                                                this.LJLLI = i2;
                                                                return;
                                                            case 24:
                                                                this.LJJLIL = i2;
                                                                return;
                                                            case 25:
                                                                this.LJJLJ = i2;
                                                                return;
                                                            case 26:
                                                                this.LLILLIZIL.LIZ = i2;
                                                                return;
                                                            case 27:
                                                                this.LLILLIZIL.LIZIZ = i2;
                                                                return;
                                                            default:
                                                                if (i != 62) {
                                                                    if (i != 100) {
                                                                        if (i != 102) {
                                                                            if (i != 104) {
                                                                                if (i != 155) {
                                                                                    switch (i) {
                                                                                        case 29:
                                                                                            this.LLILLIZIL.LIZJ = i2;
                                                                                            return;
                                                                                        case 30:
                                                                                            this.LLILLIZIL.LJ = i2;
                                                                                            return;
                                                                                        case 31:
                                                                                            this.LLILLIZIL.LJFF = i2;
                                                                                            return;
                                                                                        case 32:
                                                                                            this.LLILLIZIL.LJI = i2;
                                                                                            return;
                                                                                        case 33:
                                                                                            this.LLILLIZIL.LJII = i2;
                                                                                            return;
                                                                                        case 34:
                                                                                            this.LLILLIZIL.LJIIIIZZ = i2;
                                                                                            return;
                                                                                        case 35:
                                                                                            this.LLILLIZIL.LJIIIZ = i2;
                                                                                            return;
                                                                                        case 36:
                                                                                            this.LLILLIZIL.LJIIJ = i2;
                                                                                            return;
                                                                                        case 37:
                                                                                            this.LLILLIZIL.LJIIJJI = i2;
                                                                                            return;
                                                                                        case 38:
                                                                                            this.LLILLIZIL.LJIIL = i2;
                                                                                            return;
                                                                                        case 39:
                                                                                            this.LLILLIZIL.LJIILIIL = i2;
                                                                                            return;
                                                                                        case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                                                                                            this.LLILLIZIL.LJIILJJIL = i2;
                                                                                            return;
                                                                                        case 41:
                                                                                            this.LLILLIZIL.LJIILL = i2;
                                                                                            return;
                                                                                        case 42:
                                                                                            this.LLILLIZIL.LJIILLIIL = i2;
                                                                                            return;
                                                                                        case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                                                                                            this.LLILLIZIL.LJIIZILJ = i2;
                                                                                            return;
                                                                                        case 44:
                                                                                            this.LLILLIZIL.LJIJ = i2;
                                                                                            return;
                                                                                        case 45:
                                                                                            HashMap hashMap = new HashMap(3);
                                                                                            InterfaceC46858IaE interfaceC46858IaE = this.LIZ;
                                                                                            if (interfaceC46858IaE != null) {
                                                                                                i3 = ((C47619ImV) interfaceC46858IaE).LIZJ(67);
                                                                                            } else {
                                                                                                i3 = -1;
                                                                                            }
                                                                                            hashMap.put("s", Integer.valueOf(i2));
                                                                                            hashMap.put("p", Integer.valueOf(i3));
                                                                                            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
                                                                                            C77117UOj.LIZJ(new JSONObject(hashMap).toString(), this.LLILZLL);
                                                                                            return;
                                                                                        case 46:
                                                                                            this.LLIIIILZ = i2;
                                                                                            return;
                                                                                        case 47:
                                                                                            this.LLII = i2;
                                                                                            return;
                                                                                        case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                                                                                            this.LLIIII = i2;
                                                                                            return;
                                                                                        case C61447O9r.LJIIJ:
                                                                                            this.LLI = i2;
                                                                                            return;
                                                                                        case 50:
                                                                                            this.LLIFFJFJJ = i2;
                                                                                            return;
                                                                                        default:
                                                                                            switch (i) {
                                                                                                case 129:
                                                                                                    this.LLJJJIL = i2;
                                                                                                    return;
                                                                                                case 130:
                                                                                                    this.LLJJJJ = i2;
                                                                                                    return;
                                                                                                case 131:
                                                                                                    this.LLJJJJJIL = i2;
                                                                                                    return;
                                                                                                case 132:
                                                                                                    this.LLJJIJIL = i2;
                                                                                                    return;
                                                                                                case 133:
                                                                                                    ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("ess", Integer.valueOf(i2));
                                                                                                    this.LLILLIZIL.LJJIIJ = i2;
                                                                                                    return;
                                                                                                case 134:
                                                                                                    ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("eas", Integer.valueOf(i2));
                                                                                                    return;
                                                                                                default:
                                                                                                    switch (i) {
                                                                                                        case 138:
                                                                                                            ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("ss", Integer.valueOf(i2));
                                                                                                            return;
                                                                                                        case 139:
                                                                                                            ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("sfr", Integer.valueOf(i2));
                                                                                                            return;
                                                                                                        case UserLevelGeckoUpdateSetting.DEFAULT /* 140 */:
                                                                                                            ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("sm", Integer.valueOf(i2));
                                                                                                            return;
                                                                                                        default:
                                                                                                            switch (i) {
                                                                                                                case 142:
                                                                                                                    this.LIZIZ.V = i2;
                                                                                                                    return;
                                                                                                                case 143:
                                                                                                                    this.LLIIZ = i2;
                                                                                                                    return;
                                                                                                                case 144:
                                                                                                                    this.LLIL = i2;
                                                                                                                    return;
                                                                                                                case 145:
                                                                                                                    this.LLILII = i2;
                                                                                                                    return;
                                                                                                                default:
                                                                                                                    switch (i) {
                                                                                                                        case 148:
                                                                                                                            ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("srs", Integer.valueOf(i2));
                                                                                                                            return;
                                                                                                                        case 149:
                                                                                                                            ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("sut", Integer.valueOf(i2));
                                                                                                                            return;
                                                                                                                        case 150:
                                                                                                                            ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("so", Integer.valueOf(i2));
                                                                                                                            return;
                                                                                                                        default:
                                                                                                                            switch (i) {
                                                                                                                                case 172:
                                                                                                                                    C47751Iod c47751Iod = this.LIZIZ;
                                                                                                                                    if (i2 == 1) {
                                                                                                                                        z = true;
                                                                                                                                    }
                                                                                                                                    c47751Iod.F0 = z;
                                                                                                                                    return;
                                                                                                                                case 173:
                                                                                                                                    this.LIZIZ.G0 = i2;
                                                                                                                                    return;
                                                                                                                                case 174:
                                                                                                                                    this.LIZIZ.H0 = i2;
                                                                                                                                    return;
                                                                                                                                case 175:
                                                                                                                                    this.LIZIZ.I0 = i2;
                                                                                                                                    return;
                                                                                                                                default:
                                                                                                                                    switch (i) {
                                                                                                                                        case 177:
                                                                                                                                            if (i2 > 0) {
                                                                                                                                                z = true;
                                                                                                                                            }
                                                                                                                                            this.LJLJJI = z;
                                                                                                                                            return;
                                                                                                                                        case 178:
                                                                                                                                            this.LIZIZ.J0 = i2;
                                                                                                                                            return;
                                                                                                                                        case 179:
                                                                                                                                            this.LIZIZ.L0 = i2;
                                                                                                                                            return;
                                                                                                                                        case 180:
                                                                                                                                            this.LIZIZ.K0 = i2;
                                                                                                                                            return;
                                                                                                                                        case 181:
                                                                                                                                            this.LIZIZ.LLLIIII = i2;
                                                                                                                                            return;
                                                                                                                                        case 182:
                                                                                                                                            this.LIZIZ.LLLIIIL = i2;
                                                                                                                                            return;
                                                                                                                                        case 183:
                                                                                                                                            this.LIZIZ.LLLIIIIL = i2;
                                                                                                                                            return;
                                                                                                                                        case 184:
                                                                                                                                            this.LIZIZ.N0 = i2;
                                                                                                                                            return;
                                                                                                                                        case 185:
                                                                                                                                            this.LLILLIZIL.LJJIIJZLJL = i2;
                                                                                                                                            return;
                                                                                                                                        default:
                                                                                                                                            switch (i) {
                                                                                                                                                case 79:
                                                                                                                                                    this.LJLIIIL = i2;
                                                                                                                                                    return;
                                                                                                                                                case 80:
                                                                                                                                                    this.LJLIIL = i2;
                                                                                                                                                    return;
                                                                                                                                                case 81:
                                                                                                                                                    this.LJLIL = i2;
                                                                                                                                                    return;
                                                                                                                                                default:
                                                                                                                                                    switch (i) {
                                                                                                                                                        case 89:
                                                                                                                                                            this.LIZIZ.s = i2;
                                                                                                                                                            return;
                                                                                                                                                        case 90:
                                                                                                                                                            if (i2 <= 0) {
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                            C47798IpO c47798IpO = this.LLILLIZIL;
                                                                                                                                                            c47798IpO.LJIJI = i2 | c47798IpO.LJIJI;
                                                                                                                                                            return;
                                                                                                                                                        case 91:
                                                                                                                                                            this.LLILLIZIL.LJIJJ = i2;
                                                                                                                                                            return;
                                                                                                                                                        case 92:
                                                                                                                                                            if (i2 <= 0) {
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                            this.LLILLIZIL.LJIJJLI = i2;
                                                                                                                                                            return;
                                                                                                                                                        case 93:
                                                                                                                                                            this.LLILLIZIL.LJIL = i2;
                                                                                                                                                            return;
                                                                                                                                                        case 94:
                                                                                                                                                            this.LLILLIZIL.LJJ = i2;
                                                                                                                                                            return;
                                                                                                                                                        case 95:
                                                                                                                                                            this.LLFFF = i2;
                                                                                                                                                            return;
                                                                                                                                                        case 96:
                                                                                                                                                            this.LLILLIZIL.LJJIFFI = i2;
                                                                                                                                                            return;
                                                                                                                                                        case 97:
                                                                                                                                                            this.LLILLIZIL.LJJII = i2;
                                                                                                                                                            return;
                                                                                                                                                        default:
                                                                                                                                                            return;
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
                                                                                C47762Ioo c47762Ioo = this.LIZLLL;
                                                                                if (c47762Ioo == null || (c47794IpK = c47762Ioo.LIZJ) == null) {
                                                                                    return;
                                                                                }
                                                                                c47794IpK.LJIJI = i2;
                                                                                return;
                                                                            }
                                                                            ((HashMap) this.LIZIZ.LLZLLLL).put("gs_error", Integer.valueOf(i2));
                                                                            return;
                                                                        }
                                                                        ((HashMap) this.LIZIZ.LLZLLLL).put("gs_reason", Integer.valueOf(i2));
                                                                        return;
                                                                    }
                                                                    this.LLF = i2;
                                                                    C47762Ioo c47762Ioo2 = this.LIZLLL;
                                                                    if ((i2 & 1) != 0) {
                                                                        z = true;
                                                                    }
                                                                    c47762Ioo2.LJII = z;
                                                                    return;
                                                                }
                                                                this.LJJLIIIJLLLLLLLZ = i2;
                                                                return;
                                                        }
                                                }
                                        }
                                    }
                                    this.LLILLIZIL.LJJIII = i2;
                                    return;
                                }
                                C47752Ioe c47752Ioe = this.LJI;
                                if (i2 == 1) {
                                    z = true;
                                }
                                c47752Ioe.LJJLI = z;
                                return;
                            }
                            C47752Ioe c47752Ioe2 = this.LJI;
                            if (i2 == 1) {
                                z = true;
                            }
                            c47752Ioe2.LJJL = z;
                            return;
                        }
                        this.LIZIZ.M = i2;
                        return;
                    }
                    this.LJJLIIIJLJLI = i2;
                    return;
                }
                this.LJJLIIIJL = i2;
                return;
            }
            this.LLILLIZIL.LJJI = i2;
            return;
        }
        this.LLILLIZIL.LIZLLL = i2;
    }

    public final void LJJIJIL(int i, long j) {
        if (i != 21) {
            if (i != 56) {
                if (i != 101) {
                    if (i != 103) {
                        if (i != 147) {
                            if (i != 87) {
                                if (i != 88) {
                                    if (i != 98) {
                                        if (i != 99) {
                                            if (i != 136) {
                                                if (i != 137) {
                                                    switch (i) {
                                                        case 66:
                                                            this.LIZIZ.LJ = j;
                                                            return;
                                                        case 67:
                                                            this.LIZIZ.LJFF = j;
                                                            return;
                                                        case 68:
                                                            this.LIZIZ.LJI = j;
                                                            return;
                                                        case 69:
                                                            this.LIZIZ.LJII = j;
                                                            return;
                                                        case 70:
                                                            this.LIZIZ.LJIIIZ = j;
                                                            return;
                                                        case 71:
                                                            this.LIZIZ.LJIIJ = j;
                                                            return;
                                                        case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                                                            this.LIZIZ.LJIILJJIL = j;
                                                            return;
                                                        case 73:
                                                            this.LIZIZ.LJIILIIL = j;
                                                            return;
                                                        case 74:
                                                            this.LIZIZ.LJIILLIIL = j;
                                                            return;
                                                        case 75:
                                                            this.LIZIZ.LJIILL = j;
                                                            return;
                                                        case 76:
                                                            this.LIZIZ.LJIIJJI = j;
                                                            return;
                                                        case 77:
                                                            this.LIZIZ.LJIIL = j;
                                                            return;
                                                        case 78:
                                                            this.LIZIZ.LJIIIIZZ = j;
                                                            return;
                                                        default:
                                                            switch (i) {
                                                                case 82:
                                                                    this.LIZIZ.p = j;
                                                                    return;
                                                                case 83:
                                                                    this.LIZIZ.o = j;
                                                                    return;
                                                                case 84:
                                                                    this.LIZIZ.q = j;
                                                                    return;
                                                                case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                                                                    this.LIZIZ.r = j;
                                                                    return;
                                                                default:
                                                                    switch (i) {
                                                                        case 105:
                                                                            ((HashMap) this.LIZIZ.LLZLLLL).put("gs_select_begin", Long.valueOf(j));
                                                                            return;
                                                                        case 106:
                                                                            ((HashMap) this.LIZIZ.LLZLLLL).put("gs_select_end", Long.valueOf(j));
                                                                            return;
                                                                        case 107:
                                                                            ((HashMap) this.LIZIZ.LLZLLLL).put("gs_on_before_begin", Long.valueOf(j));
                                                                            return;
                                                                        case 108:
                                                                            ((HashMap) this.LIZIZ.LLZLLLL).put("gs_on_before_end", Long.valueOf(j));
                                                                            return;
                                                                        case 109:
                                                                            ((HashMap) this.LIZIZ.LLZLLLL).put("gs_on_after_begin", Long.valueOf(j));
                                                                            return;
                                                                        case 110:
                                                                            ((HashMap) this.LIZIZ.LLZLLLL).put("gs_on_after_end", Long.valueOf(j));
                                                                            return;
                                                                        default:
                                                                            switch (i) {
                                                                                case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                                                                                    this.LIZIZ.LJIIZILJ = j;
                                                                                    return;
                                                                                case 121:
                                                                                    this.LIZIZ.LJIJ = j;
                                                                                    return;
                                                                                case 122:
                                                                                    this.LIZIZ.LJIJI = j;
                                                                                    return;
                                                                                case 123:
                                                                                    this.LIZIZ.LJIJJ = j;
                                                                                    return;
                                                                                case 124:
                                                                                    this.LIZIZ.LJIJJLI = j;
                                                                                    return;
                                                                                case 125:
                                                                                    this.LIZIZ.LJIL = j;
                                                                                    return;
                                                                                default:
                                                                                    return;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                }
                                                ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("bad", Long.valueOf(j));
                                                return;
                                            }
                                            ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("bbd", Long.valueOf(j));
                                            return;
                                        }
                                        this.LIZIZ.LLLLZIL = j;
                                        this.LJ.LJIIIIZZ = j;
                                        return;
                                    }
                                    this.LIZIZ.LLLLZI = j;
                                    this.LJ.LJII = j;
                                    return;
                                }
                                this.LIZIZ.LJJIII = j;
                                return;
                            }
                            this.LIZIZ.LJJLIIIJLJLI = j;
                            return;
                        }
                        this.LLILL = j;
                        return;
                    }
                    ((HashMap) this.LIZIZ.LLZLLLL).put("gs_speed", Long.valueOf(j));
                    return;
                }
                ((HashMap) this.LIZIZ.LLZLLLL).put("gs_bitrate", Long.valueOf(j));
                return;
            }
            this.LJJLIIIJJIZ = j;
            return;
        }
        this.LJJLIIIJJI = j;
    }

    public final void LJJJ(int i, int i2) {
        C47797IpN c47797IpN = this.LJZ;
        if (i > 0) {
            c47797IpN.LIZ = i;
            c47797IpN.LIZJ = i;
        }
        if (i2 > 0) {
            c47797IpN.LIZIZ = i2;
            c47797IpN.LIZLLL = i2;
        }
        c47797IpN.LIZ(c47797IpN.LIZ, c47797IpN.LIZIZ);
    }

    public final void LJJJJ(int i, String str) {
        C47752Ioe c47752Ioe = this.LJI;
        switch (i) {
            case 0:
                c47752Ioe.LJJII = "local_url";
                break;
            case 1:
                c47752Ioe.LJJII = "dir_url";
                break;
            case 2:
                c47752Ioe.LJJII = "playitem";
                break;
            case 3:
                c47752Ioe.LJJII = "preload";
                break;
            case 4:
                c47752Ioe.LJJII = "feed";
                break;
            case 5:
                c47752Ioe.LJJII = "vid";
                break;
            case 6:
                c47752Ioe.LJJII = "fd";
                break;
            case 7:
                c47752Ioe.LJJII = "mds";
                break;
        }
        c47752Ioe.LJJI = str;
        if (i == 6 || i == 0) {
            this.LJJLIIIJILLIZJL = -1005;
            return;
        }
        if (i == 1 || i == 4 || i == 2 || i == 3 || i == 7) {
            this.LJJLIIIJILLIZJL = -1004;
        } else {
            if (i != 5) {
                return;
            }
            this.LJJLIIIJILLIZJL = -1002;
        }
    }

    public final void LJJJJIZL(int i, String str) {
        switch (i) {
            case 15:
                this.LIZIZ.LLLLLLZ = str;
                return;
            case 53:
                this.LJI.getClass();
                return;
            case 86:
                this.LJI.LJIJJ = str;
                return;
            case 113:
                C47577Ilp c47577Ilp = this.LJZI;
                if (c47577Ilp != null) {
                    c47577Ilp.LIZIZ = str;
                    return;
                } else {
                    this.LJZL = str;
                    return;
                }
            case 128:
                this.LLJJJ = str;
                return;
            case 135:
                try {
                    ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("sc", new JSONObject(str));
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            case 141:
                ((HashMap) this.LIZIZ.LLZLLLL).put("headers", str);
                return;
            case 146:
                this.LLILIL = str;
                return;
            case 151:
                try {
                    ((ConcurrentHashMap) this.LIZIZ.LLZZ).put("smi", new JSONArray(str));
                    return;
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                    return;
                }
            case 152:
                this.LIZIZ.LLLLLZ = str;
                return;
            case 153:
                this.LIZIZ.LLLLLZIL = str;
                return;
            case 154:
                this.LJI.LJJIFFI = str;
                return;
            case 156:
                this.LIZIZ.B0 = str;
                return;
            case 161:
                this.LIZIZ.q0 = str;
                return;
            case 163:
                this.LLJLLL = str;
                return;
            case 165:
                this.LLJZ = str;
                return;
            case 176:
                this.LIZIZ.M0 = str;
                return;
            default:
                return;
        }
    }

    public final void LJJJJZI(Object obj, String str) {
        java.util.Map map = this.LIZIZ.LLZILL;
        if (map != null) {
            ((ConcurrentHashMap) map).put(str, obj);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mFeaturesCore, key:");
            LIZ.append(str);
            LIZ.append(", value:");
            LIZ.append(obj);
            TTVideoEngineLog.d("VideoEventLoggerV2", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJJJLZIJ(int i, int i2) {
        this.LJIIL = i;
        this.LJJJIL = i2;
    }

    public C47750Ioc(Context context, C47619ImV c47619ImV, C47634Imk c47634Imk) {
        this.LIZ = c47619ImV;
        this.LJI = new C47752Ioe(c47619ImV, this.LJLJI, context);
        C47762Ioo c47762Ioo = new C47762Ioo(this.LJI);
        this.LIZLLL = c47762Ioo;
        this.LIZJ = new C47759Iol(this.LJI, c47762Ioo);
        this.LJIIJ = new C47761Ion(this.LJI);
        this.LJ = new C47765Ior(this.LJI);
        this.LJFF = new C47774Ip0(this.LJI);
        this.LJII = new C47828Ips(this.LJI);
        if (C47625Imb.LIZJ == null) {
            synchronized (C47625Imb.class) {
                if (C47625Imb.LIZJ == null) {
                    C47625Imb.LIZJ = new C47625Imb(context);
                }
            }
        }
        this.LL = C47625Imb.LIZJ;
        this.LLILLIZIL = new C47798IpO();
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = new ArrayList<>();
        this.LJIILLIIL = new ArrayList();
        this.LJIIZILJ = new ArrayList();
        this.LJIJ = new ArrayList();
        this.LJIIJJI = true;
        this.LJJLIIIIJ = context;
        this.LJIIIIZZ = c47634Imk;
        this.LJIIIZ = new C47808IpY(c47634Imk);
        this.LJLLLL = new C47833Ipx();
        this.LJLLLLLL = new C47862IqQ();
        this.LJLZ = new C47786IpC(context);
        this.LJZ = new C47797IpN();
        this.LLD = new C11030bz(2);
        this.LLJZIJLIL = new C47766Ios();
    }

    public final void LJIJJLI(int i, C47789IpF c47789IpF, String str) {
        HashMap hashMap = new HashMap();
        if (c47789IpF != null) {
            hashMap = c47789IpF.LJFF();
        }
        hashMap.put("result", Integer.valueOf(i));
        if (str != null) {
            hashMap.put("filehash", str);
        }
        C77117UOj.LJI(this.LJIILL, new JSONObject(hashMap).toString(), 2);
        if (i != 0) {
            this.LIZIZ.V = 3;
        }
    }

    public final void LJJJJLL(String str, String str2, boolean z) {
        long j;
        if (z) {
            if (this.LJJLI == 4) {
                this.LIZLLL.LIZ(0, "switch");
            }
            if (this.LJJLI == 3) {
                this.LIZJ.LIZIZ("switch");
                this.LIZIZ.LLJJJJJIL = System.currentTimeMillis();
            }
        }
        if (this.LLJILJIL) {
            InterfaceC46858IaE interfaceC46858IaE = this.LIZ;
            if (interfaceC46858IaE != null) {
                j = ((C47619ImV) interfaceC46858IaE).LIZJ(67);
            } else {
                j = -1;
            }
            this.LJ.LIZ((int) j, "switch");
            this.LLJILJIL = false;
        }
        this.LIZIZ.LJJIIZ = System.currentTimeMillis();
        if (!str.equals(str2)) {
            this.LJJJJZ++;
        }
        this.LJI.LIZJ(str, str2);
        C47751Iod c47751Iod = this.LIZIZ;
        if (c47751Iod != null) {
            c47751Iod.LLJJJJLIIL = System.currentTimeMillis();
        }
        if (z) {
            LJIIIZ(-2005, true);
        }
    }

    public final void LJJJLIIL(String str, String str2, float f, float f2, float f3, float f4, long j, java.util.Map<String, String> map, java.util.Map<String, String> map2) {
        java.util.Map map3;
        C47761Ion c47761Ion = this.LJIIJ;
        if (c47761Ion == null || !c47761Ion.LIZJ || c47761Ion.LJFF == null) {
            return;
        }
        c47761Ion.LIZLLL();
        String valueOf = String.valueOf(c47761Ion.LJFF.LJJLIIJ);
        if (c47761Ion.LJFF != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (map3 = c47761Ion.LJFF.LJJJJLL) != null && !str.equals("-1") && !str2.equals("-1")) {
            java.util.Map map4 = (java.util.Map) ((HashMap) map3).get("fileKey");
            if (map4 == null) {
                map4 = new HashMap();
            }
            for (Map.Entry entry : map4.entrySet()) {
                if (((String) entry.getValue()).equals(str)) {
                    if (entry.getKey() == null) {
                        c47761Ion.LJ.LJIIJ.add(-1);
                    } else if (((Integer) entry.getKey()).intValue() == 0) {
                        c47761Ion.LJ.LJIIJ.add(-1);
                    } else {
                        c47761Ion.LJ.LJIIJ.add(c47761Ion.LIZ((Integer) entry.getKey()));
                    }
                    c47761Ion.LJ.LJ.add(Integer.valueOf((int) j));
                    c47761Ion.LJ.LJFF.add(Float.valueOf(f));
                    c47761Ion.LJ.LJII.add(Float.valueOf(f3));
                    c47761Ion.LJ.LJIIIIZZ.add(valueOf);
                    c47761Ion.LJ(0, map);
                }
                if (((String) entry.getValue()).equals(str2)) {
                    if (entry.getKey() == null) {
                        c47761Ion.LJ.LJJ.add(-1);
                    } else if (((Integer) entry.getKey()).intValue() == 0) {
                        c47761Ion.LJ.LJJ.add(-1);
                    } else {
                        c47761Ion.LJ.LJJ.add(c47761Ion.LIZ((Integer) entry.getKey()));
                    }
                    c47761Ion.LJ.LJIIZILJ.add(Integer.valueOf((int) j));
                    c47761Ion.LJ.LJIJ.add(Float.valueOf(f2));
                    c47761Ion.LJ.LJIJJ.add(Float.valueOf(f4));
                    c47761Ion.LJ.LJIJJLI.add(valueOf);
                    c47761Ion.LJ(1, map2);
                }
            }
        }
        C47781Ip7 c47781Ip7 = c47761Ion.LJ;
        c47781Ip7.LIZLLL++;
        c47781Ip7.LJIILLIIL++;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("brian video count:");
        LIZ.append(c47761Ion.LJ.LIZLLL);
        LIZ.append(",audio count:");
        C47956Irw.LIZIZ(LIZ, c47761Ion.LJ.LJIILLIIL, LIZ, "VideoEventSampleRecord");
        C47781Ip7 c47781Ip72 = c47761Ion.LJ;
        int i = c47781Ip72.LIZLLL;
        int i2 = c47761Ion.LIZ;
        if (i < i2 && c47781Ip72.LJIILLIIL < i2) {
            return;
        }
        if (c47781Ip72.LJJIJ == 0) {
            c47761Ion.LIZJ(0);
        } else {
            c47761Ion.LIZIZ();
        }
    }
}
