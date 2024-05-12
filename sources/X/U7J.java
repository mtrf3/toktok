package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.PermitResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;
import com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message.CoHostRtcMessage;
import com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message.CoHostRtcMessageLinkerInfo;
import com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message.CoHostRtcMessageParam;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostRtcPermitMsgSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7J<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ U7F LJLILLLLZI;
    public final /* synthetic */ PermitApplyData LJLJI;
    public final /* synthetic */ long LJLJJI;

    public U7J(int i, U7F u7f, PermitApplyData permitApplyData, long j) {
        this.LJLIL = i;
        this.LJLILLLLZI = u7f;
        this.LJLJI = permitApplyData;
        this.LJLJJI = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        PermitResponse.ResponseData responseData;
        CoHostRtcMessage coHostRtcMessage;
        long j;
        long j2;
        Integer num;
        MicPositionInfo micPositionData;
        UBW ubw = (UBW) obj;
        if (this.LJLIL != 1 || ubw == null) {
            return;
        }
        U7F u7f = this.LJLILLLLZI;
        PermitApplyData permitApplyData = this.LJLJI;
        long j3 = this.LJLJJI;
        Object obj3 = ubw.LIZ;
        if (!(obj3 instanceof C28467BFf)) {
            return;
        }
        if (obj3 != null) {
            BaseResponse baseResponse = (BaseResponse) obj3;
            if (baseResponse == null || (responseData = (PermitResponse.ResponseData) baseResponse.data) == null) {
                return;
            }
            u7f.getClass();
            if (!MtCoHostRtcPermitMsgSetting.INSTANCE.isEnable()) {
                U4R.LIZLLL("CoLinker", "handleRtcMessagePermitApplySend rtc_reply_msg disable");
            } else {
                int permitStatus = permitApplyData.getPermitStatus();
                if (permitStatus == 1) {
                    String linkMicId = permitApplyData.getApplicant().getLinkMicId();
                    if (linkMicId == null) {
                        linkMicId = "";
                    }
                    u7f.LJJIIZ().getClass();
                    long j4 = u7f.LJIIIZ;
                    String str = u7f.LJIIJ;
                    if (str == null) {
                        str = "";
                    }
                    List<LinkUser> linkedUserList = u7f.LJJIIJZLJL().LIZLLL;
                    o.LJIIIZ(linkedUserList, "linkedUserList");
                    if (j4 <= 0) {
                        coHostRtcMessage = null;
                    } else {
                        long LIZ = C30725C4b.LIZ();
                        CoHostRtcMessageParam coHostRtcMessageParam = new CoHostRtcMessageParam(1, linkMicId, str);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                        LIZ2.append('_');
                        LIZ2.append(LIZ);
                        coHostRtcMessage = new CoHostRtcMessage("multi_cohost_permit_msg", j4, coHostRtcMessageParam, "android", 1, 2, LIZ, X1D.LIZIZ(LIZ2), null, 256, null);
                        ArrayList arrayList = new ArrayList();
                        for (LinkUser linkUser : linkedUserList) {
                            Long userId = linkUser.getUserId();
                            if (userId != null) {
                                j = userId.longValue();
                            } else {
                                j = 0;
                            }
                            Long roomId = linkUser.getRoomId();
                            if (roomId != null) {
                                j2 = roomId.longValue();
                            } else {
                                j2 = 0;
                            }
                            String linkMicId2 = linkUser.getLinkMicId();
                            if (linkMicId2 == null) {
                                linkMicId2 = "";
                            }
                            arrayList.add(new CoHostRtcMessageLinkerInfo(j, j2, linkMicId2));
                        }
                        coHostRtcMessage.linkedUsers = arrayList;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("getCoHostPermitMessage : rtcMessage=");
                        LIZ3.append(coHostRtcMessage);
                        U4R.LIZLLL("CoHostRtcMessageWriter", X1D.LIZIZ(LIZ3));
                    }
                    String messageStr = GsonProtectorUtils.toJson(C09650Zl.LIZJ, coHostRtcMessage);
                    U7U LJJIIZI = u7f.LJJIIZI();
                    o.LJIIIIZZ(messageStr, "messageStr");
                    LJJIIZI.LJJJJZI(linkMicId, messageStr);
                    StringBuilder LIZ4 = C06830Op.LIZ("handleRtcMessagePermitApplySend replyStatus:", permitStatus, ", inviterLinkmicId=", linkMicId, ", inviteeLinkmicId=");
                    LIZ4.append(u7f.LJIIJ);
                    LIZ4.append(", rtcMessage=");
                    LIZ4.append(coHostRtcMessage);
                    U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ4));
                } else {
                    U4R.LIZLLL("CoLinker", "handleRtcMessageReplyInviteSend,have not jpin rtc channel");
                }
            }
            String str2 = responseData.rivalLinkmicIdStr;
            o.LJIIIIZZ(str2, "it.rivalLinkmicIdStr");
            u7f.LJJIZ(str2, U9X.KICKOUT);
            u7f.LJJIIZ().LJZ = responseData.rivalLinkmicIdStr;
            U7M LJJIIZ = u7f.LJJIIZ();
            String str3 = responseData.rtcExtInfo;
            o.LJIIIIZZ(str3, "it.rtcExtInfo");
            String LJJJIL = u7f.LJJJIL(str3);
            if (LJJJIL == null) {
                LJJJIL = responseData.rtcExtInfo;
            }
            LJJIIZ.LLLZ(LJJJIL);
            java.util.Map<Long, Long> map = u7f.LJJIIZ().LJLILLLLZI;
            Long valueOf = Long.valueOf(j3);
            Long l = responseData.actionId;
            o.LJIIIIZZ(l, "it.actionId");
            ((HashMap) map).put(valueOf, l);
            OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
            builder.setMicPositionData(new MicPositionInfo(0, 0, 0, 0L, 12, null));
            OnLineMicInfo build = builder.build();
            LinkUser.Builder builder2 = new LinkUser.Builder();
            builder2.setLinkMicId(u7f.LJJIIZ().LJZ);
            builder2.setUserId(Long.valueOf(j3));
            builder2.setMicPositionData(build);
            LinkUser user = builder2.build();
            C15610jN.LIZIZ(new ARunnableS32S0200000_13(u7f, user, 101));
            U7H LJJIIJZLJL = u7f.LJJIIJZLJL();
            LJJIIJZLJL.getClass();
            o.LJIIIZ(user, "user");
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("permitApply userId:");
            LIZ5.append(user.getUserId());
            LIZ5.append(",linkMicId:");
            LIZ5.append(user.getLinkMicId());
            LIZ5.append(",position:");
            OnLineMicInfo position = user.getPosition();
            if (position != null && (micPositionData = position.getMicPositionData()) != null) {
                num = Integer.valueOf(micPositionData.getPosition());
            } else {
                num = null;
            }
            LIZ5.append(num);
            U4R.LIZ("CoManager", X1D.LIZIZ(LIZ5));
            String linkMicId3 = user.getLinkMicId();
            OnLineMicInfo position2 = user.getPosition();
            if (linkMicId3 == null || position2 == null) {
                return;
            }
            LJJIIJZLJL.LJIJJ(user);
            LJJIIJZLJL.LJJJZ(linkMicId3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.interact.model.PermitResponse.ResponseData>");
    }
}
