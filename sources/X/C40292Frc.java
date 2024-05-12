package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Frc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40292Frc implements IEvent {
    public final int LJLIL;
    public final InterfaceC36488ETs LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40292Frc)) {
            return false;
        }
        C40292Frc c40292Frc = (C40292Frc) obj;
        return this.LJLIL == c40292Frc.LJLIL && o.LJ(this.LJLILLLLZI, c40292Frc.LJLILLLLZI);
    }

    public final int hashCode() {
        int i = this.LJLIL * 31;
        InterfaceC36488ETs interfaceC36488ETs = this.LJLILLLLZI;
        return i + (interfaceC36488ETs == null ? 0 : interfaceC36488ETs.hashCode());
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
        LIZ.append("GetStatusEvent(webViewHash=");
        LIZ.append(this.LJLIL);
        LIZ.append(", iReturn=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C40292Frc(int i, InterfaceC36488ETs interfaceC36488ETs) {
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC36488ETs;
    }
}
