package X;

import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ASG {
    public final AS3 LJLIL;

    public abstract void LIZ(View view);

    public void LIZJ(ImageView iconView, View view, int i) {
        o.LJIIIZ(iconView, "iconView");
    }

    public ASG(AS3 as3) {
        this.LJLIL = as3;
    }

    public void LIZIZ(View v) {
        AS3 as3;
        o.LJIIIZ(v, "v");
        if (!(this instanceof C26268ASq) && (as3 = this.LJLIL) != null) {
            as3.dismiss();
        }
        LIZ(v);
    }
}
