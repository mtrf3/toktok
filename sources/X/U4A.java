package X;

import Y.AfS65S0100000_13;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveReqParams;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.j;
import com.google.gson.m;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U4A implements BTW, LPZ, InterfaceC48038ItG {
    public static final U4A LJLIL = new U4A();

    @Override // X.LPZ
    public void LIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C56662Kg.LIZ().LIZJ("method_main_set_content_view_duration", false);
        C56662Kg.LIZ().LIZJ("method_main_async_content_view_duration", false);
        View LIZLLL = C16970lZ.LIZLLL(activity, R.layout.azi);
        Context context = LIZLLL.getContext();
        o.LJIIIIZZ(context, "mainView.context");
        int LJJJJLI = C63081OpJ.LJJJJLI(context);
        View findViewById = LIZLLL.findViewById(R.id.ifl);
        o.LJIIIIZZ(findViewById, "mainView.findViewById<Fr….id.publish_iv_container)");
        findViewById.setPadding(0, LJJJJLI, 0, 0);
        C56662Kg.LIZ().LJFF("method_main_async_content_view_duration", false);
        activity.setContentView(LIZLLL);
        C56662Kg.LIZ().LIZJ("method_main_inflate_splash_viewstub", false);
        C56662Kg.LIZ().LJFF("method_main_inflate_splash_viewstub", false);
        C56662Kg.LIZ().LJFF("method_main_set_content_view_duration", false);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        return new OSZ(MPO.REPORT, it);
    }

    @Override // X.BTW
    public boolean canHandle(android.net.Uri uri) {
        if (uri == null || !C29706BlG.LIZJ(uri)) {
            return false;
        }
        if (o.LJ(UriProtector.getQueryParameter(uri, "use_spark"), "1")) {
            return true;
        }
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction == null) {
            return false;
        }
        return iHostAction.hostInterceptSpark(uri.toString());
    }

    public static final C73495Sst LIZIZ(MultiGuestReserveReqParams multiGuestReserveReqParams, U4B u4b) {
        return (C73495Sst) T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).reserve(multiGuestReserveReqParams.scene, multiGuestReserveReqParams.appId, multiGuestReserveReqParams.liveId, multiGuestReserveReqParams.fromUserId, multiGuestReserveReqParams.toUserId, multiGuestReserveReqParams.roomId, multiGuestReserveReqParams.type, multiGuestReserveReqParams.autoFollow)).LJJII(new AfS65S0100000_13(u4b, 198), new AfS65S0100000_13(u4b, 199));
    }

    public static String LIZLLL(m mVar, String str) {
        String str2 = (String) LJ(mVar, str, E8F.LJLIL, C35433DvR.LJLIL);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // X.BTW
    public boolean handle(Context context, android.net.Uri uri) {
        return LIZJ(context, uri, null);
    }

    @Override // X.BTW
    public boolean LIZJ(Context context, android.net.Uri uri, java.util.Map map) {
        if (context == null || uri == null) {
            return false;
        }
        ILiveSparkService iLiveSparkService = (ILiveSparkService) CN1.LIZ(ILiveSparkService.class);
        if (iLiveSparkService != null) {
            iLiveSparkService.gi0();
        }
        String LIZ = C29706BlG.LIZ(uri);
        if (LIZ == null) {
            return false;
        }
        if (!o.LJ(UriProtector.getQueryParameter(uri, "use_live_sheet"), "1")) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
            C05590Jv.LJ((IHybridContainerService) LIZ2, context, LIZ);
            return true;
        }
        C60904NvI.LIZIZ(context, LIZ);
        return true;
    }

    public static final Object LJ(m optPrimitive, String str, InterfaceC88472Yns typeValidator, InterfaceC88472Yns valueGetter) {
        j LJJIJ;
        o.LJIIJ(optPrimitive, "$this$optPrimitive");
        o.LJIIJ(typeValidator, "typeValidator");
        o.LJIIJ(valueGetter, "valueGetter");
        C65422Ply typeValidator2 = C65422Ply.LJLIL;
        C36221EJl valueGetter2 = C36221EJl.LJLIL;
        o.LJIIJ(typeValidator2, "typeValidator");
        o.LJIIJ(valueGetter2, "valueGetter");
        if (!optPrimitive.LJJIJLIJ(str) || (LJJIJ = optPrimitive.LJJIJ(str)) == null || !((Boolean) typeValidator2.invoke(LJJIJ)).booleanValue()) {
            return null;
        }
        valueGetter2.invoke(LJJIJ);
        if (!((Boolean) typeValidator.invoke(LJJIJ)).booleanValue()) {
            return null;
        }
        return valueGetter.invoke(LJJIJ);
    }
}
