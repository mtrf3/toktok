package X;

import Y.IDRunnableS86S0100000_24;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

/* loaded from: classes29.dex */
public final class ZY7 implements IBinder.DeathRecipient {
    public final Messenger LJLIL;
    public final ZYA LJLILLLLZI;
    public final Messenger LJLJI;
    public int LJLJJLL;
    public int LJLJL;
    public final /* synthetic */ ServiceConnectionC90609ZhF LJLJLLL;
    public int LJLJJI = 1;
    public int LJLJJL = 1;
    public final SparseArray<AbstractC90104ZXw> LJLJLJ = new SparseArray<>();

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.LJLJLLL.LJLL.post(new IDRunnableS86S0100000_24(this, 4));
    }

    public final void LIZ(int i) {
        int i2 = this.LJLJJI;
        this.LJLJJI = i2 + 1;
        LIZJ(5, i2, i, null, null);
    }

    public ZY7(ServiceConnectionC90609ZhF serviceConnectionC90609ZhF, Messenger messenger) {
        this.LJLJLLL = serviceConnectionC90609ZhF;
        this.LJLIL = messenger;
        ZYA zya = new ZYA(this);
        this.LJLILLLLZI = zya;
        this.LJLJI = new Messenger(zya);
    }

    public final void LIZLLL(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.LJLJJI;
        this.LJLJJI = i3 + 1;
        LIZJ(7, i3, i, null, bundle);
    }

    public final void LJ(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.LJLJJI;
        this.LJLJJI = i3 + 1;
        LIZJ(8, i3, i, null, bundle);
    }

    public final boolean LIZIZ(int i, Intent intent, AbstractC90104ZXw abstractC90104ZXw) {
        int i2 = this.LJLJJI;
        this.LJLJJI = i2 + 1;
        if (LIZJ(9, i2, i, intent, null)) {
            if (abstractC90104ZXw != null) {
                this.LJLJLJ.put(i2, abstractC90104ZXw);
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean LIZJ(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        obtain.replyTo = this.LJLJI;
        try {
            this.LJLIL.send(obtain);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }
}
