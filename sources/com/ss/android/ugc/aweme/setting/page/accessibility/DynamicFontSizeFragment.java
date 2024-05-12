package com.ss.android.ugc.aweme.setting.page.accessibility;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C221108m2;
import X.C26338AVi;
import X.C29S;
import X.C32151Nz;
import X.C39914FlW;
import X.C3C5;
import X.C47261Igj;
import X.C60191Njn;
import X.C61328O5c;
import X.C62822Ol8;
import X.C74042T4c;
import X.C76800UCe;
import X.C7MY;
import X.C90903hW;
import X.FMX;
import X.O6R;
import X.OFZ;
import X.OPD;
import X.OPE;
import X.SY4;
import X.SY9;
import Y.ACListenerS30S0100000_10;
import Y.ACListenerS45S0200000_10;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DynamicFontSizeFragment extends Fragment {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public int LJZL;
    public int LL;
    public boolean LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;

    public DynamicFontSizeFragment() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 338));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 344));
        this.LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 337));
        this.LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 354));
        this.LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 336));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 339));
        this.LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 356));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 350));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 351));
        this.LJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 340));
        this.LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 341));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 345));
        this.LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 346));
        this.LJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 352));
        this.LJLLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 353));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 348));
        this.LJLZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 347));
        this.LJZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 355));
        this.LJZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 349));
        this.LLD = true;
        this.LLF = C221108m2.LIZIZ(OPE.LJLIL);
        this.LLFF = C221108m2.LIZIZ(new AqS160S0100000_10(this, 343));
        this.LLFFF = C221108m2.LIZIZ(new AqS160S0100000_10(this, 342));
    }

    public final OFZ xl() {
        return (OFZ) this.LLF.getValue();
    }

    public static void wl(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                o.LJIIIIZZ(childAt, "view.getChildAt(i)");
                wl(childAt);
            }
            return;
        }
        if (view instanceof TuxTextView) {
            o.LJIIIZ(view, "<this>");
            view.setTag(R.id.ku4, Boolean.FALSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Al(int i) {
        float f;
        ArrayList LJII = C47261Igj.LJII(this.LJLJLJ.getValue(), this.LJLL.getValue(), this.LJLLILLLL.getValue(), this.LJLLL.getValue());
        ArrayList LJII2 = C47261Igj.LJII(this.LJLJLLL.getValue(), this.LJLLI.getValue(), this.LJLLJ.getValue(), this.LJLLLL.getValue());
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
        float f2 = 15.0f;
        float f3 = 17.0f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        f = 15.0f;
                        f2 = 13.0f;
                    } else {
                        LJJIIZ = C7MY.LIZIZ(53);
                        LJJIIZ2 = C7MY.LIZIZ(40);
                        f2 = 16.0f;
                        f3 = 22.0f;
                        f = 20.0f;
                    }
                } else {
                    LJJIIZ = C7MY.LIZIZ(53);
                    LJJIIZ2 = C7MY.LIZIZ(40);
                    f = 18.0f;
                    f3 = 20.0f;
                }
            } else {
                LJJIIZ = C7MY.LIZIZ(50);
                LJJIIZ2 = C7MY.LIZIZ(38);
                f = 17.0f;
                f2 = 13.0f;
                f3 = 19.0f;
            }
        } else {
            LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
            LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
            f = 15.0f;
            f2 = 12.0f;
        }
        vl(LJJIIZ);
        Iterator it = LJII.iterator();
        while (it.hasNext()) {
            TuxIconView tuxIconView = (TuxIconView) it.next();
            if (tuxIconView != null) {
                tuxIconView.setIconHeight(LJJIIZ2);
                tuxIconView.setIconWidth(LJJIIZ2);
            }
        }
        Iterator it2 = LJII2.iterator();
        while (it2.hasNext()) {
            TuxTextView tuxTextView = (TuxTextView) it2.next();
            if (tuxTextView != null) {
                tuxTextView.LJJJ(f2);
            }
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LJLLLLLL.getValue();
        if (tuxTextView2 != null) {
            tuxTextView2.LJJJ(f3);
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.LJLZ.getValue();
        if (tuxTextView3 != null) {
            tuxTextView3.LJJJ(f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = (SharedPreferences) this.LLFF.getValue();
        int i = 0;
        if (sharedPreferences != null) {
            i = sharedPreferences.getInt("dynamic_font_mode", 0);
        }
        this.LJZL = i;
        if (xl() != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("previous_page", "settings_page");
            c188727au.LJIIIZ("enter_method", "click_button");
            c188727au.LJIIIZ("enter_from", "settings_page");
            FMX.LJIIL("enter_font_size", c188727au.LIZ);
        }
    }

    public final void vl(int i) {
        LayerDrawable layerDrawable;
        TuxIconView tuxIconView = (TuxIconView) this.LJLILLLLZI.getValue();
        if (tuxIconView != null) {
            tuxIconView.setIconHeight(i);
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LJLILLLLZI.getValue();
        if (tuxIconView2 != null) {
            tuxIconView2.setIconHeight(i);
        }
        Context context = getContext();
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZIZ = C7MY.LIZIZ(34);
            c2068389v.LIZJ = C7MY.LIZIZ(34);
            c2068389v.LIZ = R.raw.icon_color_tiktok_logo_light;
            SY9 LIZ = c2068389v.LIZ(context);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LJII = i;
            c110614Vt.LJI = i;
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.do);
            c110614Vt.LIZJ = Float.valueOf(Float.MAX_VALUE);
            c110614Vt.LJ = -1;
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(2);
            layerDrawable = C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context));
        } else {
            layerDrawable = null;
        }
        TuxIconView tuxIconView3 = (TuxIconView) this.LJLILLLLZI.getValue();
        if (tuxIconView3 != null) {
            tuxIconView3.setImageDrawable(layerDrawable);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        Drawable drawable2;
        Integer valueOf;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        wl(view);
        TuxTextView tuxTextView = (TuxTextView) this.LJLJL.getValue();
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(33);
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LJLJJL.getValue();
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(102);
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.LJZ.getValue();
        if (tuxTextView3 != null) {
            tuxTextView3.setTuxFont(42);
        }
        TuxTextView tuxTextView4 = (TuxTextView) this.LJZI.getValue();
        if (tuxTextView4 != null) {
            tuxTextView4.setTuxFont(22);
        }
        Al(this.LJZL);
        Forest LIZ = C39914FlW.LIZ();
        Drawable drawable3 = null;
        boolean z = true;
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setChannel("tiktok_dynamic_font_page");
        requestParams.setBundle("dynamic_font_page_background.png");
        LIZ.fetchResourceAsync("", requestParams, new AqS176S0100000_10(this, UserLevelGeckoUpdateSetting.DEFAULT));
        C60191Njn.LIZJ(mo49getActivity(), false);
        if (getContext() != null) {
            mo49getActivity().getWindow().setStatusBarColor(0);
        }
        this.LL = this.LJZL;
        vl(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        SharedPreferences sharedPreferences = (SharedPreferences) this.LLFFF.getValue();
        if (sharedPreferences == null || (valueOf = Integer.valueOf(sharedPreferences.getInt("dark_mode", 1))) == null || valueOf.intValue() != 2) {
            z = false;
        }
        if (z) {
            View view2 = (View) this.LJLJJLL.getValue();
            if (view2 != null) {
                Context context = getContext();
                if (context != null) {
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZIZ = Integer.valueOf(R.attr.ci);
                    c110614Vt.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(16));
                    c110614Vt.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(16));
                    drawable2 = c110614Vt.LIZ(context);
                } else {
                    drawable2 = null;
                }
                view2.setBackground(drawable2);
            }
        } else {
            View view3 = (View) this.LJLJJLL.getValue();
            if (view3 != null) {
                Context context2 = getContext();
                if (context2 != null) {
                    C110614Vt c110614Vt2 = new C110614Vt();
                    c110614Vt2.LIZIZ = Integer.valueOf(R.attr.c9);
                    c110614Vt2.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(16));
                    c110614Vt2.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(16));
                    drawable = c110614Vt2.LIZ(context2);
                } else {
                    drawable = null;
                }
                view3.setBackground(drawable);
            }
        }
        C74042T4c c74042T4c = (C74042T4c) this.LJLJJI.getValue();
        if (c74042T4c != null) {
            c74042T4c.setIndicator(this.LJZL);
        }
        TuxIconView tuxIconView = (TuxIconView) this.LJLJI.getValue();
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS30S0100000_10(this, 56));
        }
        SY4 sy4 = (SY4) this.LJLJJL.getValue();
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS45S0200000_10(this, view, 8));
        }
        View view4 = (View) this.LJLJJL.getValue();
        if (view4 != null) {
            Context context3 = getContext();
            if (context3 != null) {
                C110614Vt c110614Vt3 = new C110614Vt();
                c110614Vt3.LIZIZ = Integer.valueOf(R.attr.eb);
                c110614Vt3.LIZJ = C61328O5c.LIZJ(8);
                drawable3 = c110614Vt3.LIZ(context3);
            }
            view4.setBackground(drawable3);
        }
        C74042T4c c74042T4c2 = (C74042T4c) this.LJLJJI.getValue();
        if (c74042T4c2 == null) {
            return;
        }
        c74042T4c2.setOnSliderListener(new OPD(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ckn, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
