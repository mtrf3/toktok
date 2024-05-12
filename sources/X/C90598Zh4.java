package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: X.Zh4, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90598Zh4 extends AbstractC90104ZXw {
    public final /* synthetic */ Messenger LIZ;
    public final /* synthetic */ int LIZIZ;

    @Override // X.AbstractC90104ZXw
    public final void LIZIZ(Bundle bundle) {
        LIZJ(this.LIZ, 3, this.LIZIZ, bundle, null);
    }

    public C90598Zh4(Messenger messenger, int i) {
        this.LIZ = messenger;
        this.LIZIZ = i;
    }

    @Override // X.AbstractC90104ZXw
    public final void LIZ(Bundle bundle, String str) {
        if (str != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("error", str);
            LIZJ(this.LIZ, 4, this.LIZIZ, bundle, bundle2);
            return;
        }
        LIZJ(this.LIZ, 4, this.LIZIZ, bundle, null);
    }

    public static void LIZJ(Messenger messenger, int i, int i2, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = 0;
        obtain.obj = obj;
        obtain.setData(bundle);
        try {
            messenger.send(obtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }
}
