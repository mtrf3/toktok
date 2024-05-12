package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.FwM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractBinderC40586FwM extends BinderC40637FxB implements InterfaceC40589FwP {
    public AbstractBinderC40586FwM() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // X.BinderC40637FxB
    public final boolean LJLJI(Parcel parcel, int i) {
        switch (i) {
            case 2:
                LLILLIZIL(parcel.readInt(), (Bundle) C36493ETx.LIZ(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((BinderC40585FwL) this).LJLILLLLZI.LIZIZ.LIZIZ();
                C40571Fw7.LIZJ.LIZJ("onCompleteInstall(%d)", 4, new Object[]{Integer.valueOf(readInt)});
                return true;
            case 4:
                LJLLLL(parcel.readInt(), (Bundle) C36493ETx.LIZ(parcel, Bundle.CREATOR));
                return true;
            case 5:
                int readInt2 = parcel.readInt();
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((BinderC40585FwL) this).LJLILLLLZI.LIZIZ.LIZIZ();
                C40571Fw7.LIZJ.LIZJ("onGetSession(%d)", 4, new Object[]{Integer.valueOf(readInt2)});
                return true;
            case 6:
                BaseBundle baseBundle = (BaseBundle) C36493ETx.LIZ(parcel, Bundle.CREATOR);
                BinderC40585FwL binderC40585FwL = (BinderC40585FwL) this;
                binderC40585FwL.LJLILLLLZI.LIZIZ.LIZIZ();
                int i2 = baseBundle.getInt("error_code");
                C40571Fw7.LIZJ.LIZJ("onError(%d)", 6, new Object[]{Integer.valueOf(i2)});
                binderC40585FwL.LJLIL.LIZIZ(new C35481DwD(i2));
                return true;
            case 7:
                parcel.createTypedArrayList(Bundle.CREATOR);
                ((BinderC40585FwL) this).LJLILLLLZI.LIZIZ.LIZIZ();
                C40571Fw7.LIZJ.LIZJ("onGetSessionStates", 4, new Object[0]);
                return true;
            case 8:
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((BinderC40585FwL) this).LJLILLLLZI.LIZIZ.LIZIZ();
                C40571Fw7.LIZJ.LIZJ("onDeferredUninstall", 4, new Object[0]);
                return true;
            case 9:
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((BinderC40585FwL) this).LJLILLLLZI.LIZIZ.LIZIZ();
                C40571Fw7.LIZJ.LIZJ("onDeferredInstall", 4, new Object[0]);
                return true;
            case 10:
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((BinderC40585FwL) this).LJLILLLLZI.LIZIZ.LIZIZ();
                C40571Fw7.LIZJ.LIZJ("onGetSplitsForAppUpdate", 4, new Object[0]);
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((BinderC40585FwL) this).LJLILLLLZI.LIZIZ.LIZIZ();
                C40571Fw7.LIZJ.LIZJ("onCompleteInstallForAppUpdate", 4, new Object[0]);
                return true;
            case 12:
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((BinderC40585FwL) this).LJLILLLLZI.LIZIZ.LIZIZ();
                C40571Fw7.LIZJ.LIZJ("onDeferredLanguageInstall", 4, new Object[0]);
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                C36493ETx.LIZ(parcel, Bundle.CREATOR);
                ((BinderC40585FwL) this).LJLILLLLZI.LIZIZ.LIZIZ();
                C40571Fw7.LIZJ.LIZJ("onDeferredLanguageUninstall", 4, new Object[0]);
                return true;
            default:
                return false;
        }
    }
}
