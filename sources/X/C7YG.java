package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7YG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View itemView) {
        View findViewById;
        o.LJIIIZ(itemView, "itemView");
        ViewGroup viewGroup = (ViewGroup) itemView.findViewById(R.id.h5p);
        if ((viewGroup != null || (viewGroup = (ViewGroup) itemView.findViewById(R.id.h4u)) != null) && (findViewById = viewGroup.findViewById(R.id.adv)) != null) {
            C16880lQ.LJLLL(findViewById, viewGroup);
            Integer LIZIZ = C19N.LIZIZ(itemView, "itemView.context", R.attr.cl);
            if (LIZIZ != null) {
                itemView.setBackgroundColor(LIZIZ.intValue());
            }
            itemView.getBackground().setAlpha(255);
        }
    }
}
