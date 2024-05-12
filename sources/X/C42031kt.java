package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C42031kt extends C1MG {
    public C42031kt() {
        super(null);
    }

    @Override // X.C1MG, X.C0TD
    public final C0RA LIZ(C0TC c0tc) {
        int i;
        String str;
        C0R9 LIZIZ = LIZIZ(c0tc.LIZ());
        String str2 = LIZIZ.LIZIZ;
        C1NT c1nt = this.LIZ.LIZIZ;
        if (c1nt != null) {
            i = c1nt.LJII;
        } else {
            i = 10000;
        }
        try {
            str = UriProtector.parse(str2).getHost();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str = null;
        }
        boolean z = true;
        if (!TextUtils.isEmpty(str)) {
            z = true ^ ((ArrayList) this.LIZ.LIZIZ.LJIIIZ).contains(str);
        }
        return LIZLLL(LIZIZ, i, z);
    }

    @Override // X.C1MG
    public final C0R9 LIZIZ(C0R9 c0r9) {
        C38531fF c38531fF;
        Pattern pattern = null;
        if (c0r9 == null) {
            return null;
        }
        String str = c0r9.LIZIZ;
        boolean z = this instanceof C49461ws;
        if (this.LIZ.LIZIZ.LJIIIIZZ && (((!z) || Build.VERSION.SDK_INT <= 23) && !TextUtils.isEmpty(str))) {
            int i = 0;
            while (true) {
                try {
                    java.net.URI.create(str);
                    break;
                } catch (Exception e) {
                    Throwable th = e;
                    while (true) {
                        if (!(th instanceof URISyntaxException)) {
                            th = th.getCause();
                            if (th == null) {
                                String message = e.getMessage();
                                if (!TextUtils.isEmpty(message)) {
                                    if (pattern == null) {
                                        pattern = PatternProtector.compile("at index (\\d+):");
                                    }
                                    Matcher matcher = pattern.matcher(message);
                                    if (!matcher.find()) {
                                        break;
                                    }
                                    try {
                                        int parseInt = CastIntegerProtector.parseInt(matcher.group(1));
                                        if (parseInt < 0) {
                                            break;
                                        }
                                        str = C0E0.LIZ(parseInt, str);
                                    } catch (Exception e2) {
                                        C16880lQ.LLLLIIL(e2);
                                    }
                                } else {
                                    break;
                                }
                            }
                        } else {
                            int index = ((URISyntaxException) th).getIndex();
                            if (index < 0) {
                                break;
                            }
                            str = C0E0.LIZ(index, str);
                        }
                    }
                    i++;
                }
            }
            if (C35191Zr.LIZIZ().LIZJ.LIZIZ) {
                C16880lQ.LLLZI(Locale.getDefault(), "encoded[%d] url: [%s]", new Object[]{Integer.valueOf(i), str});
            }
        }
        if (!z && (c38531fF = c0r9.LJ) != null) {
            JSONObject jSONObject = c38531fF.LJII;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
                c38531fF.LJII = jSONObject;
            }
            try {
                jSONObject.putOpt("custom_net", 1);
            } catch (JSONException e3) {
                C16880lQ.LLLLIIL(e3);
            }
        }
        C0R8 c0r8 = c0r9.LIZ;
        c0r8.LIZ = str;
        return new C0R9(c0r8);
    }

    public C0RA LIZLLL(C0R9 c0r9, int i, boolean z) {
        throw new RuntimeException("Not implemented");
    }
}
