package X;

import Y.IDeS404S0100000_10;
import android.app.Activity;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Nyh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61115Nyh {
    public static final InterfaceC61117Nyj LIZ;

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            LIZ = new R1D();
        } else {
            LIZ = new C61116Nyi();
        }
    }

    public static void LIZ(C164906da[] c164906daArr, InterfaceC61118Nyk interfaceC61118Nyk) {
        int i;
        if (interfaceC61118Nyk != null) {
            String[] strArr = new String[c164906daArr.length];
            int[] iArr = new int[c164906daArr.length];
            int i2 = 0;
            for (C164906da c164906da : c164906daArr) {
                strArr[i2] = c164906da.LIZ;
                if (c164906da.LIZIZ == EnumC61598OFm.GRANTED) {
                    i = 0;
                } else {
                    i = -1;
                }
                iArr[i2] = i;
                i2++;
            }
            interfaceC61118Nyk.LIZ(iArr, strArr);
        }
    }

    public static void LIZJ(Activity activity, String[] strArr, InterfaceC61118Nyk interfaceC61118Nyk) {
        boolean z = activity instanceof ActivityC45651qj;
        boolean LJ = C19N.LJ("enable_power_permissions", false);
        if (z && LJ) {
            C61098NyQ c61098NyQ = C61099NyR.LIZIZ;
            o.LJIIIZ(activity, "activity");
            c61098NyQ.LIZ();
            C61099NyR c61099NyR = new C61099NyR(activity, null);
            Iterator<AbstractC61106NyY> it = C61099NyR.LIZJ.iterator();
            while (it.hasNext()) {
                c61099NyR.LIZ.LIZ(new C61104NyW(it.next()));
            }
            c61099NyR.LIZ(strArr).LIZJ(new IDeS404S0100000_10(interfaceC61118Nyk, 3));
            return;
        }
        LIZ.LIZ(activity, strArr, interfaceC61118Nyk);
    }

    public static void LIZIZ(Activity activity, TokenCert tokenCert, String[] strArr, InterfaceC61118Nyk interfaceC61118Nyk) {
        C61099NyR.LIZIZ.LIZIZ(activity, tokenCert).LIZ(strArr).LIZJ(new IDeS404S0100000_10(interfaceC61118Nyk, 2));
    }
}
