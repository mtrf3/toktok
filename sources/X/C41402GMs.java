package X;

import Y.AfS53S0100000_1;
import android.content.Context;
import android.graphics.Bitmap;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GMs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41402GMs {
    public static final C41402GMs LIZ = new C41402GMs();

    public static final void LIZ(String input, InterfaceC88472Yns<? super String, C76800UCe> callback) {
        o.LJIIIZ(input, "input");
        o.LJIIIZ(callback, "callback");
        ET2.LIZ(input).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS53S0100000_1(callback, 2), new AfS53S0100000_1(callback, 3));
    }

    public static final void LIZLLL(Context context, Bitmap snapShot, InterfaceC88471Ynr<? super List<String>, ? super String, C76800UCe> callback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(snapShot, "snapShot");
        o.LJIIIZ(callback, "callback");
        try {
            File LIZIZ = C44118HTe.LIZIZ(context, snapShot);
            if (LIZIZ != null) {
                C41400GMq.LIZ(LIZIZ, new AqS173S0100000_7(callback, (InterfaceC88471Ynr<? super List<String>, ? super String, C76800UCe>) 3));
            }
        } catch (Exception unused) {
            callback.invoke(C61878OQg.INSTANCE, "");
        }
    }

    public final GT3 LIZIZ(Context context, List list, int i, boolean z, InterfaceC88472Yns clickMethod) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(list, "list");
        o.LJIIIZ(clickMethod, "clickMethod");
        GT3 gt3 = new GT3(context);
        gt3.setCategoryName(i);
        gt3.LIZ(z);
        gt3.LIZIZ(clickMethod, list);
        return gt3;
    }

    public final void LIZJ(int i, int i2, String arg3, InterfaceC88472Yns successMethod, InterfaceC88472Yns errorMethod) {
        o.LJIIIZ(arg3, "arg3");
        o.LJIIIZ(successMethod, "successMethod");
        o.LJIIIZ(errorMethod, "errorMethod");
        if (i == 8193) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        errorMethod.invoke(Integer.valueOf(R.string.gqr));
                        return;
                    } else {
                        errorMethod.invoke(Integer.valueOf(R.string.c0_));
                        return;
                    }
                }
                errorMethod.invoke(Integer.valueOf(R.string.c0a));
                return;
            }
            successMethod.invoke(arg3);
        }
    }
}
