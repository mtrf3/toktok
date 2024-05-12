package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.2r0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71302r0 extends F9E implements Serializable {
    public final String LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C71302r0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C71302r0 copy$default(C71302r0 c71302r0, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c71302r0.LJLIL;
        }
        return c71302r0.copy(str);
    }

    public final C71302r0 copy(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        return new C71302r0(enterFrom);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public final String getEnterFrom() {
        return this.LJLIL;
    }

    public C71302r0(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = enterFrom;
    }

    public /* synthetic */ C71302r0(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "chat" : str);
    }
}
