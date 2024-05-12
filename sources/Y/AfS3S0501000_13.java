package Y;

import X.C09650Zl;
import X.C74764TVw;
import X.C74765TVx;
import X.C74766TVy;
import X.C74768TWa;
import X.C74769TWb;
import X.C74770TWc;
import X.C74776TWi;
import X.InterfaceC64592gB;
import X.InterfaceC74596TPk;
import X.InterfaceC74617TQf;
import X.InterfaceC76622U5i;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.TSX;
import X.TV2;
import X.TYP;
import X.TYQ;
import X.U7T;
import X.U7V;
import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.ReplyBizContent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.model.CheckPermissionSucc;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS3S0501000_13 implements InterfaceC64592gB {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return;
        }
    }

    public static final void accept$0(AfS3S0501000_13 afS3S0501000_13, Object obj) {
        Long l;
        String str;
        Long l2;
        String str2;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo2;
        MultiGuestPermissionInfo multiGuestPermissionInfo3;
        MultiGuestPermissionInfo multiGuestPermissionInfo4;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData;
        long j;
        Long l3;
        Long l4;
        BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkIn_Guest_Permission, response:");
        LIZ.append(GsonProtectorUtils.toJson(C09650Zl.LIZIZ, response));
        TYP.LIZJ("GameLinkPermissionManager", X1D.LIZIZ(LIZ));
        C74768TWa.LIZ = false;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData2 = response.data;
        Long l5 = null;
        if (audienceMultiGuestPermissionResponseData2 != null && audienceMultiGuestPermissionResponseData2.L()) {
            MultiGuestPermissionInfo multiGuestPermissionInfo5 = response.data.permissionInfo;
            if (multiGuestPermissionInfo5 != null) {
                l4 = multiGuestPermissionInfo5.linkPermissionType;
            } else {
                l4 = null;
            }
            C74768TWa.LJ(l4);
        } else {
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData3 = response.data;
            if (audienceMultiGuestPermissionResponseData3 != null && (multiGuestPermissionInfo4 = audienceMultiGuestPermissionResponseData3.permissionInfo) != null) {
                l = Long.valueOf(multiGuestPermissionInfo4.errCode);
            } else {
                l = null;
            }
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData4 = response.data;
            if (audienceMultiGuestPermissionResponseData4 != null && (multiGuestPermissionInfo3 = audienceMultiGuestPermissionResponseData4.permissionInfo) != null) {
                str = multiGuestPermissionInfo3.noPermissionPrompt;
            } else {
                str = null;
            }
            C74768TWa.LJFF(l, str);
            TSX tsx = (TSX) afS3S0501000_13.l1;
            if (tsx != null) {
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData5 = response.data;
                if (audienceMultiGuestPermissionResponseData5 != null && (multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData5.permissionInfo) != null) {
                    l2 = Long.valueOf(multiGuestPermissionInfo2.errCode);
                } else {
                    l2 = null;
                }
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData6 = response.data;
                if (audienceMultiGuestPermissionResponseData6 != null && (multiGuestPermissionInfo = audienceMultiGuestPermissionResponseData6.permissionInfo) != null) {
                    str2 = multiGuestPermissionInfo.noPermissionPrompt;
                } else {
                    str2 = null;
                }
                tsx.onCheckPermissionFailedV3(new C74764TVw(afS3S0501000_13.i5, str2, l2));
            }
        }
        int i = afS3S0501000_13.i5;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || (audienceMultiGuestPermissionResponseData = response.data) == null || !audienceMultiGuestPermissionResponseData.L()) {
                    return;
                }
                C74768TWa.LIZJ = response;
                C74768TWa.LIZIZ = true;
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS3S0501000_13.l2;
                if (interfaceC88472Yns != null) {
                    MultiGuestPermissionInfo multiGuestPermissionInfo6 = response.data.permissionInfo;
                    if (multiGuestPermissionInfo6 != null && (l3 = multiGuestPermissionInfo6.linkPermissionType) != null) {
                        j = l3.longValue();
                    } else {
                        j = 0;
                    }
                    interfaceC88472Yns.invoke(Long.valueOf(j));
                }
                DataChannel dataChannel = (DataChannel) afS3S0501000_13.l0;
                if (dataChannel == null) {
                    return;
                }
                dataChannel.pv0(CheckPermissionSucc.class);
                return;
            }
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData7 = response.data;
            if (audienceMultiGuestPermissionResponseData7 == null || !audienceMultiGuestPermissionResponseData7.L()) {
                return;
            }
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) afS3S0501000_13.l4;
            if (interfaceC88471Ynr != null) {
                MultiGuestPermissionInfo multiGuestPermissionInfo7 = response.data.permissionInfo;
                if (multiGuestPermissionInfo7 != null) {
                    l5 = multiGuestPermissionInfo7.linkPermissionType;
                }
                interfaceC88471Ynr.invoke(l5, Integer.valueOf(afS3S0501000_13.i5));
            }
            DataChannel dataChannel2 = (DataChannel) afS3S0501000_13.l0;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.pv0(CheckPermissionSucc.class);
            return;
        }
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData8 = response.data;
        if (audienceMultiGuestPermissionResponseData8 == null || !audienceMultiGuestPermissionResponseData8.L()) {
            return;
        }
        InterfaceC88471Ynr interfaceC88471Ynr2 = (InterfaceC88471Ynr) afS3S0501000_13.l3;
        if (interfaceC88471Ynr2 != null) {
            MultiGuestPermissionInfo multiGuestPermissionInfo8 = response.data.permissionInfo;
            if (multiGuestPermissionInfo8 != null) {
                l5 = multiGuestPermissionInfo8.linkPermissionType;
            }
            interfaceC88471Ynr2.invoke(l5, Integer.valueOf(afS3S0501000_13.i5));
        }
        TV2.LIZLLL((DataChannel) afS3S0501000_13.l0);
        DataChannel dataChannel3 = (DataChannel) afS3S0501000_13.l0;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.pv0(CheckPermissionSucc.class);
    }

    public static final void accept$1(AfS3S0501000_13 afS3S0501000_13, Object obj) {
        Long l;
        String str;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo2;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData;
        long j;
        Long l2;
        Long l3;
        BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("response:");
        LIZ.append(GsonProtectorUtils.toJson(C09650Zl.LIZIZ, response));
        TYQ.LIZLLL("LinkIn_Guest_Permission_Success", X1D.LIZIZ(LIZ));
        C74770TWc.LIZ = false;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData2 = response.data;
        Long l4 = null;
        if (audienceMultiGuestPermissionResponseData2 != null && audienceMultiGuestPermissionResponseData2.L()) {
            MultiGuestPermissionInfo multiGuestPermissionInfo3 = response.data.permissionInfo;
            if (multiGuestPermissionInfo3 != null) {
                l3 = multiGuestPermissionInfo3.linkPermissionType;
            } else {
                l3 = null;
            }
            C74770TWc.LJ(l3);
        } else {
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData3 = response.data;
            o.LJIIIIZZ(audienceMultiGuestPermissionResponseData3, "response.data");
            C74770TWc.LJFF(audienceMultiGuestPermissionResponseData3);
            InterfaceC74617TQf interfaceC74617TQf = (InterfaceC74617TQf) afS3S0501000_13.l1;
            if (interfaceC74617TQf != null) {
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData4 = response.data;
                if (audienceMultiGuestPermissionResponseData4 != null && (multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData4.permissionInfo) != null) {
                    l = Long.valueOf(multiGuestPermissionInfo2.errCode);
                } else {
                    l = null;
                }
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData5 = response.data;
                if (audienceMultiGuestPermissionResponseData5 != null && (multiGuestPermissionInfo = audienceMultiGuestPermissionResponseData5.permissionInfo) != null) {
                    str = multiGuestPermissionInfo.noPermissionPrompt;
                } else {
                    str = null;
                }
                interfaceC74617TQf.Tp(new C74765TVx(afS3S0501000_13.i5, str, l));
            }
        }
        int i = afS3S0501000_13.i5;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || (audienceMultiGuestPermissionResponseData = response.data) == null || !audienceMultiGuestPermissionResponseData.L()) {
                    return;
                }
                C74770TWc.LIZJ = response;
                C74770TWc.LIZIZ = true;
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS3S0501000_13.l2;
                if (interfaceC88472Yns != null) {
                    MultiGuestPermissionInfo multiGuestPermissionInfo4 = response.data.permissionInfo;
                    if (multiGuestPermissionInfo4 != null && (l2 = multiGuestPermissionInfo4.linkPermissionType) != null) {
                        j = l2.longValue();
                    } else {
                        j = 0;
                    }
                    interfaceC88472Yns.invoke(Long.valueOf(j));
                }
                DataChannel dataChannel = (DataChannel) afS3S0501000_13.l0;
                if (dataChannel == null) {
                    return;
                }
                dataChannel.pv0(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc.class);
                return;
            }
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData6 = response.data;
            if (audienceMultiGuestPermissionResponseData6 == null || !audienceMultiGuestPermissionResponseData6.L()) {
                return;
            }
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) afS3S0501000_13.l4;
            if (interfaceC88471Ynr != null) {
                MultiGuestPermissionInfo multiGuestPermissionInfo5 = response.data.permissionInfo;
                if (multiGuestPermissionInfo5 != null) {
                    l4 = multiGuestPermissionInfo5.linkPermissionType;
                }
                interfaceC88471Ynr.invoke(l4, Integer.valueOf(afS3S0501000_13.i5));
            }
            DataChannel dataChannel2 = (DataChannel) afS3S0501000_13.l0;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.pv0(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc.class);
            return;
        }
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData7 = response.data;
        if (audienceMultiGuestPermissionResponseData7 == null || !audienceMultiGuestPermissionResponseData7.L()) {
            return;
        }
        InterfaceC88471Ynr interfaceC88471Ynr2 = (InterfaceC88471Ynr) afS3S0501000_13.l3;
        if (interfaceC88471Ynr2 != null) {
            MultiGuestPermissionInfo multiGuestPermissionInfo6 = response.data.permissionInfo;
            if (multiGuestPermissionInfo6 != null) {
                l4 = multiGuestPermissionInfo6.linkPermissionType;
            }
            interfaceC88471Ynr2.invoke(l4, Integer.valueOf(afS3S0501000_13.i5));
        }
        C74776TWi.LIZJ((DataChannel) afS3S0501000_13.l0);
        DataChannel dataChannel3 = (DataChannel) afS3S0501000_13.l0;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.pv0(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc.class);
    }

    public static final void accept$2(AfS3S0501000_13 afS3S0501000_13, Object obj) {
        MultiLiveContent multiLiveContent;
        ReplyBizContent replyBizContent;
        U7T u7t = (U7T) afS3S0501000_13.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t.LJII;
        LinkUser linkUser = (LinkUser) afS3S0501000_13.l1;
        int i = afS3S0501000_13.i5;
        OnLineMicInfo onLineMicInfo = (OnLineMicInfo) afS3S0501000_13.l2;
        LinkLayerMessage linkLayerMessage = (LinkLayerMessage) afS3S0501000_13.l3;
        LinkUser linkUser2 = (LinkUser) afS3S0501000_13.l4;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            InterfaceC76622U5i next = it.next();
            User user = null;
            CustomLinkMessage LJIILL = U7V.LJIILL(linkLayerMessage, null);
            BusinessContent businessContent = linkLayerMessage.bizContent;
            if (businessContent != null && (multiLiveContent = businessContent.multiLiveContent) != null && (replyBizContent = multiLiveContent.replyIMContent) != null) {
                user = replyBizContent.replyUserInfo;
            }
            next.LJJLJ(u7t, new ReplyInviteMessage(linkUser, i, onLineMicInfo, LJIILL, user, linkUser2));
        }
    }

    public static final void accept$3(AfS3S0501000_13 afS3S0501000_13, Object obj) {
        Long l;
        String str;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo2;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData;
        long j;
        Long l2;
        Long l3;
        BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("response:");
        LIZ.append(GsonProtectorUtils.toJson(C09650Zl.LIZIZ, response));
        TYQ.LIZLLL("LinkIn_Guest_Permission_Success", X1D.LIZIZ(LIZ));
        C74769TWb.LIZ = false;
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData2 = response.data;
        Long l4 = null;
        if (audienceMultiGuestPermissionResponseData2 != null && audienceMultiGuestPermissionResponseData2.L()) {
            MultiGuestPermissionInfo multiGuestPermissionInfo3 = response.data.permissionInfo;
            if (multiGuestPermissionInfo3 != null) {
                l3 = multiGuestPermissionInfo3.linkPermissionType;
            } else {
                l3 = null;
            }
            C74769TWb.LJII(l3);
        } else {
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData3 = response.data;
            o.LJIIIIZZ(audienceMultiGuestPermissionResponseData3, "response.data");
            C74769TWb.LJIIIIZZ(audienceMultiGuestPermissionResponseData3);
            InterfaceC74596TPk interfaceC74596TPk = (InterfaceC74596TPk) afS3S0501000_13.l1;
            if (interfaceC74596TPk != null) {
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData4 = response.data;
                if (audienceMultiGuestPermissionResponseData4 != null && (multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData4.permissionInfo) != null) {
                    l = Long.valueOf(multiGuestPermissionInfo2.errCode);
                } else {
                    l = null;
                }
                AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData5 = response.data;
                if (audienceMultiGuestPermissionResponseData5 != null && (multiGuestPermissionInfo = audienceMultiGuestPermissionResponseData5.permissionInfo) != null) {
                    str = multiGuestPermissionInfo.noPermissionPrompt;
                } else {
                    str = null;
                }
                interfaceC74596TPk.onCheckPermissionFailedV3(new C74766TVy(afS3S0501000_13.i5, str, l));
            }
        }
        int i = afS3S0501000_13.i5;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || (audienceMultiGuestPermissionResponseData = response.data) == null || !audienceMultiGuestPermissionResponseData.L()) {
                    return;
                }
                C74769TWb.LIZJ = response;
                C74769TWb.LIZIZ = true;
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS3S0501000_13.l2;
                if (interfaceC88472Yns != null) {
                    MultiGuestPermissionInfo multiGuestPermissionInfo4 = response.data.permissionInfo;
                    if (multiGuestPermissionInfo4 != null && (l2 = multiGuestPermissionInfo4.linkPermissionType) != null) {
                        j = l2.longValue();
                    } else {
                        j = 0;
                    }
                    interfaceC88472Yns.invoke(Long.valueOf(j));
                }
                DataChannel dataChannel = (DataChannel) afS3S0501000_13.l0;
                if (dataChannel == null) {
                    return;
                }
                dataChannel.pv0(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc.class);
                return;
            }
            AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData6 = response.data;
            if (audienceMultiGuestPermissionResponseData6 == null || !audienceMultiGuestPermissionResponseData6.L()) {
                return;
            }
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) afS3S0501000_13.l4;
            if (interfaceC88471Ynr != null) {
                MultiGuestPermissionInfo multiGuestPermissionInfo5 = response.data.permissionInfo;
                if (multiGuestPermissionInfo5 != null) {
                    l4 = multiGuestPermissionInfo5.linkPermissionType;
                }
                interfaceC88471Ynr.invoke(l4, Integer.valueOf(afS3S0501000_13.i5));
            }
            DataChannel dataChannel2 = (DataChannel) afS3S0501000_13.l0;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.pv0(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc.class);
            return;
        }
        AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData7 = response.data;
        if (audienceMultiGuestPermissionResponseData7 == null || !audienceMultiGuestPermissionResponseData7.L()) {
            return;
        }
        InterfaceC88471Ynr interfaceC88471Ynr2 = (InterfaceC88471Ynr) afS3S0501000_13.l3;
        if (interfaceC88471Ynr2 != null) {
            MultiGuestPermissionInfo multiGuestPermissionInfo6 = response.data.permissionInfo;
            if (multiGuestPermissionInfo6 != null) {
                l4 = multiGuestPermissionInfo6.linkPermissionType;
            }
            interfaceC88471Ynr2.invoke(l4, Integer.valueOf(afS3S0501000_13.i5));
        }
        C74776TWi.LIZJ((DataChannel) afS3S0501000_13.l0);
        DataChannel dataChannel3 = (DataChannel) afS3S0501000_13.l0;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.pv0(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.CheckPermissionSucc.class);
    }

    public AfS3S0501000_13(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i5 = i;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
