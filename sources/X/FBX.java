package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.SparkContext;

/* loaded from: classes7.dex */
public final class FBX extends AbstractC37353ElJ {
    public final /* synthetic */ SparkContext LIZIZ;

    @Override // X.InterfaceC61864OPs
    public final UCH LIZIZ() {
        return new UCH();
    }

    @Override // X.InterfaceC61864OPs
    public final Activity getActivity() {
        FCH.LIZIZ.getClass();
        return FCG.LIZIZ();
    }

    @Override // X.InterfaceC61864OPs
    public final java.util.Map<String, String> getParams() {
        return C75252xN.LIZJ(this.LIZIZ.containerId);
    }

    public FBX(SparkContext sparkContext) {
        this.LIZIZ = sparkContext;
    }
}
