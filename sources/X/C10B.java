package X;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.10B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10B extends Exception {
    public static final long serialVersionUID = 1;
    public final List<Throwable> LJLIL;

    public Throwable[] getCauses() {
        List<Throwable> list = this.LJLIL;
        return (Throwable[]) list.toArray(new Throwable[list.size()]);
    }

    public List<Exception> getErrors() {
        ArrayList arrayList = new ArrayList();
        List<Throwable> list = this.LJLIL;
        if (list == null) {
            return arrayList;
        }
        for (Throwable th : list) {
            if (th instanceof Exception) {
                arrayList.add(th);
            } else {
                arrayList.add(new Exception(th));
            }
        }
        return arrayList;
    }

    public List<Throwable> getInnerThrowables() {
        return this.LJLIL;
    }

    public C10B(List<? extends Throwable> list) {
        this("There were multiple errors.", list);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.LJLIL) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append((CharSequence) Integer.toString(i));
            printStream.append(": ");
            th.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.LJLIL) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append((CharSequence) Integer.toString(i));
            printWriter.append(": ");
            th.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10B(java.lang.String r2, java.util.List<? extends java.lang.Throwable> r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L19
            int r0 = r3.size()
            if (r0 <= 0) goto L19
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        Lf:
            r1.<init>(r2, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r3)
            r1.LJLIL = r0
            return
        L19:
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10B.<init>(java.lang.String, java.util.List):void");
    }

    public C10B(String str, Throwable[] thArr) {
        this(str, (List<? extends Throwable>) Arrays.asList(thArr));
    }
}
