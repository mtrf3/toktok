package X;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostRtcReplyMsgSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinChannelSetting;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U7L<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ U7F LJLIL;
    public final /* synthetic */ LinkUser LJLILLLLZI;
    public final /* synthetic */ InviteData LJLJI;
    public final /* synthetic */ InterfaceC76768UAy<InviteResult> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLJJL;

    public U7L(U7F u7f, LinkUser linkUser, InviteData inviteData, InterfaceC76768UAy<InviteResult> interfaceC76768UAy, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLIL = u7f;
        this.LJLILLLLZI = linkUser;
        this.LJLJI = inviteData;
        this.LJLJJI = interfaceC76768UAy;
        this.LJLJJL = interfaceC65784Pro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        LinkInviteResult linkInviteResult;
        long longValue;
        UBW ubw = (UBW) obj;
        if (ubw != null) {
            U7F u7f = this.LJLIL;
            LinkUser linkUser = this.LJLILLLLZI;
            InviteData inviteData = this.LJLJI;
            InterfaceC76768UAy<InviteResult> interfaceC76768UAy = this.LJLJJI;
            InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJJL;
            Object obj3 = ubw.LIZ;
            if (obj3 instanceof BaseResponse) {
                if (obj3 != null) {
                    BaseResponse baseResponse = (BaseResponse) obj3;
                    if (baseResponse != null && (linkInviteResult = (LinkInviteResult) baseResponse.data) != null) {
                        if (u7f.LJJIII()) {
                            C32014ChO.LIZJ(U7F.LJJIJIIJI(388), "multiLive is active, callback onFailed", null);
                            u7f.LJJIIJZLJL().LJJLIIIJL(linkUser);
                            u7f.LJJIIJ(inviteData.getInvitee().getUserId());
                            Iterator<U6Y> it = u7f.LJIIZILJ.iterator();
                            while (it.hasNext()) {
                                it.next().LJJJLIIL(inviteData.getInvitee().getUserId());
                            }
                            if (interfaceC76768UAy != null) {
                                interfaceC76768UAy.LIZJ(new LinkCoreError(99880001, "multiLive is active"), null);
                            }
                        } else if (linkInviteResult.perceptionStatus != 1) {
                            u7f.LJIILLIIL.LIZIZ(2);
                            LinkUser.Builder builder = new LinkUser.Builder();
                            builder.setRoomId(Long.valueOf(inviteData.getInvitee().getRoomId()));
                            builder.setUserId(Long.valueOf(inviteData.getInvitee().getUserId()));
                            builder.setChannelId(Long.valueOf(linkInviteResult.channelId));
                            builder.setLinkMicId(linkInviteResult.rivalsLinkMicIdStr);
                            u7f.LJJIIJZLJL().LJJJLL(builder.build());
                            u7f.LJJIJLIJ(linkInviteResult.channelId);
                            u7f.LJIIJ = linkInviteResult.linkMicIdStr;
                            u7f.LJJIIZ().LJLJJL = linkInviteResult.channelId;
                            u7f.LJJIIZ().getClass();
                            U7M LJJIIZ = u7f.LJJIIZ();
                            String str = linkInviteResult.rivalsLinkMicIdStr;
                            if (str == null) {
                                str = "";
                            }
                            LJJIIZ.LJLZ = str;
                            java.util.Map<Long, Long> map = u7f.LJJIIZ().LJLILLLLZI;
                            Long valueOf = Long.valueOf(inviteData.getInvitee().getUserId());
                            Long l = linkInviteResult.actionId;
                            if (l == null) {
                                longValue = 0;
                            } else {
                                longValue = l.longValue();
                            }
                            ((HashMap) map).put(valueOf, Long.valueOf(longValue));
                            u7f.LJJIIZ().LJLLILLLL = linkInviteResult.rtcPushStream;
                            u7f.LJJIIZ().LL = false;
                            if (!TextUtils.isEmpty(linkInviteResult.rtcExtInfo)) {
                                U7M LJJIIZ2 = u7f.LJJIIZ();
                                String str2 = linkInviteResult.rtcExtInfo;
                                o.LJIIIIZZ(str2, "it.rtcExtInfo");
                                String LJJJIL = u7f.LJJJIL(str2);
                                if (LJJJIL == null) {
                                    LJJJIL = linkInviteResult.rtcExtInfo;
                                }
                                LJJIIZ2.LLLZ(LJJJIL);
                                if (u7f.LJJI("invite", interfaceC65784Pro.invoke().booleanValue()) && linkInviteResult.rtcJoinChannel && MultiHostPreJoinChannelSetting.INSTANCE.getValue().sendInviteEnable) {
                                    U7U.LJIIZILJ(u7f.LJJIIZI(), u7f, u7f.LJJIIZ().LJLLL, false, u7f.LJJIIZ().LJLLILLLL, false, false, "business_multi_host_invite", null, 180);
                                    u7f.LJJIIZ().LJLLLL = true;
                                    if (MtCoHostRtcReplyMsgSetting.INSTANCE.isEnable()) {
                                        String str3 = linkInviteResult.rivalsLinkMicIdStr;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        u7f.LJJIZ(str3, U9X.LEAVE);
                                    }
                                } else {
                                    u7f.LJJIIZ().LJLLLL = false;
                                }
                            }
                        } else {
                            u7f.LJJIIZ().LL = false;
                            String LJJIJ = U7F.LJJIJ(388);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("invite failed, perceptionStatus == 1, LinkInviteResult: ");
                            LIZ.append(linkInviteResult);
                            C32014ChO.LIZJ(LJJIJ, X1D.LIZIZ(LIZ), null);
                            PerceptionMessage perceptionMessage = linkInviteResult.perceptionMessage;
                            o.LJIIIIZZ(perceptionMessage, "it.perceptionMessage");
                            throw new MultiCoHostViolationException(perceptionMessage);
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.network.response.BaseResponse<com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult, com.bytedance.android.livesdk.comp.api.linkcore.model.CoHostInviteDetailedExtra>");
                }
            }
        }
        if (obj2 != null) {
            this.LJLIL.LJJIIZ().LL = false;
            String LJJIJ2 = U7F.LJJIJ(428);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("invite failed:");
            LIZ2.append(obj2);
            C32014ChO.LIZJ(LJJIJ2, X1D.LIZIZ(LIZ2), null);
        }
        this.LJLIL.LJJIIZ().LL = false;
    }
}
