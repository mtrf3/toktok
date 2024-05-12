package X;

import android.view.View;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.NvY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60920NvY implements InterfaceC60871Nul {
    public final SparkPopupSchemaParam LIZ;
    public final View LIZIZ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        if (this.LIZ.getShowMask()) {
            this.LIZIZ.setVisibility(0);
        } else {
            this.LIZIZ.setVisibility(0);
            this.LIZIZ.setAlpha(0.0f);
        }
    }

    public C60920NvY(SparkPopupSchemaParam params, View view) {
        o.LJIIJ(params, "params");
        o.LJIIJ(view, "view");
        this.LIZ = params;
        this.LIZIZ = view;
    }
}
