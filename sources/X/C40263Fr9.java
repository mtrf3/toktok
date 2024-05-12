package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.b0;

/* renamed from: X.Fr9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40263Fr9 implements IEvent {
    public final int LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40263Fr9) && this.LJLIL == ((C40263Fr9) obj).LJLIL;
    }

    public final int hashCode() {
        return this.LJLIL;
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
        LIZ.append("WebViewFragmentBackEvent(webViewHash=");
        return b0.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C40263Fr9(int i) {
        this.LJLIL = i;
    }
}
