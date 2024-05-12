package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bn4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29818Bn4 extends CQO<RoomMessage> {
    public boolean LJIL;

    @Override // X.CQL, X.CRD
    public final long LJJIJL() {
        return 3000L;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJ() {
        return ((RoomMessage) this.LJIJJLI).isWelcome;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJIJ() {
        if (((RoomMessage) this.LJIJJLI).source == 4) {
            return true;
        }
        return false;
    }

    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        MESSAGE message = this.LJIJJLI;
        if (((RoomMessage) message).source == 4) {
            return R.drawable.d5g;
        }
        if (TextUtils.equals(((RoomMessage) message).scene, "user_fans_upgrade")) {
            return R.drawable.d3p;
        }
        if (TextUtils.equals(((RoomMessage) this.LJIJJLI).scene, "user_join_fans")) {
            return R.drawable.d3n;
        }
        return R.drawable.d2a;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJJLIIIJL() {
        if (((RoomMessage) this.LJIJJLI).source == 4) {
            return true;
        }
        return false;
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void LJJLL() {
        CommonMessageData commonMessageData;
        String str;
        RoomMessage roomMessage = (RoomMessage) this.LJIJJLI;
        int i = roomMessage.source;
        if (i == 1 || i == 3) {
            if (this.LJIIL.LIZ != 1 || (commonMessageData = roomMessage.baseMessage) == null || commonMessageData.displayText == null || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_promoting_message_show", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
                return;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_promoting_message_show");
            LIZ.LJIILLIIL(this.LJIIJJI.LJIIIIZZ);
            LIZ.LJJIII(Long.valueOf(this.LJIIJJI.LJIIJJI));
            LIZ.LJ(Long.valueOf(this.LJIIJJI.LJIILLIIL));
            LIZ.LJIJJ(this.LJIJJLI.baseMessage.displayText.key, "msg_id");
            if (this.LJIIJJI.LJFF) {
                str = "anchor";
            } else {
                str = "viewer";
            }
            LIZ.LJIJJ(str, "admin_type");
            LIZ.LJJIIJZLJL();
            return;
        }
        if (i == 4 && this.LJIIL.LIZ == 1) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_sub_only_live_converted_notice");
            LIZ2.LJIILLIIL(this.LJIIJJI.LJIIIIZZ);
            LIZ2.LJJIII(Long.valueOf(this.LJIIJJI.LJIIJJI));
            LIZ2.LJ(Long.valueOf(this.LJIIJJI.LJIILLIIL));
            LIZ2.LJJIIJZLJL();
        }
    }

    @Override // X.CQL
    public CharSequence LJJZZIII() {
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
        return CPR.LIZIZ(R.color.a8j, ((RoomMessage) this.LJIJJLI).content);
    }

    public final boolean LLFF() {
        if (TextUtils.equals(((RoomMessage) this.LJIJJLI).scene, "user_fans_upgrade") || TextUtils.equals(((RoomMessage) this.LJIJJLI).scene, "user_join_fans")) {
            return true;
        }
        return false;
    }

    @Override // X.CQL
    public final boolean LJZ() {
        if (LLFF()) {
            return true;
        }
        return this instanceof C29817Bn3;
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void onAttach() {
        String str;
        super.onAttach();
        if (this.LJIIJJI.LJIILJJIL) {
            Text text = this.LJIJJLI.baseMessage.displayText;
            if (text != null) {
                str = text.key;
            } else {
                str = "";
            }
            if ("pm_mt_brightness_adjust_banner".equals(str)) {
                C0Y4.LIZ("livesdk_brightness_adjust_message_show");
            }
            if (this.LJIL) {
                if ("pm_mt_autoSuggest_moderator_muteTooltip".equals(str)) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_comment_autosuggest_tutorial_show");
                    LIZ.LJIIZILJ();
                    LIZ.LJIJJ("mute", "tutorial_type");
                    LIZ.LJJIIJZLJL();
                }
                if ("pm_mt_autoSuggest_moderator_blockTooltip".equals(str)) {
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_comment_autosuggest_tutorial_show");
                    LIZ2.LJIIZILJ();
                    LIZ2.LJIJJ("block", "tutorial_type");
                    LIZ2.LJJIIJZLJL();
                }
                if ("pm_mt_autoSuggest_moderator_tooltip".equals(str)) {
                    BZI LIZ3 = C28787BRn.LIZ("livesdk_comment_autosuggest_tutorial_show");
                    LIZ3.LJIIZILJ();
                    LIZ3.LJIJJ("both", "tutorial_type");
                    LIZ3.LJJIIJZLJL();
                }
            }
            this.LJIL = false;
            C29827BnD.LIZJ(this.LJIJJLI);
        }
    }

    public C29818Bn4(RoomMessage roomMessage) {
        super(roomMessage);
        this.LJIL = true;
    }

    @Override // X.CQL, X.CXK
    public final CharSequence LJJJLZIJ(User user) {
        int i;
        if (LLFF()) {
            String LIZ = C05170If.LIZ(user);
            if (this.LJI && (i = this.LJIIIIZZ) > 0) {
                return C78840Uwu.LJJIJLIJ(i, LIZ);
            }
            return LIZ;
        }
        return super.LJJJLZIJ(user);
    }

    @Override // X.CQL
    public final void LJLZ(User user) {
        if (LLFF()) {
            C29775BmN.LIZIZ(user);
        }
    }

    @Override // X.CQL
    public final void LJLLLLLL(int i, User user) {
        if (LLFF()) {
            C29775BmN.LIZ(i, user);
        }
    }
}
