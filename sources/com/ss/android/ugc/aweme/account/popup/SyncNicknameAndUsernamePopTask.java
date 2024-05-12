package com.ss.android.ugc.aweme.account.popup;

import X.A21;
import X.AKH;
import X.AbstractC56325M8r;
import X.ActivityC45651qj;
import X.C2068389v;
import X.C252029uo;
import X.C26045AKb;
import X.C26160AOm;
import X.C34K;
import X.C35936E8m;
import X.C54081LKj;
import X.C54082LKk;
import X.C68322mC;
import X.C7MY;
import X.FMX;
import X.InterfaceC55642Lsc;
import X.R41;
import X.RBY;
import Y.ACListenerS7S0500000_4;
import android.app.Activity;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.account.api.UserSettingsResponse;
import com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC55642Lsc("sync_nickname_username")
/* loaded from: classes5.dex */
public final class SyncNicknameAndUsernamePopTask extends AbstractC56325M8r<View> implements WeakHandler.IHandler {
    public static final C26160AOm Companion = new C26160AOm();
    public final ActivityC45651qj activity;
    public final ViewGroup contentView;
    public final Fragment fragment;
    public final WeakHandler handler;
    public final int priority;

    @Override // X.InterfaceC55641Lsb
    public C54082LKk getPopupContext() {
        return C54081LKj.LIZ(this.activity, this.fragment);
    }

    public final ActivityC45651qj getActivity() {
        return this.activity;
    }

    public final ViewGroup getContentView() {
        return this.contentView;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    @Override // X.InterfaceC56321M8n
    public int getPriority() {
        return this.priority;
    }

    private final void updateNicknameOnProfilePage(String str) {
        RBY LIZ = R41.LIZ();
        User curUser = R41.LIZ().getCurUser();
        curUser.setNickname(str);
        LIZ.setCurUser(curUser);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Exception) {
                showErrorToast(this.activity, false);
                return;
            }
            if (obj instanceof UserResponse) {
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                String nickname = ((UserResponse) obj).getUser().getNickname();
                o.LJIIIIZZ(nickname, "resp.user.nickname");
                updateNicknameOnProfilePage(nickname);
                SyncNicknameAndUsernamePopUpHelper.LJ().LIZ();
                showSuccessToast(this.activity, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.poplayer.IPopupTask
    public View showPopup(C54082LKk context) {
        AKH akh;
        T t;
        T t2;
        String str;
        o.LJIIIZ(context, "context");
        ViewGroup viewGroup = this.contentView;
        if (viewGroup != null) {
            akh = new AKH(viewGroup);
        } else {
            akh = null;
        }
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null) {
            C68322mC c68322mC = new C68322mC();
            UserSettingsResponse.UserSettingsData userSettingsData = SyncNicknameAndUsernamePopUpHelper.LIZLLL;
            if (userSettingsData != null) {
                t = userSettingsData.getSyncNickname2Username();
            } else {
                t = 0;
            }
            c68322mC.element = t;
            C34K c34k = new C34K();
            c34k.element = true;
            String string = LIZJ.getString(R.string.b5_);
            o.LJIIIIZZ(string, "currentActivity.getStrin…ame_updateUsername_modal)");
            String LJJJJZ = ujb.o.LJJJJZ(string, "%s", "", false);
            CharSequence charSequence = (CharSequence) c68322mC.element;
            if (charSequence == null || charSequence.length() == 0) {
                UserSettingsResponse.UserSettingsData userSettingsData2 = SyncNicknameAndUsernamePopUpHelper.LIZLLL;
                if (userSettingsData2 != null) {
                    t2 = userSettingsData2.getSyncUsername2Nickname();
                } else {
                    t2 = 0;
                }
                c68322mC.element = t2;
                c34k.element = false;
                String string2 = LIZJ.getString(R.string.b57);
                o.LJIIIIZZ(string2, "currentActivity.getStrin…ame_updateNickname_modal)");
                LJJJJZ = ujb.o.LJJJJZ(string2, "%s", "", false);
            }
            SpannableStringBuilder append = new SpannableStringBuilder(LJJJJZ).append((CharSequence) c68322mC.element);
            String str2 = (String) c68322mC.element;
            if (str2 != null) {
                String spannableStringBuilder = append.toString();
                o.LJIIIIZZ(spannableStringBuilder, "message.toString()");
                int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, str2, 0, false, 6);
                append.setSpan(new StyleSpan(1), LJJLIIIJL, str2.length() + LJJLIIIJL, 33);
            }
            boolean z = c34k.element;
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_from", "homepage_profile");
            if (z) {
                str = "username";
            } else {
                str = "nickname";
            }
            c35936E8m.LIZLLL("banner_type", str);
            FMX.LJIIL("update_username_banner_show", c35936E8m.LIZ);
            if (akh != null) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_person_pen;
                c2068389v.LJ = Integer.valueOf(R.attr.go);
                akh.LIZLLL(new AqS167S0100000_1(c2068389v, 15), true);
                akh.LIZ.LJ = append;
                akh.LIZ.LJFF = LIZJ.getString(R.string.b5b);
                int LIZIZ = C7MY.LIZIZ(88);
                A21 a21 = akh.LIZ;
                a21.LJI = LIZIZ;
                a21.LJIIIZ = 0;
                a21.LJIIJJI = new ACListenerS7S0500000_4(c34k, c68322mC, this, akh, LIZJ, 0);
                AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(c34k, 144);
                A21 a212 = akh.LIZ;
                a212.LJIIL = aqS170S0100000_4;
                a212.LJIILIIL = true;
                a212.LIZJ = false;
                akh.LIZ.LJIIIIZZ = C7MY.LIZIZ(45);
            }
        }
        SyncNicknameAndUsernamePopUpHelper.LJ().LIZJ();
        if (akh == null) {
            return null;
        }
        akh.LIZJ();
        return akh.LJ;
    }

