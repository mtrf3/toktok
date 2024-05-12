package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipApiOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.google.android.play.core.appupdate.u;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS48S0110000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BzJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30577BzJ {
    public static java.util.Map LIZIZ() {
        return C113554cx.LJJL(new OSZ("btn_name", "icon"), new OSZ("user_type", "host"), new OSZ("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId())), new OSZ("live_type", "video_live"), new OSZ("page_name", "live_start"), new OSZ("page_from", "toggle_popup"));
    }

    public static IGamePartnershipService LIZJ() {
        return (IGamePartnershipService) C30576BzI.LJ.getValue();
    }

    public static boolean LIZ(boolean z) {
        if (!z ? C30576BzI.LIZ != LiveMode.VIDEO : C30576BzI.LIZ == LiveMode.VIDEO) {
            return false;
        }
        return true;
    }

    public static void LJ(InterfaceC72822Si2 jsEventSubscriber) {
        o.LJIIIZ(jsEventSubscriber, "jsEventSubscriber");
        C72818Shy.LIZLLL("gamePartnershipChangeTaskShowStatus", jsEventSubscriber);
        C72818Shy.LIZLLL("gamePartnershipFirstHideTask", jsEventSubscriber);
        C72818Shy.LIZLLL("gamePartnershipAgeNotMatch", jsEventSubscriber);
        C72818Shy.LIZLLL("gamePartnershipNeedFillAge", jsEventSubscriber);
    }

    public static void LJFF(InterfaceC72822Si2 jsEventSubscriber) {
        o.LJIIIZ(jsEventSubscriber, "jsEventSubscriber");
        C72818Shy.LJII("gamePartnershipChangeTaskShowStatus", jsEventSubscriber);
        C72818Shy.LJII("gamePartnershipFirstHideTask", jsEventSubscriber);
        C72818Shy.LJII("gamePartnershipAgeNotMatch", jsEventSubscriber);
        C72818Shy.LJII("gamePartnershipNeedFillAge", jsEventSubscriber);
    }

    public static void LJI(Context context, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        o.LJIIIZ(context, "context");
        BHT.LIZ().JO(new AqS155S0100000_5(context, 362));
        if (GameLivePartnershipApiOptSetting.INSTANCE.getAnchorGuide().brandedContentToggle) {
            return;
        }
        LIZJ().AA(context, new AqS48S0110000_5(interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) z, true));
    }

    public static void LIZLLL(boolean z, C199097rd c199097rd, Context context, C30574BzG c30574BzG, InterfaceC88472Yns interfaceC88472Yns) {
        WeakReference<Activity> weakReference;
        Activity activity;
        String LJJIJIL;
        WeakReference<Activity> weakReference2;
        Activity activity2;
        String LJJIJIL2;
        String str;
        boolean z2;
        C30579BzL S00;
        C30579BzL S002;
        InterfaceC78505UrV interfaceC78505UrV;
        InterfaceC78280Uns interfaceC78280Uns;
        InterfaceC78505UrV interfaceC78505UrV2;
        o.LJIIIZ(context, "context");
        String str2 = c199097rd.LJLIL;
        String str3 = null;
        java.util.Map<String, Object> map = null;
        String str4 = "";
        boolean z3 = true;
        switch (str2.hashCode()) {
            case -1825482305:
                if (!str2.equals("gamePartnershipAgeNotMatch") || LIZ(z) || c30574BzG == null || (weakReference = c30574BzG.LJLIL) == null || (activity = weakReference.get()) == null) {
                    return;
                }
                IGamePartnershipService LIZJ = LIZJ();
                InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns2 != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns2, "request_page", "")) != null) {
                    str4 = LJJIJIL;
                }
                LIZJ.Np(activity, "anchor", str4);
                return;
            case -1649822732:
                if (!str2.equals("gamePartnershipNeedFillAge") || LIZ(z) || c30574BzG == null || (weakReference2 = c30574BzG.LJLIL) == null || (activity2 = weakReference2.get()) == null) {
                    return;
                }
                IGamePartnershipService LIZJ2 = LIZJ();
                InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns3 != null && (LJJIJIL2 = u.LJJIJIL(interfaceC78280Uns3, "request_page", "")) != null) {
                    str4 = LJJIJIL2;
                }
                LIZJ2.dk(activity2, "anchor", str4, new AqS171S0100000_5(c199097rd, 783));
                return;
            case -1028895914:
                if (!str2.equals("gamePartnershipChangeTaskShowStatus")) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns4 == null || (interfaceC78505UrV = interfaceC78280Uns4.get("taskId")) == null || (str = interfaceC78505UrV.asString()) == null) {
                    str = "";
                }
                InterfaceC78280Uns interfaceC78280Uns5 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns5 != null && u.LJJIJIIJI(interfaceC78280Uns5, "openGLL", 0) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (str.length() == 0) {
                    return;
                }
                InterfaceC78280Uns interfaceC78280Uns6 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns6 == null || u.LJJIJIIJI(interfaceC78280Uns6, "showStatus", 0) != 1) {
                    z3 = false;
                }
                InterfaceC78280Uns interfaceC78280Uns7 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns7 != null) {
                    str3 = u.LJJIJIL(interfaceC78280Uns7, "tagId", "");
                }
                if (C30576BzI.LIZIZ && ((C30576BzI.LIZLLL || z) && (S002 = LIZJ().S00()) != null)) {
                    S002.LJIIIZ(new AqS171S0100000_5(interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 782), C47261Igj.LJJIJ(new C30582BzO(str, String.valueOf(str3), z3, false, z2, 8)));
                }
                if (!C30576BzI.LIZJ || !z2 || (S00 = LIZJ().S00()) == null) {
                    return;
                }
                S00.LJI(C47261Igj.LJJIJ(new C30582BzO(str, String.valueOf(str3), z3, false, false, 24)), "commercial_order", C30576BzI.LIZ);
                return;
            case -92014043:
                if (!str2.equals("gamePartnershipFirstHideTask") || LIZ(z) || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null || (interfaceC78505UrV2 = interfaceC78280Uns.get("isFromApp")) == null || interfaceC78505UrV2.asInt() != 0) {
                    return;
                }
                LIZJ().Ka0();
                InterfaceC78280Uns interfaceC78280Uns8 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns8 != null) {
                    map = interfaceC78280Uns8.LIZIZ();
                }
                C24150x9.LJIIIIZZ(context, map);
                return;
            default:
                return;
        }
    }
}
