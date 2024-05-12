package com.google.android.gms.cast.framework.media.widget;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90272Zbo;
import X.C90464Zeu;
import X.C90469Zez;
import X.C90613ZhJ;
import X.C90657Zi1;
import X.C90660Zi4;
import X.C90668ZiC;
import X.C90717Ziz;
import X.C90720Zj2;
import X.C90730ZjC;
import X.C90736ZjI;
import X.C90747ZjT;
import X.C90753ZjZ;
import X.C90757Zjd;
import X.C90760Zjg;
import X.C90766Zjm;
import X.C90771Zjr;
import X.C90816Zka;
import X.C90903hW;
import X.EnumC90770Zjq;
import X.QH7;
import X.ViewOnClickListenerC90448Zee;
import X.ViewOnClickListenerC90449Zef;
import X.ViewOnClickListenerC90450Zeg;
import X.ViewOnClickListenerC90451Zeh;
import X.ViewOnClickListenerC90452Zei;
import X.ViewOnClickListenerC90453Zej;
import X.ViewOnClickListenerC90454Zek;
import X.ViewOnClickListenerC90455Zel;
import X.ZYS;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes29.dex */
public class MiniControllerFragment extends Fragment {
    public static final C90469Zez LLFFF = new C90469Zez("MiniControllerFragment");
    public boolean LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public TextView LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int[] LJLJLLL;
    public final ImageView[] LJLL = new ImageView[3];
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public C90816Zka LLFF;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C90816Zka c90816Zka = this.LLFF;
        if (c90816Zka != null) {
            QH7.LJ("Must be called from the main thread.");
            c90816Zka.LJIILLIIL();
            ((HashMap) c90816Zka.LIZJ).clear();
            ZYS zys = c90816Zka.LIZIZ;
            if (zys != null) {
                zys.LJ(c90816Zka, C90613ZhJ.class);
            }
            this.LLFF = null;
        }
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        C90816Zka c90816Zka = new C90816Zka(mo49getActivity());
        this.LLFF = c90816Zka;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.d, inflater, viewGroup);
        LLLZIIL.setVisibility(8);
        QH7.LJ("Must be called from the main thread.");
        c90816Zka.LJIJ(LLLZIIL, new C90668ZiC(LLLZIIL));
        RelativeLayout relativeLayout = (RelativeLayout) LLLZIIL.findViewById(R.id.a4);
        int i = this.LJLJJL;
        if (i != 0) {
            relativeLayout.setBackgroundResource(i);
        }
        ImageView imageView = (ImageView) LLLZIIL.findViewById(R.id.ecz);
        TextView textView = (TextView) LLLZIIL.findViewById(R.id.las);
        if (this.LJLILLLLZI != 0) {
            textView.setTextAppearance(mo49getActivity(), this.LJLILLLLZI);
        }
        TextView textView2 = (TextView) LLLZIIL.findViewById(R.id.bt);
        this.LJLJJI = textView2;
        if (this.LJLJI != 0) {
            textView2.setTextAppearance(mo49getActivity(), this.LJLJI);
        }
        ProgressBar progressBar = (ProgressBar) LLLZIIL.findViewById(R.id.ia_);
        if (this.LJLJJLL != 0) {
            progressBar.getProgressDrawable().setColorFilter(this.LJLJJLL, PorterDuff.Mode.SRC_IN);
        }
        QH7.LJ("Must be called from the main thread.");
        List singletonList = Collections.singletonList("com.google.android.gms.cast.metadata.TITLE");
        QH7.LJ("Must be called from the main thread.");
        c90816Zka.LJIJ(textView, new C90747ZjT(textView, singletonList));
        TextView textView3 = this.LJLJJI;
        QH7.LJ("Must be called from the main thread.");
        c90816Zka.LJIJ(textView3, new C90660Zi4(textView3));
        QH7.LJ("Must be called from the main thread.");
        c90816Zka.LJIJ(progressBar, new C90760Zjg(progressBar));
        QH7.LJ("Must be called from the main thread.");
        C16880lQ.LJIIJ(new ViewOnClickListenerC90454Zek(c90816Zka), relativeLayout);
        c90816Zka.LJIJ(relativeLayout, new C90736ZjI(relativeLayout));
        if (this.LJLIL) {
            ImageHints imageHints = new ImageHints(2, getResources().getDimensionPixelSize(R.dimen.a1), getResources().getDimensionPixelSize(R.dimen.a0));
            QH7.LJ("Must be called from the main thread.");
            c90816Zka.LJIJ(imageView, new C90730ZjC(imageView, c90816Zka.LIZ, imageHints));
        } else {
            imageView.setVisibility(8);
        }
        this.LJLL[0] = relativeLayout.findViewById(R.id.k);
        this.LJLL[1] = relativeLayout.findViewById(R.id.l);
        this.LJLL[2] = relativeLayout.findViewById(R.id.m);
        vl(c90816Zka, relativeLayout, R.id.k, 0);
        vl(c90816Zka, relativeLayout, R.id.l, 1);
        vl(c90816Zka, relativeLayout, R.id.m, 2);
        try {
            ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
            C10A.LIZIZ(LLLZIIL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLZIIL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        boolean z;
        super.onInflate(context, attributeSet, bundle);
        if (this.LJLJLLL == null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.h, R.attr.k, R.attr.n, R.attr.o, R.attr.u, R.attr.w, R.attr.x, R.attr.y, R.attr.a0, R.attr.a2, R.attr.a3, R.attr.a4, R.attr.a5, R.attr.a6, R.attr.ac, R.attr.ad, R.attr.ae, R.attr.af, R.attr.ag, R.attr.ah}, R.attr.a1, R.style.c);
            this.LJLIL = obtainStyledAttributes.getBoolean(14, true);
            this.LJLILLLLZI = obtainStyledAttributes.getResourceId(19, 0);
            this.LJLJI = obtainStyledAttributes.getResourceId(18, 0);
            this.LJLJJL = obtainStyledAttributes.getResourceId(0, 0);
            int color = obtainStyledAttributes.getColor(12, 0);
            this.LJLJJLL = color;
            this.LJLJL = obtainStyledAttributes.getColor(8, color);
            this.LJLJLJ = obtainStyledAttributes.getResourceId(1, 0);
            this.LJLLILLLL = obtainStyledAttributes.getResourceId(11, 0);
            this.LJLLJ = obtainStyledAttributes.getResourceId(10, 0);
            this.LJLLL = obtainStyledAttributes.getResourceId(17, 0);
            this.LJLLLL = obtainStyledAttributes.getResourceId(11, 0);
            this.LJLLLLLL = obtainStyledAttributes.getResourceId(10, 0);
            this.LJLZ = obtainStyledAttributes.getResourceId(17, 0);
            this.LJZ = obtainStyledAttributes.getResourceId(16, 0);
            this.LJZI = obtainStyledAttributes.getResourceId(15, 0);
            this.LJZL = obtainStyledAttributes.getResourceId(13, 0);
            this.LL = obtainStyledAttributes.getResourceId(4, 0);
            this.LLD = obtainStyledAttributes.getResourceId(9, 0);
            this.LLF = obtainStyledAttributes.getResourceId(2, 0);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
                if (obtainTypedArray.length() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                QH7.LIZIZ(z);
                this.LJLJLLL = new int[obtainTypedArray.length()];
                for (int i = 0; i < obtainTypedArray.length(); i++) {
                    this.LJLJLLL[i] = obtainTypedArray.getResourceId(i, 0);
                }
                obtainTypedArray.recycle();
                if (this.LJLIL) {
                    this.LJLJLLL[0] = R.id.r;
                }
                this.LJLLI = 0;
                for (int i2 : this.LJLJLLL) {
                    if (i2 != R.id.r) {
                        this.LJLLI++;
                    }
                }
            } else {
                LLFFF.getClass();
                this.LJLJLLL = new int[]{R.id.r, R.id.r, R.id.r};
            }
            obtainStyledAttributes.recycle();
        }
        C90272Zbo.LIZ(EnumC90770Zjq.CAF_MINI_CONTROLLER);
    }

    public final void vl(C90816Zka c90816Zka, RelativeLayout relativeLayout, int i, int i2) {
        ImageView imageView = (ImageView) relativeLayout.findViewById(i);
        int i3 = this.LJLJLLL[i2];
        if (i3 == R.id.r) {
            imageView.setVisibility(4);
            return;
        }
        if (i3 == R.id.q) {
            return;
        }
        if (i3 == R.id.u) {
            int i4 = this.LJLLILLLL;
            int i5 = this.LJLLJ;
            int i6 = this.LJLLL;
            if (this.LJLLI == 1) {
                i4 = this.LJLLLL;
                i5 = this.LJLLLLLL;
                i6 = this.LJLZ;
            }
            Drawable LIZ = C90464Zeu.LIZ(this.LJLJLJ, i4, getContext());
            Drawable LIZ2 = C90464Zeu.LIZ(this.LJLJLJ, i5, getContext());
            Drawable LIZ3 = C90464Zeu.LIZ(this.LJLJLJ, i6, getContext());
            imageView.setImageDrawable(LIZ2);
            ProgressBar progressBar = new ProgressBar(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(8, i);
            layoutParams.addRule(6, i);
            layoutParams.addRule(5, i);
            layoutParams.addRule(7, i);
            layoutParams.addRule(15);
            progressBar.setLayoutParams(layoutParams);
            progressBar.setVisibility(8);
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            int i7 = this.LJLJL;
            if (i7 != 0 && indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(i7, PorterDuff.Mode.SRC_IN);
            }
            relativeLayout.addView(progressBar);
            QH7.LJ("Must be called from the main thread.");
            C90272Zbo.LIZ(EnumC90770Zjq.PAUSE_CONTROLLER);
            C16880lQ.LJIILLIIL(imageView, new ViewOnClickListenerC90449Zef(c90816Zka));
            c90816Zka.LJIJ(imageView, new C90757Zjd(imageView, c90816Zka.LIZ, LIZ, LIZ2, LIZ3, progressBar));
            return;
        }
        if (i3 == R.id.x) {
            imageView.setImageDrawable(C90464Zeu.LIZ(this.LJLJLJ, this.LJZ, getContext()));
            imageView.setContentDescription(getResources().getString(R.string.a9));
            QH7.LJ("Must be called from the main thread.");
            C16880lQ.LJIIJ(new ViewOnClickListenerC90451Zeh(c90816Zka), imageView);
            c90816Zka.LJIJ(imageView, new C90657Zi1(imageView));
            return;
        }
        if (i3 == R.id.w) {
            imageView.setImageDrawable(C90464Zeu.LIZ(this.LJLJLJ, this.LJZI, getContext()));
            imageView.setContentDescription(getResources().getString(R.string.a8));
            QH7.LJ("Must be called from the main thread.");
            C16880lQ.LJIIJ(new ViewOnClickListenerC90450Zeg(c90816Zka), imageView);
            c90816Zka.LJIJ(imageView, new C90771Zjr(imageView));
            return;
        }
        if (i3 == R.id.v) {
            imageView.setImageDrawable(C90464Zeu.LIZ(this.LJLJLJ, this.LJZL, getContext()));
            imageView.setContentDescription(getResources().getString(R.string.a6));
            QH7.LJ("Must be called from the main thread.");
            C16880lQ.LJIIJ(new ViewOnClickListenerC90453Zej(c90816Zka), imageView);
            c90816Zka.LJIJ(imageView, new C90766Zjm(imageView, c90816Zka.LIZLLL));
            return;
        }
        if (i3 == R.id.s) {
            imageView.setImageDrawable(C90464Zeu.LIZ(this.LJLJLJ, this.LL, getContext()));
            imageView.setContentDescription(getResources().getString(R.string.s));
            QH7.LJ("Must be called from the main thread.");
            C16880lQ.LJIIJ(new ViewOnClickListenerC90452Zei(c90816Zka), imageView);
            c90816Zka.LJIJ(imageView, new C90720Zj2(imageView, c90816Zka.LIZLLL));
            return;
        }
        if (i3 == R.id.t) {
            imageView.setImageDrawable(C90464Zeu.LIZ(this.LJLJLJ, this.LLD, getContext()));
            QH7.LJ("Must be called from the main thread.");
            C16880lQ.LJIILLIIL(imageView, new ViewOnClickListenerC90448Zee(c90816Zka));
            c90816Zka.LJIJ(imageView, new C90753ZjZ(c90816Zka.LIZ, imageView));
            return;
        }
        if (i3 != R.id.p) {
            return;
        }
        imageView.setImageDrawable(C90464Zeu.LIZ(this.LJLJLJ, this.LLF, getContext()));
        QH7.LJ("Must be called from the main thread.");
        C16880lQ.LJIIJ(new ViewOnClickListenerC90455Zel(c90816Zka), imageView);
        c90816Zka.LJIJ(imageView, new C90717Ziz(c90816Zka.LIZ, imageView));
    }
}
