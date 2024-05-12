package X;

import Y.AfS3S2101000_13;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowAfterFeedbackEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowWithConfirmAndReviewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowWithReviewEvent;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestRankUSRuleUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGiftRankListAndNotShowCheckboxTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGiftRankSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLeaveGiftRankIsUSRegionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.TUw */
/* loaded from: classes14.dex */
public final class C74738TUw {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZLLL() {
        if (MultiGuestGiftRankListAndNotShowCheckboxTypeSetting.INSTANCE.getValue() == 3 && C74740TUy.LIZLLL().LIZLLL > 0 && MultiGuestGiftRankSwitcherSetting.INSTANCE.isEnable() && !MultiGuestLeaveGiftRankIsUSRegionSetting.INSTANCE.isInUS()) {
            return true;
        }
        return false;
    }

    public static boolean LJ() {
        if ((MultiGuestGiftRankListAndNotShowCheckboxTypeSetting.INSTANCE.getValue() != 1 || C74740TUy.LIZLLL().LIZLLL <= 0 || !MultiGuestGiftRankSwitcherSetting.INSTANCE.isEnable() || MultiGuestLeaveGiftRankIsUSRegionSetting.INSTANCE.isInUS()) && !LJFF() && !LIZLLL()) {
            return false;
        }
        return true;
    }

    public static boolean LJFF() {
        if (MultiGuestGiftRankListAndNotShowCheckboxTypeSetting.INSTANCE.getValue() == 2 && C74740TUy.LIZLLL().LIZLLL > 0 && MultiGuestGiftRankSwitcherSetting.INSTANCE.isEnable() && !MultiGuestLeaveGiftRankIsUSRegionSetting.INSTANCE.isInUS()) {
            return true;
        }
        return false;
    }

