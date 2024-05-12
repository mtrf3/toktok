package X;

import android.content.Context;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;
import kotlin.jvm.internal.o;

/* renamed from: X.PbD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64755PbD implements InterfaceC64777PbZ {
    @Override // X.InterfaceC64777PbZ
    public final InterfaceC64803Pbz LIZ(Request request) {
        InterfaceC64741Paz tTNetDepend = TTNetInit.getTTNetDepend();
        o.LJFF(tTNetDepend, "TTNetInit.getTTNetDepend()");
        Context context = tTNetDepend.getContext();
        C64667PZn LJII = C64667PZn.LJII(context);
        if (C36841Ed3.LIZIZ(context)) {
            C64728Pam LJFF = C64728Pam.LJFF();
            LJII.getClass();
            C64667PZn.LJIILJJIL = LJFF;
        }
        return LJII.LIZ(request);
    }
}
