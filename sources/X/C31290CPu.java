package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import webcast.data.MsgFilter;

/* renamed from: X.CPu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31290CPu extends CQO<GiftMessage> implements InterfaceC31379CTf, InterfaceC31380CTg {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d59;
    }

    @Override // X.CQL
    public final boolean LJLJJI() {
        return true;
    }

    @Override // X.CQL
    public final boolean LJLJL() {
        return true;
    }

    @Override // X.CQL
    public final boolean LJLJLLL() {
        return true;
    }

    @Override // X.CQL
    public final boolean LJZ() {
        return true;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJIIIIZZ() {
        if (this.LIZJ || !LJLJJL() || LJJJJ()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31380CTg
    public final MsgFilter LJIIJ() {
        return ((GiftMessage) this.LJIJJLI).msgFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    @Override // X.CQL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJLLLL() {
        /*
            r7 = this;
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMatchPointsSetting r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMatchPointsSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayMatchPointsSetting$GiftTrayMatchPointsConfig r0 = r0.getValue()
            boolean r0 = r0.matchPointLabelEnabled
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L19
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto Ld7
            MESSAGE extends X.CR6 r1 = r7.LJIJJLI
            r0 = r1
            com.bytedance.android.livesdk.model.message.GiftMessage r0 = (com.bytedance.android.livesdk.model.message.GiftMessage) r0
            com.bytedance.android.livesdk.model.Gift r0 = r0.mGift
            int r3 = r0.diamondCount
            goto L40
        L19:
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.0Mx r3 = X.CN1.LIZ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r3 = (com.bytedance.android.live.liveinteract.api.IInteractService) r3
            boolean r2 = r7.LJLJJL()
            java.lang.String r1 = r3.getConnectionType()
            java.lang.String r0 = "manual_pk"
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L3e
            boolean r0 = r3.Qe0()
            if (r0 == 0) goto L3e
            r0 = 1
        L38:
            if (r2 == 0) goto Lc
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        L3e:
            r0 = 0
            goto L38
        L40:
            com.bytedance.android.livesdk.model.message.GiftMessage r1 = (com.bytedance.android.livesdk.model.message.GiftMessage) r1     // Catch: java.lang.Exception -> Ld2
            com.bytedance.android.livesdk.model.message.common.Text r0 = r1.displayTextForAnchor     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto Ld7
            java.lang.String r4 = r0.key     // Catch: java.lang.Exception -> Ld2
            if (r4 == 0) goto Ld7
            int r0 = r4.hashCode()     // Catch: java.lang.Exception -> Ld2
            r2 = 3
            r1 = 2
            switch(r0) {
                case -499020732: goto L71;
                case -228363841: goto L67;
                case 742911439: goto L5d;
                case 1411694111: goto L54;
                default: goto L53;
            }     // Catch: java.lang.Exception -> Ld2
        L53:
            goto L7a
        L54:
            java.lang.String r0 = "pm_mt_giftTray_comment_otherGift_msg"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto L7a
            goto L7d
        L5d:
            java.lang.String r0 = "pm_mt_giftTray_comment_travelGift_msg"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto L7a
            r6 = 2
            goto L7d
        L67:
            java.lang.String r0 = "pm_mt_giftTray_comment_firstGift_msg"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto L7a
            r6 = 1
            goto L7d
        L71:
            java.lang.String r0 = "pm_mt_giftTray_comment_travelGiftMore_msg"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> Ld2
            if (r0 == 0) goto L7a
            goto L7c
        L7a:
            r6 = -1
            goto L7d
        L7c:
            r6 = 3
        L7d:
            if (r6 == 0) goto Lc0
            if (r6 == r5) goto Lae
            if (r6 == r1) goto L9c
            if (r6 == r2) goto L8a
            java.lang.CharSequence r0 = super.LJLLLL()     // Catch: java.lang.Exception -> Ld2
            return r0
        L8a:
            r0 = 2131689933(0x7f0f01cd, float:1.9008895E38)
            java.lang.String r1 = X.C15380j0.LJII(r0, r3)     // Catch: java.lang.Exception -> Ld2
            MESSAGE extends X.CR6 r0 = r7.LJIJJLI     // Catch: java.lang.Exception -> Ld2
            com.bytedance.android.livesdk.model.message.GiftMessage r0 = (com.bytedance.android.livesdk.model.message.GiftMessage) r0     // Catch: java.lang.Exception -> Ld2
            com.bytedance.android.livesdk.model.message.common.Text r0 = r0.displayTextForAnchor     // Catch: java.lang.Exception -> Ld2
            android.text.Spannable r0 = X.CXJ.LJI(r1, r0, r7)     // Catch: java.lang.Exception -> Ld2
            return r0
        L9c:
            r0 = 2131689934(0x7f0f01ce, float:1.9008897E38)
            java.lang.String r1 = X.C15380j0.LJII(r0, r3)     // Catch: java.lang.Exception -> Ld2
            MESSAGE extends X.CR6 r0 = r7.LJIJJLI     // Catch: java.lang.Exception -> Ld2
            com.bytedance.android.livesdk.model.message.GiftMessage r0 = (com.bytedance.android.livesdk.model.message.GiftMessage) r0     // Catch: java.lang.Exception -> Ld2
            com.bytedance.android.livesdk.model.message.common.Text r0 = r0.displayTextForAnchor     // Catch: java.lang.Exception -> Ld2
            android.text.Spannable r0 = X.CXJ.LJI(r1, r0, r7)     // Catch: java.lang.Exception -> Ld2
            return r0
        Lae:
            r0 = 2131689931(0x7f0f01cb, float:1.9008891E38)
            java.lang.String r1 = X.C15380j0.LJII(r0, r3)     // Catch: java.lang.Exception -> Ld2
            MESSAGE extends X.CR6 r0 = r7.LJIJJLI     // Catch: java.lang.Exception -> Ld2
            com.bytedance.android.livesdk.model.message.GiftMessage r0 = (com.bytedance.android.livesdk.model.message.GiftMessage) r0     // Catch: java.lang.Exception -> Ld2
            com.bytedance.android.livesdk.model.message.common.Text r0 = r0.displayTextForAnchor     // Catch: java.lang.Exception -> Ld2
            android.text.Spannable r0 = X.CXJ.LJI(r1, r0, r7)     // Catch: java.lang.Exception -> Ld2
            return r0
        Lc0:
            r0 = 2131689932(0x7f0f01cc, float:1.9008893E38)
            java.lang.String r1 = X.C15380j0.LJII(r0, r3)     // Catch: java.lang.Exception -> Ld2
            MESSAGE extends X.CR6 r0 = r7.LJIJJLI     // Catch: java.lang.Exception -> Ld2
            com.bytedance.android.livesdk.model.message.GiftMessage r0 = (com.bytedance.android.livesdk.model.message.GiftMessage) r0     // Catch: java.lang.Exception -> Ld2
            com.bytedance.android.livesdk.model.message.common.Text r0 = r0.displayTextForAnchor     // Catch: java.lang.Exception -> Ld2
            android.text.Spannable r0 = X.CXJ.LJI(r1, r0, r7)     // Catch: java.lang.Exception -> Ld2
            return r0
        Ld2:
            java.lang.CharSequence r0 = super.LJLLLL()
            return r0
        Ld7:
            java.lang.CharSequence r0 = super.LJLLLL()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31290CPu.LJLLLL():java.lang.CharSequence");
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((GiftMessage) this.LJIJJLI).fromUser;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    @Override // X.CQL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJJZZIII() {
        /*
            r5 = this;
            com.bytedance.android.live.base.model.user.User r0 = r5.getUser()     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L3c
            com.bytedance.android.live.base.model.user.User r0 = r5.getUser()     // Catch: java.lang.Exception -> L3f
            java.lang.CharSequence r3 = r5.LJJJLZIJ(r0)     // Catch: java.lang.Exception -> L3f
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L3f
            r3.toString()     // Catch: java.lang.Exception -> L3f
        L13:
            MESSAGE extends X.CR6 r0 = r5.LJIJJLI     // Catch: java.lang.Exception -> L3f
            com.bytedance.android.livesdk.model.message.GiftMessage r0 = (com.bytedance.android.livesdk.model.message.GiftMessage) r0     // Catch: java.lang.Exception -> L3f
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r0.baseMessage     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = r0.describe     // Catch: java.lang.Exception -> L3f
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L3f
            r1.append(r3)     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = ":"
            r1.append(r0)     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L3f
            boolean r0 = r2.startsWith(r0)     // Catch: java.lang.Exception -> L3f
            if (r0 == 0) goto L43
            int r0 = r3.length()     // Catch: java.lang.Exception -> L3f
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)     // Catch: java.lang.Exception -> L3f
            goto L44
        L3c:
            java.lang.String r3 = ""
            goto L13
        L3f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L43:
            r2 = 0
        L44:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L50
            MESSAGE extends X.CR6 r0 = r5.LJIJJLI
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r0.baseMessage
            java.lang.String r2 = r0.describe
        L50:
            java.lang.Class<com.bytedance.android.live.publicscreen.api.IPublicScreenService> r0 = com.bytedance.android.live.publicscreen.api.IPublicScreenService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.publicscreen.api.IPublicScreenService r0 = (com.bytedance.android.live.publicscreen.api.IPublicScreenService) r0
            X.UxB r0 = r0.m90()
            if (r0 != 0) goto L73
            r3 = 0
        L5f:
            if (r0 != 0) goto L6f
            r4 = 0
        L62:
            MESSAGE extends X.CR6 r0 = r5.LJIJJLI
            com.bytedance.android.livesdk.model.message.GiftMessage r0 = (com.bytedance.android.livesdk.model.message.GiftMessage) r0
            com.bytedance.android.live.base.model.user.User r0 = r0.fromUser
            java.lang.String r1 = "："
            android.text.Spannable r0 = X.CPR.LIZJ(r0, r1, r2, r3, r4, r5)
            return r0
        L6f:
            r4 = 2131100909(0x7f0604ed, float:1.7814213E38)
            goto L62
        L73:
            r3 = 2131101025(0x7f060561, float:1.7814448E38)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31290CPu.LJJZZIII():java.lang.CharSequence");
    }

    @Override // X.CQL
    public final boolean LJZI() {
        return !LJLJJL();
    }

    public C31290CPu(GiftMessage giftMessage) {
        super(giftMessage);
    }

    @Override // X.CQL, X.InterfaceC31341CRt
    public final void LJIILLIIL(CQQ cqq) {
        DataChannel dataChannel;
        Room room;
        super.LJIILLIIL(cqq);
        ISubscribeService iSubscribeService = (ISubscribeService) CN1.LIZ(ISubscribeService.class);
        if (((IGiftService) CN1.LIZ(IGiftService.class)).isSubscriptionGift(((GiftMessage) this.LJIJJLI).giftId) && (dataChannel = cqq.LJIIIIZZ) != null && (room = cqq.LJI) != null) {
            iSubscribeService.CF(cqq.LIZ, room, dataChannel);
        }
    }

    @Override // X.InterfaceC31379CTf
    public final void LJIJJ(InterfaceC31293CPx interfaceC31293CPx) {
        Text text;
        CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
        if (commonMessageData == null || (text = commonMessageData.displayText) == null) {
            return;
        }
        String str = text.defaultPattern;
        if ((text.key == null || C86881Y7x.LIZIZ().LIZ(text.key) == null) && str == null) {
            return;
        }
        for (TextPiece textPiece : text.pieces) {
            if (textPiece.type == CXI.GIFT.getPieceType() && textPiece.giftValue != null) {
                Gift gift = ((GiftMessage) this.LJIJJLI).mGift;
                if (gift == null) {
                    return;
                }
                ImageModel imageModel = gift.image;
                List<GiftColorInfo> list = gift.colorInfos;
                if (list != null) {
                    Iterator<GiftColorInfo> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        GiftColorInfo next = it.next();
                        if (next.colorId.longValue() == textPiece.giftValue.colorId) {
                            ImageModel imageModel2 = next.giftImage;
                            if (imageModel2 != null) {
                                imageModel = imageModel2;
                            }
                        }
                    }
                }
                ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(imageModel, new C31292CPw(this, interfaceC31293CPx));
            }
        }
    }

    @Override // X.CQL, X.CXK
    public final CharSequence LJJJLZIJ(User user) {
        int i;
        String LIZ = C05170If.LIZ(user);
        if (this.LJI && (i = this.LJIIIIZZ) > 0) {
            return C78840Uwu.LJJIJLIJ(i, LIZ);
        }
        return LIZ;
    }

    @Override // X.CQL
    public final void LJJZZI(UserProfileEvent userProfileEvent) {
        CQQ cqq = this.LJIIJJI;
        if (cqq != null && cqq.LJIJ == CRY.ExtendedGift) {
            userProfileEvent.mEventPage = "live_gift_record";
        }
    }

    @Override // X.CQL
    public final void LJLZ(User user) {
        C29775BmN.LIZIZ(user);
    }

    @Override // X.CQL
    public final void LJLLLLLL(int i, User user) {
        C29775BmN.LIZ(i, user);
    }
}
