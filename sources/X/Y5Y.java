package X;

import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import ij2.a;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.IDqS188S0200000_15;
import yi2.b;

/* loaded from: classes16.dex */
public final class Y5Y implements b {
    public final /* synthetic */ Y5Z LIZ;

    public Y5Y(Y5Z y5z) {
        this.LIZ = y5z;
    }

    @Override // yi2.b
    public final void LIZ(int i, int i2, String str, PipoOcrResult pipoOcrResult, String str2) {
        Integer num;
        int i3;
        byte[] LIZ;
        ByteArrayOutputStream byteArrayOutputStream;
        if (i != -1) {
            if (i != 0 && i != 1) {
                return;
            }
            this.LIZ.LJLIL.LIZ(i, i2, str, pipoOcrResult);
            return;
        }
        Y5K y5k = this.LIZ.LJLIL.LJII;
        if (y5k != null) {
            try {
                NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(y5k, "connectivity"));
                if (LJJLI != null) {
                    if (LJJLI.isConnected()) {
                    }
                }
            } catch (Exception unused) {
            }
            this.LIZ.LJLIL.LIZ(0, 106, "Network unavailable!", null);
        }
        if (this.LIZ.LJLJI) {
            a aVar = a.LJIJ;
            long currentTimeMillis = System.currentTimeMillis();
            aVar.getClass();
            a.LJIIIZ = currentTimeMillis;
        }
        Bitmap bitmap = pipoOcrResult.originalImage;
        if (bitmap != null && bitmap.getByteCount() > 4194304) {
            bitmap = C45283Hpv.LIZJ(4194304, bitmap);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[handleSingleFrame] format:");
        LIZ2.append(this.LIZ.LJLJJI);
        LIZ2.append(" width:");
        LIZ2.append(this.LIZ.LJLJJL);
        LIZ2.append(" height:");
        LIZ2.append(this.LIZ.LJLJJLL);
        LIZ2.append(" imageStride:");
        LIZ2.append(this.LIZ.LJLJJL);
        LIZ2.append(" left:");
        LIZ2.append(this.LIZ.LJLJL);
        LIZ2.append(" top:");
        LIZ2.append(this.LIZ.LJLJLJ);
        LIZ2.append(" scanWidth:");
        LIZ2.append(this.LIZ.LJLJLLL.element);
        LIZ2.append(" scanHeight:");
        LIZ2.append(this.LIZ.LJLL.element);
        LIZ2.append(" final image size is ");
        if (bitmap != null) {
            num = Integer.valueOf(bitmap.getByteCount());
        } else {
            num = null;
        }
        LIZ2.append(num);
        X1D.LIZIZ(LIZ2);
        if (bitmap != null) {
            i3 = bitmap.getByteCount();
        } else {
            i3 = 0;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("scan image size:");
        double d = 1024;
        LIZ3.append(((i3 + LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) / d) / d);
        X1D.LIZIZ(LIZ3);
        a.LJIJ.getClass();
        C82953Wh3 LIZIZ = a.LIZIZ();
        if (TextUtils.isEmpty(LIZIZ.LJ)) {
            this.LIZ.LJLIL.LIZ(0, 101, "nonce is empty", null);
            return;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable unused2) {
            LIZ = C45283Hpv.LIZ(bitmap);
        }
        if (bitmap != null) {
            Boolean valueOf = Boolean.valueOf(bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream));
            if (valueOf.booleanValue()) {
                valueOf.booleanValue();
                LIZ = byteArrayOutputStream.toByteArray();
                if (LIZ != null) {
                    LIZIZ.LJFF = Base64.encodeToString(LIZ, 0);
                    a aVar2 = a.LJIJ;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    aVar2.getClass();
                    a.LJIIIIZZ = currentTimeMillis2;
                    new C82952Wh2().LIZIZ("video", LIZIZ, new IDqS188S0200000_15(this, bitmap, 0));
                }
            }
        }
        LIZ = C45283Hpv.LIZ(bitmap);
        LIZIZ.LJFF = Base64.encodeToString(LIZ, 0);
        a aVar22 = a.LJIJ;
        long currentTimeMillis22 = System.currentTimeMillis();
        aVar22.getClass();
        a.LJIIIIZZ = currentTimeMillis22;
        new C82952Wh2().LIZIZ("video", LIZIZ, new IDqS188S0200000_15(this, bitmap, 0));
    }
}
