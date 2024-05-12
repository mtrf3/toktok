package X;

import Y.AfS22S1300000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.api.PerceptionAppealApi;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.PerceptionDialogDismissedChannel;
import com.bytedance.android.livesdk.dataChannel.PerceptionMessageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterPunishCardOptSetting;
import com.bytedance.android.livesdk.livesetting.security.LivePerceptionFeedbackUrlSetting;
import com.bytedance.android.livesdk.message.proto.PerceptionFeedbackOption;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class C1R implements C0K7 {
    public final PerceptionMessage LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public boolean LJLJJI;
    public final /* synthetic */ C1P LJLJJL;

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        Integer num;
        PerceptionDialogInfo perceptionDialogInfo;
        String builder;
        Long l;
        String str;
        Room room;
        C277116x c277116x;
        C277116x c277116x2;
        DataChannel dataChannel;
        PerceptionDialogInfo perceptionDialogInfo2 = this.LJLIL.dialog;
        String str2 = null;
        if (perceptionDialogInfo2 != null) {
            num = Integer.valueOf(perceptionDialogInfo2.scene);
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 11) {
            liveDialog.dismiss();
        }
        DataChannel dataChannel2 = this.LJLJJL.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.rv0(PerceptionDialogDismissedChannel.class, Boolean.TRUE);
        }
        if (C29306Beo.LJJIFFI(this.LJLIL.showViolation) && ((!LiveCenterPunishCardOptSetting.INSTANCE.isEnable() || num == null || (num.intValue() != 12 && num.intValue() != 13)) && (dataChannel = this.LJLJJL.LJLILLLLZI) != null)) {
            C30649C1d c30649C1d = new C30649C1d(0);
            c30649C1d.LIZ = Boolean.TRUE;
            PerceptionMessage perceptionMessage = this.LJLIL;
            c30649C1d.LIZIZ = perceptionMessage.endTime;
            c30649C1d.LIZJ = perceptionMessage.publicEventInfo;
            dataChannel.rv0(PerceptionMessageChannel.class, c30649C1d);
        }
        PerceptionMessage perceptionMessage2 = this.LJLIL;
        if (perceptionMessage2.publicEventInfo != null) {
            PerceptionDialogInfo perceptionDialogInfo3 = perceptionMessage2.dialog;
            if (perceptionDialogInfo3 != null && perceptionDialogInfo3.showFeedback && o.LJ(this.LJLILLLLZI, "feedback_text_btn")) {
                this.LJLJJL.LIZLLL("click", this.LJLIL.publicEventInfo);
            } else {
                PerceptionMessage perceptionMessage3 = this.LJLIL;
                PerceptionDialogInfo perceptionDialogInfo4 = perceptionMessage3.dialog;
                if (perceptionDialogInfo4 != null && (perceptionDialogInfo4.scene == 12 || perceptionDialogInfo4.scene == 13)) {
                    this.LJLJJL.LIZJ(perceptionMessage3, "click", this.LJLILLLLZI);
                } else {
                    this.LJLJJL.LJ("click", this.LJLILLLLZI, perceptionMessage3.publicEventInfo, perceptionDialogInfo4);
                }
            }
        }
        if (o.LJ(this.LJLILLLLZI, "suggest_tab")) {
            PerceptionDialogInfo perceptionDialogInfo5 = this.LJLIL.dialog;
            if (perceptionDialogInfo5 != null && perceptionDialogInfo5.scene == 11) {
                liveDialog.dismiss();
            }
            if (this.LJLJI.length() != 0) {
                ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLJJL.LJLIL, this.LJLJI);
            }
            PerceptionDialogInfo perceptionDialogInfo6 = this.LJLIL.dialog;
            if (perceptionDialogInfo6 != null && perceptionDialogInfo6.scene == 7 && (c277116x2 = this.LJLJJL.LJLJL) != null) {
                c277116x2.LIZJ(101);
                return;
            }
            return;
        }
        if (o.LJ(this.LJLILLLLZI, "default_tab")) {
            PerceptionDialogInfo perceptionDialogInfo7 = this.LJLIL.dialog;
            if (perceptionDialogInfo7 != null && perceptionDialogInfo7.scene == 7 && (c277116x = this.LJLJJL.LJLJL) != null) {
                c277116x.LIZ();
                C277116x c277116x3 = this.LJLJJL.LJLJL;
                if (c277116x3 != null) {
                    c277116x3.LIZJ(102);
                }
            }
            PerceptionDialogInfo perceptionDialogInfo8 = this.LJLIL.dialog;
            if (perceptionDialogInfo8 == null || perceptionDialogInfo8.scene != 11 || this.LJLJJI) {
                return;
            }
            DataChannel dataChannel3 = this.LJLJJL.LJLILLLLZI;
            if (dataChannel3 != null && (room = (Room) dataChannel3.kv0(RoomChannel.class)) != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            PunishEventInfo punishEventInfo = this.LJLIL.publicEventInfo;
            if (punishEventInfo != null) {
                str = punishEventInfo.punishId;
                str2 = punishEventInfo.punishType;
            } else {
                str = null;
            }
            if (l == null || str == null || str2 == null) {
                return;
            }
            long parseLong = CastLongProtector.parseLong(str);
            this.LJLJJI = true;
            C05260Io c05260Io = PerceptionAppealApi.LIZ;
            C12510eN c12510eN = new C12510eN(11, l.longValue(), parseLong, str2);
            c05260Io.getClass();
            C05260Io.LIZ(c12510eN).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS22S1300000_5(this, liveDialog, this.LJLJJL, str, 0), new AfS57S0100000_5(this, 216));
            return;
        }
        if (o.LJ(this.LJLILLLLZI, "feedback_text_btn")) {
            PerceptionDialogInfo perceptionDialogInfo9 = this.LJLIL.dialog;
            if (perceptionDialogInfo9 != null && perceptionDialogInfo9.scene == 11) {
                liveDialog.dismiss();
            }
            C1P c1p = this.LJLJJL;
            if (c1p.LJLJLLL == null) {
                c1p.LJLJLLL = new C78555UsJ();
            }
            PerceptionMessage perceptionMessage4 = this.LJLIL;
            PunishEventInfo punishEventInfo2 = perceptionMessage4.publicEventInfo;
            if (punishEventInfo2 == null || (perceptionDialogInfo = perceptionMessage4.dialog) == null || c1p.LJLJLLL == null) {
                return;
            }
            Context context = c1p.LJLIL;
            String str3 = punishEventInfo2.punishId;
            List<PerceptionFeedbackOption> feedbackOptions = perceptionDialogInfo.feedbackOptions;
            AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(c1p, 316);
            AqS155S0100000_5 aqS155S0100000_52 = new AqS155S0100000_5(this.LJLJJL, 315);
            if (context == null) {
                return;
            }
            if (str3 == null) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            if (feedbackOptions == null) {
                feedbackOptions = C61878OQg.INSTANCE;
            }
            o.LJIIIZ(feedbackOptions, "feedbackOptions");
            String url = LivePerceptionFeedbackUrlSetting.INSTANCE.getUrl();
            if (url.length() == 0) {
                builder = "";
            } else {
                Uri.Builder appendQueryParameter = UriProtector.parse(url).buildUpon().appendQueryParameter("punish_id", str3).appendQueryParameter("show_entrance", "ttlive_violation_popup");
                JSONArray jSONArray = new JSONArray();
                for (PerceptionFeedbackOption perceptionFeedbackOption : feedbackOptions) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", perceptionFeedbackOption.id);
                    jSONObject.put("content_key", perceptionFeedbackOption.contentKey);
                    jSONArray.put(jSONObject);
                }
                builder = appendQueryParameter.appendQueryParameter("feedback", jSONArray.toString()).toString();
                o.LJIIIIZZ(builder, "uri.toString()");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dialog lynx url = ");
            LIZ.append(builder);
            C0NB.LIZIZ("PerceptionFeedbackHandler", X1D.LIZIZ(LIZ));
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
            ((IHybridContainerService) LIZ2).Vs0(context, builder, new AqS136S0200000_5(aqS155S0100000_52, aqS155S0100000_5, 36));
            return;
        }
        PerceptionDialogInfo perceptionDialogInfo10 = this.LJLIL.dialog;
        if (perceptionDialogInfo10 == null || perceptionDialogInfo10.scene != 11) {
            return;
        }
        liveDialog.dismiss();
    }

    public C1R(C1P c1p, PerceptionMessage perceptionMessage, String str, String str2) {
        o.LJIIIZ(perceptionMessage, "perceptionMessage");
        this.LJLJJL = c1p;
        this.LJLIL = perceptionMessage;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
