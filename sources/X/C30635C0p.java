package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShowCustomPollToolBarAlert;
import com.bytedance.android.livesdk.interaction.custompoll.CustomPollCardWidget;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.C0p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30635C0p extends C1E1 {
    public final /* synthetic */ CustomPollCardWidget LIZ;

    public C30635C0p(CustomPollCardWidget customPollCardWidget) {
        this.LIZ = customPollCardWidget;
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LIZ(C04120Ee pollInfo) {
        o.LJIIIZ(pollInfo, "pollInfo");
        if (pollInfo.LIZIZ > 0) {
            C29306Beo.LJJLJLI(this.LIZ.LJZL());
            long j = 1000;
            if (pollInfo.LIZIZ / j >= 3600) {
                this.LIZ.LJZL().setText(C31012CFc.LJI((int) (pollInfo.LIZIZ / j)));
                return;
            } else {
                this.LIZ.LJZL().setText(C31012CFc.LJII(pollInfo.LIZIZ / j));
                return;
            }
        }
        C29306Beo.LJI(this.LIZ.LJZL());
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LIZIZ(C04120Ee c04120Ee) {
        long j;
        CustomPollCardWidget customPollCardWidget = this.LIZ;
        if (customPollCardWidget.dataChannel != null && !customPollCardWidget.LJLLI) {
            customPollCardWidget.LJLJLLL.removeCallbacksAndMessages(null);
            if (C29306Beo.LJIIJ(customPollCardWidget.dataChannel)) {
                customPollCardWidget.LJLJLLL.postDelayed(customPollCardWidget.LJLL, 5000L);
            } else {
                customPollCardWidget.LJLJLLL.postDelayed(customPollCardWidget.LJLL, 10000L);
            }
            C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.Z;
            PollMessage pollMessage = c04120Ee.LJI;
            if (pollMessage != null) {
                j = pollMessage.pollId;
            } else {
                j = 0;
            }
            c48459J0d.LIZ(Long.valueOf(j));
            customPollCardWidget.LLFII(c04120Ee);
            customPollCardWidget.show();
        }
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LIZJ(C04120Ee c04120Ee) {
        if (!c04120Ee.LJII) {
            CustomPollCardWidget customPollCardWidget = this.LIZ;
            if (customPollCardWidget.LJLLI) {
                customPollCardWidget.LJLLLL = "other_function";
                DataChannel dataChannel = customPollCardWidget.dataChannel;
                if (dataChannel != null) {
                    dataChannel.pv0(ShowCustomPollToolBarAlert.class);
                }
                this.LIZ.hide();
            }
        }
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LJ(C04120Ee pollInfo) {
        o.LJIIIZ(pollInfo, "pollInfo");
        this.LIZ.LJZL().setText(C31012CFc.LJII(0L));
        CustomPollCardWidget customPollCardWidget = this.LIZ;
        customPollCardWidget.LJLLLL = "poll_timeout";
        customPollCardWidget.hide();
    }

    @Override // X.C1E1, X.InterfaceC04100Ec
    public final void LJFF(C04120Ee c04120Ee) {
        String str;
        Long l;
        String str2;
        PollEndContent pollEndContent;
        User user;
        PollEndContent pollEndContent2;
        CustomPollCardWidget customPollCardWidget = this.LIZ;
        DataChannel dataChannel = customPollCardWidget.dataChannel;
        if (dataChannel != null) {
            EnumC04110Ed enumC04110Ed = c04120Ee.LJIIIIZZ;
            if (enumC04110Ed == EnumC04110Ed.CANCEL) {
                PollMessage pollMessage = c04120Ee.LJI;
                if (pollMessage != null && (pollEndContent2 = pollMessage.endContent) != null && pollEndContent2.endType == 0) {
                    str2 = "poll_timeout";
                } else {
                    Room room = (Room) dataChannel.kv0(RoomChannel.class);
                    Long l2 = null;
                    if (room != null) {
                        l = Long.valueOf(room.getOwnerUserId());
                    } else {
                        l = null;
                    }
                    PollMessage pollMessage2 = c04120Ee.LJI;
                    if (pollMessage2 != null && (pollEndContent = pollMessage2.endContent) != null && (user = pollEndContent.operator) != null) {
                        l2 = Long.valueOf(user.getId());
                    }
                    if (o.LJ(l, l2)) {
                        str2 = "anchor_close";
                    } else {
                        str2 = "moderator_close";
                    }
                }
                customPollCardWidget.LJLLLL = str2;
            } else {
                if (enumC04110Ed == EnumC04110Ed.LIVE_END) {
                    str = "close_take";
                } else if (enumC04110Ed == EnumC04110Ed.LEAVE_ROOM) {
                    str = "leave_room";
                } else {
                    str = "others";
                }
                customPollCardWidget.LJLLLL = str;
            }
            if (c04120Ee.LJIIIIZZ != EnumC04110Ed.REPLACE) {
                customPollCardWidget.hide();
            }
        }
    }
}
