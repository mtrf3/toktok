package X;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* renamed from: X.WJo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82088WJo {
    public static volatile C82088WJo LIZIZ;
    public final SharedPreferences LIZ;

    public C82088WJo(Context context) {
        SharedPreferences LIZIZ2 = F9J.LIZIZ(C16880lQ.LLLLL(context), 0, "asve_sp");
        o.LJIIIIZZ(LIZIZ2, "context.applicationConte…p\", Context.MODE_PRIVATE)");
        this.LIZ = LIZIZ2;
    }

    public final void LIZ(int i) {
        C82089WJp c82089WJp = new C82089WJp();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CameraAntiShakeV1 -> setCameraAntiShakeMode: mode = ");
        LIZ.append(i);
        c82089WJp.LIZ(X1D.LIZIZ(LIZ));
        C82089WJp c82089WJp2 = new C82089WJp();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CameraAntiShakeV1 -> setCameraAntiShakeMode: ");
        LIZ2.append(android.util.Log.getStackTraceString(new RuntimeException()));
        c82089WJp2.LIZ(X1D.LIZIZ(LIZ2));
        this.LIZ.edit().putInt("key_camera_shake_mode", i).apply();
    }
}
