package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.CppUnlockGuideDialog;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.CppUnlockGuideDialogV2;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BCD {
    public static final /* synthetic */ int LIZ = 0;

    public static /* synthetic */ EnumC12540eQ LIZIZ(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        return LIZ(null, interfaceC88472Yns, interfaceC88472Yns2, null, null, Boolean.TRUE);
    }

    public static EnumC12540eQ LIZJ(DataChannel dataChannel, InterfaceC88472Yns extractServerResponse, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(extractServerResponse, "extractServerResponse");
        Boolean bool = null;
        if (dataChannel == null || dataChannel.kv0(LiveModeChannel.class) == null) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(EnumC12540eQ.ON);
            }
            return EnumC12540eQ.ON;
        }
        Room LJIILL = C1DH.LJIILL(dataChannel);
        if (LJIILL != null && LJIILL.cppVersion == 1) {
            LiveMode liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class);
            if (liveMode != null) {
                bool = Boolean.valueOf(liveMode.isUsingCamera);
            }
            if (C29306Beo.LJIILLIIL(bool) || dataChannel.kv0(LiveModeChannel.class) == LiveMode.LIVE_VOICE) {
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(EnumC12540eQ.ON);
                }
                return EnumC12540eQ.ON;
            }
        }
        Room LJIILL2 = C1DH.LJIILL(dataChannel);
        if (LJIILL2 != null && LJIILL2.cppVersion == 2 && (dataChannel.kv0(LiveModeChannel.class) == LiveMode.LIVE_VOICE || dataChannel.kv0(LiveModeChannel.class) == LiveMode.THIRD_PARTY || dataChannel.kv0(LiveModeChannel.class) == LiveMode.LIVE_STUDIO)) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(EnumC12540eQ.ON);
            }
            return EnumC12540eQ.ON;
        }
        Object mv0 = DataChannelGlobal.LJLJJI.mv0(C29037BaT.class);
        if (mv0 != null) {
            EnumC12540eQ enumC12540eQ = (EnumC12540eQ) extractServerResponse.invoke(mv0);
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(enumC12540eQ);
                return enumC12540eQ;
            }
            return enumC12540eQ;
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(EnumC12540eQ.ON);
        }
        return EnumC12540eQ.ON;
    }

    public static final EnumC12540eQ LIZ(DataChannel dataChannel, InterfaceC88472Yns<? super AnchorLevelPermission, ? extends EnumC12540eQ> extractServerResponse, InterfaceC88472Yns<? super EnumC12540eQ, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super BZI, BZI> interfaceC88472Yns2, String str, Boolean bool) {
        EnumC12540eQ enumC12540eQ;
        boolean z;
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        o.LJIIIZ(extractServerResponse, "extractServerResponse");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || (roomAuthStatus = room.mRoomAuthStatus) == null || (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) == null) {
            enumC12540eQ = EnumC12540eQ.ON;
        } else {
            enumC12540eQ = extractServerResponse.invoke(anchorLevelPermission);
        }
        if (enumC12540eQ == EnumC12540eQ.OFF) {
            Room LJIILL = C1DH.LJIILL(dataChannel);
            if (LJIILL != null && LJIILL.cppVersion == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z && !o.LJ(str, C15380j0.LJIILJJIL(R.string.k1g)) && !o.LJ(str, C15380j0.LJIILJJIL(R.string.k0w))) {
                if (dataChannel != null && (fragmentManager2 = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
                    CppUnlockGuideDialogV2 cppUnlockGuideDialogV2 = new CppUnlockGuideDialogV2();
                    if (str != null) {
                        cppUnlockGuideDialogV2.LJLIL = str;
                    }
                    if (bool != null) {
                        cppUnlockGuideDialogV2.LJLJI = bool.booleanValue();
                    }
                    cppUnlockGuideDialogV2.LJLILLLLZI = interfaceC88472Yns2;
                    cppUnlockGuideDialogV2.show(fragmentManager2, "");
                }
            } else {
                Room LJIILL2 = C1DH.LJIILL(dataChannel);
                if (LJIILL2 != null && LJIILL2.cppVersion == 1 && dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null) {
                    CppUnlockGuideDialog cppUnlockGuideDialog = new CppUnlockGuideDialog();
                    if (str != null) {
                        cppUnlockGuideDialog.LJLIL = str;
                    }
                    if (bool != null) {
                        cppUnlockGuideDialog.LJLJI = bool.booleanValue();
                    }
                    cppUnlockGuideDialog.LJLILLLLZI = interfaceC88472Yns2;
                    cppUnlockGuideDialog.show(fragmentManager, "");
                }
            }
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(enumC12540eQ);
        }
        return enumC12540eQ;
    }
}
