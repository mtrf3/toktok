package X;

import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import java.util.List;

/* renamed from: X.NpR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60541NpR extends F9E {
    public C60682Nri LJLIL;
    public String LJLILLLLZI;
    public Integer LJLJI;
    public Integer LJLJJI;
    public Integer LJLJJL;
    public Float LJLJJLL;
    public C78685UuP LJLJL;
    public TemplateData LJLJLJ;
    public boolean LJLJLLL;
    public final java.util.Map<String, Object> LJLL;
    public final List<LynxViewClient> LJLLI;
    public java.util.Map<String, C31970Cgg> LJLLILLLL;
    public List<C40197Fq5> LJLLJ;
    public C31961CgX LJLLL;
    public C60303Nlb LJLLLL;
    public String LJLLLLLL;

    public C60541NpR() {
        this(null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, this.LJLLLLLL};
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(13:92|93|4|(10:87|88|7|(2:21|(0)(3:78|79|(2:81|82)(2:84|85)))|9|(1:11)(1:20)|12|13|14|15)|6|7|(0)|9|(0)(0)|12|13|14|15)|3|4|(0)|6|7|(0)|9|(0)(0)|12|13|14|15|(3:(10:39|(1:41)|42|33|9|(0)(0)|12|13|14|15)|(1:56)|(2:76|71))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x025e, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0261, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append(r2.getLanguage());
        r1.append("-");
        r1.append(r2.getCountry());
        r2 = X.X1D.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fe, code lost:
    
        if (r0 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0100, code lost:
    
        r0 = (int) X.C188797b1.LIZ(r7, 27);
        X.J7B.LIZ = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0144, code lost:
    
        r0 = X.C60542NpS.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0146, code lost:
    
        if (r0 == (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0148, code lost:
    
        if (r0 != 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0194, code lost:
    
        r0 = X.C60542NpS.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0198, code lost:
    
        if (r0 == (-1)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x019a, code lost:
    
        if (r0 != 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x019c, code lost:
    
        r0 = X.C60542NpS.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019e, code lost:
    
        if (r0 == (-1)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01a4, code lost:
    
        r8 = new int[]{0, 0};
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a9, code lost:
    
        r2 = r7.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
        r1 = r2.getMethod("getNotchSize", new java.lang.Class[0]);
        kotlin.jvm.internal.o.LJFF(r1, "HwNotchSizeUtil.getMethod(\"getNotchSize\")");
        r0 = r1.invoke(r2, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c4, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c6, code lost:
    
        r8 = (int[]) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d1, code lost:
    
        throw new X.C37692Eqm("null cannot be cast to non-null type kotlin.IntArray");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0211, code lost:
    
        r1 = r7.getResources().getIdentifier("status_bar_height", "dimen", "android");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x021f, code lost:
    
        if (r1 <= 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0221, code lost:
    
        r0 = r7.getResources().getDimensionPixelOffset(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0229, code lost:
    
        if (r0 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0232, code lost:
    
        X.J7B.LIZ = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022b, code lost:
    
        r0 = (int) X.C188797b1.LIZ(r7, 25.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e1, code lost:
    
        r11 = r7.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
        r1 = r11.getMethod("hasNotchInScreen", new java.lang.Class[0]);
        kotlin.jvm.internal.o.LJFF(r1, "HwNotchSizeUtil.getMethod(\"hasNotchInScreen\")");
        r0 = r1.invoke(r11, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01fc, code lost:
    
        if (r0 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01fe, code lost:
    
        r0 = ((java.lang.Boolean) r0).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x020e, code lost:
    
        if (r0 != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x020a, code lost:
    
        throw new X.C37692Eqm("null cannot be cast to non-null type kotlin.Boolean");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x020b, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        r1 = android.os.Build.BRAND;
        kotlin.jvm.internal.o.LJFF(r1, "Build.BRAND");
        r1 = r1.toLowerCase();
        kotlin.jvm.internal.o.LJFF(r1, "(this as java.lang.String).toLowerCase()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0161, code lost:
    
        if (android.text.TextUtils.equals("oppo", r1) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
    
        if (r7.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016f, code lost:
    
        r1 = new android.util.DisplayMetrics();
        r0 = X.C16880lQ.LLILL(r7, "window");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017a, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017c, code lost:
    
        ((android.view.WindowManager) r0).getDefaultDisplay().getRealMetrics(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
    
        if (r1.heightPixels < 2280) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0190, code lost:
    
        if (r0 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0299, code lost:
    
        throw new X.C37692Eqm("null cannot be cast to non-null type android.view.WindowManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0142, code lost:
    
        if (r0 == 0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.Locale] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C60541NpR(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60541NpR.<init>(java.lang.Object):void");
    }
}
