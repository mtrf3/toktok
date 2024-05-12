package X;

import android.content.Context;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;

/* renamed from: X.PbC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64754PbC implements InterfaceC64777PbZ {
    @Override // X.InterfaceC64777PbZ
    public final InterfaceC64803Pbz LIZ(Request request) {
        InterfaceC64777PbZ LJII;
        request.getUrl();
        if (C64752PbA.LIZ()) {
            LJII = C64753PbB.LIZ();
        } else {
            Context context = TTNetInit.getTTNetDepend().getContext();
            LJII = C64667PZn.LJII(context);
            if (C36841Ed3.LIZJ(context)) {
                C64728Pam LJFF = C64728Pam.LJFF();
                LJII.getClass();
                C64667PZn.LJIILJJIL = LJFF;
            }
        }
        if (LJII != null) {
            return LJII.LIZ(request);
        }
        return null;
    }
}
