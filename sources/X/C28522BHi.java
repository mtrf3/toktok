package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.hashtag.PreviewHashtagDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.o;

/* renamed from: X.BHi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28522BHi {
    public static void LIZ(FragmentManager fragmentManager, InterfaceC14450hV interfaceC14450hV, BHZ bhz, LiveMode liveMode, String str) {
        int i;
        o.LJIIIZ(liveMode, "liveMode");
        C78934UyQ.LJI(fragmentManager, "PreviewHashtagDialog");
        if (fragmentManager != null) {
            PreviewHashtagDialog previewHashtagDialog = new PreviewHashtagDialog();
            previewHashtagDialog.LJLJJI = interfaceC14450hV;
            if (bhz == BHZ.SCREEN_RECORD) {
                i = 1;
            } else {
                i = 0;
            }
            previewHashtagDialog.LJLJJL = i;
            previewHashtagDialog.LJLJI = bhz;
            previewHashtagDialog.LJLJL = liveMode;
            previewHashtagDialog.LJLJJLL = str;
            previewHashtagDialog.show(fragmentManager, "PreviewHashtagDialog");
        }
    }
}
