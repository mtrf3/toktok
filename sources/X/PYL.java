package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.common.util.NetworkUtils;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PYL implements InterfaceC48121Iub {
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        String str;
        String LIZ;
        String str2;
        C64598PWw LIZIZ;
        PW8 pw8 = (PW8) pxz;
        C64598PWw LIZ2 = pw8.LIZ(pw8.LJFF);
        String str3 = null;
        String LIZ3 = LIZ2.LIZ("Content-Type", null);
        Request request = LIZ2.LJLIL;
        String str4 = "";
        if (request == null || request.url() == null) {
            str = "";
        } else {
            str = request.url().LJIIIIZZ;
        }
        if (TextUtils.isEmpty(LIZ3)) {
            return LIZ2;
        }
        if ((!TextUtils.isEmpty(LIZ3) && !LIZ3.contains("json")) || (!TextUtils.isEmpty(str) && (str.contains("/effect/api") || str.contains("/model/api")))) {
            return LIZ2;
        }
        PVM pvm = LIZ2.LJLJL;
        if (pvm != null) {
            PW3 source = pvm.source();
            source.request(Long.MAX_VALUE);
            C64531PUh c64531PUh = new C64531PUh(source.LJJIJ().clone());
            String LIZ4 = LIZ2.LIZ("Content-Encoding", null);
            if (LIZ4 == null || !"gzip".equalsIgnoreCase(LIZ4)) {
                Logger.debug();
            }
            try {
                C39745Fin contentType = pvm.contentType();
                if (contentType != null) {
                    LIZ = contentType.LIZ;
                } else {
                    LIZ = LIZ2.LIZ("Content-Type", null);
                }
                if (LIZ != null) {
                    str4 = LIZ;
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str4);
                if (pvm.contentLength() <= 2147483647L) {
                    if (contentType == null || contentType.LIZ(null) == null || (str2 = contentType.LIZ(null).name()) == null) {
                        str2 = "UTF-8";
                    }
                    System.currentTimeMillis();
                    if (((Boolean) C34656Diu.LIZ.getValue()).booleanValue()) {
                        str3 = NetworkUtils.response2StringOpt(false, testIsSSBinary, 0, c64531PUh, str2);
                    } else {
                        str3 = NetworkUtils.response2String(false, testIsSSBinary, 0, c64531PUh, str2);
                    }
                }
                NetworkUtils.safeClose(c64531PUh);
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        C64631PYd c64631PYd = new C64631PYd((PW8) pxz, LIZ2);
                        if (c64631PYd.LJ(((PW8) pxz).LJFF.url().LJIIIIZZ, jSONObject)) {
                            if (c64631PYd.LIZIZ) {
                                LIZIZ = c64631PYd.LIZ();
                            } else {
                                LIZIZ = c64631PYd.LIZIZ();
                            }
                            return LIZIZ;
                        }
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                    } catch (JSONException e2) {
                        C16880lQ.LLLLIIL(e2);
                    } catch (Exception e3) {
                        C16880lQ.LLLLIIL(e3);
                    }
                }
                return LIZ2;
            } catch (Throwable th) {
                NetworkUtils.safeClose(c64531PUh);
                throw th;
            }
        }
        throw new IllegalArgumentException("HTTP body may not be null");
    }
}
