package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.4Z9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Z9 implements C4K3, InterfaceC76442zI, C4ZB {
    public static final C4Z9 LJLIL = new C4Z9();
    public static volatile boolean LJLILLLLZI;

    @Override // X.C4ZB
    public final void LIZJ(String str) {
    }

    @Override // X.InterfaceC76442zI
    public final void LIZ(C76512zP c76512zP) {
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNetworkStateChanged: ");
        LIZ.append(c76512zP);
        c114834f1.i("PlatformManager", X1D.LIZIZ(LIZ));
    }

    @Override // X.C4ZB
    public final void LIZIZ(C115104fS c115104fS) {
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStateChanged: ");
        LIZ.append(c115104fS.LIZ);
        c114834f1.i("PlatformManager", X1D.LIZIZ(LIZ));
    }

    @Override // X.C4ZB
    public final void LIZLLL(WsChannelMsg channelMsg) {
        o.LJIIIZ(channelMsg, "channelMsg");
    }

    @Override // X.C4K3
    public final void LJFF(C4ZA type, C4ZM c4zm) {
        String str;
        C4ZA c4za;
        o.LJIIIZ(type, "type");
        String str2 = "";
        String string = Keva.getRepo("ies_im_core").getString("last_login_uid", "");
        o.LJIIIIZZ(string, "repo.getString(KEY_LAST_LOGIN_UID, \"\")");
        if (c4zm != null) {
            str = c4zm.LIZ;
        } else {
            str = null;
        }
        Keva repo = Keva.getRepo("ies_im_core");
        if (str != null) {
            str2 = str;
        }
        repo.storeString("last_login_uid", str2);
        C4ZA c4za2 = C4ZA.UNKNOWN;
        C4ZL.LIZ();
        if (!C80763Ey.LIZLLL() || str == null || str.length() == 0) {
            c4za = C4ZA.LOGOUT;
        } else if (string.length() == 0 && C1GE.LJIIL(str)) {
            c4za = C4ZA.LOGIN;
        } else if (string.length() > 0 && C1GE.LJIIL(str) && !o.LJ(string, str)) {
            c4za = C4ZA.SWITCH;
        } else {
            c4za = c4za2;
        }
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAccountChange: ");
        LIZ.append(type);
        LIZ.append(", ");
        LIZ.append(c4za);
        LIZ.append(", ");
        c114834f1.i("PlatformManager", C025908h.LIZIZ(LIZ, string, ", ", str, LIZ));
        if (c4za != c4za2) {
            C114434eN.LJLIL.LJFF(c4za, c4zm);
            C4ZH.LJLIL.LJFF(c4za, c4zm);
        }
    }
}
