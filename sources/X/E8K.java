package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E8K extends F9E implements Serializable {
    public final String LJLIL;
    public final long LJLILLLLZI;

    public static /* synthetic */ E8K copy$default(E8K e8k, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = e8k.LJLIL;
        }
        if ((i & 2) != 0) {
            j = e8k.LJLILLLLZI;
        }
        return e8k.copy(str, j);
    }

    public final E8K copy(String language, long j) {
        o.LJIIIZ(language, "language");
        return new E8K(language, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI)};
    }

    public final String getLanguage() {
        return this.LJLIL;
    }

    public final long getLanguageId() {
        return this.LJLILLLLZI;
    }

    public E8K(String language, long j) {
        o.LJIIIZ(language, "language");
        this.LJLIL = language;
        this.LJLILLLLZI = j;
    }
}
