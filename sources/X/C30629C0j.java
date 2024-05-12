package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* renamed from: X.C0j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30629C0j implements OnMessageListener {
    public final /* synthetic */ DataChannel LJLIL;
    public final /* synthetic */ Room LJLILLLLZI;

    public C30629C0j(Room room, DataChannel dataChannel) {
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = room;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage message) {
        PollMessage pollMessage;
        Integer num;
        long j;
        if (!(message instanceof PollMessage) || (num = (pollMessage = (PollMessage) message).pollKind) == null || num.intValue() != 2) {
            return;
        }
        long j2 = pollMessage.baseMessage.createTime / 1000;
        Room room = (Room) this.LJLIL.kv0(RoomChannel.class);
        long j3 = 0;
        if (room != null) {
            j = room.nowTime;
        } else {
            j = 0;
        }
        if (j2 <= j) {
            return;
        }
        if (pollMessage.messageType == 0) {
            C30627C0h.LJLJJL.put(this.LJLILLLLZI.getId(), Boolean.TRUE);
        }
        C30627C0h c30627C0h = C30627C0h.LJLIL;
        long id = this.LJLILLLLZI.getId();
        C04120Ee c04120Ee = new C04120Ee(this.LJLILLLLZI.getId());
        o.LJIIIIZZ(message, "message");
        PollMessage pollMessage2 = (PollMessage) message;
        c04120Ee.LJI = pollMessage2;
        long j4 = pollMessage2.messageType;
        if (j4 == 0) {
            PollStartContent pollStartContent = pollMessage2.startContent;
            if (pollStartContent != null) {
                long j5 = pollStartContent.endTime;
                if (j5 - pollStartContent.startTime >= 2592000000L) {
                    j3 = -1;
                } else {
                    long LIZIZ = j5 - C31012CFc.LIZIZ();
                    long j6 = pollStartContent.endTime - pollStartContent.startTime;
                    if (LIZIZ >= 0) {
                        if (LIZIZ > j6) {
                            j3 = j6;
                        } else {
                            j3 = LIZIZ;
                        }
                    }
                }
                c04120Ee.LIZIZ = j3;
                c04120Ee.LIZJ = pollStartContent.endTime;
            }
        } else if (j4 == 1) {
            c04120Ee.LIZIZ = 0L;
        }
        c04120Ee.LJ = c30627C0h.LIZ(c04120Ee.LIZ);
        C30627C0h.LIZLLL(true, id, c04120Ee);
    }
}
