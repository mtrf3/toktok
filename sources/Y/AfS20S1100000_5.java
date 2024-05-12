package Y;

import X.BUX;
import X.BUZ;
import X.BXT;
import X.BZI;
import X.C05490Jl;
import X.C06540Nm;
import X.C0NB;
import X.C16880lQ;
import X.C19K;
import X.C276516r;
import X.C279117r;
import X.C28184B4i;
import X.C28787BRn;
import X.C28852BUa;
import X.C28853BUb;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29401Dk;
import X.C29494Bhq;
import X.C29982Bpi;
import X.C30868C9o;
import X.C32044Chs;
import X.C32089Cib;
import X.C32537Cpp;
import X.C54992Dv;
import X.CKO;
import X.CR6;
import X.DialogC77438UaI;
import X.InterfaceC05190Ih;
import X.InterfaceC21020s6;
import X.InterfaceC64592gB;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.ai.api.pitaya.GiftGuideTriggerResultChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.adminsetting.fastaddblockwords.LiveFastAddBlockKeywordsDialog;
import com.bytedance.android.livesdk.adminsetting.fastfiltercomment.FastFilterCommentFragmentSheet;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.guide.model.GiftGuideTriggerResponse;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommunityGuidelineSetting;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdk.qa.AskQuestionDialog;
import com.bytedance.android.livesdk.qa.QADialog;
import com.bytedance.android.livesdk.qa.QuestionAddEvent;
import com.bytedance.android.livesdk.qa.QuestionListResponse;
import com.bytedance.android.livesdk.qa.QuestionResponse;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import webcast.api.room.CommentFlaggedPrompt;
import webcast.api.room.RecommendSensitiveWordResp;

