package X;

import android.content.Context;
import com.bytedance.ies.actionai.jni.ActionAIErrorCode;
import com.bytedance.ies.actionai.jni.FollowUpQuestionMsgResponse;
import com.bytedance.ies.actionai.jni.LogMsgResponse;
import com.bytedance.ies.actionai.jni.MessageCallback;
import com.bytedance.ies.actionai.jni.MessageCode;
import com.bytedance.ies.actionai.jni.MessageRequest;
import com.bytedance.ies.actionai.jni.MessageResponse;
import com.bytedance.ies.actionai.jni.ServerErrorInfo;
import com.ss.android.ugc.aweme.actionai.config.ActionAIHintConfig;
import com.ss.android.ugc.aweme.actionai.sdk.ActionAISDKAgent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsOfflineService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wnr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83375Wnr extends MessageCallback implements InterfaceC83392Wo8 {
    public final Context LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final C83376Wns LIZJ;
    public final InterfaceC83392Wo8 LIZLLL;
    public final InterfaceC83392Wo8 LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;
    public final InterfaceC83392Wo8 LJI;
    public ActionAISDKAgent LJII;

    @Override // X.InterfaceC83392Wo8
    public final void LIZ(AbstractC83369Wnl message) {
        o.LJIIIZ(message, "message");
        int i = C83363Wnf.LIZJ[message.LIZ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        this.LIZLLL.LIZ(message);
                        return;
                    } else {
                        this.LJ.LIZ(message);
                        this.LJI.LIZ(message);
                        this.LIZLLL.LIZ(message);
                        return;
                    }
                }
                switch (C83363Wnf.LIZIZ[((C83355WnX) message).LIZJ.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        this.LIZLLL.LIZ(message);
                        return;
                    case 9:
                    case 10:
                        ActionAISDKAgent actionAISDKAgent = this.LJII;
                        if (actionAISDKAgent != null) {
                            MessageRequest messageRequest = new MessageRequest();
                            messageRequest.setIs_canceled(true);
                            actionAISDKAgent.LIZIZ(messageRequest);
                        }
                        this.LJI.LIZ(message);
                        this.LIZLLL.LIZ(message);
                        return;
                    default:
                        return;
                }
            }
            this.LIZLLL.LIZ(message);
            return;
        }
        this.LIZLLL.LIZ(message);
        if (C48203Ivv.LJ(this.LIZ)) {
            ActionAISDKAgent actionAISDKAgent2 = this.LJII;
            if (actionAISDKAgent2 != null) {
                C83357WnZ c83357WnZ = (C83357WnZ) message;
                MessageRequest messageRequest2 = new MessageRequest();
                messageRequest2.setInput(c83357WnZ.LIZJ);
                messageRequest2.setMessageId(c83357WnZ.LIZ);
                actionAISDKAgent2.LIZIZ(messageRequest2);
            }
            this.LJFF.invoke();
            this.LIZJ.LIZJ(new C83355WnX(EnumC83354WnW.WAITING, null, null, 62));
            return;
        }
        this.LIZJ.LIZJ(new C83355WnX(EnumC83354WnW.NO_NETWORK, this.LIZ.getString(R.string.e10), null, 60));
    }

    @Override // com.bytedance.ies.actionai.jni.MessageCallback
    public final void onNotify(MessageCode messageCode, MessageResponse messageResponse) {
        ActionAIErrorCode actionAIErrorCode;
        String str;
        String str2;
        ServerErrorInfo serverErrorInfo;
        ActionAIErrorCode errorCode;
        LogMsgResponse dynamicCast;
        if (C19N.LJ("action_ai_enable_debug_mode", false) && (dynamicCast = LogMsgResponse.dynamicCast(messageResponse)) != null) {
            IToolsOfflineService iToolsOfflineService = (IToolsOfflineService) ServiceManager.get().getService(IToolsOfflineService.class);
            String str3 = ActionAISDKAgent.LJLJJLL;
            if (str3 == null) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            String logAsString = dynamicCast.getLogAsString();
            o.LJIIIIZZ(logAsString, "it.logAsString");
            iToolsOfflineService.LIZLLL(str3, logAsString);
            return;
        }
        Integer num = null;
        if (messageCode == MessageCode.SUCCESS) {
            if (messageResponse != null) {
                FollowUpQuestionMsgResponse dynamicCast2 = FollowUpQuestionMsgResponse.dynamicCast(messageResponse);
                if (dynamicCast2 != null) {
                    C83355WnX c83355WnX = new C83355WnX(EnumC83354WnW.FOLLOW_UP_QUESTIONS, null, dynamicCast2.getFollowUpQuestionList(), 58);
                    List<String> list = c83355WnX.LJ;
                    if (list == null || list.isEmpty()) {
                        c83355WnX.LJ = ActionAIHintConfig.LIZ();
                    }
                    this.LIZJ.LIZJ(c83355WnX);
                    return;
                }
                String message = messageResponse.getMessage();
                if (message == null || message.length() == 0) {
                    return;
                }
                C83376Wns c83376Wns = this.LIZJ;
                String message2 = messageResponse.getMessage();
                String conversationId = messageResponse.getConversationId();
                String messageId = messageResponse.getMessageId();
                List LIZIZ = C42428Gky.LIZIZ(messageResponse.getActionDAG());
                o.LJIIIIZZ(message2, "message");
                c83376Wns.LIZ(new C83351WnT(message2, LIZIZ, conversationId, messageId, null, true, null, 1776));
                C83348WnQ.LJII(this.LIZIZ, ActionAISDKAgent.LJLJJLL, messageResponse.getMessageId(), messageResponse.getConversationId(), "success", null);
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNotify : msgCode: ");
        LIZ.append(messageCode);
        LIZ.append(", errorCode: ");
        if (messageResponse != null) {
            actionAIErrorCode = messageResponse.getErrorCode();
        } else {
            actionAIErrorCode = null;
        }
        LIZ.append(actionAIErrorCode);
        X1D.LIZIZ(LIZ);
        if (messageResponse != null && (errorCode = messageResponse.getErrorCode()) != null) {
            switch (C83363Wnf.LIZ[errorCode.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                case 0:
                default:
                    return;
                case 7:
                    this.LIZJ.LIZJ(new C83355WnX(EnumC83354WnW.CONTENT_SECURITY_ERROR, null, null, 62));
                    VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
                    String str4 = ActionAISDKAgent.LJLJJLL;
                    String messageId2 = messageResponse.getMessageId();
                    String conversationId2 = messageResponse.getConversationId();
                    ServerErrorInfo serverErrorInfo2 = messageResponse.getServerErrorInfo();
                    if (serverErrorInfo2 != null) {
                        num = Integer.valueOf(serverErrorInfo2.getStatusCode());
                    }
                    C83348WnQ.LJII(videoPublishEditModel, str4, messageId2, conversationId2, "fail", String.valueOf(num));
                    return;
                case 8:
                    C83376Wns c83376Wns2 = this.LIZJ;
                    String string = this.LIZ.getString(R.string.e12);
                    o.LJIIIIZZ(string, "context.getString(R.stri…ialEditFailMessage_toast)");
                    c83376Wns2.LIZ(new C83351WnT(string, null, null, null, null, false, null, 2046));
                    C83348WnQ.LJII(this.LIZIZ, ActionAISDKAgent.LJLJJLL, messageResponse.getMessageId(), messageResponse.getConversationId(), "fail", null);
                    return;
                case 9:
                    C83376Wns c83376Wns3 = this.LIZJ;
                    String string2 = this.LIZ.getString(R.string.e0l);
                    o.LJIIIIZZ(string2, "context.getString(R.stri…AddTextErrorMessage_body)");
                    c83376Wns3.LIZ(new C83351WnT(string2, null, null, null, null, false, null, 2046));
                    C83348WnQ.LJII(this.LIZIZ, ActionAISDKAgent.LJLJJLL, messageResponse.getMessageId(), messageResponse.getConversationId(), "fail", null);
                    return;
            }
        }
        this.LIZJ.LIZJ(new C83355WnX(EnumC83354WnW.REQUEST_ERROR, this.LIZ.getString(R.string.e18), null, 60));
        VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ;
        String str5 = ActionAISDKAgent.LJLJJLL;
        if (messageResponse != null) {
            str = messageResponse.getMessageId();
            str2 = messageResponse.getConversationId();
        } else {
            str = null;
            str2 = null;
        }
        if (messageResponse != null && (serverErrorInfo = messageResponse.getServerErrorInfo()) != null) {
            num = Integer.valueOf(serverErrorInfo.getStatusCode());
        }
        C83348WnQ.LJII(videoPublishEditModel2, str5, str, str2, "fail", String.valueOf(num));
    }

    public C83375Wnr(Context context, VideoPublishEditModel model, C83376Wns c83376Wns, C83349WnR c83349WnR, C83352WnU c83352WnU, AqS164S0100000_14 aqS164S0100000_14, C83364Wng c83364Wng) {
        o.LJIIIZ(model, "model");
        this.LIZ = context;
        this.LIZIZ = model;
        this.LIZJ = c83376Wns;
        this.LIZLLL = c83349WnR;
        this.LJ = c83352WnU;
        this.LJFF = aqS164S0100000_14;
        this.LJI = c83364Wng;
        c83376Wns.LIZIZ = this;
    }
}
