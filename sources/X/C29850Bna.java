package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* renamed from: X.Bna, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29850Bna implements InterfaceC29848BnY {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C29851Bnb.LJLIL);

    @Override // X.InterfaceC29848BnY
    public final void LIZ(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LIZJ(C29846BnW capsuleModel) {
        long j;
        String str;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        if (o.LJ("live_goal_guide", ((CapsuleMessage) capsuleModel.LJIJJLI).scene)) {
            CapsuleMessage capsuleMessage = (CapsuleMessage) capsuleModel.LJIJJLI;
            String str2 = null;
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C66622jS(this, false, null), 3);
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room != null) {
                LiveMode streamType = room.getStreamType();
                if (streamType != null) {
                    str2 = streamType.logStreamingType;
                }
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                User owner = room.getOwner();
                if (owner != null) {
                    j = owner.getId();
                } else {
                    j = 0;
                }
                long id = room.getId();
                long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                Text text = capsuleMessage.desc;
                if (text != null && (str = text.defaultPattern) != null) {
                    str3 = str;
                }
                C29852Bnc.LIZ(str2, j, id, currentUserId, 0L, "anchor", "set_goal", str3);
            }
        }
        return false;
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZLLL(C29846BnW capsuleModel) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final void LJ(C29846BnW capsuleModel) {
        long j;
        String str;
        o.LJIIIZ(capsuleModel, "capsuleModel");
        if (!o.LJ("live_goal_guide", ((CapsuleMessage) capsuleModel.LJIJJLI).scene)) {
            return;
        }
        CapsuleMessage capsuleMessage = (CapsuleMessage) capsuleModel.LJIJJLI;
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.f2;
        c48459J0d.LIZ(Integer.valueOf(c48459J0d.LIZJ().intValue() + 1));
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return;
        }
        LiveMode streamType = room.getStreamType();
        String str2 = null;
        if (streamType != null) {
            str2 = streamType.logStreamingType;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        User owner = room.getOwner();
        if (owner != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        long id = room.getId();
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        Text text = capsuleMessage.desc;
        if (text != null && (str = text.defaultPattern) != null) {
            str3 = str;
        }
        C29852Bnc.LIZIZ(str2, j, id, currentUserId, 0L, "anchor", "set_goal", str3);
    }

    @Override // X.InterfaceC29848BnY
    public final void LIZIZ(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }

    @Override // X.InterfaceC29848BnY
    public final boolean LJFF(CQQ publicScreenContext, CapsuleMessage message) {
        boolean z;
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        o.LJIIIZ(message, "message");
        if (o.LJ("live_goal_guide", message.scene)) {
            Integer LIZJ = InterfaceC30442Bx8.f2.LIZJ();
            if (LIZJ == null || LIZJ.intValue() < 5) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            if (z2) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C66622jS(this, false, null), 3);
            }
            return z2;
        }
        C29837BnN.LIZ(publicScreenContext, message);
        return false;
    }

    @Override // X.InterfaceC29848BnY
    public final void LJI(C29846BnW capsuleModel, java.util.Map<String, String> map) {
        o.LJIIIZ(capsuleModel, "capsuleModel");
    }
}
