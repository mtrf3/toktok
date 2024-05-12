package X;

import Y.ACListenerS30S0100000_10;
import android.view.View;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NvT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60915NvT implements InterfaceC60871Nul {
    public final SparkFragment LIZ;
    public final SparkPopupSchemaParam LIZIZ;
    public final View LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 197), this.LIZJ);
    }

    public C60915NvT(SparkFragment sparkFragment, SparkPopupSchemaParam params, View view, AqS160S0100000_10 aqS160S0100000_10) {
        o.LJIIJ(params, "params");
        o.LJIIJ(view, "view");
        this.LIZ = sparkFragment;
        this.LIZIZ = params;
        this.LIZJ = view;
        this.LIZLLL = aqS160S0100000_10;
    }
}
