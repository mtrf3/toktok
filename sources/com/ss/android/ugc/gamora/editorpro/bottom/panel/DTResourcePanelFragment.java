package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.ActivityC45651qj;
import X.C125594wN;
import X.C127754zr;
import X.C1280450u;
import X.C1280550v;
import X.C1291054w;
import X.C130995Cd;
import X.C134845Qy;
import X.C16880lQ;
import X.C221108m2;
import X.C2ND;
import X.C47959Irz;
import X.C55E;
import X.C55F;
import X.C57D;
import X.C58U;
import X.C62822Ol8;
import X.C74275TDb;
import X.C79057V0z;
import X.InterfaceC127784zu;
import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.IDAListenerS71S0100000_2;
import Y.IDAListenerS72S0000000_2;
import Y.IDLListenerS190S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment;
import com.ss.ugc.android.editor.components.base.panel.BasePanelFragment;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class DTResourcePanelFragment<VM extends ViewModel> extends BasePanelFragment {
    public boolean LJLJI;
    public PopupWindow LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public boolean LJLLI;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public boolean LJLILLLLZI = true;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C55F.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2((DTResourcePanelFragment) this, 573));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2((DTResourcePanelFragment) this, 570));
    public final C55E LJLJL = new C125594wN(this) { // from class: X.55E
        public final /* synthetic */ DTResourcePanelFragment<VM> LIZ;

        {
            this.LIZ = this;
        }

        @Override // X.InterfaceC126664y6
        public final void LIZIZ(EnumC126674y7 op, boolean z) {
            o.LJIIIZ(op, "op");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BaseUndoRedoFragment::UndoRedoListener::succeed=");
            LIZ.append(z);
            LIZ.append(", Operation=");
            LIZ.append(op);
            C131935Ft.LIZ(X1D.LIZIZ(LIZ));
            if (z) {
                this.LIZ.Wl();
            }
        }
    };
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2((DTResourcePanelFragment) this, 572));

    public String Il() {
        return null;
    }

    public abstract String Kl();

    public boolean Ll() {
        return this instanceof VoiceEffectPanelFragment;
    }

    public boolean Rl() {
        return false;
    }

    public void Vl() {
    }

    public abstract void Wl();

    public abstract VM Xl();

    public boolean Zl() {
        return true;
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    public void Hl() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationYBy;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        PopupWindow popupWindow = this.LJLJLJ;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.c5z);
        if (_$_findCachedViewById != null && (animate = _$_findCachedViewById.animate()) != null && (translationYBy = animate.translationYBy(this.LJLL)) != null && (duration = translationYBy.setDuration(350L)) != null && (interpolator = duration.setInterpolator(new C58U(4.0f))) != null) {
            interpolator.setListener(new IDAListenerS71S0100000_2(this, 10));
        }
    }

    public final EditorProContext Jl() {
        return (EditorProContext) this.LJLJJI.getValue();
    }

    public final VM Ml() {
        return (VM) this.LJLJJL.getValue();
    }

    public final boolean Ql() {
        return ((Boolean) this.LJLJJLL.getValue()).booleanValue();
    }

    public final void Nl() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.a6v);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setVisibility(8);
    }

    public final void Ol() {
        PopupWindow popupWindow;
        View contentView;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (popupWindow = this.LJLJLJ) != null && (contentView = popupWindow.getContentView()) != null) {
            contentView.animate().alpha(0.0f).translationYBy(C74275TDb.LIZIZ(mo49getActivity, 2.0f)).setDuration(300L).setInterpolator(new C58U(4.0f)).setListener(new IDAListenerS72S0000000_2(1));
        }
    }

    public void Sl() {
        Hl();
        EditorProContext Jl = Jl();
        C79057V0z.LJJ(Jl).LJFF();
        InterfaceC127784zu player = Jl.getPlayer();
        player.J9();
        player.pause();
    }

    public void Tl() {
        EditorProContext Jl = Jl();
        Jl.getPlayer().J9();
        g0.LJIILIIL(C79057V0z.LJJ(Jl), true, Il(), true, false, 8);
        Hl();
    }

    public void V3() {
        EditorProContext Jl = Jl();
        InterfaceC127784zu player = Jl.getPlayer();
        player.J9();
        player.pause();
        g0.LJIILIIL(C79057V0z.LJJ(Jl), true, Il(), true, false, 8);
        Hl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PopupWindow popupWindow = this.LJLJLJ;
        if (popupWindow != null && popupWindow.isShowing()) {
            PopupWindow popupWindow2 = this.LJLJLJ;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            this.LJLJLJ = null;
        }
        if (C1280450u.LIZ()) {
            C79057V0z.LJJIL(Jl(), this.LJLJL);
        }
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        PopupWindow popupWindow = this.LJLJLJ;
        if (popupWindow != null && popupWindow.isShowing()) {
            PopupWindow popupWindow2 = this.LJLJLJ;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            this.LJLJLJ = null;
        }
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.LJLLI = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LJLLI = true;
    }

    public final void Gl(boolean z) {
        Integer num;
        if (Ll()) {
            if (z) {
                num = 1;
            } else {
                num = null;
            }
            C79057V0z.LJJJJL(Jl(), "switch_track_style", new C127754zr(num));
        }
    }

    public final void Pl(C130995Cd c130995Cd) {
        ViewGroup viewGroup;
        View contentView;
        PopupWindow popupWindow = this.LJLJLJ;
        if (popupWindow != null && (contentView = popupWindow.getContentView()) != null) {
            contentView.setAlpha(0.0f);
        }
        PopupWindow popupWindow2 = this.LJLJLJ;
        if (popupWindow2 != null && popupWindow2.getBackground() == null && popupWindow2.getContentView() != null && popupWindow2.getContentView().getParent() != null) {
            ViewParent parent = popupWindow2.getContentView().getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(popupWindow2.getContentView(), viewGroup);
            }
        }
        PopupWindow popupWindow3 = this.LJLJLJ;
        if (popupWindow3 != null) {
            C16880lQ.LLJL(popupWindow3, c130995Cd, 0, 0);
        }
    }

    public final void Yl(String str) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.c55);
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        if (C1280450u.LIZ()) {
            C57D c57d = C1280550v.LIZ().LIZ().LIZ;
            if (c57d != null) {
                c57d.getResourceConfig();
            }
            C1291054w.LIZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C1280450u.LIZ()) {
            return;
        }
        C79057V0z.LJFF(Jl(), this.LJLJL);
    }

    public static void Al(View view, float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = C134845Qy.LIZ(f);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void Dl(View view, float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C134845Qy.LIZ(f);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final void dm(C130995Cd c130995Cd, float f) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            int LIZIZ = ((int) f) - ((int) C74275TDb.LIZIZ(mo49getActivity, 24.0f));
            PopupWindow popupWindow = this.LJLJLJ;
            if (popupWindow != null) {
                if (Ql()) {
                    LIZIZ = C47959Irz.LIZJ(48, LIZIZ);
                }
                popupWindow.update(c130995Cd, LIZIZ, -((int) this.LJLJLLL), (int) C74275TDb.LIZIZ(mo49getActivity, 48.0f), (int) C74275TDb.LIZIZ(mo49getActivity, 41.0f));
            }
        }
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (!C1280450u.LIZ()) {
            C2ND.LIZ(new AqS152S0100000_2((DTResourcePanelFragment) this, 571), 0L);
            return;
        }
        C79057V0z.LJJJJL(Jl(), "is_bottom_panel_showing", Boolean.TRUE);
        _$_findCachedViewById(R.id.c5z).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(this, 3));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.c53), new ACListenerS22S0100000_2(this, 150));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.c54), new ACListenerS22S0100000_2(this, 151));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.a6v), new ACListenerS22S0100000_2(this, 152));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            PopupWindow popupWindow = new PopupWindow((View) this.LJLLILLLL.getValue(), (int) C74275TDb.LIZIZ(mo49getActivity, 48.0f), (int) C74275TDb.LIZIZ(mo49getActivity, 41.0f), false);
            this.LJLJLJ = popupWindow;
            popupWindow.setTouchable(false);
        }
        Gl(true);
        MutableLiveData LJII = C79057V0z.LJII(Jl(), "common_close_panel_event");
        if (LJII != null) {
            LJII.observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 159));
        }
    }

    public final void cm(float f, float f2, C130995Cd c130995Cd) {
        View contentView;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLJLLL = C74275TDb.LIZIZ(mo49getActivity, 51.0f) + f2;
            int LIZIZ = ((int) f) - ((int) C74275TDb.LIZIZ(mo49getActivity, 24.0f));
            PopupWindow popupWindow = this.LJLJLJ;
            if (popupWindow != null) {
                if (Ql()) {
                    LIZIZ = C47959Irz.LIZJ(48, LIZIZ);
                }
                popupWindow.update(c130995Cd, LIZIZ, -((int) this.LJLJLLL), (int) C74275TDb.LIZIZ(mo49getActivity, 48.0f), (int) C74275TDb.LIZIZ(mo49getActivity, 41.0f));
            }
            PopupWindow popupWindow2 = this.LJLJLJ;
            if (popupWindow2 != null && (contentView = popupWindow2.getContentView()) != null) {
                contentView.setTranslationY(C74275TDb.LIZIZ(mo49getActivity, -2.0f));
                contentView.setAlpha(0.0f);
                contentView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new C58U(4.0f)).setListener(new IDAListenerS72S0000000_2(3)).start();
            }
        }
    }
}
