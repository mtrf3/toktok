package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LIH implements LLE {
    public static ActivityC45651qj LJLILLLLZI;
    public static final LIH LJLIL = new LIH();
    public static final MutableLiveData<OSZ<String, String>> LJLJI = new MutableLiveData<>();
    public static final MutableLiveData<String> LJLJJI = new MutableLiveData<>();

    public static final ActivityC45651qj LIZ() {
        Activity activity;
        ActivityC45651qj activityC45651qj = LJLILLLLZI;
        if (activityC45651qj != null) {
            return activityC45651qj;
        }
        ActivityC45651qj activityC45651qj2 = null;
        try {
            Activity[] activityStack = ActivityStack.getActivityStack();
            o.LJIIIIZZ(activityStack, "getActivityStack()");
            int length = activityStack.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    activity = activityStack[i];
                    if (activity instanceof InterfaceC55058LjC) {
                        break;
                    }
                    i++;
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                return null;
            }
            activityC45651qj2 = C45804HyK.LJJIFFI(activity);
            return activityC45651qj2;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            C3C5.m10exceptionOrNullimpl(LIZ);
            return activityC45651qj2;
        }
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        ActivityC45651qj activityC45651qj;
        InterfaceC54054LJi interfaceC54054LJi;
        LQA lqa = LQA.LIZIZ;
        InterfaceC54049LJd LJIJ = lqa.LJIJ();
        if (LJIJ != null && LJIJ.LIZ() && (activityC45651qj = LJLILLLLZI) != null) {
            if (lqa.LJI()) {
                if (o.LJ(str, "Nearby")) {
                    MutableLiveData<OSZ<String, String>> mutableLiveData = LJLJI;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    mutableLiveData.postValue(new OSZ<>(str2, str3));
                    return;
                }
                LJLJJI.postValue(str);
                return;
            }
            if (o.LJ(str2, "HOME")) {
                LJLJJI.postValue(str);
            }
            if (!o.LJ(str, "HOME")) {
                return;
            }
            InterfaceC36571c5 Ja = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).Ja("HOME");
            if (!(Ja instanceof InterfaceC54054LJi) || (interfaceC54054LJi = (InterfaceC54054LJi) Ja) == null || !interfaceC54054LJi.oc()) {
                return;
            }
            MutableLiveData<OSZ<String, String>> mutableLiveData2 = LJLJI;
            if (str2 == null) {
                str2 = "";
            }
            mutableLiveData2.postValue(new OSZ<>(str2, "click_button_icon"));
        }
    }
}
