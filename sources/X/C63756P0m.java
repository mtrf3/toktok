package X;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.P0m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63756P0m extends RuntimeException {
    public static final long serialVersionUID = 3026362227162912146L;
    public final List<Throwable> LJLIL;
    public final String LJLILLLLZI;
    public C63757P0n LJLJI;

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.LJLJI == null) {
            C63757P0n c63757P0n = new C63757P0n();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.LJLIL.iterator();
            C63757P0n c63757P0n2 = c63757P0n;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    ArrayList arrayList = new ArrayList();
                    Throwable cause = next.getCause();
                    if (cause != null && cause != next) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Throwable th = (Throwable) it2.next();
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        c63757P0n2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = c63757P0n2.getCause();
                    if (cause3 != null && c63757P0n2 != cause3) {
                        do {
                            c63757P0n2 = cause3;
                            cause3 = cause3.getCause();
                            if (cause3 != null) {
                            }
                        } while (cause3 != c63757P0n2);
                    }
                }
            }
            this.LJLJI = c63757P0n;
        }
        return this.LJLJI;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.LJLIL.size();
    }

    public List<Throwable> getExceptions() {
        return this.LJLIL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LJLILLLLZI;
    }

    public C63756P0m(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof C63756P0m) {
                    linkedHashSet.addAll(((C63756P0m) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.LJLIL = unmodifiableList;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(unmodifiableList.size());
            LIZ.append(" exceptions occurred. ");
            this.LJLILLLLZI = X1D.LIZIZ(LIZ);
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public final void LIZIZ(AbstractC63760P0q abstractC63760P0q) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.LJLIL) {
            V1I.LIZLLL(sb, "  ComposedException ", i, " :\n");
            LIZ(sb, th, "\t");
            i++;
        }
        abstractC63760P0q.LIZ(sb.toString());
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        LIZIZ(new C63758P0o(printStream));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63756P0m(java.lang.Throwable... r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L11
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "exceptions was null"
            r1.<init>(r0)
            java.util.List r0 = java.util.Collections.singletonList(r1)
        Ld:
            r2.<init>(r0)
            return
        L11:
            java.util.List r0 = java.util.Arrays.asList(r3)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63756P0m.<init>(java.lang.Throwable[]):void");
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        LIZIZ(new C63759P0p(printWriter));
    }

    public static void LIZ(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            LIZ(sb, th.getCause(), "");
        }
    }
}
