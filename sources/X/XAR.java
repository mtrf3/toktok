package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class XAR extends XCZ {
    public final C0FT LJI;
    public final C0FT LJII;
    public final C0FT LJIIIIZZ;
    public final C0FT LJIIIZ;
    public C65427Pm3 LJIIJ;
    public final C0R2 LJIIJJI;
    public final C0R2 LJIIL;
    public final C46141rW<XAV> LJIILIIL;
    public final XCG LJIILJJIL;
    public final C84397XAj LJIILL;
    public final C84376X9o LJIILLIIL;
    public final C84389XAb LJIIZILJ;
    public final String[] LJIJ;
    public final int LJIJI;
    public final String LJIJJ;
    public final XAT LJIJJLI;
    public final C84422XBi LJIL;
    public final InterfaceExecutorC06770Oj LJJ;
    public final Effect LJJI;

    @Override // X.XCZ
    public final void LIZJ() {
    }

    @Override // X.XCZ
    public final void LIZ() {
        String str;
        String sb;
        String[] strArr = this.LJIJ;
        XAT xat = this.LJIJJLI;
        if (xat != null && xat.LIZIZ(this.LJJI)) {
            if (strArr == null) {
                C84422XBi c84422XBi = this.LJIL;
                if (c84422XBi != null) {
                    c84422XBi.LIZ(new AqS165S0100000_15(this, 772));
                    return;
                }
                return;
            }
        } else if (strArr == null) {
            return;
        }
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Model][Dependent][Effect_ID:");
        Effect effect = this.LJJI;
        if (effect != null) {
            str = effect.getEffect_id();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append("][");
        LIZ.append(this.LJIJJ);
        LIZ.append("][");
        int length = strArr.length - 1;
        if (length == -1) {
            sb = "[]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            int i = 0;
            while (true) {
                sb2.append(strArr[i]);
                if (i == length) {
                    break;
                }
                sb2.append(", ");
                i++;
            }
            sb2.append(']');
            sb = sb2.toString();
            o.LJFF(sb, "builder.append(']').toString()");
        }
        LIZ.append(sb);
        LIZ.append("][Count:");
        LIZ.append(strArr.length);
        LIZ.append(']');
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("JKL", LIZIZ);
        this.LJIIIIZZ.LIZ = Integer.valueOf(strArr.length);
        XAT xat2 = this.LJIJJLI;
        if (xat2 != null && xat2.LIZIZ(this.LJJI)) {
            LJIIJJI(strArr);
            return;
        }
        C30941Ji c30941Ji = XAY.LIZ;
        c30941Ji.LIZIZ();
        try {
            LJIIJJI(strArr);
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    @Override // X.XCZ, X.InterfaceC13850gX
    public final void cancel() {
        Boolean bool;
        XAT xat;
        boolean z;
        Effect effect = this.LJJI;
        if (effect != null && (xat = this.LJIJJLI) != null) {
            if (ORY.LJJIJIIJIL(effect.getPanel(), xat.LIZLLL) && xat.LIZIZ && xat.LIZ) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            return;
        }
        try {
            Iterator<XAV> it = this.LJIILIIL.iterator();
            while (it.hasNext()) {
                C84413XAz c84413XAz = it.next().LIZIZ;
                XB4 xb4 = c84413XAz.LIZLLL;
                String requestUrl = c84413XAz.LIZJ;
                xb4.getClass();
                o.LJIIJ(requestUrl, "requestUrl");
                X62 x62 = xb4.LIZ;
                if (!(x62 instanceof X64)) {
                    x62 = null;
                }
                X64 x64 = (X64) x62;
                if (x64 != null) {
                    x64.LIZ(requestUrl);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        super.cancel();
    }

    @Override // X.XCZ, X.InterfaceC13850gX
    public final void pause() {
        Boolean bool;
        C84422XBi c84422XBi;
        XAT xat;
        boolean z;
        Effect effect = this.LJJI;
        if (effect != null && (xat = this.LJIJJLI) != null) {
            if (ORY.LJJIJIIJIL(effect.getPanel(), xat.LIZLLL) && xat.LIZIZ && xat.LIZ) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            return;
        }
        super.pause();
        int LIZIZ = this.LJIIJJI.LIZIZ();
        for (int i = 0; i < LIZIZ; i++) {
            this.LJIIL.LIZ();
        }
        if (this.LJIIL.LIZIZ() == 0 && (c84422XBi = this.LJIL) != null) {
            c84422XBi.LIZ(new AqS165S0100000_15(this, 771));
        }
        try {
            Iterator<XAV> it = this.LJIILIIL.iterator();
            while (it.hasNext()) {
                XAV next = it.next();
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[Model][Pause][Downloading Task][");
                LIZ.append(next.LIZ.getName());
                LIZ.append("][");
                LIZ.append(C79146V4k.LJJIIZI(next.LIZ));
                LIZ.append(']');
                String LIZIZ2 = X1D.LIZIZ(LIZ);
                c12310e3.getClass();
                C12310e3.LIZIZ("JKL", LIZIZ2, null);
                C84413XAz c84413XAz = next.LIZIZ;
                XB4 xb4 = c84413XAz.LIZLLL;
                String requestUrl = c84413XAz.LIZJ;
                xb4.getClass();
                o.LJIIJ(requestUrl, "requestUrl");
                X62 x62 = xb4.LIZ;
                if (!(x62 instanceof X64)) {
                    x62 = null;
                }
                X64 x64 = (X64) x62;
                if (x64 != null) {
                    x64.pause(requestUrl);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJIIJJI(String[] strArr) {
        C84422XBi c84422XBi;
        try {
            ArrayList<ModelInfo> LJI = LJI(this.LJIJI, strArr, true);
            if (!LJI.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<ModelInfo> it = LJI.iterator();
                while (it.hasNext()) {
                    ModelInfo next = it.next();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(next.getName());
                    LIZ.append(", ");
                    sb.append(X1D.LIZIZ(LIZ));
                }
                this.LJIIIZ.LIZ = Integer.valueOf(LJI.size());
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[Model][Download][");
                LIZ2.append(this.LJIJJ);
                LIZ2.append("][");
                LIZ2.append((Object) sb);
                LIZ2.append("][Count:");
                LIZ2.append(LJI.size());
                LIZ2.append(']');
                String LIZIZ = X1D.LIZIZ(LIZ2);
                c12310e3.getClass();
                C12310e3.LIZ("JKL", LIZIZ);
            } else {
                C12310e3 c12310e32 = C12310e3.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("[Model][Download][");
                LIZ3.append(this.LJIJJ);
                LIZ3.append("][All is download completely]");
                String LIZIZ2 = X1D.LIZIZ(LIZ3);
                c12310e32.getClass();
                C12310e3.LIZ("JKL", LIZIZ2);
            }
            XAT xat = this.LJIJJLI;
            if (xat != null && xat.LIZIZ(this.LJJI)) {
                LJIIJ(this.LJJI, LJI);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            LJIIIZ(this.LJJI, LJI);
            this.LJI.LIZ = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            C12310e3 c12310e33 = C12310e3.LIZIZ;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("fetchModels: ");
            LIZ4.append(ORY.LJJZZIII(strArr));
            LIZ4.append(" exception happens!");
            String LIZIZ3 = X1D.LIZIZ(LIZ4);
            c12310e33.getClass();
            C12310e3.LIZIZ("effect_platform", LIZIZ3, e);
            for (String str : strArr) {
                if (!LJIIL(str)) {
                    throw e;
                }
            }
            XAT xat2 = this.LJIJJLI;
            if (xat2 != null && xat2.LIZIZ(this.LJJI) && (c84422XBi = this.LJIL) != null) {
                c84422XBi.LIZ(new AqS165S0100000_15(this, 770));
            }
        }
    }

    public final boolean LJIIL(String str) {
        C84376X9o c84376X9o = this.LJIILLIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C79057V0z.LJJIJIIJI("model"));
        LIZ.append(str);
        boolean LIZ2 = c84376X9o.LIZ(X1D.LIZIZ(LIZ));
        if (LIZ2) {
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("model: ");
            LIZ3.append(str);
            LIZ3.append(" is built in resource");
            String LIZIZ = X1D.LIZIZ(LIZ3);
            c12310e3.getClass();
            C12310e3.LIZ("effect_platform", LIZIZ);
        }
        return LIZ2;
    }

    public static Effect LJIILLIIL(Effect effect, ModelInfo modelInfo) {
        if (effect != null) {
            return effect;
        }
        Effect effect2 = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, -1, 33554431, null);
        effect2.setName(modelInfo.getName());
        return effect2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long LJIIIIZZ(XA2 fetchModelType, ModelInfo modelInfo) {
        List<String> url;
        List<String> url2;
        String LJFF;
        X62 x62 = (X62) this.LJIILJJIL.LJIJI.LIZ;
        if (x62 != null) {
            C84413XAz c84413XAz = new C84413XAz(this.LJIIZILJ, x62);
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[Request][Model][");
            LIZ.append(this.LJIJJ);
            LIZ.append("][");
            LIZ.append(C79146V4k.LJJIIZI(modelInfo));
            LIZ.append("][");
            LIZ.append(modelInfo.getName());
            LIZ.append(']');
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZ("JKL", LIZIZ);
            XAT xat = this.LJIJJLI;
            if (xat != null && xat.LIZ(this.LJJI)) {
                this.LJIILIIL.add(new XAV(modelInfo, c84413XAz));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.LJIJJ);
                LIZ2.append('-');
                LIZ2.append(modelInfo.getName());
                String tag = X1D.LIZIZ(LIZ2);
                o.LJIIJ(fetchModelType, "fetchModelType");
                o.LJIIJ(tag, "tag");
                c84413XAz.LIZ = modelInfo;
                ExtendedUrlModel file_url = modelInfo.getFile_url();
                c84413XAz.LIZIZ = fetchModelType;
                if (file_url != null) {
                    List<String> url_list = file_url.getUrl_list();
                    if (url_list != null && url_list.isEmpty()) {
                        c84413XAz.LIZIZ = XA2.ZIP;
                    }
                    List<String> zip_url_list = file_url.getZip_url_list();
                    if (zip_url_list != null && zip_url_list.isEmpty()) {
                        c84413XAz.LIZIZ = XA2.ORIGIN;
                    }
                }
                ExtendedUrlModel file_url2 = modelInfo.getFile_url();
                if (file_url2 == null || (url2 = file_url2.getUrl(fetchModelType)) == null || url2.isEmpty()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("model ");
                    LIZ3.append(modelInfo.getName());
                    LIZ3.append(" download url is empty! type: ");
                    LIZ3.append(fetchModelType);
                    throw new RuntimeException(X1D.LIZIZ(LIZ3));
                }
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = null;
                ArrayList LJ = C61328O5c.LJ(url2);
                c84413XAz.LIZJ = (String) ListProtector.remove(LJ, 0);
                C84389XAb c84389XAb = c84413XAz.LJ;
                XA2 xa2 = c84413XAz.LIZIZ;
                if (xa2 != null) {
                    ModelInfo modelInfo2 = c84413XAz.LIZ;
                    if (modelInfo2 != null) {
                        c84389XAb.getClass();
                        String LIZ4 = XAN.LIZ(modelInfo2);
                        XBL.LJIJJ.getClass();
                        String LIZJ = XBQ.LIZJ(LIZ4);
                        int i = XA4.LIZIZ[xa2.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append(c84389XAb.LIZJ);
                                LJFF = JBR.LJFF(LIZ5, C10820be.LIZ, LIZJ, LIZ5);
                            } else {
                                throw new C162476Zf();
                            }
                        } else {
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append(c84389XAb.LIZJ);
                            LJFF = JBR.LJFF(LIZ6, C10820be.LIZ, LIZJ, LIZ6);
                        }
                        VNB LIZIZ2 = c84413XAz.LIZLLL.LIZIZ(c84413XAz.LIZJ, LJFF, LJ, tag, new XAX(c68322mC));
                        int i2 = LIZIZ2.LIZIZ;
                        if (i2 == 200) {
                            return LIZIZ2.LIZLLL;
                        }
                        if (i2 == 206) {
                            return -2L;
                        }
                        if (i2 != 600) {
                            Throwable th = (Throwable) c68322mC.element;
                            if (th != null) {
                                throw th;
                            }
                        } else {
                            return -3L;
                        }
                    } else {
                        throw new IllegalArgumentException("modelInfo is required!");
                    }
                } else {
                    throw new IllegalArgumentException("fetchModelType is required!");
                }
            } else {
                o.LJIIJ(fetchModelType, "fetchModelType");
                c84413XAz.LIZ = modelInfo;
                ExtendedUrlModel file_url3 = modelInfo.getFile_url();
                c84413XAz.LIZIZ = fetchModelType;
                if (file_url3 != null) {
                    List<String> url_list2 = file_url3.getUrl_list();
                    if (url_list2 != null && url_list2.isEmpty()) {
                        c84413XAz.LIZIZ = XA2.ZIP;
                    }
                    List<String> zip_url_list2 = file_url3.getZip_url_list();
                    if (zip_url_list2 != null && zip_url_list2.isEmpty()) {
                        c84413XAz.LIZIZ = XA2.ORIGIN;
                    }
                }
                ExtendedUrlModel file_url4 = modelInfo.getFile_url();
                if (file_url4 == null || (url = file_url4.getUrl(fetchModelType)) == null || url.isEmpty()) {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("model ");
                    LIZ7.append(modelInfo.getName());
                    LIZ7.append(" download url is empty! type: ");
                    LIZ7.append(fetchModelType);
                    throw new RuntimeException(X1D.LIZIZ(LIZ7));
                }
                C68322mC c68322mC2 = new C68322mC();
                c68322mC2.element = null;
                for (String downloadUrl : url) {
                    XB4 xb4 = c84413XAz.LIZLLL;
                    XAW xaw = new XAW(c68322mC2);
                    xb4.getClass();
                    o.LJIIJ(downloadUrl, "downloadUrl");
                    long LIZ8 = xb4.LIZ(downloadUrl, true, xb4.LIZIZ, xaw);
                    if (LIZ8 > 0) {
                        return LIZ8;
                    }
                }
                Throwable th2 = (Throwable) c68322mC2.element;
                if (th2 != null) {
                    throw th2;
                }
            }
            return -1L;
        }
        return -4L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x011a, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010c, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011c, code lost:
    
        r1.append(r0);
        r1.append(r11.getName());
        X.X94.LIZ(r5, X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0e3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.ss.ugc.effectplatform.model.Effect] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.ss.ugc.effectplatform.model.Effect r17, java.util.ArrayList<com.ss.ugc.effectplatform.model.algorithm.ModelInfo> r18) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XAR.LJIIIZ(com.ss.ugc.effectplatform.model.Effect, java.util.ArrayList):void");
    }

    public final void LJIIJ(Effect effect, ArrayList<ModelInfo> arrayList) {
        long currentTimeMillis = System.currentTimeMillis();
        if (C48225IwH.LIZ(this.LJIILJJIL.LJJIIZI) || !(!arrayList.isEmpty())) {
            if (arrayList.size() == 0) {
                C84422XBi c84422XBi = this.LJIL;
                if (c84422XBi != null) {
                    c84422XBi.LIZ(new AqS165S0100000_15(this, 768));
                    return;
                }
                return;
            }
            this.LJIIL.LIZ.set(arrayList.size());
            Executor executor = this.LJJ;
            if (executor == null) {
                executor = C79855VVr.LIZ(5, LivePlayEnforceIntervalSetting.DEFAULT);
            }
            C65427Pm3 c65427Pm3 = this.LJIIJ;
            if (c65427Pm3 != null) {
                c65427Pm3.LIZ = null;
            }
            Iterator<ModelInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                executor.execute(new X9A(this, it.next(), currentTimeMillis, effect));
            }
            return;
        }
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download ");
        LIZ.append(ORZ.LLJI(arrayList));
        LIZ.append(" failed!, network unavailable!");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("effect_platform", LIZIZ, null);
        throw new C84434XBu(10011, "network unavailable");
    }

    public final void LJIILL(ModelInfo modelInfo, Exception exc) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("model::");
        LIZ.append(modelInfo.getName());
        LIZ.append(",info.getVersion() = ");
        LIZ.append(modelInfo.getVersion());
        LIZ.append(", size = ");
        LIZ.append(String.valueOf(modelInfo.getType()));
        LIZ.append(" download failure");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("effect_platform", LIZIZ, exc);
        XAO LJII = this.LJIIZILJ.LJII(modelInfo.getName());
        if (LJII != null) {
            String LIZLLL = LJII.LIZLLL();
            if (LIZLLL != null) {
                String version2 = modelInfo.getVersion();
                o.LJIIJ(version2, "version2");
                boolean z = false;
                if (!C107244Iu.LIZIZ(LIZLLL)) {
                    if (C107244Iu.LIZIZ(version2)) {
                        throw exc;
                    }
                    if (C107244Iu.LIZ(LIZLLL, version2)) {
                        return;
                    }
                    try {
                        String substring = LIZLLL.substring(0, s.LJJLIIIJL(LIZLLL, ".", 0, false, 6));
                        o.LJFF(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        String substring2 = version2.substring(0, s.LJJLIIIJL(LIZLLL, ".", 0, false, 6));
                        o.LJFF(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        z = C107244Iu.LIZ(substring, substring2);
                    } catch (Exception unused) {
                    }
                    if (!z) {
                        throw exc;
                    }
                    return;
                }
                throw exc;
            }
            o.LJIIZILJ();
            throw null;
        }
        throw exc;
    }

    public final ArrayList<ModelInfo> LJI(int i, String[] strArr, boolean z) {
        XAS LIZ;
        C84397XAj c84397XAj = this.LJIILL;
        if (c84397XAj != null && (LIZ = c84397XAj.LIZ(i, z)) != null) {
            return LJII(i, strArr, LIZ);
        }
        throw new RuntimeException(C0NY.LIZIZ("model list with ", i, " not found!"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [X.XAR] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<com.ss.ugc.effectplatform.model.algorithm.ModelInfo> LJII(int r21, java.lang.String[] r22, X.XAS r23) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XAR.LJII(int, java.lang.String[], X.XAS):java.util.ArrayList");
    }

    public final void LJIILIIL(Effect effect, ModelInfo modelInfo, Exception exc) {
        String LIZLLL;
        List<String> url_list;
        C84418XBe c84418XBe = new C84418XBe(exc);
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        Object obj = null;
        if (file_url != null && (url_list = file_url.getUrl_list()) != null && (!url_list.isEmpty())) {
            obj = ListProtector.get(url_list, 0);
        }
        XCG xcg = this.LJIILJJIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            String name = modelInfo.getName();
            String version = modelInfo.getVersion();
            String str = this.LJIILJJIL.LJJIJ.toString();
            OSZ[] oszArr = new OSZ[3];
            String LJJIIZI = C79146V4k.LJJIIZI(modelInfo);
            if (LJJIIZI == null) {
                LJJIIZI = "";
            }
            oszArr[0] = new OSZ("md5", LJJIIZI);
            if (obj == null) {
                obj = "";
            }
            oszArr[1] = new OSZ("download_url", obj);
            oszArr[2] = new OSZ("error_code", Integer.valueOf(c84418XBe.LIZ));
            java.util.Map LJJL = C113554cx.LJJL(oszArr);
            String message = exc.getMessage();
            if (message == null || ujb.o.LJJJJJL(message)) {
                LIZLLL = C65352Pkq.LIZ(exc.getClass()).LIZLLL();
            } else {
                LIZLLL = exc.getMessage();
            }
            C63081OpJ.LLILLIZIL(interfaceC58749N3x, false, xcg, effect, name, version, str, LJJL, LIZLLL);
        }
        this.LJIILJJIL.getClass();
    }

    public final void LJIILJJIL(Effect effect, ModelInfo modelInfo, long j, long j2) {
        List<String> url_list;
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("model::");
        LIZ.append(modelInfo.getName());
        LIZ.append(",version = ");
        LIZ.append(modelInfo.getVersion());
        LIZ.append(",size = ");
        LIZ.append(String.valueOf(modelInfo.getType()));
        LIZ.append(" download success!");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("effect_platform", LIZIZ);
        modelInfo.setTotalSize(j2 / 1024);
        long LIZ2 = C06190Md.LIZ() - j;
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        Object obj = null;
        if (file_url != null && (url_list = file_url.getUrl_list()) != null && (!url_list.isEmpty())) {
            obj = ListProtector.get(url_list, 0);
        }
        XCG xcg = this.LJIILJJIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        String str = "";
        if (interfaceC58749N3x != null) {
            String name = modelInfo.getName();
            String version = modelInfo.getVersion();
            String str2 = this.LJIILJJIL.LJJIJ.toString();
            OSZ[] oszArr = new OSZ[4];
            String LJJIIZI = C79146V4k.LJJIIZI(modelInfo);
            if (LJJIIZI == null) {
                LJJIIZI = "";
            }
            oszArr[0] = new OSZ("md5", LJJIIZI);
            if (obj == null) {
                obj = "";
            }
            oszArr[1] = new OSZ("download_url", obj);
            oszArr[2] = new OSZ("size", Long.valueOf(j2));
            oszArr[3] = new OSZ("duration", Long.valueOf(LIZ2));
            C63081OpJ.LLILLIZIL(interfaceC58749N3x, true, xcg, effect, name, version, str2, C113554cx.LJJL(oszArr), "");
        }
        this.LJIILJJIL.getClass();
        if (P12.ANDROID == P12.PC) {
            return;
        }
        String name2 = modelInfo.getName();
        XAO LIZ3 = XAP.LIZ("");
        o.LJIIJ(name2, "name");
        LIZ3.LIZ = name2;
        String LJJIIZI2 = C79146V4k.LJJIIZI(modelInfo);
        if (LJJIIZI2 != null) {
            str = LJJIIZI2;
        }
        LIZ3.LIZJ = str;
        LIZ3.LIZLLL = modelInfo.getType();
        String version2 = modelInfo.getVersion();
        o.LJIIJ(version2, "version");
        LIZ3.LIZIZ = version2;
        LIZ3.LJ = false;
        XAU xau = new XAU(LIZ3, modelInfo);
        C30941Ji c30941Ji = C84390XAc.LIZ;
        c30941Ji.LIZIZ();
        try {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("model: ");
            LIZ4.append(name2);
            LIZ4.append(" write in cache!");
            C12310e3.LIZ("AlgorithmModelInfoMemoryCache", X1D.LIZIZ(LIZ4));
            C84390XAc.LIZIZ.put(name2, xau);
        } finally {
            c30941Ji.LIZLLL();
        }
    }

    public /* synthetic */ XAR(XCG xcg, C84397XAj c84397XAj, C84376X9o c84376X9o, C84389XAb c84389XAb, String[] strArr, int i, int i2) {
        this(xcg, c84397XAj, c84376X9o, c84389XAb, (i2 & 16) != 0 ? null : strArr, (i2 & 32) != 0 ? 0 : i, null, null, null, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XAR(XCG config, C84397XAj c84397XAj, C84376X9o buildInAssetsManager, C84389XAb algorithmModelCache, String[] strArr, int i, String str, XAT xat, C84422XBi c84422XBi, InterfaceExecutorC06770Oj interfaceExecutorC06770Oj, Effect effect) {
        super(str, config.LJJJ);
        o.LJIIJ(config, "config");
        o.LJIIJ(buildInAssetsManager, "buildInAssetsManager");
        o.LJIIJ(algorithmModelCache, "algorithmModelCache");
        this.LJIILJJIL = config;
        this.LJIILL = c84397XAj;
        this.LJIILLIIL = buildInAssetsManager;
        this.LJIIZILJ = algorithmModelCache;
        this.LJIJ = strArr;
        this.LJIJI = i;
        this.LJIJJ = str;
        this.LJIJJLI = xat;
        this.LJIL = c84422XBi;
        this.LJJ = interfaceExecutorC06770Oj;
        this.LJJI = effect;
        this.LJI = new C0FT((Object) 0L);
        this.LJII = new C0FT((Object) 0L);
        this.LJIIIIZZ = new C0FT((Object) 0);
        this.LJIIIZ = new C0FT((Object) 0);
        this.LJIIJJI = new C0R2(0);
        this.LJIIL = new C0R2(0);
        this.LJIILIIL = new C46141rW<>(true);
    }
}
