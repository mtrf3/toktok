package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.statisticlogger.btm.BTMTrackerServiceImpl;
import com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Fp8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40138Fp8 extends QXX {
    public static final C40138Fp8 LJLIL = new C40138Fp8();
    public static final C40152FpM LJLILLLLZI = new C40152FpM();
    public static final C40185Fpt LJLJI = new C40185Fpt();
    public static final C40181Fpp LJLJJI = new C40181Fpp();

    public static void LLLLZ(SparkContext sparkContext) {
        if (!o.LJ(sparkContext.extraRuntimeInfo.get((Object) "priority_btm_route_data_has_set"), 1)) {
            sparkContext.LJJIIZ(BTMTrackerServiceImpl.LJFF().LIZJ(), "btm_route_data");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:25|26|(2:28|(1:30)(4:31|32|33|(3:35|(1:37)|38)))|43|32|33|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011d, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e9, code lost:
    
        if (com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl.LJIIJJI().LIZ(r2) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    @Override // X.QXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLLLLJ(com.bytedance.hybrid.spark.SparkContext r8) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40138Fp8.LLLLLLJ(com.bytedance.hybrid.spark.SparkContext):boolean");
    }

    @Override // X.QXX
    public final void LLJJJ(SparkContext sparkContext, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        o.LJIIIZ(sparkContext, "sparkContext");
        if (Q7K.LIZIZ("spark_theme_settings", 0) != 0) {
            z = true;
        } else {
            z = false;
        }
        C60806Nti.LIZ = z;
        C31926Cfy.LIZIZ = C60806Nti.LIZ;
        if (C40164FpY.LIZ() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (z2) {
            sparkContext.LJJIIJ("opt_title", CardStruct.IStatusCode.DEFAULT);
        }
        if (C40164FpY.LIZ() == 1 || C40164FpY.LIZ() == 5) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            sparkContext.LJJIIJ("opt_title", "1");
        }
        if (C40164FpY.LIZ() == 2 || C40164FpY.LIZ() == 5) {
            new C40157FpR(new C40158FpS());
        }
        LJLILLLLZI.LIZ(sparkContext);
        LJLJI.LIZ(sparkContext);
        LJLJJI.LIZ(sparkContext);
        String host = C35546DxG.LIZ(sparkContext.url).getHost();
        if (host != null && s.LJJJLZIJ(host, "lynxview", false)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!o.LJ(sparkContext.defaultParams.get("__jump_from_override"), "1") && !z4) {
            String str3 = sparkContext.url;
            C36344EOe.LIZ.getClass();
            boolean LIZ = C36344EOe.LIZ(sparkContext, str3);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("originalUrl", "");
            c188727au.LJIIIZ("newUrl", str3);
            c188727au.LJIIIZ("finalNewUrl", str3);
            if (LIZ) {
                str2 = "1";
            }
            c188727au.LJIIIZ("jumpToPure", str2);
            c188727au.LJIIIZ("jumpType", "firstJump");
            FMX.LJIIL("spark_webview_mutual_jump", c188727au.LIZ);
        }
        if (E9D.LIZ().pageSourceEnable == 1) {
            IBTMTrackerService LJFF = BTMTrackerServiceImpl.LJFF();
            LLLLZ(sparkContext);
            sparkContext.LJJIJIIJIL(new C31973Cgj(LJFF));
            sparkContext.LJJI(new C40150FpK());
            sparkContext.LJJ(new C40146FpG());
        }
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        if (localTestApi != null) {
            localTestApi.handleDurlForLocaltest(sparkContext);
        }
        super.LLJJJ(sparkContext, str);
        if (((Boolean) C40167Fpb.LIZ.getValue()).booleanValue()) {
            sparkContext.LJJ(new C60011Ngt());
        }
    }
}
