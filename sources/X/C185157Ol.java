package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ol, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185157Ol {
    public final Aweme LIZ;
    public final InterfaceC185147Ok LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C185157Ol)) {
            return false;
        }
        C185157Ol c185157Ol = (C185157Ol) obj;
        return o.LJ(this.LIZ, c185157Ol.LIZ) && o.LJ(this.LIZIZ, c185157Ol.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC185147Ok interfaceC185147Ok = this.LIZIZ;
        return hashCode + (interfaceC185147Ok == null ? 0 : interfaceC185147Ok.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionEditData(aweme=");
        LIZ.append(this.LIZ);
        LIZ.append(", listener=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C185157Ol(Aweme aweme, InterfaceC185147Ok interfaceC185147Ok) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZ = aweme;
        this.LIZIZ = interfaceC185147Ok;
    }
}
