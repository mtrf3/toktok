package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;

/* renamed from: X.VeY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80250VeY {
    public static boolean LIZJ(View view) {
        if (C16310kV.LIZLLL(view) == 1) {
            return true;
        }
        return false;
    }

    public static void LIZ(View view, InterfaceC80252Vea interfaceC80252Vea) {
        C16360ka.LJIJJ(view, new C80251VeZ(interfaceC80252Vea, new C80254Vec(C16310kV.LJFF(view), view.getPaddingTop(), C16310kV.LJ(view), view.getPaddingBottom())));
        if (C16330kX.LIZIZ(view)) {
            C16340kY.LIZJ(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC80207Vdr());
        }
    }

    public static float LIZIZ(int i, Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static PorterDuff.Mode LIZLLL(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
