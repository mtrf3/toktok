package com.ss.android.ugc.aweme.compliance.privacy.paprompt.ui;

import X.ActivityC45651qj;
import X.AnonymousClass898;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C26227ARb;
import X.C29S;
import X.C3AW;
import X.C3C5;
import X.C62822Ol8;
import X.C63044Ooi;
import X.C72062SPy;
import X.C76800UCe;
import X.C8G2;
import X.C90903hW;
import X.FMX;
import X.GCE;
import X.GH4;
import X.InterfaceC65784Pro;
import X.SPP;
import X.SPR;
import X.SPS;
import X.SPT;
import X.SPW;
import X.SPX;
import X.SY4;
import X.UC0;
import Y.ACListenerS32S0100000_12;
import Y.AObserverS80S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.privacy.paprompt.viewmodel.PaPromptViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PaPromptFragment extends BaseFragment implements GH4 {
    public static final /* synthetic */ int LJLJLLL = 0;
    public boolean LJLJJL;
    public long LJLJJLL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 164));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 89));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 90));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 87));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 88));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // X.GH4
    public final boolean onBackPressed() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void Dl() {
        String str;
        int i;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJIIIZ("enter_from", "account_privacy_page");
        if (xl().LJLIL.getValue() == SPP.PUBLIC) {
            str = "public";
        } else {
            str = "private";
        }
        c188727au.LJIIIZ("click_type", str);
        if (vl() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_later_show");
        c188727au.LJIIIZ("enter_position", (String) this.LJLJJI.getValue());
        c188727au.LJ(System.currentTimeMillis() - this.LJLJJLL, "stay_time");
        FMX.LJIIL("account_privacy_manage_page", c188727au.LIZ);
        xl().hv0(new SPW(this), new SPS(this));
    }

    public final void Gl() {
        int i;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJIIIZ("enter_from", "account_privacy_page");
        c188727au.LJIIIZ("click_type", "remind_me_later");
        if (vl() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_later_show");
        c188727au.LJIIIZ("enter_position", (String) this.LJLJJI.getValue());
        c188727au.LJ(System.currentTimeMillis() - this.LJLJJLL, "stay_time");
        FMX.LJIIL("account_privacy_manage_page", c188727au.LIZ);
        xl().LJLIL.setValue(SPP.REMIND_LATER);
        xl().hv0(new SPX(this), new SPT(this));
    }

    public final int vl() {
        return ((Number) this.LJLJI.getValue()).intValue();
    }

    public final PaPromptViewModel xl() {
        return (PaPromptViewModel) this.LJLIL.getValue();
    }

    public final void Al() {
        PaPromptProcessFragment paPromptProcessFragment;
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof PaPromptProcessFragment) && (paPromptProcessFragment = (PaPromptProcessFragment) parentFragment) != null) {
            paPromptProcessFragment.vl();
        }
        if (vl() >= 2) {
            xl().gv0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLJJLL = System.currentTimeMillis();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GCE.LJLIL);
        xl().LJLIL.observe(this, new AObserverS80S0100000_12(this, 66));
        xl().LJLILLLLZI.observe(this, new AObserverS80S0100000_12(this, 67));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Spanned wl(int i) {
        Context context = getContext();
        if (context != null) {
            String string = getString(i);
            o.LJIIIIZZ(string, "getString(hintId)");
            C72062SPy c72062SPy = new C72062SPy();
            String string2 = getString(R.string.phr);
            o.LJIIIIZZ(string2, "getString(R.string.promp…Privacy_prompt_hyperlink)");
            c72062SPy.LIZIZ = string2;
            c72062SPy.LJFF = new AqS162S0100000_12(this, 163);
            c72062SPy.LJ(1);
            c72062SPy.LIZ = false;
            c72062SPy.LIZIZ(62);
            return C8G2.LIZ(string, c72062SPy.LIZ(context));
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        int i = 0;
        if (vl() >= 2) {
            ((TextView) _$_findCachedViewById(R.id.title)).setText(getString(R.string.phs));
            _$_findCachedViewById(R.id.if1).setVisibility(8);
            _$_findCachedViewById(R.id.i53).setVisibility(8);
            _$_findCachedViewById(R.id.iv6).setVisibility(8);
            _$_findCachedViewById(R.id.h0y).setVisibility(8);
            _$_findCachedViewById(R.id.i4r).setVisibility(0);
            _$_findCachedViewById(R.id.iey).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.e5i)).setMovementMethod(AnonymousClass898.LIZ);
            ((TextView) _$_findCachedViewById(R.id.e5i)).setText(wl(R.string.phq));
            C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.iey), new ACListenerS32S0100000_12(this, 133));
            C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.i4r), new ACListenerS32S0100000_12(this, 134));
        } else {
            ((TuxTextView) _$_findCachedViewById(R.id.title)).LJJJ(36.0f);
            C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.i54), new ACListenerS32S0100000_12(this, 127));
            C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.if6), new ACListenerS32S0100000_12(this, 128));
            C16880lQ.LJJJJ((C63044Ooi) _$_findCachedViewById(R.id.if1), new ACListenerS32S0100000_12(this, 129));
            C16880lQ.LJJJJ((C63044Ooi) _$_findCachedViewById(R.id.i53), new ACListenerS32S0100000_12(this, 130));
            if (((Number) this.LJLILLLLZI.getValue()).intValue() == 2 || ((Number) this.LJLILLLLZI.getValue()).intValue() == 4) {
                SPP value = xl().LJLIL.getValue();
                if (value != null) {
                    int i2 = SPR.LIZ[value.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            xl().LJLIL.postValue(SPP.NONE);
                        }
                    } else {
                        xl().LJLIL.postValue(SPP.PUBLIC);
                    }
                }
                xl().LJLIL.postValue(SPP.PRIVATE);
            }
            C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.h0y), new ACListenerS32S0100000_12(this, 131));
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.iv6), new ACListenerS32S0100000_12(this, 132));
            ((TextView) _$_findCachedViewById(R.id.e5i)).setMovementMethod(AnonymousClass898.LIZ);
            ((TextView) _$_findCachedViewById(R.id.e5i)).setText(wl(R.string.pa4));
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", "show");
        c188727au.LJIIIZ("enter_from", "account_privacy_page");
        if (vl() > 0) {
            i = 1;
        }
        c188727au.LIZLLL(i, "is_later_show");
        c188727au.LJIIIZ("enter_position", (String) this.LJLJJI.getValue());
        FMX.LJIIL("account_privacy_manage_page", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Hl(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, SPP spp) {
        String str;
        CharSequence spannableStringBuilder;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "account_privacy_page");
        c188727au.LJIIIZ("action_type", "show");
        c188727au.LJ(System.currentTimeMillis() - this.LJLJJLL, "stay_time");
        int[] iArr = SPR.LIZ;
        int i = iArr[spp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "private";
            } else {
                str = "remind_me_later";
            }
        } else {
            str = "public";
        }
        c188727au.LJIIIZ("page_type", str);
        FMX.LJIIL("account_privacy_manage_confirm", c188727au.LIZ);
        C26227ARb LIZ = C3AW.LIZ(context);
        Context context2 = getContext();
        if (context2 != null) {
            int i2 = iArr[spp.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    spannableStringBuilder = new SpannableStringBuilder();
                } else {
                    String string = getString(R.string.pa8);
                    o.LJIIIIZZ(string, "getString(R.string.priva…ount_publicAccount_popUp)");
                    C72062SPy c72062SPy = new C72062SPy();
                    String string2 = getString(R.string.p_v);
                    o.LJIIIIZZ(string2, "getString(R.string.priva…nt_popUp_placeholderText)");
                    c72062SPy.LIZIZ = string2;
                    c72062SPy.LJ(1);
                    c72062SPy.LIZIZ(32);
                    c72062SPy.LIZ = false;
                    spannableStringBuilder = C8G2.LIZ(string, c72062SPy.LIZ(context2));
                }
            } else {
                String string3 = getString(R.string.pa8);
                o.LJIIIIZZ(string3, "getString(R.string.priva…ount_publicAccount_popUp)");
                C72062SPy c72062SPy2 = new C72062SPy();
                String string4 = getString(R.string.p_x);
                o.LJIIIIZZ(string4, "getString(R.string.priva…t_popUp_placeholderText4)");
                c72062SPy2.LIZIZ = string4;
                c72062SPy2.LJ(1);
                c72062SPy2.LIZIZ(32);
                c72062SPy2.LIZ = false;
                spannableStringBuilder = C8G2.LIZ(string3, c72062SPy2.LIZ(context2));
            }
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
        }
        LIZ.LIZIZ(spannableStringBuilder);
        UC0.LIZJ(LIZ, new AqS116S0300000_12(this, (PaPromptFragment) spp, (SPP) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 4));
        LIZ.LJII = false;
        LIZ.LJI().LIZLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ah6, viewGroup, false);
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
