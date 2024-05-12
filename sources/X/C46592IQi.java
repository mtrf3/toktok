package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.IQi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46592IQi implements IEvent {
    public final Aweme LJLIL;
    public final boolean LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46592IQi)) {
            return false;
        }
        C46592IQi c46592IQi = (C46592IQi) obj;
        return o.LJ(this.LJLIL, c46592IQi.LJLIL) && this.LJLILLLLZI == c46592IQi.LJLILLLLZI && this.LJLJI == c46592IQi.LJLJI && this.LJLJJI == c46592IQi.LJLJJI;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        Aweme aweme = this.LJLIL;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.LJLILLLLZI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return C16880lQ.LLJIJIL(this.LJLJJI) + JBR.LIZJ(this.LJLJI, (i + i2) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeaturedAnswerAwemeExitDetailEvent(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isPlaying=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", playStartTime=");
        LIZ.append(this.LJLJI);
        LIZ.append(", currentPosition=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public C46592IQi(Aweme aweme, boolean z, long j, long j2) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }
}
