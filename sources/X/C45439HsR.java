package X;

import android.content.Context;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.HsR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45439HsR implements HMB, C5KT, InterfaceC89813fl, HBL {
    public static boolean LJLIL = false;
    public static boolean LJLILLLLZI = false;
    public static boolean LJLJI = false;
    public static int LJLJJI = -1;
    public static final C45439HsR LJLJJL = new C45439HsR();

    @Override // X.C5KT
    public void LJI(C5KU c5ku) {
    }

    @Override // X.C5KT
    public void onProgress(float f) {
    }

    @Override // X.HBL
    public boolean LIZIZ() {
        int beautificationMode = C60903NvH.LJIIJJI().LJJIL().getBeautificationMode(0);
        if (beautificationMode == 0 || beautificationMode != 1) {
            return false;
        }
        return true;
    }

    public static String LJII(String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            if (split.length != 2) {
                str2 = "";
            } else {
                str2 = split[1];
            }
            if (str.contains("{") && str.contains("}")) {
                str3 = str.split("\\{")[0];
                try {
                    String str4 = str.split("\\}")[1];
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str3);
                    LIZ.append(str4);
                    str = X1D.LIZIZ(LIZ);
                } catch (Throwable unused) {
                    return str3;
                }
            } else {
                str3 = str;
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(str2);
            return X1D.LIZIZ(LIZ2);
        } catch (Throwable unused2) {
            return str;
        }
    }

    public static String LJIIIIZZ(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "Invalid Stack\n";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            i++;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("\tat ");
            LIZ.append(stackTraceElement.getClassName());
            sb.append(X1D.LIZIZ(LIZ));
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
            if (i > 40) {
                break;
            }
        }
        return sb.toString();
    }

    @Override // X.HMB
    public HM5 LIZLLL(Context context, String closetName) {
        o.LJIIJ(context, "context");
        o.LJIIJ(closetName, "closetName");
        return new C36855EdH(context, closetName);
    }

    @Override // X.C5KT
    public void LJ(String inputPath, String outputPath) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resizeSingleImage onCancel: inputPath = ");
        LIZ.append(inputPath);
        C5KN.LIZJ(X1D.LIZIZ(LIZ));
        C5KN.LIZ.remove(inputPath);
    }

    @Override // X.C5KT
    public void LJFF(String inputPath, String outputPath) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resizeSingleImage onSuccess: inputPath = ");
        LIZ.append(inputPath);
        LIZ.append(", outputPath = ");
        LIZ.append(outputPath);
        C5KN.LIZJ(X1D.LIZIZ(LIZ));
        C5KN.LIZ.remove(inputPath);
    }

    @Override // X.C5KT
    public void LIZ(String str, String str2, String str3) {
        HH1.LIZ(str, "inputPath", str2, "outputPath", str3, "errorInfo");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resizeSingleImage onError: inputPath = ");
        LIZ.append(str);
        LIZ.append(", errorInfo = ");
        LIZ.append(str3);
        C5KN.LIZJ(X1D.LIZIZ(LIZ));
        C5KN.LIZ.remove(str);
    }

    @Override // X.InterfaceC89813fl
    public Object LIZJ(Object obj, Object obj2, Object obj3) {
        AbstractC65743Pr9 abstractC65743Pr9 = (AbstractC65743Pr9) obj;
        AbstractC65743Pr9 abstractC65743Pr92 = (AbstractC65743Pr9) obj2;
        o.LJI(abstractC65743Pr9);
        o.LJI(abstractC65743Pr92);
        o.LJI(obj3);
        return new C43842HIo(abstractC65743Pr9, abstractC65743Pr92, obj3);
    }
}
