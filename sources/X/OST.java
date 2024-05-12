package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LynxUrlStorage;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OST {
    public static OSW LIZ;

    public static Object LIZIZ(String str, InterfaceC67352kd interfaceC67352kd) {
        String str2;
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        IHostResource iHostResource = (IHostResource) CN1.LIZ(IHostResource.class);
        if (iHostResource == null || (str2 = iHostResource.WK()) == null) {
            str2 = "";
        }
        C61520OCm LIZ2 = O3E.LIZ(str2);
        C34K c34k = new C34K();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(" channel is ");
        LIZ3.append(str);
        LIZ3.append(", access key is ");
        LIZ3.append(str2);
        C0NB.LJIIIZ("LynxGiftChannelPreload", X1D.LIZIZ(LIZ3));
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setChannelUpdatePriority(3);
        optionCheckUpdateParams.setEnableThrottle(false);
        optionCheckUpdateParams.setListener(new OSV(c34k, xks, str));
        if (LIZ2 != null) {
            LIZ2.LIZ(null, C113554cx.LJJLIIIIJ(new OSZ(str2, C47261Igj.LJJIJIL(new CheckRequestBodyModel.TargetChannel(str)))), optionCheckUpdateParams);
        }
        return xks.LJIIJJI();
    }

    public static void LIZ(AssetsModel assetsModel, C78072UkW c78072UkW, int i) {
        OSX callback;
        Boolean bool;
        if ((i & 2) != 0) {
            c78072UkW = null;
        }
        if ((i & 4) != 0) {
            callback = OSX.LJLIL;
        } else {
            callback = null;
        }
        o.LJIIIZ(assetsModel, "assetsModel");
        o.LJIIIZ(callback, "callback");
        if (assetsModel.resourceType == AssetsModel.RESOURCE_TYPE_LYNX) {
            String str = assetsModel.lynxUrlSettingsKey;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = LynxUrlStorage.INSTANCE.getValue().get(str);
            if (str3 == null) {
                str3 = "";
            }
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str3), "channel");
            if (queryParameter != null) {
                str2 = queryParameter;
            }
            File LJFF = C15510jD.LJFF(str2, "/");
            StringBuilder LIZLLL = C06540Nm.LIZLLL(" channel is ", str2, ", gift key is ", str, " file is exist ");
            if (LJFF != null) {
                bool = Boolean.valueOf(LJFF.exists());
            } else {
                bool = null;
            }
            LIZLLL.append(bool);
            C0NB.LJIIIZ("LynxGiftChannelPreload", X1D.LIZIZ(LIZLLL));
            if (!ujb.o.LJJJJJL(str2)) {
                if (LJFF == null || !LJFF.exists()) {
                    if (c78072UkW != null) {
                        c78072UkW.LJJL = 1003;
                    }
                    XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new OSU(c78072UkW, str2, null), 3);
                }
            }
        }
    }
}
