package Y;

import X.C03880Dg;
import X.C164906da;
import X.C61115Nyh;
import X.C62151OaJ;
import X.C62905OmT;
import X.C62906OmU;
import X.C65300Pk0;
import X.EnumC61598OFm;
import X.InterfaceC61107NyZ;
import X.InterfaceC61118Nyk;
import X.InterfaceC65784Pro;
import android.webkit.PermissionRequest;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDeS404S0100000_10 implements InterfaceC61107NyZ {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(IDeS404S0100000_10 iDeS404S0100000_10) {
    }

    public static final void LIZ$1(IDeS404S0100000_10 iDeS404S0100000_10) {
    }

    public static final void LIZ$2(IDeS404S0100000_10 iDeS404S0100000_10) {
    }

    public static final void LIZ$3(IDeS404S0100000_10 iDeS404S0100000_10) {
    }

    public static final void LIZ$4(IDeS404S0100000_10 iDeS404S0100000_10) {
    }

    public static final void LIZ$5(IDeS404S0100000_10 iDeS404S0100000_10) {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            case 2:
                LIZ$2(this);
                return;
            case 3:
                LIZ$3(this);
                return;
            case 4:
                LIZ$4(this);
                return;
            case 5:
                LIZ$5(this);
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
            case 2:
                LIZIZ$2(this, c164906daArr);
                return;
            case 3:
                LIZIZ$3(this, c164906daArr);
                return;
            case 4:
                LIZIZ$4(this, c164906daArr);
                return;
            case 5:
                LIZIZ$5(this, c164906daArr);
                return;
            default:
                return;
        }
    }

    public IDeS404S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDeS404S0100000_10 iDeS404S0100000_10, C164906da... c164906daArr) {
        if (c164906daArr.length > 0 && c164906daArr[0].LIZIZ == EnumC61598OFm.DENIED_PERMANENT) {
            C62905OmT c62905OmT = new C62905OmT(((C62151OaJ) iDeS404S0100000_10.l0).LIZIZ);
            c62905OmT.LIZ(R.string.bse);
            c62905OmT.LJII(R.string.cg_, new IDCListenerS162S0100000_10(iDeS404S0100000_10, 0));
            c62905OmT.LJIIJ(R.string.dsi, new IDCListenerS162S0100000_10(iDeS404S0100000_10, 1));
            new C62906OmU(c62905OmT).LIZLLL();
        }
    }

    public static final void LIZIZ$1(IDeS404S0100000_10 iDeS404S0100000_10, C164906da... c164906daArr) {
        for (C164906da c164906da : c164906daArr) {
            if (c164906da.LIZIZ != EnumC61598OFm.GRANTED) {
                ((QRCodePermissionActivity) iDeS404S0100000_10.l0).LLFII();
                return;
            }
            ((QRCodePermissionActivity) iDeS404S0100000_10.l0).LLII();
        }
    }

    public static final void LIZIZ$2(IDeS404S0100000_10 iDeS404S0100000_10, C164906da... c164906daArr) {
        C61115Nyh.LIZ(c164906daArr, (InterfaceC61118Nyk) iDeS404S0100000_10.l0);
    }

    public static final void LIZIZ$3(IDeS404S0100000_10 iDeS404S0100000_10, C164906da... c164906daArr) {
        C61115Nyh.LIZ(c164906daArr, (InterfaceC61118Nyk) iDeS404S0100000_10.l0);
    }

    public static final void LIZIZ$4(IDeS404S0100000_10 iDeS404S0100000_10, C164906da... results) {
        InterfaceC65784Pro interfaceC65784Pro;
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            if (o.LJ(c164906da.LIZ, "android.permission.SYSTEM_ALERT_WINDOW")) {
                if (c164906da.LIZ() && (interfaceC65784Pro = (InterfaceC65784Pro) iDeS404S0100000_10.l0) != null) {
                    interfaceC65784Pro.invoke();
                    return;
                }
                return;
            }
        }
    }

    public static final void LIZIZ$5(IDeS404S0100000_10 iDeS404S0100000_10, C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            if (!c164906da.LIZ()) {
                return;
            }
        }
        PermissionRequest permissionRequest = (PermissionRequest) iDeS404S0100000_10.l0;
        String[] resources = permissionRequest.getResources();
        if (new C03880Dg(2).LIZJ(102605, "android/webkit/PermissionRequest", "grant", permissionRequest, new Object[]{resources}, "void", new C65300Pk0(false, "([Ljava/lang/String;)V", "874949285799451785")).LIZ) {
            return;
        }
        permissionRequest.grant(resources);
    }
}
