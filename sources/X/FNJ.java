package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FNJ extends AbstractC65781Prl implements InterfaceC88472Yns<FVC, View> {
    public static final FNJ LJLIL = new FNJ();

    public FNJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(FVC fvc) {
        View view;
        FVC params = fvc;
        o.LJIIIZ(params, "params");
        System.currentTimeMillis();
        if (C90L.LIZ) {
            int i = C90L.LIZIZ;
            if (i == 0) {
                FAJ.LIZ("feed_ui_duration_first_inflate", false);
            } else if (i == 1) {
                C56662Kg.LIZ().LIZJ("feed_ui_duration_second_inflate", false);
            }
        }
        Activity LJIJJ = C45804HyK.LJIJJ(params.LIZIZ);
        if (LJIJJ != null) {
            if (!((Boolean) FDY.LIZIZ.getValue()).booleanValue() || !FDY.LJIIIIZZ.compareAndSet(false, true) || (view = C38619FDr.LIZIZ(R.layout.abj, LJIJJ, null, false)) == null) {
                view = C16970lZ.LIZLLL(LJIJJ, R.layout.abj);
            }
            if (C90L.LIZ) {
                int i2 = C90L.LIZIZ;
                if (i2 == 0) {
                    FAJ.LJFF("feed_ui_duration_first_inflate", false);
                } else if (i2 == 1) {
                    C56662Kg.LIZ().LJFF("feed_ui_duration_second_inflate", false);
                }
            }
            if (C35183DrP.LIZ()) {
                Drawable drawable = (Drawable) ((ConcurrentHashMap) C38851FMp.LIZ.LIZIZ).get("optimize_feedbackground");
                if (drawable != null) {
                    View findViewById = view.findViewById(R.id.view_rootview);
                    if (findViewById != null) {
                        findViewById.setBackground(drawable);
                    }
                } else {
                    View findViewById2 = view.findViewById(R.id.view_rootview);
                    if (findViewById2 != null) {
                        findViewById2.setBackgroundResource(R.drawable.au8);
                    }
                }
                View findViewById3 = view.findViewById(R.id.cover);
                if (findViewById3 != null) {
                    findViewById3.setBackgroundResource(0);
                }
            }
            o.LJIIIIZZ(view, "view");
            return view;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
