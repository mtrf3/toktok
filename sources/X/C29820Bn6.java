package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.ModeratorSpeakerMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bn6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29820Bn6 extends CQO<ModeratorSpeakerMessage> {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d3y;
    }

    @Override // X.CQO, X.CQL, X.InterfaceC31347CRz
    public final boolean LJJZ() {
        return false;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void onAttach() {
        String str;
        String str2;
        Text text;
        Text text2;
        super.onAttach();
        MESSAGE message = this.LJIJJLI;
        LJLIIL();
        C29827BnD.LIZJ(message);
        CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
        String str3 = null;
        if (commonMessageData != null && (text2 = commonMessageData.displayText) != null) {
            str = text2.key;
        } else {
            str = null;
        }
        if (!o.LJ("pm_mt_quitAsModerator_liveCommnetArea_toast", str) || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_promoting_message_show", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_promoting_message_show");
        LIZ.LJIILLIIL(LJLIIL().LJIIIIZZ);
        LIZ.LJJIII(Long.valueOf(LJLIIL().LJIIJJI));
        LIZ.LJ(Long.valueOf(LJLIIL().LJIILLIIL));
        CommonMessageData commonMessageData2 = this.LJIJJLI.baseMessage;
        if (commonMessageData2 != null && (text = commonMessageData2.displayText) != null) {
            str3 = text.key;
        }
        LIZ.LJIJJ(str3, "msg_id");
        if (LJLIIL().LJFF) {
            str2 = "anchor";
        } else {
            str2 = "viewer";
        }
        LIZ.LJIJJ(str2, "admin_type");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29820Bn6(ModeratorSpeakerMessage message) {
        super(message);
        o.LJIIIZ(message, "message");
    }
}
