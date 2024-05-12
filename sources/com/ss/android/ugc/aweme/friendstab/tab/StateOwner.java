package com.ss.android.ugc.aweme.friendstab.tab;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C141335gf;
import X.C3C4;
import X.C3C5;
import X.C54029LIj;
import X.C76800UCe;
import X.C84763XOl;
import X.EON;
import X.HG3;
import X.InterfaceC36571c5;
import X.InterfaceC54054LJi;
import X.InterfaceC55058LjC;
import X.InterfaceC88472Yns;
import X.LDY;
import X.LEA;
import X.LLE;
import X.OSZ;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StateOwner implements GenericLifecycleObserver, LEA, LLE, LDY {
    public static ActivityC45651qj LJLILLLLZI;
    public static boolean LJLLL;
    public static boolean LJLLLL;
    public static boolean LJLLLLLL;
    public static boolean LJLZ;
    public static final StateOwner LJLIL = new StateOwner();
    public static boolean LJLJI = true;
    public static final MutableLiveData<Boolean> LJLJJI = new MutableLiveData<>();
    public static final MutableLiveData<Boolean> LJLJJL = new MutableLiveData<>();
    public static final MutableLiveData<Boolean> LJLJJLL = new MutableLiveData<>();
    public static final MutableLiveData<Boolean> LJLJL = new MutableLiveData<>();
    public static final MutableLiveData<Boolean> LJLJLJ = new MutableLiveData<>();
    public static final MutableLiveData<Boolean> LJLJLLL = new MutableLiveData<>();
    public static final Set<InterfaceC88472Yns<Boolean, C76800UCe>> LJLL = new LinkedHashSet();
    public static final MutableLiveData<OSZ<String, String>> LJLLI = new MutableLiveData<>();
    public static final MutableLiveData<String> LJLLILLLL = new MutableLiveData<>();
    public static final MutableLiveData<C76800UCe> LJLLJ = new MutableLiveData<>();

    public final void LJ() {
        LJLLL = false;
        ActivityC45651qj LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            MutableLiveData<OSZ<String, String>> mutableLiveData = LJLLI;
            mutableLiveData.setValue(null);
            MutableLiveData<Boolean> mutableLiveData2 = LJLJJI;
            Boolean bool = Boolean.FALSE;
            mutableLiveData2.setValue(bool);
            MutableLiveData<Boolean> mutableLiveData3 = LJLJLJ;
            mutableLiveData3.setValue(bool);
            MutableLiveData<Boolean> mutableLiveData4 = LJLJJL;
            mutableLiveData4.setValue(bool);
            mutableLiveData.removeObservers(LIZLLL);
            LJLLILLLL.removeObservers(LIZLLL);
            LJLLJ.removeObservers(LIZLLL);
            mutableLiveData3.removeObservers(LIZLLL);
            LJLJLLL.removeObservers(LIZLLL);
            mutableLiveData2.removeObservers(LIZLLL);
            LJLJL.removeObservers(LIZLLL);
            LJLJJLL.removeObservers(LIZLLL);
            mutableLiveData4.removeObservers(LIZLLL);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final ActivityC45651qj LIZLLL() {
        Activity activity;
        ActivityC45651qj activityC45651qj = LJLILLLLZI;
        if (activityC45651qj != null) {
            return activityC45651qj;
        }
        try {
            Activity[] activityStack = ActivityStack.getActivityStack();
            o.LJIIIIZZ(activityStack, "getActivityStack()");
            int length = activityStack.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    activity = null;
                    break;
                }
                activity = activityStack[i];
                if (activity instanceof InterfaceC55058LjC) {
                    break;
                }
                i++;
            }
            if (!(activity instanceof ActivityC45651qj)) {
                return null;
            }
            return (ActivityC45651qj) activity;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            C3C5.m10exceptionOrNullimpl(LIZ);
            return null;
        }
    }

    public final boolean LIZJ() {
        return HG3.LJIILL().isLogin();
    }

    public final void LIZIZ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        LJLILLLLZI = activity;
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(this);
        C116694i1.LIZ(activity).hv0(this);
        C84763XOl.LJI().LJJJJZI(EON.LJLIL);
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        String str2;
        o.LJIIIZ(to, "to");
        if (o.LJ("FRIENDS_FEED", to)) {
            if (LJLLLL) {
                str2 = "publish_landing";
            } else if (LJLLLLLL) {
                str2 = "slide";
            } else if (LJLZ) {
                str2 = "click_fyp_enter_guide";
            } else {
                str2 = "click_top_icon";
            }
            MutableLiveData<OSZ<String, String>> mutableLiveData = LJLLI;
            if (str == null) {
                str = "";
            }
            mutableLiveData.setValue(new OSZ<>(str, str2));
            LJLLLL = false;
            LJLLLLLL = false;
            LJLZ = false;
            return;
        }
        if (!o.LJ("FRIENDS_FEED", str)) {
            return;
        }
        LJLLILLLL.postValue("home top friends unselected");
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 1) {
            if (z) {
                LJLLI.setValue(null);
                LJLJJI.postValue(Boolean.valueOf(z));
                return;
            }
            return;
        }
        if (i == 2) {
            if (!z) {
                return;
            }
            LJLJJL.postValue(Boolean.valueOf(z));
            LJ();
            return;
        }
        if (i == 3) {
            if (!z) {
                return;
            }
            LJLJJLL.postValue(Boolean.valueOf(z));
            LJ();
            return;
        }
        if (i != 4 || !z) {
            return;
        }
        LJLJL.postValue(Boolean.valueOf(z));
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        ActivityC45651qj activityC45651qj;
        InterfaceC54054LJi interfaceC54054LJi;
        String str4;
        C54029LIj c54029LIj = C54029LIj.LIZIZ;
        if (!c54029LIj.LJJIJL()) {
            if (o.LJ(str, "FRIENDS_TAB")) {
                MutableLiveData<OSZ<String, String>> mutableLiveData = LJLLI;
                if (str2 == null) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (str3 == null) {
                    str3 = "";
                }
                mutableLiveData.postValue(new OSZ<>(str4, str3));
            } else {
                LJLLILLLL.postValue(str);
            }
        }
        if (c54029LIj.LJJIJL() && o.LJ(str2, "HOME")) {
            LJLLILLLL.postValue(str);
        }
        if (c54029LIj.LJJIJL() && o.LJ(str, "HOME") && (activityC45651qj = LJLILLLLZI) != null) {
            InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(activityC45651qj).Ja("HOME");
            if ((Ja instanceof InterfaceC54054LJi) && (interfaceC54054LJi = (InterfaceC54054LJi) Ja) != null && interfaceC54054LJi.K2()) {
                MutableLiveData<OSZ<String, String>> mutableLiveData2 = LJLLI;
                if (str2 == null) {
                    str2 = "";
                }
                mutableLiveData2.postValue(new OSZ<>(str2, "click_button_icon"));
            }
        }
    }
}
