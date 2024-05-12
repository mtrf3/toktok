package X;

import java.util.List;

/* renamed from: X.Qsn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68393Qsn extends AbstractC68391Qsl {
    @Override // X.AbstractC68391Qsl
    public final InterfaceC68379QsZ LIZ(String str, C68377QsX c68377QsX, List list) {
        if (str != null && !str.isEmpty() && c68377QsX.LJI(str)) {
            InterfaceC68379QsZ LIZLLL = c68377QsX.LIZLLL(str);
            if (LIZLLL instanceof AbstractC68364QsK) {
                return ((AbstractC68364QsK) LIZLLL).LIZ(c68377QsX, list);
            }
            throw new IllegalArgumentException(C16880lQ.LLLZ("Function %s is not defined", new Object[]{str}));
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Command not found: %s", new Object[]{str}));
    }
}
