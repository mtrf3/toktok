package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NiU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60110NiU implements InterfaceC60115NiZ {
    public final /* synthetic */ C60116Nia LIZ;

    @Override // X.InterfaceC60115NiZ
    public final void LIZ() {
        String str;
        int i;
        SparkContext sparkContext = this.LIZ.LJLJJI;
        Object obj = null;
        if (sparkContext != null) {
            WebKitView LJJIII = C78939UyV.LJJIII(sparkContext);
            if (LJJIII != null) {
                str = LJJIII.getUrl();
            } else {
                str = null;
            }
            SparkActivity sparkActivity = this.LIZ.LJLJJL;
            if (sparkActivity != null) {
                obj = C16880lQ.LLILLL(sparkActivity);
            }
            o.LJII(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData clipData = ClipData.newPlainText(str, str);
            OHS ohs = C252609vk.LIZ;
            o.LJIIIIZZ(clipData, "clipData");
            TokenCert with = TokenCert.Companion.with("bpea-music_3d_party_webpage");
            ohs.getClass();
            OHS.LIZIZ((ClipboardManager) obj, clipData, with);
            SparkActivity sparkActivity2 = this.LIZ.LJLJJL;
            if (sparkActivity2 != null) {
                C26045AKb c26045AKb = new C26045AKb(sparkActivity2);
                c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                Integer LJI = C79045V0n.LJI(R.attr.e8, EF7.LIZIZ());
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                c26045AKb.LJI(i);
                c26045AKb.LJIIIIZZ(R.string.dwb);
                c26045AKb.LJIIJ();
                return;
            }
            return;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    public C60110NiU(C60116Nia c60116Nia) {
        this.LIZ = c60116Nia;
    }
}
