package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nve, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60926Nve implements InterfaceC60871Nul {
    public final SparkPopupSchemaParam LIZ;
    public final View LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        int realWidth = this.LIZ.getRealWidth(this.LIZIZ.getContext());
        ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
        if (realWidth > 0) {
            int LIZLLL = C60936Nvo.LIZLLL(null);
            if (realWidth > LIZLLL) {
                realWidth = LIZLLL;
            }
        } else if (realWidth == 0) {
            if (o.LJ(this.LIZ.getRealGravity(this.LIZIZ.getContext()), "center")) {
                Context context = this.LIZIZ.getContext();
                o.LJFF(context, "view.context");
                realWidth = J7A.LIZ(300.0d, context);
            } else {
                realWidth = -1;
            }
        }
        layoutParams.width = realWidth;
    }

    public C60926Nve(SparkPopupSchemaParam params, View view) {
        o.LJIIJ(params, "params");
        o.LJIIJ(view, "view");
        this.LIZ = params;
        this.LIZIZ = view;
    }
}
