package X;

import Y.ARunnableS32S0200000_13;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message.CoHostRtcMessage;
import com.bytedance.android.livesdk.comp.impl.linkcore.rtc.message.CoHostRtcMessageParam;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostRtcReplyMsgSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7I<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ U7F LJLILLLLZI;
    public final /* synthetic */ ReplyInviteData LJLJI;

    public U7I(int i, U7F u7f, ReplyInviteData replyInviteData) {
        this.LJLIL = i;
        this.LJLILLLLZI = u7f;
        this.LJLJI = replyInviteData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        LinkReplyResult linkReplyResult;
        CoHostRtcMessage coHostRtcMessage;
        Integer num;
        MicPositionInfo micPositionData;
        UBW ubw = (UBW) obj;
        if (ubw != null) {
            int i = this.LJLIL;
            U7F u7f = this.LJLILLLLZI;
            ReplyInviteData replyInviteData = this.LJLJI;
            Object obj3 = ubw.LIZ;
            if (obj3 instanceof C28467BFf) {
                if (obj3 != null) {
                    BaseResponse baseResponse = (BaseResponse) obj3;
                    if (baseResponse != null && (linkReplyResult = (LinkReplyResult) baseResponse.data) != null) {
                        if (i != 1) {
                            if (i == 2 || i == 5) {
                                u7f.LJJIIZ().getClass();
                                u7f.LJJJI();
                            }
                        } else {
                            u7f.getClass();
                            if (!MtCoHostRtcReplyMsgSetting.INSTANCE.isEnable()) {
                                U4R.LIZLLL("CoLinker", "handleRtcMessageReplyInviteSend rtc_reply_msg disable");
                            } else {
                                int replyStatus = replyInviteData.getReplyStatus();
                                if (replyStatus == 1 && u7f.LJJIIZ().LJLLLL) {
                                    String str = u7f.LJJIIZ().LJLZ;
                                    String str2 = "";
                                    if (str == null) {
                                        str = "";
                                    }
                                    u7f.LJJIIZ().getClass();
                                    long j = u7f.LJIIIZ;
                                    String str3 = u7f.LJIIJ;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    if (j <= 0) {
                                        coHostRtcMessage = null;
                                    } else {
                                        long LIZ = C30725C4b.LIZ();
                                        CoHostRtcMessageParam coHostRtcMessageParam = new CoHostRtcMessageParam(1, str, str3);
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                                        LIZ2.append('_');
                                        LIZ2.append(LIZ);
                                        coHostRtcMessage = new CoHostRtcMessage("multi_cohost_reply_msg", j, coHostRtcMessageParam, "android", 1, 2, LIZ, X1D.LIZIZ(LIZ2), null, 256, null);
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("getCoHostReplyMessage : rtcMessage=");
                                        LIZ3.append(coHostRtcMessage);
                                        U4R.LIZLLL("CoHostRtcMessageWriter", X1D.LIZIZ(LIZ3));
                                    }
                                    String messageStr = GsonProtectorUtils.toJson(C09650Zl.LIZJ, coHostRtcMessage);
                                    U7U LJJIIZI = u7f.LJJIIZI();
                                    String str4 = u7f.LJJIIZ().LJLZ;
                                    if (str4 != null) {
                                        str2 = str4;
                                    }
                                    o.LJIIIIZZ(messageStr, "messageStr");
                                    LJJIIZI.LJJJJZI(str2, messageStr);
                                    StringBuilder LIZ4 = C06830Op.LIZ("handleRtcMessageReplyInviteSend replyStatus:", replyStatus, ", inviterLinkmicId=", str, ", inviteeLinkmicId=");
                                    LIZ4.append(u7f.LJIIJ);
                                    LIZ4.append(", rtcMessage=");
                                    LIZ4.append(coHostRtcMessage);
                                    U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ4));
                                } else {
                                    U4R.LIZLLL("CoLinker", "handleRtcMessageReplyInviteSend,have not jpin rtc channel");
                                }
                            }
                            u7f.LJJIIZ().getClass();
                            String str5 = linkReplyResult.rivalLinkmicIdStr;
                            o.LJIIIIZZ(str5, "replyResult.rivalLinkmicIdStr");
                            u7f.LJJIZ(str5, U9X.LEAVE);
                            u7f.LJJIIZ().getClass();
                            u7f.LJJIIZ().LJLZ = linkReplyResult.rivalLinkmicIdStr;
                            if (!TextUtils.isEmpty(linkReplyResult.rtcExtInfo)) {
                                U7M LJJIIZ = u7f.LJJIIZ();
                                String str6 = linkReplyResult.rtcExtInfo;
                                o.LJIIIIZZ(str6, "replyResult.rtcExtInfo");
                                String LJJJIL = u7f.LJJJIL(str6);
                                if (LJJJIL == null) {
                                    LJJJIL = linkReplyResult.rtcExtInfo;
                                }
                                LJJIIZ.LLLZ(LJJJIL);
                            }
                            U7H LJJIIJZLJL = u7f.LJJIIJZLJL();
                            LinkUser.Builder builder = new LinkUser.Builder();
                            builder.setRoomId(Long.valueOf(u7f.LJI));
                            builder.setUserId(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                            builder.setLinkMicId(u7f.LJIIJ);
                            builder.setChannelId(Long.valueOf(u7f.LJIIIZ));
                            OnLineMicInfo.Builder builder2 = new OnLineMicInfo.Builder();
                            builder2.setMicPositionData(new MicPositionInfo(0, 0, 0, 0L, 12, null));
                            builder.setMicPositionData(builder2.build());
                            LJJIIJZLJL.LJJJLZIJ(builder.build());
                            OnLineMicInfo.Builder builder3 = new OnLineMicInfo.Builder();
                            builder3.setMicPositionData(new MicPositionInfo(0, 0, 0, 0L, 12, null));
                            OnLineMicInfo build = builder3.build();
                            LinkUser.Builder builder4 = new LinkUser.Builder();
                            builder4.setLinkMicId(u7f.LJJIIZ().LJLZ);
                            builder4.setUserId(Long.valueOf(u7f.LJJIIZ().LJLJJLL));
                            builder4.setMicPositionData(build);
                            LinkUser build2 = builder4.build();
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("handleReplyAgree inviter userId:");
                            LIZ5.append(build2.getUserId());
                            LIZ5.append(", inviter linkMicId:");
                            LIZ5.append(build2.getLinkMicId());
                            U4R.LIZ("CoLinker", X1D.LIZIZ(LIZ5));
                            C15610jN.LIZIZ(new ARunnableS32S0200000_13(u7f, build2, 106));
                            U7H LJJIIJZLJL2 = u7f.LJJIIJZLJL();
                            LJJIIJZLJL2.getClass();
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("replyAgree,userId:");
                            LIZ6.append(build2.getUserId());
                            LIZ6.append(",linkMicId:");
                            LIZ6.append(build2.getLinkMicId());
                            LIZ6.append(",position:");
                            OnLineMicInfo position = build2.getPosition();
                            if (position != null && (micPositionData = position.getMicPositionData()) != null) {
                                num = Integer.valueOf(micPositionData.getPosition());
                            } else {
                                num = null;
                            }
                            LIZ6.append(num);
                            U4R.LIZ("CoManager", X1D.LIZIZ(LIZ6));
                            String linkMicId = build2.getLinkMicId();
                            OnLineMicInfo position2 = build2.getPosition();
                            if (linkMicId != null && position2 != null) {
                                LJJIIJZLJL2.LJIJJ(build2);
                                LJJIIJZLJL2.LJJJZ(linkMicId);
                            }
                            u7f.LJJIIZI().LJJIL("business_mute_guest_reply_agree", false);
                            u7f.LJJIIZI().LJJIJL("business_mute_guest_reply_agree", false);
                            u7f.LJJIIZI().LJJIJLIJ("business_mute_guest_reply_agree", false);
                            if (!u7f.LJJIIZ().LJLLLL) {
                                Iterator<InterfaceC76622U5i> it = u7f.LJIILJJIL.iterator();
                                while (it.hasNext()) {
                                    it.next().LJII(new C76724U9g(u7f));
                                }
                            } else {
                                u7f.LJJIIZI().LJJJZ(null);
                            }
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult?>");
                }
            }
        }
        if (obj2 != null) {
            this.LJLILLLLZI.LJJJI();
        }
    }
}
