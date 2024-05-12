package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C145995oB;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C44423Hc3;
import X.C62822Ol8;
import X.C73098SmU;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import Y.ACListenerS27S0100000_7;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftVideoBottomSheetFragment extends BottomSheetDialogFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 325));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    public final int vl() {
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            o.LJI(arguments);
            if (arguments.containsKey("draft_selected_video_index")) {
                Bundle arguments2 = getArguments();
                o.LJI(arguments2);
                return arguments2.getInt("draft_selected_video_index", -1);
            }
        }
        return -1;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        View view2 = getView();
        Object obj = null;
        if (view2 != null) {
            obj = view2.getParent();
        }
        if ((obj instanceof View) && (view = (View) obj) != null) {
            view.setBackgroundColor(0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        String str;
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        C145995oB c145995oB = new C145995oB();
        C44423Hc3 LJ = C73098SmU.LJ();
        Object obj = null;
        if (LJ != null) {
            str = LJ.getUid();
        } else {
            str = null;
        }
        c145995oB.LJI("author_id", str);
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = arguments.getSerializable("draft_current_video");
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        c145995oB.LJI("group_id", ((BaseShortVideoContext) obj).getCreationId());
        FMX.LJIIL("close_more_button", c145995oB.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.gmr), new ACListenerS27S0100000_7(this, 3));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.gmq), new ACListenerS27S0100000_7(this, 4));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.gmp), new ACListenerS27S0100000_7(this, 5));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bgm, viewGroup, false);
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
