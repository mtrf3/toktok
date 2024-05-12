package X;

import android.view.View;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nw0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60948Nw0 implements InterfaceC60871Nul {
    public static final /* synthetic */ int LIZLLL = 0;
    public final SparkPopupSchemaParam LIZ;
    public final View LIZIZ;
    public final Integer[] LIZJ;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        C60942Nvu.LIZJ(C60942Nvu.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ), this.LIZIZ);
    }

    public C60948Nw0(SparkPopupSchemaParam params, View view, Integer[] margin) {
        o.LJIIJ(params, "params");
        o.LJIIJ(view, "view");
        o.LJIIJ(margin, "margin");
        this.LIZ = params;
        this.LIZIZ = view;
        this.LIZJ = margin;
    }
}
