package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qsl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68391Qsl {
    public final List LIZ = new ArrayList();

    public abstract InterfaceC68379QsZ LIZ(String str, C68377QsX c68377QsX, List list);

    public final void LIZIZ(String str) {
        if (((ArrayList) this.LIZ).contains(C68368QsO.LJ(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
