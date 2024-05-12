package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import ujb.o;
import ujb.s;

/* renamed from: X.3Xx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85693Xx {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(android.net.Uri uri) {
        if (uri != null && LIZIZ(uri)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(uri.getScheme());
            LIZ2.append(':');
            LIZ2.append(uri.getEncodedSchemeSpecificPart());
            String str = (String) ListProtector.get(s.LJLJJI(X1D.LIZIZ(LIZ2), new char[]{'?'}, false, 6), 0);
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public static final boolean LIZIZ(android.net.Uri uri) {
        String str;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI("http", "https");
        if (uri != null) {
            str = uri.getScheme();
        } else {
            str = null;
        }
        return ORZ.LJLJJI(str, LJJIJIIJI);
    }

    public static final String LIZJ(android.net.Uri uri, List<String> list) {
        if (uri == null || !LIZIZ(uri)) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(uri.getAuthority());
        stringBuffer.append(uri.getPath());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String queryParameter = UriProtector.getQueryParameter(uri, "_pia_vary_");
        if (queryParameter != null) {
            List<String> LJLJJI = s.LJLJJI(queryParameter, new char[]{','}, false, 6);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJI, 10));
            for (String str : LJLJJI) {
                if (str != null) {
                    arrayList.add(s.LJZI(str).toString());
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            linkedHashSet.addAll(arrayList);
        }
        if (list != null) {
            linkedHashSet.addAll(list);
        }
        List<String> LLIL = ORZ.LLIL(linkedHashSet);
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : LLIL) {
            String queryParameter2 = UriProtector.getQueryParameter(uri, str2);
            if (queryParameter2 != null && !o.LJJJJJL(queryParameter2)) {
                arrayList2.add(new OSZ(str2, queryParameter2));
            }
        }
        if (!arrayList2.isEmpty()) {
            OSZ osz = (OSZ) ORZ.LJLLJ(arrayList2);
            stringBuffer.append("?");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append((String) osz.getFirst());
            LIZ2.append('=');
            LIZ2.append((String) osz.getSecond());
            stringBuffer.append(X1D.LIZIZ(LIZ2));
            List<OSZ> LJLJJLL = ORZ.LJLJJLL(arrayList2, 1);
            if (LJLJJLL != null) {
                for (OSZ osz2 : LJLJJLL) {
                    String str3 = (String) osz2.getFirst();
                    String str4 = (String) osz2.getSecond();
                    stringBuffer.append("&");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str3);
                    LIZ3.append('=');
                    LIZ3.append(str4);
                    stringBuffer.append(X1D.LIZIZ(LIZ3));
                }
            }
        }
        return stringBuffer.toString();
    }
}
