package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* renamed from: X.Iui, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48128Iui {
    public final Context LIZ;
    public int LIZIZ;

    public C48128Iui(Context context) {
        this.LIZ = context;
    }

    public final long LIZ(C64598PWw c64598PWw) {
        String LIZ;
        C48129Iuj c48129Iuj = (C48129Iuj) this;
        if (c48129Iuj.LIZJ < 4) {
            try {
                NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) C16880lQ.LLILL(c48129Iuj.LIZ, "connectivity"));
                if (LJJLI != null) {
                    if (LJJLI.isAvailable()) {
                        c48129Iuj.LIZIZ = c48129Iuj.LIZIZ + 1;
                        long random = (long) ((Math.random() * 10.0d * 1000.0d) + Math.min((1 << r0) * 5000, 120000L));
                        if (random != -1) {
                            c48129Iuj.LIZJ++;
                            if (c64598PWw != null) {
                                try {
                                    if (!c64598PWw.LIZIZ()) {
                                        int i = c64598PWw.LJLJI;
                                        if ((i == 414 || i == 511 || i == 512) && (LIZ = c64598PWw.LIZ("Handshake-Options", null)) != null) {
                                            for (String str : LIZ.split(";")) {
                                                if (!TextUtils.isEmpty(str)) {
                                                    String[] split = str.split("=");
                                                    if ("reconnect-interval".equals(split[0])) {
                                                        try {
                                                            random = CastLongProtector.parseLong(split[1]);
                                                            return random * 1000;
                                                        } catch (NumberFormatException unused) {
                                                            continue;
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                            }
                                            return random;
                                        }
                                        return random;
                                    }
                                    return random;
                                } catch (Exception e) {
                                    C16880lQ.LLLLIIL(e);
                                    return random;
                                }
                            }
                            return random;
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return -1L;
    }
}
