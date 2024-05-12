package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS5S1200000_6;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.FsQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40342FsQ {
    public static void LIZIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-5337752617266256854")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public final synchronized void LJIIIZ() {
        boolean z;
        AtomicBoolean atomicBoolean = C40343FsR.LJII;
        if (!atomicBoolean.get()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = C40343FsR.LJI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            C79605VMb c79605VMb = new C79605VMb("tryPrepareBlock");
            c79605VMb.LIZIZ = "sparkTrace";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("prepareBlockFlag", atomicBoolean);
            if (C40343FsR.LJI != null) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("prepareBlockExist", z);
            c79605VMb.LIZLLL = jSONObject;
            FD5.LJ("", c79605VMb.LIZ());
            atomicBoolean.set(true);
        }
    }

    public static void LJFF() {
        if (!C40343FsR.LIZJ) {
            C37831Et1.LIZIZ(C40353Fsb.class, null, 6);
            C37848EtI.LIZLLL(C37789EsL.class, null, "Spark", 2);
            C37831Et1.LIZIZ(C59888Neu.class, null, 6);
            C37831Et1.LIZIZ(O9Q.class, null, 6);
            C37831Et1.LIZIZ(C60872Num.class, null, 6);
            C37831Et1.LIZIZ(C60998Nwo.class, null, 6);
            C40343FsR.LIZJ = true;
        }
    }

    public static boolean LIZJ(SparkContext needParallelLoadResource) {
        o.LJIIJ(needParallelLoadResource, "$this$needParallelLoadResource");
        android.net.Uri uri = UriProtector.parse(needParallelLoadResource.url);
        o.LJFF(uri, "uri");
        String host = uri.getHost();
        if (host == null || !s.LJJJLZIJ(host, "lynx", false) || !s.LJJJLZIJ(needParallelLoadResource.url, "use_forest=1", false) || !s.LJJJLZIJ(needParallelLoadResource.url, "parallel_fetch_resource=1", false)) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(String url) {
        Object obj;
        Method method;
        o.LJIIJ(url, "url");
        try {
            if ((!ujb.o.LJJJJJL(url)) && C40343FsR.LJIIJ != null && (obj = C40343FsR.LJIIJJI) != null && (method = C40343FsR.LJIIL) != null) {
                LIZIZ(obj, method, new Object[]{url});
            }
        } catch (Throwable unused) {
        }
    }

    public static void LJI(AbstractC40122Fos handler) {
        o.LJIIJ(handler, "handler");
        if (o.LJ(handler.LJI(), "default")) {
            C40343FsR.LIZLLL.add(handler);
        } else {
            C40343FsR.LJ.put(handler.LJI(), handler);
        }
    }

    public static void LJIIIIZZ(SparkContext context) {
        String LJJJJI;
        o.LJIIJ(context, "context");
        String str = context.containerId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        FD5.LIZJ(System.currentTimeMillis(), str, "prepare_spark_plugin_start");
        String str3 = null;
        try {
            android.net.Uri parse = UriProtector.parse(context.url);
            if (parse != null && (LJJJJI = C78926UyI.LJJJJI(parse, "business_from")) != null) {
                str3 = s.LJZI(LJJJJI).toString();
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        C40343FsR.LJFF.LLJJJ(context, str3);
        InterfaceC40155FpP interfaceC40155FpP = (InterfaceC40155FpP) context.LIZIZ(InterfaceC40155FpP.class);
        if (interfaceC40155FpP != null && interfaceC40155FpP.LIZJ()) {
            C40343FsR.LJFF.getClass();
        } else {
            C40343FsR.LJFF.getClass();
        }
        String str4 = context.containerId;
        if (str4 != null) {
            str2 = str4;
        }
        FD5.LIZJ(System.currentTimeMillis(), str2, "prepare_spark_plugin_end");
    }

    public static C40343FsR LIZ(Context context, SparkContext sparkContext) {
        o.LJIIJ(context, "context");
        o.LJIIJ(sparkContext, "sparkContext");
        return new C40343FsR(context, sparkContext);
    }

    public static void LJII(ActivityC45651qj context, SparkContext sparkContext) {
        o.LJIIJ(context, "context");
        o.LJIIJ(sparkContext, "sparkContext");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SparkPopup#");
        LIZ.append(sparkContext.containerId.hashCode());
        String LIZIZ = X1D.LIZIZ(LIZ);
        Fragment LJJJIL = context.getSupportFragmentManager().LJJJIL(LIZIZ);
        if (LJJJIL instanceof SparkPopup) {
            C37682Eqc.LIZIZ(sparkContext, "SparkPopupLoadingProcess", "Spark showPopup, oldSparkPopup is SparkPopup");
            SparkPopup sparkPopup = (SparkPopup) LJJJIL;
            Bundle arguments = sparkPopup.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C117144ik.LIZIZ.getClass();
            C117144ik.LIZIZ(sparkContext);
            arguments.putString("SparkContextContainerId", sparkContext.containerId);
            sparkPopup.setArguments(arguments);
            sparkPopup.refresh();
            return;
        }
        C37682Eqc.LIZIZ(sparkContext, "SparkPopupLoadingProcess", "Spark showPopup, oldSparkPopup is not SparkPopup");
        SparkPopup sparkPopup2 = new SparkPopup();
        Bundle bundle = new Bundle();
        C117144ik.LIZIZ.getClass();
        C117144ik.LIZIZ(sparkContext);
        bundle.putString("SparkContextContainerId", sparkContext.containerId);
        sparkPopup2.setArguments(bundle);
        sparkPopup2.Ll(sparkContext);
        SparkSchemaParam LJIIZILJ = sparkContext.LJIIZILJ(-1);
        if (LJIIZILJ instanceof SparkPopupSchemaParam) {
            if (((AbsSparkPopupSchemaParam) LJIIZILJ).getSilentLoadType() == 2) {
                sparkPopup2.Ol(context, sparkContext, new C40346FsU());
                sparkContext.LJII(SparkPopup.class, sparkPopup2);
                return;
            } else if (((AbsSparkPopupSchemaParam) LJIIZILJ).getSilentLoadType() == 1) {
                sparkPopup2.Ol(context, sparkContext, new C40344FsS(sparkPopup2, context, LIZIZ));
                return;
            }
        }
        FragmentManager supportFragmentManager = context.getSupportFragmentManager();
        o.LJFF(supportFragmentManager, "context.supportFragmentManager");
        sparkPopup2.show(supportFragmentManager, LIZIZ);
    }

    public static void LJIIJ(Context ctx, SparkContext sparkContext) {
        o.LJIIJ(sparkContext, "sparkContext");
        o.LJIIJ(ctx, "ctx");
        InterfaceC40348FsW interfaceC40348FsW = (InterfaceC40348FsW) EXP.LIZIZ(InterfaceC40348FsW.class);
        if (interfaceC40348FsW == null) {
            interfaceC40348FsW = C40349FsX.LIZ;
        }
        interfaceC40348FsW.LIZ(new ARunnableS25S0200000_6(ctx, sparkContext, 54));
    }

    public static void LJ(C40342FsQ c40342FsQ, SparkContext sparkContext, SparkSchemaParam sparkSchemaParam, int i) {
        int i2;
        if ((i & 2) != 0) {
            sparkSchemaParam = null;
        }
        if ((i & 4) != 0) {
            i2 = C37752Erk.LIZ;
        } else {
            i2 = 0;
        }
        c40342FsQ.getClass();
        o.LJIIJ(sparkContext, "sparkContext");
        String url = sparkContext.url;
        o.LJIIJ(url, "url");
        sparkContext.resourcePreloadTriggered = true;
        try {
            PthreadThread pthreadThread = new PthreadThread(new ARunnableS5S1200000_6(sparkSchemaParam, url, sparkContext, 11), "rce/Preloader");
            pthreadThread.setPriority(i2);
            pthreadThread.start();
        } catch (Exception e) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error happened in preload thread start:");
            LIZ.append(e.getMessage());
            LIZ.append(" containerId:");
            LIZ.append(sparkContext.containerId);
            c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.E, "HybridKit");
        }
    }
}
