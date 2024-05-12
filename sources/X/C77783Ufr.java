package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ufr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77783Ufr extends AbstractC77781Ufp {
    public static void LJIIIIZZ(C37356ElM c37356ElM) {
        InterfaceC77788Ufw interfaceC77788Ufw = (InterfaceC77788Ufw) ED5.LIZJ(InterfaceC77788Ufw.class, null);
        InterfaceC77787Ufv interfaceC77787Ufv = (InterfaceC77787Ufv) ED5.LIZJ(InterfaceC77787Ufv.class, null);
        interfaceC77787Ufv.setErrorCode(0);
        interfaceC77788Ufw.setResponse(interfaceC77787Ufv);
        c37356ElM.onSuccess(interfaceC77788Ufw, "");
    }

    public static void LJII(C37356ElM c37356ElM, EnumC77785Uft enumC77785Uft) {
        InterfaceC77788Ufw interfaceC77788Ufw = (InterfaceC77788Ufw) ED5.LIZJ(InterfaceC77788Ufw.class, null);
        InterfaceC77787Ufv interfaceC77787Ufv = (InterfaceC77787Ufv) ED5.LIZJ(InterfaceC77787Ufv.class, null);
        interfaceC77787Ufv.setErrorCode(Integer.valueOf(enumC77785Uft.getErrorCode()));
        interfaceC77787Ufv.setErrorDescription(enumC77785Uft.getErrorMessage());
        interfaceC77788Ufw.setResponse(interfaceC77787Ufv);
        c37356ElM.onFailure(0, enumC77785Uft.getErrorMessage(), interfaceC77788Ufw);
    }

    public static void LJIIIZ(Context context, String str, C37356ElM c37356ElM) {
        if (str == null || str.length() == 0) {
            LJII(c37356ElM, EnumC77785Uft.URL_EMPTY);
            return;
        }
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
        C30882CAc.LJII(context, new C28871BUt(str));
        LJIIIIZZ(c37356ElM);
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        boolean z;
        int i;
        InterfaceC77782Ufq interfaceC77782Ufq = (InterfaceC77782Ufq) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String packageName = interfaceC77782Ufq.getPackageName();
        Number jumpType = interfaceC77782Ufq.getJumpType();
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (context = interfaceC38263Ezz.getContext()) != null) {
            if (o.LJ(jumpType, Integer.valueOf(EnumC77786Ufu.TYPE_WEB_URL.getValue()))) {
                LJIIIZ(context, interfaceC77782Ufq.getUrl(), c37356ElM);
                LJIIIIZZ(c37356ElM);
                return;
            }
            String deeplink = interfaceC77782Ufq.getDeeplink();
            C77784Ufs c77784Ufs = new C77784Ufs(deeplink, interfaceC77782Ufq.getAppID(), interfaceC77782Ufq.getRoomID(), interfaceC77782Ufq.getTaskID(), interfaceC77782Ufq.getAnchorID(), interfaceC77782Ufq.getGameID(), interfaceC77782Ufq.getGameName(), packageName);
            if (deeplink == null || deeplink.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(deeplink));
                intent.setPackage(packageName);
                intent.putExtra("pns.sandbox.dataflow_id", 1207968513);
                try {
                    C16880lQ.LIZJ(context, intent);
                    i = 1;
                } catch (Exception e) {
                    C0NB.LJ("DownloadPartneringGameMethod", e.getMessage());
                    i = 0;
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_gp_open_deeplink");
                LIZ.LJIIZILJ();
                LIZ.LJIJJ(c77784Ufs.LIZ, "deeplink_url");
                LIZ.LJIJJ(c77784Ufs.LIZIZ, "app_id");
                LIZ.LJIJJ(c77784Ufs.LIZJ, "room_id");
                LIZ.LJIJJ(c77784Ufs.LIZLLL, "task_id");
                LIZ.LJIJJ(c77784Ufs.LJ, "anchor_id");
                LIZ.LJIJJ(c77784Ufs.LJFF, "game_id");
                LIZ.LJIJJ(c77784Ufs.LJI, "game_name");
                C0JT.LIZJ(LIZ, c77784Ufs.LJII, "package_name", i, "success");
                if (i != 0) {
                    LJIIIIZZ(c37356ElM);
                    return;
                }
            }
            if (o.LJ(jumpType, Integer.valueOf(EnumC77786Ufu.TYPE_DEEPLINK_FALLBACK_STORE.getValue()))) {
                IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
                if (iGamePartnershipService != null && iGamePartnershipService.oK() != null) {
                    if (packageName == null) {
                        packageName = "";
                    }
                    if (UZK.LIZJ(context, packageName, "")) {
                        LJIIIIZZ(c37356ElM);
                        return;
                    }
                }
                LJII(c37356ElM, EnumC77785Uft.NO_GOOGLE_PLAY_STORE_INSTALLED);
                return;
            }
            if (o.LJ(jumpType, Integer.valueOf(EnumC77786Ufu.TYPE_DEEPLINK_FALLBACK_WEB.getValue()))) {
                LJIIIZ(context, interfaceC77782Ufq.getUrl(), c37356ElM);
                LJIIIIZZ(c37356ElM);
            } else {
                if (o.LJ(jumpType, Integer.valueOf(EnumC77786Ufu.TYPE_BROWSER_WEB.getValue()))) {
                    Activity LJIJJ = C45804HyK.LJIJJ(context);
                    String url = interfaceC77782Ufq.getUrl();
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(UriProtector.parse(url));
                    if (LJIJJ == null) {
                        return;
                    }
                    C16880lQ.LIZIZ(LJIJJ, intent2);
                    return;
                }
                LJII(c37356ElM, EnumC77785Uft.UNKNOWN_JUMP_TYPE);
            }
        }
    }
}
