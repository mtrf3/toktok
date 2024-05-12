package X;

import android.app.Activity;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.3rG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96943rG {
    public static final C96943rG LIZ = new C96943rG();

    public static void LIZ(int i, ImageView imageView) {
        if (imageView == null) {
            return;
        }
        try {
            if (imageView instanceof C119574mf) {
                ((C119574mf) imageView).setShouldDrawBorder(false);
            }
            C97353rv LJII = C96963rI.LJII();
            Activity topActivity = ActivityStack.getTopActivity();
            o.LJIIIIZZ(topActivity, "getTopActivity()");
            boolean LJIILJJIL = AnonymousClass636.LJIILJJIL(topActivity);
            LJII.getClass();
            String LJJJ = SearchServiceImpl.LLLZI().LJJJ(LJIILJJIL);
            if (LJJJ == null) {
                LJJJ = "";
            }
            W5F LJI = W5U.LJI(new File(LJJJ));
            LJI.LJJIIJZLJL = imageView;
            LJI.LJII = i;
            LJI.LJIIIIZZ = i;
            C16880lQ.LLJJJ(LJI);
        } catch (Exception e) {
            QCU.LJFF("bot avatar load Exception: load failed", e, 4);
        }
    }
}
