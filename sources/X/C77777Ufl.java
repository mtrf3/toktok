package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ufl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77777Ufl extends AbstractC77775Ufj {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        boolean z;
        UZK oK;
        InterfaceC77776Ufk interfaceC77776Ufk = (InterfaceC77776Ufk) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            context = interfaceC38263Ezz.getContext();
        } else {
            context = null;
        }
        String roomID = interfaceC77776Ufk.getRoomID();
        String str = "";
        if (roomID == null) {
            roomID = "";
        }
        String taskID = interfaceC77776Ufk.getTaskID();
        if (taskID == null) {
            taskID = "";
        }
        String audienceUID = interfaceC77776Ufk.getAudienceUID();
        if (audienceUID == null) {
            audienceUID = "";
        }
        String anchorID = interfaceC77776Ufk.getAnchorID();
        if (anchorID == null) {
            anchorID = "";
        }
        String appID = interfaceC77776Ufk.getAppID();
        if (appID == null) {
            appID = "";
        }
        String packageName = interfaceC77776Ufk.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        Boolean isAnchor = interfaceC77776Ufk.isAnchor();
        if (isAnchor != null) {
            z = isAnchor.booleanValue();
        } else {
            z = false;
        }
        String gameID = interfaceC77776Ufk.getGameID();
        if (gameID == null) {
            gameID = "";
        }
        String deepLink = interfaceC77776Ufk.getDeepLink();
        if (deepLink == null) {
            deepLink = "";
        }
        String scene = interfaceC77776Ufk.getScene();
        if (scene == null) {
            scene = "";
        }
        String sourceID = interfaceC77776Ufk.getSourceID();
        if (sourceID == null) {
            sourceID = "";
        }
        String siteID = interfaceC77776Ufk.getSiteID();
        if (siteID != null) {
            str = siteID;
        }
        UZI uzi = new UZI(false, taskID, anchorID, gameID, scene, deepLink, null, roomID, packageName, audienceUID, appID, z, sourceID, str, 65);
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class);
        if (iGamePartnershipService != null && (oK = iGamePartnershipService.oK()) != null) {
            oK.LIZIZ(context, uzi, new C77778Ufm(this, c37356ElM));
        }
    }
}
