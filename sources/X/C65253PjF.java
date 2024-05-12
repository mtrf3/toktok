package X;

import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.util.concurrent.CountDownLatch;
import okhttp3.Request;

/* renamed from: X.PjF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65253PjF implements InterfaceC48121Iub {
    public final C65254PjG LIZ;

    public C65253PjF(C65254PjG c65254PjG) {
        this.LIZ = c65254PjG;
    }

    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        C65256PjI c65256PjI;
        GuestAuthToken guestAuthToken;
        T t;
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        C65254PjG c65254PjG = this.LIZ;
        synchronized (c65254PjG) {
            c65256PjI = (C65256PjI) ((C65264PjQ) c65254PjG.LIZIZ).LIZIZ();
            if (c65256PjI == null || (t = c65256PjI.authToken) == 0 || ((GuestAuthToken) t).LIZ()) {
                C65265PjR.LIZIZ().getClass();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                c65254PjG.LIZ.LIZ(new C65257PjJ(c65254PjG, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                    ((C65264PjQ) c65254PjG.LIZIZ).LIZ();
                }
                c65256PjI = (C65256PjI) ((C65264PjQ) c65254PjG.LIZIZ).LIZIZ();
            }
        }
        if (c65256PjI == null || (guestAuthToken = (GuestAuthToken) c65256PjI.authToken) == null) {
            return pw8.LIZ(request);
        }
        C64618PXq newBuilder = request.newBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(guestAuthToken.tokenType);
        LIZ.append(" ");
        LIZ.append(guestAuthToken.accessToken);
        newBuilder.LIZLLL("Authorization", X1D.LIZIZ(LIZ));
        newBuilder.LIZLLL("x-guest-token", guestAuthToken.guestToken);
        return pw8.LIZ(newBuilder.LIZIZ());
    }
}
