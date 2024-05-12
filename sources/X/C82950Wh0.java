package X;

import aj2.b;
import aj2.d;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.pitaya.api.PTYDIDCallback;
import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.api.PTYUIDCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.services.apm.api.IEnsure;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BankCardRule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import ij2.a;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import rj2.a$a;

/* renamed from: X.Wh0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82950Wh0 {
    public static JSONObject LIZ;

    public static C276116n LIZ() {
        C276116n c276116n = C22780uw.LIZ;
        c276116n.getClass();
        if (!C276216o.LJIIL.LJIIJJI) {
            C78983UzD.LJIILL("EcommerceService hasn't init");
        }
        o.LJIIIIZZ(c276116n, "getECommerceService()");
        return c276116n;
    }

    public static void LIZIZ(PaymentMethodsData paymentMethodsData) {
        String str;
        String str2;
        BankCardRule bankCardRule;
        int[] iArr;
        try {
            SEY.LIZ(paymentMethodsData);
            SAN.LIZ.getClass();
            SAN.LIZLLL(paymentMethodsData);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        String str3 = paymentMethodsData.pipoHost;
        List<BankCardRule> LIZJ = paymentMethodsData.LIZJ();
        if (LIZJ != null && (bankCardRule = (BankCardRule) ORZ.LJLLLL(LIZJ)) != null && (iArr = bankCardRule.cardBrandLength) != null) {
            str = ORY.LJJJJL(iArr, ",", SAS.LJLIL, 30);
        } else {
            str = null;
        }
        IEnsure iEnsure = C78983UzD.LJLLLL;
        if (iEnsure != null) {
            iEnsure.ensureNotNull(str);
        }
        if (str3 == null || str3.length() == 0) {
            C78983UzD.LJIILL("pipo host is null");
        }
        C275916l c275916l = new C275916l(FKM.LIZ());
        c275916l.LIZIZ = str3;
        c275916l.LIZJ = new JSONObject(C27739Aud.LJI(paymentMethodsData));
        List<PaymentMethod> list = paymentMethodsData.paymentMethods;
        if (list != null) {
            str2 = C27739Aud.LJI(list);
        } else {
            str2 = "[]";
        }
        c275916l.LJ = new JSONArray(str2);
        c275916l.LJIIIZ = paymentMethodsData.encodeKey;
        if (LIZJ != null && !LIZJ.isEmpty()) {
            c275916l.LIZLLL = new JSONArray(C27739Aud.LJI(LIZJ));
        }
        LIZJ(c275916l);
    }

    public static void LIZJ(C275916l c275916l) {
        c275916l.LJIJJLI = new a$a(String.valueOf(EF7.LJI()), String.valueOf(EF7.LJFF()));
        c275916l.LJIIL = new EYU();
        c275916l.LJIIJ = C79003UzX.LJLIL;
        c275916l.LJIIJJI = SettingServiceImpl.LIZ().getAppLanguage();
        c275916l.LJIIIIZZ = UUID.randomUUID().toString();
        c275916l.LJIJJ = V1W.LIZ;
        c275916l.LJIILL = C78857UxB.LJJIIJ(1476788227, "bpea-pipo_sdk_open_camera");
        c275916l.LJIIZILJ = TokenCert.Companion.with("bpea-pipo_ocr_local");
        c275916l.LJIILLIIL = C78857UxB.LJJIIJ(1476788484, "bpea-ecom_ocr_close_camera");
        C22780uw.LIZ.LIZJ(c275916l.LIZ());
        LIZ = C276116n.LIZ();
        VF7 vf7 = new VF7();
        String aid = String.valueOf(EF7.LJIIIZ);
        o.LJIIJ(aid, "aid");
        vf7.LIZ = aid;
        String appVersion = String.valueOf(EF7.LJI());
        o.LJIIJ(appVersion, "appVersion");
        vf7.LIZIZ = appVersion;
        String channel = EF7.LJIILIIL;
        o.LJIIJ(channel, "channel");
        vf7.LIZJ = channel;
        vf7.LIZLLL = new PTYDIDCallback() { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentSdkProcess$initPipoPitaya$setupInfo$1
            @Override // com.bytedance.pitaya.api.PTYDIDCallback
            public String getDid() {
                String serverDeviceId = AppLog.getServerDeviceId();
                o.LJIIIIZZ(serverDeviceId, "getServerDeviceId()");
                return serverDeviceId;
            }
        };
        vf7.LJ = new PTYUIDCallback() { // from class: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentSdkProcess$initPipoPitaya$setupInfo$2
            @Override // com.bytedance.pitaya.api.PTYUIDCallback
            public String getUid() {
                return AccountService.LJIJ().LJFF().getCurUserId();
            }
        };
        final PTYSetupCallback pTYSetupCallback = null;
        final PTYSetupInfo pTYSetupInfo = new PTYSetupInfo(vf7);
        C86821Y5p c86821Y5p = C86821Y5p.LIZ;
        final AwemeHostApplication context = FKM.LIZ();
        o.LJIIIZ(context, "context");
        a.LJIJ.getClass();
        d LIZJ = a.LIZJ();
        d.a aVar = new d.a(LIZJ.LIZ);
        String str = LIZJ.LIZLLL;
        if (str != null) {
            aVar.LIZLLL = str;
        }
        aj2.a aVar2 = LIZJ.LIZJ;
        if (aVar2 != null) {
            aVar.LIZJ = aVar2;
        }
        AbstractC66805QJt abstractC66805QJt = LIZJ.LJ;
        if (abstractC66805QJt != null) {
            aVar.LJ = abstractC66805QJt;
        }
        b bVar = LIZJ.LJIIIZ;
        if (bVar != null) {
            aVar.LJIIIZ = bVar;
        }
        aVar.LJIIJ = c86821Y5p;
        LIZJ.LIZ(aVar.LIZ());
        pTYSetupInfo.setAid("411745");
        a.LJFF(LIZJ);
        HostSetupWatcher hostSetupWatcher = HostSetupWatcher.INSTANCE;
        if (hostSetupWatcher.isHostSetup()) {
            PitayaCoreFactory.getCore("411745").setup(context, pTYSetupInfo, null);
        } else {
            hostSetupWatcher.registerHostSetupListener(new HostSetupListener() { // from class: com.bytedance.pipo.pitaya.PipoPitayaService$initPitaya$1
                @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
                public void onHostSetup(boolean z) {
                    if (z) {
                        PitayaCoreFactory.getCore("411745").setup(context, pTYSetupInfo, pTYSetupCallback);
                    }
                }
            });
        }
    }
}
