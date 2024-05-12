package X;

import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class XVJ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(TuxIconView tuxIconView, int i) {
        if (tuxIconView != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    tuxIconView.setVisibility(8);
                    return;
                } else {
                    tuxIconView.setVisibility(0);
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_bookmark;
                    c2068389v.LJ = Integer.valueOf(R.attr.go);
                    tuxIconView.setTuxIcon(c2068389v);
                    return;
                }
            }
            tuxIconView.setVisibility(0);
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_bookmark_fill;
            c2068389v2.LJ = Integer.valueOf(R.attr.go);
            tuxIconView.setTuxIcon(c2068389v2);
        }
    }
}
