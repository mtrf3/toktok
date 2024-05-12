package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* renamed from: X.Jyy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50940Jyy {
    public final java.util.Map<String, Object> LIZ;
    public final InterfaceC50941Jyz LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public C50940Jyy(java.util.Map paramsMap, C50937Jyv surveyDialogCallback) {
        o.LJIIIZ(paramsMap, "paramsMap");
        o.LJIIIZ(surveyDialogCallback, "surveyDialogCallback");
        this.LIZ = paramsMap;
        this.LIZIZ = surveyDialogCallback;
    }

    public static void LIZ(Fragment fragment, boolean z) {
        Lifecycle.State state;
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        if (z) {
            state = Lifecycle.State.STARTED;
        } else {
            state = Lifecycle.State.RESUMED;
        }
        FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
        Fragment LJJJIL = supportFragmentManager.LJJJIL("container");
        if (LJJJIL != null) {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJJIFFI(LJJJIL, state);
            c1b3.LJI();
        }
    }
}
