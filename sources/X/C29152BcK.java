package X;

import android.content.Context;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BroadcastResumeInfo;
import com.bytedance.android.livesdk.dataChannel.GameLiveContinueDialogShowChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewStartLiveContinueMsgChannel;
import com.bytedance.android.livesdk.dataChannel.SmoothGoLiveStatusChannel;
import com.bytedance.android.livesdk.livesetting.game.GameLivePreviewResumeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BcK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29152BcK {
    public static final C29152BcK LIZ = new C29152BcK();

    public static int LIZ(LiveMode liveMode) {
        if (liveMode != null) {
            int i = C28928BWy.LIZ[liveMode.ordinal()];
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 3;
            }
            if (i == 4) {
                return 5;
            }
        }
        return 0;
    }

    public static void LIZIZ(LiveMode liveMode, boolean z) {
        String str;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_broadcast_path_get_room_create", 0.01d)) {
            return;
        }
        String str2 = "normal";
        BZI LIZIZ = C0N3.LIZIZ("livesdk_broadcast_path_get_room_create", "normal", "enter_from");
        if (liveMode != null) {
            str = liveMode.logStreamingType;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        LIZIZ.LJIJJ(str, "live_mode");
        if (z) {
            str2 = "smooth";
        }
        LIZIZ.LJIJJ(str2, "is_smooth");
        LIZIZ.LJIJJ(1, "is_success");
        LIZIZ.LJIJJ(1, "is_continue");
        LIZIZ.LJIJJ("", "error");
        LIZIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.bytedance.android.livesdkapi.depend.model.live.Room, O] */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.bytedance.android.livesdkapi.depend.model.live.Room, O] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.bytedance.android.livesdkapi.depend.model.live.Room, O] */
    public final void LJ(Message msg, DataChannel dataChannel, Fragment fragment) {
        Context context;
        C276516r c276516r;
        Object obj;
        ?? r4;
        Object obj2;
        int i;
        BroadcastResumeInfo broadcastResumeInfo;
        OSJ osj;
        Integer num;
        OSJ osj2;
        Object obj3;
        ?? r42;
        int i2;
        Integer num2;
        OSZ osz;
        o.LJIIIZ(msg, "msg");
        Object obj4 = null;
        if (fragment != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        Object obj5 = msg.obj;
        if (obj5 instanceof Room) {
            ?? r43 = (Room) obj5;
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29044Baa.class)).LIZ = r43;
            LIZLLL(this, r43, msg, dataChannel, fragment, 0, 48);
            return;
        }
        if (obj5 instanceof OSZ) {
            OSZ osz2 = (OSZ) obj5;
            if (osz2 != null) {
                obj3 = osz2.getFirst();
            } else {
                obj3 = null;
            }
            if (obj3 instanceof Room) {
                r42 = (Room) obj3;
            } else {
                r42 = 0;
            }
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29044Baa.class)).LIZ = r42;
            Object obj6 = msg.obj;
            if ((obj6 instanceof OSZ) && (osz = (OSZ) obj6) != null) {
                obj4 = osz.getSecond();
            }
            if ((obj4 instanceof Integer) && (num2 = (Integer) obj4) != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            LIZLLL(this, r42, msg, dataChannel, fragment, i2, 32);
            return;
        }
        if (obj5 instanceof OSJ) {
            OSJ osj3 = (OSJ) obj5;
            if (osj3 != null) {
                obj = osj3.getFirst();
            } else {
                obj = null;
            }
            if (obj instanceof Room) {
                r4 = (Room) obj;
            } else {
                r4 = 0;
            }
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29044Baa.class)).LIZ = r4;
            Object obj7 = msg.obj;
            if ((obj7 instanceof OSJ) && (osj2 = (OSJ) obj7) != null) {
                obj2 = osj2.getSecond();
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Object obj8 = msg.obj;
            if ((obj8 instanceof OSJ) && (osj = (OSJ) obj8) != null) {
                obj4 = osj.getThird();
            }
            if (!(obj4 instanceof BroadcastResumeInfo) || (broadcastResumeInfo = (BroadcastResumeInfo) obj4) == null) {
                broadcastResumeInfo = new BroadcastResumeInfo(0, 0L, 3, null);
            }
            LIZJ(r4, msg, dataChannel, fragment, i, broadcastResumeInfo);
            return;
        }
        if (!(obj5 instanceof C29401Dk)) {
            return;
        }
        C276516r c276516r2 = (C276516r) obj5;
        if (c276516r2 != null && c276516r2.getErrorCode() == 30005) {
            C29156BcO.LIZJ(context, dataChannel);
        }
        Object obj9 = msg.obj;
        if (!(obj9 instanceof C29401Dk) || (c276516r = (C276516r) obj9) == null || c276516r.getErrorCode() != 30003) {
            return;
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LIZIZ("PreviewContinueLiveHelper", "handle ROOM_CONTINUE_LIVE_ROOM_FINISH");
        }
        if (dataChannel != null) {
            dataChannel.rv0(PreviewStartLiveContinueMsgChannel.class, Boolean.TRUE);
        }
        C28957BYb c28957BYb = C28957BYb.LJLIL;
        if (context == null) {
            return;
        }
        c28957BYb.LIZJ(context, dataChannel);
    }

    public static void LIZJ(Room room, Message message, DataChannel dataChannel, Fragment fragment, int i, BroadcastResumeInfo broadcastResumeInfo) {
        Context context;
        Integer num;
        int i2;
        int i3;
        int i4;
        int i5;
        LiveMode liveMode;
        long j;
        LiveMode liveMode2 = null;
        if (fragment == null || (context = fragment.getContext()) == null || dataChannel == null) {
            return;
        }
        if (message != null) {
            num = Integer.valueOf(message.arg1);
            if (num != null && num.intValue() == 0 && C1XY.LJJIII(C29306Beo.LIZIZ(context)) && DataChannelGlobal.LJLJJI.mv0(SmoothGoLiveStatusChannel.class) != EnumC32529Cph.PREVIEW) {
                return;
            }
        } else {
            num = null;
        }
        C34K c34k = new C34K();
        if (i == 1) {
            c34k.element = true;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            C0N7.LJII("show", CardStruct.IStatusCode.DEFAULT, j, dataChannel);
            i2 = R.string.ny4;
            i3 = R.string.ny3;
            i4 = R.string.ny1;
            i5 = R.string.ny2;
        } else {
            i2 = R.string.jx7;
            i3 = R.string.jx4;
            i4 = R.string.jx5;
            i5 = R.string.jx6;
        }
        LiveMode liveMode3 = (LiveMode) dataChannel.kv0(LiveModeChannel.class);
        if (liveMode3 == null) {
            liveMode3 = LiveMode.VIDEO;
        }
        ((IHostConfig) CN1.LIZ(IHostConfig.class)).qS().getClass();
        if (room != null) {
            liveMode = room.getStreamType();
        } else {
            liveMode = null;
        }
        if (C29137Bc5.LIZJ(liveMode) && !GameLivePreviewResumeSetting.INSTANCE.getValue()) {
            C29162BcU.LIZIZ(1, null);
            return;
        }
        if (room != null) {
            liveMode2 = room.getStreamType();
        }
        if (C29137Bc5.LIZJ(liveMode2)) {
            dataChannel.rv0(GameLiveContinueDialogShowChannel.class, Boolean.TRUE);
        }
        C77437UaH c77437UaH = new C77437UaH(context);
        c77437UaH.LJI(i2);
        c77437UaH.LIZIZ(i3);
        c77437UaH.LJ(i4, new DialogInterfaceOnClickListenerC29149BcH(liveMode3, dataChannel, c34k, room, context, broadcastResumeInfo, num, fragment), false);
        c77437UaH.LIZJ(i5, new DialogInterfaceOnClickListenerC29153BcL(c34k, room, dataChannel, context, num, fragment), false);
        c77437UaH.LJJII = false;
        C29182Bco.LIZ().LIZ(c77437UaH.LIZ(), EnumC30559Bz1.MIDDLE, new C29154BcM(dataChannel), dataChannel, "SHOW_CONTINUE_DIALOG_TAG");
    }

    public static /* synthetic */ void LIZLLL(C29152BcK c29152BcK, Room room, Message message, DataChannel dataChannel, Fragment fragment, int i, int i2) {
        BroadcastResumeInfo broadcastResumeInfo;
        int i3 = i;
        if ((i2 & 16) != 0) {
            i3 = 0;
        }
        if ((i2 & 32) != 0) {
            broadcastResumeInfo = new BroadcastResumeInfo(0, 0L, 3, null);
        } else {
            broadcastResumeInfo = null;
        }
        c29152BcK.getClass();
        LIZJ(room, message, dataChannel, fragment, i3, broadcastResumeInfo);
    }
}
