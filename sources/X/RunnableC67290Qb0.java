package X;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.CallbackOutput;
import com.google.android.gms.wallet.callback.zzd;

/* renamed from: X.Qb0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67290Qb0 implements Runnable {
    public final CallbackInput LJLIL;
    public final C67291Qb1 LJLILLLLZI;
    public final /* synthetic */ zzd LJLJI;

    public RunnableC67290Qb0(zzd zzdVar, CallbackInput callbackInput, Messenger messenger, String str, int i) {
        this.LJLJI = zzdVar;
        this.LJLIL = callbackInput;
        this.LJLILLLLZI = new C67291Qb1(messenger, i);
    }

    public final void LIZ() {
        boolean z;
        android.util.Log.isLoggable("BaseCallbackTaskService", 4);
        try {
            this.LJLJI.LIZ(this.LJLIL);
        } catch (Throwable th) {
            C67291Qb1 c67291Qb1 = this.LJLILLLLZI;
            C47523Ikx LJJJJL = CallbackOutput.LJJJJL();
            int i = this.LJLIL.zza;
            CallbackOutput callbackOutput = (CallbackOutput) LJJJJL.LIZ;
            callbackOutput.LJLIL = i;
            callbackOutput.LJLILLLLZI = 5;
            String message = th.getMessage();
            CallbackOutput callbackOutput2 = (CallbackOutput) LJJJJL.LIZ;
            callbackOutput2.LJLJJI = message;
            synchronized (c67291Qb1) {
                if (c67291Qb1.LIZ != null) {
                    try {
                        if (callbackOutput2.LJLILLLLZI != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        QH7.LIZ("Callback Response Status must be set - status value must be non-zero.", z);
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.arg1 = c67291Qb1.LIZIZ;
                        Bundle bundle = new Bundle();
                        Parcel obtain2 = Parcel.obtain();
                        callbackOutput2.writeToParcel(obtain2, 0);
                        byte[] marshall = obtain2.marshall();
                        obtain2.recycle();
                        bundle.putByteArray("extra_callback_output", marshall);
                        obtain.setData(bundle);
                        Messenger messenger = c67291Qb1.LIZ;
                        if (messenger != null) {
                            messenger.send(obtain);
                        }
                        c67291Qb1.LIZ = null;
                    } catch (RemoteException unused) {
                    }
                }
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
