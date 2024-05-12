package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.JIi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48932JIi implements IEvent {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48932JIi)) {
            return false;
        }
        C48932JIi c48932JIi = (C48932JIi) obj;
        return o.LJ(this.LJLIL, c48932JIi.LJLIL) && this.LJLILLLLZI == c48932JIi.LJLILLLLZI && this.LJLJI == c48932JIi.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LJLILLLLZI) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
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
        LIZ.append("SearchLiveForLynxWindowVisibilityChangeEvent(roomId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", visibility=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isPlayingWhenLeave=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C48932JIi(String str, int i, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
    }
}
