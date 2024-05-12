package com.ss.android.ugc.aweme.compliance.business.contentpreferences;

import X.AI8;
import X.AI9;
import X.AIF;
import X.AV1;
import X.ActivityC45651qj;
import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C2U8;
import X.C35971E9v;
import X.C3C5;
import X.C47261Igj;
import X.C52240Keq;
import X.C52241Ker;
import X.C52583KkN;
import X.C52949KqH;
import X.C53379KxD;
import X.C56642Ke;
import X.C5H3;
import X.C61328O5c;
import X.C62933Omv;
import X.C62936Omy;
import X.C62937Omz;
import X.C76800UCe;
import X.C78840Uwu;
import X.C79045V0n;
import X.C8JD;
import X.C90903hW;
import X.EnumC62916Ome;
import X.EnumC62934Omw;
import X.FMX;
import X.HG3;
import X.InterfaceC61213O0r;
import X.LE7;
import X.QD3;
import X.RBX;
import Y.ACListenerS30S0100000_10;
import Y.AObserverS74S0200000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

@InterfaceC61213O0r
/* loaded from: classes11.dex */
public final class ContentPreferencesPage extends BaseFragment implements LE7 {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final EnumC62934Omw LJLIL = a.LJIIIZ().LIZ();
    public final C5H3 LJLILLLLZI = RouteArgExtension.INSTANCE.optionalArg(this, C62937Omz.LJLIL, "enter_from", String.class);

    @Override // X.LE7
    public final void Tg(String str) {
    }

