package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

/* renamed from: X.Iod, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47751Iod {
    public float A;
    public String A0;
    public float B;
    public String B0;
    public float C;
    public C11030bz C0;
    public int D;
    public int D0;
    public int E;
    public int E0;
    public ArrayList<String> F;
    public boolean F0;
    public ArrayList<String> G;
    public int G0;
    public ArrayList<String> H;
    public int H0;
    public ArrayList<String> I;
    public int I0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f73J;
    public int J0;
    public int K;
    public int K0;
    public String L;
    public int L0;
    public long LIZ = -2147483648L;
    public long LIZIZ = -2147483648L;
    public long LIZJ = -2147483648L;
    public long LIZLLL = -2147483648L;
    public long LJ = -2147483648L;
    public long LJFF = -2147483648L;
    public long LJI = -2147483648L;
    public long LJII = -2147483648L;
    public long LJIIIIZZ = -2147483648L;
    public long LJIIIZ = -2147483648L;
    public long LJIIJ = -2147483648L;
    public long LJIIJJI = -2147483648L;
    public long LJIIL = -2147483648L;
    public long LJIILIIL = -2147483648L;
    public long LJIILJJIL = -2147483648L;
    public long LJIILL = -2147483648L;
    public long LJIILLIIL = -2147483648L;
    public long LJIIZILJ = -2147483648L;
    public long LJIJ = -2147483648L;
    public long LJIJI = -2147483648L;
    public long LJIJJ = -2147483648L;
    public long LJIJJLI = -2147483648L;
    public long LJIL = -2147483648L;
    public long LJJ = -2147483648L;
    public long LJJI = -2147483648L;
    public long LJJIFFI = -2147483648L;
    public long LJJII = -2147483648L;
    public long LJJIII = -2147483648L;
    public long LJJIIJ = -2147483648L;
    public long LJJIIJZLJL = -2147483648L;
    public long LJJIIZ = -2147483648L;
    public long LJJIIZI = -2147483648L;
    public final long LJJIJ = -2147483648L;
    public int LJJIJIIJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJIJIIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public ArrayList LJJIJIL = new ArrayList();
    public long LJJIJL = -2147483648L;
    public long LJJIJLIJ = -2147483648L;
    public long LJJIL = -2147483648L;
    public int LJJIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final int LJJJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LJJJIL = "";
    public String LJJJJ = "";
    public int LJJJJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJJJIZL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJJJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJJJJL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJJJL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJJJLI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LJJJJLL = "";
    public String LJJJJZ = "";
    public String LJJJJZI = "";
    public String LJJJLIIL = "";
    public String LJJJLL = "";
    public String LJJJLZIJ = "";
    public String LJJJZ = "";
    public int LJJL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final int LJJLI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJLIIIIJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LJJLIIIJ = "";
    public int LJJLIIIJILLIZJL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public java.util.Map LJJLIIIJJI = null;
    public long LJJLIIIJJIZ = -2147483648L;
    public long LJJLIIIJL = -2147483648L;
    public long LJJLIIIJLJLI = -2147483648L;
    public long LJJLIIIJLLLLLLLZ = -2147483648L;
    public long LJJLIIJ = -2147483648L;
    public long LJJLIL = -2147483648L;
    public long LJJLJ = -2147483648L;
    public long LJJLJLI = -2147483648L;
    public long LJJLL = -2147483648L;
    public long LJJZ = -2147483648L;
    public long LJJZZI = -2147483648L;
    public long LJJZZIII = -2147483648L;
    public long LJL = -2147483648L;
    public long LJLI = -2147483648L;
    public float LJLIIIL;
    public float LJLIIL;
    public long LJLIL;
    public int LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public String LJLZ;
    public java.util.Map LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public long LLFZ;
    public long LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public String LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public int LLIILII;
    public int LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public String LLILII;
    public String LLILIL;
    public int LLILL;
    public int LLILLIZIL;
    public String LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public java.util.Map LLJJ;
    public java.util.Map LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public long LLJJJ;
    public long LLJJJIL;
    public long LLJJJJ;
    public long LLJJJJJIL;
    public long LLJJJJLIIL;
    public long LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public String LLJLIL;
    public int LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public long LLJZ;
    public long LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;
    public long LLLFZ;
    public long LLLI;
    public long LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public final double LLLIIL;
    public final double LLLIILIL;
    public int LLLIL;
    public int LLLILZ;
    public int LLLILZJ;
    public String LLLILZLLLI;
    public int LLLIZZ;
    public int LLLJ;
    public long LLLJIL;
    public long LLLJL;
    public long LLLL;
    public long LLLLII;
    public int LLLLIIIILLL;
    public long LLLLIIL;
    public long LLLLIILL;
    public long LLLLIILLL;
    public long LLLLIL;
    public long LLLLILI;
    public long LLLLJ;
    public int LLLLJI;
    public int LLLLL;
    public int LLLLLIL;
    public float LLLLLILLIL;
    public long LLLLLJIL;
    public int LLLLLJLJLL;
    public boolean LLLLLL;
    public boolean LLLLLLIL;
    public int LLLLLLJ;
    public int LLLLLLL;
    public int LLLLLLLLL;
    public int LLLLLLLLLL;
    public String LLLLLLLZIL;
    public String LLLLLLZ;
    public String LLLLLLZZ;
    public String LLLLLZ;
    public String LLLLLZIL;
    public int LLLLLZL;
    public int LLLLZ;
    public long LLLLZI;
    public long LLLLZIL;
    public float LLLLZLL;
    public final LinkedHashMap<String, String> LLLLZLLIL;
    public final LinkedHashMap<String, String> LLLLZLLLI;
    public final ArrayList<Float> LLLZ;
    public final LinkedHashMap<String, String> LLLZI;
    public final LinkedHashMap<String, Integer> LLLZIIL;
    public final ArrayList<Integer> LLLZIL;
    public final ArrayList<Integer> LLLZL;
    public final ArrayList<Float> LLLZLL;
    public int LLLZLZ;
    public int LLLZZ;
    public int LLLZZIL;
    public double LLZ;
    public java.util.Map LLZIL;
    public final java.util.Map LLZILL;
    public long LLZL;
    public long LLZLI;
    public long LLZLL;
    public long LLZLLIL;
    public final java.util.Map LLZLLLL;
    public final java.util.Map LLZZ;
    public java.util.Map LLZZJLIL;
    public ArrayList<String> LLZZLLIL;
    public ArrayList<String> LLZZZIL;
    public ArrayList<String> LLZZZZ;
    public int M;
    public String M0;
    public double N;
    public int N0;
    public double O;
    public ArrayList<Float> O0;
    public double P;
    public double Q;
    public int R;
    public int S;
    public float T;
    public int U;
    public int V;
    public long W;

    /* renamed from: X, reason: collision with root package name */
    public long f74X;

    /* renamed from: Y, reason: collision with root package name */
    public int f75Y;
    public int Z;
    public ArrayList<String> a;
    public int a0;
    public ArrayList<String> b;
    public ArrayList<String> b0;
    public ArrayList<String> c;
    public float c0;
    public ArrayList<String> d;
    public int d0;
    public ArrayList<String> e;
    public long e0;
    public ArrayList<String> f;
    public int f0;
    public ArrayList<String> g;
    public int g0;
    public ArrayList<String> h;
    public int h0;
    public ArrayList<String> i;
    public String i0;
    public ArrayList<String> j;
    public int j0;
    public ArrayList<Integer> k;
    public int k0;
    public ArrayList<Integer> l;
    public String l0;
    public ArrayList<String> m;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public int f76n;
    public int n0;
    public long o;
    public int o0;
    public long p;
    public int p0;
    public long q;
    public String q0;
    public long r;
    public Float r0;
    public int s;
    public ArrayList<String> s0;
    public int t;
    public String t0;
    public int u;
    public Float u0;
    public int v;
    public String v0;
    public int w;
    public int w0;
    public float x;
    public String x0;
    public float y;
    public int y0;
    public float z;
    public ArrayList z0;

    public C47751Iod() {
        Float valueOf = Float.valueOf(Float.MIN_VALUE);
        this.LJLIIIL = Float.MIN_VALUE;
        this.LJLIIL = Float.MIN_VALUE;
        this.LJLIL = -2147483648L;
        this.LJLILLLLZI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLJI = -2147483648L;
        this.LJLJJI = -2147483648L;
        this.LJLJJL = -2147483648L;
        this.LJLJJLL = -2147483648L;
        this.LJLJL = -2147483648L;
        this.LJLJLJ = "";
        this.LJLJLLL = "";
        this.LJLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLLI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLLILLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLLJ = "";
        this.LJLLL = "";
        this.LJLLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLLLLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLZ = "";
        this.LJZ = null;
        this.LJZI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJZL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLD = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLF = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLFF = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLFFF = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLFII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLFZ = -2147483648L;
        this.LLI = -2147483648L;
        this.LLIFFJFJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIIILZ = "";
        this.LLIIIJ = "";
        this.LLIIIL = "";
        this.LLIIIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIILII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIILZL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLILL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLILLIZIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLILLJJLI = "";
        this.LLILLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLILZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLILZIL = "";
        this.LLILZLL = "";
        this.LLIZ = "";
        this.LLIZLLLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJILJIL = -2147483648L;
        this.LLJILJILJ = -2147483648L;
        this.LLJILLL = -2147483648L;
        this.LLJJIII = -1002;
        this.LLJJIJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJJIJIIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJJIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJJJ = -2147483648L;
        this.LLJJJIL = -2147483648L;
        this.LLJJJJ = -2147483648L;
        this.LLJJJJJIL = -2147483648L;
        this.LLJJJJLIIL = -2147483648L;
        this.LLJJL = -2147483648L;
        this.LLJJLIIIJLLLLLLLZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJL = -2147483648L;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJLLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJZ = -2147483648L;
        this.LLJZIJLIL = -2147483648L;
        this.LLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLF = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLFF = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLFFI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLFZ = -2147483648L;
        this.LLLI = -2147483648L;
        this.LLLII = -2147483648L;
        this.LLLIIII = 0;
        this.LLLIIIIL = 0;
        this.LLLIIIL = 0;
        this.LLLIIL = 1.401298464324817E-45d;
        this.LLLIILIL = 1.401298464324817E-45d;
        this.LLLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLILZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLILZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLILZLLLI = "";
        this.LLLIZZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLJIL = -2147483648L;
        this.LLLJL = -2147483648L;
        this.LLLL = -2147483648L;
        this.LLLLII = -2147483648L;
        this.LLLLIIIILLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLIIL = -2147483648L;
        this.LLLLIILL = -2147483648L;
        this.LLLLIILLL = -2147483648L;
        this.LLLLIL = -2147483648L;
        this.LLLLILI = -2147483648L;
        this.LLLLJ = -2147483648L;
        this.LLLLJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLLILLIL = Float.MIN_VALUE;
        this.LLLLLJIL = -2147483648L;
        this.LLLLLJLJLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLLL = false;
        this.LLLLLLIL = false;
        this.LLLLLLJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLLLLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLLLLLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLLLLZIL = "";
        this.LLLLLLZ = "";
        this.LLLLLLZZ = "";
        this.LLLLLZ = "";
        this.LLLLLZIL = "";
        this.LLLLLZL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLLZI = -2147483648L;
        this.LLLLZIL = -2147483648L;
        this.LLLLZLL = Float.MIN_VALUE;
        this.LLLZLZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLLZZ = 0;
        this.LLLZZIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLZ = 1.401298464324817E-45d;
        this.LLZIL = null;
        this.LLZILL = null;
        this.LLZL = -2147483648L;
        this.LLZLI = -2147483648L;
        this.LLZLL = -2147483648L;
        this.LLZLLIL = -2147483648L;
        this.LLZLLLL = null;
        this.LLZZ = null;
        this.LLZZJLIL = null;
        this.LLZZLLIL = null;
        this.LLZZZIL = null;
        this.LLZZZZ = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.f76n = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.o = -2147483648L;
        this.p = -2147483648L;
        this.q = -2147483648L;
        this.r = -2147483648L;
        this.s = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.t = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.u = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.v = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.w = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.x = Float.MIN_VALUE;
        this.y = Float.MIN_VALUE;
        this.z = Float.MIN_VALUE;
        this.A = Float.MIN_VALUE;
        this.B = Float.MIN_VALUE;
        this.C = Float.MIN_VALUE;
        this.D = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.E = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f73J = false;
        this.K = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.M = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.N = 1.401298464324817E-45d;
        this.O = 1.401298464324817E-45d;
        this.P = 1.401298464324817E-45d;
        this.Q = 1.401298464324817E-45d;
        this.R = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.S = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.T = Float.MIN_VALUE;
        this.U = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.V = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.W = -2147483648L;
        this.f74X = -2147483648L;
        this.f75Y = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.Z = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.a0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.b0 = null;
        this.c0 = Float.MIN_VALUE;
        this.d0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.e0 = -2147483648L;
        this.f0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.g0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.h0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.i0 = null;
        this.j0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.k0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.l0 = "";
        this.m0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.n0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.o0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.p0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.q0 = "";
        this.r0 = valueOf;
        this.s0 = null;
        this.t0 = "";
        this.u0 = valueOf;
        this.v0 = "";
        this.w0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.x0 = "";
        this.y0 = -1;
        this.A0 = null;
        this.B0 = null;
        this.D0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.E0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.F0 = false;
        this.G0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.H0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.I0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.J0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.K0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.L0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.M0 = null;
        this.N0 = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.O0 = null;
        this.LLLZIIL = new LinkedHashMap<>();
        this.LLLZI = new LinkedHashMap<>();
        this.LLLZIL = new ArrayList<>();
        this.LLLZL = new ArrayList<>();
        this.LLLZ = new ArrayList<>();
        this.LLLLZLLIL = new LinkedHashMap<>();
        this.LLLLZLLLI = new LinkedHashMap<>();
        this.LLZIL = new HashMap();
        this.LLZILL = new ConcurrentHashMap();
        this.LLZLLLL = new HashMap();
        this.LLLZLL = new ArrayList<>();
        this.LLZZ = new ConcurrentHashMap();
        this.LLZZJLIL = new HashMap();
        this.LLLLLJLJLL = 0;
        this.V = 0;
        this.G0 = 0;
    }

    public static String LIZ(java.util.Map map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    return new JSONObject(map).toString();
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(e.toString());
                LIZ.append(", :");
                LIZ.append(map);
                C78253UnR.LIZLLL("VideoEventOnePlay", X1D.LIZIZ(LIZ));
            }
        }
        return null;
    }

    public final java.util.Map<String, Object> LIZIZ(C47752Ioe c47752Ioe) {
        HashMap hashMap = new HashMap();
        C60903NvH.LJJIIZI(1, "encrypt_version", hashMap);
        if (c47752Ioe != null) {
            C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(c47752Ioe.LJJLIIIJILLIZJL.LJ), "reply_size", hashMap);
            C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(c47752Ioe.LJJIIZI), "vs", hashMap);
            C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(c47752Ioe.LJJLIIIJILLIZJL.LJI), "mdl_speed", hashMap);
            C60903NvH.LJJIJIIJI("codec", C60903NvH.LJIIIZ(c47752Ioe.LJJIJ), hashMap);
        }
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.LJJIJL), "vps", hashMap);
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.LJJIJLIJ), "vds", hashMap);
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.LJJIL), "accumulate_vds", hashMap);
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.LL), "watch_dur", hashMap);
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.LLLFZ), "vpls", hashMap);
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.LJJIJIIJI), "bc", hashMap);
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.LJJIIJ), "vt", hashMap);
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.LJJJ), "height", hashMap);
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.LJJIZ), "width", hashMap);
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.W), "mask_download_size", hashMap);
        C60903NvH.LJJIJ(C60903NvH.LJIIIIZZ(this.f74X), "subtitle_download_size", hashMap);
        float f = this.LLLLZLL;
        if (f != Float.MIN_VALUE && f != Float.NaN) {
            f = -f;
        }
        C60903NvH.LJJIIZ(f, "st_net_speed", hashMap);
        C60903NvH.LJJIJIIJI("initial_resolution", C60903NvH.LJIIIZ(this.LJJJLZIJ), hashMap);
        return hashMap;
    }

    public final void LIZJ(C47752Ioe c47752Ioe) {
        if (c47752Ioe.LJJII.equals("vid") && this.LJJI <= 0) {
            this.LLJJIII = -1002;
        }
        if (this.LLJILJILJ <= 0 && this.LJJLIIJ <= 0 && !c47752Ioe.LJJII.equals("local_url")) {
            this.LLJJIII = -1004;
            return;
        }
        if (this.LJJIFFI <= 0) {
            this.LLJJIII = -1003;
            return;
        }
        if (this.LJFF <= 0) {
            this.LLJJIII = -1006;
            return;
        }
        if (this.LJIIIIZZ <= 0) {
            this.LLJJIII = -1007;
            return;
        }
        if (this.LJJLIIIJL <= 0) {
            this.LLJJIII = -1008;
            return;
        }
        if (this.LJJLIIIJLLLLLLLZ <= 0) {
            this.LLJJIII = -1009;
            return;
        }
        if (this.LJI <= 0) {
            this.LLJJIII = -1010;
            return;
        }
        if (this.LJII <= 0) {
            this.LLJJIII = -1011;
            return;
        }
        if (this.LJIIIZ <= 0) {
            this.LLJJIII = -1012;
            return;
        }
        int i = this.LLLLLJLJLL;
        if (i == 0 && this.LJIILLIIL <= 0) {
            this.LLJJIII = -1014;
            return;
        }
        if (this.LJIILL <= 0) {
            this.LLJJIII = -1015;
            return;
        }
        if (this.LJIIJ <= 0) {
            this.LLJJIII = -1013;
            return;
        }
        if (i == 0 && this.LJLJJI <= 0) {
            if (this.LJLJL <= 0) {
                this.LLJJIII = -1025;
                return;
            } else {
                this.LLJJIII = -1016;
                return;
            }
        }
        if (this.LJLJJLL <= 0) {
            this.LLJJIII = -1017;
            return;
        }
        if (i == 0 && this.LJJLJLI <= 0) {
            this.LLJJIII = -1018;
            return;
        }
        if (this.LJJLL <= 0) {
            this.LLJJIII = -1019;
            return;
        }
        if (i == 0 && this.LJJZ <= 0) {
            this.LLJJIII = -1020;
            return;
        }
        if (this.LJJZZI <= 0) {
            this.LLJJIII = -1021;
            return;
        }
        if (i == 0 && this.LJIIJJI <= 0) {
            this.LLJJIII = -1022;
        } else if (this.LJIIL <= 0) {
            this.LLJJIII = -1023;
        } else {
            this.LLJJIII = -1024;
        }
    }

    public final JSONObject LIZLLL(C47752Ioe c47752Ioe) {
        java.util.Map hashMap;
        String str = null;
        if (c47752Ioe == null) {
            return null;
        }
        HashMap hashMap2 = new HashMap();
        if (this.LJJIIJ <= 0) {
            LIZJ(c47752Ioe);
        }
        C60903NvH.LJJIJIIJI("player_sessionid", this.LLLLLLLZIL, hashMap2);
        C60903NvH.LJJIJIIJI("app_sessionid", C47752Ioe.LJLIL, hashMap2);
        C60903NvH.LJJIJIIJI("log_type", "video_playq", hashMap2);
        C60903NvH.LJJIJIIJI("sdk_version", c47752Ioe.LJIIIIZZ, hashMap2);
        C60903NvH.LJJIIZI(this.LJJLIIIIJ, "plugin_exception", hashMap2);
        C60903NvH.LJJIJIIJI("sv", c47752Ioe.LJI, hashMap2);
        C60903NvH.LJJIJIIJI("pv", c47752Ioe.LJ, hashMap2);
        C60903NvH.LJJIJIIJI("pc", c47752Ioe.LJFF, hashMap2);
        C60903NvH.LJJIJIIJI("ffv", c47752Ioe.LJIIIZ, hashMap2);
        C60903NvH.LJJIJIIJI("vcnv", c47752Ioe.LJIIJ, hashMap2);
        C60903NvH.LJJIJIIJI("trv", c47752Ioe.LJIIJJI, hashMap2);
        C60903NvH.LJJIJIIJI("prldv", c47752Ioe.LJIIL, hashMap2);
        C60903NvH.LJJIJIIJI("abrv", c47752Ioe.LJIILIIL, hashMap2);
        C60903NvH.LJJIJIIJI("prdtv", c47752Ioe.LJIILJJIL, hashMap2);
        if (!TextUtils.isEmpty(c47752Ioe.LJJII) && !c47752Ioe.LJJII.equals("dir_url")) {
            C60903NvH.LJJIJIIJI("v", c47752Ioe.LJJI, hashMap2);
        }
        C60903NvH.LJJIIZI(c47752Ioe.LJJ, "play_type", hashMap2);
        C60903NvH.LJJIJ(this.LJJ, "pt", hashMap2);
        C60903NvH.LJJIJ(this.LJJI, "at", hashMap2);
        C60903NvH.LJJIJ(this.LJJIFFI, "prepare_start_time", hashMap2);
        C60903NvH.LJJIJ(this.LJJII, "prepare_end_time", hashMap2);
        C60903NvH.LJJIJ(this.LLJZ, "play_preparedt", hashMap2);
        C60903NvH.LJJIJ(this.LLJZIJLIL, "play_startedt", hashMap2);
        C60903NvH.LJJIJ(this.LJJIIJ, "vt", hashMap2);
        C60903NvH.LJJIJ(this.LJJIIJZLJL, "v_first_sync_t", hashMap2);
        C60903NvH.LJJIJ(this.LJJIIZ, "et", hashMap2);
        C60903NvH.LJJIJ(this.LJJIIZI, "lt", hashMap2);
        C60903NvH.LJJIJ(this.LJJIJ, "bft", hashMap2);
        C60903NvH.LJJIIZI(this.LJJIJIIJI, "bc", hashMap2);
        C60903NvH.LJJIIZI(this.LJJIJIIJIL, "br", hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "vu", this.LJJIJIL);
        C60903NvH.LJJIIZI(c47752Ioe.LJJIIZ, "vd", hashMap2);
        C60903NvH.LJJIJ(c47752Ioe.LJJIIZI, "vs", hashMap2);
        C60903NvH.LJJIJ(this.LJJIJL, "vps", hashMap2);
        C60903NvH.LJJIJ(this.LJJIJLIJ, "vds", hashMap2);
        C60903NvH.LJJIJ(this.LJJIL, "accumulate_vds", hashMap2);
        C60903NvH.LJJIIZI(this.LJJIZ, "width", hashMap2);
        C60903NvH.LJJIIZI(this.LJJJ, "height", hashMap2);
        C60903NvH.LJJIIZI(this.LLFII, "async_init", hashMap2);
        C60903NvH.LJJIIZI(this.LLIIZ, "async_codec_id", hashMap2);
        C60903NvH.LJJIIZI(this.LJJJI, "video_preload_size", hashMap2);
        C60903NvH.LJJIJIIJI("df", this.LJJJIL, hashMap2);
        C60903NvH.LJJIJIIJI("lf", this.LJJJJ, hashMap2);
        C60903NvH.LJJIJIIJI("codec", c47752Ioe.LJJIJ, hashMap2);
        C60903NvH.LJJIJIIJI("a_codec", c47752Ioe.LJJIJIIJI, hashMap2);
        C60903NvH.LJJIJIIJI("render_type", this.LLIIIILZ, hashMap2);
        C60903NvH.LJJIIZI(this.LJJLI, "hijack", hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJIII, "hw", hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJIIJ, "hw_user", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLJI, "hw_err_reason", hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJIIJZLJL, "audio_hw_user", hashMap2);
        C60903NvH.LJJIJ(this.LJJLIIIJJIZ, "dns_t", hashMap2);
        C60903NvH.LJJIJ(this.LJJLIIIJL, "tran_ct", hashMap2);
        C60903NvH.LJJIJ(this.LJJLIIIJLLLLLLLZ, "tran_ft", hashMap2);
        C60903NvH.LJJIJ(this.LJJLIIJ, "a_dns_t", hashMap2);
        C60903NvH.LJJIJ(this.LJJLIL, "a_tran_ct", hashMap2);
        C60903NvH.LJJIJ(this.LJJLJ, "a_tran_ft", hashMap2);
        C60903NvH.LJJIJ(this.LJJLJLI, "re_f_videoframet", hashMap2);
        C60903NvH.LJJIJ(this.LJJZ, "de_f_videoframet", hashMap2);
        C60903NvH.LJJIJ(this.LJJLL, "re_f_audioframet", hashMap2);
        C60903NvH.LJJIJ(this.LJJZZI, "de_f_audioframet", hashMap2);
        C60903NvH.LJJIJ(this.LLFZ, "bu_acu_t", hashMap2);
        C60903NvH.LJJIJ(this.LLI, "de_bu_acu_t", hashMap2);
        C60903NvH.LJJIJIIJI("internal_ip", this.LJLLJ, hashMap2);
        C60903NvH.LJJIJIIJI("tag", c47752Ioe.LJJJIL, hashMap2);
        C60903NvH.LJJIJIIJI("subtag", c47752Ioe.LJJJJ, hashMap2);
        C60903NvH.LJJIJIIJI("ex", LIZ(this.LJJLIIIJJI), hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "mdlretry", this.I);
        C60903NvH.LJJIJ(this.LJJZZIII, "first_buf_startt", hashMap2);
        C60903NvH.LJJIJ(this.LJL, "first_buf_endt", hashMap2);
        C60903NvH.LJJIJ(this.LJLI, "cur_play_pos", hashMap2);
        C60903NvH.LJJIIZI(this.LJLLI, "engine_state", hashMap2);
        C60903NvH.LJJIIZ(this.LJLIIIL, "video_out_fps", hashMap2);
        C60903NvH.LJJIIZ(this.LJLIIL, "container_fps", hashMap2);
        C60903NvH.LJJIIZI(this.LLILLIZIL, "video_decoder_fps", hashMap2);
        C60903NvH.LJJIJ(this.LJLIL, "clock_diff", hashMap2);
        C60903NvH.LJJIIZI(this.LJLILLLLZI, "drop_count", hashMap2);
        C60903NvH.LJJIJ(this.LJLJJI, "video_device_opened_t", hashMap2);
        C60903NvH.LJJIJ(this.LJLJJLL, "audio_device_opened_t", hashMap2);
        C60903NvH.LJJIIZI(this.LJLLILLLL, "finish", hashMap2);
        C60903NvH.LJJIIZI(this.LJJLIIIJILLIZJL, "is_start_play_automatically", hashMap2);
        C60903NvH.LJJIJIIJI("player_create_exception", this.LJJLIIIJ, hashMap2);
        C60903NvH.LJJIJIIJI("custom_str", this.LJJJJZ, hashMap2);
        C60903NvH.LJJIJIIJI("initial_url", this.LJJJJZI, hashMap2);
        C60903NvH.LJJIJIIJI("initial_host", this.LJJJLIIL, hashMap2);
        C60903NvH.LJJIJIIJI("initial_ip", this.LJJJLL, hashMap2);
        C60903NvH.LJJIJIIJI("initial_resolution", this.LJJJLZIJ, hashMap2);
        C60903NvH.LJJIJIIJI("initial_quality", this.LJJJZ, hashMap2);
        C60903NvH.LJJIIZI(this.LJJL, "initial_quality_type", hashMap2);
        C60903NvH.LJJIIZI(this.LJLLLL, "apiver", hashMap2);
        C60903NvH.LJJIJIIJI("auth", this.LJLZ, hashMap2);
        C60903NvH.LJJIIZI(this.LJLLLLLL, "apiver_final", hashMap2);
        C60903NvH.LJJIJIIJI("vtype", c47752Ioe.LJJIJLIJ, hashMap2);
        C60903NvH.LJJIJIIJI("dynamic_type", c47752Ioe.LJJIL, hashMap2);
        C60903NvH.LJJIIZI(this.LJZI, "lc", hashMap2);
        C60903NvH.LJJIIZI(this.LJZL, "switch_resolution_c", hashMap2);
        C60903NvH.LJJIIZI(this.LL, "watch_dur", hashMap2);
        C60903NvH.LJJIIZI(this.LLIIII, "sc", hashMap2);
        C60903NvH.LJJIIZI(this.LLD, "vid_cache", hashMap2);
        C60903NvH.LJJIIZI(this.LLFFF, "custom_p2p_cdn_type", hashMap2);
        C60903NvH.LJJIIZI(this.LLF, "start_time", hashMap2);
        C60903NvH.LJJIIZI(this.LLFF, "disable_accurate_start", hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJIJIIJIL, "audio_codec_nameId", hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJIJIL, "video_codec_nameId", hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJIJL, "format_type", hashMap2);
        C60903NvH.LJJIJ(this.LJLJL, "surface_set_time", hashMap2);
        C60903NvH.LJJIJIIJI("surface_code", this.LJLJLJ, hashMap2);
        C60903NvH.LJJIJIIJI("surface_code_player", this.LJLJLLL, hashMap2);
        C60903NvH.LJJIIZI(this.LJLL, "frames_drop_set_num", hashMap2);
        C60903NvH.LJJIJ(this.LJLJI, "video_device_start_t", hashMap2);
        C60903NvH.LJJIJ(this.LJLJJL, "audio_device_start_t", hashMap2);
        C60903NvH.LJJIIZI(this.LLIFFJFJJ, "video_length", hashMap2);
        C60903NvH.LJJIIZI(this.LLII, "audio_length", hashMap2);
        C60903NvH.LJJIJIIJI("api_str", this.LLIIIJ, hashMap2);
        C60903NvH.LJJIJIIJI("net_client", this.LLIIIL, hashMap2);
        C60903NvH.LJJIIZI(this.LLIIIZ, "fetch_lv", hashMap2);
        C60903NvH.LJJIIZI(this.LLIIJI, "volume", hashMap2);
        C60903NvH.LJJIIZI(this.LLIIJLIL, "core_volume", hashMap2);
        C60903NvH.LJJIIZI(this.LLILL, "ae_type", hashMap2);
        C60903NvH.LJJIIZI(this.LLIIL, "mute", hashMap2);
        C60903NvH.LJJIJIIJI("source_type", c47752Ioe.LJJII, hashMap2);
        C60903NvH.LJJIIZI(this.LLIL, "sharp", hashMap2);
        C60903NvH.LJJIJIIJI("dns_server_ip", this.LLILII, hashMap2);
        C60903NvH.LJJIJIIJI("abr_info", LIZ(c47752Ioe.LJJLIIIJLLLLLLLZ), hashMap2);
        C60903NvH.LJJIJIIJI("abr_general_info", LIZ(c47752Ioe.LJJLL), hashMap2);
        C60903NvH.LJJIJIIJI("enc_key", this.LLILIL, hashMap2);
        C60903NvH.LJJIJIIJI("hw_codec_name", this.LLILLJJLI, hashMap2);
        C60903NvH.LJJIIZI(this.LLILLL, "hw_codec_exception", hashMap2);
        C60903NvH.LJJIIZI(this.LLIILII, "enable_bash", hashMap2);
        C60903NvH.LJJIIZI(this.LLIILZL, "enable_mdl", hashMap2);
        C60903NvH.LJJIIZI(this.LLILZ, "network_try_count", hashMap2);
        C60903NvH.LJJIJIIJI("chipboard", this.LLILZIL, hashMap2);
        C60903NvH.LJJIJIIJI("chiphardware", this.LLILZLL, hashMap2);
        C60903NvH.LJJIJIIJI("chiphardware_new", this.LLIZ, hashMap2);
        C60903NvH.LJJIIZI(this.LLIZLLLIL, "buffer_timeout", hashMap2);
        C60903NvH.LJJIJ(this.LLJILJIL, "dns_start_t", hashMap2);
        C60903NvH.LJJIJ(this.LLJILJILJ, "dns_end_t", hashMap2);
        C60903NvH.LJJIJIIJI("dns_type", c47752Ioe.LJIJJ, hashMap2);
        C60903NvH.LJJIJ(this.LLJILLL, "player_created_t", hashMap2);
        C60903NvH.LJJIIZI(this.LJJJJI, "errt", hashMap2);
        C60903NvH.LJJIIZI(this.LJJJJIZL, "errc", hashMap2);
        C60903NvH.LJJIIZI(this.LJJJJJ, "fir_errt", hashMap2);
        C60903NvH.LJJIIZI(this.LJJJJJL, "fir_errc", hashMap2);
        C60903NvH.LJJIIZI(this.LJJJJL, "fir_errc_in", hashMap2);
        C60903NvH.LJJIIZI(this.LJJJJLI, "vsc", hashMap2);
        C60903NvH.LJJIJIIJI("vsc_message", this.LJJJJLL, hashMap2);
        C60903NvH.LJJIJIIJI("sub_events", LIZ(this.LLJJ), hashMap2);
        C60903NvH.LJJIJIIJI("mask_events", LIZ(this.LLJJI), hashMap2);
        C60903NvH.LJJIIZI(this.LLJJIII, "lv_reason", hashMap2);
        C60903NvH.LJJIIZI(this.LLJJIJI, "lv_bt", hashMap2);
        C60903NvH.LJJIIZI(this.LLJJIJIIJIL, "lv_method", hashMap2);
        C60903NvH.LJJIIZI(this.LLJJIJIL, "sat", hashMap2);
        C60903NvH.LJJIJ(this.LLJJJ, "lsst", hashMap2);
        C60903NvH.LJJIJ(this.LLJJJIL, "lset", hashMap2);
        C60903NvH.LJJIJ(this.LLJJJJ, "lbst", hashMap2);
        C60903NvH.LJJIJ(this.LLJJJJJIL, "lbet", hashMap2);
        C60903NvH.LJJIIZI(this.LLJJLIIIJLLLLLLLZ, "lsp", hashMap2);
        C60903NvH.LJJIJ(this.LLJL, "sl_diff", hashMap2);
        C60903NvH.LJJIJIIJI("trace_id", this.LLJLIL, hashMap2);
        C60903NvH.LJJIIZI(this.LLJ, "network_timeout", hashMap2);
        C60903NvH.LJJIIZI(this.LLJI, "is_pref_near_sam", hashMap2);
        C60903NvH.LJJIIZI(this.LLJIJIL, "is_disable_short_seek", hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJJJI, "drm_type", hashMap2);
        C60903NvH.LJJIJIIJI("drm_token_url", c47752Ioe.LJJJJIZL, hashMap2);
        C60903NvH.LJJIIZI(this.LLJLILLLLZIIL, "check_hijack", hashMap2);
        C60903NvH.LJJIIZI(this.LLJLL, "hijack_retry", hashMap2);
        C60903NvH.LJJIIZI(this.LLJLLIL, "first_hijack_code", hashMap2);
        C60903NvH.LJJIIZI(this.LLJLLL, "last_hijack_code", hashMap2);
        C60903NvH.LJJIJIIJI("mdl_loader_type", this.LJLLL, hashMap2);
        C60903NvH.LJJIJIIJI("mdl_version", c47752Ioe.LJJJLL, hashMap2);
        C60903NvH.LJJIIZI(this.LLLFFI, "dns_mod", hashMap2);
        C60903NvH.LJJIIZI(this.LLL, "vd_err", hashMap2);
        C60903NvH.LJJIIZI(this.LLLF, "ad_err", hashMap2);
        C60903NvH.LJJIIZI(this.LLLFF, "vr_err", hashMap2);
        C60903NvH.LJJIJIIJI("net_type", c47752Ioe.LJJJJZI, hashMap2);
        C60903NvH.LJJIJ(this.LLLFZ, "vpls", hashMap2);
        C60903NvH.LJJIJ(this.LLLII, "d_apls", hashMap2);
        C60903NvH.LJJIJ(this.LLLI, "d_vpls", hashMap2);
        C60903NvH.LJJIIZI(this.LLLIIII, "mr", hashMap2);
        C60903NvH.LJJIIZI(this.LLLIIIL, "mr_dv", hashMap2);
        C60903NvH.LJJIIZI(this.LLLIIIIL, "mr_da", hashMap2);
        C60903NvH.LJJIIZ((float) this.LLLIIL, "vt_speed", hashMap2);
        C60903NvH.LJJIIZ((float) this.LLLIILIL, "end_speed", hashMap2);
        C60903NvH.LJJIIZI(this.LLLILZ, "mediacodec_render", hashMap2);
        C60903NvH.LJJIIZI(this.LLLILZJ, "tr", hashMap2);
        C60903NvH.LJJIIZI(this.LLLIZZ, "tr_err", hashMap2);
        C60903NvH.LJJIIZI(this.LLLJ, "cp", hashMap2);
        C60903NvH.LJJIJ(this.LLLL, "bit_rate", hashMap2);
        C60903NvH.LJJIJ(this.LLLLII, "audio_bitrate", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLIIIILLL, "cold_start", hashMap2);
        C60903NvH.LJJIJ(this.LLLLIIL, "av_gap", hashMap2);
        C60903NvH.LJJIJ(this.LLLLIILL, "moov_pos", hashMap2);
        C60903NvH.LJJIJ(this.LLLLIILLL, "mdat_pos", hashMap2);
        C60903NvH.LJJIJ(this.LLLLIL, "frange_size", hashMap2);
        C60903NvH.LJJIJ(this.LLLLJ, "video_model_version", hashMap2);
        C60903NvH.LJJIJ(this.LIZ, "prepare_before_play_t", hashMap2);
        C60903NvH.LJJIJ(this.LIZIZ, "setds_t", hashMap2);
        C60903NvH.LJJIJ(this.LIZJ, "ps_t", hashMap2);
        C60903NvH.LJJIJ(this.LIZLLL, "pt_new", hashMap2);
        C60903NvH.LJJIJ(this.LJ, "a_dns_start_t", hashMap2);
        C60903NvH.LJJIJ(this.LJFF, "formater_create_t", hashMap2);
        C60903NvH.LJJIJ(this.LJI, "avformat_open_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIIIIZZ, "demuxer_begin_t", hashMap2);
        C60903NvH.LJJIJ(this.LJII, "demuxer_create_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIIIZ, "dec_create_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIIJ, "outlet_create_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIIJJI, "v_render_f_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIIL, "a_render_f_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIILIIL, "a_dec_start_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIILJJIL, "v_dec_start_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIILL, "a_dec_opened_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIILLIIL, "v_dec_opened_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIJ, "a_http_open_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIIZILJ, "v_http_open_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIJI, "v_tran_open_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIJJ, "a_tran_open_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIJJLI, "v_sock_create_t", hashMap2);
        C60903NvH.LJJIJ(this.LJIL, "a_sock_create_t", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLLJLJLL, "radio_mode", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLLL ? 1 : 0, "v_disabled", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLLLIL ? 1 : 0, "a_disabled", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLLLJ, "is_replay", hashMap2);
        C60903NvH.LJJIJIIJI("play_log_id", this.LLLLLLZ, hashMap2);
        C60903NvH.LJJIIZI(this.LLLLLLL, "enable_nnsr", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLLLLLLL, "at_r", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLLLLLL, "at_rs", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLLZL, "video_codec_profile", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLZ, "audio_codec_profile", hashMap2);
        C60903NvH.LJJIJIIJI("last_sessionid", this.LLLLLLZZ, hashMap2);
        C60903NvH.LJJIJIIJI("nettype_list", LIZ(this.LLLLZLLIL), hashMap2);
        C60903NvH.LJJIJIIJI("sigstrength_list", LIZ(this.LLLLZLLLI), hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "netspeed_list", this.LLLZ);
        C60903NvH.LJJIJIIJIL(hashMap2, "catowerrttms_list", this.LLLZL);
        C60903NvH.LJJIIZI(this.LLLZLZ, "netquality_int", hashMap2);
        C60903NvH.LJJIJIIJI("features", LIZ(this.LLZIL), hashMap2);
        C60903NvH.LJJIJIIJI("features_core", LIZ(this.LLZILL), hashMap2);
        C60903NvH.LJJIIZI(this.LLLZZIL, "network_score", hashMap2);
        C60903NvH.LJJIJ(this.LLLJIL, "before_play_buffer_start_t", hashMap2);
        C60903NvH.LJJIJ(this.LLLJL, "before_play_buffer_end_t", hashMap2);
        C60903NvH.LJJIIZ(this.LLLLZLL, "st_net_speed", hashMap2);
        C60903NvH.LJJIJIIJI("v_file_hash", this.LLLLLZ, hashMap2);
        C60903NvH.LJJIJIIJI("a_file_hash", this.LLLLLZIL, hashMap2);
        C60903NvH.LJJIIZI(this.LLLLL, "max_frame_in_mc", hashMap2);
        C60903NvH.LJJIIZI(this.J0, "video_abnormal_code", hashMap2);
        C60903NvH.LJJIIZI(this.K0, "video_abnormal_strategy", hashMap2);
        C60903NvH.LJJIIZI(this.L0, "video_abnormal_interval", hashMap2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("video_abnormal_code: ");
        LIZ.append(this.J0);
        LIZ.append(" video_abnormal_strategy: ");
        LIZ.append(this.K0);
        LIZ.append(" video_abnormal_interval: ");
        C47956Irw.LIZIZ(LIZ, this.L0, LIZ, "VideoEventOnePlay");
        C60903NvH.LJJIJIIJI("gear_strategy_info", LIZ(this.LLZLLLL), hashMap2);
        C60903NvH.LJJIJIIJI("sr_strategy_info", LIZ(this.LLZZ), hashMap2);
        C60903NvH.LJJIJIIJI("sr_preload_info", LIZ(this.LLZZJLIL), hashMap2);
        C60903NvH.LJJIJIIJI("mdl_preload_info", c47752Ioe.LJJLIIIJLJLI, hashMap2);
        C60903NvH.LJJIJIIJI("cur_ip", c47752Ioe.LJJLIIIJILLIZJL.LIZIZ, hashMap2);
        C60903NvH.LJJIJIIJI("cur_host", c47752Ioe.LJJLIIIJILLIZJL.LIZJ, hashMap2);
        C60903NvH.LJJIJIIJI("cur_url", c47752Ioe.LJJLIIIJILLIZJL.LIZLLL, hashMap2);
        C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJ, "reply_size", hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJILLIZJL.LJI, "mdl_speed", hashMap2);
        C60903NvH.LJJIJIIJI("mdl_file_key", c47752Ioe.LJJLIIIJILLIZJL.LJII, hashMap2);
        C60903NvH.LJJIJIIJI("mdl_re_url", c47752Ioe.LJJLIIIJILLIZJL.LJIIIIZZ, hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJILLIZJL.LJFF, "mdl_ec", hashMap2);
        C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJIIIZ, "end_t", hashMap2);
        C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJILLIZJL.LJIIJ, "mdl_dns_t", hashMap2);
        c47752Ioe.LJJLIIIJILLIZJL.getClass();
        C60903NvH.LJJIIZI(LiveLayoutPreloadThreadPriority.DEFAULT, "mdl_seek_num", hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJILLIZJL.LJIILIIL, "mdl_v_p2p_ier", hashMap2);
        C60903NvH.LJJIJIIJI("mdl_ip_list", c47752Ioe.LJJLIIIJILLIZJL.LJIILJJIL, hashMap2);
        C60903NvH.LJJIJIIJI("mdl_blocked_ips", c47752Ioe.LJJLIIIJILLIZJL.LJIILL, hashMap2);
        C60903NvH.LJJIJIIJI("mdl_response_cache", c47752Ioe.LJJLIIIJILLIZJL.LJIILLIIL, hashMap2);
        C60903NvH.LJJIJIIJI("mdl_response_cinfo", c47752Ioe.LJJLIIIJILLIZJL.LJIIZILJ, hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJILLIZJL.LJIJ, "mdl_disable_seek", hashMap2);
        C60903NvH.LJJIJIIJI("a_cur_ip", c47752Ioe.LJJLIIIJJI.LIZIZ, hashMap2);
        C60903NvH.LJJIJIIJI("a_cur_host", c47752Ioe.LJJLIIIJJI.LIZJ, hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIJJI.LJI, "a_mdl_speed", hashMap2);
        C60903NvH.LJJIJ(c47752Ioe.LJJLIIIJJI.LJIIJ, "a_mdl_dns_t", hashMap2);
        C60903NvH.LJJIJIIJI("a_mdl_ip_list", c47752Ioe.LJJLIIIJJI.LJIILJJIL, hashMap2);
        C60903NvH.LJJIJIIJI("a_mdl_response_cache", c47752Ioe.LJJLIIIJJI.LJIILLIIL, hashMap2);
        C60903NvH.LJJIJIIJI("a_mdl_response_cinfo", c47752Ioe.LJJLIIIJJI.LJIIZILJ, hashMap2);
        C60903NvH.LJJIJ(this.LLZL, "custom_click_t", hashMap2);
        C60903NvH.LJJIJ(this.LLZLI, "custom_vm_t", hashMap2);
        C60903NvH.LJJIJ(this.LLZLL, "custom_init_t", hashMap2);
        C60903NvH.LJJIJ(this.LLZLLIL, "custom_play_t", hashMap2);
        C60903NvH.LJJIIZI(this.LLLLLIL, "underrun_count", hashMap2);
        C60903NvH.LJJIIZ(this.LLLLLILLIL, "audio_rtf", hashMap2);
        C60903NvH.LJJIIZI(this.u, "screen_w", hashMap2);
        C60903NvH.LJJIIZI(this.v, "screen_h", hashMap2);
        C60903NvH.LJJIIZI(this.w, "p_density", hashMap2);
        C60903NvH.LJJIIZ(this.x, "xdpi", hashMap2);
        C60903NvH.LJJIIZ(this.y, "ydpi", hashMap2);
        C60903NvH.LJJIIZ(this.z, "sr_w", hashMap2);
        C60903NvH.LJJIIZ(this.A, "sr_h", hashMap2);
        C60903NvH.LJJIIZI(this.D, "sr_algorithm", hashMap2);
        C60903NvH.LJJIIZ(this.B, "sr_process_rate", hashMap2);
        C60903NvH.LJJIIZ(this.C, "sr_process_act", hashMap2);
        C60903NvH.LJJIIZI(this.E, "enble_bmf", hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "eye_filter", this.F);
        C60903NvH.LJJIJIIJIL(hashMap2, "bright_list", this.G);
        C60903NvH.LJJIJIIJIL(hashMap2, "view_size_list", this.H);
        C60903NvH.LJJIJIIJIL(hashMap2, "vr_distance_list", this.b0);
        C60903NvH.LJJIIZ(this.c0, "vr_frame_rate", hashMap2);
        C60903NvH.LJJIIZI(this.d0, "vr_screen_refresh_rate", hashMap2);
        C60903NvH.LJJIJ(this.e0, "vr_head_movement_delay", hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "play_list", this.LLZZLLIL);
        C60903NvH.LJJIJIIJIL(hashMap2, "pause_list", this.LLZZZIL);
        C60903NvH.LJJIJIIJIL(hashMap2, "resolution_list", this.LLZZZZ);
        C60903NvH.LJJIJIIJIL(hashMap2, "playspeed_list", this.a);
        C60903NvH.LJJIJIIJIL(hashMap2, "radiomode_list", this.b);
        C60903NvH.LJJIJIIJIL(hashMap2, "loop_list", this.c);
        C60903NvH.LJJIJIIJIL(hashMap2, "error_list", this.d);
        C60903NvH.LJJIJIIJIL(hashMap2, "rebuf_list", this.e);
        C60903NvH.LJJIJIIJIL(hashMap2, "seek_list", this.f);
        C60903NvH.LJJIJIIJIL(hashMap2, "av_outsync_list", this.g);
        C60903NvH.LJJIIZI(this.f76n, "av_outsync_count", hashMap2);
        C60903NvH.LJJIIZI(this.s, "color_trc", hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "headset_list", this.h);
        C60903NvH.LJJIIZI(this.t, "hw_conf_type", hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "no_a_list", this.j);
        C60903NvH.LJJIJIIJIL(hashMap2, "no_v_list", this.i);
        C60903NvH.LJJIIZI(this.f73J ? 1 : 0, "is_reuse_engine", hashMap2);
        C60903NvH.LJJIJ(this.LLLLZI, "v_duration", hashMap2);
        C60903NvH.LJJIJ(this.LLLLZIL, "a_duration", hashMap2);
        C60903NvH.LJJIIZI(this.K, "view_hidden", hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "power", this.k);
        C60903NvH.LJJIJIIJIL(hashMap2, "is_charging", this.l);
        C60903NvH.LJJIJIIJI("r_stage_errcs", this.L, hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "bad_interlaced_list", this.m);
        C60903NvH.LJJIIZI(this.M, "no_surface_play", hashMap2);
        C60903NvH.LJJIIZI(this.LLLIL, "net_conn_cnt", hashMap2);
        C60903NvH.LJJIIZI(this.f75Y, "video_style", hashMap2);
        C60903NvH.LJJIIZI(this.Z, "dimension", hashMap2);
        C60903NvH.LJJIIZI(this.a0, "projection_model", hashMap2);
        C60903NvH.LJJIIZI(this.j0, "view_size", hashMap2);
        C60903NvH.LJJIIZ((float) this.N, "cpu_rate_begin", hashMap2);
        C60903NvH.LJJIIZ((float) this.O, "cpu_rate_end", hashMap2);
        C60903NvH.LJJIIZ((float) this.P, "cpu_speed_begin", hashMap2);
        C60903NvH.LJJIIZ((float) this.Q, "cpu_speed_end", hashMap2);
        C60903NvH.LJJIIZI(this.R, "power_save_begin", hashMap2);
        C60903NvH.LJJIIZI(this.S, "power_save_end", hashMap2);
        C60903NvH.LJJIIZ(this.T, "battery_current", hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "battery_current_list", this.LLLZLL);
        C60903NvH.LJJIJIIJIL(hashMap2, "gear_info_list", c47752Ioe.LJII);
        C60903NvH.LJJIIZI(this.k0, "engine_hashcode", hashMap2);
        C60903NvH.LJJIJIIJI("enginepool_is_from_enginepool", this.l0, hashMap2);
        C60903NvH.LJJIIZI(this.m0, "enginepool_corepoolsize_upper_limit", hashMap2);
        C60903NvH.LJJIIZI(this.n0, "enginepool_corepoolsize_before_getengine", hashMap2);
        C60903NvH.LJJIIZI(this.o0, "enginepool_count_of_engine_in_use", hashMap2);
        C60903NvH.LJJIJIIJI("tr_v", this.q0, hashMap2);
        C60903NvH.LJJIIZ(this.r0.floatValue(), "tr_fps", hashMap2);
        String abstractCollection = this.s0.toString();
        if (abstractCollection.length() > 1024) {
            abstractCollection = abstractCollection.substring(0, 1024);
        }
        C60903NvH.LJJIJIIJI("eff_list", abstractCollection, hashMap2);
        String str2 = this.t0;
        if (str2.length() > 256) {
            str2 = str2.substring(0, 256);
        }
        C60903NvH.LJJIJIIJI("eff_avrtime", str2, hashMap2);
        C60903NvH.LJJIIZ(this.u0.floatValue(), "eff_chain_avrtime", hashMap2);
        String str3 = this.v0;
        if (str3.length() > 1024) {
            str3 = str3.substring(0, 1024);
        }
        C60903NvH.LJJIJIIJI("eff_errc", str3, hashMap2);
        C60903NvH.LJJIIZI(this.w0, "ott_plugin_v", hashMap2);
        C60903NvH.LJJIJIIJI("company_id", this.x0, hashMap2);
        int i = this.y0;
        if (i >= 2) {
            C60903NvH.LJJIIZI(i, "crosstalk_count", hashMap2);
            C60903NvH.LJJIJIIJIL(hashMap2, "crosstalk_info_list", this.z0);
        }
        int i2 = this.U;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str = "guest_mode";
                }
            } else {
                str = "teen_mode";
            }
        } else {
            str = "user_disagree";
        }
        C60903NvH.LJJIJIIJI("sensitive_mode", str, hashMap2);
        C60903NvH.LJJIIZ((float) this.LLZ, "target_bitrate", hashMap2);
        C60903NvH.LJJIIZI(this.V, "expire_play_code", hashMap2);
        C60903NvH.LJJIJ(this.W, "mask_download_size", hashMap2);
        C60903NvH.LJJIJ(this.f74X, "subtitle_download_size", hashMap2);
        C60903NvH.LJJIIZI(this.f0, "cast_info_is_cast_live", hashMap2);
        C60903NvH.LJJIIZI(this.g0, "cast_info_source_app_id", hashMap2);
        C60903NvH.LJJIIZI(this.h0, "cast_info_scene_id", hashMap2);
        C60903NvH.LJJIJIIJI("cast_info_protocal", this.i0, hashMap2);
        C60903NvH.LJJIIZI(this.p0, "host_abi_b", hashMap2);
        C60903NvH.LJJIIZI(c47752Ioe.LJJLIIIIJ ? 1 : 0, "has_get_preload_traceid", hashMap2);
        C60903NvH.LJJIJIIJI("custom_play_session_id", this.A0, hashMap2);
        C60903NvH.LJJIJIIJI("mdl_group_id", this.B0, hashMap2);
        C60903NvH.LJJIIZI(this.D0, "background_play", hashMap2);
        C60903NvH.LJJIIZI(this.E0, "background_stop", hashMap2);
        C60903NvH.LJJIJIIJIL(hashMap2, "minmax_play_speed", this.O0);
        C47769Iov c47769Iov = C47874Iqc.LIZ;
        if (c47769Iov.LIZJ > 0) {
            java.util.Map<String, Object> LIZJ = c47769Iov.LIZJ();
            if (((HashMap) LIZJ).size() > 0) {
                String LIZ2 = LIZ(LIZJ);
                C60903NvH.LJJIJIIJI("metrics_info_new", LIZ2, hashMap2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("metrics_info :");
                LIZ3.append(LIZ2);
                TTVideoEngineLog.d("VideoEventOnePlay", X1D.LIZIZ(LIZ3));
            }
        }
        C47534Il8 c47534Il8 = C47533Il7.LIZ;
        c47534Il8.getClass();
        HashMap hashMap3 = new HashMap(c47534Il8.LIZ);
        if (hashMap3.size() > 0) {
            C60903NvH.LJJIJIIJI("portrait_labels", LIZ(hashMap3), hashMap2);
        }
        C60903NvH.LJJIJIIJI("vs_impression_id", C47538IlC.LIZ.LJ(), hashMap2);
        if (!TextUtils.isEmpty(c47752Ioe.LJJII) && c47752Ioe.LJJII.equals("feed")) {
            C60903NvH.LJJIIZI(this.F0 ? 1 : 0, "vm_fbapi", hashMap2);
        }
        C60903NvH.LJJIIZI(this.G0, "initial_enable_mdl", hashMap2);
        C60903NvH.LJJIIZI(this.H0, "mdl_invalid_code", hashMap2);
        C60903NvH.LJJIIZI(this.I0, "mdl_init_state", hashMap2);
        C60903NvH.LJJIJIIJI("mdl_init_err", this.M0, hashMap2);
        C47529Il3 c47529Il3 = C47147Iet.LIZ;
        String str4 = c47752Ioe.LJJIFFI;
        C47524Iky c47524Iky = c47529Il3.LJIIZILJ;
        c47524Iky.getClass();
        if (!TextUtils.isEmpty(str4)) {
            java.util.Map map = (java.util.Map) ((ConcurrentHashMap) c47524Iky.LIZ).get(str4);
            if (map != null) {
                hashMap = C47524Iky.LIZ(map);
            } else {
                hashMap = new HashMap();
            }
            hashMap.putAll(c47524Iky.LIZIZ);
            String stringValue = c47529Il3.LJ().getStringValue(31301, str4);
            if (!TextUtils.isEmpty(stringValue)) {
                hashMap.put("st_preload_sc_info", stringValue);
            }
            if (!((ConcurrentLinkedQueue) c47524Iky.LIZJ).isEmpty()) {
                hashMap.put("st_throws", c47524Iky.LIZJ);
                ((ConcurrentLinkedQueue) c47524Iky.LIZJ).clear();
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("vid: ");
            LIZ4.append(str4);
            LIZ4.append(", gotten log data: ");
            LIZ4.append(hashMap);
            C78253UnR.LJI("StrategyEvent", X1D.LIZIZ(LIZ4));
            if (hashMap.size() > 0) {
                hashMap2.putAll(hashMap);
            }
        }
        c47529Il3.LJIIJ(c47752Ioe.LJJIFFI);
        String str5 = c47752Ioe.LJJJJLI;
        c47529Il3.LJIIZILJ.getClass();
        java.util.Map LIZJ2 = C47524Iky.LIZJ(0, str5);
        if (LIZJ2 != null && ((HashMap) LIZJ2).size() > 0) {
            hashMap2.putAll(LIZJ2);
        }
        C11030bz c11030bz = this.C0;
        if (c11030bz != null) {
            hashMap2.put("label_usage", c11030bz.LJI(hashMap2));
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("play_time:");
        LIZ5.append(this.LJJ);
        LIZ5.append(", pt_new:");
        LIZ5.append(this.LIZLLL);
        LIZ5.append(",ps_t:");
        LIZ5.append(this.LIZJ);
        LIZ5.append(", vv_time:");
        LIZ5.append(this.LJJIIJ);
        LIZ5.append(", lwp_time:");
        LIZ5.append(this.LJJIIZI);
        LIZ5.append(", outsync count:");
        LIZ5.append(this.f76n);
        LIZ5.append(", outsync list:");
        LIZ5.append(this.g);
        LIZ5.append(", vs:");
        LIZ5.append(c47752Ioe.LJJIIZI);
        LIZ5.append(", vtype:");
        LIZ5.append(c47752Ioe.LJJIJLIJ);
        LIZ5.append(", cur_url:");
        LIZ5.append(c47752Ioe.LJJLIIIJILLIZJL.LIZLLL);
        LIZ5.append(", features:");
        LIZ5.append(this.LLZIL);
        LIZ5.append(", featuresCore:");
        LIZ5.append(this.LLZILL);
        LIZ5.append(", exception:");
        LIZ5.append(this.LJJLIIIJ);
        TTVideoEngineLog.d("VideoEventOnePlay", X1D.LIZIZ(LIZ5));
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("no_a_list: ");
        LIZ6.append(this.j);
        LIZ6.append(", no_v_list: ");
        LIZ6.append(this.i);
        TTVideoEngineLog.d("VideoEventOnePlay", X1D.LIZIZ(LIZ6));
        InterfaceC46858IaE interfaceC46858IaE = c47752Ioe.LIZ;
        if (interfaceC46858IaE != null && ((C47619ImV) interfaceC46858IaE).LIZJ(148) == 1) {
            hashMap2.putAll(LIZIZ(c47752Ioe));
        }
        if (TTVideoEngine.LJIIZILJ == 0) {
            C60903NvH.LJJIJIIJI("quality_list", LIZ(this.LLLZI), hashMap2);
            C60903NvH.LJJIJIIJI("bitrate_list", LIZ(this.LLLZIIL), hashMap2);
            C60903NvH.LJJIJIIJIL(hashMap2, "catowerrtt_list", this.LLLZIL);
            C60903NvH.LJJIJ(this.LLLLILI, "net_speed_level", hashMap2);
            C60903NvH.LJJIJIIJI("playparam", LIZ(this.LJZ), hashMap2);
        }
        return new JSONObject(hashMap2);
    }
}
