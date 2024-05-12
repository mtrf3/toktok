package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.PreviewLiveStudioTipsClickEvent;
import com.bytedance.android.livesdk.livesetting.game.LiveGuideLsSwitchSetting;
import com.bytedance.android.livesdk.livesetting.game.LiveStudioGuideLastShowLimit;
import com.bytedance.android.livesdk.livesetting.game.LiveStudioGuideLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.game.LiveStudioGuideShowMaxTimesSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;
import webcast.api.game.CreateInfoResponse;
import webcast.api.game.OpenLsNotifyInfo;

/* renamed from: X.BYb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28957BYb implements InterfaceC72822Si2 {
    public static DataChannel LJLILLLLZI;
    public static SparkContext LJLJJL;
    public static boolean LJLJJLL;
    public static final C28957BYb LJLIL = new C28957BYb();
    public static final int LJLJI = LiveStudioGuideShowMaxTimesSetting.INSTANCE.value();
    public static final int LJLJJI = LiveStudioGuideLastShowLimit.INSTANCE.value();

    public static boolean LIZ(DataChannel dataChannel) {
        boolean z;
        boolean z2;
        CreateInfoResponse.ResponseData DX;
        OpenLsNotifyInfo openLsNotifyInfo;
        if (dataChannel == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long lastTime = InterfaceC30442Bx8.D0.LIZJ();
        Boolean needPop = InterfaceC30442Bx8.E0.LIZJ();
        o.LJIIIIZZ(lastTime, "lastTime");
        int longValue = (int) ((currentTimeMillis - lastTime.longValue()) / 86400000);
        Integer times = InterfaceC30442Bx8.C0.LIZJ();
        IGameService iGameService = (IGameService) CN1.LIZ(IGameService.class);
        if (iGameService != null && (DX = iGameService.DX()) != null && (openLsNotifyInfo = DX.openLsNotify) != null && openLsNotifyInfo.openLsNotifyWindow) {
            z = true;
        } else {
            z = false;
        }
        if (dataChannel.kv0(BCX.class) == LiveMode.SCREEN_RECORD) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("needPop: ");
            LIZ.append(needPop);
            LIZ.append(", isMbGaming: ");
            LIZ.append(z2);
            LIZ.append(", open: ");
            LIZ.append(z);
            LIZ.append(", enable :");
            LIZ.append(LiveGuideLsSwitchSetting.INSTANCE.enable());
            C0NB.LIZIZ("PreviewLiveStudioGuideHelper", X1D.LIZIZ(LIZ));
        }
        o.LJIIIIZZ(needPop, "needPop");
        if (!needPop.booleanValue() || !z2 || !z) {
            return false;
        }
        o.LJIIIIZZ(times, "times");
        if (times.intValue() >= LJLJI || longValue < LJLJJI || !LiveGuideLsSwitchSetting.INSTANCE.enable()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC40159FpT LJIILL;
        if (C30922CBq.LIZIZ) {
            C0NB.LIZIZ("PreviewLiveStudioGuideHelper", "receive js msg JS_EVENT_LS_GUIDE_NAME");
        }
        if (o.LJ(c199097rd.LJLIL, "js_event_ls_guide_name")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null && u.LJJIIZI(interfaceC78280Uns, "js_param_ls_guide_not_pop", false)) {
                InterfaceC30442Bx8.E0.LIZ(Boolean.FALSE);
                return;
            }
            DataChannel dataChannel = LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.pv0(PreviewLiveStudioTipsClickEvent.class);
            }
            LJLJJLL = false;
            C72818Shy.LJII("js_event_ls_guide_name", this);
            LJLILLLLZI = null;
            SparkContext sparkContext = LJLJJL;
            if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
                LJIILL.close();
            }
        }
    }

    public final synchronized void LIZJ(Context context, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        if (!LJLJJLL && LIZ(dataChannel)) {
            LIZIZ(context, dataChannel, "live_start");
        }
    }

    public final void LIZIZ(Context context, DataChannel dataChannel, String str) {
        android.net.Uri build = UriProtector.parse(LiveStudioGuideLynxUrlSetting.INSTANCE.getLynxUrl()).buildUpon().appendQueryParameter("enter_from", str).build();
        if (!TextUtils.isEmpty(build.toString())) {
            InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
            String uri = build.toString();
            o.LJIIIIZZ(uri, "uri.toString()");
            SparkContext Vs0 = ((IHybridContainerService) LIZ).Vs0(context, uri, null);
            LJLJJL = Vs0;
            if (Vs0 != null) {
                Vs0.LJJI(new C28958BYc());
            }
            LJLJJLL = true;
            C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.C0;
            c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
            AnonymousClass030.LJFF(InterfaceC30442Bx8.D0);
            LJLILLLLZI = dataChannel;
            C72818Shy.LIZLLL("js_event_ls_guide_name", this);
            BZI LIZ2 = C28787BRn.LIZ("livesdk_native_guidepage_show");
            LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
            LIZ2.LJIJJ(str, "enter_from");
            LIZ2.LJJIIJZLJL();
        }
    }
}
