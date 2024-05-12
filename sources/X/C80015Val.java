package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Val, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80015Val extends AbstractC80014Vak implements InterfaceC80059VbT {
    public static final String LJLJL = C16880lQ.LJLLJ(C80015Val.class);
    public final Context LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public C80016Vam LJLJJL;
    public long LJLJJLL;

    @Override // X.InterfaceC80059VbT
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.InterfaceC80059VbT
    public final C73363Sql LJIJI(C73363Sql c73363Sql) {
        return c73363Sql;
    }

    public final void LJIJJ() {
        try {
            C80016Vam c80016Vam = this.LJLJJL;
            if (c80016Vam != null) {
                ((AudioManager) this.LJLJJI.getValue()).abandonAudioFocus(c80016Vam);
            }
        } catch (Throwable th) {
            J7Z.LIZ(LJLJL, th.getMessage());
        }
    }

    public final boolean LJIJJLI() {
        C80016Vam c80016Vam = this.LJLJJL;
        if (c80016Vam != null && C16880lQ.LLJJJJLIIL((AudioManager) this.LJLJJI.getValue(), c80016Vam, 3, 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC80013Vaj
    public final void onDetach() {
        InterfaceC80017Van interfaceC80017Van;
        LJIJJ();
        C80024Vau c80024Vau = this.LJLIL;
        if (c80024Vau != null && (interfaceC80017Van = c80024Vau.LJLJJI) != null) {
            interfaceC80017Van.LJIILL(this);
        }
        this.LJLJJL = null;
    }

    public C80015Val(Context context) {
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJFF(LLLLL, "context.applicationContext");
        this.LJLILLLLZI = LLLLL;
        this.LJLJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 441));
        this.LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 440));
        this.LJLJJL = new C80016Vam(new WeakReference(this));
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80047VbH
    public final void LIZ(EnumC48648J7k errorCode) {
        o.LJIIJ(errorCode, "errorCode");
        LJIJJ();
        String str = LJLJL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("abandon focus because of onError: ");
        LIZ.append(errorCode);
        J7Z.LIZ(str, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LIZIZ(C48651J7n c48651J7n) {
        String str;
        if (c48651J7n != null) {
            str = c48651J7n.LIZ;
        } else {
            str = null;
        }
        if (o.LJ(str, "PAUSE_FROM_LOSS_FOCUS")) {
            J7Z.LIZIZ(LJLJL, "Pause reason is loss focus, we needn't release audio focus for help us can retrieve focus again.");
            return false;
        }
        LJIJJ();
        return false;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJI(C48651J7n c48651J7n) {
        if (LJIJJLI()) {
            return false;
        }
        J7Z.LIZIZ(LJLJL, "Request audio focus failed, we intercept this resume operation.");
        return true;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJII(C48651J7n c48651J7n) {
        if (((Handler) this.LJLJI.getValue()).hasMessages(1)) {
            ((Handler) this.LJLJI.getValue()).removeMessages(1);
            J7Z.LIZIZ(LJLJL, "Found pending execute pause task when stop invoked, remove this task immediate.");
        }
        this.LJLJJLL = System.currentTimeMillis() + 1000;
        LJIJJ();
        return false;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJIIIZ(C48651J7n c48651J7n) {
        if (LJIJJLI()) {
            return false;
        }
        J7Z.LIZJ(LJLJL, "Request audio focus failed, we intercept this play operation.");
        return true;
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80013Vaj
    public final void LJIILL(C80024Vau c80024Vau) {
        this.LJLIL = c80024Vau;
        InterfaceC80017Van interfaceC80017Van = c80024Vau.LJLJJI;
        if (interfaceC80017Van != null) {
            interfaceC80017Van.LJIIJJI(this);
        }
    }

    @Override // X.AbstractC80014Vak, X.InterfaceC80047VbH
    public final void LJIILLIIL(EnumC79954VZm currentState) {
        o.LJIIJ(currentState, "currentState");
        if (currentState == EnumC79954VZm.PLAYBACK_STATE_ERROR || currentState == EnumC79954VZm.PLAYBACK_STATE_STOPPED) {
            LJIJJ();
            String str = LJLJL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("abandon focus because of: ");
            LIZ.append(currentState);
            J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        }
    }
}
