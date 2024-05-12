package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.T9f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74175T9f extends Throwable {
    public final EnumC74174T9e type;

    public static /* synthetic */ C74175T9f copy$default(C74175T9f c74175T9f, EnumC74174T9e enumC74174T9e, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC74174T9e = c74175T9f.type;
        }
        return c74175T9f.copy(enumC74174T9e);
    }

    public final C74175T9f copy(EnumC74174T9e type) {
        o.LJIIIZ(type, "type");
        return new C74175T9f(type);
    }

    public int hashCode() {
        return Objects.hash(this.type);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return C78966Uyw.LJJJLL("PhotoModeNetworkException:%s", this.type);
    }

    public C74175T9f(EnumC74174T9e type) {
        o.LJIIIZ(type, "type");
        this.type = type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74175T9f)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C74175T9f) obj).type}, new Object[]{this.type});
    }
}
