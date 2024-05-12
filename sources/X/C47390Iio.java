package X;

import Y.ACListenerS43S0200000_8;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Iio, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47390Iio {
    public final InterfaceC88471Ynr<Float, Boolean, C76800UCe> LIZ;
    public final java.util.Map<Float, View> LIZIZ;
    public float LIZJ;

    public final void LIZ(float f) {
        for (Map.Entry<Float, View> entry : this.LIZIZ.entrySet()) {
            View value = entry.getValue();
            int i = 0;
            if (f == entry.getKey().floatValue()) {
                i = R.drawable.aho;
            }
            value.setBackgroundResource(i);
        }
    }

    public C47390Iio(View view, AqS190S0100000_8 aqS190S0100000_8) {
        o.LJIIIZ(view, "view");
        this.LIZ = aqS190S0100000_8;
        java.util.Map<Float, View> LJJL = C113554cx.LJJL(new OSZ(Float.valueOf(0.5f), view.findViewById(R.id.k_3)), new OSZ(Float.valueOf(1.0f), view.findViewById(R.id.k_5)), new OSZ(Float.valueOf(1.5f), view.findViewById(R.id.k_4)), new OSZ(Float.valueOf(2.0f), view.findViewById(R.id.k_6)));
        this.LIZIZ = LJJL;
        this.LIZJ = 1.0f;
        for (Map.Entry<Float, View> entry : LJJL.entrySet()) {
            C16880lQ.LJIIJ(new ACListenerS43S0200000_8(this, entry, 4), entry.getValue());
        }
    }
}
