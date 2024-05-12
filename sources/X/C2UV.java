package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2UV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2UV implements InterfaceC85416Xfg {
    public final long LIZ;
    public final List<Aweme> LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        int hashCode;
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        List<Aweme> list = this.LIZIZ;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        String str = this.LIZJ;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiShareParamsCacheData(videoCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", awemeList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isClaimed=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    @Override // X.InterfaceC85416Xfg
    public final long LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC85416Xfg
    public final String LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC85416Xfg
    public final List<Aweme> getAwemeList() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2UV)) {
            return false;
        }
        C2UV c2uv = (C2UV) obj;
        if (this.LIZ == c2uv.LIZ && o.LJ(this.LIZIZ, c2uv.LIZIZ) && o.LJ(this.LIZJ, c2uv.LIZJ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2UV(long j, List<? extends Aweme> list, String str) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = str;
    }
}
