package com.ss.android.ugc.aweme.unlogin;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C04330Ez;
import X.C10A;
import X.C116694i1;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C18000nE;
import X.C188787b0;
import X.C2068389v;
import X.C221108m2;
import X.C29S;
import X.C34037DXl;
import X.C3C5;
import X.C40883G2t;
import X.C46340IGq;
import X.C47261Igj;
import X.C53260KvI;
import X.C53765L8f;
import X.C54022LIc;
import X.C61878OQg;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C6ZT;
import X.C73969T1h;
import X.C76800UCe;
import X.C78999UzT;
import X.C7MY;
import X.C90903hW;
import X.HG3;
import X.IKV;
import X.INB;
import X.InterfaceC34471Wx;
import X.InterfaceC53896LDg;
import X.J9P;
import X.LKK;
import X.LKL;
import X.LKX;
import X.QD3;
import X.RBX;
import X.SY4;
import X.ViewOnClickListenerC54034LIo;
import Y.ACListenerS29S0100000_9;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import Y.AfS61S0100000_9;
import Y.IDgS349S0100000_9;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hox.Hox;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UnloginSignUpFragment extends CommonPageFragment implements View.OnClickListener, InterfaceC53896LDg, InterfaceC34471Wx {
    public LKX LJLILLLLZI;
    public View LJLJJI;
    public final boolean LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public boolean LJLJI = true;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    @Override // X.InterfaceC34471Wx
    public final String xi() {
        return "MainTabPage";
    }

    public UnloginSignUpFragment() {
        boolean z = true;
        if (!C53260KvI.LIZIZ && !PrevLoginPlatformService.LJIIL().LJI()) {
            z = false;
        }
        this.LJLJJL = z;
        this.LJLJJLL = C221108m2.LIZIZ(C54022LIc.LJLIL);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        LKX lkx = this.LJLILLLLZI;
        if (lkx != null) {
            lkx.LIZJ.dispose();
            if (((AnimatorSet) lkx.LIZLLL.getValue()).isRunning()) {
                ((AnimatorSet) lkx.LIZLLL.getValue()).cancel();
            }
            Handler handler = lkx.LIZ.getHandler();
            if (handler != null) {
                ARunnableS45S0100000_9 aRunnableS45S0100000_9 = lkx.LJIILIIL;
                if (aRunnableS45S0100000_9 != null) {
                    handler.removeCallbacks(aRunnableS45S0100000_9);
                } else {
                    o.LJIJI("resetAction");
                    throw null;
                }
            }
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return C18000nE.LIZ(this);
    }

    @Override // X.InterfaceC34471Wx, X.InterfaceC18010nF
    public String getBtmPageCode() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("tab");
            if (o.LJ("UNLOGIN_NOTIFICATION", string)) {
                return "b3426";
            }
            if (o.LJ("UNLOGIN_PROFILE", string)) {
                return "b2706";
            }
            if (string != null) {
                return string;
            }
        }
        return C16880lQ.LJLLJ(UnloginSignUpFragment.class);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && o.LJ(C116694i1.LIZ(mo49getActivity).mv0(), this)) {
            C12460eI.LJIIIIZZ(this, null);
            if (((RBX) HG3.LJIILL()).isLogin()) {
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS28S0200000_9(mo49getActivity, this, 34));
            }
        }
    }

    public final void Al(int i) {
        String str;
        String str2;
        boolean z = this.LJLJI;
        String str3 = "message";
        if (z) {
            str = "message";
        } else {
            str = "personal_homepage";
        }
        String str4 = "";
        if (i != 0) {
            if (i != 1) {
                str2 = "";
            } else {
                str2 = "click_area";
            }
        } else if (z) {
            str2 = "click_message";
        } else {
            str2 = "click_mine";
        }
        C40883G2t c40883G2t = new C40883G2t();
        c40883G2t.LIZJ("show_login_page_first", this.LJLJJL);
        J9P.LIZJ(this, str, str2, (Bundle) c40883G2t.LIZ, new IDgS349S0100000_9(this, 4));
        boolean z2 = this.LJLJI;
        if (!z2) {
            str3 = "personal_homepage";
        }
        if (i != 0) {
            if (i == 1) {
                str4 = "click_area";
            }
        } else if (z2) {
            str4 = "click_message";
        } else {
            str4 = "click_mine";
        }
        C46340IGq.LIZ(str3, str4);
    }

    public final void Dl(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ((TuxTextView) _$_findCachedViewById(R.id.mtp)).setTuxFont(33);
        ((ImageView) _$_findCachedViewById(R.id.eiq)).setVisibility(8);
        _$_findCachedViewById(R.id.e5i).setVisibility(8);
        _$_findCachedViewById(R.id.azb).setVisibility(8);
        _$_findCachedViewById(R.id.l_e).setVisibility(8);
        if (i != 0) {
            if (i == 1) {
                FrameLayout unlogin_marquee = (FrameLayout) _$_findCachedViewById(R.id.mtr);
                o.LJIIIIZZ(unlogin_marquee, "unlogin_marquee");
                this.LJLILLLLZI = new LKX(unlogin_marquee, xl(i));
            }
        } else {
            FrameLayout unlogin_marquee2 = (FrameLayout) _$_findCachedViewById(R.id.mtr);
            o.LJIIIIZZ(unlogin_marquee2, "unlogin_marquee");
            this.LJLILLLLZI = new LKX(unlogin_marquee2, xl(i));
        }
        LKX lkx = this.LJLILLLLZI;
        if (lkx != null) {
            C78999UzT.LJFF(AbstractC73672Svk.LJJIJIIJI(1700L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS61S0100000_9(lkx, 33)), lkx.LIZJ);
            _$_findCachedViewById(R.id.mts).setVisibility(0);
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                View inflate = ((ViewStub) _$_findCachedViewById(R.id.mtu)).inflate();
                o.LJIIIIZZ(inflate, "unlogin_profile_content_layout_exp.inflate()");
                this.LJLJJI = inflate;
                inflate.setVisibility(0);
                View _$_findCachedViewById = _$_findCachedViewById(R.id.mts);
                int LIZIZ = C7MY.LIZIZ(60);
                if (_$_findCachedViewById == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = _$_findCachedViewById.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.topMargin = LIZIZ;
                }
                _$_findCachedViewById.requestLayout();
                return;
            }
            _$_findCachedViewById(R.id.mtq).setVisibility(0);
            ((ViewGroup) _$_findCachedViewById(R.id.mtq)).addView(wl(R.raw.icon_color_comment_circle, true));
            ((ViewGroup) _$_findCachedViewById(R.id.mtq)).addView(wl(R.raw.icon_color_like_circle_inbox, true));
            ((ViewGroup) _$_findCachedViewById(R.id.mtq)).addView(wl(R.raw.icon_color_two_person_circle, true));
            ((ViewGroup) _$_findCachedViewById(R.id.mtq)).addView(wl(R.raw.icon_color_paperplane_circle, false));
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.mts);
            int LIZIZ2 = C7MY.LIZIZ(3);
            if (_$_findCachedViewById2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById2.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = LIZIZ2;
            }
            _$_findCachedViewById2.requestLayout();
            return;
        }
        o.LJIJI("marqueeHelper");
        throw null;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        C12460eI.LJIIIIZZ(this, null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null || C6ZT.LIZ(view)) {
            return;
        }
        int id = view.getId();
        if (id == R.id.mtp || id == R.id.azb) {
            Al(0);
        } else {
            if (id != R.id.jqq) {
                return;
            }
            SmartRouter.buildRoute(mo49getActivity(), "//setting").open();
        }
    }

    @QD3
    public final void onEvent(IKV ev) {
        o.LJIIIZ(ev, "ev");
        if (!this.LJLJI) {
            if (C53765L8f.LJIJJLI() && C53765L8f.LJIIIIZZ("USER") == 1) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("fromStart", "RootNode");
                    bundle.putBoolean("isSmoothScroll", true);
                    Hox.LJLLI.LIZ(mo49getActivity).Cv0(bundle, "page_feed");
                    return;
                }
                return;
            }
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            o.LJI(mo49getActivity2);
            TabChangeManager.jv0(C116694i1.LIZ(mo49getActivity2), "HOME", false, 30);
        }
    }

    public final List<String> xl(int i) {
        if (i != 0) {
            if (i != 1) {
                return C61878OQg.INSTANCE;
            }
            String string = getString(R.string.i8_);
            o.LJIIIIZZ(string, "getString(R.string.motiv…login_profile_carousel_1)");
            String string2 = getString(R.string.i8a);
            o.LJIIIIZZ(string2, "getString(R.string.motiv…login_profile_carousel_2)");
            String string3 = getString(R.string.i8b);
            o.LJIIIIZZ(string3, "getString(R.string.motiv…login_profile_carousel_3)");
            return C47261Igj.LJJIJIIJI(string, string2, string3);
        }
        String string4 = getString(R.string.i83);
        o.LJIIIIZZ(string4, "getString(R.string.motiv…e_login_inbox_carousel_1)");
        String string5 = getString(R.string.i84);
        o.LJIIIIZZ(string5, "getString(R.string.motiv…e_login_inbox_carousel_2)");
        String string6 = getString(R.string.i85);
        o.LJIIIIZZ(string6, "getString(R.string.motiv…e_login_inbox_carousel_3)");
        return C47261Igj.LJJIJIIJI(string4, string5, string6);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(LKK.LJLIL);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("tab");
        } else {
            str = null;
        }
        this.LJLJI = TextUtils.equals(str, "UNLOGIN_NOTIFICATION");
        Context context = getContext();
        if (context != null) {
            i = C63081OpJ.LJJJJLI(context);
        } else {
            i = 0;
        }
        if (i > 0) {
            _$_findCachedViewById(R.id.dqx).getLayoutParams().height = i;
        } else {
            _$_findCachedViewById(R.id.dqx).setVisibility(8);
        }
        if (this.LJLJI) {
            if (!C53765L8f.LJIIL("NOTIFICATION") && C53765L8f.LJIIIIZZ("NOTIFICATION") == 1) {
                ImageView back_left = (ImageView) _$_findCachedViewById(R.id.aew);
                o.LJIIIIZZ(back_left, "back_left");
                back_left.setVisibility(0);
                C16880lQ.LJIIJ(new ViewOnClickListenerC54034LIo(this), back_left);
            } else if (!C53765L8f.LJIIL("NOTIFICATION") && C53765L8f.LJIILJJIL()) {
                ImageView back_right = (ImageView) _$_findCachedViewById(R.id.aez);
                o.LJIIIIZZ(back_right, "back_right");
                back_right.setVisibility(0);
                C16880lQ.LJIIJ(new ViewOnClickListenerC54034LIo(this), back_right);
            } else {
                ((ImageView) _$_findCachedViewById(R.id.aew)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.aez)).setVisibility(8);
            }
            TextView textView = (TextView) _$_findCachedViewById(R.id.mo6);
            Context context2 = view.getContext();
            if (INB.LIZIZ()) {
                i3 = R.string.iwu;
            } else {
                i3 = R.string.dpi;
            }
            textView.setText(context2.getText(i3));
            if (C34037DXl.LIZ()) {
                Dl(0);
            } else if (((Boolean) this.LJLJJLL.getValue()).booleanValue()) {
                TextView textView2 = (TextView) _$_findCachedViewById(R.id.e5i);
                Context context3 = view.getContext();
                if (this.LJLJJL) {
                    i4 = R.string.eh7;
                } else {
                    i4 = R.string.pg7;
                }
                textView2.setText(context3.getText(i4));
                ((ImageView) _$_findCachedViewById(R.id.eiq)).setImageResource(R.drawable.aw3);
            } else {
                ((TextView) _$_findCachedViewById(R.id.e5i)).setText(view.getContext().getText(R.string.dph));
                ((ImageView) _$_findCachedViewById(R.id.eiq)).setImageResource(R.drawable.aw4);
            }
        } else {
            if (C53765L8f.LJIIJJI()) {
                ImageView back_left2 = (ImageView) _$_findCachedViewById(R.id.aew);
                o.LJIIIIZZ(back_left2, "back_left");
                back_left2.setVisibility(0);
                C16880lQ.LJIIJ(new ViewOnClickListenerC54034LIo(this), back_left2);
            } else {
                ((ImageView) _$_findCachedViewById(R.id.aew)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.aez)).setVisibility(8);
            }
            ((TextView) _$_findCachedViewById(R.id.mo6)).setText(view.getContext().getText(R.string.pg8));
            ((ImageView) _$_findCachedViewById(R.id.jqq)).setVisibility(0);
            if (C34037DXl.LIZ()) {
                Dl(1);
            } else {
                TextView textView3 = (TextView) _$_findCachedViewById(R.id.e5i);
                Context context4 = view.getContext();
                if (this.LJLJJL) {
                    i2 = R.string.eh7;
                } else {
                    i2 = R.string.pg7;
                }
                textView3.setText(context4.getText(i2));
                ((ImageView) _$_findCachedViewById(R.id.eiq)).setImageResource(R.drawable.aw3);
            }
        }
        if (this.LJLJJL) {
            ((TextView) _$_findCachedViewById(R.id.azb)).setText(getString(R.string.r2e));
        }
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.azb), this);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.jqq), this);
        if (C34037DXl.LIZ()) {
            ArrayList arrayList = new ArrayList();
            View view2 = this.LJLJJI;
            if (view2 != null) {
                View findViewById = view2.findViewById(R.id.mtt);
                o.LJIIIIZZ(findViewById, "unloginProfileAvatarRela…ofile_avatar_placeholder)");
                arrayList.add(findViewById);
                View view3 = this.LJLJJI;
                if (view3 != null) {
                    View findViewById2 = view3.findViewById(R.id.mtw);
                    o.LJIIIIZZ(findViewById2, "unloginProfileAvatarRela….unlogin_profile_user_id)");
                    arrayList.add(findViewById2);
                    View view4 = this.LJLJJI;
                    if (view4 != null) {
                        View findViewById3 = view4.findViewById(R.id.mtv);
                        o.LJIIIIZZ(findViewById3, "unloginProfileAvatarRela…ogin_profile_ll_relation)");
                        arrayList.add(findViewById3);
                    } else {
                        o.LJIJI("unloginProfileAvatarRelationView");
                        throw null;
                    }
                } else {
                    o.LJIJI("unloginProfileAvatarRelationView");
                    throw null;
                }
            }
            View unlogin_marquee = _$_findCachedViewById(R.id.mtr);
            o.LJIIIIZZ(unlogin_marquee, "unlogin_marquee");
            arrayList.add(unlogin_marquee);
            View unlogin_inbox_group_view = _$_findCachedViewById(R.id.mtq);
            o.LJIIIIZZ(unlogin_inbox_group_view, "unlogin_inbox_group_view");
            arrayList.add(unlogin_inbox_group_view);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 104), (View) it.next());
            }
            _$_findCachedViewById(R.id.mtx).setOnTouchListener(LKL.LJLIL);
            C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.mtp), this);
        }
    }

    public final View wl(int i, boolean z) {
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.azv, C16880lQ.LLZIL(mo49getActivity()), null);
        LLLZIIL.setLayoutParams(new LinearLayout.LayoutParams(-2, C7MY.LIZIZ(56)));
        View findViewById = LLLZIIL.findViewById(R.id.dy4);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        o.LJI(mo49getActivity2);
        findViewById.setBackground(new GradientDrawable(orientation, new int[]{C04330Ez.LIZIZ(mo49getActivity, R.color.lj), C04330Ez.LIZIZ(mo49getActivity2, R.color.li)}));
        View findViewById2 = LLLZIIL.findViewById(R.id.cdn);
        if (z) {
            findViewById2.setVisibility(0);
        } else {
            findViewById2.setVisibility(8);
        }
        TuxIconView tuxIconView = (TuxIconView) LLLZIIL.findViewById(R.id.ecz);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = C7MY.LIZIZ(40);
        c2068389v.LIZJ = C7MY.LIZIZ(40);
        c2068389v.LIZ = i;
        tuxIconView.setTuxIcon(c2068389v);
        return LLLZIIL;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments;
        o.LJIIIZ(inflater, "inflater");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (arguments = getArguments()) != null) {
            String string = arguments.getString("tab");
            if (o.LJ("UNLOGIN_NOTIFICATION", string)) {
                C188787b0 c188787b0 = Hox.LJLLI;
                c188787b0.LIZ(mo49getActivity).zv0("NOTIFICATION", this);
                c188787b0.LIZ(mo49getActivity).hv0("NOTIFICATION", this);
            } else if (o.LJ("UNLOGIN_PROFILE", string)) {
                C188787b0 c188787b02 = Hox.LJLLI;
                c188787b02.LIZ(mo49getActivity).zv0("USER", this);
                c188787b02.LIZ(mo49getActivity).hv0("USER", this);
            }
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.azt, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
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
