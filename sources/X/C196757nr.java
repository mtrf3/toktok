package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196757nr {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final InterfaceC197277oh LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C196757nr)) {
            return false;
        }
        C196757nr c196757nr = (C196757nr) obj;
        return o.LJ(this.LIZ, c196757nr.LIZ) && o.LJ(this.LIZIZ, c196757nr.LIZIZ) && o.LJ(this.LIZJ, c196757nr.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Aweme aweme = this.LIZIZ;
        int hashCode2 = (hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        InterfaceC197277oh interfaceC197277oh = this.LIZJ;
        return hashCode2 + (interfaceC197277oh != null ? interfaceC197277oh.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowReporterParams(enterFrom=");
        LIZ.append(this.LIZ);
        LIZ.append(", aweme=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", videoInfoProvider=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C196757nr() {
        this("", null, null);
    }

    public C196757nr(String enterFrom, Aweme aweme, InterfaceC197277oh interfaceC197277oh) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ = enterFrom;
        this.LIZIZ = aweme;
        this.LIZJ = interfaceC197277oh;
    }
}
