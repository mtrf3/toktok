package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CRE {
    public long LJ;
    public final int LIZ = 100;
    public final ArrayDeque<CQO<?>> LIZIZ = new ArrayDeque<>(100);
    public final boolean LIZJ = BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup();
    public final java.util.Set<Integer> LIZLLL = C77275UUl.LJ(Integer.valueOf(EnumC31509CYf.GIFT.getIntType()), Integer.valueOf(EnumC31509CYf.DOODLE_GIFT.getIntType()), Integer.valueOf(EnumC31509CYf.CHAT.getIntType()), Integer.valueOf(EnumC31509CYf.MEMBER.getIntType()), Integer.valueOf(EnumC31509CYf.SCREEN.getIntType()), Integer.valueOf(EnumC31509CYf.DIGG.getIntType()), Integer.valueOf(EnumC31509CYf.SOCIAL.getIntType()), Integer.valueOf(EnumC31509CYf.LIKE.getIntType()), Integer.valueOf(EnumC31509CYf.ROOM.getIntType()));
    public final C5H3 LJFF = C78996UzQ.LJJIJIIJI(CRN.LJLIL);

    public final void LIZ(CQO<?> model) {
        o.LJIIIZ(model, "model");
        if (!o.LJ(InterfaceC30442Bx8.LJIIZILJ.LIZJ(), Boolean.TRUE) && !this.LIZJ) {
            return;
        }
        CR6 cr6 = model.LJIJJLI;
        int intType = cr6.getIntType();
        MESSAGE message = model.LJIJJLI;
        if (!this.LIZLLL.contains(Integer.valueOf(intType))) {
            return;
        }
        if (intType == EnumC31509CYf.GIFT.getIntType()) {
            if (message instanceof GiftMessage) {
                GiftMessage giftMessage = (GiftMessage) message;
                Gift findGiftById = ((IGiftService) CN1.LIZ(IGiftService.class)).findGiftById(giftMessage.giftId);
                if (findGiftById != null && findGiftById.combo && giftMessage.LJLILLLLZI) {
                    return;
                }
            }
        } else if (intType == EnumC31509CYf.SOCIAL.getIntType()) {
            if ((model instanceof CQ7) && ((SocialMessage) model.LJIJJLI).action != 1) {
                return;
            }
        } else if (intType == EnumC31509CYf.MEMBER.getIntType()) {
            if ((model instanceof C31276CPg) && ((MemberMessage) model.LJIJJLI).action != 1) {
                return;
            }
        } else if (intType == EnumC31509CYf.ROOM.getIntType() && (message instanceof RoomMessage) && ((RoomMessage) message).source != 3 && !o.LJ(message.baseMessage.describe, "LiveGoal")) {
            return;
        }
        Iterator it = ((ArrayList) this.LJFF.getValue()).iterator();
        while (it.hasNext()) {
            if (((InterfaceC31343CRv) it.next()).LIZ(cr6)) {
                return;
            }
        }
        int intType2 = model.LJIJJLI.getIntType();
        MESSAGE message2 = model.LJIJJLI;
        if (intType2 == EnumC31509CYf.LIKE.getIntType() && (message2 instanceof LikeMessage)) {
            LikeMessage likeMessage = (LikeMessage) message2;
            if (this.LJ == likeMessage.user.getId()) {
                return;
            } else {
                this.LJ = likeMessage.user.getId();
            }
        }
        ArrayDeque<CQO<?>> arrayDeque = this.LIZIZ;
        if (arrayDeque.size() < this.LIZ) {
            arrayDeque.add(model);
        }
    }
}
