package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.2IJ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2IJ extends C2LB {
    public boolean LJLJLLL;

    public abstract void LJIIJJI(Aweme aweme);

    public abstract void LJIIL();

    public abstract void LJIILIIL();

    public abstract void LJIILJJIL(String str);

    public abstract void LJIILL();

    public abstract void LJIILLIIL(String str, String str2, String str3, String str4);

    public abstract void LJIIZILJ();

    public abstract void LJIJ(Activity activity, Aweme aweme);

    public abstract void LJIJI(Aweme aweme, C56802Ku c56802Ku);

    public abstract void LJIJJ(Activity activity, Aweme aweme, C56802Ku c56802Ku);

    public C2IJ(String str, int i) {
        super(str, i);
    }

    @Override // X.C2LB
    public final void LJIIIIZZ(Activity activity, Fragment fragment) {
        if (activity == null) {
            C1JD.LJIJJ("ATTACH ACTIVITY == NULL");
        }
        this.LJLIL = activity;
        this.LJLILLLLZI = fragment;
    }
}