    public final void updateUsernameOnProfilePage(String str) {
        RBY LIZ = R41.LIZ();
        User curUser = R41.LIZ().getCurUser();
        curUser.setUniqueId(str);
        LIZ.setCurUser(curUser);
    }

    private final void showErrorToast(Activity activity, boolean z) {
        String string;
        if (z) {
            string = activity.getString(R.string.b59);
        } else {
            string = activity.getString(R.string.b56);
        }
        o.LJIIIIZZ(string, "if (doSyncUsername) {\n  …e_failureToast)\n        }");
        C252029uo.LIZ("update", z, false);
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIZ(string);
        c26045AKb.LIZ(true);
        c26045AKb.LJIIJ();
    }

    private final void showSuccessToast(Activity activity, boolean z) {
        String string;
        if (z) {
            string = activity.getString(R.string.b5a);
        } else {
            string = activity.getString(R.string.b58);
        }
        o.LJIIIIZZ(string, "if (doSyncUsername) {\n  …e_successToast)\n        }");
        C252029uo.LIZ("update", z, true);
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIZ(string);
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LIZ(true);
        c26045AKb.LJIIJ();
    }

    public SyncNicknameAndUsernamePopTask(ActivityC45651qj activity, Fragment fragment, ViewGroup viewGroup) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(fragment, "fragment");
        this.activity = activity;
        this.fragment = fragment;
        this.contentView = viewGroup;
        this.handler = new WeakHandler(this);
        this.priority = 442;
    }

    public static /* synthetic */ void showErrorToast$default(SyncNicknameAndUsernamePopTask syncNicknameAndUsernamePopTask, Activity activity, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        syncNicknameAndUsernamePopTask.showErrorToast(activity, z);
    }

    public static /* synthetic */ void showSuccessToast$default(SyncNicknameAndUsernamePopTask syncNicknameAndUsernamePopTask, Activity activity, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        syncNicknameAndUsernamePopTask.showSuccessToast(activity, z);
    }
}
