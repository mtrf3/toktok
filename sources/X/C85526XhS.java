package X;

import android.app.Dialog;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.UserStore;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_save_info")
/* renamed from: X.XhS, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85526XhS extends AbstractC56325M8r<Dialog> {
    public final ActivityC45651qj LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final int LJLJJI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJI;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [T, X.R5M] */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, X.R5M] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, X.R5M] */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, X.R5M] */
    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        boolean z;
        C26231ARf LJI;
        o.LJIIIZ(context, "context");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", R41.LIZIZ.LJFF().getCurUserId());
        c188727au.LJIIIZ("enter_from", "login");
        FMX.LJIIL("remember_login_info_notify", c188727au.LIZ);
        int i = Keva.getRepo("save_info_keva_repo").getInt("key_show_count", 0);
        if (C53262KvK.LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String enterFrom = this.LJLILLLLZI;
            int i2 = i + 1;
            ActivityC45651qj activity = this.LJLIL;
            InterfaceC65784Pro<C76800UCe> onDialogShowDiss = this.LJLJI;
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(activity, "activity");
            o.LJIIIZ(onDialogShowDiss, "onDialogShowDiss");
            C26227ARb c26227ARb = new C26227ARb(activity);
            SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(activity);
            User curUser = R41.LIZIZ.LJFF().getCurUser();
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = R5M.DEFAULT;
            W5F LJI2 = C1JX.LJI(curUser);
            LJI2.LJJIIJ = smartAvatarImageView;
            C16880lQ.LLJJJ(LJI2);
            C78857UxB.LJJI(c26227ARb, smartAvatarImageView, null);
            c26227ARb.LJII = false;
            String nv0 = C116694i1.LIZ(C45804HyK.LJJIFFI(activity)).nv0();
            if (nv0 != null) {
                int hashCode = nv0.hashCode();
                if (hashCode != -1382453013) {
                    if (hashCode != 2223327) {
                        if (hashCode == 2614219 && nv0.equals("USER")) {
                            c68322mC.element = R5M.PROFILE_POP_UP;
                        }
                    } else if (nv0.equals("HOME")) {
                        c68322mC.element = R5M.FYP_POP_UP;
                    }
                } else if (nv0.equals("NOTIFICATION")) {
                    c68322mC.element = R5M.INBOX_POP_UP;
                }
            }
            c26227ARb.LJ(R.string.j_2);
            c26227ARb.LIZIZ(activity.getString(R.string.j_1, UserStore.LIZJ(false).getUniqueId()));
            UC0.LIZJ(c26227ARb, new R5R(enterFrom, i2, c68322mC, activity, onDialogShowDiss));
            c26227ARb.LIZLLL(new C78887Uxf(enterFrom, i2));
            LJI = c26227ARb.LJI();
        } else {
            ActivityC45651qj activity2 = this.LJLIL;
            InterfaceC65784Pro<C76800UCe> onDialogShowDiss2 = this.LJLJI;
            o.LJIIIZ(activity2, "activity");
            o.LJIIIZ(onDialogShowDiss2, "onDialogShowDiss");
            C26227ARb c26227ARb2 = new C26227ARb(activity2);
            SmartAvatarImageView smartAvatarImageView2 = new SmartAvatarImageView(activity2);
            W5F LJII = W5U.LJII(C78939UyV.LJ(R41.LIZIZ.LJFF().getCurUser().getAvatarThumb()));
            LJII.LJJIIJ = smartAvatarImageView2;
            C16880lQ.LLJJJ(LJII);
            C78857UxB.LJJI(c26227ARb2, smartAvatarImageView2, null);
            c26227ARb2.LJII = false;
            c26227ARb2.LJ(R.string.o4);
            c26227ARb2.LIZ(R.string.o1);
            UC0.LIZJ(c26227ARb2, R5A.LJLIL);
            c26227ARb2.LIZJ(new AqS173S0100000_7(onDialogShowDiss2, (InterfaceC65784Pro<C76800UCe>) 383));
            LJI = c26227ARb2.LJI();
        }
        Keva.getRepo("save_info_keva_repo").storeLong("key_last_show_time", System.currentTimeMillis());
        Keva.getRepo("save_info_keva_repo").storeInt("key_show_count", Keva.getRepo("save_info_keva_repo").getInt("key_show_count", 0) + 1);
        return LJI.LJ();
    }

    public C85526XhS(ActivityC45651qj activityC45651qj, String enterFrom, InterfaceC65784Pro<C76800UCe> onDialogShowDissCallback) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(onDialogShowDissCallback, "onDialogShowDissCallback");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = onDialogShowDissCallback;
        this.LJLJJI = LiveChatShowDelayForHotLiveSetting.DEFAULT;
    }
}
