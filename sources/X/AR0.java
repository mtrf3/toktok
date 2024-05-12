package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AR0 implements InterfaceC81146Vt0 {
    public final /* synthetic */ TuxIntroFragment LIZ;

    public AR0(TuxIntroFragment tuxIntroFragment) {
        this.LIZ = tuxIntroFragment;
    }

    @Override // X.InterfaceC81146Vt0
    public final void LIZ(boolean z) {
        TuxIntroFragment tuxIntroFragment = this.LIZ;
        Context context = tuxIntroFragment.getContext();
        if (context != null) {
            TypedArray obtainStyledAttributes = new ContextThemeWrapper(tuxIntroFragment.getContext(), C45804HyK.LJJIII(context, z)).obtainStyledAttributes(null, new int[]{R.attr.oc, R.attr.od, R.attr.oe, R.attr.of, R.attr.og, R.attr.oh, R.attr.oi, R.attr.oj, R.attr.ok, R.attr.ol, R.attr.om, R.attr.on, R.attr.oo, R.attr.op, R.attr.oq, R.attr.or, R.attr.os, R.attr.ot, R.attr.ou, R.attr.ov, R.attr.ow}, R.attr.k4, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "wrapped.obtainStyledAttr…uxIntroStyle, 0\n        )");
            int color = obtainStyledAttributes.getColor(9, 0);
            obtainStyledAttributes.recycle();
            SY9 sy9 = tuxIntroFragment.LJLZ;
            if (sy9 != null) {
                sy9.LJ(color);
            }
        }
    }

    @Override // X.InterfaceC81146Vt0
    public final void LIZIZ(int[] result) {
        o.LJIIIZ(result, "result");
    }
}
