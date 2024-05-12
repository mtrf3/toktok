package X;

import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorSelfVideoChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.live.liveinteract.multihost.event.MultiLivePermitChannel;
import com.bytedance.android.live.room.GlobalMultiLiveSettingChangeEvent;
import com.bytedance.android.live.room.MultiLiveUIChangeEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkUpdateLayoutSwitchLayoutSuccessSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestCameraRevertFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptPanelFixLayoutEnabledSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSdkMicCountToLayoutIdMap;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestFixedLayoutBtnMappingSwitch;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.TWi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74776TWi {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;

    static {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        MultiGuestFixedLayoutBtnMappingSwitch multiGuestFixedLayoutBtnMappingSwitch = MultiGuestFixedLayoutBtnMappingSwitch.INSTANCE;
        if (multiGuestFixedLayoutBtnMappingSwitch.isOn()) {
            str = LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixGrid3UiBtnLayoutId();
        } else {
            str = "1015";
        }
        LIZ = str;
        if (multiGuestFixedLayoutBtnMappingSwitch.isOn()) {
            str2 = LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixGrid5UiBtnLayoutId();
        } else {
            str2 = "1006";
        }
        LIZIZ = str2;
        if (multiGuestFixedLayoutBtnMappingSwitch.isOn()) {
            str3 = LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixGrid8UiBtnLayoutId();
        } else {
            str3 = "1014";
        }
        LIZJ = str3;
        MultiGuestOptPanelFixLayoutEnabledSetting multiGuestOptPanelFixLayoutEnabledSetting = MultiGuestOptPanelFixLayoutEnabledSetting.INSTANCE;
        if (multiGuestOptPanelFixLayoutEnabledSetting.getValue()) {
            str4 = "1002_A";
        } else if (multiGuestFixedLayoutBtnMappingSwitch.isOn()) {
            str4 = LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixPanel4UiBtnLayoutId();
        } else {
            str4 = "1002";
        }
        LIZLLL = str4;
        if (multiGuestOptPanelFixLayoutEnabledSetting.getValue()) {
            str5 = "1012_A";
        } else if (multiGuestFixedLayoutBtnMappingSwitch.isOn()) {
            str5 = LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixPanel6UiBtnLayoutId();
        } else {
            str5 = "1012";
        }
        LJ = str5;
    }

    public static final String LIZLLL() {
        java.util.Map<String, String> LLFZ;
        java.util.Map<String, String> LLFZ2;
        EnumC74991Tbv LJJ;
        String str = null;
        if (!LiveSdkUpdateLayoutSwitchLayoutSuccessSetting.INSTANCE.isEnable()) {
            MultiLiveAnchorPanelSettings LJI = LJI();
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 == null || (LLFZ2 = R6.LLFZ()) == null) {
                return null;
            }
            if (LJI != null && (LJJ = C86793Y4n.LJJ(LJI)) != null) {
                str = LJJ.getBusinessType();
            }
            return LLFZ2.get(str);
        }
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 == null || (LLFZ = R62.LLFZ()) == null) {
            return null;
        }
        C29556Biq.LIZ().getClass();
        return LLFZ.get(C74983Tbn.LIZLLL().getBusinessType());
    }

    public static final MultiLiveAnchorPanelSettings LJI() {
        MultiGuestDataHolder multiGuestDataHolder;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        Object LIZ2 = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if (!(LIZ2 instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) LIZ2) == null || (multiLiveAnchorPanelSettings = multiGuestDataHolder.LJIIJ) == null) {
            return C74838TYs.LJ().LJJI;
        }
        return multiLiveAnchorPanelSettings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0016, code lost:
    
        if (r3 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJ() {
        /*
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r3 = LJI()
            r2 = 3
            if (r3 == 0) goto L30
            int r0 = r3.allowViewerReq
            if (r0 != r2) goto L2e
            r0 = 1
        Lc:
            r1 = 4
            if (r0 == 0) goto L16
            int r0 = r3.onlyAllowFollowerReq
            if (r0 != r1) goto L18
            java.lang.String r0 = "all_viewers"
        L15:
            return r0
        L16:
            if (r3 == 0) goto L30
        L18:
            int r0 = r3.allowViewerReq
            if (r0 != r2) goto L23
            int r0 = r3.onlyAllowFollowerReq
            if (r0 != r2) goto L23
            java.lang.String r0 = "only_followers"
            goto L15
        L23:
            int r0 = r3.allowViewerReq
            if (r0 != r1) goto L30
            int r0 = r3.onlyAllowFollowerReq
            if (r0 != r1) goto L30
            java.lang.String r0 = "none"
            goto L15
        L2e:
            r0 = 0
            goto Lc
        L30:
            java.lang.String r0 = "error"
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74776TWi.LJ():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJIIL() {
        Integer num;
        Integer num2;
        if (!C74838TYs.LJ().LJIIIZ && (((num = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num.intValue() != 2) && ((num2 = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num2.intValue() != 1))) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILJJIL() {
        MultiLiveAnchorPanelSettings LJI = LJI();
        if (LJI != null && LJI.allowViewerReq == 4 && LJIIL()) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(DataChannel dataChannel) {
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
        if (pk != null) {
            pk.LJIIJJI(EnumC30204BtI.MULTIGUEST, dataChannel, false);
            pk.LJII(dataChannel, EnumC30204BtI.MULTIGUEST);
        }
        if (dataChannel != null) {
            dataChannel.qv0(MultiLiveUIChangeEvent.class, 1);
        }
    }

    public static final void LIZJ(DataChannel dataChannel) {
        Room room;
        C0NB.LJIIIZ("MultiLiveUtil", "enableInteractionUI");
        if (!LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.LINK_MIC) && !C74789TWv.LIZJ()) {
            C0NB.LJIIIZ("FindCrashLog#MultiLiveUtil#enableInteractionUI", "LINK_MIC is not available");
            if (LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
                C75516TkO.LIZ.LIZ(603, "exception in MultiLiveUtil", null);
                return;
            }
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("button = ");
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.MULTIGUEST;
        LIZ2.append(enumC30204BtI);
        C0NB.LJIIIZ("FindCrashLog#MultiLiveUtil#enableInteractionUI", X1D.LIZIZ(LIZ2));
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
        if (!TSQ.LJII) {
            if (pk != null) {
                if (pk.LJIIL(dataChannel, enumC30204BtI) != null && (!C29306Beo.LJJIIJ(r0)) && dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && !C29137Bc5.LIZIZ(room)) {
                    C74824TYe.LJJJJI(room.getOwner().getFollowInfo().getFollowStatus(), "connection_button");
                }
                if (pk != null) {
                    pk.LJIIJJI(enumC30204BtI, dataChannel, false);
                    pk.LJIILLIIL(dataChannel, enumC30204BtI);
                }
            }
            if (dataChannel != null) {
                dataChannel.qv0(MultiLiveUIChangeEvent.class, 2);
                C74777TWj c74777TWj = (C74777TWj) dataChannel.kv0(MultiLivePermitChannel.class);
                if (c74777TWj != null && c74777TWj.LJLIL) {
                    LIZIZ(dataChannel);
                }
            }
        }
    }

    public static final int LJFF(EnumC74991Tbv enumC74991Tbv) {
        if (enumC74991Tbv == null) {
            return 1;
        }
        if (C45804HyK.LJJJIL(enumC74991Tbv)) {
            if (C78886Uxe.LJJJJZI(C8E.LJ()) <= 0) {
                return 1;
            }
            return 3;
        }
        return 2;
    }

    public static final void LJIIIIZZ(DataChannel dataChannel) {
        C74777TWj c74777TWj;
        if (LJIILJJIL()) {
            LJIIJ(dataChannel);
        } else if (dataChannel != null && (c74777TWj = (C74777TWj) dataChannel.kv0(MultiLivePermitChannel.class)) != null && c74777TWj.LJLIL) {
            LIZIZ(dataChannel);
        } else {
            LIZJ(dataChannel);
        }
    }

    public static final void LJIIIZ(DataChannel dataChannel) {
        if (!LJIILL(LJI())) {
            LJIIJ(dataChannel);
        }
    }

    public static final void LJIIJ(DataChannel dataChannel) {
        C0NB.LJIIIZ("MultiLiveUtil", "hideOrEnableInteractionUIWithModeratorCheck");
        if (C74789TWv.LIZJ()) {
            C0NB.LJIIIZ("MultiLiveUtil", "hasMultiGuestV3GuestModeratorWidget -> hideOrEnableInteractionUIWithModeratorCheck");
            LIZJ(dataChannel);
        } else {
            C0NB.LJIIIZ("MultiLiveUtil", "toolbarManager.hide");
            InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
            if (pk != null) {
                pk.LIZ(EnumC30204BtI.MULTIGUEST, dataChannel, false);
            }
        }
        if (dataChannel != null) {
            dataChannel.qv0(MultiLiveUIChangeEvent.class, 3);
        }
    }

    public static final boolean LJIIJJI(Room room) {
        if (room == null) {
            return false;
        }
        if (((int) room.getOwner().getFollowInfo().getFollowStatus()) != 1 && ((int) room.getOwner().getFollowInfo().getFollowStatus()) != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILIIL(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        if (multiLiveAnchorPanelSettings != null && multiLiveAnchorPanelSettings.onlyAllowFollowerReq == 3 && multiLiveAnchorPanelSettings.allowViewerReq == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        if (multiLiveAnchorPanelSettings != null && multiLiveAnchorPanelSettings.allowViewerReq == 3) {
            return true;
        }
        return false;
    }

    public static final void LIZ(DataChannel dataChannel, boolean z) {
        MultiGuestDataHolder multiGuestDataHolder;
        int i;
        TQU LIZLLL2;
        TQU LIZLLL3;
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
        if (!(obj instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) obj) == null) {
            return;
        }
        if (z == multiGuestDataHolder.LJ) {
            C0NB.LIZIZ("MultiLiveUtil", "no need to update, video state is the same");
            return;
        }
        multiGuestDataHolder.LJ = z;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        multiGuestDataHolder.LJII = i;
        MultiGuestCameraRevertFixSetting multiGuestCameraRevertFixSetting = MultiGuestCameraRevertFixSetting.INSTANCE;
        if (!multiGuestCameraRevertFixSetting.isFix() && dataChannel != null) {
            dataChannel.qv0(MultiLiveAnchorMuteVideoEvent.class, new C74632TQu(z, "business_mute_by_play_ad"));
        }
        if (z) {
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LIZLLL3 = R6.LIZLLL()) != null) {
                LIZLLL3.LIZ(Boolean.FALSE, "business_mute_by_play_ad", null);
            }
            UPJ.LJFF(40, C73943T0h.LIZ());
        } else {
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null && (LIZLLL2 = R62.LIZLLL()) != null) {
                LIZLLL2.LIZ(Boolean.TRUE, "business_mute_by_play_ad", null);
            }
            UPJ.LJFF(41, C73943T0h.LIZ());
        }
        if (multiGuestCameraRevertFixSetting.isFix()) {
            if (dataChannel != null) {
                dataChannel.qv0(MultiLiveAnchorMuteVideoEvent.class, new C74632TQu(z, "business_mute_by_play_ad"));
            } else {
                return;
            }
        } else if (dataChannel == null) {
            return;
        }
        dataChannel.pv0(MultiGuestAnchorSelfVideoChangedEvent.class);
    }

    public static final void LJIILLIIL(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, EnumC74990Tbu enumC74990Tbu) {
        MultiGuestDataHolder multiGuestDataHolder;
        String str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        if (dataChannelGlobal.mv0(C29129Bbx.class) != null && EnumC74990Tbu.ACTIVITY_PAGE_OPEN == enumC74990Tbu) {
            C31978Cgo c31978Cgo = (C31978Cgo) dataChannelGlobal.mv0(C29129Bbx.class);
            if (c31978Cgo != null && (str = c31978Cgo.LIZ) != null) {
                switch (str.hashCode()) {
                    case -2111025230:
                        if (str.equals("float_fix") && multiLiveAnchorPanelSettings != null) {
                            multiLiveAnchorPanelSettings.layoutType = 1;
                            multiLiveAnchorPanelSettings.fixMicNumAction = 0;
                            break;
                        }
                        break;
                    case -1039745817:
                        str.equals("normal");
                        break;
                    case 3181382:
                        if (str.equals("grid") && multiLiveAnchorPanelSettings != null) {
                            multiLiveAnchorPanelSettings.layoutType = 0;
                            multiLiveAnchorPanelSettings.fixMicNumAction = 1;
                            break;
                        }
                        break;
                    case 97526364:
                        if (str.equals("float") && multiLiveAnchorPanelSettings != null) {
                            multiLiveAnchorPanelSettings.layoutType = 1;
                            multiLiveAnchorPanelSettings.fixMicNumAction = 1;
                            break;
                        }
                        break;
                    case 318387100:
                        if (str.equals("grid_fix") && multiLiveAnchorPanelSettings != null) {
                            multiLiveAnchorPanelSettings.layoutType = 0;
                            multiLiveAnchorPanelSettings.fixMicNumAction = 0;
                            break;
                        }
                        break;
                }
            }
            Object LIZ2 = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
            if ((LIZ2 instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) LIZ2) != null) {
                multiGuestDataHolder.LJIIJ = multiLiveAnchorPanelSettings;
            }
            C74838TYs.LJ().LJJI = multiLiveAnchorPanelSettings;
            if (multiLiveAnchorPanelSettings != null) {
                dataChannelGlobal.sv0(GlobalMultiLiveSettingChangeEvent.class, new OSZ(multiLiveAnchorPanelSettings, null));
            }
        }
    }

    public static final void LJII(Room room, DataChannel dataChannel, boolean z) {
        if (room == null) {
            return;
        }
        MultiLiveAnchorPanelSettings LJI = LJI();
        if (LJIILL(LJI)) {
            if (LJIILIIL(LJI)) {
                LIZJ(dataChannel);
            }
        } else if (z) {
            LIZJ(dataChannel);
        } else {
            LJIIJ(dataChannel);
        }
    }
}
