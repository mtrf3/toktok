package X;

import com.google.android.gms.measurement.internal.zzaw;
import java.util.concurrent.Callable;

/* renamed from: X.QqH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC68237QqH implements Callable {
    public final /* synthetic */ BinderC68232QqC LJLIL;

    public CallableC68237QqH(BinderC68232QqC binderC68232QqC, zzaw zzawVar, String str) {
        this.LJLIL = binderC68232QqC;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLIL.LJLIL.LJFF();
        C68317QrZ c68317QrZ = this.LJLIL.LJLIL.LJII;
        C68241QqL.LJJIJIIJI(c68317QrZ);
        c68317QrZ.LJFF();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
