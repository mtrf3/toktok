package X;

import Y.ACListenerS30S0100000_10;
import Y.IDLListenerS61S0200000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragmentV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OPK implements ViewStub.OnInflateListener {
    public final /* synthetic */ ProfileAigcIntroFragmentV2 LIZ;
    public final /* synthetic */ View LIZIZ;

    public OPK(ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV2, View view) {
        this.LIZ = profileAigcIntroFragmentV2;
        this.LIZIZ = view;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        boolean z;
        ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV2 = this.LIZ;
        profileAigcIntroFragmentV2.LJLLJ = profileAigcIntroFragmentV2._$_findCachedViewById(R.id.ht6);
        ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV22 = this.LIZ;
        profileAigcIntroFragmentV22.LJLLL = profileAigcIntroFragmentV22._$_findCachedViewById(R.id.fuh);
        C16880lQ.LJIILJJIL((FrameLayout) this.LIZ._$_findCachedViewById(R.id.ht6), new ACListenerS30S0100000_10(this.LIZ, 53));
        ((C71897SJp) this.LIZ._$_findCachedViewById(R.id.ht7)).setInterceptToggleListener(new AqS160S0100000_10(this.LIZ, 307));
        C16880lQ.LJIILJJIL((FrameLayout) this.LIZ._$_findCachedViewById(R.id.fuh), new ACListenerS30S0100000_10(this.LIZ, 54));
        ((C71897SJp) this.LIZ._$_findCachedViewById(R.id.fui)).setInterceptToggleListener(new AqS160S0100000_10(this.LIZ, 308));
        ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV23 = this.LIZ;
        Context context = this.LIZIZ.getContext();
        o.LJIIIIZZ(context, "view.context");
        profileAigcIntroFragmentV23.getClass();
        if (C63081OpJ.LJJJJL(context) <= 680) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C221018lt.LIZ("ProfileAigcIntroFragment", "is using small screen");
            ((AppCompatTextView) profileAigcIntroFragmentV23._$_findCachedViewById(R.id.htb)).setTextSize(2, 8.0f);
            ((TextView) profileAigcIntroFragmentV23._$_findCachedViewById(R.id.ht8)).setMaxLines(2);
            ((AppCompatTextView) profileAigcIntroFragmentV23._$_findCachedViewById(R.id.ht8)).setTextSize(2, 6.0f);
            ((AppCompatTextView) profileAigcIntroFragmentV23._$_findCachedViewById(R.id.fuo)).setTextSize(2, 8.0f);
            ((TextView) profileAigcIntroFragmentV23._$_findCachedViewById(R.id.fuj)).setMaxLines(2);
            ((AppCompatTextView) profileAigcIntroFragmentV23._$_findCachedViewById(R.id.fuj)).setTextSize(2, 6.0f);
            ViewGroup.LayoutParams layoutParams = profileAigcIntroFragmentV23._$_findCachedViewById(R.id.htb).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ViewGroup.LayoutParams layoutParams2 = profileAigcIntroFragmentV23._$_findCachedViewById(R.id.ht8).getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            ViewGroup.LayoutParams layoutParams3 = profileAigcIntroFragmentV23._$_findCachedViewById(R.id.fuo).getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            ViewGroup.LayoutParams layoutParams4 = profileAigcIntroFragmentV23._$_findCachedViewById(R.id.fuj).getLayoutParams();
            o.LJII(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
            View _$_findCachedViewById = profileAigcIntroFragmentV23._$_findCachedViewById(R.id.htb);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("plus title LP1: ");
            LIZ.append(marginLayoutParams);
            C221018lt.LIZ("ProfileAigcIntroFragment", X1D.LIZIZ(LIZ));
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 10, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            _$_findCachedViewById.setLayoutParams(marginLayoutParams);
            View _$_findCachedViewById2 = profileAigcIntroFragmentV23._$_findCachedViewById(R.id.ht8);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("plus content LP1: ");
            LIZ2.append(marginLayoutParams2);
            C221018lt.LIZ("ProfileAigcIntroFragment", X1D.LIZIZ(LIZ2));
            marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, 10);
            _$_findCachedViewById2.setLayoutParams(marginLayoutParams2);
            View _$_findCachedViewById3 = profileAigcIntroFragmentV23._$_findCachedViewById(R.id.fuo);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("lite title LP1: ");
            LIZ3.append(marginLayoutParams3);
            C221018lt.LIZ("ProfileAigcIntroFragment", X1D.LIZIZ(LIZ3));
            marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, 10, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
            _$_findCachedViewById3.setLayoutParams(marginLayoutParams3);
            View _$_findCachedViewById4 = profileAigcIntroFragmentV23._$_findCachedViewById(R.id.fuj);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("lite content LP1: ");
            LIZ4.append(marginLayoutParams4);
            C221018lt.LIZ("ProfileAigcIntroFragment", X1D.LIZIZ(LIZ4));
            marginLayoutParams4.setMargins(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, 10);
            _$_findCachedViewById4.setLayoutParams(marginLayoutParams4);
        }
        ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV24 = this.LIZ;
        if (!profileAigcIntroFragmentV24.LJZI) {
            View view2 = profileAigcIntroFragmentV24.LJLLJ;
            if (view2 != null) {
                view2.setAlpha(0.3f);
            }
            View view3 = profileAigcIntroFragmentV24.LJLLL;
            if (view3 != null) {
                view3.setAlpha(0.3f);
            }
        }
        C76732zl c76732zl = new C76732zl();
        this.LIZ._$_findCachedViewById(R.id.ht8).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS61S0200000_10(c76732zl, this.LIZ, 1));
        this.LIZ._$_findCachedViewById(R.id.fuj).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS61S0200000_10(c76732zl, this.LIZ, 2));
    }
}
