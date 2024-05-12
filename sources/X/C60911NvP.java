package X;

import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.NvP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60911NvP implements InterfaceC60871Nul {
    public final SparkPopupSchemaParam LIZ;
    public final View LIZIZ;
    public final SparkContext LIZJ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        if (this.LIZ.getMaskBgColor() != null) {
            View view = this.LIZIZ;
            C60908NvM maskBgColor = this.LIZ.getMaskBgColor();
            Integer num = null;
            String str = null;
            if (maskBgColor != null) {
                Context context = this.LIZIZ.getContext();
                SparkContext sparkContext = this.LIZJ;
                if (sparkContext != null) {
                    str = sparkContext.LJIJ();
                }
                num = Integer.valueOf(maskBgColor.getColor(context, str));
            }
            view.setBackgroundColor(num.intValue());
            return;
        }
        this.LIZIZ.setBackgroundColor(0);
    }

    public C60911NvP(SparkPopupSchemaParam params, View view, SparkContext sparkContext) {
        o.LJIIJ(params, "params");
        o.LJIIJ(view, "view");
        this.LIZ = params;
        this.LIZIZ = view;
        this.LIZJ = sparkContext;
    }
}
