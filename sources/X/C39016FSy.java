package X;

/* renamed from: X.FSy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39016FSy {
    public static String LIZIZ(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            StringBuilder sb = new StringBuilder(stackTraceElementArr.length * 30);
            for (int i = 0; i < stackTraceElementArr.length && i <= 40; i++) {
                if (i == 0) {
                    if ("getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName())) {
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("\tat ");
                    LIZ.append(stackTraceElementArr[i].getClassName());
                    sb.append(X1D.LIZIZ(LIZ));
                    sb.append(".");
                    sb.append(stackTraceElementArr[i].getMethodName());
                    sb.append("(");
                    sb.append(stackTraceElementArr[i].getFileName());
                    sb.append(":");
                    sb.append(stackTraceElementArr[i].getLineNumber());
                    sb.append(")\n");
                } else {
                    if (i == 1 && "getStackTrace".equals(stackTraceElementArr[1].getMethodName())) {
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("\tat ");
                    LIZ2.append(stackTraceElementArr[i].getClassName());
                    sb.append(X1D.LIZIZ(LIZ2));
                    sb.append(".");
                    sb.append(stackTraceElementArr[i].getMethodName());
                    sb.append("(");
                    sb.append(stackTraceElementArr[i].getFileName());
                    sb.append(":");
                    sb.append(stackTraceElementArr[i].getLineNumber());
                    sb.append(")\n");
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("stackTraceElements must not be null or empty");
    }

    public static String LIZ(int i, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (StackTraceElement stackTraceElement : stackTrace) {
            i2++;
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
            if (i2 > i) {
                break;
            }
        }
        return sb.toString();
    }
}
