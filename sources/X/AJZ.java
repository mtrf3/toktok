package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AJZ extends Throwable {
    public final int LJLIL;
    public final EnumC74173T9d type;

    public static /* synthetic */ AJZ copy$default(AJZ ajz, EnumC74173T9d enumC74173T9d, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC74173T9d = ajz.type;
        }
        return ajz.copy(enumC74173T9d);
    }

    public final AJZ copy(EnumC74173T9d type) {
        o.LJIIIZ(type, "type");
        return new AJZ(type);
    }

    public int hashCode() {
        return Objects.hash(this.type);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return C78966Uyw.LJJJLL("ArticleModeNetworkException:%s", this.type);
    }

    public final int getErrMsgId() {
        return this.LJLIL;
    }

    public AJZ(EnumC74173T9d type) {
        o.LJIIIZ(type, "type");
        this.type = type;
        this.LJLIL = type.getErrMsgId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AJZ)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((AJZ) obj).type}, new Object[]{this.type});
    }
}
