package X;

import android.content.Intent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Nim, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60128Nim implements InterfaceC60132Niq {
    public final /* synthetic */ C60126Nik LIZ;

    @Override // X.InterfaceC60132Niq
    public final void LIZ() {
        String url;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        SparkContext sparkContext = this.LIZ.LJLJJI;
        if (sparkContext != null) {
            WebKitView LJJIJLIJ = C78983UzD.LJJIJLIJ(sparkContext);
            if (LJJIJLIJ != null && (url = LJJIJLIJ.getUrl()) != null && url.length() != 0) {
                intent.setData(UriProtector.parse(url));
                Intent intent2 = new Intent("android.intent.action.VIEW", UriProtector.parse(url));
                SparkActivity sparkActivity = this.LIZ.LJLJJL;
                if (sparkActivity != null) {
                    C78598Ut0.LJIJJ(intent2, sparkActivity);
                    sparkActivity.startActivity(intent2);
                }
            }
            C60977NwT.LJ("open");
            return;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    public C60128Nim(C60126Nik c60126Nik) {
        this.LIZ = c60126Nik;
    }
}
