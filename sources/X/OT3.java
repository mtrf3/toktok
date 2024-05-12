package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OT3 implements IEvent {
    public final String LJLIL;
    public final Integer LJLILLLLZI;
    public final String LJLJI;

    public OT3() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OT3)) {
            return false;
        }
        OT3 ot3 = (OT3) obj;
        return o.LJ(this.LJLIL, ot3.LJLIL) && o.LJ(this.LJLILLLLZI, ot3.LJLILLLLZI) && o.LJ(this.LJLJI, ot3.LJLJI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJLJI;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
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
        LIZ.append("OpenPlatformAuthEvent(authCode=");
        LIZ.append(this.LJLIL);
        LIZ.append(", errorCode=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", errorMessage=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public OT3(String str, Integer num, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = num;
        this.LJLJI = str2;
    }
}