/* loaded from: classes6.dex */
public class AfS20S1100000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS20S1100000_5(FragmentManager fragmentManager, int i) {
        this.$t = i;
        this.l1 = fragmentManager;
        this.s0 = "LiveFastAddBlockKeywordsDialog";
    }

    public static final void accept$0(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        LiveCore liveCore;
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
        if (interfaceC21020s6 == null || (liveCore = interfaceC21020s6.getLiveCore()) == null) {
            CKO cko = ((LiveBroadcastFragment) afS20S1100000_5.l1).LLIIIL;
            if (cko != null) {
                liveCore = cko.LJ;
            } else {
                return;
            }
        }
        if (liveCore != null) {
            liveCore.addSeiField(afS20S1100000_5.s0, "1", 1, false, false);
        }
    }

    public static final void accept$1(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        LiveCore liveCore;
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
        if (interfaceC21020s6 == null || (liveCore = interfaceC21020s6.getLiveCore()) == null) {
            CKO cko = ((VoiceChatBroadcastFragment) afS20S1100000_5.l1).LJLLLL;
            if (cko != null) {
                liveCore = cko.LJ;
            } else {
                return;
            }
        }
        if (liveCore != null) {
            liveCore.addSeiField(afS20S1100000_5.s0, "1", 1, false, false);
        }
    }

    public static final void accept$10(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        FragmentManager fragmentManager = (FragmentManager) ((DataChannel) afS20S1100000_5.l1).kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            String str = afS20S1100000_5.s0;
            AskQuestionDialog askQuestionDialog = new AskQuestionDialog();
            askQuestionDialog.LJLLJ = true;
            askQuestionDialog.show(fragmentManager, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$11(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        DataChannel dataChannel;
        GiftGuideMessage giftGuideMessage;
        BaseResponse baseResponse = (BaseResponse) obj;
        Map<String, String> map = C32089Cib.LJLL;
        String str = baseResponse.LIZIZ;
        o.LJIIIIZZ(str, "it.logId");
        map.put(str, afS20S1100000_5.s0);
        C0NB.LJIIIZ("LiveGiftGuidePredictManager", "trigger success!");
        GiftGuideTriggerResponse.Data data = (GiftGuideTriggerResponse.Data) baseResponse.data;
        if (data != null && data.success) {
            GiftGuideMessage giftGuideMessage2 = null;
            if (data != null && data.giftGuideMessage != null && (dataChannel = (DataChannel) afS20S1100000_5.l1) != null) {
                if (data != null && (giftGuideMessage = data.giftGuideMessage) != null) {
                    if (giftGuideMessage.giftId == 0) {
                        giftGuideMessage.giftId = 5655L;
                    }
                    String str2 = giftGuideMessage.guideType;
                    if (str2 == null || str2.length() == 0) {
                        giftGuideMessage.guideType = "gift_guide_popup";
                    }
                    CommonMessageData commonMessageData = new CommonMessageData();
                    commonMessageData.roomId = C29306Beo.LJJIZ(dataChannel);
                    commonMessageData.logId = baseResponse.LIZIZ;
                    commonMessageData.showMsg = true;
                    giftGuideMessage.baseMessage = commonMessageData;
                    giftGuideMessage2 = giftGuideMessage;
                }
                dataChannel.rv0(GiftGuideTriggerResultChannel.class, giftGuideMessage2);
            }
        }
    }

    public static final void accept$12(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        String str;
        UserAttr userAttr;
        String str2;
        long j;
        ChatMessage chatMessage;
        C05490Jl c05490Jl = (C05490Jl) obj;
        BZI LIZ = C28787BRn.LIZ("livesdk_manage_negative_comment");
        BXT bxt = (BXT) afS20S1100000_5.l1;
        Boolean bool = null;
        if (bxt.LJLLI) {
            str = "anchor";
        } else {
            InterfaceC05190Ih interfaceC05190Ih = bxt.LJLLL;
            if (interfaceC05190Ih != null && (userAttr = interfaceC05190Ih.getUserAttr()) != null) {
                bool = Boolean.valueOf(userAttr.isAdmin);
            }
            if (C29306Beo.LJJIFFI(bool)) {
                str = "admin";
            } else {
                str = "viewer";
            }
        }
        LIZ.LJIJJ(str, "admin_type");
        LIZ.LJIJJ(Long.valueOf(((BXT) afS20S1100000_5.l1).LJLJLLL.getId()), "to_user_id");
        CR6 cr6 = ((BXT) afS20S1100000_5.l1).LJLLJ;
        if (!(cr6 instanceof ChatMessage) || (chatMessage = (ChatMessage) cr6) == null || (str2 = chatMessage.content) == null) {
            str2 = "";
        }
        LIZ.LJIJJ(str2, "live_message");
        LIZ.LJIJJ(afS20S1100000_5.s0, "manage_action");
        InterfaceC05190Ih interfaceC05190Ih2 = ((BXT) afS20S1100000_5.l1).LJLLL;
        if (interfaceC05190Ih2 != null) {
            j = interfaceC05190Ih2.getId();
        } else {
            j = 0;
        }
        LIZ.LJIJJ(Long.valueOf(j), "user_id");
        LIZ.LJIJJ(Long.valueOf(((BXT) afS20S1100000_5.l1).LJLL.getOwnerUserId()), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(((BXT) afS20S1100000_5.l1).LJLL.getId()), "room_id");
        LIZ.LJIJJ(Long.valueOf(((BXT) afS20S1100000_5.l1).LJLLJ.getMessageId()), "msg_id");
        if (o.LJ(afS20S1100000_5.s0, "mute")) {
            LIZ.LJIJJ(Long.valueOf(c05490Jl.LIZ), "mute_duration");
            LIZ.LJIJJ(Long.valueOf(c05490Jl.LIZ), "default_mute_set");
        }
        LIZ.LJJIIJZLJL();
    }

    public static final void accept$13(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        LikeHelper likeHelper = (LikeHelper) afS20S1100000_5.l1;
        Throwable th = (Throwable) obj;
        ((HashMap) likeHelper.LLIIII).remove(afS20S1100000_5.s0);
        if (th instanceof C276516r) {
            C29982Bpi.LIZ(((C276516r) th).getErrorCode(), 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String, O] */
    public static final void accept$2(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        Object obj2;
        QuestionResponse questionResponse;
        BaseResponse baseResponse = (BaseResponse) obj;
        DataChannel dataChannel = ((AskQuestionDialog) afS20S1100000_5.l1).dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(QuestionAddEvent.class);
        }
        C30868C9o.LIZJ(R.string.ofg);
        ((AskQuestionDialog) afS20S1100000_5.l1).dismiss();
        DataChannel dataChannel2 = ((AskQuestionDialog) afS20S1100000_5.l1).dataChannel;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(BUZ.class)).LIZ = afS20S1100000_5.s0;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_qa_ask_publish_success");
        if (baseResponse != null && (questionResponse = (QuestionResponse) baseResponse.data) != null) {
            obj2 = Long.valueOf(questionResponse.questionId);
        } else {
            obj2 = null;
        }
        LIZ.LJIJJ(obj2, "question_id");
        LIZ.LJIJJ(Integer.valueOf(!((AskQuestionDialog) afS20S1100000_5.l1).LJLLI ? 1 : 0), "create_from");
        LIZ.LJIILLIIL(((AskQuestionDialog) afS20S1100000_5.l1).dataChannel);
        LIZ.LJJIFFI(((AskQuestionDialog) afS20S1100000_5.l1).vl());
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String, O] */
    public static final void accept$3(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            if (c29401Dk.getErrorCode() == 4021011) {
                AskQuestionDialog askQuestionDialog = (AskQuestionDialog) afS20S1100000_5.l1;
                String str2 = afS20S1100000_5.s0;
                Context context = askQuestionDialog.getContext();
                if (context != null) {
                    DataChannel dataChannel = askQuestionDialog.dataChannel;
                    BUX bux = null;
                    if (dataChannel != null) {
                        str = (String) dataChannel.kv0(BUZ.class);
                    } else {
                        str = null;
                    }
                    DataChannel dataChannel2 = askQuestionDialog.dataChannel;
                    C28852BUa.LIZ = false;
                    BZI LIZ = C28787BRn.LIZ("livesdk_qa_rethink_sw");
                    C06540Nm.LJFF((C29374Bfu) C279117r.LIZJ(LIZ, dataChannel2), LIZ, "user_id", str2, "comment");
                    LIZ.LJIJJ(Integer.valueOf(TextUtils.equals(str, str2) ? 1 : 0), "resend_same_cmt");
                    LIZ.LJJIIJZLJL();
                    DialogC77438UaI dialogC77438UaI = askQuestionDialog.LJLJL;
                    if (dialogC77438UaI != null) {
                        dialogC77438UaI.dismiss();
                    }
                    String value = LiveCommunityGuidelineSetting.INSTANCE.getValue();
                    DataChannel dataChannel3 = askQuestionDialog.dataChannel;
                    if (dataChannel3 != null && o.LJ(dataChannel3.kv0(UserIsAnchorChannel.class), Boolean.FALSE) && !TextUtils.isEmpty(value)) {
                        bux = new BUX(value, askQuestionDialog, context, str, str2);
                    }
                    DialogC77438UaI LIZ2 = C28853BUb.LIZ(context, bux, new ARunnableS0S2100000_5(askQuestionDialog, str, str2, 0), new ARunnableS0S2100000_5(askQuestionDialog, str, str2, 1));
                    askQuestionDialog.LJLJL = LIZ2;
                    C16880lQ.LIZ(LIZ2);
                }
            } else {
                String prompt = c29401Dk.getPrompt();
                if (prompt == null || prompt.length() == 0) {
                    C30868C9o.LIZJ(R.string.ofi);
                } else {
                    String prompt2 = c29401Dk.getPrompt();
                    o.LJIIIIZZ(prompt2, "it.prompt");
                    C30868C9o.LJI(prompt2);
                }
            }
        }
        DataChannel dataChannel4 = ((AskQuestionDialog) afS20S1100000_5.l1).dataChannel;
        if (dataChannel4 != null) {
            ((C32537Cpp) dataChannel4.gv0(BUZ.class)).LIZ = afS20S1100000_5.s0;
        }
    }

    public static final void accept$4(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        ((C28184B4i) afS20S1100000_5.l1).LJII.remove(afS20S1100000_5.s0);
        String str = afS20S1100000_5.s0;
        if (o.LJ(str, "T2")) {
            C28184B4i c28184B4i = (C28184B4i) afS20S1100000_5.l1;
            if (!o.LJ(c28184B4i.LIZIZ, "T2")) {
                return;
            }
            c28184B4i.LJIILJJIL(System.currentTimeMillis(), "system_exit_confirm_time_end", "", "");
            c28184B4i.LJIILIIL();
            long currentTimeMillis = System.currentTimeMillis();
            c28184B4i.LIZLLL = currentTimeMillis;
            c28184B4i.LIZIZ = "T3";
            c28184B4i.LJIILJJIL(currentTimeMillis, "system_enter_enforce_time_start", "", "");
            c28184B4i.LJIILL(c28184B4i.LJIIIZ, c28184B4i.LIZIZ);
            return;
        }
        if (!o.LJ(str, "T3")) {
            return;
        }
        C28184B4i c28184B4i2 = (C28184B4i) afS20S1100000_5.l1;
        if (!o.LJ(c28184B4i2.LIZIZ, "T3")) {
            return;
        }
        c28184B4i2.LJIILJJIL(System.currentTimeMillis(), "system_exit_enforce_time_end", "", "");
        c28184B4i2.LJIILIIL();
        long currentTimeMillis2 = System.currentTimeMillis();
        c28184B4i2.LIZLLL = currentTimeMillis2;
        c28184B4i2.LIZIZ = "T4";
        c28184B4i2.LJIILJJIL(currentTimeMillis2, "system_enter_enjoy_time_start", "", "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r1 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$5(Y.AfS20S1100000_5 r4, java.lang.Object r5) {
        /*
            java.lang.Object r3 = r4.l1
            X.CgN r3 = (X.C31951CgN) r3
            java.lang.String r2 = r4.s0
            byte[] r5 = (byte[]) r5
            monitor-enter(r3)
            X.0EG r0 = r3.LIZ     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            monitor-exit(r3)
            goto L2f
        Lf:
            r1 = 0
            X.0ED r0 = r0.LIZJ(r2)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            java.io.OutputStream r1 = r0.LIZJ()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            r1.write(r5)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            r1.flush()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            r0.LIZIZ()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L29
            goto L2b
        L22:
            r0 = move-exception
            if (r1 == 0) goto L28
            r1.close()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L30
        L28:
            throw r0     // Catch: java.lang.Throwable -> L30
        L29:
            if (r1 == 0) goto L2e
        L2b:
            r1.close()     // Catch: java.io.IOException -> L2e java.lang.Throwable -> L30
        L2e:
            monitor-exit(r3)
        L2f:
            return
        L30:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS20S1100000_5.accept$5(Y.AfS20S1100000_5, java.lang.Object):void");
    }

    public static final void accept$6(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        boolean z;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (((DrawGuessStartFragment) afS20S1100000_5.l1).isViewValid() && o.LJ(afS20S1100000_5.s0, String.valueOf(((C19K) ((DrawGuessStartFragment) afS20S1100000_5.l1)._$_findCachedViewById(R.id.cos)).getText()))) {
            DrawGuessStartFragment drawGuessStartFragment = (DrawGuessStartFragment) afS20S1100000_5.l1;
            if (!drawGuessStartFragment.LJLJJI) {
                if (baseResponse.statusCode == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawGuessStartFragment.vl(afS20S1100000_5.s0, null, z);
                if (z) {
                    DrawGuessStartFragment drawGuessStartFragment2 = (DrawGuessStartFragment) afS20S1100000_5.l1;
                    if (drawGuessStartFragment2.LJLJLJ) {
                        drawGuessStartFragment2.wl();
                    }
                }
            }
        }
    }

    public static final void accept$7(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        C29401Dk c29401Dk;
        Throwable th = (Throwable) obj;
        DrawGuessStartFragment drawGuessStartFragment = (DrawGuessStartFragment) afS20S1100000_5.l1;
        String str = afS20S1100000_5.s0;
        String str2 = null;
        if ((th instanceof C29401Dk) && (c29401Dk = (C29401Dk) th) != null) {
            str2 = c29401Dk.getPrompt();
        }
        drawGuessStartFragment.vl(str, str2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$8(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        FragmentManager fragmentManager = (FragmentManager) afS20S1100000_5.l1;
        if (fragmentManager != null && !fragmentManager.mDestroyed) {
            List<String> list = ((RecommendSensitiveWordResp.ResponseData) baseResponse.data).wordList;
            if (!list.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(list);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("key_block_keywords_list", arrayList);
                LiveFastAddBlockKeywordsDialog liveFastAddBlockKeywordsDialog = new LiveFastAddBlockKeywordsDialog();
                liveFastAddBlockKeywordsDialog.setArguments(bundle);
                liveFastAddBlockKeywordsDialog.show((FragmentManager) afS20S1100000_5.l1, afS20S1100000_5.s0);
                return;
            }
            CommentFlaggedPrompt commentFlaggedPrompt = ((RecommendSensitiveWordResp.ResponseData) baseResponse.data).prompt;
            if (commentFlaggedPrompt == null) {
                return;
            }
            FragmentManager fragmentManager2 = (FragmentManager) afS20S1100000_5.l1;
            Bundle bundle2 = new Bundle();
            String l = Long.valueOf(commentFlaggedPrompt.trigger).toString();
            String str = "";
            if (l == null) {
                l = "";
            }
            bundle2.putString("trigger", l);
            String l2 = Long.valueOf(commentFlaggedPrompt.action).toString();
            if (l2 != null) {
                str = l2;
            }
            bundle2.putString("action", str);
            C32044Chs.LJIIIZ(fragmentManager2, FastFilterCommentFragmentSheet.class, "fast_community_flagged", null, bundle2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$9(AfS20S1100000_5 afS20S1100000_5, Object obj) {
        Object obj2;
        BaseResponse baseResponse = (BaseResponse) obj;
        FragmentManager fragmentManager = (FragmentManager) ((DataChannel) afS20S1100000_5.l1).kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            String str = afS20S1100000_5.s0;
            if (baseResponse != null) {
                obj2 = baseResponse.data;
            } else {
                obj2 = null;
            }
            if (obj2 != null && ((!((QuestionListResponse) baseResponse.data).answeredList.questionExList.isEmpty()) || (!((QuestionListResponse) baseResponse.data).unansweredList.questionExList.isEmpty()) || ((QuestionListResponse) baseResponse.data).currentQuestion.question.questionId != 0)) {
                new QADialog().show(fragmentManager, str);
                return;
            }
            AskQuestionDialog askQuestionDialog = new AskQuestionDialog();
            askQuestionDialog.LJLLJ = true;
            askQuestionDialog.show(fragmentManager, str);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS20S1100000_5(com.bytedance.ies.sdk.datachannel.DataChannel r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 9: goto Le;
                case 10: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS20S1100000_5.<init>(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, int):void");
    }

    public AfS20S1100000_5(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
