package X;

import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostRtcPermitMsgSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHostPreJoinChannelSetting;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import webcast.api.linkmic.ApplyResponse;

/* loaded from: classes14.dex */
public final class U7K<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ U7F LJLIL;
    public final /* synthetic */ LinkUser LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ InterfaceC76768UAy<ApplyResult> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLJJL;
    public final /* synthetic */ Long LJLJJLL;

    public U7K(U7F u7f, LinkUser linkUser, Long l, InterfaceC76768UAy<ApplyResult> interfaceC76768UAy, InterfaceC65784Pro<Boolean> interfaceC65784Pro, Long l2) {
        this.LJLIL = u7f;
        this.LJLILLLLZI = linkUser;
        this.LJLJI = l;
        this.LJLJJI = interfaceC76768UAy;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        boolean z;
        BaseResponse baseResponse;
        ApplyResponse.ResponseData responseData;
        long longValue;
        long longValue2;
        UBW ubw = (UBW) obj;
        if (ubw != null) {
            U7F u7f = this.LJLIL;
            LinkUser linkUser = this.LJLILLLLZI;
            Long l = this.LJLJI;
            InterfaceC76768UAy<ApplyResult> interfaceC76768UAy = this.LJLJJI;
            InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJJL;
            Long l2 = this.LJLJJLL;
            Object obj3 = ubw.LIZ;
            if (obj3 != null) {
                z = obj3 instanceof BaseResponse;
            } else {
                z = true;
            }
            if (z && (baseResponse = (BaseResponse) obj3) != null && (responseData = (ApplyResponse.ResponseData) baseResponse.data) != null) {
                if (u7f.LJJIII()) {
                    U4R.LIZLLL("CoLinker", "multiLive is active, callback onFailed");
                    u7f.LJJIIJZLJL().LJJLIIIJJIZ(linkUser);
                    u7f.LJJIIJ(l.longValue());
                    Iterator<U6Y> it = u7f.LJIIZILJ.iterator();
                    while (it.hasNext()) {
                        it.next().LJJJJI(l.longValue());
                    }
                    if (interfaceC76768UAy != null) {
                        interfaceC76768UAy.LIZJ(new LinkCoreError(99880001, "multiLive is active"), null);
                        return;
                    }
                    return;
                }
                if (responseData.perceptionStatus != 1) {
                    LinkUser.Builder builder = new LinkUser.Builder();
                    builder.setRoomId(Long.valueOf(u7f.LJI));
                    builder.setUserId(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
                    builder.setChannelId(responseData.channelId);
                    u7f.LJJIIJZLJL().LJJJJZI(builder.build());
                    LinkUser.Builder builder2 = new LinkUser.Builder();
                    builder2.setRoomId(l2);
                    builder2.setUserId(l);
                    builder2.setChannelId(responseData.channelId);
                    builder2.setLinkMicId(responseData.rivalsLinkMicIdStr);
                    u7f.LJJIIJZLJL().LJJJLIIL(builder2.build());
                    Long l3 = responseData.channelId;
                    long j = 0;
                    if (l3 == null) {
                        longValue = 0;
                    } else {
                        longValue = l3.longValue();
                    }
                    u7f.LJJIJLIJ(longValue);
                    U7M LJJIIZ = u7f.LJJIIZ();
                    Long l4 = responseData.channelId;
                    if (l4 == null) {
                        longValue2 = 0;
                    } else {
                        longValue2 = l4.longValue();
                    }
                    LJJIIZ.LJLJJL = longValue2;
                    java.util.Map<Long, Long> map = u7f.LJJIIZ().LJLILLLLZI;
                    Long l5 = responseData.actionId;
                    if (l5 != null) {
                        j = l5.longValue();
                    }
                    ((HashMap) map).put(l, Long.valueOf(j));
                    u7f.LJIIJ = responseData.linkMicIdStr;
                    u7f.LJJIIZ().getClass();
                    u7f.LJJIIZ().LJLZ = responseData.rivalsLinkMicIdStr;
                    if (!TextUtils.isEmpty(responseData.rtcExtInfo)) {
                        U7M LJJIIZ2 = u7f.LJJIIZ();
                        String str = responseData.rtcExtInfo;
                        o.LJIIIIZZ(str, "it.rtcExtInfo");
                        String LJJJIL = u7f.LJJJIL(str);
                        if (LJJJIL == null) {
                            LJJJIL = responseData.rtcExtInfo;
                        }
                        LJJIIZ2.LLLZ(LJJJIL);
                        if (u7f.LJJI("apply", interfaceC65784Pro.invoke().booleanValue()) && MultiHostPreJoinChannelSetting.INSTANCE.getValue().sendApplyEnable) {
                            U7U.LJIIZILJ(u7f.LJJIIZI(), u7f, u7f.LJJIIZ().LJLLL, false, false, true, true, "business_multi_host_apply", null, 132);
                            u7f.LJJIIZ().LJLLLLLL = true;
                            if (MtCoHostRtcPermitMsgSetting.INSTANCE.isEnable()) {
                                String str2 = responseData.rivalsLinkMicIdStr;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                u7f.LJJIZ(str2, U9X.LEAVE);
                                return;
                            }
                            return;
                        }
                        u7f.LJJIIZ().LJLLLLLL = false;
                        return;
                    }
                    return;
                }
                u7f.LJJIIZ().LL = false;
                String LJJIJ = U7F.LJJIJ(798);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("apply failed, perceptionStatus == 1, ApplyResponse.ResponseData: ");
                LIZ.append(responseData);
                C32014ChO.LIZJ(LJJIJ, X1D.LIZIZ(LIZ), null);
                PerceptionMessage perceptionMessage = responseData.perceptionMessage;
                o.LJIIIIZZ(perceptionMessage, "it.perceptionMessage");
                throw new MultiCoHostViolationException(perceptionMessage);
            }
        }
    }
}
