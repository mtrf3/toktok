package X;

/* loaded from: classes7.dex */
public final class EPO implements InterfaceC66022Pve {
    @Override // X.InterfaceC66022Pve
    public final String LIZ(Object obj) {
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
        StringBuilder sb = new StringBuilder(256);
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        if (stackTraceElementArr.length == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("\t─ ");
            LIZ.append(stackTraceElementArr[0].toString());
            return X1D.LIZIZ(LIZ);
        }
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append("\n");
            }
            if (i != length - 1) {
                sb.append("\t├ ");
                sb.append(stackTraceElementArr[i].toString());
                sb.append("\n");
            } else {
                sb.append("\t└ ");
                sb.append(stackTraceElementArr[i].toString());
            }
        }
        return sb.toString();
    }
}
