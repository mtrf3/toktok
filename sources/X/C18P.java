package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* renamed from: X.18P, reason: invalid class name */
/* loaded from: classes.dex */
public class C18P extends AbstractC009301x {
    public final PowerManager LIZJ;
    public final /* synthetic */ AppCompatDelegateImpl LIZLLL;

    @Override // X.AbstractC009301x
    public final IntentFilter LIZIZ() {
        return AnonymousClass028.LIZ("android.os.action.POWER_SAVE_MODE_CHANGED");
    }

    @Override // X.AbstractC009301x
    public final int LIZJ() {
        if (this.LIZJ.isPowerSaveMode()) {
            return 2;
        }
        return 1;
    }

    @Override // X.AbstractC009301x
    public final void LIZLLL() {
        this.LIZLLL.LJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18P(AppCompatDelegateImpl appCompatDelegateImpl, Context context) {
        super(appCompatDelegateImpl);
        this.LIZLLL = appCompatDelegateImpl;
        this.LIZJ = (PowerManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "power");
    }
}
