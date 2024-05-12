package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.AnonymousClass898;
import X.C109824Ss;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C2NU;
import X.C33884DRo;
import X.C3C5;
import X.C62822Ol8;
import X.C72062SPy;
import X.C72108SRs;
import X.C76800UCe;
import X.C7MY;
import X.C85712XkS;
import X.C85837XmT;
import X.C90903hW;
import X.C9KF;
import X.C9W6;
import X.C9WN;
import X.EP5;
import X.EnumC252729vw;
import X.InterfaceC18010nF;
import X.RAN;
import X.ViewOnClickListenerC85743Xkx;
import X.ViewOnClickListenerC85744Xky;
import X.X1D;
import Y.ACListenerS35S0100000_15;
import Y.ACListenerS40S0300000_15;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseI18nLoginFragment extends BaseAccountFlowFragment implements C9WN, InterfaceC18010nF {
    public AccountKeyBoardHelper LJLLLLLL;
    public C85712XkS LJLZ;
    public boolean LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();

    public abstract void Hl();

    public void Il() {
    }

    public abstract C85712XkS Jl();

    public int Kl() {
        return 1;
    }

    public void LLFII() {
    }

    public abstract void Pl();

    public void Rg() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract int getLayout();

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public boolean onBackPressed() {
        return false;
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    public final boolean Ll() {
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            return true;
        }
        String string = getString(R.string.img);
        o.LJIIIIZZ(string, "getString(R.string.network_unavailable)");
        Sg(0, string);
        return false;
    }

    public void Nl() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.onBackPressed();
        }
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return RAN.LIZ(Al());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Hl();
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.LJLLLLLL;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.LJLJLJ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.LJLLLLLL;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.LJLJLJ = this;
        }
    }

    public final CharSequence Ml(TuxTextView tuxTextView) {
        CharSequence charSequence;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 19));
        if (!EP5.LIZ()) {
            String str = (String) LIZIZ.getValue();
            o.LJIIIIZZ(str, "{\n            fallback\n        }");
            return str;
        }
        Context context = getContext();
        if (context != null) {
            C72062SPy c72062SPy = new C72062SPy();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(' ');
            LIZ.append(getString(R.string.g1y));
            LIZ.append(' ');
            c72062SPy.LIZLLL(X1D.LIZIZ(LIZ));
            c72062SPy.LJ(1);
            c72062SPy.LIZ = false;
            c72062SPy.LIZIZ(62);
            c72062SPy.LJFF = new AqS163S0100000_13(this, 55);
            CharSequence LIZ2 = c72062SPy.LIZ(context);
            tuxTextView.setMovementMethod(AnonymousClass898.LIZ);
            charSequence = SpannableString.valueOf(new SpannableStringBuilder(getString(R.string.r0b)).append(LIZ2));
        } else {
            charSequence = (String) LIZIZ.getValue();
        }
        o.LJIIIIZZ(charSequence, "internal fun obtainEmail…        }\n        }\n    }");
        return charSequence;
    }

    @Override // X.InterfaceC69056R8i
    public final void ee(int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            if (isViewValid()) {
                Pl();
                return;
            } else {
                this.LJZ = true;
                return;
            }
        }
        if (isViewValid()) {
            if (C33884DRo.LIZJ()) {
                return;
            }
            Hl();
        } else {
            if (!this.LJZ) {
                return;
            }
            this.LJZ = false;
        }
    }

    public final void Ol(View.OnClickListener onClickListener, View view) {
        o.LJIIIZ(onClickListener, "onClickListener");
        if (view == null) {
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS40S0300000_15(view, this, onClickListener, 0), view);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C2068389v c2068389v;
        Integer num;
        boolean z;
        String str3;
        boolean z2;
        int i;
        EnumC252729vw enumC252729vw;
        EnumC252729vw enumC252729vw2;
        int i2;
        C85712XkS c85712XkS;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (o.LJ(this.LJLLL.getValue(), Boolean.TRUE)) {
            return;
        }
        C85712XkS Jl = Jl();
        this.LJLZ = Jl;
        if (Jl == null) {
            _$_findCachedViewById(R.id.aha).setVisibility(8);
            _$_findCachedViewById(R.id.ah7).setVisibility(8);
            _$_findCachedViewById(R.id.ah9).setVisibility(8);
            _$_findCachedViewById(R.id.ah8).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ah_)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ahb)).setVisibility(8);
        } else {
            String str4 = Jl.LIZ;
            if (str4 == null || TextUtils.isEmpty(str4)) {
                _$_findCachedViewById(R.id.aha).setVisibility(8);
            } else {
                C235119Kp c235119Kp = new C235119Kp();
                C85712XkS c85712XkS2 = this.LJLZ;
                if (c85712XkS2 != null) {
                    z = c85712XkS2.LJIILLIIL;
                } else {
                    z = false;
                }
                c235119Kp.LIZLLL = z;
                C9KF c9kf = new C9KF();
                c9kf.LIZJ = str4;
                c235119Kp.LIZJ = c9kf;
                C85712XkS c85712XkS3 = this.LJLZ;
                o.LJI(c85712XkS3);
                String str5 = c85712XkS3.LIZIZ;
                C85712XkS c85712XkS4 = this.LJLZ;
                if (c85712XkS4 != null) {
                    str3 = c85712XkS4.LIZLLL;
                } else {
                    str3 = null;
                }
                o.LJI(c85712XkS4);
                boolean z3 = c85712XkS4.LJFF;
                C85712XkS c85712XkS5 = this.LJLZ;
                if (c85712XkS5 != null) {
                    z2 = c85712XkS5.LJI;
                } else {
                    z2 = false;
                }
                if (str5 != null && !TextUtils.isEmpty(str5)) {
                    AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
                    C234509Ig c234509Ig = new C234509Ig();
                    c234509Ig.LIZJ = str5;
                    C85712XkS c85712XkS6 = this.LJLZ;
                    if (c85712XkS6 == null || (enumC252729vw2 = c85712XkS6.LIZJ) == null) {
                        enumC252729vw2 = EnumC252729vw.SECONDARY;
                    }
                    c234509Ig.LIZ(enumC252729vw2);
                    c234509Ig.LIZ = new C109824Ss(new AqS165S0100000_15(this, 15));
                    abstractC234519IhArr[0] = c234509Ig;
                    c235119Kp.LIZLLL(abstractC234519IhArr);
                } else if (z3) {
                    AbstractC234519Ih[] abstractC234519IhArr2 = new AbstractC234519Ih[1];
                    C234529Ii c234529Ii = new C234529Ii();
                    if (z2) {
                        i = R.raw.icon_x_mark;
                    } else {
                        i = R.raw.icon_arrow_left_ltr;
                    }
                    c234529Ii.LIZJ();
                    c234529Ii.LIZJ = i;
                    String string = getString(R.string.aub);
                    o.LJIIIIZZ(string, "getString(R.string.acces…lityLabels_settings_back)");
                    c234529Ii.LJII = string;
                    c234529Ii.LIZIZ(new AqS165S0100000_15(this, 16));
                    abstractC234519IhArr2[0] = c234529Ii;
                    c235119Kp.LIZLLL(abstractC234519IhArr2);
                }
                C85712XkS c85712XkS7 = this.LJLZ;
                o.LJI(c85712XkS7);
                if (c85712XkS7.LJIILIIL) {
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZ = R.raw.icon_question_mark_circle_ltr;
                    c2068389v2.LJ = Integer.valueOf(R.attr.gv);
                    c2068389v2.LIZJ = C7MY.LIZIZ(20);
                    c2068389v2.LIZIZ = C7MY.LIZIZ(20);
                    C234529Ii c234529Ii2 = new C234529Ii();
                    c234529Ii2.LIZ(c2068389v2);
                    c234529Ii2.LIZIZ(new AqS165S0100000_15(this, 17));
                    c235119Kp.LIZIZ(c234529Ii2);
                } else if (str3 != null && !TextUtils.isEmpty(str3)) {
                    AbstractC234519Ih[] abstractC234519IhArr3 = new AbstractC234519Ih[1];
                    C234509Ig c234509Ig2 = new C234509Ig();
                    c234509Ig2.LIZJ = str3;
                    C85712XkS c85712XkS8 = this.LJLZ;
                    if (c85712XkS8 == null || (enumC252729vw = c85712XkS8.LJ) == null) {
                        enumC252729vw = EnumC252729vw.SECONDARY;
                    }
                    c234509Ig2.LIZ(enumC252729vw);
                    c234509Ig2.LIZ = new C109824Ss(new AqS165S0100000_15(this, 18));
                    abstractC234519IhArr3[0] = c234509Ig2;
                    c235119Kp.LIZIZ(abstractC234519IhArr3);
                    _$_findCachedViewById(R.id.aha).setVisibility(0);
                }
                ((C252709vu) _$_findCachedViewById(R.id.aha)).setNavActions(c235119Kp);
            }
            C85712XkS c85712XkS9 = this.LJLZ;
            o.LJI(c85712XkS9);
            if (TextUtils.isEmpty(c85712XkS9.LJIIIIZZ)) {
                _$_findCachedViewById(R.id.ah9).setVisibility(8);
            } else {
                TextView textView = (TextView) _$_findCachedViewById(R.id.ah9);
                C85712XkS c85712XkS10 = this.LJLZ;
                o.LJI(c85712XkS10);
                textView.setText(c85712XkS10.LJIIIIZZ);
            }
            C85712XkS c85712XkS11 = this.LJLZ;
            o.LJI(c85712XkS11);
            if (TextUtils.isEmpty(c85712XkS11.LJII)) {
                _$_findCachedViewById(R.id.ah7).setVisibility(8);
            } else {
                TextView textView2 = (TextView) _$_findCachedViewById(R.id.ah7);
                C85712XkS c85712XkS12 = this.LJLZ;
                o.LJI(c85712XkS12);
                textView2.setText(c85712XkS12.LJII);
                _$_findCachedViewById(R.id.ah7).setVisibility(0);
            }
            C85712XkS c85712XkS13 = this.LJLZ;
            o.LJI(c85712XkS13);
            if (TextUtils.isEmpty(c85712XkS13.LJIIIZ)) {
                _$_findCachedViewById(R.id.ah8).setVisibility(8);
            } else {
                C85712XkS c85712XkS14 = this.LJLZ;
                if (c85712XkS14 != null) {
                    str = c85712XkS14.LJIIIZ;
                } else {
                    str = null;
                }
                if (o.LJ(str, getString(R.string.jjb))) {
                    C85837XmT.LIZJ(getContext(), (TuxTextView) _$_findCachedViewById(R.id.ah8), 3, Integer.valueOf(Kl()), ViewOnClickListenerC85743Xkx.LJLIL);
                } else if (o.LJ(str, getString(R.string.hxo)) || o.LJ(str, getString(R.string.g1t))) {
                    C85837XmT.LIZJ(getContext(), (TuxTextView) _$_findCachedViewById(R.id.ah8), 2, Integer.valueOf(Kl()), ViewOnClickListenerC85744Xky.LJLIL);
                } else if (o.LJ(str, getString(R.string.r0b))) {
                    TextView textView3 = (TextView) _$_findCachedViewById(R.id.ah8);
                    TuxTextView baseI18nContentDesc = (TuxTextView) _$_findCachedViewById(R.id.ah8);
                    o.LJIIIIZZ(baseI18nContentDesc, "baseI18nContentDesc");
                    textView3.setText(Ml(baseI18nContentDesc));
                } else {
                    TextView textView4 = (TextView) _$_findCachedViewById(R.id.ah8);
                    C85712XkS c85712XkS15 = this.LJLZ;
                    if (c85712XkS15 != null) {
                        str2 = c85712XkS15.LJIIIZ;
                    } else {
                        str2 = null;
                    }
                    textView4.setText(str2);
                }
            }
            C85712XkS c85712XkS16 = this.LJLZ;
            if (c85712XkS16 != null && (num = c85712XkS16.LJIIJ) != null) {
                ((ImageView) _$_findCachedViewById(R.id.ah_)).setImageResource(num.intValue());
                ((ImageView) _$_findCachedViewById(R.id.ah_)).setVisibility(0);
            }
            C85712XkS c85712XkS17 = this.LJLZ;
            if (c85712XkS17 != null && (c2068389v = c85712XkS17.LJIILL) != null) {
                TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.ahb);
                tuxIconView.setVisibility(0);
                tuxIconView.setTuxIcon(c2068389v);
            }
            Il();
        }
        if (_$_findCachedViewById(R.id.aha).getVisibility() == 8 || (c85712XkS = this.LJLZ) == null || !c85712XkS.LJIILIIL || !TextUtils.isEmpty(c85712XkS.LJIIL)) {
            C85712XkS c85712XkS18 = this.LJLZ;
            if (c85712XkS18 != null && c85712XkS18.LJIIJJI) {
                View login_root_view = _$_findCachedViewById(R.id.g_7);
                o.LJIIIIZZ(login_root_view, "login_root_view");
                this.LJLLLLLL = new AccountKeyBoardHelper(login_root_view, this);
            }
            C85712XkS c85712XkS19 = this.LJLZ;
            if (c85712XkS19 != null && c85712XkS19.LJIILJJIL && !C9W6.LIZ()) {
                C16880lQ.LJIIJ(new ACListenerS35S0100000_15(view, 52), view);
            }
            Bundle arguments = getArguments();
            if (arguments != null && (i2 = arguments.getInt("progress", -1)) >= 0) {
                C72108SRs c72108SRs = (C72108SRs) _$_findCachedViewById(R.id.iac);
                c72108SRs.setVisibility(0);
                c72108SRs.setProgress(i2);
                c72108SRs.setAutoDisappear(false);
                return;
            }
            return;
        }
        "please pass pageName".toString();
        throw new IllegalStateException("please pass pageName");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ob, viewGroup, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.LinearLayout");
        ViewGroup viewGroup2 = (ViewGroup) LLLLIILL;
        viewGroup2.addView(C16880lQ.LLLLIILL(inflater, getLayout(), viewGroup2, false));
        try {
            ViewTreeLifecycleOwner.set(viewGroup2, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewGroup2, this);
            C10A.LIZIZ(viewGroup2, this);
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
        return viewGroup2;
    }
}
