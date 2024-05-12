package X;

import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.m;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Eq9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37653Eq9 {
    public static final m LIZ(String str) {
        if (str == null) {
            str = "";
        }
        byte[] bytes = str.getBytes(PVC.LIZ);
        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
        return LIZIZ(new ByteArrayInputStream(bytes), null, 3);
    }

    public static m LIZIZ(InputStream inputStream, String str, int i) {
        int i2;
        int max;
        Object LIZ;
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            i2 = 1024;
        } else {
            i2 = 0;
        }
        EnumC37654EqA enumC37654EqA = EnumC37654EqA.Start;
        try {
            try {
                C37655EqB c37655EqB = new C37655EqB(new C37678EqY(new InputStreamReader(inputStream, C37270Ejy.LIZIZ(str)), null, inputStream, str, i2));
                AnonymousClass636.LJFF(inputStream, null);
                StringBuilder sb = new StringBuilder();
                Iterator<Object> it = c37655EqB.iterator();
                do {
                    C37656EqC c37656EqC = (C37656EqC) it;
                    if (c37656EqC.hasNext()) {
                        char[] cArr = (char[]) c37656EqC.next();
                        max = Math.max(0, sb.length() - 32);
                        sb.append(cArr);
                        if (EnumC37654EqA.Start == enumC37654EqA) {
                            Integer valueOf = Integer.valueOf(sb.indexOf("<script pia-manifest", max));
                            if (valueOf.intValue() != -1) {
                                int intValue = valueOf.intValue();
                                enumC37654EqA = EnumC37654EqA.ManifestStartLeft;
                                sb.delete(0, intValue + 20);
                            }
                        }
                        if (EnumC37654EqA.ManifestStartLeft == enumC37654EqA) {
                            Integer valueOf2 = Integer.valueOf(sb.indexOf("type=\"application/json\">", max));
                            if (valueOf2.intValue() != -1) {
                                int intValue2 = valueOf2.intValue();
                                enumC37654EqA = EnumC37654EqA.ManifestStartRight;
                                sb.delete(0, intValue2 + 24);
                            }
                        }
                        if (EnumC37654EqA.ManifestStartRight == enumC37654EqA) {
                            Integer valueOf3 = Integer.valueOf(sb.indexOf("</script>", max));
                            if (valueOf3.intValue() != -1) {
                                sb.delete(valueOf3.intValue(), sb.length());
                                try {
                                    com.google.gson.o oVar = GsonUtils.LIZIZ;
                                    String sb2 = sb.toString();
                                    oVar.getClass();
                                    LIZ = com.google.gson.o.LIZ(sb2).LJIIZILJ();
                                    C3C5.m7constructorimpl(LIZ);
                                } catch (Throwable th) {
                                    LIZ = C141335gf.LIZ(th);
                                    C3C5.m7constructorimpl(LIZ);
                                }
                                if (C3C5.m12isFailureimpl(LIZ)) {
                                    LIZ = null;
                                }
                                return (m) LIZ;
                            }
                        }
                    } else {
                        C3C5.m7constructorimpl(sb);
                        return null;
                    }
                } while (sb.indexOf("</head>", max) == -1);
                return null;
            } finally {
            }
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
            return null;
        }
    }
}
