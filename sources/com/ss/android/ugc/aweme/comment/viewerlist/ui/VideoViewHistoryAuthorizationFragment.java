package com.ss.android.ugc.aweme.comment.viewerlist.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C182407Dw;
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
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoViewHistoryAuthorizationFragment extends Fragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJLJJLL = 0;
    public String LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 143));
    public String LJLILLLLZI = "";
    public Boolean LJLJI = Boolean.FALSE;

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 142));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    public final String vl() {
        if (C54838Lfe.LJIIZILJ(AwemeService.LIZ().i6(this.LJLJJI))) {
            return "story";
        }
        return "post";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Boolean bool;
        super.onCreate(bundle);
        ((VideoViewAuthorizationViewModel) this.LJLIL.getValue()).LJLIL.observe(this, new AObserverS71S0100000_3(this, 11));
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
        this.LJLJI = bool;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("aid", "");
        }
        this.LJLJJI = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String str2 = this.LJLILLLLZI;
        Boolean bool = this.LJLJI;
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            str = "auto_scene";
        } else {
            str = "click_bar";
        }
        C74Z.LJI("video_views_pop_up_show", str2, str, null, null, vl(), "two_button", null, null, 408);
        if (!o.LJ(this.LJLILLLLZI, "personal_homepage") && o.LJ(this.LJLJI, bool2)) {
            ((TuxIconView) _$_findCachedViewById(R.id.c7l)).setIconRes(R.raw.icon_person_tick);
            ((TuxIconView) _$_findCachedViewById(R.id.c7m)).setIconRes(R.raw.icon_eye);
            ((TextView) _$_findCachedViewById(R.id.c71)).setText(R.string.ton);
            ((TextView) _$_findCachedViewById(R.id.c73)).setText(R.string.too);
            ((TextView) _$_findCachedViewById(R.id.c74)).setText(R.string.top);
            ((TextView) _$_findCachedViewById(R.id.mo6)).setText(R.string.tor);
        }
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.axl), new ACListenerS23S0100000_3(this, 27));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.b05), new ACListenerS23S0100000_3(this, 28));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.hashCode();
        }
        C2U8.LIZ(new C182407Dw(1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.rc, viewGroup, false);
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
