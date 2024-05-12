package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nvy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60946Nvy implements InterfaceC60871Nul {
    public final SparkPopupSchemaParam LIZ;
    public final View LIZIZ;
    public final SparkPopup LIZJ;
    public final Window LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        if (this.LIZ.getSelfAdaptiveHeight()) {
            if (!this.LIZJ.LLIIIJ) {
                this.LIZIZ.getLayoutParams().height = -2;
                this.LIZIZ.requestLayout();
                return;
            }
            return;
        }
        int LIZJ = C60939Nvr.LIZJ(SparkPopup.LLIIZ, this.LIZLLL, this.LIZ, this.LIZJ);
        ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
        if (LIZJ >= 0) {
            LIZJ += this.LJ;
        }
        layoutParams.height = LIZJ;
        this.LIZIZ.requestLayout();
    }

    public C60946Nvy(SparkPopupSchemaParam params, View view, SparkPopup sparkPopup, Window window, ActivityC45651qj activityC45651qj, int i) {
        o.LJIIJ(params, "params");
        o.LJIIJ(view, "view");
        o.LJIIJ(sparkPopup, "sparkPopup");
        this.LIZ = params;
        this.LIZIZ = view;
        this.LIZJ = sparkPopup;
        this.LIZLLL = window;
        this.LJ = i;
    }
}
