package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import ccb.t;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.texturerender.VideoSurface;
import com.ss.videoarch.live.LiveIOWrapper;
import com.ss.videoarch.strategy.LiveStrategyManager;
import defpackage.b0;
import java.net.InetAddress;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VAD implements Handler.Callback {
    public static final HashMap<String, Integer> T5 = new HashMap<>();
    public JSONObject A;
    public boolean A0;
    public long A2;
    public long A3;
    public ArrayList<Integer> B;
    public int B1;
    public long B2;
    public long B3;
    public ArrayList<Integer> C;
    public boolean C0;
    public int C1;
    public VAP C3;
    public ArrayList<Long> D;
    public int D1;
    public int D3;
    public int E1;
    public int E3;
    public boolean F0;
    public int F1;
    public long F2;
    public boolean G0;
    public final VAG G1;
    public long G2;
    public long G3;
    public int H1;
    public long H2;
    public boolean I;
    public int I1;
    public long I2;
    public int I3;

    /* renamed from: J, reason: collision with root package name */
    public TMJ f90J;
    public int J1;
    public long J2;
    public long J3;
    public boolean K;
    public int K1;
    public long K2;
    public int K3;
    public int L;
    public long L2;
    public int L3;
    public final Context LJLIL;
    public final InterfaceC48269Iwz LJLJI;
    public final t LJLJJL;
    public boolean LJLJL;
    public boolean LJLLLL;
    public boolean LJLZ;
    public long LJZ;
    public int LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIL;
    public int LLILIL;
    public boolean LLILLIZIL;
    public int LLILLJJLI;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public float LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public long LLJJJJLIIL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJZ;
    public int LLJZIJLIL;
    public int LLLIIL;
    public long LLLIILIL;
    public long LLLIL;
    public int LLLILZLLLI;
    public int LLLJ;
    public boolean LLLJIL;
    public long LLLJL;
    public long LLLL;
    public long LLLLII;
    public int LLLLIIIILLL;
    public int LLLLIIL;
    public long LLLLIILL;
    public long LLLLIILLL;
    public long LLLLILI;
    public long LLLLJ;
    public long LLLLJI;
    public long LLLLL;
    public long LLLLLIL;
    public long LLLLLILLIL;
    public long LLLLLJIL;
    public long LLLLLJLJLL;
    public int LLLLLL;
    public int LLLLLLIL;
    public int LLLLLLJ;
    public int LLLLLLL;
    public int LLLLLLLLL;
    public int LLLLLLLLLL;
    public long LLLLLLLZIL;
    public long LLLLLLZ;
    public long LLLLLLZZ;
    public long LLLLLZ;
    public boolean LLLLLZIL;
    public int LLLLLZL;
    public int LLLLZ;
    public int LLLLZI;
    public int LLLLZIL;
    public int LLLLZLL;
    public int LLLLZLLIL;
    public long LLLLZLLLI;
    public long LLLZ;
    public long LLLZI;
    public long LLLZIIL;
    public long LLLZIL;
    public long LLLZL;
    public long LLLZLL;
    public int LLLZLZ;
    public int LLLZZ;
    public int LLLZZIL;
    public boolean LLZ;
    public boolean LLZILL;
    public boolean LLZL;
    public long LLZLI;
    public boolean LLZLL;
    public long LLZLLIL;
    public long LLZLLLL;
    public long LLZZ;
    public C78575Usd LLZZJLIL;
    public final NTPUDPClient LLZZLLIL;
    public InetAddress LLZZZIL;
    public OUT LLZZZZ;
    public int M0;
    public long M2;
    public int M3;
    public int N;
    public long N2;
    public int N3;
    public boolean O0;
    public long O2;
    public long O3;
    public int P;
    public long P2;
    public long P3;
    public int Q0;
    public long Q1;
    public long Q2;
    public int Q3;
    public boolean R;
    public long R1;
    public long R2;
    public int R3;
    public long S1;
    public long S2;
    public long S3;
    public long T0;
    public long T1;
    public long T2;
    public long T3;
    public int U;
    public long U0;
    public int U1;
    public long U2;
    public long V0;
    public long V2;
    public long W;
    public long W2;

    /* renamed from: X, reason: collision with root package name */
    public long f91X;
    public long X2;
    public int Y1;
    public long Y2;
    public int Z;
    public int Z1;
    public long Z2;
    public int Z3;
    public boolean a;
    public boolean a0;
    public long a3;
    public int a4;
    public int b;
    public boolean b0;
    public boolean b2;
    public long b3;
    public boolean c0;
    public boolean c1;
    public long c3;
    public boolean d;
    public long d1;
    public int d2;
    public long d3;
    public String e;
    public long e0;
    public long e1;
    public long e3;
    public int f;
    public long f1;
    public java.util.Map<String, String> f2;
    public long f3;
    public int g;
    public long g3;
    public long h;
    public long h3;
    public int i;
    public int i1;
    public long i3;
    public int j;
    public int j0;
    public long j1;
    public int j2;
    public long j3;
    public int k;
    public long k1;
    public long k3;
    public int l;
    public long l3;
    public long m2;
    public long m3;

    /* renamed from: n, reason: collision with root package name */
    public int f93n;
    public boolean n0;
    public int n2;
    public long n3;
    public String o;
    public boolean o0;
    public final VAG o2;
    public int p;
    public JSONObject p0;
    public boolean p2;
    public int q;
    public JSONObject q0;
    public long q2;
    public int r;
    public JSONObject r0;
    public long r2;
    public long r3;
    public long s2;
    public long s3;
    public ArrayList<Long> t;
    public JSONObject t0;
    public int t2;
    public long t3;
    public ArrayList<Long> u;
    public int u0;
    public int u1;
    public long u2;
    public long u3;
    public ArrayList<Long> v;
    public int v1;
    public long v2;
    public long v3;
    public ArrayList<Long> w;
    public List<String> w1;
    public long w2;
    public long w3;
    public LinkedBlockingQueue<Long> x1;
    public long x2;
    public long x3;
    public long y2;
    public long y3;
    public long z2;
    public long z3;
    public String LJLJLJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJLJLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJLLI = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJLLILLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJLLJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJLLLLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJZI = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LJZL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLD = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLF = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLFF = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int LLFFF = -1;
    public int LLFII = -1;
    public int LLFZ = -1;
    public int LLI = -1;
    public int LLIFFJFJJ = -1;
    public String LLII = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLIIII = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLIIIILZ = "";
    public String LLIIIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int LLIIJI = -1;
    public int LLIIJLIL = -1;
    public String LLIIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLILII = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int LLILL = 1;
    public int LLILLL = -1;
    public int LLILZ = -1;
    public int LLILZIL = -1;
    public int LLILZLL = -1;
    public int LLIZ = -1;
    public float LLJILLL = -1.0f;
    public int LLJJ = -1;
    public float LLJJI = -1.0f;
    public String LLJJJJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLJJJJJIL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public long LLJJL = 2000;
    public int LLJL = -1;
    public int LLJLLL = -1;
    public int LLL = -1;
    public float LLLF = -1.0f;
    public int LLLFF = -1;
    public String LLLFFI = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLLFZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLLI = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLLII = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLLIIII = "flv";
    public String LLLIIIIL = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String LLLIIIL = "";
    public long LLLILZ = 2;
    public long LLLILZJ = 3000;
    public int LLLIZZ = -1;
    public long LLLLIL = -1;
    public int LLZIL = -1;
    public int c = -1;
    public int m = -1;
    public int s = -1;
    public long x = -1;
    public String y = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String z = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String E = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String F = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String G = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String H = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int M = -1;
    public int O = 1;
    public String Q = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int S = -1;
    public int T = -1;
    public int V = 1;

    /* renamed from: Y, reason: collision with root package name */
    public String f92Y = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public float d0 = -1.0f;
    public String f0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String g0 = "tcp";
    public String h0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int i0 = -1;
    public String k0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String l0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String m0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int s0 = -1;
    public final String v0 = Build.BOARD;
    public final String w0 = Build.HARDWARE;
    public String x0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String y0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String z0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String B0 = "rad";
    public String D0 = "origin";
    public String E0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String H0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String I0 = "origin";
    public String J0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public long K0 = -1;
    public int L0 = -1;
    public String N0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int P0 = -1;
    public String R0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public long S0 = -1;
    public long W0 = -1;
    public long X0 = -1;
    public long Y0 = -1;
    public long Z0 = -1;
    public String a1 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int b1 = 4;
    public long g1 = -1;
    public long h1 = -1;
    public long l1 = -1;
    public int m1 = -1;
    public int n1 = -1;
    public int o1 = -1;
    public int p1 = -1;
    public int q1 = -1;
    public int r1 = -1;
    public int s1 = -1;
    public int t1 = -1;
    public int y1 = -1;
    public long z1 = -1;
    public int A1 = -1;
    public int L1 = 10;
    public int M1 = 5000;
    public int N1 = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
    public String O1 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int P1 = -1;
    public String V1 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String W1 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String X1 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public final int a2 = 1;
    public int c2 = -1;
    public String e2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String g2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int h2 = -1;
    public float i2 = -1.0f;
    public int k2 = -1;
    public int l2 = -1;
    public int C2 = -1;
    public int D2 = -1;
    public String E2 = LiveGiftNewGifterBadgeSetting.DEFAULT;

    /* renamed from: o3, reason: collision with root package name */
    public int f94o3 = -1;
    public int p3 = -1;
    public int q3 = -1;
    public String F3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String H3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public final int U3 = 4096;
    public final int V3 = 512;
    public String W3 = "";
    public String X3 = "";
    public long Y3 = 5000;
    public int b4 = -1;
    public ArrayList<Integer> c4 = new ArrayList<>();
    public volatile long d4 = 0;
    public volatile long e4 = 0;
    public String f4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int g4 = 0;
    public int h4 = 0;
    public int i4 = 0;
    public int j4 = 0;
    public int k4 = 0;
    public int l4 = 0;
    public long m4 = 0;
    public int n4 = 0;
    public int o4 = 0;
    public String p4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int q4 = 0;
    public int r4 = 0;
    public int s4 = 0;
    public int t4 = 0;
    public int u4 = 0;
    public int v4 = 0;
    public String w4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int x4 = -1;
    public String y4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public List<String> z4 = null;
    public String A4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String B4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public int C4 = 0;
    public int D4 = 0;
    public long E4 = 0;
    public long F4 = 0;
    public int G4 = -998;
    public long H4 = 0;
    public int I4 = 0;
    public int J4 = 0;
    public int K4 = 0;
    public String L4 = "";
    public int M4 = 0;
    public int N4 = 0;
    public long O4 = -1;
    public JSONObject P4 = null;
    public List<Long> Q4 = null;
    public List<Long> R4 = null;
    public List<Long> S4 = null;
    public List<Long> T4 = null;
    public List<Long> U4 = null;
    public List<Double> V4 = null;
    public List<Integer> W4 = null;
    public int X4 = 0;
    public int Y4 = -1;
    public HashMap<String, Integer> Z4 = null;
    public boolean a5 = false;
    public long b5 = -1;
    public int c5 = 0;
    public int d5 = -1;
    public String e5 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String f5 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public long g5 = -1;
    public long h5 = -1;
    public int i5 = 0;
    public int j5 = 0;
    public long k5 = 0;
    public long l5 = 0;
    public long m5 = 0;
    public long n5 = 0;
    public int o5 = 0;
    public int p5 = -1;
    public String q5 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public String r5 = LiveGiftNewGifterBadgeSetting.DEFAULT;
    public boolean s5 = false;
    public final List<Long> t5 = new ArrayList();
    public int u5 = 0;

    /* renamed from: v5, reason: collision with root package name */
    public int f95v5 = 0;
    public int w5 = 0;
    public float x5 = -1.0f;
    public long y5 = 0;
    public long z5 = 0;
    public boolean A5 = false;
    public long B5 = 0;
    public long C5 = 0;
    public int D5 = -1;
    public long E5 = -1;
    public long F5 = -1;
    public boolean G5 = false;
    public int H5 = 0;
    public long I5 = 0;
    public long J5 = 0;
    public long K5 = 0;
    public long L5 = 0;
    public final ArrayList<JSONObject> M5 = new ArrayList<>();
    public int N5 = 10;
    public int O5 = 0;
    public boolean P5 = false;
    public int Q5 = 0;
    public int R5 = -1;
    public int S5 = 0;
    public final Handler LJLILLLLZI = new Handler(this);
    public long LJLJJLL = 60000;
    public final VAG LJLJJI = new VAG();

    public final void LJIIIIZZ() {
        this.LLZL = true;
    }

    public final void LJJ() {
        this.LLZLL = false;
        long currentTimeMillis = System.currentTimeMillis() - this.LLZLLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recover from error time ");
        LIZ.append(currentTimeMillis);
        X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
        if (this.LLZLLIL != 0) {
            this.LLZLLLL++;
            this.LLZZ = (System.currentTimeMillis() - this.LLZLLIL) + this.LLZZ;
        }
    }

    public final void LJJJLIIL() {
        this.g = 1;
        this.f = 1;
        if (this.LLZZZZ == null) {
            OUT out = new OUT(this);
            this.LLZZZZ = out;
            out.LIZ(104);
        }
    }

    public final void LIZJ() {
        VAG vag = this.LJLJJI;
        long j = vag.LJIILLIIL;
        if (j > 0 && vag.LJIILL > 0) {
            this.LLLLIIL = 0;
            return;
        }
        if (j > 0 && vag.LJIILL <= 0) {
            this.LLLLIIL = 1;
        } else if (j <= 0 && vag.LJIILL > 0) {
            this.LLLLIIL = 2;
        } else {
            this.LLLLIIL = 3;
        }
    }

    public final JSONObject LJFF() {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        String str2;
        boolean z2;
        char c;
        char c2;
        this.LJLJJL.p0();
        this.LJLJJL.J();
        float s0 = this.LJLJJL.s0();
        float O = this.LJLJJL.O();
        if (O != 0.0f) {
            f = s0 / O;
        } else {
            f = -1.0f;
        }
        this.LJLJJL.y();
        boolean z3 = this.LLIL;
        if ("bytevc2".equals(this.LLIIZ)) {
            z3 = false;
        }
        try {
            JSONObject put = new JSONObject().put("report_version", "5").put("live_sdk_version", "1.4.115.4").put("product_line", "live").put("client_timestamp", System.currentTimeMillis());
            String str3 = this.LJLLLLLL;
            String str4 = "-1";
            if (str3 == null) {
                str3 = "-1";
            }
            JSONObject put2 = put.put("player_sdk_version", str3);
            String str5 = this.LJLLI;
            if (str5 == null) {
                str5 = "-1";
            }
            JSONObject put3 = put2.put("project_key", str5);
            String str6 = this.LJLJLJ;
            if (str6 == null) {
                str6 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            JSONObject put4 = put3.put("live_stream_enter_method", str6);
            String str7 = this.LJLJLLL;
            if (str7 == null) {
                str7 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            JSONObject put5 = put4.put("live_stream_enter_action", str7);
            String str8 = this.LJLL;
            if (str8 == null) {
                str8 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            JSONObject put6 = put5.put("live_stream_enter_method_subtag", str8);
            String str9 = this.LJLLILLLL;
            if (str9 != null) {
                str4 = str9;
            }
            JSONObject put7 = put6.put("cdn_play_url", str4);
            String str10 = this.LJLLL;
            if (str10 == null) {
                str10 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            JSONObject put8 = put7.put("cdn_ip", str10).put("request_url", this.e2);
            if (this.LJLLLL) {
                i = 1;
            } else {
                i = 0;
            }
            JSONObject put9 = put8.put("ip_from_player_core", i);
            if (this.LJLZ) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            JSONObject put10 = put9.put("is_preview", i2).put("push_client_sdk_version", this.LJZL).put("push_client_platform", this.LL).put("push_client_os_version", this.LLD).put("push_client_model", this.LLF).put("push_client_start_time", this.LLFF).put("push_client_is_hardware_encode", this.LLFFF).put("push_client_min_bitrate", this.LLFII).put("push_client_max_bitrate", this.LLFZ).put("push_client_default_bitrate", this.LLI).put("push_client_push_protocol", this.LLII).put("push_client_qid", this.LLIIII).put("push_client_hit_node_optimize", this.LLIFFJFJJ);
            if (this.LLIIIL) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            JSONObject put11 = put10.put("open_dns_optimizer", i3);
            if (this.LLIIL) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            JSONObject put12 = put11.put("hit_node_optimize", i4).put("evaluator_symbol", this.LLIIIZ).put("lss_response_cost", this.LLIIJI).put("lss_response_status_code", this.LLIIJLIL);
            if (this.LLIILII) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            JSONObject put13 = put12.put("remote_sorted", i5).put("common_tag", LiveGiftNewGifterBadgeSetting.DEFAULT).put("codec_type", this.LLIIZ).put("codec_name", this.LLILII);
            if (z3) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            JSONObject put14 = put13.put("hardware_decode", i6);
            if (this.LLZILL) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            JSONObject put15 = put14.put("sharp", i7).put("enable_skip_on_buffering_end", this.LLILLJJLI).put("enable_latency_network_adapt", this.LLILL);
            if (this.LLILLIZIL) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            JSONObject put16 = put15.put("enable_hurry", i8).put("hurry_time", this.LLILLL).put("hurry_type", this.LLILZ).put("hurry_interval", this.LLILZIL).put("hurry_once_max", this.LLILZLL).put("hurry_cache_type", this.LLIZLLLIL).put("hurry_skip_start", this.LLIZ).put("hurry_stop_type", this.LLJJIII).put("min_buffer_stop_drop", this.LLJJIJI).put("max_drop_frame_time_cost", this.LLJJIJIIJIL).put("enable_fix_pts_shift", this.LLJJIJIL).put("hurry_delay_inc_threshold", this.LLJJJ).put("catch_speed", new DecimalFormat("0.00").format(this.LLJILLL)).put("slow_play_time", this.LLJJ).put("slow_speed", new DecimalFormat("0.00").format(this.LLJJI));
            if (this.LLLJIL) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            JSONObject put17 = put16.put("first_screen", i9);
            if (this.K) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            JSONObject put18 = put17.put("enable_httpDns", i10).put("enable_ntp", this.f).put("enable_media_codec_async", this.L).put("default_codec_id", this.M).put("url_ability", this.Q).put("max_cache_seconds", this.S).put("enable_fast_open", this.U).put("enable_mdl", this.i).put("enable_p2p", this.j).put("p2p_loader_type", this.m).put("used_p2p", this.k);
            String str11 = this.o;
            if (str11 == null) {
                str11 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            JSONObject put19 = put18.put("mdl_version", str11).put("enable_mdl_proto", this.p).put("enable_low_latency_flv", this.v1).put("open_strategy_sdk", this.g4).put("enable_strategy_node_opt", this.h4).put("enable_strategy_httpDNS", this.i4).put("enable_strategy_httpDNS_by_localDNS_timeout", this.j4).put("enable_strategy_ipv6", this.k4).put("hit_strategy_opt", this.n4);
            String str12 = this.LJLJJI.LLIILZL;
            if (str12 == null) {
                str12 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            JSONObject put20 = put19.put("dns_ip", str12).put("in_main_looper", this.V).put("start_play_buffer_threshold", this.LLJJJJLIIL).put("buffering_start_idl_time", this.LLLFF).put("enable_change_start_play_buffer_advance", this.LLJZ).put("fast_open_gop_cache", this.LLJL).put("used_predict_gop_cache", this.LLJLIL).put("buffering_end_ignore_video", this.LLJLILLLLZIIL).put("start_direct_after_prepared", this.LLJLL).put("check_buffering_end_advance", this.LLJLLIL).put("channel_id", this.LJLJJI.LLIFFJFJJ).put("sei_delay", this.LJLJJI.LLFF).put("sei_source", this.LJLJJI.LLFZ).put("sub_scene", this.LJLJJI.LLIIIILZ).put("chip_board", this.v0).put("chip_hardware", this.w0).put("width", this.q).put("height", this.r).put("settings_info", this.x0).put("ttnet_nqe_info", this.y0);
            if (this.O0) {
                str = "llash";
            } else {
                str = this.LLLIIII;
            }
            JSONObject put21 = put20.put("play_format", str).put("play_protocol", this.g0).put("protocol_downgraded", this.j0).put("protocol_degrade_reason", this.k0).put("url_set_method", this.LJLJJL.t1);
            if (this.A0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            JSONObject put22 = put21.put("enable_resolution_auto_degrade", i11).put("has_abr_info", this.C0).put("quic_load_succ", this.i0).put("link_info", this.LLIIIILZ);
            if (this.c0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            JSONObject put23 = put22.put("used_texturerender", i12).put("settings_res", this.D0).put("is_too_large_av_diff", this.LJLJJI.LLLJ).put("stall_retry_time_interval", this.LLZLI).put("is_too_large_av_diff", this.LJLJJI.LLLJ).put("enable_rtc_play", LJIIJJI()).put("enable_rts_quic", this.J1).put("enable_mini_sdp", this.I1).put("rtc_play_fallback", this.K1).put("fallback_type", this.U1).put("mute_audio", this.h2).put("player_volume_setting", this.i2).put("enable_liveio_play", this.l).put("liveio_play", this.D3).put("liveio_p2p", this.E3).put("liveio_p2p_upload", this.f93n).put("enable_pcdn_rts", this.I3).put("pcdn_rts_sdk_available", this.J3).put("pcdn_rts_play", this.K3).put("timer_version", this.q1).put("is_background", this.a4).put("duration_of_start_auto_speed", this.LLJJLIIIJLLLLLLLZ).put("redirect_ip", this.f4).put("request_id", this.g2).put("backup_to_origin", this.u4).put("enable_strategy_performance_optimization", this.l4).put("strategy_start_up_delay", this.m4).put("request_id", this.g2).put("udp_probe_result", this.x4).put("udp_probe_info", this.y4).put("quic_fallback_tcp", this.v4).put("enable_global_volume_balance", this.LLJZIJLIL).put("volume_balance_type", this.LLL).put("volume_balance_targetlufs", this.LLLF).put("enable_strategy_trans_params", this.o4).put("enable_use_pty", this.s4).put("enable_start_init_pty", this.t4).put("external_res", this.E0);
            if (this.F0) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            JSONObject put24 = put23.put("enable_lower_res", i13);
            if (this.G0) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            JSONObject put25 = put24.put("enable_low_res_startplay", i14).put("volume_setting", f).put("cert_verify_failed", this.LJLJJI.LLJJI).put("cert_verify_detail", this.LJLJJI.LLJJIII).put("redirect_url", this.LJLJJI.LLJJIJI).put("enable_preplay_smooth_switch", this.a5).put("live_stream_strategy_startup_bitrate_predict", this.e5).put("live_stream_strategy_smooth_switch_probe_bitrate", this.f5).put("liveplayer_hash_code", this.LJLJJL.u5).put("sei_ver", this.LJLJJI.LLI).put("fallback_from_hdr_to_sdr", this.o5).put("cae_category", this.D5);
            if (this.LJLJJL.u8 == 3) {
                z = true;
            } else {
                z = false;
            }
            JSONObject put26 = put25.put("is_preplay", z).put("transport_type", this.LLLIIIIL);
            if (TextUtils.isEmpty(this.LLLII)) {
                str2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            } else {
                str2 = this.LLLII;
            }
            JSONObject put27 = put26.put("biz_session_id", str2);
            if (this.c5 == 1) {
                put27.put("dynamic_open_texturerender", 1);
            }
            if (!this.H0.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                put27.put("abr_default_res", this.H0);
            }
            ArrayList<Integer> arrayList = this.c4;
            if (arrayList != null && !arrayList.isEmpty()) {
                put27.put("ab_group_id", new JSONArray((Collection) this.c4));
            }
            if (this.l == 1) {
                put27.put("liveio_error_msg", this.F3);
                put27.put("liveio_version", this.H3);
            }
            if (LJIILLIIL()) {
                put27.put("rtc_get_width", this.LJLJJL.r0());
                put27.put("rtc_get_height", this.LJLJJL.q0());
            }
            if (!this.V1.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                put27.put("live_stream_session_id", this.V1);
            } else {
                put27.put("live_stream_session_id", this.LLLFZ);
            }
            put27.put("live_vv_session_id", this.LLLI);
            if (this.D0.equals("auto")) {
                put27.put("auto_res", this.I0);
            }
            if (this.LJLJJL.LLFF == 1) {
                put27.put("texturerender_error", this.Z);
            }
            t tVar = this.LJLJJL;
            if (tVar.LLFFF == 1 && tVar.LLFF == 1) {
                if (tVar.g0()) {
                    int i15 = this.LJLJJL.X3;
                    if (i15 == 0) {
                        c = 0;
                    } else {
                        c = 4;
                    }
                    if (c == 0) {
                        put27.put("sr_width", this.q * 2).put("sr_height", this.r * 2);
                    } else {
                        if (i15 == 0) {
                            c2 = 0;
                        } else {
                            c2 = 4;
                        }
                        if (c2 == 4) {
                            put27.put("sr_width", (this.q * 3) / 2).put("sr_height", (this.r * 3) / 2);
                        }
                    }
                    this.a0 = true;
                } else {
                    put27.put("sr_width", this.q).put("sr_height", this.r);
                }
            }
            this.LJLJJL.getClass();
            this.LJLJJL.getClass();
            t tVar2 = this.LJLJJL;
            if (tVar2.U4 == 1 && tVar2.LLFF == 1) {
                VideoSurface videoSurface = tVar2.LLD;
                if (videoSurface != null && videoSurface.LJ(15) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.b0 = true;
                }
            }
            if (this.A0 || this.C0) {
                put27.put("abr_strategy", this.B0).put("default_res_bitrate", this.L0).put("stall_count_rad", this.b1);
            }
            String str13 = this.LLLIIII;
            if (str13 != null && TextUtils.equals(str13, "cmaf")) {
                put27.put("cmaf_audio_min_seq_no", this.LJLJJI.LJJIZ).put("cmaf_video_min_seq_no", this.LJLJJI.LJJIL).put("cmaf_audio_max_seq_no", this.LJLJJI.LJJJI).put("cmaf_video_max_seq_no", this.LJLJJI.LJJJ).put("cmaf_audio_req_seq_no", this.LJLJJI.LJJJJ).put("cmaf_video_req_seq_no", this.LJLJJI.LJJJIL).put("cmaf_audio_hit_push", this.LJLJJI.LJJJJI).put("cmaf_video_hit_push", this.LJLJJI.LJJJJIZL).put("cmaf_mpd_cached", this.LJLJJI.LJJJJJ).put("cmaf_mpd_preload_status", this.LJLJJI.LJJJJJL).put("cmaf_mpd_preload_delay", this.LJLJJI.LJJJJL).put("cmaf_mpd_preload_change_suffix", this.LJLJJI.LLILLIZIL).put("cmaf_mpd_preload_change_url", this.LJLJJI.LLILLJJLI);
            }
            if (TextUtils.equals(this.g0, "quic") || TextUtils.equals(this.g0, "h2q")) {
                put27.put("quic_report_cctk_frame_data", this.LJLJJI.LLJLLIL);
            }
            if (TextUtils.equals(this.g0, "quic") || TextUtils.equals(this.g0, "quicu") || TextUtils.equals(this.g0, "h2q") || TextUtils.equals(this.g0, "h2qu")) {
                put27.put("quic_config_cached", this.LJLJJI.LLJI).put("quic_CHLO_count", this.LJLJJI.LLJIJIL).put("quic_connection_id", this.LJLJJI.LLJJ);
            }
            if (TextUtils.equals(this.g0, "h2") || TextUtils.equals(this.g0, "h2q") || TextUtils.equals(this.g0, "h2qu")) {
                put27.put("h2_context_start_cost", this.LJLJJI.LLJJIJIIJIL);
                put27.put("h2_reused", this.LJLJJI.LLJJIJIL);
                put27.put("h2_race_result", this.LJLJJI.LLILZLL);
                put27.put("h2_negotiate_protocol", this.LJLJJI.LLILZ);
                put27.put("h2_push_url_list", this.LJLJJI.LLILZIL);
                put27.put("h2_pushed_stream_count", this.LJLJJI.LLIZ);
            }
            if (this.LJLJJL.H3 == 1) {
                put27.put("disable_video_render", 0);
            }
            int i16 = this.T;
            if (i16 > 0) {
                put27.put("tsl_timeshift", i16);
            }
            java.util.Map<String, String> map = this.f2;
            if (map != null) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    if (next.getKey().equals("Host")) {
                        put27.put("headers_host", next.getValue().replace(" ", ""));
                        break;
                    }
                }
            }
            int i17 = this.k2;
            if (i17 != -1) {
                put27.put("fcdn_res_type", i17);
            }
            int i18 = this.l2;
            if (i18 != -1) {
                put27.put("fcdn_trans_strategy", i18);
            }
            if (!TextUtils.isEmpty(this.g0) && (this.g0.equals("quic") || this.g0.equals("quicu") || this.g0.equals("h2q") || this.g0.equals("h2qu"))) {
                put27.put("ttquic_sdk_version", this.LJLJJI.LLILIL);
                put27.put("quic_rej_count", this.LJLJJI.LLILLL);
                put27.put("quic_rej_reasons", this.LJLJJI.LLILL);
            }
            if (TextUtils.equals(this.LLLIIII, "cmaf")) {
                LJJJLZIJ(put27);
            }
            if (this.LLLJL != 0) {
                put27.put("play_time_axis", System.currentTimeMillis() - this.LLLJL);
            } else {
                put27.put("play_time_axis", -1);
            }
            return put27;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final String LJIIIZ() {
        C39723FiR c39723FiR;
        t tVar = this.LJLJJL;
        String str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        if (tVar == null || (c39723FiR = tVar.D2) == null) {
            return LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        try {
            str = c39723FiR.LIZIZ();
            return str;
        } catch (Exception unused) {
            C46496IMq.LIZIZ();
            return str;
        }
    }

    public final int LJIIJ() {
        t tVar = this.LJLJJL;
        if (tVar != null) {
            tVar.getClass();
            return 0;
        }
        return -1;
    }

    public final int LJIIJJI() {
        t tVar = this.LJLJJL;
        if (tVar != null) {
            if (tVar.M2 == 1) {
                return 3;
            }
            int i = tVar.K2;
            if (i >= 1) {
                return i;
            }
            return tVar.J2;
        }
        return 0;
    }

    public final int LJIILL() {
        return (int) this.LLLLILI;
    }

    public final boolean LJIILLIIL() {
        t tVar = this.LJLJJL;
        if (tVar != null) {
            return tVar.F0();
        }
        return false;
    }

    public final boolean LJIIZILJ() {
        t tVar = this.LJLJJL;
        if (tVar == null || tVar.M2 != 1) {
            return false;
        }
        return true;
    }

    public final void LJIJJ() {
        if (this.LLLJIL) {
            return;
        }
        this.LJLJJI.LIZJ = System.currentTimeMillis();
        VAG vag = this.o2;
        if (vag != null) {
            vag.LIZJ = System.currentTimeMillis();
        }
    }

    public final void LJJII() {
        VAG vag;
        int i;
        int i2;
        t tVar = this.LJLJJL;
        if (tVar == null || (vag = this.LJLJJI) == null) {
            return;
        }
        int i3 = 1;
        this.I4 = 1;
        tVar.N(vag, 10);
        JSONObject LJFF = LJFF();
        if (LJFF == null) {
            return;
        }
        try {
            JSONObject put = LJFF.put("event_key", "first_frame_live");
            if (this.LLLJIL) {
                i = 1;
            } else {
                i = 0;
            }
            JSONObject put2 = put.put("is_stream_received", i).put("is_stream_received_live", this.I4).put("audio_live_open", this.LJLJJI.LLLL).put("video_live_open", this.LJLJJI.LLLLII).put("audio_live_connect_end", this.LJLJJI.LLLLIIIILLL).put("video_live_connect_end", this.LJLJJI.LLLLIIL).put("first_live_audio_packet_end", this.LJLJJI.LLLLIILL).put("first_live_video_packet_end", this.LJLJJI.LLLLIILLL);
            this.LJLJJI.getClass();
            JSONObject put3 = put2.put("first_live_audio_frame_render_end", 0L).put("first_live_video_frame_render_end", this.LJLJJI.LLLLIL).put("enable_preload", this.C4);
            if (this.E4 == 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            JSONObject put4 = put3.put("audioHttpxRequestCached", i2);
            if (this.F4 != 1) {
                i3 = 0;
            }
            JSONObject put5 = put4.put("videoHttpxRequestCached", i3).put("audioCachedNum", this.LJLJJI.LLLLILI).put("videoCachedNum", this.LJLJJI.LLLLJ).put("preload_init_error", this.D4).put("preload_result", this.G4).put("preload_resolution", this.L4).put("play_use_preload_resolution", this.M4).put("preload_visit_timedelta", this.H4).put("start", this.LJLJJI.LIZ).put("sdk_dns_analysis_end", this.LJLJJI.LIZIZ).put("http_req_finish_time", this.LJLJJI.LJJLIIIJLJLI).put("http_res_finish_time", this.LJLJJI.LJJLIIIJLLLLLLLZ).put("first_video_package_end", this.LJLJJI.LJIIJJI).put("first_audio_package_end", this.LJLJJI.LJIIL).put("first_video_frame_decode_end", this.LJLJJI.LJIILIIL).put("first_audio_frame_decode_end", this.LJLJJI.LJIILJJIL).put("first_frame_from_player_core", this.LJLJJI.LJIIZILJ).put("first_frame_render_end", this.LJLJJI.LJIILL).put("video_param_send_outlet_time", this.LJLJJI.LLIIIJ).put("first_video_frame_send_outlet_time", this.LJLJJI.LLIIIL).put("video_first_pkt_pts", this.LJLJJI.LJJLIIIJ).put("audio_first_pkt_pts", this.LJLJJI.LJJLIIIJJI).put("video_buffer_time", this.LJLJJI.LJLZ).put("audio_buffer_time", this.LJLJJI.LJZ).put("download_speed", this.LJLJJI.LJLL).put("suggest_format", this.f0).put("suggest_protocol", this.h0);
            VAG vag2 = this.LJLJJI;
            JSONObject put6 = put5.put("first_live_frame_time", vag2.LLLLIL - vag2.LIZ).put("cache_hit", this.J4).put("preload_task_state", this.K4).put("cache_open_start_time", this.LJLJJI.LLLLLL).put("cache_open_end_time", this.LJLJJI.LLLLLLIL).put("cache_read_eof_time", this.LJLJJI.LLLLLLJ).put("live_open_start_time", this.LJLJJI.LLLLLLL).put("live_open_end_time", this.LJLJJI.LLLLLLLLL).put("live_read_first_pkt_time", this.LJLJJI.LLLLLLLLLL);
            VAG vag3 = this.LJLJJI;
            JSONObject put7 = put6.put("cache_open_cost", vag3.LLLLLLIL - vag3.LLLLLL);
            VAG vag4 = this.LJLJJI;
            JSONObject put8 = put7.put("cache_consume_cost", vag4.LLLLLLJ - vag4.LLLLLL);
            VAG vag5 = this.LJLJJI;
            JSONObject put9 = put8.put("live_open_cost", vag5.LLLLLLLLL - vag5.LLLLLLL);
            VAG vag6 = this.LJLJJI;
            JSONObject put10 = put9.put("cache_live_hole", vag6.LLLLLLLLL - vag6.LLLLLLJ);
            VAG vag7 = this.LJLJJI;
            JSONObject put11 = put10.put("cache_live_read_diff", vag7.LLLLLLLLLL - vag7.LLLLLLJ);
            VAG vag8 = this.LJLJJI;
            put11.put("cache_live_render_diff", vag8.LLLLIL - vag8.LJIILL).put("buffer_stall_time", this.LLLLJ).put("buffer_stall_count", this.LLLLILI).put("video_decode_stall_time", this.G2).put("video_decode_stall_count", this.F2).put("audio_decode_stall_time", this.I2).put("audio_decode_stall_count", this.H2).put("video_render_stall_time", this.LLLLLLZ).put("video_render_stall_count", this.LLLLLLLZIL).put("audio_render_stall_time", this.LLLLLZ).put("audio_render_stall_count", this.LLLLLLZZ);
            LJJI("live_client_monitor_log", LJFF);
            long j = this.LLLLII;
            if (j <= 0) {
                return;
            }
            this.LLLLII = j + 1;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJIIZI() {
        JSONObject LJFF;
        String str;
        String[] split;
        Object obj = LiveGiftNewGifterBadgeSetting.DEFAULT;
        if (!LJIILLIIL() || LJIIZILJ() || (LJFF = LJFF()) == null) {
            return;
        }
        try {
            this.LJLJJL.Y(this.G1);
            try {
                if (!TextUtils.isEmpty(this.W1) && !TextUtils.equals(LiveGiftNewGifterBadgeSetting.DEFAULT, this.W1)) {
                    JSONObject jSONObject = new JSONObject(this.W1);
                    if (jSONObject.has("first_frame_stats_info")) {
                        obj = JSONObjectProtectorUtils.getJSONObject(jSONObject, "first_frame_stats_info").toString();
                    }
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            LJFF.put("event_key", "rtm_session_stop").put("start_time", this.LJLJJI.LIZ).put("sdk_session_start", this.G1.LLJLLL).put("sdk_dns_end", this.G1.LIZIZ).put("rtm_init_end", this.G1.LLJZ).put("rtm_signal_offer_created", this.G1.LLJZIJLIL).put("rtm_signal_dns_analysis_end", this.G1.LLL).put("rtm_signal_transport_connected", this.G1.LLLF).put("rtm_signal_offer_sent", this.G1.LLLFF).put("rtm_signal_answer_received", this.G1.LLLFFI).put("rtm_signal_answer_updated", this.G1.LLLFZ).put("rtc_start_end", this.G1.LLLIIII).put("rtm_data_ice_connect_start", this.G1.LLLI).put("rtm_data_ice_connected", this.G1.LLLII).put("rtm_data_first_video_packet", this.G1.LJIIJJI).put("rtm_data_first_audio_packet", this.G1.LJIIL).put("rtm_data_first_video_frame_end", this.G1.LLLIIIIL).put("rtm_data_first_audio_frame_end", this.G1.LLLIIIL).put("rtm_data_first_video_frame_decode_start", this.G1.LLLIIL).put("rtm_data_first_audio_frame_decode_start", this.G1.LLLIILIL).put("rtm_data_first_video_frame_decoded", this.G1.LJIILIIL).put("rtm_data_first_video_frame_rendered", this.G1.LJIILL).put("rtm_first_frame_stats_info", obj).put("rtm_first_frame_time_info", this.G1.LLLILZ).put("sdk_session_stop", System.currentTimeMillis()).put("rtc_preload_result", -1).put("retry", this.LLLZZIL).put("error_code", this.H1);
            t tVar = this.LJLJJL;
            if (tVar != null) {
                tVar.K0(5, " rtm_first_frame_time_info: " + this.G1.LLLILZ);
            }
            t tVar2 = this.LJLJJL;
            if (tVar2.F0()) {
                str = tVar2.LJLLL.LIZIZ(846);
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str) && (split = str.split("\\|")) != null && split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                LJFF.put("rtm_audio_render_series", split[0]);
                LJFF.put("rtm_video_render_series", split[1]);
                t tVar3 = this.LJLJJL;
                if (tVar3 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("rtm_audio_render_series: ");
                    LIZ.append(split[0]);
                    tVar3.K0(5, X1D.LIZIZ(LIZ));
                    t tVar4 = this.LJLJJL;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("rtm_video_render_series: ");
                    LIZ2.append(split[1]);
                    tVar4.K0(5, X1D.LIZIZ(LIZ2));
                }
            }
            LJJI("live_client_monitor_log", LJFF);
            long j = this.LLLLII;
            if (j > 0) {
                this.LLLLII = j + 1;
            }
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        this.G1.LIZ();
        this.H1 = 0;
    }

    public final void LJJJIL() {
        VAG vag = this.o2;
        if (vag != null) {
            vag.LLFFF = this.LJLJJI.LLFF;
        }
    }

    public final void LJJJJ() {
        VAG vag;
        long currentTimeMillis;
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        int i2;
        int i3;
        int i4;
        long j6;
        long j7;
        JSONObject LJIILJJIL;
        long j8;
        VAG vag2;
        if (this.n2 == 0 || (vag = this.o2) == null) {
            return;
        }
        this.LJLJJL.h0(vag);
        JSONObject LJFF = LJFF();
        if (this.p2) {
            j = System.currentTimeMillis() - this.r2;
            currentTimeMillis = 0;
        } else {
            currentTimeMillis = System.currentTimeMillis() - this.q2;
            j = 0;
        }
        if (this.p2) {
            if (this.A5) {
                j2 = (System.currentTimeMillis() - this.z5) + this.C5;
            } else {
                j2 = this.C5;
            }
        } else {
            j2 = 0;
        }
        this.t2++;
        long j9 = this.A2;
        if (j9 > 0) {
            j4 = j9 - this.r2;
            j3 = this.B2 - j9;
        } else {
            j3 = 0;
            j4 = 0;
        }
        if (this.LLLLLZIL) {
            this.u2++;
            if (this.LLLLIILL >= this.q2) {
                this.v2 = (System.currentTimeMillis() - this.LLLLIILL) + this.v2;
            } else {
                this.v2 = (System.currentTimeMillis() - this.q2) + this.v2;
            }
        }
        if (this.s2 > 0) {
            if (this.r2 > 0) {
                this.C2 = 0;
            } else {
                if (this.r2 <= 0) {
                    this.C2 = 1;
                }
                this.C2 = 3;
            }
        } else {
            if (this.r2 > 0) {
                this.C2 = 2;
            }
            this.C2 = 3;
        }
        if ((this.LLLIIIIL.equals("cellular") && this.LJLJJI.LLLLLZIL == -1) || this.LJLJJI.LLLLLZ != -1) {
            this.LLLIILIL += this.o2.LJJZZI;
            this.LLLIL += j;
        }
        VAG vag3 = this.o2;
        long j10 = vag3.LJJZZI;
        long j11 = vag3.LJJZZIII;
        if (LJFF != null) {
            try {
                JSONObject put = LJFF.put("event_key", "session_stop").put("index", this.t2).put("socket_err_code", this.LJLJJI.LLJ).put("socket_err_type", this.LJLJJI.LLIZLLLIL).put("stop_time", System.currentTimeMillis()).put("play_time", j);
                if (this.p2) {
                    i = 1;
                } else {
                    i = 0;
                }
                JSONObject put2 = put.put("is_stream_received", i).put("render_fail_type", this.C2).put("code", this.D2).put("stall_count", this.u2).put("stall_time", this.v2).put("audio_render_stall_count", this.y2).put("audio_render_stall_time", this.z2).put("video_render_stall_count", this.w2).put("video_render_stall_time", this.x2).put("start", this.q2).put("sdk_dns_analysis_end", this.o2.LIZIZ).put("player_dns_analysis_end", this.LJLJJI.LIZLLL).put("http_req_finish_time", this.o2.LJJLIIIJLJLI).put("http_res_finish_time", this.o2.LJJLIIIJLLLLLLLZ).put("tcp_first_package_end", this.LJLJJI.LJIIJ).put("first_video_package_end", this.o2.LJIIJJI).put("first_audio_package_end", this.o2.LJIIL).put("first_video_frame_decode_end", this.o2.LJIILIIL).put("first_audio_frame_decode_end", this.o2.LJIILJJIL).put("video_device_open_start", this.o2.LJIJI).put("video_device_open_end", this.o2.LJIJJ).put("audio_device_open_start", this.o2.LJIJJLI).put("audio_device_open_end", this.o2.LJIL).put("video_device_wait_start", this.o2.LLIIL).put("video_device_wait_end", this.o2.LLIILII).put("find_stream_info_start", this.o2.LLIIJI).put("find_stream_info_end", this.o2.LLIIJLIL).put("video_param_send_outlet_time", this.o2.LLIIIJ).put("first_video_frame_send_outlet_time", this.o2.LLIIIL).put("first_frame_render_end", this.r2).put("first_audio_frame_end", this.s2).put("prepare_end", this.o2.LJIJ).put("prepare_block_end", this.o2.LIZJ).put("video_first_pkt_pos", this.o2.LJJLIIIIJ).put("video_first_pkt_pts", this.o2.LJJLIIIJ).put("audio_first_pkt_pos", this.o2.LJJLIIIJILLIZJL).put("audio_first_pkt_pts", this.o2.LJJLIIIJJI).put("video_render_type", this.o2.LLIIIZ).put("download_speed", this.o2.LJZI).put("video_buffer_time", this.o2.LJZL).put("audio_buffer_time", this.o2.LL);
                if (this.o2.LLD > 0) {
                    j5 = this.LJLJJI.LLD;
                } else {
                    j5 = -this.LJLJJI.LLD;
                }
                JSONObject put3 = put2.put("wait_time", j5);
                if (this.o2.LLD >= 0) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                JSONObject put4 = put3.put("is_waiting", i2).put("first_stall_time", j4).put("first_stall_duration", j3).put("play_time_on_no_frame", currentTimeMillis);
                String str = this.LJZI;
                if (str == null) {
                    str = LiveGiftNewGifterBadgeSetting.DEFAULT;
                }
                JSONObject put5 = put4.put("sdk_params", str).put("total_download_size", j10).put("drop_audio_pts_diff", this.o2.LJJLIIIJJIZ).put("drop_audio_cost", this.o2.LJJLIIIJL);
                if (this.a0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                JSONObject put6 = put5.put("sr_used", i3);
                if (this.b0) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                JSONObject put7 = put6.put("sharpen_used", i4).put("network_timeout", this.m1).put("suggest_format", this.f0).put("suggest_protocol", this.h0).put("suggest_access_code", this.m0).put("first_sei_delay", this.o2.LLFFF).put("room_play_time_ms", j2).put("error_msg", this.E2).put("play_size", j11);
                if (this.D3 > 0) {
                    j6 = this.o2.LJL;
                } else {
                    j6 = 0;
                }
                JSONObject put8 = put7.put("http_flow_size", j6);
                if (this.D3 > 0) {
                    j7 = this.o2.LJLI;
                } else {
                    j7 = 0;
                }
                put8.put("p2p_flow_size", j7).put("httpio_play_time", this.o2.LJLIIIL).put("p2pio_play_time", this.o2.LJLIIL).put("switch_cellular_reason", this.o2.LLLLLZ).put("switch_cellular_detail", this.o2.LLLLLZL).put("switch_cellular_result", this.o2.LLLLZI).put("switch_default_reason", this.o2.LLLLLZIL).put("switch_default_detail", this.o2.LLLLZ).put("switch_default_result", this.o2.LLLLZIL).put("cellular_total_download_size", this.LLLIILIL).put("cellular_play_time", this.LLLIL);
                if (this.LJLLILLLL != null) {
                    if ("kcp".equals(this.g0)) {
                        j8 = this.o2.LIZLLL;
                    } else {
                        j8 = this.o2.LJFF;
                    }
                    LJFF.put("tcp_connect_end", j8);
                } else {
                    LJFF.put("tcp_connect_end", this.o2.LJFF);
                }
                this.LLLLII++;
                LJJI("live_client_monitor_log", LJFF);
                this.Q5++;
                if (this.O5 > 0 && ((this.M5.size() < this.N5 || this.P5) && (LJIILJJIL = LJIILJJIL(LJFF)) != null)) {
                    this.M5.add(LJIILJJIL);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (this.n2 == 0 || (vag2 = this.o2) == null) {
            return;
        }
        this.p2 = false;
        this.z5 = 0L;
        this.C5 = 0L;
        this.A2 = 0L;
        this.B2 = 0L;
        this.u2 = 0L;
        this.v2 = 0L;
        this.q2 = 0L;
        this.r2 = 0L;
        this.s2 = 0L;
        this.w2 = 0L;
        this.x2 = 0L;
        this.y2 = 0L;
        this.z2 = 0L;
        this.C2 = -1;
        this.D2 = 0;
        this.E2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.P5 = false;
        vag2.LIZ();
    }

    public final void LJJLIIIJJI() {
        OUT out;
        if (this.LJLJL) {
            return;
        }
        long j = this.LJLJJLL;
        if (LJIILLIIL()) {
            j = this.Y3;
        }
        this.LJLILLLLZI.sendEmptyMessageDelayed(101, j);
        if (this.R) {
            this.LJLILLLLZI.sendEmptyMessageDelayed(102, 5000L);
        }
        if (this.g == 1 && !this.d && (out = this.LLZZZZ) != null) {
            out.LIZ(103);
            this.d = true;
        }
        this.LJLJL = true;
    }

    public final void LJJLIIIJLJLI() {
        VAG vag;
        t tVar = this.LJLJJL;
        if (tVar == null || (vag = this.LJLJJI) == null) {
            return;
        }
        tVar.N(vag, 3);
        if (this.t == null) {
            this.t = new ArrayList<>();
            this.v = new ArrayList<>();
            this.u = new ArrayList<>();
        }
        this.t.add(Long.valueOf(this.LJLJJI.LJLJLLL));
        this.v.add(Long.valueOf(this.LJLJJI.LJZ));
        this.u.add(Long.valueOf(this.LJLJJI.LJLL));
        if (!this.I) {
            return;
        }
        if (this.C == null) {
            this.C = new ArrayList<>();
            this.B = new ArrayList<>();
        }
        this.C.add(Integer.valueOf(this.LJLJJI.LLIIII));
        this.B.add(Integer.valueOf(this.LJLJJI.LLII));
    }

    public final JSONObject LIZ() {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        LJJLIIIJLJLI();
        try {
            JSONObject put = new JSONObject().put("start_time", this.LJLJJI.LIZ).put("duration", System.currentTimeMillis() - this.LJLJJI.LIZ).put("render_fps_series", new JSONArray((Collection) this.t)).put("download_bitrate_series", new JSONArray((Collection) this.u)).put("play_buffer_series", new JSONArray((Collection) this.v)).put("speed_switch_series", this.LLJJJJJIL).put("video_stall_series", this.z).put("audio_stall_series", this.y);
            if (this.B == null) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray((Collection) this.B);
            }
            JSONObject put2 = put.put("push_bitrate_series", jSONArray);
            if (this.C == null) {
                jSONArray2 = new JSONArray();
            } else {
                jSONArray2 = new JSONArray((Collection) this.C);
            }
            JSONObject put3 = put2.put("push_fps_series", jSONArray2);
            if (this.w == null) {
                jSONArray3 = new JSONArray();
            } else {
                jSONArray3 = new JSONArray((Collection) this.w);
            }
            JSONObject put4 = put3.put("stall_series", jSONArray3);
            JSONObject jSONObject = this.A;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject put5 = put4.put("error_series", jSONObject);
            if (this.D == null) {
                jSONArray4 = new JSONArray();
            } else {
                jSONArray4 = new JSONArray((Collection) this.D);
            }
            return put5.put("push_stall_series", jSONArray4).put("push_video_stall_series", this.F).put("push_audio_stall_series", this.E).put("quicu_audio_drop_series", this.G).put("quicu_video_drop_series", this.H);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final void LJIILIIL() {
        String str;
        if (!LJIILLIIL() || LJIIZILJ()) {
            return;
        }
        if (!TextUtils.equals(LiveGiftNewGifterBadgeSetting.DEFAULT, this.W1) && !TextUtils.isEmpty(this.W1)) {
            return;
        }
        t tVar = this.LJLJJL;
        if (tVar.LJLLL == null || !tVar.F0()) {
            str = null;
        } else {
            str = tVar.LJLLL.LIZIZ(884);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJJIJL(str);
    }

    public final void LJJIIZ() {
        if (!LJIILLIIL() || LJIIZILJ()) {
            return;
        }
        VAG vag = this.G1;
        if (vag.LJIILL != 0) {
            return;
        }
        vag.LJIILL = System.currentTimeMillis();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(120:12|13|(3:15|(1:17)(1:268)|18)(2:269|(1:278)(3:273|(1:275)(1:277)|276))|19|(2:21|(1:23)(1:266))(1:267)|24|(1:26)(1:265)|27|(2:29|(1:31))|32|(1:36)|37|(2:41|(108:43|44|45|(5:47|(3:49|(2:51|52)(1:54)|53)|55|56|(99:262|59|(1:61)(1:261)|62|(2:64|65)(1:260)|66|(4:68|(1:70)|71|72)(1:259)|73|(1:75)(1:258)|76|(1:257)|78|(2:80|81)(1:256)|82|(1:84)|85|(1:87)(1:255)|88|(1:90)(1:254)|91|(1:93)(1:253)|94|(1:96)(1:252)|97|(1:99)(1:251)|100|(1:102)(1:250)|103|(1:105)(1:249)|106|(2:108|109)(1:248)|110|(1:112)|113|(1:115)|116|117|(1:119)(1:247)|120|(1:122)|123|(1:125)|126|(1:128)|129|(1:131)|132|(1:134)|135|(1:137)|138|(1:140)|141|(1:143)|144|(1:146)|147|148|(1:152)|153|154|(1:156)|157|158|(2:237|(1:239)(3:240|(1:242)(1:244)|243))(1:162)|163|164|(2:170|(2:172|(1:174)))|175|(4:177|178|(1:184)(1:182)|183)|185|(1:187)|188|(1:190)|191|(1:193)|194|(1:196)|197|(1:199)|200|(1:202)|203|204|(1:236)|208|(1:235)|212|(1:234)|218|(1:220)|221|(1:223)|224|(1:226)|227|(1:229)|230|232))(1:263)|58|59|(0)(0)|62|(0)(0)|66|(0)(0)|73|(0)(0)|76|(0)|78|(0)(0)|82|(0)|85|(0)(0)|88|(0)(0)|91|(0)(0)|94|(0)(0)|97|(0)(0)|100|(0)(0)|103|(0)(0)|106|(0)(0)|110|(0)|113|(0)|116|117|(0)(0)|120|(0)|123|(0)|126|(0)|129|(0)|132|(0)|135|(0)|138|(0)|141|(0)|144|(0)|147|148|(2:150|152)|153|154|(0)|157|158|(1:160)|237|(0)(0)|163|164|(3:166|170|(0))|175|(0)|185|(0)|188|(0)|191|(0)|194|(0)|197|(0)|200|(0)|203|204|(1:206)|236|208|(1:210)|235|212|(1:214)|234|218|(0)|221|(0)|224|(0)|227|(0)|230|232))|264|45|(0)(0)|58|59|(0)(0)|62|(0)(0)|66|(0)(0)|73|(0)(0)|76|(0)|78|(0)(0)|82|(0)|85|(0)(0)|88|(0)(0)|91|(0)(0)|94|(0)(0)|97|(0)(0)|100|(0)(0)|103|(0)(0)|106|(0)(0)|110|(0)|113|(0)|116|117|(0)(0)|120|(0)|123|(0)|126|(0)|129|(0)|132|(0)|135|(0)|138|(0)|141|(0)|144|(0)|147|148|(0)|153|154|(0)|157|158|(0)|237|(0)(0)|163|164|(0)|175|(0)|185|(0)|188|(0)|191|(0)|194|(0)|197|(0)|200|(0)|203|204|(0)|236|208|(0)|235|212|(0)|234|218|(0)|221|(0)|224|(0)|227|(0)|230|232) */
    /* JADX WARN: Removed duplicated region for block: B:102:0x08c8 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x08d4 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x09ee A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0a1a A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0a29 A[Catch: JSONException -> 0x1045, TRY_ENTER, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0a42 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0b38 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0b41 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0b80 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0b8b A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0b95 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0ba0 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0ba9 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0bba A[Catch: JSONException -> 0x1045, TRY_LEAVE, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0bcc A[Catch: all -> 0x0bfc, TryCatch #1 {all -> 0x0bfc, blocks: (B:148:0x0bc8, B:150:0x0bcc, B:152:0x0bd4, B:153:0x0bf2), top: B:147:0x0bc8 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0c00 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0c2d A[Catch: JSONException -> 0x1045, TRY_ENTER, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0cce A[Catch: JSONException -> 0x1045, TRY_ENTER, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0d47 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0db3 A[Catch: JSONException -> 0x1045, TRY_LEAVE, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0e68 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0e7f A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0e9f A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0ea8 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0eb1 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0eba A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0ee9 A[Catch: JSONException -> 0x1045, TRY_ENTER, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0f40 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0f81 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0fa7 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0fb4 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1002 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x1013 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0ca7 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0cb1 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0a30 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0203 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01f7 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018c A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ef A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213 A[Catch: JSONException -> 0x1045, TryCatch #0 {JSONException -> 0x1045, blocks: (B:13:0x005a, B:15:0x0060, B:17:0x006b, B:18:0x0076, B:19:0x00af, B:21:0x00b3, B:23:0x00b7, B:24:0x00c5, B:26:0x00cd, B:27:0x00d9, B:29:0x00df, B:31:0x00f5, B:32:0x0107, B:34:0x010b, B:36:0x0111, B:37:0x0123, B:39:0x013f, B:41:0x0143, B:44:0x017a, B:45:0x0180, B:47:0x018c, B:49:0x01b5, B:51:0x01c1, B:53:0x01d3, B:56:0x01db, B:59:0x01eb, B:61:0x01ef, B:62:0x01f2, B:66:0x0209, B:68:0x0213, B:70:0x0220, B:72:0x0234, B:73:0x0239, B:76:0x026e, B:78:0x0508, B:82:0x051c, B:85:0x0558, B:88:0x0599, B:91:0x05a6, B:94:0x0717, B:97:0x0726, B:100:0x08be, B:102:0x08c8, B:103:0x08ca, B:105:0x08d4, B:106:0x08d6, B:110:0x09b4, B:112:0x09ee, B:113:0x0a04, B:115:0x0a1a, B:116:0x0a1d, B:119:0x0a29, B:120:0x0a34, B:122:0x0a42, B:123:0x0ace, B:125:0x0b38, B:126:0x0b3d, B:128:0x0b41, B:129:0x0b7c, B:131:0x0b80, B:132:0x0b85, B:134:0x0b8b, B:135:0x0b90, B:137:0x0b95, B:138:0x0b9a, B:140:0x0ba0, B:141:0x0ba5, B:143:0x0ba9, B:144:0x0bb4, B:146:0x0bba, B:154:0x0bfc, B:156:0x0c00, B:157:0x0c15, B:160:0x0c2d, B:162:0x0c33, B:163:0x0cae, B:166:0x0cce, B:168:0x0cd4, B:170:0x0cdc, B:172:0x0d47, B:174:0x0da4, B:175:0x0da9, B:177:0x0db3, B:180:0x0dbb, B:182:0x0dc1, B:183:0x0dc5, B:184:0x0ed3, B:185:0x0e64, B:187:0x0e68, B:188:0x0e7b, B:190:0x0e7f, B:191:0x0e9b, B:193:0x0e9f, B:194:0x0ea4, B:196:0x0ea8, B:197:0x0ead, B:199:0x0eb1, B:200:0x0eb6, B:202:0x0eba, B:203:0x0eca, B:206:0x0ee9, B:208:0x0f36, B:210:0x0f40, B:212:0x0f77, B:214:0x0f81, B:216:0x0f89, B:218:0x0f9f, B:220:0x0fa7, B:221:0x0fac, B:223:0x0fb4, B:224:0x0ffe, B:226:0x1002, B:227:0x100f, B:229:0x1013, B:230:0x1032, B:234:0x0f93, B:235:0x0f4a, B:236:0x0ef1, B:237:0x0c95, B:239:0x0ca7, B:240:0x0cb1, B:242:0x0cbb, B:243:0x0cbf, B:244:0x0cc3, B:247:0x0a30, B:260:0x0203, B:261:0x01f7, B:262:0x01e5, B:266:0x016a, B:268:0x0072, B:269:0x007c, B:271:0x0080, B:273:0x0088, B:275:0x0096, B:276:0x00a1, B:277:0x009d), top: B:12:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x08bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJL(java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 4170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAD.LJJJJJL(java.lang.String):void");
    }

    public static long LIZIZ(JSONArray jSONArray) {
        long j = 0;
        for (int i = 0; i < jSONArray.length(); i++) {
            j += JSONArrayProtectorUtils.getInt(jSONArray, i);
        }
        return j;
    }

    public static JSONObject LJIILJJIL(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject.has("total_download_size")) {
                jSONObject2.put("total_download_size", jSONObject.get("total_download_size"));
            }
            if (jSONObject.has("play_size")) {
                jSONObject2.put("play_size", jSONObject.get("play_size"));
            }
            if (jSONObject.has("play_time")) {
                jSONObject2.put("play_time", jSONObject.get("play_time"));
            }
            if (jSONObject.has("http_flow_size")) {
                jSONObject2.put("http_flow_size", jSONObject.get("http_flow_size"));
            }
            if (jSONObject.has("p2p_flow_size")) {
                jSONObject2.put("p2p_flow_size", jSONObject.get("p2p_flow_size"));
            }
            if (jSONObject.has("ab_group_id")) {
                jSONObject2.put("ab_group_id", jSONObject.get("ab_group_id"));
            }
            if (jSONObject.has("live_stream_session_id")) {
                jSONObject2.put("session_id", jSONObject.get("live_stream_session_id"));
            }
            jSONObject2.put("client_timestamp", jSONObject.get("client_timestamp"));
            return jSONObject2;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final void LIZLLL(int i) {
        this.C1++;
        this.B1++;
        int i2 = this.A1;
        if (i2 >= 0) {
            if (i <= i2) {
                LJJJJL(4, i, i2);
                if (i == 1) {
                    this.D1++;
                    this.E1++;
                }
            } else {
                this.D1++;
                this.E1++;
                if (i - i2 > 1 && !this.LJLJJL.E) {
                    LJJJJL(3, i, i2);
                    int i3 = this.B1;
                    int i4 = this.A1;
                    this.B1 = ((i - i4) - 1) + i3;
                    this.D1 = ((i - i4) - 1) + this.D1;
                }
            }
        }
        this.A1 = i;
    }

    public final void LJIJ(boolean z) {
        long currentTimeMillis;
        long j;
        int i;
        int i2;
        if (this.LJLJJL == null || this.LJLJI == null) {
            return;
        }
        if (this.LJLJJI.LJIILL > this.V0) {
            currentTimeMillis = System.currentTimeMillis();
            j = this.LJLJJI.LJIILL;
        } else {
            currentTimeMillis = System.currentTimeMillis();
            j = this.V0;
        }
        long j2 = currentTimeMillis - j;
        if (this.Z0 > 0) {
            if (this.P0 > this.S0) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            this.Q0 = i2;
        }
        try {
            JSONObject LJFF = LJFF();
            JSONObject put = LJFF.put("event_key", "abr_session").put("current_resolution", this.I0).put("current_bitrate", this.P0).put("previous_resolution", this.R0).put("previous_bitrate", this.S0).put("stall_count", this.T0).put("stall_time", this.U0).put("startup_type", this.Q0).put("play_time", j2).put("switch_cost", this.Z0).put("abr_switch_info", this.a1).put("is_last", z);
            if (z) {
                i = this.M0 + 1;
            } else {
                i = this.M0;
            }
            put.put("abr_switch_count", i);
            LJJI("live_client_monitor_log", LJFF);
            long j3 = this.LLLLII;
            if (j3 > 0) {
                this.LLLLII = j3 + 1;
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = System.currentTimeMillis();
    }

    public final void LJJIFFI(long j) {
        VAG vag;
        int i;
        t tVar;
        this.LLLJIL = true;
        this.i1 = this.LLLZZIL;
        this.j1 = this.k1;
        this.LLLJL = System.currentTimeMillis();
        this.y5 = System.currentTimeMillis();
        this.z5 = System.currentTimeMillis();
        if (this.LJLZ) {
            this.A3 = this.LLLJL;
        }
        if (this.LJLJJL == null || (vag = this.LJLJJI) == null) {
            return;
        }
        try {
            vag.LJLJJLL = System.currentTimeMillis();
            if (this.LJLZ) {
                VAG vag2 = this.LJLJJI;
                vag2.LJLJL = vag2.LJLJJLL;
            }
            int i2 = 0;
            this.LJLJJL.N(this.LJLJJI, 0);
            JSONObject LJI = LJI(this.LJLJJI, this.LLIILZL, j);
            this.G3 = this.LLLJL - this.LJLJJI.LIZ;
            if (LJIILLIIL() && !LJIIZILJ() && (tVar = this.LJLJJL) != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("rtc_play_url:");
                LIZ.append(this.LJLLILLLL);
                tVar.K0(5, X1D.LIZIZ(LIZ));
                t tVar2 = this.LJLJJL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("mFirstFrameView:");
                LIZ2.append(this.G3);
                tVar2.K0(5, X1D.LIZIZ(LIZ2));
                t tVar3 = this.LJLJJL;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("startPlayTime:");
                LIZ3.append(this.LJLJJI.LIZ);
                LIZ3.append(",mFirstFrameTimestamp:");
                LIZ3.append(this.LLLJL);
                tVar3.K0(5, X1D.LIZIZ(LIZ3));
                t tVar4 = this.LJLJJL;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("rtc_inited_end:");
                LIZ4.append(this.LJLJJI.LLJZ);
                tVar4.K0(5, X1D.LIZIZ(LIZ4));
                t tVar5 = this.LJLJJL;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("start_2_init_diff: ");
                VAG vag3 = this.LJLJJI;
                LIZ5.append(vag3.LLJZ - vag3.LIZ);
                tVar5.K0(5, X1D.LIZIZ(LIZ5));
                t tVar6 = this.LJLJJL;
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("rtc_offer_send_end:");
                LIZ6.append(this.LJLJJI.LLLFF);
                tVar6.K0(5, X1D.LIZIZ(LIZ6));
                t tVar7 = this.LJLJJL;
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("rtc_answer_recv_end:");
                LIZ7.append(this.LJLJJI.LLLFFI);
                tVar7.K0(5, X1D.LIZIZ(LIZ7));
                t tVar8 = this.LJLJJL;
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("rtc_ice_connected_time:");
                LIZ8.append(this.LJLJJI.LLLII);
                tVar8.K0(5, X1D.LIZIZ(LIZ8));
                t tVar9 = this.LJLJJL;
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("first_video_package_end:");
                LIZ9.append(this.LJLJJI.LJIIJJI);
                tVar9.K0(5, X1D.LIZIZ(LIZ9));
                t tVar10 = this.LJLJJL;
                StringBuilder LIZ10 = X1D.LIZ();
                LIZ10.append("first_video_frame_end:");
                LIZ10.append(this.LJLJJI.LLLIIIIL);
                tVar10.K0(5, X1D.LIZIZ(LIZ10));
                t tVar11 = this.LJLJJL;
                StringBuilder LIZ11 = X1D.LIZ();
                LIZ11.append("first_video_frame_decode_start:");
                LIZ11.append(this.LJLJJI.LLLIIL);
                tVar11.K0(5, X1D.LIZIZ(LIZ11));
                t tVar12 = this.LJLJJL;
                StringBuilder LIZ12 = X1D.LIZ();
                LIZ12.append("first_video_frame_decode_end:");
                LIZ12.append(this.LJLJJI.LJIILIIL);
                tVar12.K0(5, X1D.LIZIZ(LIZ12));
                t tVar13 = this.LJLJJL;
                StringBuilder LIZ13 = X1D.LIZ();
                LIZ13.append("first_frame_render_end:");
                LIZ13.append(this.LJLJJI.LJIILL);
                tVar13.K0(5, X1D.LIZIZ(LIZ13));
                t tVar14 = this.LJLJJL;
                StringBuilder LIZ14 = X1D.LIZ();
                LIZ14.append("preload_result: ");
                LIZ14.append(-1);
                tVar14.K0(5, X1D.LIZIZ(LIZ14));
            }
            String str = this.LLLIIII;
            if (str != null && ("cmaf".equals(str) || "avph".equals(this.LLLIIII))) {
                LJI.put("video_dns_analysis_end", this.LJLJJI.LJJJJZ).put("audio_dns_analysis_end", this.LJLJJI.LJJJJZI).put("video_tcp_connect_time", this.LJLJJI.LJJJJLI).put("audio_tcp_connect_time", this.LJLJJI.LJJJJLL).put("video_tcp_first_packet_time", this.LJLJJI.LJJJLIIL).put("audio_tcp_first_packet_time", this.LJLJJI.LJJJLL).put("video_http_req_finish_time", this.LJLJJI.LJJJLZIJ).put("audio_http_req_finish_time", this.LJLJJI.LJJJZ).put("video_http_res_finish_time", this.LJLJJI.LJJL).put("audio_http_res_finish_time", this.LJLJJI.LJJLI);
                if ("cmaf".equals(this.LLLIIII)) {
                    LJI.put("cmaf_mpd_dns_analysis_end", this.LJLJJI.LJJI).put("cmaf_sdk_version", this.LJLJJI.LJJIJ).put("cmaf_mpd_tcp_connect_time", this.LJLJJI.LJJIFFI).put("cmaf_mpd_tcp_first_package_end", this.LJLJJI.LJJIII).put("cmaf_mpd_http_req_finish_time", this.LJLJJI.LJJII).put("cmaf_mpd_http_res_finish_time", this.LJLJJI.LJJIIJ).put("cmaf_audio_firstseg_connect_time", this.LJLJJI.LJJIIZ).put("cmaf_video_firstseg_connect_time", this.LJLJJI.LJJIIZI).put("cmaf_mpd_connect_time", this.LJLJJI.LJJIIJZLJL);
                }
                LJJJZ(LJI);
            }
            if (TextUtils.equals("cmaf", this.LLLIIII) || TextUtils.equals("flv", this.LLLIIII)) {
                JSONObject put = LJI.put("enable_preload", this.C4).put("preload_init_error", this.D4).put("preload_result", this.G4).put("preload_resolution", this.L4).put("play_use_preload_resolution", this.M4).put("preload_visit_timedelta", this.H4);
                if (this.E4 == 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                JSONObject put2 = put.put("audioHttpxRequestCached", i);
                if (this.F4 == 1) {
                    i2 = 1;
                }
                JSONObject put3 = put2.put("videoHttpxRequestCached", i2).put("cache_hit", this.J4).put("cache_open_start_time", this.LJLJJI.LLLLLL).put("cache_open_end_time", this.LJLJJI.LLLLLLIL);
                VAG vag4 = this.LJLJJI;
                put3.put("cache_open_cost", vag4.LLLLLLIL - vag4.LLLLLL).put("preload_task_state", this.K4);
                if (this.C4 == 1) {
                    if (this.J4 == 1) {
                        long j2 = this.LJLJJI.LIZIZ;
                        LJI.put("player_dns_analysis_end", j2);
                        LJI.put("tcp_connect_end", j2);
                        LJI.put("tcp_first_package_end", j2);
                    }
                    StringBuilder LIZ15 = X1D.LIZ();
                    LIZ15.append("[first_frame] first_frame_view :");
                    LIZ15.append(this.G3);
                    LIZ15.append("\ncache_hit :");
                    LIZ15.append(this.J4);
                    LIZ15.append("\npreload_result :");
                    LIZ15.append(this.G4);
                    LIZ15.append("\npreload_visit_timedelta :");
                    LIZ15.append(this.H4);
                    LIZ15.append("\npreload_task_state : ");
                    LIZ15.append(this.K4);
                    LIZ15.append("\nfirst_video_pkg_cost : ");
                    VAG vag5 = this.LJLJJI;
                    LIZ15.append(vag5.LJIIJJI - vag5.LIZ);
                    LIZ15.append("\nfirst_video_frame_decode_cost : ");
                    VAG vag6 = this.LJLJJI;
                    LIZ15.append(vag6.LJIILIIL - vag6.LIZ);
                    LIZ15.append("\nfirst_video_frame_render_cost : ");
                    VAG vag7 = this.LJLJJI;
                    LIZ15.append(vag7.LJIILL - vag7.LIZ);
                    X1D.LIZIZ(LIZ15);
                    C46496IMq.LIZJ();
                }
            }
            LJJI("live_client_monitor_log", LJI);
            long j3 = this.LLLLII;
            if (j3 > 0) {
                this.LLLLII = j3 + 1;
            }
            StringBuilder LIZ16 = X1D.LIZ();
            LIZ16.append("1.0:");
            LIZ16.append(this.LLLJL);
            this.LLJJJJ = X1D.LIZIZ(LIZ16);
            VAG vag8 = this.LJLJJI;
            long j4 = vag8.LLFF;
            vag8.LLFFF = j4;
            vag8.LLFII = j4;
            VAG vag9 = this.o2;
            if (vag9 == null) {
                return;
            }
            vag9.LLFFF = j4;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJIII(String str) {
        JSONObject LJFF;
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("skip_duraion")) {
                this.LLJ += jSONObject.optInt("skip_duraion", 0);
            }
            if (jSONObject.has("skip_audio_time")) {
                this.LLJI += jSONObject.optInt("skip_audio_time", 0);
            }
            if (jSONObject.has("skip_video_time")) {
                this.LLJIJIL += jSONObject.optInt("skip_video_time", 0);
            }
            if (jSONObject.has("av_skip_end_diff")) {
                jSONObject.optInt("av_skip_end_diff", 0);
            }
            if (jSONObject.has("av_skip_end_pts_diff")) {
                jSONObject.optInt("av_skip_end_pts_diff", 0);
            }
            this.LLJILJIL++;
            if (this.LJLJJL != null && this.LLJILJILJ != 0 && (LJFF = LJFF()) != null) {
                LJFF.put("event_key", "skip_data_info");
                LJJLIIIIJ(LJFF, jSONObject);
                LJJI("live_client_monitor_log", LJFF);
                long j = this.LLLLII;
                if (j > 0) {
                    this.LLLLII = j + 1;
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJIIJ(String str) {
        t tVar = this.LJLJJL;
        if (tVar == null) {
            return;
        }
        tVar.N(this.LJLJJI, 2);
        JSONObject LJFF = LJFF();
        if (LJFF != null) {
            try {
                LJFF.put("event_key", "illegal_call").put("api_name", str);
                LJJJZ(LJFF);
                LJJI("live_client_monitor_log", LJFF);
                long j = this.LLLLII;
                if (j > 0) {
                    this.LLLLII = j + 1;
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJJIIJZLJL(boolean z) {
        String str;
        int i;
        int i2;
        if (this.i == 1) {
            VAW vaw = VBB.LIZ;
            if (z) {
                i2 = 8013;
            } else {
                i2 = 8014;
            }
            String str2 = this.LLLFZ;
            vaw.getClass();
            VAW.LIZLLL(i2, -1, str2);
        }
        if (this.l == 1) {
            LiveIOWrapper liveIOWrapper = LiveIOWrapper.getInstance();
            if (z) {
                i = 1008;
            } else {
                i = 1009;
            }
            liveIOWrapper.setInt64ValueByStrKey(i, this.LJLJJL.f107v5, -1L);
        }
        JSONObject LJFF = LJFF();
        if (LJFF != null) {
            try {
                JSONObject put = LJFF.put("event_key", "link");
                if (z) {
                    str = "start";
                } else {
                    str = "end";
                }
                put.put("info", str);
                LJJI("live_client_monitor_log", LJFF);
                long j = this.LLLLII;
                if (j > 0) {
                    this.LLLLII = j + 1;
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[Catch: JSONException -> 0x00de, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00de, blocks: (B:14:0x002b, B:16:0x0033, B:21:0x0040, B:24:0x0055, B:27:0x0060, B:29:0x00a0, B:32:0x00a8, B:36:0x00c4, B:38:0x00ca, B:39:0x00cd, B:41:0x00d8, B:46:0x00b8, B:47:0x00c0), top: B:13:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[Catch: JSONException -> 0x00de, TRY_ENTER, TryCatch #0 {JSONException -> 0x00de, blocks: (B:14:0x002b, B:16:0x0033, B:21:0x0040, B:24:0x0055, B:27:0x0060, B:29:0x00a0, B:32:0x00a8, B:36:0x00c4, B:38:0x00ca, B:39:0x00cd, B:41:0x00d8, B:46:0x00b8, B:47:0x00c0), top: B:13:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(int r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAD.LJJIJIIJI(int):void");
    }

    public final void LJJIJIL(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        if (str != null) {
            double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("streamid")) {
                    i4 = jSONObject.optInt("streamid");
                } else {
                    i4 = -1;
                }
                try {
                    if (jSONObject.has("start")) {
                        i3 = jSONObject.optInt("start");
                    } else {
                        i3 = -1;
                    }
                    try {
                        if (jSONObject.has("end")) {
                            i2 = jSONObject.optInt("end");
                        } else {
                            i2 = -1;
                        }
                        try {
                            if (jSONObject.has("drop_per")) {
                                d = jSONObject.optDouble("drop_per", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                            }
                            if (jSONObject.has("type")) {
                                i = jSONObject.optInt("type", 0);
                            } else {
                                i = -1;
                            }
                        } catch (JSONException e) {
                            e = e;
                            i = -1;
                        }
                        try {
                            if (jSONObject.has("c_drop_use_max_time")) {
                                this.X2 = jSONObject.optInt("c_drop_use_max_time", 0);
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            C16880lQ.LLLLIIL(e);
                            if (i4 != -1) {
                                return;
                            } else {
                                return;
                            }
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        i = -1;
                        i2 = -1;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    i = -1;
                    i2 = -1;
                    i3 = -1;
                }
            } catch (JSONException e5) {
                e = e5;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
            }
            if (i4 != -1 || i3 == -1 || i2 == -1 || (i5 = i2 - i3) < 0) {
                return;
            }
            if (this.LLLJIL) {
                j = System.currentTimeMillis() - this.LLLJL;
            } else {
                j = 0;
            }
            if (i == 0) {
                this.W2++;
            } else if (i == 1) {
                this.V2++;
            }
            if (i4 == 9) {
                this.T2++;
                this.P2++;
                long j2 = i5;
                this.U2 += j2;
                this.Q2 += j2;
                if (this.LJLZ) {
                    this.i3++;
                    this.m3++;
                    this.j3 += j2;
                    this.n3 += j2;
                }
                if (!this.LLLJIL) {
                    this.r3 += j2;
                    if (this.H.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                        this.H = KMP.LJ("-1:", i5);
                        return;
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        this.H = C40084FoG.LIZ(LIZ, this.H, ",-1:", i5, LIZ);
                        return;
                    }
                }
                int i6 = this.f94o3;
                if (i6 != -1 && j < i6) {
                    this.t3 += j2;
                }
                int i7 = this.p3;
                if (i7 != -1 && j < i7) {
                    this.u3 += j2;
                }
                int i8 = this.q3;
                if (i8 != -1 && j < i8) {
                    this.v3 += j2;
                }
                System.currentTimeMillis();
                if (this.H.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(i);
                    LIZ2.append(":");
                    C48339Iy7.LIZLLL(i3, this.LJLJJI.LJJLIIIJ, LIZ2, ":");
                    LIZ2.append(i2 - this.LJLJJI.LJJLIIIJ);
                    LIZ2.append(":");
                    LIZ2.append(d);
                    this.H = X1D.LIZIZ(LIZ2);
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                C0EH.LIZLLL(LIZ3, this.H, ",", i, ":");
                C48339Iy7.LIZLLL(i3, this.LJLJJI.LJJLIIIJ, LIZ3, ":");
                LIZ3.append(i2 - this.LJLJJI.LJJLIIIJ);
                LIZ3.append(":");
                LIZ3.append(d);
                this.H = X1D.LIZIZ(LIZ3);
                return;
            }
            if (i4 != 8) {
                return;
            }
            this.R2++;
            this.N2++;
            long j3 = i5;
            this.S2 += j3;
            this.O2 += j3;
            if (this.LJLZ) {
                this.g3++;
                this.k3++;
                this.h3 += j3;
                this.l3 += j3;
            }
            if (!this.LLLJIL) {
                this.s3 += j3;
                if (this.G.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                    this.G = KMP.LJ("-1:", i5);
                    return;
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    this.G = C40084FoG.LIZ(LIZ4, this.G, ",-1:", i5, LIZ4);
                    return;
                }
            }
            int i9 = this.f94o3;
            if (i9 != -1 && j < i9) {
                this.w3 += j3;
            }
            int i10 = this.p3;
            if (i10 != -1 && j < i10) {
                this.x3 += j3;
            }
            int i11 = this.q3;
            if (i11 != -1 && j < i11) {
                this.y3 += j3;
            }
            System.currentTimeMillis();
            if (this.G.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(i);
                LIZ5.append(":");
                C48339Iy7.LIZLLL(i3, this.LJLJJI.LJJLIIIJJI, LIZ5, ":");
                LIZ5.append(i2 - this.LJLJJI.LJJLIIIJJI);
                LIZ5.append(":");
                LIZ5.append(d);
                this.G = X1D.LIZIZ(LIZ5);
                return;
            }
            StringBuilder LIZ6 = X1D.LIZ();
            V1I.LIZLLL(LIZ6, this.G, i, ":");
            C48339Iy7.LIZLLL(i3, this.LJLJJI.LJJLIIIJJI, LIZ6, ":");
            LIZ6.append(i2 - this.LJLJJI.LJJLIIIJJI);
            LIZ6.append(":");
            LIZ6.append(d);
            this.G = X1D.LIZIZ(LIZ6);
        }
    }

    public final void LJJIJL(String str) {
        if (this.LJLJJL == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null) {
                jSONObject.put("product_line", "rts");
                jSONObject.put("rtc_trace_info", str);
                if (!str.isEmpty() && str.contains("rts_play_stop")) {
                    this.W1 = new JSONObject(str).optString("event_message");
                }
            }
            LJJI("live_webrtc_monitor_log", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJIL(int i) {
        this.LLLZZ++;
        this.LLLZZIL++;
        this.LJLJJL.N(this.LJLJJI, 2);
        JSONObject LJFF = LJFF();
        LIZJ();
        if (LJFF != null) {
            try {
                LJFF.put("event_key", "retry").put("reason", this.LLLLIIIILLL).put("code", i).put("socket_err_code", this.LJLJJI.LLJ).put("socket_err_type", this.LJLJJI.LLIZLLLIL).put("render_fail_type", this.LLLLIIL);
                LJJJZ(LJFF);
                LJJI("live_client_monitor_log", LJFF);
                long j = this.LLLLII;
                if (j > 0) {
                    this.LLLLII = j + 1;
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c A[Catch: JSONException -> 0x0082, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0082, blocks: (B:4:0x000e, B:7:0x0030, B:9:0x0060, B:13:0x006c, B:15:0x007c), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(X.C48315Ixj r6) {
        /*
            r5 = this;
            ccb.t r2 = r5.LJLJJL
            X.VAG r1 = r5.LJLJJI
            r0 = 2
            r2.N(r1, r0)
            org.json.JSONObject r3 = r5.LJFF()
            if (r3 == 0) goto L86
            java.lang.String r1 = "event_key"
            java.lang.String r0 = "prepare_result"
            org.json.JSONObject r2 = r3.put(r1, r0)     // Catch: org.json.JSONException -> L82
            java.lang.String r1 = "error_msg"
            java.lang.String r0 = r6.getInfoJSON()     // Catch: org.json.JSONException -> L82
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> L82
            java.lang.String r1 = "result"
            int r0 = r6.code     // Catch: org.json.JSONException -> L82
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> L82
            java.lang.String r1 = "sdk_params"
            java.lang.String r0 = r5.LJZI     // Catch: org.json.JSONException -> L82
            if (r0 != 0) goto L30
            java.lang.String r0 = "none"
        L30:
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> L82
            java.lang.String r1 = "stream_type"
            X.VAG r0 = r5.LJLJJI     // Catch: org.json.JSONException -> L82
            int r0 = r0.LLLILZJ     // Catch: org.json.JSONException -> L82
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> L82
            java.lang.String r1 = "suggest_format"
            java.lang.String r0 = r5.f0     // Catch: org.json.JSONException -> L82
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> L82
            java.lang.String r1 = "suggest_protocol"
            java.lang.String r0 = r5.h0     // Catch: org.json.JSONException -> L82
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> L82
            java.lang.String r1 = "suggest_access_code"
            java.lang.String r0 = r5.m0     // Catch: org.json.JSONException -> L82
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch: org.json.JSONException -> L82
            java.lang.String r1 = "nnsr_enabled"
            ccb.t r0 = r5.LJLJJL     // Catch: org.json.JSONException -> L82
            boolean r0 = r0.f0()     // Catch: org.json.JSONException -> L82
            if (r0 != 0) goto L6b
            ccb.t r0 = r5.LJLJJL     // Catch: org.json.JSONException -> L82
            boolean r0 = r0.j0()     // Catch: org.json.JSONException -> L82
            if (r0 == 0) goto L69
            goto L6b
        L69:
            r0 = 0
            goto L6c
        L6b:
            r0 = 1
        L6c:
            r2.put(r1, r0)     // Catch: org.json.JSONException -> L82
            java.lang.String r0 = "live_client_monitor_log"
            r5.LJJI(r0, r3)     // Catch: org.json.JSONException -> L82
            long r3 = r5.LLLLII     // Catch: org.json.JSONException -> L82
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L86
            r0 = 1
            long r3 = r3 + r0
            r5.LLLLII = r3     // Catch: org.json.JSONException -> L82
            goto L86
        L82:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAD.LJJJI(X.Ixj):void");
    }

    public final void LJJJJI(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_time", this.O4);
            jSONObject.put("duration", System.currentTimeMillis() - this.O4);
            jSONObject.put("average_db", i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("silence end: ");
            LIZ.append(jSONObject);
            X1D.LIZIZ(LIZ);
            C46496IMq.LIZ();
            JSONObject jSONObject2 = this.P4;
            if (jSONObject2 != null) {
                jSONObject2.put(String.valueOf(this.N4), jSONObject);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJJJIZL(int i) {
        if (this.LLLLIIIILLL == -100015) {
            this.LLLLIIIILLL = 0;
        }
        if (!this.LLLLLZIL) {
            return;
        }
        this.LLLLLZIL = false;
        this.LJLJJL.N(this.LJLJJI, 6);
        JSONObject LJFF = LJFF();
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(Long.valueOf(this.x));
        this.w.add(Long.valueOf(-(System.currentTimeMillis() - this.LJLJJI.LIZ)));
        if (this.LLLZ == 0) {
            this.LLLZ = System.currentTimeMillis();
        }
        if (this.n2 == 1 && this.B2 == 0) {
            this.B2 = System.currentTimeMillis();
        }
        if (LJFF != null && this.LLLLIILL != 0) {
            try {
                if (this.LLLLIILLL != 0) {
                    this.LLLLLZL++;
                    this.LLLLZ = (int) ((System.currentTimeMillis() - this.LLLLIILLL) + this.LLLLZ);
                    if (this.LJLZ) {
                        this.LLLLLL++;
                        this.LLLLLLIL = (int) ((System.currentTimeMillis() - this.LLLLIILLL) + this.LLLLLLIL);
                    }
                }
                this.LLLLILI++;
                this.LLLLJ = (System.currentTimeMillis() - this.LLLLIILL) + this.LLLLJ;
                this.d4 = (System.currentTimeMillis() - this.LLLLIILL) + this.d4;
                if (this.LLLLILI >= this.LLLILZ) {
                    if (this.LLLJL != 0) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(this.LLLIIIL);
                        LIZ.append(",[play_time:");
                        LIZ.append(System.currentTimeMillis() - this.LLLJL);
                        LIZ.append(", behavior:");
                        LIZ.append(-3);
                        LIZ.append("]");
                        this.LLLIIIL = X1D.LIZIZ(LIZ);
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(this.LLLIIIL);
                        LIZ2.append(",[no_first_frame, behavior:");
                        LIZ2.append(-3);
                        LIZ2.append("]");
                        this.LLLIIIL = X1D.LIZIZ(LIZ2);
                    }
                    this.LLLILZ += t.Z8;
                }
                if (this.LLLLJ >= this.LLLILZJ) {
                    if (this.LLLJL != 0) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(this.LLLIIIL);
                        LIZ3.append(",[play_time:");
                        LIZ3.append(System.currentTimeMillis() - this.LLLJL);
                        LIZ3.append(", behavior:");
                        LIZ3.append(-3);
                        LIZ3.append("]");
                        this.LLLIIIL = X1D.LIZIZ(LIZ3);
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(this.LLLIIIL);
                        LIZ4.append(",[no_first_frame, behavior:");
                        LIZ4.append(-3);
                        LIZ4.append("]");
                        this.LLLIIIL = X1D.LIZIZ(LIZ4);
                    }
                    this.LLLILZJ += t.Y8;
                }
                if (this.LJLZ) {
                    this.LLLLL++;
                    this.LLLLJI = (System.currentTimeMillis() - this.LLLLIILL) + this.LLLLJI;
                }
                if (this.n2 == 1) {
                    this.u2++;
                    this.v2 = (System.currentTimeMillis() - this.LLLLIILL) + this.v2;
                }
                this.T0++;
                this.U0 = (System.currentTimeMillis() - this.LLLLIILL) + this.U0;
                LJFF.put("event_key", "stall").put("stall_start", this.LLLLIILL).put("stall_end", System.currentTimeMillis()).put("video_buffer_time_stall_start", this.LJLJJI.LLJJJ).put("audio_buffer_time_stall_start", this.LJLJJI.LLJJJIL).put("video_buffer_time_stall_end", this.LJLJJI.LLJJJJ).put("audio_buffer_time_stall_end", this.LJLJJI.LLJJJJJIL).put("last_res", this.J0).put("stall_start_sub_scene", this.R5).put("stall_start_ver", this.S5).put("reason", this.LLLLIL).put("recover_reason", i);
                LJJI("live_client_monitor_log", LJFF);
                long j = this.LLLLII;
                if (j > 0) {
                    this.LLLLII = j + 1;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("PLAY-StallTime", LJFF.optLong("stall_end") - this.LLLLIILL).put("event_key", "stall");
                jSONObject.put("PLAY-SessionID", this.LLLI);
                t tVar = this.LJLJJL;
                if (tVar != null && tVar.y2 == 1) {
                    LiveStrategyManager.inst().setEventInfo(62, jSONObject);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJJJJLL(String str) {
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("sdk_version")) {
                this.LJZL = JSONObjectProtectorUtils.getString(jSONObject, "sdk_version");
            }
            if (jSONObject.has("platform")) {
                this.LL = JSONObjectProtectorUtils.getString(jSONObject, "platform");
            }
            if (jSONObject.has("os_version")) {
                this.LLD = JSONObjectProtectorUtils.getString(jSONObject, "os_version");
            }
            if (jSONObject.has("model")) {
                this.LLF = JSONObjectProtectorUtils.getString(jSONObject, "model");
            }
            if (jSONObject.has("start_time")) {
                this.LLFF = JSONObjectProtectorUtils.getString(jSONObject, "start_time");
            }
            if (jSONObject.has("is_hardware_encode")) {
                this.LLFFF = JSONObjectProtectorUtils.getInt(jSONObject, "is_hardware_encode");
            }
            if (jSONObject.has("min_bitrate")) {
                this.LLFII = JSONObjectProtectorUtils.getInt(jSONObject, "min_bitrate");
            }
            if (jSONObject.has("max_bitrate")) {
                this.LLFZ = JSONObjectProtectorUtils.getInt(jSONObject, "max_bitrate");
            }
            if (jSONObject.has("default_bitrate")) {
                this.LLI = JSONObjectProtectorUtils.getInt(jSONObject, "default_bitrate");
            }
            if (jSONObject.has("hit_node_optimize")) {
                this.LLIFFJFJJ = JSONObjectProtectorUtils.getInt(jSONObject, "hit_node_optimize");
            }
            if (jSONObject.has("push_protocol")) {
                this.LLII = JSONObjectProtectorUtils.getString(jSONObject, "push_protocol");
            }
            if (jSONObject.has("qId")) {
                this.LLIIII = JSONObjectProtectorUtils.getString(jSONObject, "qId");
            }
            if (jSONObject.has("link_info")) {
                this.LLIIIILZ = JSONObjectProtectorUtils.getString(jSONObject, "link_info");
            }
            if (jSONObject.has("h_id")) {
                this.k2 = JSONObjectProtectorUtils.getInt(jSONObject, "h_id");
            }
            if (jSONObject.has("s_id")) {
                this.l2 = JSONObjectProtectorUtils.getInt(jSONObject, "s_id");
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJJJZ(JSONObject jSONObject) {
        long j;
        OUT out;
        try {
            if (this.X4 == 1) {
                if (!this.Z4.isEmpty()) {
                    if (jSONObject.has("source") || this.Y4 == 1) {
                        if (!this.Z4.containsKey(jSONObject.optString("source", ""))) {
                            if (this.Y4 == 1) {
                                return;
                            } else {
                                C46496IMq.LIZJ();
                            }
                        } else {
                            C46496IMq.LIZJ();
                            this.Y4 = 1;
                        }
                    } else {
                        C46496IMq.LIZJ();
                    }
                } else {
                    C46496IMq.LIZJ();
                }
            }
            if (jSONObject.has("ts")) {
                long j2 = JSONObjectProtectorUtils.getLong(jSONObject, "ts");
                long j3 = 0;
                if (this.g != 1 || !jSONObject.has("tt_ntp") || JSONObjectProtectorUtils.getInt(jSONObject, "tt_ntp") != 1) {
                    if (this.d && !jSONObject.has("tt_ntp")) {
                        OUT out2 = this.LLZZZZ;
                        if (out2 != null) {
                            out2.LIZIZ.removeCallbacksAndMessages(null);
                        }
                        this.d = false;
                    }
                    this.a = false;
                    j = 0;
                } else {
                    if (!this.d && (out = this.LLZZZZ) != null) {
                        out.LIZ(103);
                        this.d = true;
                    }
                    j = this.h;
                    this.a = true;
                }
                if (jSONObject.has("ntp_diff")) {
                    this.b = jSONObject.optInt("ntp_diff", 0);
                }
                if (this.f == 1 && jSONObject.has("tt_ntp") && JSONObjectProtectorUtils.getInt(jSONObject, "tt_ntp") == 1) {
                    t tVar = this.LJLJJL;
                    if (tVar != null) {
                        TMJ tmj = tVar.LJLJLJ;
                        if (tmj != null) {
                            j3 = ((Long) ((TMC) tmj).LJIJJLI(0L, "time_diff_server_and_client")).longValue();
                        }
                        this.h = j3;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("ntp_time_diff:");
                        LIZ.append(this.h);
                        X1D.LIZIZ(LIZ);
                        C46496IMq.LIZ();
                    }
                    j = this.h;
                    this.a = true;
                }
                this.LJLJJI.LLFF = (System.currentTimeMillis() - j2) + j;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("sei_delay: ");
                LIZ2.append(this.LJLJJI.LLFF);
                X1D.LIZIZ(LIZ2);
                C46496IMq.LIZJ();
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJJLZIJ(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        if (TextUtils.equals(this.LLLIIII, "cmaf")) {
            String str4 = "";
            if (TextUtils.isEmpty(this.LJLJJI.LJJIJIIJI)) {
                str = "";
            } else {
                str = this.LJLJJI.LJJIJIIJI;
            }
            jSONObject.put("cmaf_video_request_log", str);
            if (TextUtils.isEmpty(this.LJLJJI.LJJIJIIJIL)) {
                str2 = "";
            } else {
                str2 = this.LJLJJI.LJJIJIIJIL;
            }
            jSONObject.put("cmaf_audio_request_log", str2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cmaf_video_request_log = ");
            LIZ.append(this.LJLJJI.LJJIJIIJI);
            LIZ.append("\tcmaf_audio_request_log = ");
            C64504PTg.LIZLLL(LIZ, this.LJLJJI.LJJIJIIJIL, LIZ);
            if (TextUtils.isEmpty(this.LJLJJI.LJJIJIL)) {
                str3 = "";
            } else {
                str3 = this.LJLJJI.LJJIJIL;
            }
            jSONObject.put("cmaf_video_req_no_series", str3);
            if (!TextUtils.isEmpty(this.LJLJJI.LJJIJL)) {
                str4 = this.LJLJJI.LJJIJL;
            }
            jSONObject.put("cmaf_audio_req_no_series", str4);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cmaf_video_req_no_series = ");
            LIZ2.append(this.LJLJJI.LJJIJIL);
            LIZ2.append("\tcmaf_audio_req_no_series = ");
            C64504PTg.LIZLLL(LIZ2, this.LJLJJI.LJJIJL, LIZ2);
        }
    }

    public final void LJJJZ(JSONObject jSONObject) {
        if (TextUtils.equals(this.g0, "quic") || TextUtils.equals(this.g0, "quicu")) {
            jSONObject.put("quic_open_result", this.LJLJJI.LLJILJIL);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("quic_open_result = ");
            UFE.LIZLLL(LIZ, this.LJLJJI.LLJILJIL, LIZ);
        }
    }

    public final void LJJL(boolean z) {
        this.LJLLILLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LJLLJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LJLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LJLLLL = false;
        this.LJZ = 0L;
        this.LJZL = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LL = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLD = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLF = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLFF = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLFFF = -1;
        this.LLFII = -1;
        this.LLFZ = -1;
        this.LLI = -1;
        this.LLIFFJFJJ = -1;
        this.LLII = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLIIII = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLIIIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLIIL = false;
        this.LLIIJI = -1;
        this.LLIIJLIL = -1;
        this.LLIILII = false;
        this.LLIILZL = false;
        this.c1 = false;
        this.s = -1;
        this.LLILL = 1;
        this.LLILLIZIL = false;
        this.LLILLJJLI = 0;
        this.LLILZ = -1;
        this.LLILLL = -1;
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        this.LLIZ = -1;
        this.LLIZLLLIL = 0;
        this.LLJ = 0;
        this.LLJI = 0;
        this.LLJIJIL = 0;
        this.LLJILJIL = 0;
        this.LLJILJILJ = 0;
        this.LLJILLL = -1.0f;
        this.LLJJ = -1;
        this.LLJJI = -1.0f;
        this.LLJJJIL = 0;
        this.LLJJJJ = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLJJJJLIIL = 0L;
        this.LLLFF = -1;
        this.LLJJLIIIJLLLLLLLZ = 0;
        this.LLJJL = 2000L;
        this.LLJL = -1;
        this.LLJLIL = 0;
        this.LLJLILLLLZIIL = 0;
        this.LLJLL = 0;
        this.LLJLLIL = 0;
        this.LLJZ = 0;
        this.M = -1;
        this.L = 0;
        this.N = 0;
        this.O = 1;
        this.P = 0;
        this.LLLJIL = false;
        this.LLLJL = 0L;
        this.y5 = 0L;
        this.B5 = 0L;
        this.LLLLIIIILLL = 0;
        this.LLLLIILL = 0L;
        this.LLLLIL = -1L;
        this.LLLLILI = 0L;
        this.LLLLJ = 0L;
        this.LLLLLLZ = 0L;
        this.LLLLLLLZIL = 0L;
        this.LLLLLZ = 0L;
        this.LLLLLLZZ = 0L;
        this.LLZLLLL = 0L;
        this.LLZZ = 0L;
        this.LLZLL = false;
        this.LLLLLZIL = false;
        this.LLLLLZL = 0;
        this.LLLLZ = 0;
        this.LLLLZLL = 0;
        this.LLLLZLLIL = 0;
        this.LLLLZI = 0;
        this.LLLLZIL = 0;
        this.LLLLIILLL = 0L;
        this.LLLLZLLLI = 0L;
        this.LLLZ = 0L;
        this.LLLZI = 0L;
        this.LLLZIIL = 0L;
        this.LLLZIL = 0L;
        this.LLLZL = 0L;
        this.LLLZLL = 0L;
        this.LLLZLZ = 0;
        this.LLLZZ = 0;
        this.LLLZZIL = 0;
        this.j0 = 0;
        this.k0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLZIL = -1;
        this.a = false;
        this.b = 0;
        this.h = 0L;
        this.f = 0;
        this.g = 0;
        this.q = 0;
        this.r = 0;
        this.S = -1;
        this.a0 = false;
        this.Z = 0;
        this.c0 = false;
        this.d0 = -1.0f;
        this.e0 = 0L;
        this.m2 = 0L;
        this.t = null;
        this.u = null;
        this.v = null;
        this.B = null;
        this.C = null;
        this.A = null;
        this.w = null;
        this.x = -1L;
        this.LLJJJJJIL = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.y = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.z = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.F = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.E = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.D = null;
        VAG vag = this.LJLJJI;
        if (vag != null) {
            vag.LIZ();
        }
        this.LLILII = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLIIZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.V = 1;
        this.LLILIL = 0;
        this.LLLFFI = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLLFZ = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLLI = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.x0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.y0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.z0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.w4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLLIIIIL = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.LLLIIIL = "";
        this.LLLIIL = 0;
        this.LLLIILIL = 0L;
        this.LLLIL = 0L;
        this.LLLILZ = 2L;
        this.LLLILZJ = 3000L;
        this.u0 = 0;
        this.j = 0;
        this.i = 0;
        this.k = 0;
        this.m = -1;
        this.e1 = 0L;
        this.d1 = 0L;
        this.f1 = 0L;
        this.l5 = 0L;
        this.k5 = 0L;
        this.m5 = 0L;
        this.n5 = 0L;
        this.A0 = false;
        this.C0 = false;
        this.B0 = "rad";
        this.D0 = "origin";
        this.I0 = "origin";
        this.J0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.L0 = -1;
        this.K0 = -1L;
        this.M0 = 0;
        this.N0 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.a1 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.W0 = -1L;
        this.X0 = -1L;
        this.Y0 = -1L;
        this.Z0 = -1L;
        this.b1 = 4;
        this.O0 = false;
        this.P0 = -1;
        this.m1 = -1;
        this.o1 = -1;
        this.n1 = -1;
        this.p1 = -1;
        this.q1 = -1;
        this.r1 = -1;
        this.s1 = -1;
        this.t1 = -1;
        this.i1 = 0;
        this.j1 = 0L;
        this.k1 = 0L;
        this.l1 = -1L;
        this.u1 = 0;
        this.v1 = 0;
        this.g4 = 0;
        this.h4 = 0;
        this.i4 = 0;
        this.k4 = 0;
        this.j4 = 0;
        this.l4 = 0;
        this.m4 = 0L;
        this.o4 = 0;
        this.p4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.q4 = 0;
        this.r4 = 0;
        this.s4 = 0;
        this.t4 = 0;
        this.LLJZIJLIL = 0;
        this.LLL = -1;
        this.LLLF = -1.0f;
        this.n4 = 0;
        this.w1 = null;
        this.F1 = 0;
        this.R1 = 0L;
        this.T1 = 0L;
        this.S1 = 0L;
        this.V1 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.W1 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.e2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.f2 = null;
        this.g2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.j2 = 0;
        this.k2 = -1;
        this.l2 = -1;
        this.n2 = 0;
        this.t2 = 0;
        this.F2 = 0L;
        this.G2 = 0L;
        this.H2 = 0L;
        this.I2 = 0L;
        this.J2 = 0L;
        this.K2 = 0L;
        this.L2 = 0L;
        this.M2 = 0L;
        this.Q3 = 0;
        this.R3 = 0;
        this.S3 = 0L;
        this.T3 = 0L;
        this.X3 = "";
        this.W3 = "";
        this.l = 0;
        this.D3 = 0;
        this.E3 = 0;
        this.F3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.G3 = 0L;
        this.H3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.I3 = 0;
        this.J3 = 0L;
        this.K3 = 0;
        this.f93n = 0;
        this.M3 = 0;
        this.N3 = 0;
        this.L3 = 0;
        this.Z3 = 0;
        this.a4 = 0;
        this.b4 = -1;
        this.LLLLJI = 0L;
        this.LLLLL = 0L;
        this.LLLLLIL = 0L;
        this.LLLLLILLIL = 0L;
        this.LLLLLJIL = 0L;
        this.LLLLLJLJLL = 0L;
        this.LLLLLLIL = 0;
        this.LLLLLL = 0;
        this.LLLLLLL = 0;
        this.LLLLLLJ = 0;
        this.LLLLLLLLL = 0;
        this.LLLLLLLLLL = 0;
        this.Y2 = 0L;
        this.Z2 = 0L;
        this.a3 = 0L;
        this.b3 = 0L;
        this.c3 = 0L;
        this.d3 = 0L;
        this.e3 = 0L;
        this.f3 = 0L;
        this.z3 = 0L;
        this.A3 = 0L;
        this.B3 = 0L;
        this.O2 = 0L;
        this.Q2 = 0L;
        this.N2 = 0L;
        this.P2 = 0L;
        this.l3 = 0L;
        this.n3 = 0L;
        this.k3 = 0L;
        this.m3 = 0L;
        this.f94o3 = -1;
        this.p3 = -1;
        this.q3 = -1;
        this.r3 = 0L;
        this.s3 = 0L;
        this.t3 = 0L;
        this.u3 = 0L;
        this.v3 = 0L;
        this.w3 = 0L;
        this.x3 = 0L;
        this.y3 = 0L;
        this.g3 = 0L;
        this.i3 = 0L;
        this.h3 = 0L;
        this.j3 = 0L;
        this.V2 = 0L;
        this.W2 = 0L;
        this.X2 = 0L;
        this.f4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.u4 = 0;
        this.v4 = 0;
        this.z4 = null;
        this.A4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.B4 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.s0 = -1;
        this.C4 = 0;
        this.E4 = 0L;
        this.F4 = 0L;
        this.I4 = 0;
        this.J4 = 0;
        this.K4 = 0;
        this.P4 = null;
        this.Q4 = null;
        this.R4 = null;
        this.S4 = null;
        this.T4 = null;
        this.U4 = null;
        this.V4 = null;
        this.W4 = null;
        this.X4 = 0;
        this.Z4 = null;
        this.Y4 = -1;
        this.b5 = -1L;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.c5 = 0;
        this.d5 = -1;
        this.e5 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.f5 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        this.j5 = 0;
        this.i5 = 0;
        this.o5 = 0;
        this.u5 = 0;
        this.f95v5 = 0;
        this.w5 = 0;
        if (z) {
            this.U1 = 0;
            this.K1 = 0;
        }
        this.D5 = -1;
        this.E5 = -1L;
        this.F5 = -1L;
        this.b0 = false;
        this.x5 = -1.0f;
    }

    public final void LJJLIIIJILLIZJL(long j) {
        VAG vag = this.LJLJJI;
        if (vag != null) {
            vag.LLD = j;
        }
        VAG vag2 = this.o2;
        if (vag2 != null) {
            vag2.LLD = j;
        }
    }

    public final void LJJLIIIJJIZ(int i) {
        VAG vag;
        t tVar = this.LJLJJL;
        if (tVar == null || this.LJLJI == null || (vag = this.LJLJJI) == null) {
            return;
        }
        if (i == 1) {
            this.I5 = vag.LJJZZIII;
            this.J5 = vag.LJLJJLL;
            this.K5 = vag.LJJZZI;
            this.L5 = vag.LJLJLJ;
            this.k1 = vag.LJLJL;
        }
        tVar.N(vag, i);
    }

    public final void LJJLIIIJL(JSONObject jSONObject) {
        if (jSONObject.has("event_message")) {
            String optString = jSONObject.optString("event_message");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("eventMessage:");
            LIZ.append(optString);
            X1D.LIZIZ(LIZ);
            C46496IMq.LIZJ();
            if (TextUtils.isEmpty(optString) || !jSONObject.has("phase_timestamp")) {
                return;
            }
            if (TextUtils.equals("dns resolved", optString)) {
                if (jSONObject.has("request_ip")) {
                    String optString2 = jSONObject.optString("request_ip");
                    if (!optString2.equals(this.O1)) {
                        this.LJLLL = optString2;
                        this.P1 = 0;
                    } else {
                        this.P1 = 1;
                    }
                }
                this.Q1 = CastLongProtector.parseLong(jSONObject.optString("phase_timestamp"));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("mRtcDnsTimeStamp:");
                LIZ2.append(this.Q1);
                X1D.LIZIZ(LIZ2);
                C46496IMq.LIZJ();
                return;
            }
            if (TextUtils.equals("tcp connected", optString) || TextUtils.equals("quic connected", optString) || TextUtils.equals("send request", optString)) {
                this.R1 = CastLongProtector.parseLong(jSONObject.optString("phase_timestamp"));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("mRtcTcpConnectTimeStamp:");
                LIZ3.append(this.R1);
                X1D.LIZIZ(LIZ3);
                C46496IMq.LIZJ();
                return;
            }
            if (TextUtils.equals("tls handshaked", optString)) {
                this.S1 = CastLongProtector.parseLong(jSONObject.optString("phase_timestamp"));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("mRtcTlsHandshakedTimeStamp:");
                LIZ4.append(this.S1);
                X1D.LIZIZ(LIZ4);
                C46496IMq.LIZJ();
                return;
            }
            if (!TextUtils.equals("response received", optString) && !TextUtils.equals("remote answer got", optString)) {
                return;
            }
            this.T1 = CastLongProtector.parseLong(jSONObject.optString("phase_timestamp"));
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("mRtcTcpFirstPackageTimeStamp:");
            LIZ5.append(this.T1);
            X1D.LIZIZ(LIZ5);
            C46496IMq.LIZJ();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (101 == i) {
            LJJJLL(false, 0L, 0L, 0L, 0L);
            return true;
        }
        if (102 != i) {
            return true;
        }
        LJJLIIIJLJLI();
        C46496IMq.LIZJ();
        if (!this.LJLJL) {
            return true;
        }
        this.LJLILLLLZI.sendEmptyMessageDelayed(102, 5000L);
        return true;
    }

    public static void LJJLI(String str, JSONObject jSONObject) {
        if (str != null) {
            try {
                LJJLIIIIJ(jSONObject, new JSONObject(str));
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void LJJLIIIIJ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final long LJIIL(int i, long j) {
        t tVar;
        if (i != 0) {
            if (i != 100) {
                if (i != 101) {
                    return j;
                }
                return this.LJLJJI.LJIILL;
            }
            return this.LJLJJI.LLFF;
        }
        int i2 = this.LLFZ;
        if (i2 == -1 && (tVar = this.LJLJJL) != null) {
            C48436Izg c48436Izg = tVar.LJLLL;
            if (c48436Izg != null) {
                return (c48436Izg.getLongOption(63, 0L) * 8) / 1000;
            }
            return j;
        }
        return i2;
    }

    public final void LJIJI(long j, String str) {
        long j2;
        if (this.LJLJJL == null) {
            return;
        }
        try {
            JSONObject LJFF = LJFF();
            VAG vag = new VAG();
            this.LJLJJL.N(vag, 11);
            long j3 = vag.LJFF;
            long j4 = j3 - vag.LIZLLL;
            long j5 = vag.LJIIJ - j3;
            if (this.LJLJJI.LJIILL > 0) {
                j2 = System.currentTimeMillis() - this.LJLJJI.LJIILL;
            } else {
                j2 = 0;
            }
            LJFF.put("event_key", "abr_switch").put("auto_switch", 1).put("target_resoultion", str).put("predict_bitrate", j).put("abr_switch_info", this.a1).put("cur_download_speed", this.W0).put("cur_audio_buffer_time", this.X0).put("cur_video_buffer_time", this.Y0).put("stall_count", this.LLLLILI).put("switch_cost", this.Z0).put("use_expect_bitrate", this.j2).put("tcp_connect_cost", j4).put("tcp_first_package_cost", j5).put("find_stream_info_cost", vag.LLLLLLLZIL).put("request_url", vag.LLLLLLZ).put("prev_video_buffer_time", vag.LJLZ).put("prev_audio_buffer_time", vag.LJZ).put("external_smooth_switch", 0).put("abr_switch_count", this.M0).put("request_cdn_cached", vag.LJJLIL).put("request_time_to_source", vag.LJJLJLI).put("request_time_for_cdn", vag.LJJZ).put("close_io_cost", vag.LLLLLLZZ).put("play_time", j2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("abr switch log: ");
            LIZ.append(LJFF);
            C46496IMq.LIZLLL("LiveLoggerService", X1D.LIZIZ(LIZ));
            this.j2 = 0;
            LJJI("live_client_monitor_log", LJFF);
            long j6 = this.LLLLII;
            if (j6 > 0) {
                this.LLLLII = j6 + 1;
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        if ((r0.intValue() & r5.H5) > 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(java.lang.String r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            X.TMJ r4 = r5.f90J
            r3 = 0
            if (r4 == 0) goto L7
            if (r7 != 0) goto L11
        L7:
            X.Iwz r0 = r5.LJLJI
            if (r0 == 0) goto L10
            X.VBU r0 = (X.VBU) r0
            r0.LIZLLL(r6, r7)
        L10:
            return
        L11:
            boolean r0 = r5.G5     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L2b
            java.lang.String r2 = "live_setting_applog_key"
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L9c
            r0 = r4
            X.TMC r0 = (X.TMC) r0     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r0.LJIJJLI(r1, r2)     // Catch: java.lang.Throwable -> L9c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L9c
            r5.G5 = r0     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L2b
            goto L7
        L2b:
            int r0 = r5.H5     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L43
            java.lang.String r1 = "live_setting_enable_applog_event_key"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L9c
            X.TMC r4 = (X.TMC) r4     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r4.LJIJJLI(r0, r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L9c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L9c
            r5.H5 = r0     // Catch: java.lang.Throwable -> L9c
        L43:
            int r0 = r5.H5     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L48
            goto L67
        L48:
            java.lang.String r0 = "event_key"
            java.lang.Object r1 = r7.get(r0)     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto L7
            boolean r0 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L7
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = X.VAD.T5     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L7
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L9c
            int r0 = r5.H5     // Catch: java.lang.Throwable -> L9c
            r1 = r1 & r0
            if (r1 <= 0) goto L7
        L67:
            X.Usd r3 = r5.LLZZJLIL
            if (r3 == 0) goto L10
            java.util.concurrent.ExecutorService r2 = r3.LIZJ     // Catch: java.lang.Throwable -> L83
            if (r2 == 0) goto L7f
            boolean r0 = r2.isShutdown()     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L7f
            Y.ARunnableS12S1200000_13 r1 = new Y.ARunnableS12S1200000_13     // Catch: java.lang.Throwable -> L83
            r0 = 1
            r1.<init>(r7, r6, r3, r0)     // Catch: java.lang.Throwable -> L83
            r2.submit(r1)     // Catch: java.lang.Throwable -> L83
            goto L10
        L7f:
            r3.LIZIZ(r6, r7)     // Catch: java.lang.Throwable -> L83
            goto L10
        L83:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onMonitorLog common params ex="
            r1.append(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            X.C46496IMq.LIZIZ()
            goto L10
        L9c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "report ex="
            r1.append(r0)
            r1.append(r2)
            X.X1D.LIZIZ(r1)
            X.C46496IMq.LIZIZ()
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAD.LJJI(java.lang.String, org.json.JSONObject):void");
    }

    public final void LJJIJ(String str, String str2) {
        if (this.o2 != null) {
            this.q2 = System.currentTimeMillis();
        }
        this.V0 = System.currentTimeMillis();
        this.LJLJJI.LIZ = System.currentTimeMillis();
        if (this.LJLZ) {
            this.z3 = this.LJLJJI.LIZ;
        }
        this.LJLJJI.LLIILZL = str2;
        this.LJLLILLLL = str;
        this.LJLLJ = str;
        JSONObject LJFF = LJFF();
        this.LLLLII = 0L;
        if (LJFF != null) {
            try {
                LJFF.put("event_key", "start_play").put("rule_ids", this.LLLFFI).put("set_surface_cost", this.W).put("start_play_time", this.LJLJJI.LIZ).put("stream_data", this.f92Y).put("suggest_format", this.f0).put("play_format", this.LLLIIII).put("suggest_protocol", this.h0).put("suggest_access_code", this.m0).put("origin_url", this.l0).put("log_total_count_when_playing", this.LLLLII);
                if (TextUtils.equals(this.g0, "h2") || TextUtils.equals(this.g0, "h2q") || TextUtils.equals(this.g0, "h2qu")) {
                    LJFF.remove("h2_context_start_cost");
                }
                LJJI("live_client_monitor_log", LJFF);
                this.LLLLII++;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("PLAY-SessionID", this.LLLI);
                t tVar = this.LJLJJL;
                if (tVar != null && tVar.y2 == 1) {
                    LiveStrategyManager.inst().setEventInfo(60, jSONObject);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJJIZ(long j, boolean z) {
        String str;
        int i;
        if (j > System.currentTimeMillis() - this.LJLJJI.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("abnormal rtc decode stall time");
            LIZ.append(j);
            X1D.LIZIZ(LIZ);
            C46496IMq.LIZJ();
            return;
        }
        JSONObject LJFF = LJFF();
        if (LJFF != null) {
            try {
                JSONObject put = LJFF.put("event_key", "rtc_decode_stall");
                if (z) {
                    str = "video";
                } else {
                    str = "audio";
                }
                put.put("type", str).put("decode_stall_time", j);
                LJJI("live_client_monitor_log", LJFF);
                long j2 = this.LLLLII;
                if (j2 > 0) {
                    this.LLLLII = j2 + 1;
                }
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    i = 0;
                } else {
                    i = 1;
                }
                jSONObject.put("PLAY-StallType", i).put("PLAY-StallTime", j).put("event_key", "rtc_decode_stall");
                jSONObject.put("PLAY-SessionID", this.LLLI);
                t tVar = this.LJLJJL;
                if (tVar != null && tVar.y2 == 1) {
                    LiveStrategyManager.inst().setEventInfo(62, jSONObject);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJJJ(boolean z, boolean z2) {
        this.LJLJJI.LIZIZ = System.currentTimeMillis();
        VAG vag = this.o2;
        if (vag != null) {
            vag.LIZIZ = System.currentTimeMillis();
        }
        this.G1.LIZIZ = System.currentTimeMillis();
        this.LLIIL = z2;
        this.LLIILZL = z;
    }

    public final void LJJJJJ(int i, boolean z) {
        this.LLLLIIIILLL = -100015;
        if (!z) {
            return;
        }
        this.LJLJJL.N(this.LJLJJI, 5);
        long currentTimeMillis = System.currentTimeMillis();
        this.LLLLIILL = currentTimeMillis;
        if (this.LLLLZLLLI == 0) {
            this.LLLLZLLLI = currentTimeMillis;
        }
        if (this.n2 == 1) {
            if (this.A2 == 0) {
                this.A2 = currentTimeMillis;
            }
            this.D2 = this.LLLLIIIILLL;
        }
        this.LLLLIILLL = currentTimeMillis;
        this.LLLLIL = i;
        this.LLLLLZIL = true;
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        long j = this.LLLLIILL;
        VAG vag = this.LJLJJI;
        this.x = j - vag.LIZ;
        this.R5 = vag.LLIIIILZ;
        this.S5 = vag.LLI;
    }

    public final void LJ(int i, int i2, long j) {
        LinkedBlockingQueue<Long> linkedBlockingQueue;
        long j2;
        int i3;
        JSONObject LJFF;
        if (i < 0 || i2 <= 0 || j < 0 || (linkedBlockingQueue = this.x1) == null) {
            return;
        }
        int i4 = this.y1;
        if (i4 == -1) {
            this.y1 = i;
            this.z1 = j;
            return;
        }
        if (i == i4) {
            return;
        }
        if (linkedBlockingQueue.size() > 0) {
            j2 = this.x1.peek().longValue();
        } else {
            j2 = -1;
        }
        int i5 = 0;
        if (j2 > 0 && j2 <= this.z1) {
            boolean z = false;
            int i6 = 0;
            while (this.x1.size() > 0) {
                long longValue = this.x1.peek().longValue();
                long j3 = this.z1;
                if (longValue == j3) {
                    z = true;
                } else if (!z) {
                    continue;
                    this.x1.poll().longValue();
                }
                if (longValue > j3 && longValue <= j) {
                    i6++;
                    if (longValue == j) {
                        break;
                    }
                }
                this.x1.poll().longValue();
            }
            if (i - this.y1 == 1 && i6 > 0 && i6 != i2) {
                if (i6 < i2) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if (this.LJLJJL != null && (LJFF = LJFF()) != null) {
                    try {
                        LJFF.put("event_key", "stream_abnormal").put("stream_type", "video").put("type", i3).put("sent_frames", i2).put("received_frames", i6);
                        LJJI("live_client_monitor_log", LJFF);
                        long j4 = this.LLLLII;
                        if (j4 > 0) {
                            this.LLLLII = j4 + 1;
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        int i7 = this.y1;
        if (i - i7 != 1) {
            if (i <= i7) {
                i5 = 1;
            }
            LJJJJL(i5, i, i7);
        }
        this.y1 = i;
        this.z1 = j;
    }

    public final JSONObject LJI(VAG vag, boolean z, long j) {
        JSONArray jSONArray;
        long j2;
        boolean z2;
        long j3;
        JSONObject LJFF = LJFF();
        if (LJFF != null) {
            long j4 = vag.LJIILL - vag.LIZ;
            JSONObject put = LJFF.put("event_key", "first_frame").put("total_cost", j4).put("last_retry_end", 0L).put("hit_cache", z ? 1 : 0).put("start", vag.LIZ).put("sdk_dns_analysis_end", vag.LIZIZ).put("prepare_block_end", vag.LIZJ);
            long j5 = vag.LJJ;
            if (j5 <= 0) {
                j5 = vag.LIZLLL;
            }
            JSONObject put2 = put.put("tfo_fall_back_time", j5).put("pre_connect", this.s).put("request_cdn_cached", this.LJLJJI.LJJLIL).put("request_time_to_source", this.LJLJJI.LJJLJLI).put("request_time_for_cdn", this.LJLJJI.LJJZ).put("http_req_finish_time", vag.LJJLIIIJLJLI).put("http_res_finish_time", vag.LJJLIIIJLLLLLLLZ).put("first_video_package_end", vag.LJIIJJI).put("first_audio_package_end", vag.LJIIL).put("first_video_frame_decode_end", vag.LJIILIIL).put("first_audio_frame_decode_end", vag.LJIILJJIL).put("first_frame_from_player_core", vag.LJIIZILJ).put("first_frame_render_end", vag.LJIILL).put("video_param_send_outlet_time", vag.LLIIIJ).put("first_video_frame_send_outlet_time", vag.LLIIIL).put("set_surface_time", this.f91X).put("set_surface_cost", this.W).put("video_render_type", vag.LLIIIZ).put("video_device_open_start", vag.LJIJI).put("video_device_open_end", vag.LJIJJ).put("audio_device_open_start", vag.LJIJJLI).put("audio_device_open_end", vag.LJIL).put("video_device_wait_start", vag.LLIIL).put("video_device_wait_end", vag.LLIILII).put("find_stream_info_start", vag.LLIIJI).put("find_stream_info_end", vag.LLIIJLIL).put("video_first_pkt_pos", vag.LJJLIIIIJ).put("video_first_pkt_pts", vag.LJJLIIIJ).put("audio_first_pkt_pos", vag.LJJLIIIJILLIZJL).put("audio_first_pkt_pts", vag.LJJLIIIJJI).put("video_buffer_time", this.LJLJJI.LJLZ).put("audio_buffer_time", this.LJLJJI.LJZ).put("download_speed", this.LJLJJI.LJLL).put("stall_time", j).put("first_sei_delay", this.LJLJJI.LLFF).put("response_header_X-Server-IP", this.LJLJJI.LLIL).put("response_header_Via", this.LJLJJI.LLILII).put("prepare_end", vag.LJIJ).put("drop_audio_pts_diff", vag.LJJLIIIJJIZ).put("drop_audio_cost", vag.LJJLIIIJL).put("enable_tcp_fast_open", this.u1).put("tfo_success", vag.LLLIZZ).put("abr_check_enhance", this.F1);
            if (this.w1 == null) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray((Collection) this.w1);
            }
            put2.put("optimize_backup_ips", jSONArray).put("suggest_format", this.f0).put("suggest_protocol", this.h0).put("suggest_access_code", this.m0).put("container_fps", this.d0).put("used_drm", this.b4).put("ipv6_probe_result", vag.LLLJL).put("http_open_start", vag.LJI).put("trans_open_start", vag.LJII).put("socket_create_end", vag.LJIIIIZZ).put("3xx_happen_time", vag.LJIIIZ).put("trans_strategy_params", this.p4).put("trans_params_bandwidth", this.q4).put("trans_params_bandwidth_decision", this.r4).put("is_free_flow", this.LLIIIJ).put("enable_fast_first_frame", this.u0).put("preplay_enter_room_timestamp", this.E5);
            long j6 = this.E5;
            if (j6 != -1) {
                long j7 = vag.LJIILIIL;
                if (j6 > j7) {
                    this.F5 = j6 - j7;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("preplay enter room at: ");
                LIZ.append(this.E5);
                LIZ.append(", wait cost: ");
                LIZ.append(this.F5);
                X1D.LIZIZ(LIZ);
                C46496IMq.LIZJ();
            }
            if (this.b4 == 1) {
                LJFF.put("drm_get_secret_key_end", 0L);
            }
            if (LJIILLIIL() && !LJIIZILJ()) {
                LJFF.put("player_dns_analysis_end", this.Q1);
                LJFF.put("rtc_use_sdk_dns", this.P1);
                LJFF.put("tcp_connect_end", this.R1);
                LJFF.put("rtc_tls_handshake_end", this.S1);
                LJFF.put("tcp_first_package_end", this.T1);
                LJFF.put("rtc_inited_end", vag.LLJZ);
                LJFF.put("rtc_offer_send_end", vag.LLLFF);
                LJFF.put("rtc_answer_recv_end", vag.LLLFFI);
                LJFF.put("rtc_ice_connected_time", vag.LLLII);
                LJFF.put("rtc_start_end", vag.LLLIIII);
                LJFF.put("rtc_preload_result", -1);
                LJFF.put("first_audio_frame_decode_start", vag.LLLIILIL);
                LJFF.put("first_video_frame_decode_start", vag.LLLIIL);
                LJFF.put("first_audio_frame_end", vag.LLLIIIL);
                LJFF.put("first_video_frame_end", vag.LLLIIIIL);
            } else {
                LJFF.put("player_dns_analysis_end", vag.LIZLLL);
                LJFF.put("player_open_input_start", vag.LJ);
                if ("kcp".equals(this.g0)) {
                    j2 = vag.LIZLLL;
                } else {
                    j2 = vag.LJFF;
                }
                LJFF.put("tcp_connect_end", j2);
                LJFF.put("tcp_first_package_end", vag.LJIIJ);
            }
            int i = this.LLJLLL;
            if (i != -1) {
                LJFF.put("audio_timescale_enable", i);
            }
            if (this.O0) {
                LJFF.put("abr_startup_bitrate", vag.LJLLLLLL);
                LJFF.put("abr_request_url", vag.LLLLLLZ);
            }
            if (TextUtils.equals(this.g0, "quic") || TextUtils.equals(this.g0, "h2q")) {
                LJFF.put("quic_report_ccre_tag_in_chlo", this.LJLJJI.LLJJJJLIIL).put("quic_report_jcco_tag_in_chlo", this.LJLJJI.LLJJL).put("quic_report_ssr_tag_in_chlo", this.LJLJJI.LLJJLIIIJLLLLLLLZ).put("quic_report_irtt_tag_in_chlo", this.LJLJJI.LLJL).put("quic_report_cctk_tag_in_chlo", this.LJLJJI.LLJLIL).put("quic_report_ntyp_tag_in_chlo", this.LJLJJI.LLJLILLLLZIIL).put("quic_report_ccfb_tag_in_shlo", this.LJLJJI.LLJLL);
            }
            if (TextUtils.equals(this.g0, "quic") || TextUtils.equals(this.g0, "quicu")) {
                LJJLIIIIJ(LJFF, this.q0);
            }
            if (TextUtils.equals(this.g0, "h2") || TextUtils.equals(this.g0, "h2q") || TextUtils.equals(this.g0, "h2qu")) {
                LJJLIIIIJ(LJFF, this.p0);
            }
            if (TextUtils.equals(this.LLLIIII, "avph")) {
                LJJLIIIIJ(LJFF, this.r0);
            }
            if (TextUtils.equals(this.LLLIIII, "cmaf")) {
                LJJLIIIIJ(LJFF, this.t0);
                LJFF.put("cmaf_start_seq_no_diff", this.LJLJJI.LJJIJLIJ).put("audio_request_cdn_cached", this.LJLJJI.LJJLIIJ).put("video_request_cdn_cached", this.LJLJJI.LJJLIL).put("audio_request_time_to_source", this.LJLJJI.LJJLJ).put("video_request_time_to_source", this.LJLJJI.LJJLJLI).put("audio_request_time_for_cdn", this.LJLJJI.LJJLL).put("video_request_time_for_cdn", this.LJLJJI.LJJZ);
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject put3 = jSONObject.put("PLAY-FirstFrameAudioBuffer", this.LJLJJI.LJZ).put("PLAY-FirstFrameVideoBuffer", this.LJLJJI.LJLZ).put("PLAY-FirstFrameDownloadSpeed", this.LJLJJI.LJLL);
            String str = this.LJLJLJ;
            String str2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            if (str == null) {
                str = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            JSONObject put4 = put3.put("PLAY-EnterMethod", str);
            String str3 = this.LJLJLLL;
            if (str3 == null) {
                str3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            JSONObject put5 = put4.put("PLAY-EnterAction", str3);
            String str4 = this.LJLL;
            if (str4 != null) {
                str2 = str4;
            }
            JSONObject put6 = put5.put("PLAY-EnterMethodSubtag", str2).put("PLAY-IsPreview", this.LJLZ ? 1 : 0).put("PLAY-Protocol", this.g0).put("PLAY-FirstFrame", j4).put("PLAY-Success", 1);
            if (this.LJLJJI.LJIIIZ > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            put6.put("PLAY-302", z2);
            jSONObject.put("PLAY-ConnectCost", LJFF.optLong("tcp_connect_end") - LJFF.optLong("player_dns_analysis_end"));
            jSONObject.put("PLAY-SessionID", this.LLLI);
            LJFF.put("first_play_time", -1);
            t tVar = this.LJLJJL;
            if (tVar != null && tVar.y2 == 1) {
                jSONObject.put("PLAY-StreamSuffix", tVar.LLZLLIL);
                jSONObject.put("PLAY-NeptuneName", this.LJLJJL.h);
                C48436Izg c48436Izg = this.LJLJJL.LJLLL;
                float f = 0.0f;
                if (c48436Izg != null) {
                    f = c48436Izg.getFloatOption(150, 0.0f);
                }
                jSONObject.put("PLAY-FPS", f);
                if (LiveStrategyManager.inst().mFirstStart) {
                    j3 = vag.LIZ - LiveStrategyManager.mLoadLibraryTime;
                } else {
                    j3 = -1;
                }
                LJFF.put("first_play_time", j3);
                LiveStrategyManager.inst().setEventInfo(61, jSONObject);
            }
            return LJFF;
        }
        return null;
    }

    public final void LJIJJLI(int i, long j, boolean z) {
        String str;
        int i2;
        if (j > System.currentTimeMillis() - this.LJLJJI.LIZ || j <= i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("abnormal decode stall time");
            LIZ.append(j);
            X1D.LIZIZ(LIZ);
            C46496IMq.LIZJ();
            return;
        }
        if (z) {
            this.F2++;
            this.G2 += j;
            if (this.LJLZ) {
                this.Y2++;
                this.Z2 += j;
            }
        } else {
            this.H2++;
            this.I2 += j;
            if (this.LJLZ) {
                this.a3++;
                this.b3 += j;
            }
        }
        JSONObject LJFF = LJFF();
        if (LJFF != null) {
            try {
                JSONObject put = LJFF.put("event_key", "decode_stall");
                if (z) {
                    str = "video";
                } else {
                    str = "audio";
                }
                put.put("type", str).put("stall_time", j);
                LJJI("live_client_monitor_log", LJFF);
                long j2 = this.LLLLII;
                if (j2 > 0) {
                    this.LLLLII = j2 + 1;
                }
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                jSONObject.put("PLAY-StallType", i2).put("PLAY-StallTime", j).put("event_key", "decode_stall");
                jSONObject.put("PLAY-SessionID", this.LLLI);
                t tVar = this.LJLJJL;
                if (tVar != null && tVar.y2 == 1) {
                    LiveStrategyManager.inst().setEventInfo(62, jSONObject);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJIL(int i, long j, boolean z) {
        String str;
        int i2;
        if (j > System.currentTimeMillis() - this.LJLJJI.LIZ || j <= i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("abnormal demux stall time");
            LIZ.append(j);
            X1D.LIZIZ(LIZ);
            C46496IMq.LIZJ();
            return;
        }
        if (z) {
            this.J2++;
            this.K2 += j;
            if (this.LJLZ) {
                this.c3++;
                this.d3 += j;
            }
        } else {
            this.L2++;
            this.M2 += j;
            if (this.LJLZ) {
                this.e3++;
                this.f3 += j;
            }
        }
        JSONObject LJFF = LJFF();
        if (LJFF != null) {
            try {
                JSONObject put = LJFF.put("event_key", "demux_stall");
                if (z) {
                    str = "video";
                } else {
                    str = "audio";
                }
                put.put("type", str).put("stall_time", j);
                LJJI("live_client_monitor_log", LJFF);
                long j2 = this.LLLLII;
                if (j2 > 0) {
                    this.LLLLII = j2 + 1;
                }
                JSONObject jSONObject = new JSONObject();
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                jSONObject.put("PLAY-StallType", i2).put("PLAY-StallTime", j).put("event_key", "demux_stall");
                jSONObject.put("PLAY-SessionID", this.LLLI);
                t tVar = this.LJLJJL;
                if (tVar != null && tVar.y2 == 1) {
                    LiveStrategyManager.inst().setEventInfo(62, jSONObject);
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJJIJIIJIL(String str, JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject LJFF = LJFF();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            LJFF.put(next, JSONObjectProtectorUtils.getLong(jSONObject, next));
        }
        if (LJFF != null) {
            try {
                LJFF.put("event_key", str).put("push_retry_stall", jSONArray).put("sei_source", this.LJLJJI.LLFZ);
                LJJI("live_client_monitor_log", LJFF);
                long j = this.LLLLII;
                if (j > 0) {
                    this.LLLLII = j + 1;
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJJJJL(int i, int i2, int i3) {
        JSONObject LJFF;
        if (this.LJLJJL != null && (LJFF = LJFF()) != null) {
            try {
                LJFF.put("event_key", "stream_abnormal").put("stream_type", "video").put("type", i).put("cur_index", i2).put("last_index", i3);
                LJJI("live_client_monitor_log", LJFF);
                long j = this.LLLLII;
                if (j > 0) {
                    this.LLLLII = j + 1;
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJJLIIIJ(String str, String str2, String str3) {
        this.h0 = str;
        this.g0 = str2;
        this.m0 = str3;
    }

    public final void LJJIJLIJ(int i, long j, boolean z, boolean z2) {
        String str;
        int i2;
        this.e4 = 1L;
        if (j > System.currentTimeMillis() - this.LJLJJI.LIZ || j <= i) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("abnormal render stall time");
            LIZ.append(j);
            X1D.LIZIZ(LIZ);
            C46496IMq.LIZJ();
            return;
        }
        if (z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("video render stall time ");
            LIZ2.append(j);
            X1D.LIZIZ(LIZ2);
            C46496IMq.LIZJ();
            this.LLLLZI++;
            this.LLLLLLLZIL++;
            this.LLLLZIL = (int) (this.LLLLZIL + j);
            this.LLLLLLZ += j;
            if (this.n2 == 1) {
                this.w2++;
                this.x2 += j;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI.LJIILL;
            if (this.z.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(currentTimeMillis);
                LIZ3.append(":");
                LIZ3.append(j);
                this.z = X1D.LIZIZ(LIZ3);
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                b0.LJ(LIZ4, this.z, ",", currentTimeMillis);
                this.z = C132805Jc.LIZLLL(LIZ4, ":", j, LIZ4);
            }
            if (this.LJLZ) {
                this.LLLLLIL++;
                this.LLLLLILLIL += j;
                this.LLLLLLJ++;
                this.LLLLLLL = (int) (this.LLLLLLL + j);
            }
        } else {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("audio render stall time ");
            LIZ5.append(j);
            X1D.LIZIZ(LIZ5);
            C46496IMq.LIZJ();
            this.LLLLZLL++;
            this.LLLLLLZZ++;
            this.LLLLZLLIL = (int) (this.LLLLZLLIL + j);
            this.LLLLLZ += j;
            if (this.n2 == 1) {
                this.y2++;
                this.z2 += j;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - this.LJLJJI.LJIILL;
            if (this.y.equals(LiveGiftNewGifterBadgeSetting.DEFAULT)) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(currentTimeMillis2);
                LIZ6.append(":");
                LIZ6.append(j);
                this.y = X1D.LIZIZ(LIZ6);
            } else {
                StringBuilder LIZ7 = X1D.LIZ();
                b0.LJ(LIZ7, this.y, ",", currentTimeMillis2);
                this.y = C132805Jc.LIZLLL(LIZ7, ":", j, LIZ7);
            }
            if (this.LJLZ) {
                this.LLLLLJIL++;
                this.LLLLLJLJLL += j;
                this.LLLLLLLLL++;
                this.LLLLLLLLLL = (int) (this.LLLLLLLLLL + j);
            }
        }
        if (z2) {
            this.LJLJJL.N(this.LJLJJI, 4);
            JSONObject LJFF = LJFF();
            if (LJFF != null) {
                try {
                    JSONObject put = LJFF.put("event_key", "render_stall");
                    if (z) {
                        str = "video";
                    } else {
                        str = "audio";
                    }
                    put.put("type", str).put("stall_time", j).put("video_buffer_time", this.LJLJJI.LJLZ).put("audio_buffer_time", this.LJLJJI.LJZ);
                    LJJI("live_client_monitor_log", LJFF);
                    long j2 = this.LLLLII;
                    if (j2 > 0) {
                        this.LLLLII = j2 + 1;
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (z) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    jSONObject.put("PLAY-StallType", i2).put("PLAY-StallTime", j).put("event_key", "render_stall");
                    jSONObject.put("PLAY-SessionID", this.LLLI);
                    t tVar = this.LJLJJL;
                    if (tVar != null && tVar.y2 == 1) {
                        LiveStrategyManager.inst().setEventInfo(62, jSONObject);
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public final void LJJJJLI(int i, String str, String str2, String str3) {
        if (this.LJLJJL == null) {
            return;
        }
        try {
            JSONObject LJFF = LJFF();
            JSONObject put = LJFF.put("event_key", "switch_url");
            if (str == null) {
                str = "null";
            }
            JSONObject put2 = put.put("last_cdn_play_url", str);
            if (str2 == null) {
                str2 = "null";
            }
            put2.put("next_cdn_play_url", str2).put("res_bitrate", this.K0).put("last_res", this.J0).put("code", i).put("reason", str3);
            LJJI("live_client_monitor_log", LJFF);
            long j = this.LLLLII;
            if (j > 0) {
                this.LLLLII = j + 1;
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public VAD(t tVar, InterfaceC48269Iwz interfaceC48269Iwz, long j, Context context, int i) {
        this.LLZLI = 10000L;
        this.LJLIL = context;
        this.LJLJI = interfaceC48269Iwz;
        this.LJLJJL = tVar;
        NTPUDPClient nTPUDPClient = new NTPUDPClient();
        this.LLZZLLIL = nTPUDPClient;
        nTPUDPClient.setDefaultTimeout(10000);
        this.LLZLI = j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enable report sessionstop: ");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
        if (i == 1) {
            this.o2 = new VAG();
        }
        this.G1 = new VAG();
        HashMap<String, Integer> hashMap = T5;
        C59895Nf1.LIZJ(1, hashMap, "playing", 2, "recved_spspps", 4, "play_stop", 8, "start_play");
        C59895Nf1.LIZJ(4096, hashMap, "first_frame", 16, "prepare_result", 32, "stream_abnormal", 64, "session_stop");
        C59895Nf1.LIZJ(128, hashMap, "decode_stall", FileUtils.BUFFER_SIZE, "render_stall", 256, "link", 512, "demux_stall");
        hashMap.put("retry", 1024);
        hashMap.put("play_error", 2048);
        hashMap.put("rtm_session_stop", 16384);
    }

    public final void LJJJLL(boolean z, long j, long j2, long j3, long j4) {
        VAG vag;
        long j5 = j4;
        long j6 = j;
        long j7 = j3;
        long j8 = j2;
        t tVar = this.LJLJJL;
        if (tVar == null || (vag = this.LJLJJI) == null) {
            return;
        }
        if (j6 == 0) {
            try {
                j6 = vag.LJJZZI;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (j8 == 0) {
            j8 = vag.LJJZZIII;
        }
        if (j7 == 0) {
            j7 = vag.LJLJJLL;
        }
        if (j5 == 0) {
            j5 = vag.LJLJLJ;
        }
        long j9 = vag.LJLJL;
        if (!z) {
            tVar.N(vag, 1);
        }
        t tVar2 = this.LJLJJL;
        if (tVar2 != null && (!tVar2.F0() || tVar2.L2)) {
            LJJI("live_client_monitor_log", LJII(this.LJLJJI, j6, j8, j7, j5, z, j9));
            long j10 = this.LLLLII;
            if (j10 > 0) {
                this.LLLLII = j10 + 1;
            }
        }
        long j11 = this.LJLJJLL;
        if (LJIILLIIL()) {
            j11 = this.Y3;
        }
        if (!this.LJLJL) {
            return;
        }
        this.LJLILLLLZI.sendEmptyMessageDelayed(101, j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x01f0, code lost:
    
        if (r2.X3 == 0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJII(X.VAG r20, long r21, long r23, long r25, long r27, boolean r29, long r30) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VAD.LJII(X.VAG, long, long, long, long, boolean, long):org.json.JSONObject");
    }

    public final void LJJJJZI(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        JSONObject LJFF = LJFF();
        if (LJFF != null) {
            try {
                LJFF.put("event_key", "stall_counter").put("type", "video").put("render_stall_200_duration", j / 1000).put("render_stall_200_count", j % 1000).put("render_stall_300_duration", j2 / 1000).put("render_stall_300_count", j2 % 1000).put("render_stall_400_duration", j3 / 1000).put("render_stall_400_count", j3 % 1000).put("render_stall_500_duration", j4 / 1000).put("render_stall_500_count", j4 % 1000).put("demuxer_stall_500_duration", j5 / 1000).put("demuxer_stall_500_count", j5 % 1000).put("decode_pre_stall_500_duration", j6 / 1000).put("decode_pre_stall_500_count", j6 % 1000).put("decode_post_stall_500_duration", j7 / 1000).put("decode_post_stall_500_count", j7 % 1000);
                LJJI("live_client_monitor_log", LJFF);
                long j8 = this.LLLLII;
                if (j8 > 0) {
                    this.LLLLII = j8 + 1;
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
