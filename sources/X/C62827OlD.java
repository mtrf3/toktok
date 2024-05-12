package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.o;

/* renamed from: X.OlD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62827OlD {
    public static void LIZIZ(String str, String str2) {
        C62825OlB.LJLL = str;
        C62825OlB.LJLJLLL = str2;
        if (o.LJ(str2, "others_homepage")) {
            C62825OlB.LJLLI = true;
            C62825OlB.LJLLILLLL = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C62825OlB LIZ(String str, ActivityC45651qj activityC45651qj, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        C62825OlB c62825OlB = new C62825OlB(str, fragment, activityC45651qj, null);
        C7XD.LIZ("ProfileDownloadBottomView", "register");
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(c62825OlB.LJLILLLLZI);
        if (LIZIZ != null) {
            ((LiveData) c62825OlB.LJLJJLL.getValue()).observe(LIZIZ, (Observer) c62825OlB.LJLJL.getValue());
        }
        C62828OlE.LJLLILLLL.add(c62825OlB.LJLJLJ.getValue());
        return c62825OlB;
    }
}
