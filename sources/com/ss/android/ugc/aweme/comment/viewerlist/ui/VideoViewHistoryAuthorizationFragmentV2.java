package com.ss.android.ugc.aweme.comment.viewerlist.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C182407Dw;
import X.C2065888w;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C29S;
import X.C2U8;
import X.C3C5;
import X.C54838Lfe;
import X.C62822Ol8;
import X.C74Z;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC219588ja;
import X.SY4;
import Y.ACListenerS23S0100000_3;
import Y.AObserverS71S0100000_3;
import Y.IDCListenerS204S0100000_3;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoViewHistoryAuthorizationFragmentV2 extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJLJ = 0;
    public boolean LJLJI;
    public String LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 145));
    public String LJLILLLLZI = "";
    public Boolean LJLJJI = Boolean.FALSE;
    public boolean LJLJJLL = true;

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

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 144));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Boolean bool;
        super.onCreate(bundle);
        ((VideoViewAuthorizationViewModel) this.LJLIL.getValue()).LJLIL.observe(this, new AObserverS71S0100000_3(this, 12));
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("page_type", "");
        } else {
            str = null;
        }
        this.LJLILLLLZI = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            bool = Boolean.valueOf(arguments2.getBoolean("is_auto_pop", false));
        } else {
            bool = null;
        }
        this.LJLJJI = bool;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("aid", "");
        }
        this.LJLJJL = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String str3 = this.LJLILLLLZI;
        if (o.LJ(this.LJLJJI, Boolean.TRUE)) {
            str = "auto_scene";
        } else {
            str = "click_bar";
        }
        if (C54838Lfe.LJIIZILJ(AwemeService.LIZ().i6(this.LJLJJL))) {
            str2 = "story";
        } else {
            str2 = "post";
        }
        C74Z.LJI("video_views_pop_up_show", str3, str, null, null, str2, "one_button", null, null, 408);
        if (!o.LJ(this.LJLILLLLZI, "personal_homepage")) {
            ((TextView) _$_findCachedViewById(R.id.c71)).setText(R.string.p6n);
            ((TextView) _$_findCachedViewById(R.id.c73)).setText(R.string.p6o);
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.c74);
        String string = getString(R.string.p6q);
        o.LJIIIIZZ(string, "getString(R.string.post_…heet_desc_turn_off_where)");
        String string2 = getString(R.string.p6p, string);
        o.LJIIIIZZ(string2, "getString(R.string.post_…esc_turn_off_new, portal)");
        textView.setText(new SpannableStringBuilder(string2));
        ((TextView) _$_findCachedViewById(R.id.c74)).setMovementMethod(new C2065888w());
        ((CompoundButton) _$_findCachedViewById(R.id.n9g)).setOnCheckedChangeListener(new IDCListenerS204S0100000_3(this, 0));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.ayr), new ACListenerS23S0100000_3(this, 29));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.hashCode();
        }
        C2U8.LIZ(new C182407Dw(1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.rd, viewGroup, false);
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
