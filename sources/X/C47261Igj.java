package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.service.FeedComponentServiceImpl;
import com.ss.android.ugc.aweme.feed.service.IFeedComponentService;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import defpackage.e1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import libcore.io.Memory;
import org.json.JSONObject;

/* renamed from: X.Igj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47261Igj implements InterfaceC83507Wpz, IIsTagNeedUpdatedListener, InterfaceC64450PRe, L6U {
    public static volatile IFeedComponentService LJLIL = null;
    public static String LJLILLLLZI = "Bench-";
    public static byte LJLJI = 3;

    public static boolean LJJIIJZLJL(int i) {
        return (i <= 0 || i == 7 || i == 8 || i == 10) ? false : true;
    }

    public static final boolean LJJIIZ(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }

    public static final float LJJJJJL(float f) {
        return (f / 2) + 0.5f;
    }

    public static final float LJJJJL(float f) {
        return 0.5f - (f / 2);
    }

    public static Class LJJJJZI() {
        return Memory.class;
    }

    @Override // X.L6U
    public boolean LJFF() {
        return false;
    }

    @Override // X.L6U
    public boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC83507Wpz
    public void LJIJ(java.util.Map map) {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
    public void onTagNeedNotUpdate() {
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
    public void onTagNeedUpdate() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        r0 = r3[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        r5.close();
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        X.C78685UuP.LJJ();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064 A[Catch: IOException -> 0x0068, TRY_LEAVE, TryCatch #2 {IOException -> 0x0068, blocks: (B:51:0x005f, B:46:0x0064), top: B:50:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIJJ() {
        /*
            java.lang.String r6 = ":"
            r2 = 0
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            java.lang.String r0 = "/proc/cpuinfo"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L5a
            r4.<init>(r5)     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L5a
        Lf:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            if (r1 == 0) goto L42
            boolean r0 = r1.contains(r6)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            if (r0 == 0) goto Lf
            java.lang.String[] r3 = r1.split(r6)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r2 = 0
            r1 = r3[r2]     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            java.lang.String r0 = "Hardware"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            if (r0 != 0) goto L34
            r1 = r3[r2]     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            java.lang.String r0 = "model name"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            if (r0 == 0) goto Lf
        L34:
            r0 = 1
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r5.close()     // Catch: java.io.IOException -> L3e
            r4.close()     // Catch: java.io.IOException -> L3e
            goto L41
        L3e:
            X.C78685UuP.LJJ()
        L41:
            return r0
        L42:
            r5.close()     // Catch: java.io.IOException -> L77
            r4.close()     // Catch: java.io.IOException -> L77
            goto L7a
        L49:
            r0 = move-exception
            r2 = r4
            goto L5b
        L4c:
            r2 = r4
        L4d:
            r1 = r2
            r2 = r5
            goto L54
        L50:
            r0 = move-exception
            r1 = r2
            goto L5d
        L53:
            r1 = r2
        L54:
            X.C78685UuP.LJJ()     // Catch: java.lang.Throwable -> L58
            goto L6c
        L58:
            r0 = move-exception
            goto L5d
        L5a:
            r0 = move-exception
        L5b:
            r1 = r2
            r2 = r5
        L5d:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L68
        L62:
            if (r1 == 0) goto L6b
            r1.close()     // Catch: java.io.IOException -> L68
            goto L6b
        L68:
            X.C78685UuP.LJJ()
        L6b:
            throw r0
        L6c:
            if (r2 == 0) goto L71
            r2.close()     // Catch: java.io.IOException -> L77
        L71:
            if (r1 == 0) goto L7a
            r1.close()     // Catch: java.io.IOException -> L77
            goto L7a
        L77:
            X.C78685UuP.LJJ()
        L7a:
            java.lang.String r0 = android.os.Build.BOARD
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47261Igj.LJIJJ():java.lang.String");
    }

    public static IFeedComponentService LJIL() {
        IFeedComponentService iFeedComponentService;
        if (LJLIL == null) {
            Object LIZ = C58096Mr6.LIZ(IFeedComponentService.class, false);
            if (LIZ != null) {
                iFeedComponentService = (IFeedComponentService) LIZ;
            } else {
                if (C58096Mr6.K0 == null) {
                    synchronized (IFeedComponentService.class) {
                        if (C58096Mr6.K0 == null) {
                            C58096Mr6.K0 = new FeedComponentServiceImpl();
                        }
                    }
                }
                iFeedComponentService = C58096Mr6.K0;
            }
            LJLIL = iFeedComponentService;
        }
        return LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CompileConfigResolution LJJIFFI() {
        int i;
        int i2;
        if (C19N.LJ("enable_1080p_photo_to_video", false)) {
            i = 1080;
            i2 = 1920;
        } else {
            i = 720;
            i2 = 1280;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoMVMaxResolution v1 , maxResolution = (");
        LIZ.append(i);
        LIZ.append(", ");
        LIZ.append(i2);
        LIZ.append(')');
        C5Z5.LIZ(X1D.LIZIZ(LIZ));
        return new CompileConfigResolution(i, i2, null, 0 == true ? 1 : 0, 12, 0 == true ? 1 : 0);
    }

    public static final String LJJII() {
        StringBuilder sb = new StringBuilder();
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
        StackTraceElement[] stackTrace = LLLLIIIILLL.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "buffer.toString()");
        return sb2;
    }

    public static boolean LJJIII() {
        return e1.LIZ(31744, "optimize_abreport", true, false);
    }

    public static final void LJJJJIZL() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void LJJJJJ() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @Override // X.InterfaceC83507Wpz
    public void LIZ() {
        C45685HwP c45685HwP = C45685HwP.LJFF;
        if (c45685HwP != null) {
            c45685HwP.LIZ();
        }
    }

    @Override // X.InterfaceC83507Wpz
    public int LIZLLL() {
        return C00F.LIZ(31744, 100, "green_screen_tray_material_experiment", true);
    }

    public static final boolean LJIJI() {
        if (LJJIFFI().getWidth() >= 1080) {
            return true;
        }
        return false;
    }

    public static final C61878OQg LJIIZILJ() {
        return C61878OQg.INSTANCE;
    }

    public static final ArrayList LJII(Object... elements) {
        o.LJIIIZ(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new ORD(true, elements));
    }

    public static java.util.Map LJIIJ(java.util.Map map) {
        String str;
        HashMap hashMap = new HashMap();
        if (C1DG.LIZ().getConfig().getCommonConfig().isUseLastNetworkSpeed()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("config_quality", String.valueOf(1));
        hashMap.put("use_last_network_speed", str);
        hashMap.put("internet_speed", String.valueOf(map.get("internet_speed")));
        int LIZLLL = IZ8.LIZLLL();
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) map.get("sim_video_url_model");
        float f = 1.0f;
        if (simVideoUrlModel != null && !TextUtils.isEmpty(simVideoUrlModel.getMeta())) {
            try {
                JSONObject json = IZG.from(simVideoUrlModel.getMeta()).getJson();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("");
                LIZ.append(1.0f);
                String optString = json.optString("qprf", X1D.LIZIZ(LIZ));
                if (!TextUtils.isEmpty(optString)) {
                    f = CastFloatProtector.parseFloat(optString);
                }
            } catch (Exception unused) {
            }
        }
        C46664ITc c46664ITc = C46664ITc.LJIJ;
        String sourceId = simVideoUrlModel.getSourceId();
        c46664ITc.getClass();
        if (!TextUtils.isEmpty(sourceId)) {
            c46664ITc.LJIILL.put(sourceId, Float.valueOf(f));
        }
        hashMap.put("curve_adjust_mode", String.valueOf(LIZLLL));
        hashMap.put("curve_adjust_factor", String.valueOf(f));
        if (C46862IaI.LIZJ == null) {
            C46862IaI.LIZJ = new Integer(C1DG.LIZ().getConfig().getCommonConfig().getLastNetworkSpeed());
        }
        Integer num = C46862IaI.LIZJ;
        if (num != null) {
            hashMap.put("initial_speed", num.toString());
        }
        IY3 iy3 = (IY3) map.get("bitrate_curve");
        hashMap.put("dynamic_curve", "param_a=" + iy3.LIZ() + "&param_b=" + iy3.LJ() + "&param_c=" + iy3.LIZIZ() + "&param_d=" + iy3.LIZLLL() + "&min_bitrate=" + iy3.LIZJ());
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fd, code lost:
    
        if (((java.lang.String) com.bytedance.mt.protector.impl.collections.ListProtector.get(r9.getUrlList(), 0)).endsWith("mp3") != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C47156If2 LJIIJJI(java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47261Igj.LJIIJJI(java.util.Map):X.If2");
    }

    public static VA3 LJIILIIL(float f) {
        return LJIL().LIZIZ(f);
    }

    public static void LJIILJJIL(String str) {
        if ((LJLJI & 8) != 0) {
            StringBuilder LIZ = X1D.LIZ();
            C0MT.LJ(LIZ, LJLILLLLZI, str, LIZ);
        }
    }

    public static void LJIILL(String str) {
        if ((LJLJI & 1) != 0) {
            StringBuilder LIZ = X1D.LIZ();
            C0MT.LJ(LIZ, LJLILLLLZI, str, LIZ);
        }
    }

    public static boolean LJIILLIIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return PatternProtector.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(str).matches();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Effect LJIJJLI(AbstractC77369UYb abstractC77369UYb) {
        o.LJIIIZ(abstractC77369UYb, "<this>");
        if (abstractC77369UYb instanceof InterfaceC47392Iiq) {
            return ((InterfaceC47392Iiq) abstractC77369UYb).LIZ();
        }
        return new Effect(null, 1, 0 == true ? 1 : 0);
    }

    public static final C40517FvF LJJ(Collection collection) {
        o.LJIIIZ(collection, "<this>");
        return new C40517FvF(0, collection.size() - 1);
    }

    public static final int LJJI(List list) {
        o.LJIIIZ(list, "<this>");
        return list.size() - 1;
    }

    public static void LJJIIJ(String str) {
        if ((LJLJI & 4) != 0) {
            StringBuilder LIZ = X1D.LIZ();
            C0MT.LJ(LIZ, LJLILLLLZI, str, LIZ);
        }
    }

    public static final boolean LJJIIZI(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        if (aweme.getAwemeType() == 160) {
            return true;
        }
        return false;
    }

    public static final List LJJIJ(Object obj) {
        List singletonList = Collections.singletonList(obj);
        o.LJIIIIZZ(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final List LJJIJIIJI(Object... elements) {
        o.LJIIIZ(elements, "elements");
        if (elements.length > 0) {
            return C61898ORa.LJIILL(elements);
        }
        return C61878OQg.INSTANCE;
    }

    public static final List LJJIJIIJIL(Object obj) {
        if (obj != null) {
            return LJJIJ(obj);
        }
        return C61878OQg.INSTANCE;
    }

    public static final List LJJIJIL(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new ORD(true, objArr));
    }

    public static final List LJJIJLIJ(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return LJJIJ(ListProtector.get(list, 0));
        }
        return C61878OQg.INSTANCE;
    }

    public static final List LJJJIL(Iterable iterable) {
        o.LJIIIZ(iterable, "<this>");
        List LLJILJIL = ORZ.LLJILJIL(iterable);
        Collections.shuffle(LLJILJIL);
        return LLJILJIL;
    }

    public static void LJJJJZ(String str) {
        if ((LJLJI & 2) != 0) {
            StringBuilder LIZ = X1D.LIZ();
            C0MT.LJ(LIZ, LJLILLLLZI, str, LIZ);
        }
    }

    @Override // X.InterfaceC64450PRe
    public void LIZJ(String scene) {
        o.LJIIIZ(scene, "scene");
        C06140Ly.LIZJ(scene);
    }

    @Override // X.InterfaceC64450PRe
    public void LJ(String scene) {
        o.LJIIIZ(scene, "scene");
        C06140Ly.LIZ(scene);
    }

    public static int LJIIIZ(List list, InterfaceC88472Yns interfaceC88472Yns) {
        int size = list.size();
        o.LJIIIZ(list, "<this>");
        int i = 0;
        LJJIZ(list.size(), 0, size);
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int intValue = ((Number) interfaceC88472Yns.invoke(ListProtector.get(list, i3))).intValue();
            if (intValue < 0) {
                i = i3 + 1;
            } else if (intValue > 0) {
                i2 = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i + 1);
    }

    public static final int LJIIL(long j, long j2) {
        boolean LJJIIZ = LJJIIZ(j);
        if (LJJIIZ != LJJIIZ(j2)) {
            if (LJJIIZ) {
                return -1;
            }
            return 1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public static long LJJIJL(String str, JSONObject jSONObject) {
        try {
            return CastLongProtector.valueOf(jSONObject.optString(str)).longValue();
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static IYQ LJJIL(List list, java.util.Map map) {
        float f;
        double d;
        double d2;
        IYN iyn = null;
        try {
            HashMap hashMap = (HashMap) map;
            int parseInt = CastIntegerProtector.parseInt((String) hashMap.get("video_bitrarte"));
            int parseInt2 = CastIntegerProtector.parseInt((String) hashMap.get("audio_bitrarte"));
            if (parseInt == 0) {
                parseInt = parseInt2;
            }
            IYO iyo = new IYO();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IYN iyn2 = (IYN) it.next();
                if (iyn2.getBitRate() == parseInt) {
                    iyo.LJLIL = iyn2;
                    iyn = iyn2;
                    break;
                }
            }
            StringBuilder sb = iyo.LJLJJI;
            if (sb != null) {
                sb.append((String) hashMap.get("select_reason"));
            }
            iyo.LJLJJL = (String) hashMap.get("bitrate_curve");
            if (iyn != null) {
                try {
                    d = CastDoubleProtector.valueOf((String) hashMap.get("video_calc_bitrarte")).doubleValue();
                } catch (Throwable unused) {
                    d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                try {
                    d2 = CastDoubleProtector.valueOf((String) hashMap.get("audio_calc_bitrarte")).doubleValue();
                } catch (Throwable unused2) {
                    d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                if (d == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    d = d2;
                }
                iyo.LJLJI = d;
                String str = (String) hashMap.get("speed");
                if (!TextUtils.isEmpty(str)) {
                    try {
                        f = CastFloatProtector.parseFloat(str);
                    } catch (Throwable unused3) {
                    }
                    IYQ LIZ = IYQ.LIZ(iyo);
                    LIZ.LJLJLJ = (int) f;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("[ doSelectBitrateNative ");
                    LIZ.LJLJL = JBR.LJFF(LIZ2, (String) hashMap.get("extra_info"), "]", LIZ2);
                    return LIZ;
                }
            }
            f = -1.0f;
            IYQ LIZ3 = IYQ.LIZ(iyo);
            LIZ3.LJLJLJ = (int) f;
            StringBuilder LIZ22 = X1D.LIZ();
            LIZ22.append("[ doSelectBitrateNative ");
            LIZ3.LJLJL = JBR.LJFF(LIZ22, (String) hashMap.get("extra_info"), "]", LIZ22);
            return LIZ3;
        } catch (Throwable unused4) {
            return null;
        }
    }

    public static final String LJJJ(android.net.Uri safeGetQueryParameter, String str) {
        o.LJIIJ(safeGetQueryParameter, "$this$safeGetQueryParameter");
        try {
            return UriProtector.getQueryParameter(safeGetQueryParameter, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void LJJJI(String str, byte b) {
        if (str.length() > 0) {
            LJLILLLLZI = i0.LJFF(str, "-");
        }
        LJLJI = b;
    }

    public static final long LJJJJLL(long j, long j2) {
        int LIZLLL;
        int LJ;
        int i;
        int LJ2 = C08350Ul.LJ(j);
        int LIZLLL2 = C08350Ul.LIZLLL(j);
        if (C08350Ul.LJ(j2) < C08350Ul.LIZLLL(j) && C08350Ul.LJ(j) < C08350Ul.LIZLLL(j2)) {
            if (C08350Ul.LJ(j2) <= C08350Ul.LJ(j) && C08350Ul.LIZLLL(j) <= C08350Ul.LIZLLL(j2)) {
                LJ2 = C08350Ul.LJ(j2);
                LIZLLL2 = LJ2;
            } else if (C08350Ul.LJ(j) <= C08350Ul.LJ(j2) && C08350Ul.LIZLLL(j2) <= C08350Ul.LIZLLL(j)) {
                LIZLLL = C08350Ul.LIZLLL(j2);
                LJ = C08350Ul.LJ(j2);
                i = LIZLLL - LJ;
            } else {
                int LJ3 = C08350Ul.LJ(j2);
                if (LJ2 < C08350Ul.LIZLLL(j2) && LJ3 <= LJ2) {
                    LJ2 = C08350Ul.LJ(j2);
                    i = C08350Ul.LIZLLL(j2) - C08350Ul.LJ(j2);
                } else {
                    LIZLLL2 = C08350Ul.LJ(j2);
                }
            }
            return C17N.LIZLLL(LJ2, LIZLLL2);
        }
        if (LIZLLL2 > C08350Ul.LJ(j2)) {
            LJ2 -= C08350Ul.LIZLLL(j2) - C08350Ul.LJ(j2);
            LIZLLL = C08350Ul.LIZLLL(j2);
            LJ = C08350Ul.LJ(j2);
            i = LIZLLL - LJ;
        }
        return C17N.LIZLLL(LJ2, LIZLLL2);
        LIZLLL2 -= i;
        return C17N.LIZLLL(LJ2, LIZLLL2);
    }

    public static void LJJJLIIL(int i, int i2) {
        String LJJJZ;
        if (i < 0 || i >= i2) {
            if (i >= 0) {
                if (i2 < 0) {
                    throw new IllegalArgumentException(C64.LIZIZ("negative size: ", i2));
                }
                LJJJZ = C78596Usy.LJJJZ("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                LJJJZ = C78596Usy.LJJJZ("%s (%s) must not be negative", "index", Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(LJJJZ);
        }
    }

    public static void LJJJLL(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(LJJJZ(i, i2, "index"));
        }
    }

    @Override // X.InterfaceC83507Wpz
    public void LIZIZ(int i, InterfaceC88471Ynr interfaceC88471Ynr) {
        C45685HwP.LJFF.LIZJ(4, i, 0, new HU1(interfaceC88471Ynr));
    }

    public static final void LJJIZ(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 >= 0) {
                if (i3 <= i) {
                    return;
                } else {
                    throw new IndexOutOfBoundsException(C48690J9a.LJIIJJI("toIndex (", i3, ") is greater than size (", i, ")."));
                }
            }
            throw new IndexOutOfBoundsException(C0NY.LIZIZ("fromIndex (", i2, ") is less than zero."));
        }
        throw new IllegalArgumentException(C48690J9a.LJIIJJI("fromIndex (", i2, ") is greater than toIndex (", i3, ")."));
    }

    public static final void LJJJJLI(C53710L6c c53710L6c, Boolean bool, Long l) {
        o.LJIIIZ(c53710L6c, "<this>");
        if (bool != null) {
            c53710L6c.LIZIZ = bool;
        }
        if (l != null) {
            c53710L6c.LIZJ = l;
        }
    }

    public static void LJJJLZIJ(int i, int i2, int i3) {
        String LJJJZ;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i >= 0 && i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    LJJJZ = LJJJZ(i2, i3, "end index");
                } else {
                    LJJJZ = C78596Usy.LJJJZ("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                }
            } else {
                LJJJZ = LJJJZ(i, i3, "start index");
            }
            throw new IndexOutOfBoundsException(LJJJZ);
        }
    }

    public static String LJJJZ(int i, int i2, String str) {
        if (i < 0) {
            return C78596Usy.LJJJZ("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C78596Usy.LJJJZ("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(C64.LIZIZ("negative size: ", i2));
    }

    public static final int LJIIIIZZ(List list, Comparable comparable, int i, int i2) {
        o.LJIIIZ(list, "<this>");
        LJJIZ(((ArrayList) list).size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int LJFF = C66851QLn.LJFF((Comparable) ListProtector.get(list, i4), comparable);
            if (LJFF < 0) {
                i = i4 + 1;
            } else if (LJFF > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i + 1);
    }
}
