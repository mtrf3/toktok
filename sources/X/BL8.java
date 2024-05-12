package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BL8 {
    public static final void LIZJ(C47061t0 c47061t0, List<String> list) {
        C15650jR.LIZ().LJIIIIZZ("live_bg", list).LJIIJJI(c47061t0);
    }

    public static final void LIZ(C47061t0 backgroundView, List<String> list, Context context) {
        o.LJIIIZ(backgroundView, "backgroundView");
        if (context != null) {
            C78720Uuy LJIIIIZZ = C15650jR.LIZ().LJIIIIZZ("live_bg", list);
            LJIIIIZZ.LIZIZ(KL2.LJIIJJI(context) / KL2.LJIIIZ(context));
            LJIIIIZZ.LJIIJJI(backgroundView);
        }
    }

    public static final void LIZIZ(C47061t0 imageView, List<String> list, Context context) {
        String str;
        o.LJIIIZ(imageView, "imageView");
        if (context != null) {
            float LJIIJJI = KL2.LJIIJJI(context) / KL2.LJIIIZ(context);
            if (!C32151Nz.LJJIIJZLJL(list)) {
                BQO LIZ = C15650jR.LIZ();
                LIZ.LJIIIIZZ("live_bg", list);
                LIZ.LIZIZ(LJIIJJI);
                LIZ.LJIIJJI(imageView);
                return;
            }
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context() != null) {
                str = context.getPackageName();
                o.LJIIIIZZ(str, "context.packageName");
            } else {
                str = "";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("res://");
            LIZ2.append(str);
            LIZ2.append('/');
            LIZ2.append(R.drawable.cwn);
            C15650jR.LIZ().LIZ(C05040Hs.LIZIZ(X1D.LIZIZ(LIZ2))).LJIIJJI(imageView);
        }
    }
}
