package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.recharge.LiveRechargeStepOptimizeSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Cbi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31662Cbi implements InterfaceC77692UeO {
    @Override // X.InterfaceC77692UeO
    public final boolean LIZ() {
        if (LiveRechargeStepOptimizeSetting.INSTANCE.getValue() != 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC77692UeO
    public final String LIZIZ(Context context) {
        if (LiveRechargeStepOptimizeSetting.INSTANCE.getValue() == 0) {
            String string = context.getString(R.string.kq6);
            o.LJIIIIZZ(string, "{\n            context.ge…uston_subtitle)\n        }");
            return string;
        }
        String string2 = context.getString(R.string.kpt);
        o.LJIIIIZZ(string2, "{\n            context.ge…_custom_larger)\n        }");
        return string2;
    }
}
