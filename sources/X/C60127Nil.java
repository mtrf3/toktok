package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Nil, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60127Nil implements InterfaceC60132Niq {
    public final /* synthetic */ C60126Nik LIZ;

    @Override // X.InterfaceC60132Niq
    public final void LIZ() {
        String str;
        Object obj;
        int i;
        SparkContext sparkContext = this.LIZ.LJLJJI;
        ClipboardManager clipboardManager = null;
        if (sparkContext != null) {
            WebKitView LJJIJLIJ = C78983UzD.LJJIJLIJ(sparkContext);
            if (LJJIJLIJ != null) {
                str = LJJIJLIJ.getUrl();
            } else {
                str = null;
            }
            SparkActivity sparkActivity = this.LIZ.LJLJJL;
            if (sparkActivity != null) {
                obj = C16880lQ.LLILLL(sparkActivity);
            } else {
                obj = null;
            }
            if (obj instanceof ClipboardManager) {
                clipboardManager = (ClipboardManager) obj;
            }
            ClipData clipData = ClipData.newPlainText(str, str);
            if (clipboardManager != null) {
                OHS ohs = C252609vk.LIZ;
                o.LJIIIIZZ(clipData, "clipData");
                C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476399124, "bpea-search_3d_party_page");
                ohs.getClass();
                OHS.LIZIZ(clipboardManager, clipData, LJJIIJ);
            }
            SparkActivity sparkActivity2 = this.LIZ.LJLJJL;
            if (sparkActivity2 != null) {
                C26045AKb c26045AKb = new C26045AKb(sparkActivity2);
                c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                Integer LJI = C79045V0n.LJI(R.attr.e8, sparkActivity2);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                c26045AKb.LJI(i);
                c26045AKb.LJIIIIZZ(R.string.qdl);
                c26045AKb.LJIIJ();
            }
            C60977NwT.LJ("copy");
            return;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    public C60127Nil(C60126Nik c60126Nik) {
        this.LIZ = c60126Nik;
    }
}
