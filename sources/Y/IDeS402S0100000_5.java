package Y;

import X.BZI;
import X.C0NB;
import X.C10760bY;
import X.C164906da;
import X.C28787BRn;
import X.C29134Bc2;
import X.EnumC30836C8i;
import X.EnumC61598OFm;
import X.HandlerC29100BbU;
import X.InterfaceC61107NyZ;
import X.ORY;
import X.UFE;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.util.GlobalContext;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDeS402S0100000_5 implements InterfaceC61107NyZ {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                C0NB.LIZ("notification permissions apply onCanceled on start state");
                return;
            case 1:
                LIZ$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c164906daArr);
                return;
            case 1:
                LIZIZ$1(this, c164906daArr);
                return;
            default:
                return;
        }
    }

    public static final void LIZ$1(IDeS402S0100000_5 iDeS402S0100000_5) {
        ((HandlerC29100BbU) iDeS402S0100000_5.l0).LJII();
    }

    public IDeS402S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDeS402S0100000_5 iDeS402S0100000_5, C164906da... results) {
        o.LJIIIZ(results, "results");
        C10760bY.LIZ(GlobalContext.getApplicationContext()).LIZJ(new Intent("bytedance.android.livesdk.chatroom.ui.intent.filter.SERVICE_REQUEST_POST_NOTIFICATION_END"));
        int i = 0;
        if (results.length == 0) {
            C0NB.LIZ("notification permissions apply results isEmpty on start state");
            return;
        }
        EnumC61598OFm enumC61598OFm = ((C164906da) ORY.LJJIL(results)).LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notification permissions apply resultType(");
        LIZ.append(enumC61598OFm);
        LIZ.append(") on start state");
        C0NB.LIZ(X1D.LIZIZ(LIZ));
        if (enumC61598OFm == EnumC61598OFm.GRANTED) {
            i = 1;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_mobile_gaming_notification_allow");
        LIZ2.LJIJJ(Long.valueOf(((GameBroadcastFragment) iDeS402S0100000_5.l0).getRoomId()), "room_id");
        LIZ2.LJIJJ("after_living", "pop_up_scene");
        UFE.LIZIZ(i, LIZ2, "is_notification_authorized");
    }

    public static final void LIZIZ$1(IDeS402S0100000_5 iDeS402S0100000_5, C164906da... results) {
        o.LJIIIZ(results, "results");
        int i = 0;
        for (C164906da c164906da : results) {
            if (!c164906da.LIZ()) {
                ((HandlerC29100BbU) iDeS402S0100000_5.l0).LJII();
                return;
            }
        }
        try {
            i = Camera.getNumberOfCameras();
        } catch (Throwable unused) {
        }
        if (i <= 0) {
            ((HandlerC29100BbU) iDeS402S0100000_5.l0).LJII();
            return;
        }
        HandlerC29100BbU handlerC29100BbU = (HandlerC29100BbU) iDeS402S0100000_5.l0;
        Context context = handlerC29100BbU.LIZ;
        try {
            EnumC30836C8i enumC30836C8i = EnumC30836C8i.LiveResource;
            if (enumC30836C8i.isInstalled()) {
                handlerC29100BbU.LIZIZ();
            } else {
                enumC30836C8i.checkInstall(context, "broadcast", new C29134Bc2(context, handlerC29100BbU));
            }
        } catch (Throwable unused2) {
            handlerC29100BbU.LJII();
        }
    }
}
