package X;

import com.bytedance.im.core.proto.Response;
import java.util.Objects;

/* renamed from: X.Oyt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63675Oyt extends QXX {
    public final Response LJLIL;

    public final int hashCode() {
        return Objects.hash(this.LJLIL);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("RemoteResponse:%s", this.LJLIL);
    }

    public C63675Oyt(Response response) {
        super((Object) null);
        this.LJLIL = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63675Oyt)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C63675Oyt) obj).LJLIL}, new Object[]{this.LJLIL});
    }
}
