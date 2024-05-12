package X;

import Y.ARunnableS41S0100000_5;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSdkPublicScreenMessageScheduleStrategySetting;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import webcast.data.MsgFilter;
import webcast.data.UserIdentity;

/* loaded from: classes6.dex */
public final class CQN extends AbstractC31075CHn<EmoteChatMessage> {
    public SpannableStringBuilder LJJIIZI;
    public final int LJJIJ;

    @Override // X.CQK
    public final String LLI() {
        return "";
    }

    @Override // X.AbstractC31075CHn
    public final String LLIIJLIL() {
        return "";
    }

    @Override // X.AbstractC31075CHn
    public final boolean LLIILII() {
        return true;
    }

    @Override // X.CQO, X.CRD
    public final UserIdentity LIZ() {
        return ((EmoteChatMessage) this.LJIJJLI).userIdentity;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJIIIIZZ() {
        return !this.LIZJ;
    }

    @Override // X.InterfaceC31380CTg
    public final MsgFilter LJIIJ() {
        return ((EmoteChatMessage) this.LJIJJLI).msgFilter;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        SpannableStringBuilder spannableStringBuilder = this.LJJIIZI;
        if (spannableStringBuilder != null && spannableStringBuilder.length() > 0) {
            return spannableStringBuilder;
        }
        List<EmoteModel> list = ((EmoteChatMessage) this.LJIJJLI).emoteList;
        o.LJIIIIZZ(list, "message.emoteList");
        CQW emoteType = CQW.PUBLICSCREEN_MESSAGE_TYPE;
        AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(this, 580);
        AqS171S0100000_5 aqS171S0100000_52 = new AqS171S0100000_5(this, 581);
        o.LJIIIZ(emoteType, "emoteType");
        List<SpannableStringBuilder> LLLLZ = C31418CUs.LJIILL.LLLLZ(list, emoteType, aqS171S0100000_5, null, aqS171S0100000_52, C31418CUs.LJFF);
        if (true ^ ((ArrayList) LLLLZ).isEmpty()) {
            return (SpannableStringBuilder) ListProtector.get(LLLLZ, 0);
        }
        return new SpannableStringBuilder("");
    }

    @Override // X.AbstractC31075CHn
    public final int LLIIL() {
        return ((EmoteChatMessage) this.LJIJJLI).emoteList.size();
    }

    @Override // X.AbstractC31075CHn
    public final void LLIIZ() {
        if (this.LJJIJ == 0) {
            C31418CUs.LIZJ(((EmoteChatMessage) this.LJIJJLI).emoteList, CQW.PUBLICSCREEN_MESSAGE_TYPE);
        } else {
            B73.LIZ().post(new ARunnableS41S0100000_5(this, 232));
        }
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return ((EmoteChatMessage) this.LJIJJLI).user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CQN(EmoteChatMessage message) {
        super(message);
        o.LJIIIZ(message, "message");
        this.LJJIJ = LiveSdkPublicScreenMessageScheduleStrategySetting.getMessageScheduleStrategy();
    }

    @Override // X.CQL
    public final void LJLLI(BadgeStruct badgeStruct) {
        if (C29514BiA.LIZIZ(badgeStruct)) {
            C29514BiA.LJ(LJLILLLLZI(), "comment_area_user_comment", LJLJJL());
        }
    }

    @Override // X.CQL
    public final void LJLLILLLL(BadgeStruct badgeStruct) {
        o.LJIIIZ(badgeStruct, "badgeStruct");
        if (C29514BiA.LIZIZ(badgeStruct)) {
            C29514BiA.LJFF(LJLILLLLZI(), "comment_area_user_comment", LJLJJL());
        }
    }
}
