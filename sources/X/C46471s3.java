package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.1s3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46471s3 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DataChannel LJLIL;
    public final /* synthetic */ C04120Ee LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46471s3(DataChannel dataChannel, C04120Ee c04120Ee, long j, String str, String str2) {
        super(0);
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = c04120Ee;
        this.LJLJI = j;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        User user;
        String str2;
        Long l;
        String str3;
        PollStartContent pollStartContent;
        Room room;
        LiveMode streamType;
        PollStartContent pollStartContent2;
        if (C79146V4k.LJJJI(this.LJLIL) || C29306Beo.LJIIJ(this.LJLIL)) {
            str = "livesdk_anchor_custom_poll_card_duration";
        } else {
            str = "livesdk_poll_card_duration";
        }
        PollMessage pollMessage = this.LJLILLLLZI.LJI;
        Long l2 = null;
        if (pollMessage != null && (pollStartContent2 = pollMessage.startContent) != null) {
            user = pollStartContent2.operator;
        } else {
            user = null;
        }
        String LIZ = C04130Ef.LIZ(user);
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIILLIIL(this.LJLIL);
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
            str2 = C28509BGv.LIZ(streamType);
        } else {
            str2 = null;
        }
        LIZ2.LJIJJ(str2, "live_type");
        PollMessage pollMessage2 = this.LJLILLLLZI.LJI;
        if (pollMessage2 != null) {
            l = Long.valueOf(pollMessage2.pollId);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "poll_id");
        PollMessage pollMessage3 = this.LJLILLLLZI.LJI;
        if (pollMessage3 != null && (pollStartContent = pollMessage3.startContent) != null) {
            str3 = pollStartContent.title;
        } else {
            str3 = null;
        }
        LIZ2.LJIJJ(str3, "poll_title");
        LIZ2.LJIJJ(LIZ, "poll_sponsor");
        DataChannel dataChannel2 = this.LJLIL;
        if (C79146V4k.LJJJI(dataChannel2)) {
            User LIZIZ = C05200Ii.LIZIZ();
            if (LIZIZ != null) {
                l2 = Long.valueOf(LIZIZ.getId());
            }
            LIZ2.LJIJJ(l2, "moderator_id");
            LIZ2.LJIJJ("moderator", "user_type");
        } else if (C29306Beo.LJIIJ(dataChannel2)) {
            LIZ2.LJIJJ("anchor", "user_type");
        }
        LIZ2.LJIJJ(Long.valueOf(this.LJLJI), "duration");
        LIZ2.LJIJJ(this.LJLJJI, "end_type");
        LIZ2.LJIJJ(this.LJLJJL, "enter_from");
        LIZ2.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
