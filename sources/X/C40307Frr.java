package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Frr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40307Frr implements IEvent {
    public final int LJLIL;
    public final InterfaceC37146Ehy LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40307Frr)) {
            return false;
        }
        C40307Frr c40307Frr = (C40307Frr) obj;
        return this.LJLIL == c40307Frr.LJLIL && o.LJ(this.LJLILLLLZI, c40307Frr.LJLILLLLZI);
    }

    public final int hashCode() {
        int i = this.LJLIL * 31;
        InterfaceC37146Ehy interfaceC37146Ehy = this.LJLILLLLZI;
        return i + (interfaceC37146Ehy == null ? 0 : interfaceC37146Ehy.hashCode());
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

    public C40307Frr(int i, InterfaceC37146Ehy interfaceC37146Ehy) {
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC37146Ehy;
    }
}
