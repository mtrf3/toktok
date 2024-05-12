package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.Qb5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67295Qb5 extends AbstractDialogInterfaceOnCancelListenerC67269Qaf {
    public final C0M4<C67719Qhv<?>> LJLJJLL;
    public final C67824Qjc LJLJL;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJII() {
        this.LJLILLLLZI = true;
        if (!this.LJLJJLL.isEmpty()) {
            this.LJLJL.LIZIZ(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJIIIIZZ() {
        this.LJLILLLLZI = false;
        C67824Qjc c67824Qjc = this.LJLJL;
        c67824Qjc.getClass();
        synchronized (C67824Qjc.LJZ) {
            if (c67824Qjc.LJLLI == this) {
                c67824Qjc.LJLLI = null;
                c67824Qjc.LJLLILLLL.clear();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJFF() {
        if (!this.LJLJJLL.isEmpty()) {
            this.LJLJL.LIZIZ(this);
        }
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC67269Qaf
    public final void LJIIJ() {
        HandlerC67272Qai handlerC67272Qai = this.LJLJL.LJLLL;
        handlerC67272Qai.sendMessage(handlerC67272Qai.obtainMessage(3));
    }

    @Override // X.AbstractDialogInterfaceOnCancelListenerC67269Qaf
    public final void LJIIIZ(ConnectionResult connectionResult, int i) {
        this.LJLJL.LJII(connectionResult, i);
    }

    public C67295Qb5(InterfaceC67296Qb6 interfaceC67296Qb6, C67824Qjc c67824Qjc, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC67296Qb6, googleApiAvailability);
        this.LJLJJLL = new C0M4<>();
        this.LJLJL = c67824Qjc;
        interfaceC67296Qb6.lg("ConnectionlessLifecycleHelper", this);
    }
}
