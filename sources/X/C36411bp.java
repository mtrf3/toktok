package X;

import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36411bp implements InterfaceC63146OqM {
    public Object LJLIL;

    @Override // X.InterfaceC63146OqM
    public final long LJIILJJIL() {
        return ((SQLiteStatement) this.LJLIL).executeInsert();
    }

    @Override // X.InterfaceC63146OqM
    public final int LJIJJLI() {
        return ((SQLiteStatement) this.LJLIL).executeUpdateDelete();
    }

    @Override // X.InterfaceC63146OqM
    public final void LJJIIZI() {
        ((SQLiteProgram) this.LJLIL).clearBindings();
    }

    @Override // X.InterfaceC63146OqM
    public final void close() {
        ((SQLiteClosable) this.LJLIL).close();
    }

    public /* synthetic */ C36411bp(InterfaceC65784Pro initializer) {
        o.LJIIJ(initializer, "initializer");
        this.LJLIL = new WeakReference(initializer.invoke());
    }

    public static List LIZ(C36411bp[] c36411bpArr) {
        Object obj;
        String str;
        ArrayList arrayList = new ArrayList();
        if (c36411bpArr != null && c36411bpArr.length > 0) {
            for (C36411bp c36411bp : c36411bpArr) {
                if (c36411bp != null && (obj = c36411bp.LJLIL) != null && ((StackTraceElement[]) obj).length > 0) {
                    StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
                    if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
                        str = "";
                    } else {
                        StringBuilder sb = new StringBuilder(stackTraceElementArr.length * 30);
                        for (int i = 0; i < stackTraceElementArr.length && i <= 40; i++) {
                            if (i == 0) {
                                "getThreadStackTrace".equals(stackTraceElementArr[0].getMethodName());
                            } else if (i == 1) {
                                if ("getStackTrace".equals(stackTraceElementArr[1].getMethodName())) {
                                }
                            } else if (i > 3) {
                                sb.append("\tat ");
                                sb.append(stackTraceElementArr[i].getClassName());
                                sb.append(".");
                                sb.append(stackTraceElementArr[i].getMethodName());
                                sb.append("(");
                                sb.append(stackTraceElementArr[i].getFileName());
                                sb.append(":");
                                sb.append(stackTraceElementArr[i].getLineNumber());
                                sb.append(")\n");
                            }
                        }
                        str = sb.toString();
                    }
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public final Object LIZIZ(InterfaceC74236TBo property) {
        o.LJIIJ(property, "property");
        return ((Reference) this.LJLIL).get();
    }

    @Override // X.InterfaceC63146OqM
    public final void LJIIIZ(int i, long j) {
        ((SQLiteProgram) this.LJLIL).bindLong(i, j);
    }

    @Override // X.InterfaceC63146OqM
    public final void LJJII(int i, String str) {
        ((SQLiteProgram) this.LJLIL).bindString(i, str);
    }

    @Override // X.InterfaceC63146OqM
    public final void LJJIIZ(int i, byte[] bArr) {
        ((SQLiteProgram) this.LJLIL).bindBlob(i, bArr);
    }
}
