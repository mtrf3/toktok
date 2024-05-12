package X;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FPY {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(File file, StackTraceElement[] stackTrace) {
        o.LJIIJ(stackTrace, "stackTrace");
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(System.currentTimeMillis()));
        o.LJFF(format, "dateformat.format(System.currentTimeMillis())");
        ArrayList arrayList = new ArrayList();
        FileWriter fileWriter = new FileWriter(new File(file, ".stacks"));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("OOM Time:");
        LIZ2.append(format);
        arrayList.add(X1D.LIZIZ(LIZ2));
        for (StackTraceElement stackTraceElement : stackTrace) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(String.valueOf(stackTraceElement.getLineNumber()));
            LIZ3.append(" className = ");
            LIZ3.append(stackTraceElement.getClassName());
            LIZ3.append(", methodName = ");
            LIZ3.append(stackTraceElement.getMethodName());
            arrayList.add(X1D.LIZIZ(LIZ3));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str);
            LIZ4.append('\n');
            fileWriter.write(X1D.LIZIZ(LIZ4));
        }
        fileWriter.close();
    }
}
