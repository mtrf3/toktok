package X;

import android.util.Printer;

/* renamed from: X.Fj8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39766Fj8 extends W8S implements Printer {
    public Printer LJLJI;

    public C39766Fj8(C77119UOl c77119UOl) {
        super("TriggerFromLooperPrinter", c77119UOl);
    }

    @Override // android.util.Printer
    public final void println(String str) {
        Object obj;
        if (str.charAt(0) == '<' && (obj = this.LJLILLLLZI) != null) {
            obj.getClass();
            C77119UOl.LJIJI();
        }
        Printer printer = this.LJLJI;
        if (printer != null) {
            printer.println(str);
        }
    }
}
