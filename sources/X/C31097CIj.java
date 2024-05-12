package X;

import Y.IDCListenerS78S0000000_5;
import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CIj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31097CIj {
    public static void LIZ(Activity activity, String str, InterfaceC31102CIo interfaceC31102CIo) {
        C77437UaH c77437UaH = new C77437UaH(activity);
        c77437UaH.LJI(R.string.ss1);
        c77437UaH.LIZJ(R.string.srz, new IDCListenerS78S0000000_5(2), false);
        c77437UaH.LJ(R.string.ss0, new DialogInterfaceOnClickListenerC31096CIi(activity, str, interfaceC31102CIo), false);
        c77437UaH.LJJII = false;
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-4276806615377798133")).LIZ) {
            return;
        }
        LIZ.show();
    }
}