    @Override // X.LE7
    public final void Y7() {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        AI9 ai9;
        AI9 ai92;
        AIF aif;
        String string;
        AI9 ai93;
        AIF aif2;
        AIF aif3;
        String string2;
        AI9 ai94;
        AIF aif4;
        AIF aif5;
        super.onResume();
        AI8 ai8 = (AI8) _$_findCachedViewById(R.id.d_1);
        AI9 ai95 = null;
        if (ai8 != null) {
            ai9 = ai8.getAccessory();
        } else {
            ai9 = null;
        }
        if ((ai9 instanceof AIF) && (aif5 = (AIF) ai9) != null) {
            aif5.LJIILIIL(String.valueOf(Integer.valueOf(a.LJFF().LJJI())));
        }
        EnumC62934Omw enumC62934Omw = this.LJLIL;
        int i = 0;
        if (enumC62934Omw == EnumC62934Omw.CHILD) {
            AI8 ai82 = (AI8) _$_findCachedViewById(R.id.izb);
            if (ai82 != null) {
                ai94 = ai82.getAccessory();
            } else {
                ai94 = null;
            }
            if ((ai94 instanceof AIF) && (aif4 = (AIF) ai94) != null) {
                aif4.LJIILIIL(getString(R.string.q78));
            }
        } else if (enumC62934Omw == EnumC62934Omw.UNLINK_LOCKED && a.LJIIIZ().LIZLLL()) {
            AI8 ai83 = (AI8) _$_findCachedViewById(R.id.izb);
            if (ai83 != null) {
                ai93 = ai83.getAccessory();
            } else {
                ai93 = null;
            }
            if ((ai93 instanceof AIF) && (aif2 = (AIF) ai93) != null) {
                aif2.LJIILIIL(getString(R.string.eib));
            }
        } else {
            AI8 ai84 = (AI8) _$_findCachedViewById(R.id.izb);
            if (ai84 != null) {
                ai92 = ai84.getAccessory();
            } else {
                ai92 = null;
            }
            if ((ai92 instanceof AIF) && (aif = (AIF) ai92) != null) {
                if (a.LJIILL().LJIILJJIL() == 1) {
                    string = getString(R.string.eib);
                } else {
                    string = getString(R.string.ivf);
                }
                aif.LJIILIIL(string);
            }
        }
        EnumC62916Ome LJIL = a.LJIIZILJ().LJIL();
        AI8 ai85 = (AI8) _$_findCachedViewById(R.id.kfs);
        if (ai85 != null) {
            ai95 = ai85.getAccessory();
        }
        if ((ai95 instanceof AIF) && (aif3 = (AIF) ai95) != null) {
            if (LJIL.isSelfOrSystemOn()) {
                string2 = getString(R.string.rmc);
            } else if (LJIL == EnumC62916Ome.PARENT_SET_ON) {
                string2 = getString(R.string.g95);
            } else {
                string2 = getString(R.string.rma);
            }
            aif3.LJIILIIL(string2);
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.kfs);
        if ((!LJIL.isOn() && LJIL != EnumC62916Ome.OFF) || a.LJIILL().LJIILJJIL() != 0) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    @QD3
    public final void onAlgoRefreshed(C56642Ke event) {
        String str;
        o.LJIIIZ(event, "event");
        JSONObject jSONObject = event.LJLIL;
        if (jSONObject != null) {
            str = jSONObject.optString("eventName");
        } else {
            str = null;
        }
        if (o.LJ(str, "bc_algo_reset")) {
            a.LIZ.getClass();
            a.LIZJ().LIZ();
            C2U8.LIZ(new C8JD(false));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        fragmentConfiguration(C62936Omy.LJLIL);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.setTheme(R.style.kp);
        }
        int i = C62933Omv.LIZ[a.LJIIIZ().LIZ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "unknown";
            } else {
                str = "parent";
            }
        } else {
            str = "teen";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", (String) this.LJLILLLLZI.getValue());
        c188727au.LJIIIZ("role", str);
        FMX.LJIIL("enter_content_preference", c188727au.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        AIF aif;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.qu7);
        o.LJIIIIZZ(string, "getString(R.string.setting_content_preference)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS160S0100000_10(this, 146));
        c252709vu.setNavActions(c235119Kp);
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        Integer LJI = C79045V0n.LJI(R.attr.c9, context2);
        if (LJI != null) {
            int intValue = LJI.intValue();
            view.setBackgroundColor(intValue);
            ((C252709vu) _$_findCachedViewById(R.id.l_2)).setNavBackground(intValue);
            ((C252709vu) _$_findCachedViewById(R.id.l_2)).LJIILJJIL(false);
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.am5);
        _$_findCachedViewById.setVisibility(0);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.ci);
        c110614Vt.LJIIIIZZ = C61328O5c.LIZJ(4);
        c110614Vt.LJIIIZ = C61328O5c.LIZJ(4);
        Context context3 = _$_findCachedViewById.getContext();
        o.LJIIIIZZ(context3, "it.context");
        _$_findCachedViewById.setBackground(c110614Vt.LIZ(context3));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.am8);
        _$_findCachedViewById2.setVisibility(0);
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.ci);
        c110614Vt2.LJIIJ = C61328O5c.LIZJ(4);
        c110614Vt2.LJIIJJI = C61328O5c.LIZJ(4);
        Context context4 = _$_findCachedViewById2.getContext();
        o.LJIIIIZZ(context4, "it.context");
        _$_findCachedViewById2.setBackground(c110614Vt2.LIZ(context4));
        ((AI8) _$_findCachedViewById(R.id.n6d)).LJ(false, false);
        ((AI8) _$_findCachedViewById(R.id.d_1)).LJ(false, false);
        ((AI8) _$_findCachedViewById(R.id.izb)).LJ(false, false);
        ((AI8) _$_findCachedViewById(R.id.hmp)).LJ(false, false);
        ((AI8) _$_findCachedViewById(R.id.hmq)).LJ(false, false);
        ((AI8) _$_findCachedViewById(R.id.a0i)).LJ(false, false);
        ((AI8) _$_findCachedViewById(R.id.e59)).LJ(false, false);
        ((AI8) _$_findCachedViewById(R.id.kfs)).LJ(false, false);
        if (!C53379KxD.LIZIZ()) {
            Context context5 = getContext();
            if (context5 != null) {
                AI8 ai8 = (AI8) _$_findCachedViewById(R.id.n6d);
                AIF aif2 = new AIF(context5, null);
                aif2.LJIILJJIL(new ACListenerS30S0100000_10(this, 35));
                ai8.setAccessory(aif2);
            }
        } else {
            _$_findCachedViewById(R.id.n6d).setVisibility(8);
        }
        AI8 ai82 = (AI8) _$_findCachedViewById(R.id.a0i);
        ai82.setVisibility(0);
        Context context6 = ai82.getContext();
        if (context6 != null) {
            AI9 accessory = ai82.getAccessory();
            if ((accessory instanceof AIF) && (aif = (AIF) accessory) != null) {
                aif.LJIILJJIL(new ACListenerS30S0100000_10(context6, 36));
            }
        }
        if (C35971E9v.LIZ()) {
            _$_findCachedViewById(R.id.hmp).setVisibility(0);
            Context context7 = getContext();
            if (context7 != null) {
                AI8 ai83 = (AI8) _$_findCachedViewById(R.id.hmp);
                AIF aif3 = new AIF(context7, null);
                aif3.LJIILJJIL(new ACListenerS30S0100000_10(this, 37));
                ai83.setAccessory(aif3);
                a.LJFF().LJFF().observe(getViewLifecycleOwner(), new AObserverS74S0200000_10(this, context7, 0));
            }
        } else {
            _$_findCachedViewById(R.id.hmp).setVisibility(8);
        }
        if (((RBX) HG3.LJIILL()).isLogin() && C52949KqH.LIZ() && ((Number) C52583KkN.LIZ.getValue()).intValue() == 1) {
            _$_findCachedViewById(R.id.hmq).setVisibility(0);
            Context context8 = getContext();
            if (context8 != null) {
                AI8 ai84 = (AI8) _$_findCachedViewById(R.id.hmq);
                AIF aif4 = new AIF(context8, null);
                aif4.LJIILJJIL(new ACListenerS30S0100000_10(this, 38));
                ai84.setAccessory(aif4);
                a.LJFF().LJJIZ().observe(getViewLifecycleOwner(), new AObserverS74S0200000_10(this, context8, 1));
            }
        } else {
            _$_findCachedViewById(R.id.hmq).setVisibility(8);
        }
        if (a.LJFF().LJIIIZ() != 0 && ((RBX) HG3.LJIILL()).isLogin()) {
            _$_findCachedViewById(R.id.d_1).setVisibility(0);
            Context context9 = getContext();
            if (context9 != null) {
                AI8 ai85 = (AI8) _$_findCachedViewById(R.id.d_1);
                AIF aif5 = new AIF(context9, null);
                aif5.LJIILJJIL(new ACListenerS30S0100000_10(this, 39));
                ai85.setAccessory(aif5);
            }
        }
        if (((RBX) HG3.LJIILL()).isLogin()) {
            _$_findCachedViewById(R.id.izb).setVisibility(0);
            Context context10 = getContext();
            if (context10 != null) {
                AI8 ai86 = (AI8) _$_findCachedViewById(R.id.izb);
                AIF aif6 = new AIF(context10, null);
                aif6.LJIILJJIL(new ACListenerS30S0100000_10(this, 7));
                ai86.setAccessory(aif6);
            }
        }
        AI8 ai87 = (AI8) _$_findCachedViewById(R.id.e59);
        if (((RBX) HG3.LJIILL()).isLogin()) {
            ai87.setVisibility(0);
            Context context11 = ai87.getContext();
            if (context11 != null) {
                AI8 ai88 = (AI8) _$_findCachedViewById(R.id.e59);
                AIF aif7 = new AIF(context11, null);
                aif7.LJIILJJIL(new ACListenerS30S0100000_10(ai87, 33));
                ai88.setAccessory(aif7);
            }
        } else {
            ai87.setVisibility(8);
        }
        if (C52240Keq.LIZ() && C52241Ker.LIZ() && !AV1.LJIILLIIL() && ((RBX) HG3.LJIILL()).isLogin() && (context = getContext()) != null) {
            AI8 ai89 = (AI8) _$_findCachedViewById(R.id.kfs);
            AIF aif8 = new AIF(context, null);
            aif8.LJIILJJIL(new ACListenerS30S0100000_10(this, 34));
            ai89.setAccessory(aif8);
        }
        a.LJIILL().LJIIZILJ(C47261Igj.LJJIJIL("fe_tns_content_levels", "fe_tns_filter_keywords", "stem_options", "fe_tns_content_safety_lynx"));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aw8, viewGroup, false);
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
