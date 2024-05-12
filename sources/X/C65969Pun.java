package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Pun, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65969Pun implements InterfaceC39518Ff8 {
    @Override // X.InterfaceC39518Ff8
    public final C39519Ff9 preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C65300Pk0 c65300Pk0) {
        return new C39519Ff9(null, false);
    }

    @Override // X.InterfaceC39518Ff8
    public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C65300Pk0 c65300Pk0, boolean z) {
        boolean z2 = false;
        try {
            if (i != 10501) {
                if (i != 10502) {
                    return;
                }
                Fragment fragment = (Fragment) obj;
                Boolean bool = (Boolean) objArr[0];
                if (bool != null) {
                    z2 = bool.booleanValue();
                }
                ViewOnAttachStateChangeListenerC65968Pum LIZIZ = C65966Puk.LIZIZ(fragment);
                if (LIZIZ == null || !ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
                    return;
                }
                if (o.LJ("local_test", EF7.LJIILIIL)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("setUserVisibleHint = ");
                    LIZ.append(z2);
                    X1D.LIZIZ(LIZ);
                }
                LIZIZ.LIZ(z2);
                return;
            }
            Fragment fragment2 = (Fragment) obj;
            Boolean bool2 = (Boolean) objArr[0];
            if (bool2 != null) {
                z2 = bool2.booleanValue();
            }
            ViewOnAttachStateChangeListenerC65968Pum LIZIZ2 = C65966Puk.LIZIZ(fragment2);
            if (LIZIZ2 == null || !ViewOnAttachStateChangeListenerC65968Pum.LJLJLLL) {
                return;
            }
            if (o.LJ("local_test", EF7.LJIILIIL)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onHiddenChanged ");
                LIZ2.append(z2);
                X1D.LIZIZ(LIZ2);
            }
            LIZIZ2.LIZ(!z2);
        } catch (Exception unused) {
        }
    }
}