    public static String LIZJ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_GiftRankListManager_", LJ, LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ3, "_GiftRankListManager_", i, LIZ3);
    }

    public static void LIZIZ(Context context, DataChannel dataChannel) {
        boolean z;
        int i;
        int i2;
        int i3;
        String str;
        Boolean bool;
        String value = LiveSdkMultiGuestRankUSRuleUrlSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = LiveSdkMultiGuestRankUSRuleUrlSetting.DEFAULT;
        }
        try {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(value), "url");
            if (queryParameter == null) {
                queryParameter = "";
            }
            boolean z2 = true;
            if (!TextUtils.isEmpty(queryParameter)) {
                IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
                int i4 = 0;
                if (iHostAction != null) {
                    z = iHostAction.hostInterceptSpark(value);
                } else {
                    z = false;
                }
                if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCW.class)) == null || (z2 = bool.booleanValue())) {
                    i = 488;
                } else {
                    i = (int) C15380j0.LJIJ(B9K.LIZJ(context));
                }
                int LJIJ = (int) C15380j0.LJIJ(B9K.LIZJ(context));
                if (z) {
                    C29682Bks LIZJ = C29683Bkt.LIZJ(queryParameter);
                    BY3 by3 = BY3.DP;
                    LIZJ.LJIIJ(i, by3);
                    if (!z2) {
                        LJIJ = 375;
                    }
                    LIZJ.LJIL(LJIJ, by3);
                    C29682Bks.LJIJI(LIZJ, 8);
                    if (z2) {
                        str = "bottom";
                    } else if (!CCJ.LIZ(context)) {
                        str = "right";
                    } else {
                        str = "left";
                    }
                    LIZJ.LJIIIZ(str);
                    String uri = LIZJ.LIZ().toString();
                    o.LJIIIIZZ(uri, "SparkPopupSchemaBuilder\n…      .build().toString()");
                    InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
                    o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
                    ((IHybridContainerService) LIZ2).Vs0(context, uri, null);
                    return;
                }
                C30882CAc Lu = ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
                C28870BUs c28870BUs = new C28870BUs(queryParameter);
                c28870BUs.LIZIZ = LJIJ;
                c28870BUs.LIZJ = i;
                if (z2) {
                    i2 = 8;
                } else {
                    i2 = 0;
                    i4 = 8;
                }
                c28870BUs.LIZ(8, i2, i4);
                c28870BUs.LJIIL = !z2;
                if (z2) {
                    i3 = 80;
                } else {
                    i3 = 8388613;
                }
                c28870BUs.LJIIIZ = i3;
                BaseDialogFragment.wl(C29306Beo.LIZ(context), Lu.LIZ(c28870BUs));
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (Exception e) {
            C32014ChO.LIZJ(LIZJ(274), "handleFaqClick parse url failed, so return", e.getMessage());
        }
    }

    public static void LIZ(int i, DataChannel dataChannel, @TQC String disconnectionType, InterfaceC88473Ynt interfaceC88473Ynt) {
        o.LJIIIZ(disconnectionType, "disconnectionType");
        if (LJ()) {
            T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).getGuestSetting()).LJJII(new TQK(i, dataChannel, disconnectionType, interfaceC88473Ynt), new AfS3S2101000_13(interfaceC88473Ynt, disconnectionType, i, 0));
        } else {
            C0NB.LIZIZ("GiftRankListManager", "not in show leave rank exp, so run regular logic");
            interfaceC88473Ynt.invoke(disconnectionType, "leave_normally", Integer.valueOf(i));
        }
    }

    public static void LJI(DataChannel dataChannel, boolean z, @TQC String str, int i) {
        if (LiveLinkmicEnableAudienceDisconnectConclusionPanelEnabledSetting.INSTANCE.isEnabled()) {
            if (z) {
                if (dataChannel != null) {
                    dataChannel.qv0(GuestDisconnectByWindowWithConfirmAndReviewEvent.class, new OSZ(str, Integer.valueOf(i)));
                    return;
                }
                return;
            } else {
                if (dataChannel == null) {
                    return;
                }
                dataChannel.qv0(GuestDisconnectByWindowWithReviewEvent.class, new OSZ(str, Integer.valueOf(i)));
                return;
            }
        }
        if (dataChannel == null) {
            return;
        }
        dataChannel.qv0(GuestDisconnectByWindowAfterFeedbackEvent.class, new OSZ(str, Integer.valueOf(i)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r3 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(java.lang.String r7, int r8, com.bytedance.ies.sdk.datachannel.DataChannel r9, boolean r10, androidx.lifecycle.LifecycleOwner r11) {
        /*
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r2 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r2
            boolean r0 = X.TV3.LIZJ()
            r6 = 0
            if (r0 == 0) goto L51
            X.Tl5 r1 = X.C75559Tl5.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r0 = r1.LIZIZ(r0)
            X.Ce1 r0 = (X.InterfaceC31805Ce1) r0
            if (r0 == 0) goto L3b
            X.TUl r3 = r0.LIZ()
            if (r3 == 0) goto L3b
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r0 = r0.getCurrentUserId()
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = X.C76917UGr.LJJIIZ(r3, r0)
            if (r0 == 0) goto L3b
            java.lang.String r3 = r0.mInteractIdStr
        L39:
            if (r3 != 0) goto L7a
        L3b:
            X.TYs r0 = X.C74838TYs.LJ()
            java.lang.String r3 = r0.LIZLLL()
            if (r3 != 0) goto L7a
            r0 = 172(0xac, float:2.41E-43)
            java.lang.String r1 = LIZJ(r0)
            java.lang.String r0 = "linkMicId is null, so return"
            X.C32014ChO.LIZJ(r1, r0, r6)
            return
        L51:
            X.Tl5 r1 = X.C75559Tl5.LIZIZ
            java.lang.String r0 = "MULTI_GUEST_V3_GUEST_USER_MANAGER"
            java.lang.Object r0 = r1.LIZIZ(r0)
            X.TQ8 r0 = (X.TQ8) r0
            if (r0 == 0) goto L3b
            X.TUl r3 = r0.LIZ()
            if (r3 == 0) goto L3b
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            long r0 = r0.getCurrentUserId()
            com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r0 = X.C76917UGr.LJJIL(r3, r0)
            if (r0 == 0) goto L3b
            java.lang.String r3 = r0.linkMicId
            goto L39
        L7a:
            if (r2 == 0) goto Le1
            X.B83 r0 = X.B83.LIZ()
            X.BgP r0 = r0.LIZIZ()
            X.Bfu r0 = (X.C29374Bfu) r0
            com.bytedance.android.live.base.model.user.User r1 = r0.LJ()
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog.LJLLLL = r1
            com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog.LJLLLLLL = r2
            java.lang.String r0 = "leave_normally"
            com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog.LJLZ = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog.LJZ = r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog.LJZI = r10
            com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog.LJZL = r3
            com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 != 0) goto Ldf
            androidx.lifecycle.LifecycleOwner r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog.LL
        Lab:
            com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog.LL = r0
            com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog r2 = new com.bytedance.android.live.liveinteract.multiguestv3.main.gift.leaverank.MultiGuestGiftLeaveRankDialog
            r2.<init>()
            if (r11 == 0) goto Lbd
            androidx.lifecycle.Lifecycle r0 = r11.getLifecycle()
            if (r0 == 0) goto Lbd
            r0.addObserver(r2)
        Lbd:
            if (r10 != 0) goto Lc9
            r3 = 10
            r4 = 1
            r7 = 0
            r8 = 240(0xf0, float:3.36E-43)
            r5 = r4
            X.C78866UxK.LJIJJ(r2, r3, r4, r5, r6, r7, r8)
        Lc9:
            if (r9 == 0) goto Lde
            java.lang.Class<X.Bhq> r0 = X.C29494Bhq.class
            java.lang.Object r1 = r9.kv0(r0)
            androidx.fragment.app.FragmentManager r1 = (androidx.fragment.app.FragmentManager) r1
            if (r1 == 0) goto Lde
            java.lang.Class<X.TUw> r0 = X.C74738TUw.class
            java.lang.String r0 = r0.getName()
            r2.show(r1, r0)
        Lde:
            return
        Ldf:
            r0 = r11
            goto Lab
        Le1:
            java.lang.String r1 = "GiftRankListManager"
            java.lang.String r0 = "room is null, so return"
            X.C0NB.LIZIZ(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74738TUw.LJII(java.lang.String, int, com.bytedance.ies.sdk.datachannel.DataChannel, boolean, androidx.lifecycle.LifecycleOwner):void");
    }

    public static /* synthetic */ void LJIIIIZZ(String str, int i, DataChannel dataChannel, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        LJII(str, i, dataChannel, z, null);
    }
}
