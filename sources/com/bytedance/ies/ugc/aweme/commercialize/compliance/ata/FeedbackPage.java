package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.AEY;
import X.AI8;
import X.AI9;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C235119Kp;
import X.C26018AJa;
import X.C26021AJd;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.EnumC26023AJf;
import X.InterfaceC219588ja;
import X.SY4;
import Y.ACListenerS24S0100000_4;
import Y.AObserverS72S0100000_4;
import Y.IDObjectS177S0100000_4;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FeedbackPage extends Fragment implements InterfaceC219588ja {
    public static TuxSheet LJLJL;
    public Activity LJLIL;
    public AwemeRawAd LJLILLLLZI;
    public C26021AJd LJLJJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final MutableLiveData<Integer> LJLJI = new MutableLiveData<>();
    public String LJLJJL = "";

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        Activity activity = this.LJLIL;
        if (activity != null) {
            String string = activity.getString(R.string.a8u);
            o.LJIIIIZZ(string, "activty.getString(R.stri…_ad_feedback_page_header)");
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = string;
            c235119Kp.LIZJ = c9kf;
            c235119Kp.LIZLLL = false;
            return c235119Kp;
        }
        o.LJIJI("activty");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJI = (C26021AJd) view.findViewById(R.id.d93);
        TextView textView = (TextView) _$_findCachedViewById(R.id.d90);
        Activity activity = this.LJLIL;
        if (activity != null) {
            textView.setText(activity.getString(R.string.a8s));
            AI8 ai8 = (AI8) _$_findCachedViewById(R.id.d91);
            Activity activity2 = this.LJLIL;
            if (activity2 != null) {
                ai8.setTitle(activity2.getString(R.string.a8v));
                ((AI8) _$_findCachedViewById(R.id.d91)).setWithSeparator(true);
                AI9 accessory = ((AI8) _$_findCachedViewById(R.id.d91)).getAccessory();
                o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
                ((AEY) accessory).LJIILJJIL(new AqS154S0100000_4(this, 1074));
                AI8 ai82 = (AI8) _$_findCachedViewById(R.id.d92);
                Activity activity3 = this.LJLIL;
                if (activity3 != null) {
                    ai82.setTitle(activity3.getString(R.string.a8w));
                    ((AI8) _$_findCachedViewById(R.id.d92)).setWithSeparator(true);
                    AI9 accessory2 = ((AI8) _$_findCachedViewById(R.id.d92)).getAccessory();
                    o.LJII(accessory2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
                    ((AEY) accessory2).LJIILJJIL(new AqS154S0100000_4(this, 1075));
                    Activity activity4 = this.LJLIL;
                    if (activity4 != null) {
                        String string = activity4.getString(R.string.a8t);
                        o.LJIIIIZZ(string, "activty.getString(R.stri…edback_page_editbox_text)");
                        Activity activity5 = this.LJLIL;
                        if (activity5 != null) {
                            C26018AJa c26018AJa = new C26018AJa(activity5, null, 6);
                            c26018AJa.LJII(string);
                            c26018AJa.LJLJI = 200;
                            c26018AJa.LJI(200);
                            ((TextView) c26018AJa.LIZIZ(R.id.cps)).setMaxLines(1);
                            c26018AJa.LJ(true);
                            c26018AJa.LIZJ(new IDObjectS177S0100000_4(this, 16));
                            C26021AJd c26021AJd = this.LJLJJI;
                            if (c26021AJd != null) {
                                c26021AJd.setFormField(c26018AJa);
                                c26021AJd.LIZJ(EnumC26023AJf.FOOTER);
                            }
                            TextView textView2 = (TextView) _$_findCachedViewById(R.id.d94);
                            Activity activity6 = this.LJLIL;
                            if (activity6 != null) {
                                textView2.setText(activity6.getString(R.string.a8r));
                                this.LJLJI.observe(this, new AObserverS72S0100000_4(this, 32));
                                C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.d94), new ACListenerS24S0100000_4(this, 236));
                                return;
                            }
                            o.LJIJI("activty");
                            throw null;
                        }
                        o.LJIJI("activty");
                        throw null;
                    }
                    o.LJIJI("activty");
                    throw null;
                }
                o.LJIJI("activty");
                throw null;
            }
            o.LJIJI("activty");
            throw null;
        }
        o.LJIJI("activty");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.afz, viewGroup, false);
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
