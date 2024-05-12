package X;

import Y.IDHandlerS22S0100000_10;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OlB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62825OlB implements LLE, InterfaceC53896LDg {
    public static String LJLJLLL;
    public static String LJLL;
    public static boolean LJLLI;
    public static boolean LJLLILLLL;
    public static boolean LJLLJ;
    public static boolean LJLLL;
    public final String LJLIL;
    public final Activity LJLILLLLZI;
    public final View LJLJI;
    public final IDHandlerS22S0100000_10 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    static {
        new C62827OlD();
        LJLJLLL = "";
        LJLL = "";
        LJLLI = true;
        LJLLILLLL = true;
    }

    public final C62828OlE LIZ() {
        return (C62828OlE) this.LJLJJL.getValue();
    }

    public final void LIZJ() {
        C62828OlE.LJLLILLLL.remove(this.LJLJLJ.getValue());
        ((LiveData) this.LJLJJLL.getValue()).removeObserver((Observer) this.LJLJL.getValue());
    }

    public final void LIZIZ(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showDownloadProgressBar isShow[");
        LIZ.append(z);
        LIZ.append(']');
        C7XD.LIZ("ProfileDownloadBottomView", X1D.LIZIZ(LIZ));
        if (z) {
            C62828OlE LIZ2 = LIZ();
            if (LIZ2 != null) {
                C62828OlE.LJIIIZ(LIZ2, 0, null, EnumC62412cf.TYPE_PROFILE_PAGE, 2);
                return;
            }
            return;
        }
        C62828OlE LIZ3 = LIZ();
        if (LIZ3 == null) {
            return;
        }
        C62828OlE.LJIIIZ(LIZ3, 8, null, EnumC62412cf.TYPE_PROFILE_PAGE, 2);
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        LJLLI = false;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        LJLLI = true;
    }

    public C62825OlB(String str, Fragment fragment, Activity activity, View view) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = str;
        this.LJLILLLLZI = activity;
        this.LJLJI = view;
        C116694i1.LIZ(C45804HyK.LJJIFFI(activity)).hv0(this);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activity);
        if (LJJIFFI != null) {
            com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).hv0("USER", this);
        }
        this.LJLJJI = new IDHandlerS22S0100000_10(this, C16880lQ.LLJJJJ(), 3);
        this.LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 611));
        this.LJLJJLL = C221108m2.LIZIZ(C62615Ohn.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 610));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 612));
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        LJLLI = o.LJ(str, "USER");
    }
}
