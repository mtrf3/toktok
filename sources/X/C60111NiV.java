package X;

import android.content.Intent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.NiV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60111NiV implements InterfaceC60115NiZ {
    public final /* synthetic */ C60116Nia LIZ;

    @Override // X.InterfaceC60115NiZ
    public final void LIZ() {
        String url;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        SparkContext sparkContext = this.LIZ.LJLJJI;
        if (sparkContext != null) {
            WebKitView LJJIII = C78939UyV.LJJIII(sparkContext);
            if (LJJIII == null || (url = LJJIII.getUrl()) == null || url.length() == 0) {
                return;
            }
            intent.setData(UriProtector.parse(url));
            Intent intent2 = new Intent("android.intent.action.VIEW", UriProtector.parse(url));
            SparkActivity sparkActivity = this.LIZ.LJLJJL;
            if (sparkActivity == null) {
                return;
            }
            C78598Ut0.LJIJJ(intent2, sparkActivity);
            sparkActivity.startActivity(intent2);
            return;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    public C60111NiV(C60116Nia c60116Nia) {
        this.LIZ = c60116Nia;
    }
}
