package X;

import Y.ARunnableS22S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpSlowFuncOpt;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ArH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27531ArH {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C238739Yn.LJLIL);

    public static void LIZIZ(Activity activity, Integer num) {
        L9X l9x;
        boolean z;
        o.LJIIIZ(activity, "activity");
        if (EcPdpSlowFuncOpt.LIZJ()) {
            int LJ = C27206Am2.LJ(C78866UxK.LJJZZIII(num), "product_detail", null);
            int template = EnumC26549AbR.DEFAULT.getTemplate();
            Integer valueOf = Integer.valueOf(R.layout.a4x);
            Integer valueOf2 = Integer.valueOf(R.layout.a5e);
            Integer valueOf3 = Integer.valueOf(R.layout.a20);
            Integer valueOf4 = Integer.valueOf(R.layout.a3b);
            Integer valueOf5 = Integer.valueOf(R.layout.a2v);
            Integer valueOf6 = Integer.valueOf(R.layout.xw);
            Integer valueOf7 = Integer.valueOf(R.layout.xu);
            Integer valueOf8 = Integer.valueOf(R.layout.a2u);
            Integer valueOf9 = Integer.valueOf(R.layout.a2f);
            Integer valueOf10 = Integer.valueOf(R.layout.a2e);
            if (LJ == template) {
                L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(valueOf10, 1), new OSZ(valueOf9, 1), new OSZ(Integer.valueOf(R.layout.a2h), 1)));
                L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(valueOf8, 1), new OSZ(valueOf7, 1), new OSZ(valueOf6, 1)));
                L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(Integer.valueOf(R.layout.a39), 1), new OSZ(valueOf5, 3), new OSZ(valueOf4, 1), new OSZ(Integer.valueOf(R.layout.a4i), 1)));
                L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(valueOf3, 1), new OSZ(Integer.valueOf(R.layout.a4q), 1), new OSZ(valueOf2, 1), new OSZ(Integer.valueOf(R.layout.a27), 1), new OSZ(Integer.valueOf(R.layout.a3y), 1), new OSZ(Integer.valueOf(R.layout.a51), 1), new OSZ(Integer.valueOf(R.layout.a53), 3), new OSZ(Integer.valueOf(R.layout.a3i), 1), new OSZ(Integer.valueOf(R.layout.a4k), 1), new OSZ(Integer.valueOf(R.layout.a4l), 7), new OSZ(Integer.valueOf(R.layout.a4n), 7), new OSZ(Integer.valueOf(R.layout.a29), 1), new OSZ(Integer.valueOf(R.layout.any), 4), new OSZ(valueOf, 2), new OSZ(Integer.valueOf(R.layout.a2_), 1), new OSZ(Integer.valueOf(R.layout.a21), 1), new OSZ(Integer.valueOf(R.layout.a27), 1), new OSZ(Integer.valueOf(R.layout.a3z), 1)));
                return;
            }
            if (LJ == EnumC26549AbR.TTF_SA_PRODUCT_DETAIL.getTemplate() || LJ == EnumC26549AbR.TTF_UK_PRODUCT_DETAIL.getTemplate()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(valueOf10, 1), new OSZ(valueOf9, 1), new OSZ(Integer.valueOf(R.layout.a2i), 1)));
                L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(valueOf8, 1), new OSZ(valueOf7, 1), new OSZ(valueOf6, 1)));
                L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(Integer.valueOf(R.layout.a3_), 1), new OSZ(valueOf5, 3), new OSZ(valueOf4, 1), new OSZ(Integer.valueOf(R.layout.a4j), 1)));
                L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(valueOf3, 1), new OSZ(valueOf2, 1), new OSZ(Integer.valueOf(R.layout.a4o), 1), new OSZ(Integer.valueOf(R.layout.a7f), 2), new OSZ(Integer.valueOf(R.layout.a7d), 1), new OSZ(Integer.valueOf(R.layout.a4z), 1), new OSZ(Integer.valueOf(R.layout.a7w), 2), new OSZ(Integer.valueOf(R.layout.a0p), 5), new OSZ(Integer.valueOf(R.layout.zj), 5), new OSZ(Integer.valueOf(R.layout.a47), 1), new OSZ(Integer.valueOf(R.layout.a9t), 1), new OSZ(valueOf, 2)));
                return;
            }
            if (LJ != EnumC26549AbR.GLOBAL_PRODUCT_DETAIL_V1.getTemplate()) {
                return;
            }
            L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(valueOf10, 1), new OSZ(valueOf9, 1), new OSZ(Integer.valueOf(R.layout.a2i), 1)));
            L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(valueOf8, 1), new OSZ(valueOf7, 1), new OSZ(valueOf6, 1)));
            L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(Integer.valueOf(R.layout.a3a), 1), new OSZ(valueOf5, 3), new OSZ(valueOf4, 1), new OSZ(Integer.valueOf(R.layout.a4j), 1)));
            L9O.LIZJ(activity, C47261Igj.LJJIJIIJI(new OSZ(valueOf3, 1), new OSZ(Integer.valueOf(R.layout.a4r), 1), new OSZ(valueOf2, 1), new OSZ(Integer.valueOf(R.layout.a7d), 1), new OSZ(Integer.valueOf(R.layout.a7w), 2), new OSZ(Integer.valueOf(R.layout.a4z), 1), new OSZ(Integer.valueOf(R.layout.a0p), 5), new OSZ(Integer.valueOf(R.layout.zj), 5), new OSZ(Integer.valueOf(R.layout.a9t), 1), new OSZ(valueOf, 2)));
            return;
        }
        List list = (List) LIZ.getValue();
        o.LJIIIZ(list, "list");
        WeakReference<L9X> weakReference = L9X.LIZJ;
        if (weakReference == null || (l9x = weakReference.get()) == null) {
            l9x = new L9X(activity);
            L9X.LIZJ = new WeakReference<>(l9x);
        }
        C37190Eig.LIZ.post(new ARunnableS22S0200000_3(l9x, list, 34));
    }

    public static View LIZ(int i, Context context, ViewGroup viewGroup, boolean z) {
        o.LJIIIZ(context, "context");
        if (EcPdpSlowFuncOpt.LIZJ()) {
            return C27533ArJ.LIZ(i, context, viewGroup, z);
        }
        return C27532ArI.LIZ(i, context, viewGroup, z);
    }
}
