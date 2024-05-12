package X;

import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: X.HqW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45320HqW implements WN2 {
    public final /* synthetic */ C45319HqV LIZ;

    public C45320HqW(C45319HqV c45319HqV) {
        this.LIZ = c45319HqV;
    }

    @Override // X.WN2
    public final void onResult(Object obj) {
        C45321HqX c45321HqX;
        Messenger messenger = (Messenger) this.LIZ.requireActivity().getIntent().getParcelableExtra("SingeProcessMessengerHandler");
        if (messenger != null) {
            c45321HqX = new C45321HqX(messenger);
        } else {
            c45321HqX = null;
        }
        c45321HqX.getClass();
        Message obtain = Message.obtain();
        obtain.obj = obj;
        try {
            c45321HqX.LIZ.send(obtain);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LIZ.requireActivity().finish();
    }
}
