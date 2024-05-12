package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.compliance.api.services.consent.consentmanagementframework.IPNSConsentHandlerService;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.PNSConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.network.ConsentApi;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Onm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62986Onm implements InterfaceC82923WgZ {
    public final /* synthetic */ PNSConsentServiceImpl LIZ;

    public C62986Onm(PNSConsentServiceImpl pNSConsentServiceImpl) {
        this.LIZ = pNSConsentServiceImpl;
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZJ(java.util.Map<String, String> extra) {
        IPNSConsentHandlerService LJI;
        o.LJIIIZ(extra, "extra");
        String str = extra.get("consentKey");
        if (str == null || (LJI = this.LIZ.LJI(str)) == null) {
            return;
        }
        LJI.LIZJ();
        HashSet<InterfaceC62996Onw> hashSet = this.LIZ.LIZJ.get(str);
        if (hashSet != null) {
            Iterator<InterfaceC62996Onw> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ();
            }
        }
        this.LIZ.getClass();
        PNSConsentServiceImpl.LJFF("consent_displayed", str);
    }

    @Override // X.InterfaceC82923WgZ
    public final void LJ(java.util.Map<String, String> extra) {
        IPNSConsentHandlerService LJI;
        o.LJIIIZ(extra, "extra");
        PopupManager.LIZJ(G3O.class);
        String str = extra.get("consentKey");
        if (str == null || (LJI = this.LIZ.LJI(str)) == null) {
            return;
        }
        LJI.onDismiss();
        PNSConsentServiceImpl pNSConsentServiceImpl = this.LIZ;
        if (!pNSConsentServiceImpl.LIZJ.isEmpty()) {
            pNSConsentServiceImpl.LIZJ.remove(str);
        }
        this.LIZ.getClass();
        PNSConsentServiceImpl.LJFF("consent_dismissed", str);
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZ(UniversalPopupAction universalPopupAction, java.util.Map<String, String> map) {
        IPNSConsentHandlerService LJI;
        String str = (String) ((LinkedHashMap) map).get("consentKey");
        if (str == null || (LJI = this.LIZ.LJI(str)) == null) {
            return;
        }
        EnumC62988Ono.Companion.getClass();
        int i = 0;
        for (EnumC62988Ono enumC62988Ono : EnumC62988Ono.values()) {
            if (o.LJ(enumC62988Ono.getKey().LIZ, str)) {
                if (!universalPopupAction.getApprove()) {
                    return;
                }
                LJI.LIZLLL();
                HashSet<InterfaceC62996Onw> hashSet = this.LIZ.LIZJ.get(str);
                if (hashSet != null) {
                    Iterator<InterfaceC62996Onw> it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.next().LIZ();
                    }
                }
                PNSConsentServiceImpl pNSConsentServiceImpl = this.LIZ;
                EnumC35445Dvd consentStatusEnum = EnumC35445Dvd.CONSENT_APPROVED;
                EnumC62989Onp consentCollectionFlow = EnumC62989Onp.CONSENT_BOX;
                pNSConsentServiceImpl.getClass();
                o.LJIIIZ(consentStatusEnum, "consentStatusEnum");
                o.LJIIIZ(consentCollectionFlow, "consentCollectionFlow");
                E9H e9h = pNSConsentServiceImpl.LJFF;
                String consentKey = enumC62988Ono.getKey().LIZ;
                String consentCollectionFlow2 = consentCollectionFlow.getS();
                EnumC62992Ons consentBasedOn = enumC62988Ono.getKey().LIZIZ;
                e9h.getClass();
                o.LJIIIZ(consentKey, "consentKey");
                o.LJIIIZ(consentCollectionFlow2, "consentCollectionFlow");
                o.LJIIIZ(consentBasedOn, "consentBasedOn");
                int i2 = C62991Onr.LIZ[consentBasedOn.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        List<C62990Onq> LIZIZ = e9h.LIZIZ();
                        int size = LIZIZ.size();
                        while (true) {
                            if (i < size) {
                                if (o.LJ(((C62990Onq) ListProtector.get(LIZIZ, i)).LJLIL, consentKey)) {
                                    break;
                                } else {
                                    i++;
                                }
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                        o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, "getDeviceId()");
                        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                        o.LJIIIIZZ(curUserId, "userService().curUserId");
                        C62990Onq c62990Onq = new C62990Onq(consentKey, consentStatusEnum, com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, curUserId, System.currentTimeMillis(), consentCollectionFlow2, consentBasedOn);
                        List<C62990Onq> LIZIZ2 = e9h.LIZIZ();
                        if (i < 0) {
                            ((ArrayList) ORZ.LLJILJILJ(LIZIZ2)).add(c62990Onq);
                        } else {
                            ListProtector.set(ORZ.LLJILJILJ(LIZIZ2), i, c62990Onq);
                        }
                        StringBuilder LJFF = C72972SkS.LJFF("CACHED_CONSENT_RECORDS", '_');
                        e9h.LIZJ().storeString(UPJ.LJ((RBX) HG3.LJIILL(), LJFF, LJFF), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), new E9I(LIZIZ2)));
                    }
                } else {
                    List<C62990Onq> LIZ = e9h.LIZ();
                    int size2 = LIZ.size();
                    while (true) {
                        if (i < size2) {
                            if (o.LJ(((C62990Onq) ListProtector.get(LIZ, i)).LJLIL, consentKey)) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2 = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                    o.LJIIIIZZ(com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2, "getDeviceId()");
                    String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
                    o.LJIIIIZZ(curUserId2, "userService().curUserId");
                    C62990Onq c62990Onq2 = new C62990Onq(consentKey, consentStatusEnum, com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId2, curUserId2, System.currentTimeMillis(), consentCollectionFlow2, consentBasedOn);
                    List<C62990Onq> LIZ2 = e9h.LIZ();
                    if (i < 0) {
                        ((ArrayList) ORZ.LLJILJILJ(LIZ2)).add(c62990Onq2);
                    } else {
                        ListProtector.set(ORZ.LLJILJILJ(LIZ2), i, c62990Onq2);
                    }
                    StringBuilder LJFF2 = C72972SkS.LJFF("CACHED_CONSENT_RECORDS", '_');
                    LJFF2.append(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
                    e9h.LIZJ().storeString(X1D.LIZIZ(LJFF2), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), new E9I(LIZ2)));
                }
                String entityKey = enumC62988Ono.getKey().LIZ;
                String businessFlow = consentCollectionFlow.getS();
                E7V e7v = ConsentApi.LIZ;
                int i3 = consentStatusEnum.getI();
                e7v.getClass();
                o.LJIIIZ(entityKey, "entityKey");
                o.LJIIIZ(businessFlow, "businessFlow");
                E7V.LIZIZ.createConsentRecord(entityKey, businessFlow, i3);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "update_consent_status");
                c188727au.LJIIIZ("description", enumC62988Ono.getKey().LIZ);
                c188727au.LIZLLL(consentStatusEnum.getI(), "consent_status");
                c188727au.LJIIIZ("consent_collection_flow", consentCollectionFlow.getS());
                FMX.LJIIL("pns_consent_framework", c188727au.LIZ);
                PNSConsentServiceImpl.LJFF("update_consent_status", enumC62988Ono.getKey().LIZ);
                return;
            }
        }
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZIZ(String customizedAction, java.util.Map<String, String> map) {
        ICompliancePolicyService LJII;
        o.LJIIIZ(customizedAction, "customizedAction");
        if (AGI.LIZ() && (LJII = a.LJII()) != null) {
            LJII.LIZIZ(new O0X(AGJ.CONSENT_BOX_ROW.getValue(), customizedAction, true, true, 4), new C62993Ont());
        }
    }

    @Override // X.InterfaceC82923WgZ
    public final void LIZLLL(Boolean bool, String link) {
        o.LJIIIZ(link, "link");
        SmartRoute buildRoute = SmartRouter.buildRoute(EF7.LIZIZ(), link);
        if (o.LJ(bool, Boolean.TRUE) && !o.LJ(UriProtector.getQueryParameter(UriProtector.parse(link), "use_spark"), "1")) {
            buildRoute.withParam("use_webview_title", true);
        }
        buildRoute.open();
    }
}
