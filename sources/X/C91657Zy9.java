package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Zy9, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91657Zy9 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final List<String> LIZIZ = new ArrayList();

    public static void LIZIZ() {
        if (LIZ.compareAndSet(false, true)) {
            C37831Et1.LIZIZ(C92510aBu.class, null, 6);
            C37831Et1.LIZIZ(C92508aBs.class, null, 6);
            C37831Et1.LIZIZ(C92511aBv.class, null, 6);
            C37831Et1.LIZIZ(C92509aBt.class, null, 6);
            C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
            ALE ale = new ALE();
            ale.LIZ = "pipo_spark_biz";
            ale.LJIIJ = 8;
            ale.LJIIJJI = 600;
            ale.LJIIL = C92384a9s.LJLIL;
            c60827Nu3.getClass();
            C60827Nu3.LJIIJJI(ale, Boolean.FALSE);
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            C92334a94 c92334a94 = new C92334a94();
            c40342FsQ.getClass();
            C40342FsQ.LJI(c92334a94);
        }
    }

    public static String LIZ(String str, boolean z, boolean z2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("aweme://webview/?url=");
        LIZ2.append(android.net.Uri.encode(str));
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        if (z) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZIZ2);
            LIZ3.append("&hide_nav_bar=1");
            LIZIZ2 = X1D.LIZIZ(LIZ3);
        }
        if (z2) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LIZIZ2);
            LIZ4.append("&block_back_press=1");
            LIZIZ2 = X1D.LIZIZ(LIZ4);
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(LIZIZ2);
        LIZ5.append("&spark_perf_bid=pipo_spark_biz");
        String LIZIZ3 = X1D.LIZIZ(LIZ5);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(LIZIZ3);
        LIZ6.append("&bdhm_bid=pipo_bnpl_spark");
        return X1D.LIZIZ(LIZ6);
    }

    public static void LIZJ(Context context, String str, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(context, "context");
        if (str.length() == 0) {
            return;
        }
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        if (UriProtector.getQueryParameter(UriProtector.parse(str), "use_forest") == null) {
            buildUpon.appendQueryParameter("use_forest", "1");
        }
        if (UriProtector.getQueryParameter(UriProtector.parse(str), "access_key") == null) {
            buildUpon.appendQueryParameter("access_key", C91726ZzG.LIZ());
        }
        if (UriProtector.getQueryParameter(UriProtector.parse(str), "priority_region") == null) {
            buildUpon.appendQueryParameter("priority_region", C91824a0q.LIZIZ);
        }
        String uri = buildUpon.build().toString();
        o.LJIIIIZZ(uri, "uri.build().toString()");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(LIZ(uri, z, z3));
        if (z2) {
            sparkContext.LJII(M2K.class, new C92332a92());
        }
        sparkContext.LJJIJIIJI(new C92333a93());
        sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("merchant_id", C91824a0q.LIZ.LIZ)));
        sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("merchant_user_id", C91824a0q.LIZ.LIZIZ)));
        sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("bnpl_merchant_id", C91824a0q.LIZ())));
        sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("priority_region", C91824a0q.LIZIZ)));
        sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("source_id", C91824a0q.LJFF)));
        sparkContext.LJJI(new C92383a9r());
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, sparkContext).LIZIZ();
    }
}
