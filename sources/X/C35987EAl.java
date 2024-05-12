package X;

import com.ss.ugc.live.sdk.message.interfaces.IFrequencyInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EAl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35987EAl {
    public final List<IInterceptor> LIZ;
    public final List<IFrequencyInterceptor> LIZIZ;
    public final YRJ LIZJ;
    public final java.util.Set<Integer> LIZLLL;

    public C35987EAl() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35987EAl)) {
            return false;
        }
        C35987EAl c35987EAl = (C35987EAl) obj;
        return o.LJ(this.LIZ, c35987EAl.LIZ) && o.LJ(this.LIZIZ, c35987EAl.LIZIZ) && o.LJ(this.LIZJ, c35987EAl.LIZJ) && o.LJ(this.LIZLLL, c35987EAl.LIZLLL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FunctionConfig(interceptors=");
        LIZ.append(this.LIZ);
        LIZ.append(", frequencyInterceptors=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", wsStrategyConfig=");
        LIZ.append(this.LIZJ);
        LIZ.append(", strategySet=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        YRJ yrj = this.LIZJ;
        if (yrj == null) {
            hashCode = 0;
        } else {
            hashCode = yrj.hashCode();
        }
        return this.LIZLLL.hashCode() + ((LIZIZ + hashCode) * 31);
    }

    public C35987EAl(List interceptors, YRJ yrj, java.util.Set strategySet, int i) {
        ArrayList frequencyInterceptors;
        interceptors = (i & 1) != 0 ? new ArrayList() : interceptors;
        if ((i & 2) != 0) {
            frequencyInterceptors = new ArrayList();
        } else {
            frequencyInterceptors = null;
        }
        yrj = (i & 4) != 0 ? null : yrj;
        strategySet = (i & 8) != 0 ? new LinkedHashSet() : strategySet;
        o.LJIIIZ(interceptors, "interceptors");
        o.LJIIIZ(frequencyInterceptors, "frequencyInterceptors");
        o.LJIIIZ(strategySet, "strategySet");
        this.LIZ = interceptors;
        this.LIZIZ = frequencyInterceptors;
        this.LIZJ = yrj;
        this.LIZLLL = strategySet;
    }
}
