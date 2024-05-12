package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.BCX;
import X.BZI;
import X.C15380j0;
import X.C28509BGv;
import X.C28787BRn;
import X.C28793BRt;
import X.C29306Beo;
import X.C30577BzJ;
import X.C30579BzL;
import X.C30582BzO;
import X.C32005ChF;
import X.C32670Cry;
import X.C32I;
import X.C75233Tfp;
import X.C76800UCe;
import X.CN1;
import X.EnumC74778TWk;
import X.InterfaceC31765CdN;
import X.InterfaceC88472Yns;
import android.net.Uri;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.preview.widget.LiveGoalPreviewWidget;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.TaskProfitInfo;
import com.bytedance.android.livesdk.gift.event.LiveSendRedEnvelopeEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSimplifiedGoLivePageSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveStreamGoalPresetWebLinkSetting;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class AqS48S0110000_5 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS48S0110000_5 aqS48S0110000_5, Object it) {
        String str;
        String str2;
        Boolean bool;
        LiveMode liveMode;
        LiveMode liveMode2;
        LiveMode liveMode3;
        o.LJIIIZ(it, "it");
        LiveGoalPreviewWidget liveGoalPreviewWidget = (LiveGoalPreviewWidget) aqS48S0110000_5.l0;
        boolean z = aqS48S0110000_5.z1;
        DataChannel dataChannel = liveGoalPreviewWidget.dataChannel;
        if (dataChannel != null && (liveMode3 = (LiveMode) dataChannel.kv0(BCX.class)) != null && C28509BGv.LJI(liveMode3) && LivePreviewComponentsSimplifyTypeSetting.INSTANCE.showFullLiveGoalBtn()) {
            str = "top";
        } else {
            str = "outside";
        }
        if (z) {
            str2 = "livesdk_golive_edit_live_goal_click";
        } else {
            str2 = "livesdk_golive_add_stream_goal_click";
        }
        BZI LIZ = C28787BRn.LIZ(str2);
        liveGoalPreviewWidget.LL(LIZ);
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(str, "position");
        LIZ.LJJIIJZLJL();
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ye0(0L, ((LiveGoalPreviewWidget) aqS48S0110000_5.l0).dataChannel, 8);
        String value = LiveStreamGoalPresetWebLinkSetting.INSTANCE.getValue();
        try {
            Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
            DataChannel dataChannel2 = ((LiveGoalPreviewWidget) aqS48S0110000_5.l0).dataChannel;
            String str3 = null;
            if (dataChannel2 != null && (liveMode2 = (LiveMode) dataChannel2.kv0(LiveModeChannel.class)) != null) {
                bool = Boolean.valueOf(C28509BGv.LJI(liveMode2));
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool) && LiveSimplifiedGoLivePageSetting.INSTANCE.enableSimplifiedGoLivePageV1orV2()) {
                buildUpon.appendQueryParameter("entrance", "golive_settings");
            } else {
                buildUpon.appendQueryParameter("entrance", "golive");
            }
            DataChannel dataChannel3 = ((LiveGoalPreviewWidget) aqS48S0110000_5.l0).dataChannel;
            if (dataChannel3 != null && (liveMode = (LiveMode) dataChannel3.kv0(BCX.class)) != null) {
                str3 = liveMode.logStreamingType;
            }
            buildUpon.appendQueryParameter("live_type", str3);
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "builder.build().toString()");
            value = uri;
        } catch (Exception unused) {
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((LiveGoalPreviewWidget) aqS48S0110000_5.l0).context, value);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS48S0110000_5 aqS48S0110000_5, Object it) {
        String str;
        String str2;
        o.LJIIIZ(it, "it");
        DataChannel dataChannel = (DataChannel) aqS48S0110000_5.l0;
        if (dataChannel != null) {
            if (aqS48S0110000_5.z1) {
                str = "portal";
                str2 = "label";
            } else {
                str = "";
                str2 = "normal";
            }
            dataChannel.qv0(LiveSendRedEnvelopeEvent.class, new C28793BRt("gift", str, str2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS48S0110000_5 aqS48S0110000_5, Object obj) {
        C75233Tfp c75233Tfp = (C75233Tfp) obj;
        o.LJIIIZ(c75233Tfp, "<name for destructuring parameter 0>");
        EnumC74778TWk enumC74778TWk = c75233Tfp.LJLIL;
        int i = c75233Tfp.LJLILLLLZI;
        InterfaceC31765CdN interfaceC31765CdN = ((C32005ChF) aqS48S0110000_5.l0).LIZJ;
        if (interfaceC31765CdN != null) {
            if ((enumC74778TWk == EnumC74778TWk.FLOATING_FIX || (enumC74778TWk == EnumC74778TWk.FLOATING && i > 0)) && aqS48S0110000_5.z1) {
                ((GiftWidget) interfaceC31765CdN).LJLZ(C15380j0.LIZ(100.0f));
            } else {
                ((GiftWidget) interfaceC31765CdN).LJLZ(0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS48S0110000_5 aqS48S0110000_5, Object it) {
        String str;
        String str2;
        o.LJIIIZ(it, "it");
        DataChannel dataChannel = ((C32670Cry) aqS48S0110000_5.l0).LJLJJLL;
        if (dataChannel != null) {
            if (aqS48S0110000_5.z1) {
                str = "portal";
                str2 = "label";
            } else {
                str = "";
                str2 = "normal";
            }
            dataChannel.qv0(LiveSendRedEnvelopeEvent.class, new C28793BRt("gift", str, str2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS48S0110000_5 aqS48S0110000_5, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        List<TaskProfitInfo> taskProfitInfos = (List) obj;
        o.LJIIIZ(taskProfitInfos, "taskProfitInfos");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS48S0110000_5.l0;
        if (interfaceC88472Yns != null) {
            if (!taskProfitInfos.isEmpty()) {
                Iterator it = taskProfitInfos.iterator();
                while (it.hasNext()) {
                    if (((TaskProfitInfo) it.next()).briefGame.task.anchorShowStatus == 0) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            interfaceC88472Yns.invoke(Boolean.valueOf(z3));
        }
        if (aqS48S0110000_5.z1) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(taskProfitInfos, 10));
            for (TaskProfitInfo taskProfitInfo : taskProfitInfos) {
                String str = taskProfitInfo.briefGame.task.idStr;
                o.LJIIIIZZ(str, "it.briefGame.task.idStr");
                String str2 = taskProfitInfo.briefGame.task.gameIdStr;
                o.LJIIIIZZ(str2, "it.briefGame.task.gameIdStr");
                PartnershipTask partnershipTask = taskProfitInfo.briefGame.task;
                if (partnershipTask.anchorShowStatus == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (partnershipTask.openGll == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(new C30582BzO(str, str2, z, false, z2, 8));
            }
            C30579BzL S00 = C30577BzJ.LIZJ().S00();
            if (S00 == null) {
                return null;
            }
            S00.LJIIIZ(null, arrayList);
            return C76800UCe.LIZ;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : taskProfitInfos) {
            PartnershipTask partnershipTask2 = ((TaskProfitInfo) obj2).briefGame.task;
            if (partnershipTask2.openGll == 1 && partnershipTask2.anchorShowStatus == 0) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            TaskProfitInfo taskProfitInfo2 = (TaskProfitInfo) it2.next();
            String str3 = taskProfitInfo2.briefGame.task.idStr;
            o.LJIIIIZZ(str3, "it.briefGame.task.idStr");
            String str4 = taskProfitInfo2.briefGame.task.gameIdStr;
            o.LJIIIIZZ(str4, "it.briefGame.task.gameIdStr");
            arrayList3.add(new C30582BzO(str3, str4, false, false, false, 28));
        }
        C30579BzL S002 = C30577BzJ.LIZJ().S00();
        if (S002 == null) {
            return null;
        }
        S002.LJI(arrayList3, "commercial_order", null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS48S0110000_5(C32005ChF c32005ChF, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c32005ChF;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS48S0110000_5(C32670Cry c32670Cry, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c32670Cry;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS48S0110000_5(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = interfaceC88472Yns;
        this.z1 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS48S0110000_5(LiveGoalPreviewWidget liveGoalPreviewWidget, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveGoalPreviewWidget;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS48S0110000_5(DataChannel dataChannel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = dataChannel;
        this.z1 = z;
    }
}
