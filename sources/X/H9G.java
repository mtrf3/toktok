package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9G extends F9E implements Serializable {

    @GPV
    public String LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public H9G() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ H9G copy$default(H9G h9g, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = h9g.LJLIL;
        }
        return h9g.copy(str);
    }

    public final H9G copy(String fromTag) {
        o.LJIIIZ(fromTag, "fromTag");
        return new H9G(fromTag);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public final String getFromTag() {
        return this.LJLIL;
    }

    public H9G(String fromTag) {
        o.LJIIIZ(fromTag, "fromTag");
        this.LJLIL = fromTag;
    }

    public final void setFromTag(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    public /* synthetic */ H9G(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
