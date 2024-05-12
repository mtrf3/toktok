package Y;

import X.AbstractC66805QJt;
import X.AbstractC76473Tzp;
import X.B83;
import X.C05630Jz;
import X.C09650Zl;
import X.C0NB;
import X.C0NE;
import X.C15380j0;
import X.C15490jB;
import X.C28733BPl;
import X.C29306Beo;
import X.C29374Bfu;
import X.C30725C4b;
import X.C31012CFc;
import X.C32014ChO;
import X.C36616EYq;
import X.C65777Prh;
import X.C74639TRb;
import X.C75357Thp;
import X.C76217Tvh;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76268TwW;
import X.C76271TwZ;
import X.C76272Twa;
import X.C76278Twg;
import X.C76280Twi;
import X.C76338Txe;
import X.C76732zl;
import X.C76944UHs;
import X.C78046Uk6;
import X.C78047Uk7;
import X.C78048Uk8;
import X.C78261UnZ;
import X.C78273Unl;
import X.C87277YNd;
import X.CCJ;
import X.CFX;
import X.EnumC76178Tv4;
import X.InterfaceC78387Upb;
import X.QKY;
import X.U4R;
import X.U66;
import X.U7H;
import X.U7U;
import X.U87;
import X.U8I;
import X.U9F;
import X.UA9;
import X.UC0;
import X.V0N;
import X.X1D;
import android.animation.ValueAnimator;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.cohost.model.RtcMessage;
import com.bytedance.android.live.liveinteract.match.business.event.BattleLikeScoreCompensationEvent;
import com.bytedance.android.live.liveinteract.multimatch.rtc.MatchRtcInviteMessage;
import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkUserInfoFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.message.BattleInviteeGiftPermission;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS14S1100000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean LJJIIJ = C29306Beo.LJJIIJ(((C75357Thp) this.l1).getNetworkStateImageView());
        View nick_name = ((C75357Thp) this.l1)._$_findCachedViewById(R.id.h1_);
        o.LJIIIIZZ(nick_name, "nick_name");
        View follow_status_v1 = ((C75357Thp) this.l1)._$_findCachedViewById(R.id.dks);
        o.LJIIIIZZ(follow_status_v1, "follow_status_v1");
        if (!C75357Thp.LIZJ(nick_name, follow_status_v1)) {
            View follow_status_v12 = ((C75357Thp) this.l1)._$_findCachedViewById(R.id.dks);
            o.LJIIIIZZ(follow_status_v12, "follow_status_v1");
            View online_player_mute = ((C75357Thp) this.l1)._$_findCachedViewById(R.id.hb2);
            o.LJIIIIZZ(online_player_mute, "online_player_mute");
            if (!C75357Thp.LIZJ(follow_status_v12, online_player_mute)) {
                if (!((C75357Thp) this.l1).LJLJJI || o.LJ(this.s0, "showLiveShowOrder")) {
                    return;
                }
                C75357Thp c75357Thp = (C75357Thp) this.l1;
                if (!c75357Thp.LJLJJI) {
                    return;
                }
                C87277YNd.LJJIJ(c75357Thp.getNetworkStateImageView());
                C75357Thp c75357Thp2 = (C75357Thp) this.l1;
                c75357Thp2.LJLJJI = false;
                c75357Thp2.getNetworkStateImageView().post(new ARunnableS49S0100000_13((C75357Thp) this.l1, 2));
                return;
            }
        }
        if (LJJIIJ) {
            ((C75357Thp) this.l1).getNetworkStateImageView().setVisibility(8);
            ((C75357Thp) this.l1).LJLJJI = true;
        }
    }

    public final void LIZ$1() {
        List<?> list = ((VoiceChatUserInfoFragment) this.l1).LJLJJL.LJLIL;
        o.LJIIIIZZ(list, "adapter.items");
        String str = this.s0;
        int i = 0;
        for (Object obj : list) {
            if ((obj instanceof LinkPlayerInfo) && o.LJ(((LinkPlayerInfo) obj).mInteractIdStr, str)) {
                if (i != -1) {
                    ((VoiceChatUserInfoFragment) this.l1).LJLJJL.notifyItemChanged(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void LIZ$10() {
        String str;
        String str2;
        if (this.s0.length() == 0) {
            return;
        }
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.s0);
        LIZ.append(' ');
        Throwable th = (Throwable) this.l1;
        if (th != null) {
            str = V0N.LJJIJL(th);
        } else {
            str = null;
        }
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZLLL("ttlive_interact", LIZIZ);
        if (((List) U4R.LIZIZ.getValue()).contains(this.s0)) {
            return;
        }
        String str3 = this.s0;
        Throwable th2 = (Throwable) this.l1;
        if (th2 != null) {
            str2 = V0N.LJJIJL(th2);
        } else {
            str2 = "";
        }
        U4R.LJ(str3, str2);
    }

    public final void LIZ$11() {
        int i;
        QKY qky = new QKY();
        try {
            ((InterfaceC78387Upb) this.l1).onResponse(AbstractC66805QJt.LIZ.LIZIZ(this.s0, ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIIL, qky));
        } catch (Throwable th) {
            if (th instanceof C36616EYq) {
                i = th.getResponseCode();
            } else {
                i = -100;
            }
            InterfaceC78387Upb interfaceC78387Upb = (InterfaceC78387Upb) this.l1;
            AbsResult absResult = new AbsResult();
            absResult.withErrorCode(1);
            absResult.withDetailCode(i);
            absResult.withMessage(th.getMessage());
            interfaceC78387Upb.LIZ(absResult);
        }
    }

    public final void LIZ$2() {
        int i;
        int i2;
        int scrollX;
        int i3;
        C78046Uk6 c78046Uk6 = (C78046Uk6) this.l1;
        String str = this.s0;
        TextView textView = c78046Uk6.LJLJI;
        C78047Uk7 c78047Uk7 = new C78047Uk7(c78046Uk6);
        if (!c78046Uk6.LJLLJ) {
            return;
        }
        textView.setText(str);
        textView.setScrollX(c78046Uk6.LIZ());
        TextPaint paint = textView.getPaint();
        if (paint != null) {
            i = (int) paint.measureText(str);
        } else {
            i = 0;
        }
        if (i > textView.getWidth()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("               ");
            textView.setText(X1D.LIZIZ(LIZ));
            C76732zl c76732zl = new C76732zl();
            TextPaint paint2 = textView.getPaint();
            if (paint2 != null) {
                i2 = (int) paint2.measureText(textView.getText().toString());
            } else {
                i2 = 0;
            }
            c76732zl.element = i2;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("               ");
            LIZ2.append(str);
            textView.setText(X1D.LIZIZ(LIZ2));
            if (((ArrayList) c78046Uk6.LJLLI).size() > 1) {
                TextPaint paint3 = textView.getPaint();
                if (paint3 != null) {
                    i3 = (int) paint3.measureText(textView.getText().toString());
                } else {
                    i3 = 0;
                }
                c76732zl.element = i3 - textView.getWidth();
            }
            if (CCJ.LIZ(c78046Uk6.getContext())) {
                scrollX = textView.getScrollX() - c76732zl.element;
            } else {
                scrollX = textView.getScrollX() + c76732zl.element;
            }
            c78046Uk6.LJLJJI.setVisibility(0);
            ValueAnimator ofInt = ValueAnimator.ofInt(textView.getScrollX(), scrollX);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setDuration(((c76732zl.element * 1.0f) / C15380j0.LIZ(40.0f)) * ((float) 1000));
            ofInt.addUpdateListener(new AUListenerS92S0100000_3(textView, 0));
            ofInt.addListener(new C78048Uk8(c78047Uk7, c76732zl));
            ofInt.start();
            return;
        }
        c78047Uk7.LIZ(0);
    }

    public final void LIZ$3() {
        float f;
        C78046Uk6 c78046Uk6 = (C78046Uk6) this.l1;
        c78046Uk6.LJLJI.setScrollX(c78046Uk6.LIZ());
        TextPaint paint = ((C78046Uk6) this.l1).LJLJI.getPaint();
        if (paint != null) {
            f = paint.measureText(this.s0);
        } else {
            f = 0.0f;
        }
        if (f > ((C78046Uk6) this.l1).LJLJI.getWidth()) {
            ((C78046Uk6) this.l1).LJLJJL.setVisibility(0);
        } else {
            ((C78046Uk6) this.l1).LJLJJL.setVisibility(8);
        }
        C78046Uk6 c78046Uk62 = (C78046Uk6) this.l1;
        c78046Uk62.postDelayed(new ARunnableS14S1100000_13(c78046Uk62, this.s0, 2), 1000L);
    }

    public final void LIZ$4() {
        List<?> list = ((GameLinkUserInfoFragment) this.l1).LJLJJI.LJLIL;
        o.LJIIIIZZ(list, "adapter.items");
        String str = this.s0;
        int i = 0;
        for (Object obj : list) {
            if ((obj instanceof LinkPlayerInfo) && o.LJ(((LinkPlayerInfo) obj).mInteractIdStr, str)) {
                if (i != -1) {
                    ((GameLinkUserInfoFragment) this.l1).LJLJJI.notifyItemChanged(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void LIZ$5() {
        RtcMessage rtcMessage;
        Long l;
        int i;
        MutableLiveData<Long> mutableLiveData;
        C76278Twg c76278Twg = (C76278Twg) this.l1;
        String message = this.s0;
        c76278Twg.LJIL.getClass();
        o.LJIIIZ(message, "message");
        try {
            rtcMessage = (RtcMessage) C09650Zl.LIZIZ.LJI(message, RtcMessage.class);
        } catch (Exception e) {
            C32014ChO.LIZJ(C74639TRb.LIZ(20), "unpackMsg failed", e.getMessage());
            rtcMessage = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMsgReceived, rtcMessage = ");
        LIZ.append(rtcMessage);
        C0NB.LIZIZ("MultiMatchViewAnchorPre", X1D.LIZIZ(LIZ));
        if (rtcMessage == null) {
            return;
        }
        long j = rtcMessage.channelId;
        C76244Tw8 LJII = c76278Twg.LJII();
        if (LJII == null || (mutableLiveData = LJII.LIZ) == null || (l = mutableLiveData.getValue()) == null) {
            l = 0L;
        }
        if (j != l.longValue()) {
            return;
        }
        String str = rtcMessage.method;
        if (o.LJ(str, "team_match_invite_msg")) {
            C74639TRb c74639TRb = c76278Twg.LJIL;
            String str2 = rtcMessage.content;
            if (str2 == null) {
                str2 = "";
            }
            c74639TRb.getClass();
            MatchRtcInviteMessage matchRtcInviteMessage = (MatchRtcInviteMessage) C74639TRb.LIZIZ(MatchRtcInviteMessage.class, str2);
            if (matchRtcInviteMessage == null) {
                return;
            }
            LinkMicBattleMessage linkMicBattleMessage = new LinkMicBattleMessage();
            linkMicBattleMessage.abtestSettings = matchRtcInviteMessage.abtestSettings;
            linkMicBattleMessage.teamUsers = matchRtcInviteMessage.teamUsers;
            linkMicBattleMessage.actionByUserId = matchRtcInviteMessage.actionUserId;
            linkMicBattleMessage.battleId = matchRtcInviteMessage.battleId;
            linkMicBattleMessage.inviteeGiftPermissionTypes = matchRtcInviteMessage.inviteeGiftPermissionTypes;
            CommonMessageData commonMessageData = new CommonMessageData();
            commonMessageData.createTime = matchRtcInviteMessage.createTime;
            linkMicBattleMessage.baseMessage = commonMessageData;
            BattleSetting battleSetting = new BattleSetting();
            battleSetting.battleId = matchRtcInviteMessage.battleId;
            battleSetting.inviteType = matchRtcInviteMessage.inviteType;
            battleSetting.duration = matchRtcInviteMessage.duration;
            linkMicBattleMessage.battleSetting = battleSetting;
            EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
            EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.RECEIVED;
            if (LJ == enumC76178Tv4 || C76265TwT.LIZIZ.LJ() == enumC76178Tv4) {
                i = 1;
            } else {
                i = 0;
            }
            C76271TwZ c76271TwZ = C76271TwZ.LIZ;
            int i2 = i ^ 1;
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LJFF(jSONObject, "invite_message_fetch_cost", C30725C4b.LIZ() - linkMicBattleMessage.baseMessage.createTime);
            C05630Jz.LJFF(jSONObject, "message_create_time", linkMicBattleMessage.baseMessage.createTime);
            List<BattleInviteeGiftPermission> list = linkMicBattleMessage.inviteeGiftPermissionTypes;
            int i3 = 3;
            if (list != null) {
                for (BattleInviteeGiftPermission battleInviteeGiftPermission : list) {
                    if (battleInviteeGiftPermission.userId == C76271TwZ.LJJIIZ()) {
                        i3 = battleInviteeGiftPermission.giftPermissionType;
                    }
                }
            }
            C05630Jz.LIZ(i3, "gift_permission", jSONObject);
            C05630Jz.LJFF(jSONObject, "battle_id", linkMicBattleMessage.battleId);
            C05630Jz.LJFF(jSONObject, "action_by_userId", linkMicBattleMessage.actionByUserId);
            C05630Jz.LIZ(i2, "is_first_invite", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            C76271TwZ.LJLI(c76271TwZ, "received_invite_rtc_msg", jSONObject, jSONObject2, jSONObject2);
            c76278Twg.LJJIII(linkMicBattleMessage);
            return;
        }
        if (!o.LJ(str, "team_match_open_msg")) {
            return;
        }
        C76268TwW.LIZ(c76278Twg.LJI(), rtcMessage, 2556);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (r1 == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$6() {
        /*
            r6 = this;
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.Object r0 = r6.l1
            X.Ulx r0 = (X.C78161Ulx) r0
            X.Ulw r0 = r0.LIZ
            if (r0 == 0) goto L10
            X.C77413UZt.LJ(r0, r3)
        L10:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "gift_effect_msg_load_start"
            r1.append(r0)
            java.lang.String r0 = r6.s0
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.ClH r2 = X.C32256ClI.LIZ(r0)
            java.lang.Object r0 = r6.l1
            X.Ulx r0 = (X.C78161Ulx) r0
            X.Ulw r0 = r0.LIZ
            r4 = 0
            if (r0 == 0) goto Le2
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LJ
        L32:
            r2.LJFF(r0)
            java.lang.Object r0 = r6.l1
            X.Ulx r0 = (X.C78161Ulx) r0
            boolean r0 = r0.LIZLLL
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_asset_local"
            r2.LIZLLL(r1, r0)
            java.lang.Object r0 = r6.l1
            X.Ulx r0 = (X.C78161Ulx) r0
            X.Ulw r0 = r0.LIZ
            if (r0 == 0) goto Ldf
            boolean r1 = r0.LIZJ
            r0 = 1
            if (r1 != r0) goto Ldf
        L51:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_own_send"
            r2.LIZLLL(r1, r0)
            java.lang.Object r0 = r6.l1
            X.Ulx r0 = (X.C78161Ulx) r0
            com.bytedance.gift.render.model.Effect r0 = r0.LIZIZ
            com.bytedance.android.livesdk.gift.assets.AssetsModel r0 = r0.LIZ()
            long r0 = r0.id
            java.lang.String r5 = "asset_id"
            r2.LIZJ(r0, r5)
            java.lang.Object r0 = r6.l1
            X.Ulx r0 = (X.C78161Ulx) r0
            com.bytedance.gift.render.model.Effect r0 = r0.LIZIZ
            com.bytedance.android.livesdk.gift.assets.AssetsModel r0 = r0.LIZ()
            java.lang.String r1 = r0.getResourceFormat()
            java.lang.String r0 = "resources_format"
            r2.LIZLLL(r1, r0)
            java.lang.Object r0 = r6.l1
            X.Ulx r0 = (X.C78161Ulx) r0
            com.bytedance.gift.render.model.Effect r0 = r0.LIZIZ
            com.bytedance.android.livesdk.gift.assets.AssetsModel r0 = r0.LIZ()
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r0.resourceByteVC1Model
            if (r0 == 0) goto Ldd
            java.util.List<java.lang.String> r0 = r0.urlList
            if (r0 == 0) goto Ldd
            java.lang.Object r1 = X.ORZ.LJLLLL(r0)
        L94:
            java.lang.String r0 = "resource_bytevc1_url"
            r2.LIZLLL(r1, r0)
            int r0 = X.C32257ClJ.LJFF()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_anchor"
            r2.LIZLLL(r1, r0)
            java.lang.Object r0 = r6.l1
            X.Ulx r0 = (X.C78161Ulx) r0
            X.Ulw r0 = r0.LIZ
            if (r0 == 0) goto Ldb
            java.lang.String r1 = r0.LIZIZ
        Lb0:
            java.lang.String r0 = "log_id"
            r2.LIZLLL(r1, r0)
            java.lang.Object r0 = r6.l1
            X.Ulx r0 = (X.C78161Ulx) r0
            X.Ulw r0 = r0.LIZ
            if (r0 == 0) goto Lc3
            long r0 = r0.LIZ
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        Lc3:
            java.lang.String r0 = "msg_id"
            r2.LIZLLL(r4, r0)
            java.lang.String r1 = X.C1H.LJ()
            java.lang.String r0 = "overload_score"
            r2.LIZLLL(r1, r0)
            r2.LJ(r3)
            r2.LIZIZ()
            r2.LJI()
            return
        Ldb:
            r1 = r4
            goto Lb0
        Ldd:
            r1 = r4
            goto L94
        Ldf:
            r0 = 0
            goto L51
        Le2:
            r0 = r4
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS14S1100000_13.LIZ$6():void");
    }

    public final void LIZ$8() {
        boolean z;
        boolean z2;
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        long LIZIZ = C31012CFc.LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT > 30) {
            z = true;
            if (C76944UHs.LIZIZ(C15380j0.LIZLLL(), "android.permission.BLUETOOTH_CONNECT")) {
                z2 = true;
                UA9.LJFF().LIZIZ(new ARunnableS0S1220200_13((U66) this.l1, this.s0, LJIJI, LIZIZ, currentTimeMillis, z, z2, 0));
            }
        } else {
            z = false;
        }
        z2 = false;
        UA9.LJFF().LIZIZ(new ARunnableS0S1220200_13((U66) this.l1, this.s0, LJIJI, LIZIZ, currentTimeMillis, z, z2, 0));
    }

    public final void LIZ$9() {
        boolean z;
        boolean z2;
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        long LIZIZ = C31012CFc.LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT > 30) {
            z = true;
            if (C76944UHs.LIZIZ(C15380j0.LIZLLL(), "android.permission.BLUETOOTH_CONNECT")) {
                z2 = true;
                UA9.LJFF().LIZIZ(new ARunnableS0S1220200_13((U66) this.l1, this.s0, LJIJI, LIZIZ, currentTimeMillis, z, z2, 1));
            }
        } else {
            z = false;
        }
        z2 = false;
        UA9.LJFF().LIZIZ(new ARunnableS0S1220200_13((U66) this.l1, this.s0, LJIJI, LIZIZ, currentTimeMillis, z, z2, 1));
    }

    public final void LIZ$7() {
        DataChannel LJJIIZI;
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        C76280Twi c76280Twi = C76265TwT.LIZ;
        String valueOf = String.valueOf(c76280Twi.LIZIZ());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(valueOf);
        LIZ.append(',');
        LIZ.append(currentUserId);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (c76280Twi.LJJIIJ && !c76280Twi.LJII() && o.LJ("pass", this.s0)) {
            Map<String, List<C76338Txe>> map = C76271TwZ.LJJIII;
            if (((LinkedHashMap) map).get(LIZIZ) == null) {
                C76338Txe c76338Txe = new C76338Txe(currentUserId, 0L, C31012CFc.LIZJ());
                map.put(LIZIZ, new ArrayList());
                Object obj = ((LinkedHashMap) map).get(LIZIZ);
                o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.bytedance.android.live.liveinteract.multimatch.tracer.GiftEventInfo>");
                C65777Prh.LIZIZ(obj).add(c76338Txe);
                if (((ArrayList) C76271TwZ.LJJIIJ).contains(LIZIZ)) {
                    C76271TwZ.LJJIIJ(0L, true, false, LIZIZ);
                }
                if (((ArrayList) C76272Twa.LIZJ).contains(LIZIZ)) {
                    C76271TwZ.LJJIIJ(0L, false, false, LIZIZ);
                }
                if (C29306Beo.LJIIL(((AbstractC76473Tzp) this.l1).LJJIIZI()) && (LJJIIZI = ((AbstractC76473Tzp) this.l1).LJJIIZI()) != null) {
                    LJJIIZI.pv0(BattleLikeScoreCompensationEvent.class);
                }
                c76280Twi.LJJIIJ = false;
                ((AbstractC76473Tzp) this.l1).LJJLI(false);
            }
        }
    }

    public static final void run$0(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            ((U8I) aRunnableS14S1100000_13.l1).LIZJ(aRunnableS14S1100000_13.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS0S1200200_13((U66) aRunnableS14S1100000_13.l1, aRunnableS14S1100000_13.s0, UC0.LJIJI((U66) aRunnableS14S1100000_13.l1), C31012CFc.LIZIZ(), System.currentTimeMillis(), 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS0S1200200_13((U66) aRunnableS14S1100000_13.l1, aRunnableS14S1100000_13.s0, UC0.LJIJI((U66) aRunnableS14S1100000_13.l1), C31012CFc.LIZIZ(), System.currentTimeMillis(), 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS14S1100000_13.l1).LJFF;
            if (u9f != null) {
                u9f.LJIILL(aRunnableS14S1100000_13.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS14S1100000_13.l1).LJFF;
            if (u9f != null) {
                u9f.onUserJoined(aRunnableS14S1100000_13.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            aRunnableS14S1100000_13.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            C15490jB.LJIIJ(((C76217Tvh) aRunnableS14S1100000_13.l1).LJLILLLLZI, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_interaction_demand_1"), aRunnableS14S1100000_13.s0, true);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            U7H u7h = (U7H) aRunnableS14S1100000_13.l1;
            List<U87> list = u7h.LJIIIIZZ;
            String str = aRunnableS14S1100000_13.s0;
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((U87) it.next()).LLILII(u7h.LIZJ, str);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            U7H u7h = (U7H) aRunnableS14S1100000_13.l1;
            List<U87> list = u7h.LJIIIIZZ;
            String str = aRunnableS14S1100000_13.s0;
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((U87) it.next()).LJJLJLI(u7h.LIZLLL, str);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS14S1100000_13 aRunnableS14S1100000_13) {
        boolean LIZ;
        try {
            U7H u7h = (U7H) aRunnableS14S1100000_13.l1;
            List<U87> list = u7h.LJIIIIZZ;
            String str = aRunnableS14S1100000_13.s0;
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((U87) it.next()).LJLLLL(u7h.LIZ, str);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS14S1100000_13(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    public ARunnableS14S1100000_13(U7H u7h, String str, CustomLinkMessage customLinkMessage, int i) {
        this.$t = i;
        this.l1 = u7h;
        this.s0 = str;
    }
}
