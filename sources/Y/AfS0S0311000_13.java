package Y;

import X.BPP;
import X.C29401Dk;
import X.C74764TVw;
import X.C74765TVx;
import X.C74766TVy;
import X.C74768TWa;
import X.C74769TWb;
import X.C74770TWc;
import X.C75516TkO;
import X.C76800UCe;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC74596TPk;
import X.InterfaceC74617TQf;
import X.TSX;
import X.TYP;
import X.TYQ;
import X.X1D;
import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.EditBirthFailedWithoutConfirm;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS0S0311000_13 implements InterfaceC64592gB {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0311000_13 afS0S0311000_13, Object obj) {
        Context context;
        DataChannel dataChannel;
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkIn_Guest_Permission_Failed, throwable:");
        LIZ.append(throwable);
        TYP.LIZIZ("GameLinkPermissionManager", X1D.LIZIZ(LIZ));
        C74768TWa.LIZ = false;
        if (afS0S0311000_13.z3 && (dataChannel = (DataChannel) afS0S0311000_13.l0) != null) {
            dataChannel.pv0(EditBirthFailedWithoutConfirm.class);
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS0S0311000_13.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        if (throwable instanceof C29401Dk) {
            TSX tsx = (TSX) afS0S0311000_13.l2;
            if (tsx != null) {
                tsx.onCheckPermissionFailedV3(new C74764TVw(afS0S0311000_13.i4, ((C29401Dk) throwable).getPrompt(), Long.valueOf(r3.getErrorCode())));
            }
        } else {
            TSX tsx2 = (TSX) afS0S0311000_13.l2;
            if (tsx2 != null && (context = tsx2.getContext()) != null) {
                BPP.LIZJ(context, throwable);
            }
        }
        C75516TkO.LIZ.LIZIZ(600, "multi-guest guest check permission error.", throwable, null);
    }

    public static final void accept$1(AfS0S0311000_13 afS0S0311000_13, Object obj) {
        Context context;
        DataChannel dataChannel;
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("throwable:");
        LIZ.append(throwable);
        TYQ.LIZLLL("LinkIn_Guest_Permission_Failed", X1D.LIZIZ(LIZ));
        C74770TWc.LIZ = false;
        if (afS0S0311000_13.z3 && (dataChannel = (DataChannel) afS0S0311000_13.l0) != null) {
            dataChannel.pv0(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthFailedWithoutConfirm.class);
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS0S0311000_13.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        if (throwable instanceof C29401Dk) {
            InterfaceC74617TQf interfaceC74617TQf = (InterfaceC74617TQf) afS0S0311000_13.l2;
            if (interfaceC74617TQf != null) {
                interfaceC74617TQf.Tp(new C74765TVx(afS0S0311000_13.i4, ((C29401Dk) throwable).getPrompt(), Long.valueOf(r3.getErrorCode())));
            }
        } else {
            InterfaceC74617TQf interfaceC74617TQf2 = (InterfaceC74617TQf) afS0S0311000_13.l2;
            if (interfaceC74617TQf2 != null && (context = interfaceC74617TQf2.getContext()) != null) {
                BPP.LIZJ(context, throwable);
            }
        }
        C75516TkO.LIZ.LIZIZ(600, "multi-guest guest check permission error.", throwable, null);
    }

    public static final void accept$2(AfS0S0311000_13 afS0S0311000_13, Object obj) {
        Context context;
        DataChannel dataChannel;
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("throwable:");
        LIZ.append(throwable);
        TYQ.LIZLLL("LinkIn_Guest_Permission_Failed", X1D.LIZIZ(LIZ));
        C74769TWb.LIZ = false;
        if (afS0S0311000_13.z3 && (dataChannel = (DataChannel) afS0S0311000_13.l0) != null) {
            dataChannel.pv0(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthFailedWithoutConfirm.class);
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS0S0311000_13.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        if (throwable instanceof C29401Dk) {
            InterfaceC74596TPk interfaceC74596TPk = (InterfaceC74596TPk) afS0S0311000_13.l2;
            if (interfaceC74596TPk != null) {
                interfaceC74596TPk.onCheckPermissionFailedV3(new C74766TVy(afS0S0311000_13.i4, ((C29401Dk) throwable).getPrompt(), Long.valueOf(r3.getErrorCode())));
            }
        } else {
            InterfaceC74596TPk interfaceC74596TPk2 = (InterfaceC74596TPk) afS0S0311000_13.l2;
            if (interfaceC74596TPk2 != null && (context = interfaceC74596TPk2.getContext()) != null) {
                BPP.LIZJ(context, throwable);
            }
        }
        C75516TkO.LIZ.LIZIZ(600, "multi-guest guest check permission error.", throwable, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS0S0311000_13(boolean z, boolean z2, DataChannel dataChannel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC74596TPk interfaceC74596TPk, int i) {
        this.$t = i;
        this.z3 = z;
        this.l0 = z2;
        this.l1 = dataChannel;
        this.l2 = interfaceC65784Pro;
        this.i4 = interfaceC74596TPk;
    }
}
