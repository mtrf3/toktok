package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes12.dex */
public final class PA2 implements HostnameVerifier {
    public static final PA2 LIZ = new PA2();

    public static List<String> LIZ(X509Certificate x509Certificate) {
        List<String> LIZIZ = LIZIZ(x509Certificate, 7);
        List<String> LIZIZ2 = LIZIZ(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(LIZIZ2.size() + LIZIZ.size());
        arrayList.addAll(LIZIZ);
        arrayList.addAll(LIZIZ2);
        return arrayList;
    }

    public static List<String> LIZIZ(X509Certificate x509Certificate, int i) {
        Integer num;
        Object obj;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) ListProtector.get(list, 0)) != null && num.intValue() == i && (obj = ListProtector.get(list, 1)) != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static boolean LIZJ(String str, X509Certificate x509Certificate) {
        String str2;
        if (PVA.LJIILLIIL.matcher(str).matches()) {
            List<String> LIZIZ = LIZIZ(x509Certificate, 7);
            int size = LIZIZ.size();
            for (int i = 0; i < size; i++) {
                if (!str.equalsIgnoreCase((String) ListProtector.get(LIZIZ, i))) {
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        for (String str3 : LIZIZ(x509Certificate, 2)) {
            if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && str3 != null && str3.length() != 0 && !str3.startsWith(".") && !str3.endsWith("..")) {
                if (!lowerCase.endsWith(".")) {
                    str2 = C42398GkU.LIZIZ(lowerCase, '.');
                } else {
                    str2 = lowerCase;
                }
                if (!str3.endsWith(".")) {
                    str3 = C42398GkU.LIZIZ(str3, '.');
                }
                String lowerCase2 = str3.toLowerCase(Locale.US);
                if (!lowerCase2.contains("*")) {
                    if (str2.equals(lowerCase2)) {
                    }
                } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && str2.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                    String substring = lowerCase2.substring(1);
                    if (str2.endsWith(substring)) {
                        int length = str2.length() - substring.length();
                        if (length > 0 && str2.lastIndexOf(46, length - 1) != -1) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
        return true;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return LIZJ(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
