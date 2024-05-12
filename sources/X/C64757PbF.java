package X;

import android.content.Context;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;

/* renamed from: X.PbF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64757PbF implements InterfaceC64777PbZ {
    @Override // X.InterfaceC64777PbZ
    public final InterfaceC64803Pbz LIZ(Request request) {
        Context context = TTNetInit.getTTNetDepend().getContext();
        C64667PZn LJII = C64667PZn.LJII(context);
        if (C36841Ed3.LIZIZ(context)) {
            C64728Pam LJFF = C64728Pam.LJFF();
            LJII.getClass();
            C64667PZn.LJIILJJIL = LJFF;
        }
        return LJII.LIZ(request);
    }
}
