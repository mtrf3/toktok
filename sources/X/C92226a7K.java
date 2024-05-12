package X;

import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.a7K, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92226a7K implements InterfaceC92107a5P {
    public final /* synthetic */ RepaymentViewModel LIZ;

    public C92226a7K(RepaymentViewModel repaymentViewModel) {
        this.LIZ = repaymentViewModel;
    }

    @Override // X.InterfaceC92107a5P
    public final void LIZIZ(View view) {
        o.LJIIIZ(view, "view");
        try {
            ((SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) view).LJFF(true);
        } catch (Throwable unused) {
            String tag = this.LIZ.LJLIL;
            o.LJIIIIZZ(tag, "tag");
        }
    }

    @Override // X.InterfaceC92107a5P
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ(String url, Context context, C92110a5S c92110a5S) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(context, "context");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://webview/?url=");
        LIZ.append(android.net.Uri.encode(url));
        sparkContext.LJJIJLIJ(X1D.LIZIZ(LIZ));
        sparkContext.LJJ(new C92846aHK(c92110a5S));
        Integer num = c92110a5S.LIZJ;
        if (num != null) {
            sparkContext.LJJIFFI(num.intValue(), "container_bg_color");
        }
        if (c92110a5S.LIZLLL) {
            sparkContext.LJJIIJ("hide_loading", "1");
        }
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ2 = C40343FsR.LIZ(C40342FsQ.LIZ(context, sparkContext));
        LIZ2.LIZIZ();
        return LIZ2;
    }
}
