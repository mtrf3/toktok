package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import kotlin.jvm.internal.o;

/* renamed from: X.LMn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54137LMn implements LLE, URA {
    public static boolean LJLILLLLZI;
    public static final C54137LMn LJLIL = new C54137LMn();
    public static final XJO LJLJI = XJR.LIZ();

    public static final IFriendsTabLayoutAbility LJFF() {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            return C53976LGi.LIZJ(LIZLLL);
        }
        return null;
    }

    public static void LJII() {
        String str;
        INoticeService LJJJJJ;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null && ((RBX) HG3.LJIILL()).getCurUser().getFriendCount() > 0) {
            if (C54029LIj.LIZIZ.LJJIJL()) {
                str = "FRIENDS_FEED";
            } else {
                str = "FRIENDS_TAB";
            }
            Fragment Ja = com.bytedance.hox.Hox.LJLLI.LIZ(LIZLLL).Ja(str);
            if (Ja != null && (Ja instanceof InterfaceC56322M8o) && (LJJJJJ = NoticeServiceImpl.LJJJJJ()) != null) {
                LJJJJJ.LJJJJI(LIZLLL, new GuideOutPushParam("homepage_friends", (String) null, "enter_homepage_friends", (String) null, 21));
            }
        }
    }

    @Override // X.URA
    public final void LIZ() {
        LJLJI.LIZIZ(null);
    }

    @Override // X.URA
    public final void LIZIZ() {
        LJLJI.LIZIZ(null);
    }

    public final String LIZLLL() {
        ISocial2TabProtocolAbility LJFF;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        String str = null;
        if (LIZLLL == null || (LJFF = C53976LGi.LJFF(LIZLLL)) == null || !LJFF.v60()) {
            IFriendsTabLayoutAbility LJFF2 = LJFF();
            if (LJFF2 != null) {
                str = LJFF2.TO();
            }
            if (!o.LJ(str, "FRIENDS_FEED")) {
                return "";
            }
        }
        return "homepage_friends";
    }

    public final void LJIIIIZZ() {
        IBottomTabLayoutAbility iBottomTabLayoutAbility;
        boolean z;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            iBottomTabLayoutAbility = C53976LGi.LJIIIIZZ(LIZLLL);
        } else {
            iBottomTabLayoutAbility = null;
        }
        if (iBottomTabLayoutAbility != null) {
            z = iBottomTabLayoutAbility.wY();
        } else {
            z = false;
        }
        if (LHJ.LIZ.getBoolean("has_shown_permission_dialog", false) && z) {
            LIZJ();
        }
    }

    public static final void LIZJ() {
        LifecycleCoroutineScope lifecycleScope;
        if (C59522Vg.LIZ()) {
            ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LIZLLL)) != null) {
                XKX.LIZLLL(lifecycleScope, C78613UtF.LIZJ, null, new C70782qA(null), 2);
                return;
            }
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C54141LMr(null), 3);
    }

    public static void LJ(ActivityC45651qj activity) {
        String str;
        InterfaceC56322M8o interfaceC56322M8o;
        o.LJIIIZ(activity, "activity");
        if (C54029LIj.LIZIZ.LJJIJL()) {
            str = "FRIENDS_FEED";
        } else {
            str = "FRIENDS_TAB";
        }
        InterfaceC36571c5 Ja = com.bytedance.hox.Hox.LJLLI.LIZ(activity).Ja(str);
        if (Ja != null) {
            if ((Ja instanceof InterfaceC56322M8o) && (interfaceC56322M8o = (InterfaceC56322M8o) Ja) != null) {
                PopupManager.LJIIL(new C54139LMp(interfaceC56322M8o));
                return;
            }
            return;
        }
        LJLILLLLZI = true;
    }

    public static void LJI(ActivityC45651qj activityC45651qj) {
        int LIZIZ;
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        if (C54407LWx.LIZIZ.LJ(activityC45651qj)) {
            LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) + C7MY.LIZIZ(173);
        } else {
            LIZIZ = C7MY.LIZIZ(58);
        }
        publishService.moveProgress(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), C63081OpJ.LJJJJLI(activityC45651qj) + LIZIZ);
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        if (o.LJ(str, "FRIENDS_TAB")) {
            LJIIIIZZ();
        }
    }
}
