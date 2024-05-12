package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.3Cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80153Cp implements IEvent {
    public final String LJLIL;
    public final Aweme LJLILLLLZI;
    public final Throwable LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80153Cp)) {
            return false;
        }
        C80153Cp c80153Cp = (C80153Cp) obj;
        return o.LJ(this.LJLIL, c80153Cp.LJLIL) && o.LJ(this.LJLILLLLZI, c80153Cp.LJLILLLLZI) && o.LJ(this.LJLJI, c80153Cp.LJLJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Aweme aweme = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Throwable th = this.LJLJI;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DetailAwemeRespEvent(aid=");
        LIZ.append(this.LJLIL);
        LIZ.append(", aweme=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", error=");
        return C169696lJ.LIZLLL(LIZ, this.LJLJI, ')', LIZ);
    }

    public C80153Cp(String str, Aweme aweme, Throwable th) {
        this.LJLIL = str;
        this.LJLILLLLZI = aweme;
        this.LJLJI = th;
    }
}
