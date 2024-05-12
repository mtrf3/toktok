package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.BanTalkEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BJ2 extends TBS implements InterfaceC88472Yns<MemberMessage, C76800UCe> {
    public BJ2(Object obj) {
        super(1, obj, C28565BIz.class, "handleMemberMessage", "handleMemberMessage(Lcom/bytedance/android/livesdk/model/message/MemberMessage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(MemberMessage memberMessage) {
        boolean z;
        String str;
        User owner;
        MemberMessage p0 = memberMessage;
        o.LJIIIZ(p0, "p0");
        C28565BIz c28565BIz = (C28565BIz) this.receiver;
        c28565BIz.getClass();
        User user = p0.user;
        boolean z2 = false;
        if (user != null && user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            BZI LIZ = C28787BRn.LIZ("livesdk_moderator_toast");
            LIZ.LJIJJ(String.valueOf(p0.user.getId()), "user_id");
            User user2 = p0.operator;
            if (user2 != null) {
                Room room = (Room) c28565BIz.LIZIZ.kv0(RoomChannel.class);
                if (room == null || (owner = room.getOwner()) == null || user2.getId() != owner.getId()) {
                    str = "admin";
                } else {
                    str = "anchor";
                }
                LIZ.LJIJJ(str, "admin_type");
            }
            int i = p0.action;
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                if (i != 20) {
                                    switch (i) {
                                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                            if (!c28565BIz.LIZIZ()) {
                                                UPJ.LJFF(20, C73943T0h.LIZ());
                                            }
                                            LIZ.LJIJJ("block", "manage_action");
                                            LIZ.LJJIIJZLJL();
                                            break;
                                    }
                                } else {
                                    c28565BIz.LIZJ("update_admin_permissions", null, p0.adminPermissions);
                                }
                            } else {
                                C73943T0h.LIZ().LIZIZ(new C28268B7o(11, p0.kickSource));
                            }
                        } else {
                            c28565BIz.LIZJ("admin_cancel", Boolean.FALSE, null);
                        }
                    } else {
                        c28565BIz.LIZJ("admin", Boolean.TRUE, p0.adminPermissions);
                    }
                }
                c28565BIz.LIZIZ.qv0(BanTalkEvent.class, new C28854BUc(false, true));
                c28565BIz.LIZLLL("banCancel", false);
                if (p0.operator == null) {
                    LIZ.LJIJJ("auto", "admin_type");
                }
                LIZ.LJIJJ("unmuted", "manage_action");
                LIZ.LJJIIJZLJL();
            }
            DataChannel dataChannel = c28565BIz.LIZIZ;
            Long l = p0.actionDuration;
            if (l != null && l.longValue() == -1) {
                z2 = true;
            }
            dataChannel.qv0(BanTalkEvent.class, new C28854BUc(true, z2));
            c28565BIz.LIZLLL("ban", true);
            LIZ.LJIJJ("muted", "manage_action");
            LIZ.LJJIIJZLJL();
        }
        if (c28565BIz.LIZIZ() && p0.operator != null && ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() != p0.operator.getId()) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_moderator_message");
            LIZ2.LJIJJ(String.valueOf(p0.operator.getId()), "moderator_id");
            LIZ2.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
            int i2 = p0.action;
            switch (i2) {
                case 9:
                    LIZ2.LJIJJ("muted", "manage_action");
                    LIZ2.LJJIIJZLJL();
                    break;
                case 10:
                    LIZ2.LJIJJ("unmuted", "manage_action");
                    LIZ2.LJJIIJZLJL();
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    LIZ2.LJIJJ("blocked", "manage_action");
                    LIZ2.LJJIIJZLJL();
                    break;
                default:
                    switch (i2) {
                        case 21:
                            LIZ2.LJIJJ("unblocked", "manage_action");
                            LIZ2.LJJIIJZLJL();
                            break;
                        case 22:
                            LIZ2.LJIJJ("turned_on_comments", "manage_action");
                            LIZ2.LJJIIJZLJL();
                            break;
                        case 23:
                            LIZ2.LJIJJ("turned_off_comments", "manage_action");
                            LIZ2.LJJIIJZLJL();
                            break;
                        case 24:
                        case 25:
                            LIZ2.LJIJJ("edited_keywords", "manage_action");
                            LIZ2.LJJIIJZLJL();
                            break;
                        case 26:
                            LIZ2.LJIJJ("pinned_comment", "manage_action");
                            LIZ2.LJJIIJZLJL();
                            break;
                    }
            }
        }
        return C76800UCe.LIZ;
    }
}
