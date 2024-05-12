package X;

import android.app.Application;
import android.os.Build;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.platform.godzilla.sysopt.UbsanOpt;

/* renamed from: X.EdZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36873EdZ extends F8Y {
    @Override // X.F8Y
    public final String LIZIZ() {
        return "UbsanOptPlugin";
    }

    @Override // X.F8Y
    public final void LIZJ(Application application) {
    }

    @Override // X.F8Y
    public final void LIZLLL() {
        F8X.LIZ();
        String hexString = Long.toHexString(79531005658441L);
        if (hexString == null || hexString.equals("")) {
            return;
        }
        String replace = hexString.replace(" ", "");
        int length = replace.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) (CastIntegerProtector.parseInt(replace.substring(i2, i2 + 2), 16) & 255);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        try {
            replace = new String(bArr, "UTF-8");
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        if (!Build.MANUFACTURER.toUpperCase().contains(replace) || Build.VERSION.SDK_INT != 29) {
            return;
        }
        UbsanOpt.start();
    }
}
