package X;

import Y.ACListenerS23S0100000_3;
import Y.AObserverS67S0200000_3;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184487Lw {
    public final C200847uS LIZ;
    public View LIZIZ;
    public View LIZJ;

    public C184487Lw(C200847uS c200847uS) {
        LifecycleOwner viewLifecycleOwner;
        ViewGroup.LayoutParams layoutParams;
        this.LIZ = c200847uS;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c200847uS.LIZIZ), R.layout.c20, c200847uS.LIZLLL, false);
        if (Z9N.LIZIZ.LLJLIL() && Build.VERSION.SDK_INT >= 24) {
            View view = new View(c200847uS.LIZIZ);
            view.setRotation(180.0f);
            view.setBackground(C04270Et.LIZIZ(c200847uS.LIZIZ, R.drawable.bw0));
            ViewGroup viewGroup = c200847uS.LIZLLL;
            if (viewGroup != null) {
                viewGroup.addView(view, -1, O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(UserLevelGeckoUpdateSetting.DEFAULT))));
            }
            this.LIZIZ = view;
        }
        ViewGroup viewGroup2 = c200847uS.LIZLLL;
        if (viewGroup2 != null) {
            viewGroup2.addView(LLLLIILL);
        }
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        c200847uS.LJFF = (ViewGroup) LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.kf_);
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = C184387Lm.LJ(c200847uS.LIZIZ);
        }
        View findViewById2 = LLLLIILL.findViewById(R.id.kf_);
        if (findViewById2 != null) {
            findViewById2.invalidate();
        }
        TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.aeu);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(this, 188));
        }
        if (!LIZIZ(LLLLIILL, true)) {
            TuxIconView tuxIconView2 = (TuxIconView) LLLLIILL.findViewById(R.id.aeu);
            if (tuxIconView2 != null) {
                tuxIconView2.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
            }
            TuxIconView tuxIconView3 = (TuxIconView) LLLLIILL.findViewById(R.id.aeu);
            if (tuxIconView3 != null) {
                tuxIconView3.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
            }
            LIZ(LLLLIILL, true);
        }
        LIZJ(true, LLLLIILL);
        Fragment fragment = c200847uS.LIZ;
        if (fragment != null && (viewLifecycleOwner = fragment.getViewLifecycleOwner()) != null) {
            c200847uS.LJII.LLILIL.observe(viewLifecycleOwner, new AObserverS67S0200000_3(LLLLIILL, this, 7));
        }
    }

    public static void LIZ(View view, boolean z) {
        int i;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.aeu);
        if (appCompatImageView != null) {
            if (z) {
                i = R.drawable.bvy;
            } else {
                i = 0;
            }
            appCompatImageView.setBackgroundResource(i);
        }
    }

    public static boolean LIZIZ(View view, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Z9N z9n = Z9N.LIZIZ;
        boolean z2 = false;
        if (!z9n.LLILZIL()) {
            return false;
        }
        if (z9n.LLJJJIL() && z) {
            z2 = true;
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.aeu);
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams instanceof C018905p) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                if (z2) {
                    i4 = 30;
                } else {
                    i4 = 24;
                }
                marginLayoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(i4));
                if (z2) {
                    i5 = 30;
                } else {
                    i5 = 24;
                }
                marginLayoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(i5));
                if (z) {
                    i6 = 8;
                } else {
                    i6 = 4;
                }
                marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i6))));
            }
            if (z2) {
                i = 18;
            } else {
                i = 24;
            }
            tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(i)));
            if (z2) {
                i2 = 18;
            } else {
                i2 = 24;
            }
            tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(i2)));
            if (z) {
                i3 = R.attr.dj;
            } else {
                i3 = R.attr.go;
            }
            tuxIconView.setTintColorRes(i3);
        }
        LIZ(view, z2);
        return true;
    }

    public final void LIZJ(boolean z, View view) {
        Fragment fragment;
        View view2;
        int i;
        String str;
        String str2;
        C200847uS c200847uS = this.LIZ;
        if (c200847uS.LIZJ == null || (fragment = c200847uS.LIZ) == null || (view2 = fragment.getView()) == null) {
            return;
        }
        Z9N z9n = Z9N.LIZIZ;
        if (!z9n.LLILZIL()) {
            return;
        }
        View view3 = this.LIZIZ;
        if (view3 != null) {
            if (z && z9n.LLJLIL()) {
                i = 0;
            } else {
                i = 8;
            }
            view3.setVisibility(i);
        }
        boolean z2 = !z;
        C200847uS c200847uS2 = this.LIZ;
        Fragment fragment2 = c200847uS2.LIZ;
        Aweme aweme = c200847uS2.LIZJ;
        PostModeDetailParams postModeDetailParams = c200847uS2.LJI;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
            str2 = postModeDetailParams.tabName;
        } else {
            str = null;
            str2 = null;
        }
        z9n.LLLLLJIL(z2, fragment2, view2, aweme, str, str2);
        if (z) {
            if (z9n.LLJJJIL()) {
                TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.f_e);
                tuxIconView.setBackground(C04270Et.LIZIZ(tuxIconView.getContext(), R.drawable.a3s));
                tuxIconView.setTintColorRes(R.attr.dj);
                tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
                tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
                return;
            }
            return;
        }
        if (!z9n.LLILZIL()) {
            return;
        }
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.f_e);
        tuxIconView2.setBackground(null);
        tuxIconView2.setTintColorRes(R.attr.go);
        tuxIconView2.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        tuxIconView2.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
    }
}
