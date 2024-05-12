package X;

import android.content.Context;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend;
import com.ss.android.ugc.aweme.i18n.xbridge.depend.runtime.UpdateGeckoWhiteListSettings;
import com.ss.android.ugc.aweme.i18n.xbridge.depend.runtime.UpdateNonLazyResourceSwitch;
import com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler;
import com.ss.android.ugc.aweme.qrcode.handler.IQRCodePermissionActivityStarter;
import com.ss.android.ugc.aweme.qrcode.view.BridgeScanHandlerImpl;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivityStarter;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nzq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61186Nzq implements IHostOpenDepend {
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe getGeckoInfo(java.lang.String r10, java.lang.String r11, X.InterfaceC61190Nzu r12) {
        /*
            r9 = this;
            java.lang.String r0 = "accessKey"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "channel"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "getGeckoInfoCallback"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            java.util.Map<java.lang.String, com.bytedance.geckox.model.UpdatePackage> r1 = X.C61466OAk.LIZIZ
            r7 = 0
            r5 = 0
            if (r1 == 0) goto Lba
            java.lang.String r2 = "-"
            java.lang.String r0 = defpackage.a1.LJ(r10, r2, r11)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto Lba
            java.lang.Long r0 = X.C70657RoD.LJIILLIIL(r10, r11)
            if (r0 != 0) goto Lb4
            r3 = 0
        L2c:
            java.util.Map<java.lang.String, com.bytedance.geckox.model.UpdatePackage> r1 = X.C61466OAk.LIZIZ
            java.lang.String r0 = defpackage.a1.LJ(r10, r2, r11)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r6 = r1.get(r0)
            com.bytedance.geckox.model.UpdatePackage r6 = (com.bytedance.geckox.model.UpdatePackage) r6
            if (r6 == 0) goto Lac
            long r1 = r6.getVersion()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto Lac
            X.OSJ r1 = new X.OSJ
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            com.bytedance.geckox.model.UpdatePackage$Package r0 = r6.getFullPackage()
            long r2 = r0.getLength()
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            long r2 = r6.getVersion()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.<init>(r5, r4, r0)
        L5f:
            java.lang.Object r2 = r1.getFirst()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            X.Nzr r5 = new X.Nzr
            java.lang.String r0 = "needUpdate"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            boolean r0 = r2.booleanValue()
            r5.<init>(r0)
            java.lang.Long r4 = X.C70657RoD.LJIIL(r10, r11)
            if (r4 == 0) goto L8c
            long r2 = r4.longValue()
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L8c
            X.Nzs r2 = X.EnumC61188Nzs.OFFLINED
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIJ(r2, r0)
            r5.LIZLLL = r2
            r5.LIZJ = r4
        L8c:
            java.lang.Object r0 = r1.getSecond()
            java.lang.Long r0 = (java.lang.Long) r0
            r5.LIZ = r0
            java.lang.Object r0 = r1.getThird()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto La6
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.LIZIZ = r0
        La6:
            r12.LIZ(r5)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lac:
            X.OSJ r1 = new X.OSJ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r0, r5, r5)
            goto L5f
        Lb4:
            long r3 = r0.longValue()
            goto L2c
        Lba:
            X.OSJ r1 = new X.OSJ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r0, r5, r5)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61186Nzq.getGeckoInfo(java.lang.String, java.lang.String, X.Nzu):X.UCe");
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
    public final void scanCode(C31926Cfy c31926Cfy, boolean z, InterfaceC58736N3k scanResultCallback) {
        IQRCodePermissionActivityStarter iQRCodePermissionActivityStarter;
        o.LJIIIZ(scanResultCallback, "scanResultCallback");
        Context context = (Context) FCS.LIZIZ(c31926Cfy, Context.class);
        if (context == null) {
            scanResultCallback.onFailure();
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "h5");
        FMX.LJIIL("qr_code_scan_enter", c188727au.LIZ);
        C58735N3j c58735N3j = new C58735N3j(scanResultCallback);
        IBridgeScanHandler LIZJ = BridgeScanHandlerImpl.LIZJ();
        if (LIZJ != null) {
            LIZJ.LIZIZ(c58735N3j);
        }
        Object LIZ = C58096Mr6.LIZ(IQRCodePermissionActivityStarter.class, false);
        if (LIZ != null) {
            iQRCodePermissionActivityStarter = (IQRCodePermissionActivityStarter) LIZ;
        } else {
            if (C58096Mr6.n4 == null) {
                synchronized (IQRCodePermissionActivityStarter.class) {
                    if (C58096Mr6.n4 == null) {
                        C58096Mr6.n4 = new QRCodePermissionActivityStarter();
                    }
                }
            }
            iQRCodePermissionActivityStarter = C58096Mr6.n4;
        }
        if (iQRCodePermissionActivityStarter != null) {
            iQRCodePermissionActivityStarter.LIZ(HT4.LIZ(context), z);
        }
    }

    public static void LIZ(String str, String str2, boolean z, InterfaceC61189Nzt interfaceC61189Nzt, boolean z2) {
        C61520OCm LJII = O3U.LJII(str2);
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setLazyUpdate(z2);
        optionCheckUpdateParams.setListener(new C61191Nzv(interfaceC61189Nzt, str, z2, str2));
        optionCheckUpdateParams.setEnableDownloadAutoRetry(z);
        optionCheckUpdateParams.setChannelUpdatePriority(3);
        LJII.LIZ(null, C51029K0z.LJJIIZI(new OSZ(str2, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel(str)))), optionCheckUpdateParams);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend
    public final C76800UCe updateGecko(String accessKey, String channel, boolean z, InterfaceC61189Nzt updateGeckoCallback, boolean z2) {
        List<String> list;
        o.LJIIIZ(accessKey, "accessKey");
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(updateGeckoCallback, "updateGeckoCallback");
        try {
            if (z) {
                LIZ(channel, accessKey, z2, updateGeckoCallback, true);
            } else {
                new File(C16880lQ.LLIIJLIL(EF7.LIZIZ()), "offlineX");
                if (C70657RoD.LJ(accessKey, channel)) {
                    SettingsManager LIZLLL = SettingsManager.LIZLLL();
                    UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel updateNonLazyResourceModel = UpdateNonLazyResourceSwitch.LIZ;
                    UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel updateNonLazyResourceModel2 = (UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel) LIZLLL.LJIIIIZZ("update_non_lazy_resource_switch", UpdateNonLazyResourceSwitch.UpdateNonLazyResourceModel.class, updateNonLazyResourceModel);
                    if (updateNonLazyResourceModel2 != null) {
                        updateNonLazyResourceModel = updateNonLazyResourceModel2;
                    }
                    if (!updateNonLazyResourceModel.f29switch || ((list = updateNonLazyResourceModel.denyList) != null && list.contains(channel))) {
                        updateGeckoCallback.LJFF();
                        return C76800UCe.LIZ;
                    }
                }
                if (C61511OCd.LJIIIZ(accessKey, channel)) {
                    SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
                    UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel updateGeckoWhiteListModel = UpdateGeckoWhiteListSettings.LIZ;
                    UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel updateGeckoWhiteListModel2 = (UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel) LIZLLL2.LJIIIIZZ("update_gecko_white_list", UpdateGeckoWhiteListSettings.UpdateGeckoWhiteListModel.class, updateGeckoWhiteListModel);
                    if (updateGeckoWhiteListModel2 != null) {
                        updateGeckoWhiteListModel = updateGeckoWhiteListModel2;
                    }
                    if (updateGeckoWhiteListModel.whiteList.contains(channel)) {
                        C70657RoD.LJIIIZ(accessKey, channel);
                        updateGeckoCallback.LIZJ();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("access_key", accessKey);
                        jSONObject.put("channel", channel);
                        jSONObject.put("allow_update", 1);
                        FMX.LJIILJJIL("update_blocked_gecko", jSONObject);
                    } else {
                        updateGeckoCallback.LIZIZ();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("access_key", accessKey);
                        jSONObject2.put("channel", channel);
                        jSONObject2.put("allow_update", 0);
                        FMX.LJIILJJIL("update_blocked_gecko", jSONObject2);
                    }
                } else {
                    LIZ(channel, accessKey, z2, updateGeckoCallback, false);
                }
            }
        } catch (Exception e) {
            updateGeckoCallback.LIZ(e);
        }
        return C76800UCe.LIZ;
    }
}
