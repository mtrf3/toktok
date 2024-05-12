package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.RemoteException;

/* renamed from: X.Zh2, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90596Zh2 extends AbstractC90096ZXo {
    public final String LIZ;
    public final C90865ZlN LIZIZ;

    @Override // X.AbstractC90096ZXo
    public final void LJI(int i) {
        C90865ZlN c90865ZlN;
        String str = this.LIZ;
        if (str == null || (c90865ZlN = this.LIZIZ) == null) {
            return;
        }
        int andIncrement = c90865ZlN.LJIIJJI.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 7;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = c90865ZlN.LJIIIIZZ;
        try {
            c90865ZlN.LJII.send(obtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }

    @Override // X.AbstractC90096ZXo
    public final void LJIIIZ(int i) {
        C90865ZlN c90865ZlN;
        String str = this.LIZ;
        if (str == null || (c90865ZlN = this.LIZIZ) == null) {
            return;
        }
        int andIncrement = c90865ZlN.LJIIJJI.getAndIncrement();
        Message obtain = Message.obtain();
        obtain.what = 8;
        obtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        obtain.setData(bundle);
        obtain.replyTo = c90865ZlN.LJIIIIZZ;
        try {
            c90865ZlN.LJII.send(obtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }

    public C90596Zh2(String str, C90865ZlN c90865ZlN) {
        this.LIZ = str;
        this.LIZIZ = c90865ZlN;
    }
}
