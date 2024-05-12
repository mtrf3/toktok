package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebJumpInterceptor;
import com.ss.android.ugc.aweme.settings.SparkEcomOptimizeExperiment;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsBean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt1Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt2Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt3Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt4Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt5Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt6Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt7Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt8Bean;
import com.ss.android.ugc.aweme.settings.SparkWebViewOptimizeExperiment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.DxG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35546DxG {
    public static final /* synthetic */ int LIZ = 0;

    public static final android.net.Uri LIZ(String str) {
        Object LIZ2;
        if (str == null) {
            str = "";
        }
        try {
            LIZ2 = UriProtector.parse(str);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        android.net.Uri uri = android.net.Uri.EMPTY;
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = uri;
        }
        o.LJIIIIZZ(LIZ2, "runCatching { Uri.parse(…}.getOrDefault(Uri.EMPTY)");
        return (android.net.Uri) LIZ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        if (r1.equals("https") == true) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C233889Fw LIZIZ(java.lang.String r6) {
        /*
            com.bytedance.hybrid.spark.SparkContext r4 = new com.bytedance.hybrid.spark.SparkContext
            r4.<init>()
            java.lang.String r3 = ""
            if (r6 != 0) goto L40
            r0 = r3
        La:
            r4.LJJIJLIJ(r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter> r0 = com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter.class
            java.util.Set r1 = r1.getServices(r0)
            java.lang.String r0 = "get().getServices(ICustomSparkRouter::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r2 = r1.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter r1 = (com.ss.android.ugc.aweme.hybridkit.ICustomSparkRouter) r1
            if (r6 != 0) goto L3e
            r0 = r3
        L2f:
            boolean r0 = r1.LIZIZ(r4, r0)
            if (r0 == 0) goto L20
            if (r6 != 0) goto L38
            r6 = r3
        L38:
            java.lang.String r6 = r1.LIZ(r4, r6)
        L3c:
            r2 = 0
            goto L42
        L3e:
            r0 = r6
            goto L2f
        L40:
            r0 = r6
            goto La
        L42:
            android.net.Uri r5 = LIZ(r6)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = r5.getHost()     // Catch: java.lang.Throwable -> L9d
            r3 = 1
            java.lang.String r4 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r1 == 0) goto L67
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch: java.lang.Throwable -> L9d
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = "webview"
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r2)     // Catch: java.lang.Throwable -> L9d
            if (r0 != r3) goto L67
            java.lang.String r0 = "url"
            java.lang.String r6 = X.C78926UyI.LJJJJI(r5, r0)     // Catch: java.lang.Throwable -> L9d
            goto L96
        L67:
            java.lang.String r1 = r5.getScheme()     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L7f
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch: java.lang.Throwable -> L9d
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = "http"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 != r3) goto L7f
            goto L96
        L7f:
            java.lang.String r1 = r5.getScheme()     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L97
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L9d
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch: java.lang.Throwable -> L9d
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = "https"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 != r3) goto L97
        L96:
            r2 = 1
        L97:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L9d
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L9d
            goto La5
        L9d:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        La5:
            X.9Fw r0 = new X.9Fw
            r0.<init>(r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35546DxG.LIZIZ(java.lang.String):X.9Fw");
    }

    public static final boolean LIZLLL(String schema) {
        Collection collection;
        Iterable iterable;
        Iterable iterable2;
        Iterable iterable3;
        Iterable iterable4;
        Iterable iterable5;
        Iterable iterable6;
        Iterable iterable7;
        Iterable iterable8;
        Iterable iterable9;
        Iterable iterable10;
        Iterable iterable11;
        Iterable iterable12;
        Iterable iterable13;
        Iterable iterable14;
        Iterable iterable15;
        Iterable iterable16;
        Collection collection2;
        Iterable iterable17;
        Iterable iterable18;
        Iterable iterable19;
        Iterable iterable20;
        Iterable iterable21;
        Iterable iterable22;
        Iterable iterable23;
        Iterable iterable24;
        Iterable iterable25;
        Iterable iterable26;
        Iterable iterable27;
        Iterable iterable28;
        Iterable iterable29;
        Iterable iterable30;
        Iterable iterable31;
        Iterable iterable32;
        o.LJIIIZ(schema, "schema");
        if ((SparkWebViewOptimizeExperiment.LIZ().enableCommonOpt || ((SparkEcomOptimizeExperiment.EcomOptimizeModel) SparkEcomOptimizeExperiment.LIZIZ.getValue()).enableSparkUseSparkOpt || C35534Dx4.LIZ() == 1 || C35534Dx4.LIZ() == 4) && s.LJJJLZIJ(schema, "use_spark=1", false)) {
            return true;
        }
        C35547DxH.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list", SparkSwitchSettingsBean.class, C35547DxH.LIZIZ);
        if (sparkSwitchSettingsBean == null || (collection = sparkSwitchSettingsBean.denyList) == null) {
            collection = C61878OQg.INSTANCE;
        }
        C35539Dx9.LIZ.getClass();
        SparkSwitchSettingsExt1Bean sparkSwitchSettingsExt1Bean = (SparkSwitchSettingsExt1Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext1", SparkSwitchSettingsExt1Bean.class, C35539Dx9.LIZIZ);
        if (sparkSwitchSettingsExt1Bean == null || (iterable = sparkSwitchSettingsExt1Bean.denyList) == null) {
            iterable = C61878OQg.INSTANCE;
        }
        List LLIIIZ = ORZ.LLIIIZ(iterable, collection);
        C35540DxA.LIZ.getClass();
        SparkSwitchSettingsExt2Bean sparkSwitchSettingsExt2Bean = (SparkSwitchSettingsExt2Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext2", SparkSwitchSettingsExt2Bean.class, C35540DxA.LIZIZ);
        if (sparkSwitchSettingsExt2Bean == null || (iterable2 = sparkSwitchSettingsExt2Bean.denyList) == null) {
            iterable2 = C61878OQg.INSTANCE;
        }
        List LLIIIZ2 = ORZ.LLIIIZ(iterable2, LLIIIZ);
        C35541DxB.LIZ.getClass();
        SparkSwitchSettingsExt3Bean sparkSwitchSettingsExt3Bean = (SparkSwitchSettingsExt3Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext3", SparkSwitchSettingsExt3Bean.class, C35541DxB.LIZIZ);
        if (sparkSwitchSettingsExt3Bean == null || (iterable3 = sparkSwitchSettingsExt3Bean.denyList) == null) {
            iterable3 = C61878OQg.INSTANCE;
        }
        List LLIIIZ3 = ORZ.LLIIIZ(iterable3, LLIIIZ2);
        C35542DxC.LIZ.getClass();
        SparkSwitchSettingsExt4Bean sparkSwitchSettingsExt4Bean = (SparkSwitchSettingsExt4Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext4", SparkSwitchSettingsExt4Bean.class, C35542DxC.LIZIZ);
        if (sparkSwitchSettingsExt4Bean == null || (iterable4 = sparkSwitchSettingsExt4Bean.denyList) == null) {
            iterable4 = C61878OQg.INSTANCE;
        }
        List LLIIIZ4 = ORZ.LLIIIZ(iterable4, LLIIIZ3);
        C35543DxD.LIZ.getClass();
        SparkSwitchSettingsExt5Bean sparkSwitchSettingsExt5Bean = (SparkSwitchSettingsExt5Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext5", SparkSwitchSettingsExt5Bean.class, C35543DxD.LIZIZ);
        if (sparkSwitchSettingsExt5Bean == null || (iterable5 = sparkSwitchSettingsExt5Bean.denyList) == null) {
            iterable5 = C61878OQg.INSTANCE;
        }
        List LLIIIZ5 = ORZ.LLIIIZ(iterable5, LLIIIZ4);
        C35544DxE.LIZ.getClass();
        SparkSwitchSettingsExt6Bean sparkSwitchSettingsExt6Bean = (SparkSwitchSettingsExt6Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext6", SparkSwitchSettingsExt6Bean.class, C35544DxE.LIZIZ);
        if (sparkSwitchSettingsExt6Bean == null || (iterable6 = sparkSwitchSettingsExt6Bean.denyList) == null) {
            iterable6 = C61878OQg.INSTANCE;
        }
        List LLIIIZ6 = ORZ.LLIIIZ(iterable6, LLIIIZ5);
        C35545DxF.LIZ.getClass();
        SparkSwitchSettingsExt7Bean sparkSwitchSettingsExt7Bean = (SparkSwitchSettingsExt7Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext7", SparkSwitchSettingsExt7Bean.class, C35545DxF.LIZIZ);
        if (sparkSwitchSettingsExt7Bean == null || (iterable7 = sparkSwitchSettingsExt7Bean.denyList) == null) {
            iterable7 = C61878OQg.INSTANCE;
        }
        List LLIIIZ7 = ORZ.LLIIIZ(iterable7, LLIIIZ6);
        C35548DxI.LIZ.getClass();
        SparkSwitchSettingsExt8Bean sparkSwitchSettingsExt8Bean = (SparkSwitchSettingsExt8Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext8", SparkSwitchSettingsExt8Bean.class, C35548DxI.LIZIZ);
        if (sparkSwitchSettingsExt8Bean == null || (iterable8 = sparkSwitchSettingsExt8Bean.denyList) == null) {
            iterable8 = C61878OQg.INSTANCE;
        }
        List LLIIIZ8 = ORZ.LLIIIZ(iterable8, LLIIIZ7);
        C35549DxJ.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean2 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext1", SparkSwitchSettingsBean.class, C35549DxJ.LIZIZ);
        if (sparkSwitchSettingsBean2 == null || (iterable9 = sparkSwitchSettingsBean2.denyList) == null) {
            iterable9 = C61878OQg.INSTANCE;
        }
        List LLIIIZ9 = ORZ.LLIIIZ(iterable9, LLIIIZ8);
        C35550DxK.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean3 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext2", SparkSwitchSettingsBean.class, C35550DxK.LIZIZ);
        if (sparkSwitchSettingsBean3 == null || (iterable10 = sparkSwitchSettingsBean3.denyList) == null) {
            iterable10 = C61878OQg.INSTANCE;
        }
        List LLIIIZ10 = ORZ.LLIIIZ(iterable10, LLIIIZ9);
        C35551DxL.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean4 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext3", SparkSwitchSettingsBean.class, C35551DxL.LIZIZ);
        if (sparkSwitchSettingsBean4 == null || (iterable11 = sparkSwitchSettingsBean4.denyList) == null) {
            iterable11 = C61878OQg.INSTANCE;
        }
        List LLIIIZ11 = ORZ.LLIIIZ(iterable11, LLIIIZ10);
        C35552DxM.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean5 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext4", SparkSwitchSettingsBean.class, C35552DxM.LIZIZ);
        if (sparkSwitchSettingsBean5 == null || (iterable12 = sparkSwitchSettingsBean5.denyList) == null) {
            iterable12 = C61878OQg.INSTANCE;
        }
        List LLIIIZ12 = ORZ.LLIIIZ(iterable12, LLIIIZ11);
        C35553DxN.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean6 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext5", SparkSwitchSettingsBean.class, C35553DxN.LIZIZ);
        if (sparkSwitchSettingsBean6 == null || (iterable13 = sparkSwitchSettingsBean6.denyList) == null) {
            iterable13 = C61878OQg.INSTANCE;
        }
        List LLIIIZ13 = ORZ.LLIIIZ(iterable13, LLIIIZ12);
        C35554DxO.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean7 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext6", SparkSwitchSettingsBean.class, C35554DxO.LIZIZ);
        if (sparkSwitchSettingsBean7 == null || (iterable14 = sparkSwitchSettingsBean7.denyList) == null) {
            iterable14 = C61878OQg.INSTANCE;
        }
        List LLIIIZ14 = ORZ.LLIIIZ(iterable14, LLIIIZ13);
        C35555DxP.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean8 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext7", SparkSwitchSettingsBean.class, C35555DxP.LIZIZ);
        if (sparkSwitchSettingsBean8 == null || (iterable15 = sparkSwitchSettingsBean8.denyList) == null) {
            iterable15 = C61878OQg.INSTANCE;
        }
        List LLIIIZ15 = ORZ.LLIIIZ(iterable15, LLIIIZ14);
        C35556DxQ.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean9 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext8", SparkSwitchSettingsBean.class, C35556DxQ.LIZIZ);
        if (sparkSwitchSettingsBean9 == null || (iterable16 = sparkSwitchSettingsBean9.denyList) == null) {
            iterable16 = C61878OQg.INSTANCE;
        }
        List LLIIIZ16 = ORZ.LLIIIZ(iterable16, LLIIIZ15);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LLIIIZ16).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!o.LJ(next, "")) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (o.LJ("*", str) || s.LJJJLZIJ(schema, str, false)) {
                    break;
                }
            }
        }
        C35547DxH.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean10 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list", SparkSwitchSettingsBean.class, C35547DxH.LIZIZ);
        if (sparkSwitchSettingsBean10 == null || (collection2 = sparkSwitchSettingsBean10.allowList) == null) {
            collection2 = C61878OQg.INSTANCE;
        }
        C35539Dx9.LIZ.getClass();
        SparkSwitchSettingsExt1Bean sparkSwitchSettingsExt1Bean2 = (SparkSwitchSettingsExt1Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext1", SparkSwitchSettingsExt1Bean.class, C35539Dx9.LIZIZ);
        if (sparkSwitchSettingsExt1Bean2 == null || (iterable17 = sparkSwitchSettingsExt1Bean2.allowList) == null) {
            iterable17 = C61878OQg.INSTANCE;
        }
        List LLIIIZ17 = ORZ.LLIIIZ(iterable17, collection2);
        C35540DxA.LIZ.getClass();
        SparkSwitchSettingsExt2Bean sparkSwitchSettingsExt2Bean2 = (SparkSwitchSettingsExt2Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext2", SparkSwitchSettingsExt2Bean.class, C35540DxA.LIZIZ);
        if (sparkSwitchSettingsExt2Bean2 == null || (iterable18 = sparkSwitchSettingsExt2Bean2.allowList) == null) {
            iterable18 = C61878OQg.INSTANCE;
        }
        List LLIIIZ18 = ORZ.LLIIIZ(iterable18, LLIIIZ17);
        C35541DxB.LIZ.getClass();
        SparkSwitchSettingsExt3Bean sparkSwitchSettingsExt3Bean2 = (SparkSwitchSettingsExt3Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext3", SparkSwitchSettingsExt3Bean.class, C35541DxB.LIZIZ);
        if (sparkSwitchSettingsExt3Bean2 == null || (iterable19 = sparkSwitchSettingsExt3Bean2.allowList) == null) {
            iterable19 = C61878OQg.INSTANCE;
        }
        List LLIIIZ19 = ORZ.LLIIIZ(iterable19, LLIIIZ18);
        C35542DxC.LIZ.getClass();
        SparkSwitchSettingsExt4Bean sparkSwitchSettingsExt4Bean2 = (SparkSwitchSettingsExt4Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext4", SparkSwitchSettingsExt4Bean.class, C35542DxC.LIZIZ);
        if (sparkSwitchSettingsExt4Bean2 == null || (iterable20 = sparkSwitchSettingsExt4Bean2.allowList) == null) {
            iterable20 = C61878OQg.INSTANCE;
        }
        List LLIIIZ20 = ORZ.LLIIIZ(iterable20, LLIIIZ19);
        C35543DxD.LIZ.getClass();
        SparkSwitchSettingsExt5Bean sparkSwitchSettingsExt5Bean2 = (SparkSwitchSettingsExt5Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext5", SparkSwitchSettingsExt5Bean.class, C35543DxD.LIZIZ);
        if (sparkSwitchSettingsExt5Bean2 == null || (iterable21 = sparkSwitchSettingsExt5Bean2.allowList) == null) {
            iterable21 = C61878OQg.INSTANCE;
        }
        List LLIIIZ21 = ORZ.LLIIIZ(iterable21, LLIIIZ20);
        C35544DxE.LIZ.getClass();
        SparkSwitchSettingsExt6Bean sparkSwitchSettingsExt6Bean2 = (SparkSwitchSettingsExt6Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext6", SparkSwitchSettingsExt6Bean.class, C35544DxE.LIZIZ);
        if (sparkSwitchSettingsExt6Bean2 == null || (iterable22 = sparkSwitchSettingsExt6Bean2.allowList) == null) {
            iterable22 = C61878OQg.INSTANCE;
        }
        List LLIIIZ22 = ORZ.LLIIIZ(iterable22, LLIIIZ21);
        C35545DxF.LIZ.getClass();
        SparkSwitchSettingsExt7Bean sparkSwitchSettingsExt7Bean2 = (SparkSwitchSettingsExt7Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext7", SparkSwitchSettingsExt7Bean.class, C35545DxF.LIZIZ);
        if (sparkSwitchSettingsExt7Bean2 == null || (iterable23 = sparkSwitchSettingsExt7Bean2.allowList) == null) {
            iterable23 = C61878OQg.INSTANCE;
        }
        List LLIIIZ23 = ORZ.LLIIIZ(iterable23, LLIIIZ22);
        C35548DxI.LIZ.getClass();
        SparkSwitchSettingsExt8Bean sparkSwitchSettingsExt8Bean2 = (SparkSwitchSettingsExt8Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext8", SparkSwitchSettingsExt8Bean.class, C35548DxI.LIZIZ);
        if (sparkSwitchSettingsExt8Bean2 == null || (iterable24 = sparkSwitchSettingsExt8Bean2.allowList) == null) {
            iterable24 = C61878OQg.INSTANCE;
        }
        List LLIIIZ24 = ORZ.LLIIIZ(iterable24, LLIIIZ23);
        C35549DxJ.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean11 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext1", SparkSwitchSettingsBean.class, C35549DxJ.LIZIZ);
        if (sparkSwitchSettingsBean11 == null || (iterable25 = sparkSwitchSettingsBean11.allowList) == null) {
            iterable25 = C61878OQg.INSTANCE;
        }
        List LLIIIZ25 = ORZ.LLIIIZ(iterable25, LLIIIZ24);
        C35550DxK.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean12 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext2", SparkSwitchSettingsBean.class, C35550DxK.LIZIZ);
        if (sparkSwitchSettingsBean12 == null || (iterable26 = sparkSwitchSettingsBean12.allowList) == null) {
            iterable26 = C61878OQg.INSTANCE;
        }
        List LLIIIZ26 = ORZ.LLIIIZ(iterable26, LLIIIZ25);
        C35551DxL.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean13 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext3", SparkSwitchSettingsBean.class, C35551DxL.LIZIZ);
        if (sparkSwitchSettingsBean13 == null || (iterable27 = sparkSwitchSettingsBean13.allowList) == null) {
            iterable27 = C61878OQg.INSTANCE;
        }
        List LLIIIZ27 = ORZ.LLIIIZ(iterable27, LLIIIZ26);
        C35552DxM.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean14 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext4", SparkSwitchSettingsBean.class, C35552DxM.LIZIZ);
        if (sparkSwitchSettingsBean14 == null || (iterable28 = sparkSwitchSettingsBean14.allowList) == null) {
            iterable28 = C61878OQg.INSTANCE;
        }
        List LLIIIZ28 = ORZ.LLIIIZ(iterable28, LLIIIZ27);
        C35553DxN.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean15 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext5", SparkSwitchSettingsBean.class, C35553DxN.LIZIZ);
        if (sparkSwitchSettingsBean15 == null || (iterable29 = sparkSwitchSettingsBean15.allowList) == null) {
            iterable29 = C61878OQg.INSTANCE;
        }
        List LLIIIZ29 = ORZ.LLIIIZ(iterable29, LLIIIZ28);
        C35554DxO.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean16 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext6", SparkSwitchSettingsBean.class, C35554DxO.LIZIZ);
        if (sparkSwitchSettingsBean16 == null || (iterable30 = sparkSwitchSettingsBean16.allowList) == null) {
            iterable30 = C61878OQg.INSTANCE;
        }
        List LLIIIZ30 = ORZ.LLIIIZ(iterable30, LLIIIZ29);
        C35555DxP.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean17 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext7", SparkSwitchSettingsBean.class, C35555DxP.LIZIZ);
        if (sparkSwitchSettingsBean17 == null || (iterable31 = sparkSwitchSettingsBean17.allowList) == null) {
            iterable31 = C61878OQg.INSTANCE;
        }
        List LLIIIZ31 = ORZ.LLIIIZ(iterable31, LLIIIZ30);
        C35556DxQ.LIZ.getClass();
        SparkSwitchSettingsBean sparkSwitchSettingsBean18 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext8", SparkSwitchSettingsBean.class, C35556DxQ.LIZIZ);
        if (sparkSwitchSettingsBean18 == null || (iterable32 = sparkSwitchSettingsBean18.allowList) == null) {
            iterable32 = C61878OQg.INSTANCE;
        }
        List LLIIIZ32 = ORZ.LLIIIZ(iterable32, LLIIIZ31);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((ArrayList) LLIIIZ32).iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!o.LJ(next2, "")) {
                arrayList2.add(next2);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                String str2 = (String) it4.next();
                if (o.LJ("*", str2) || s.LJJJLZIJ(schema, str2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LIZJ(Context context, C60737Nsb currentContext, SparkContext sparkContext, String str) {
        o.LJIIIZ(currentContext, "currentContext");
        return AdWebJumpInterceptor.LIZJ().LIZ(context, currentContext, sparkContext, str);
    }
}
