package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.adminsetting.MuteConfirmDialogFragment;
import com.bytedance.android.livesdk.qa.QuestionMoreOptionDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.AqS1S1300100_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BEj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28445BEj<T> implements InterfaceC64592gB {
    public final /* synthetic */ QuestionMoreOptionDialog LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ User LJLJI;
    public final /* synthetic */ long LJLJJI;

    public C28445BEj(QuestionMoreOptionDialog questionMoreOptionDialog, boolean z, User user, long j) {
        this.LJLIL = questionMoreOptionDialog;
        this.LJLILLLLZI = z;
        this.LJLJI = user;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Long l;
        Long l2;
        String str;
        MuteConfirmDialogFragment Hr;
        String str2;
        C05490Jl defDuration = (C05490Jl) obj;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        Long l3 = null;
        if (LIZIZ != null) {
            l = Long.valueOf(((C29374Bfu) LIZIZ).getCurrentUserId());
        } else {
            l = null;
        }
        Room room = this.LJLIL.LJLJJI;
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        } else {
            l2 = null;
        }
        if (o.LJ(l, l2)) {
            str = "anchor";
        } else {
            str = "admin";
        }
        if (o.LJ(this.LJLIL.LJLJJL, "qa_board")) {
            BZI LIZ = C28787BRn.LIZ("livesdk_mute_click");
            LIZ.LJIILLIIL(this.LJLIL.dataChannel);
            LIZ.LJIJJ(Long.valueOf(defDuration.LIZ), "default_mute_set");
            User user = this.LJLIL.LJLILLLLZI;
            if (user != null) {
                l3 = Long.valueOf(user.getId());
            }
            LIZ.LJIJJ(String.valueOf(l3), "to_user_id");
            LIZ.LJIJJ("QnA", "entry_point");
            LIZ.LJIJJ(str, "admin_type");
            if (this.LJLILLLLZI) {
                str2 = "set";
            } else {
                str2 = "cancel";
            }
            LIZ.LJIJJ(str2, "action_type");
            LIZ.LJJIIJZLJL();
        }
        if (this.LJLILLLLZI) {
            if (o.LJ(this.LJLIL.LJLJJL, "qa_board")) {
                FragmentManager fragmentManager = this.LJLIL.getFragmentManager();
                if (fragmentManager == null || (Hr = ((IAdminSettingService) CN1.LIZ(IAdminSettingService.class)).Hr(new AqS1S1300100_5(this.LJLJI, this.LJLJJI, this.LJLIL, str, defDuration, 0))) == null) {
                    return;
                }
                Hr.show(fragmentManager, "ReportQuestionAnchorDialog");
                return;
            }
            IUserManageService iUserManageService = (IUserManageService) CN1.LIZ(IUserManageService.class);
            User user2 = this.LJLJI;
            long j = this.LJLJJI;
            o.LJIIIIZZ(defDuration, "defDuration");
            iUserManageService.Ns(j, user2, defDuration, this.LJLIL);
            this.LJLIL.vl(true);
            return;
        }
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Qu(this.LJLJJI, this.LJLJI, this.LJLIL);
    }
}
