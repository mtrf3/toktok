package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4AF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AF {
    public static final C4AF LIZ = new C4AF();
    public static final String[] LIZIZ = new String[0];
    public static final Pattern LIZJ;

    static {
        Pattern compile = PatternProtector.compile("(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)", 42);
        o.LJIIIIZZ(compile, "compile(\n        \"(?:^|[…E or Pattern.DOTALL\n    )");
        LIZJ = compile;
    }

    public static String[] LIZIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = LIZIZ;
        String[] strArr2 = (String[]) LIZLLL.LJIIIIZZ("tt_dm_sec_domain", String[].class, strArr);
        if (strArr2 == null) {
            return strArr;
        }
        return strArr2;
    }

    public static boolean LIZ(String str, String[] strArr) {
        if (strArr.length == 0 || str == null || str.length() == 0) {
            return false;
        }
        for (InterfaceC59973NgH interfaceC59973NgH : OJD.findAll$default(new OJD(LIZJ), str, 0, 2, null)) {
            C4AF c4af = LIZ;
            String value = interfaceC59973NgH.getValue();
            c4af.getClass();
            if (LIZJ(value, strArr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(String str, String[] whitelist) {
        o.LJIIIZ(whitelist, "whitelist");
        boolean z = true;
        if (whitelist.length == 0 || str == null || str.length() == 0) {
            return false;
        }
        try {
            String host = new java.net.URI(s.LJZI(str).toString()).getHost();
            if (host == null) {
                return false;
            }
            for (String str2 : whitelist) {
                if (!ujb.o.LJJJJIZL(host, str2, true)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('.');
                    LIZ2.append(str2);
                    if (!ujb.o.LJJJJ(host, X1D.LIZIZ(LIZ2), true)) {
                    }
                }
                if (str2 != null) {
                    z = false;
                }
                return z;
            }
            return z;
        } catch (URISyntaxException e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("url is malformed ");
            LIZ3.append(str);
            C34B.LIZLLL("MessagingSecureDomainSetting", X1D.LIZIZ(LIZ3), e);
            return false;
        }
    }

    public static /* synthetic */ boolean LIZLLL(C4AF c4af, String str) {
        c4af.getClass();
        String[] LIZIZ2 = LIZIZ();
        c4af.getClass();
        return LIZJ(str, LIZIZ2);
    }

    public static boolean LJ(C4AF c4af, UrlModel urlModel) {
        List<String> urlList;
        c4af.getClass();
        String[] whitelist = LIZIZ();
        c4af.getClass();
        o.LJIIIZ(whitelist, "whitelist");
        if (whitelist.length != 0 && urlModel != null && (urlList = urlModel.getUrlList()) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(urlList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                LIZ.getClass();
                if (LIZJ(str, whitelist)) {
                    return true;
                }
            }
        }
        return false;
    }
}
