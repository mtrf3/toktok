package com.ss.android.ugc.aweme.ad.feed.dialog;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C40328FsC;
import X.C42996Gu8;
import X.C42998GuA;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C76800UCe;
import X.C85703Xy;
import X.C90903hW;
import X.FMX;
import X.InterfaceC42995Gu7;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeReasonModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class FeedAdDislikeSubReasonDialog extends DialogFragment implements View.OnClickListener {
    public static final /* synthetic */ int LJLJJL = 0;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 52));
    public boolean LJLILLLLZI = true;
    public final C73318Sq2 LJLJI = new C73318Sq2();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public final C42998GuA vl() {
        return (C42998GuA) this.LJLIL.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC42995Gu7 callback;
        if (view != null && view.getId() == R.id.f0h) {
            this.LJLILLLLZI = false;
            dismiss();
            C42998GuA vl = vl();
            if (vl != null && (callback = vl.getCallback()) != null) {
                callback.onDismiss();
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                C40328FsC.LIZLLL(mo49getActivity, R.string.eku);
            }
            FMX.onEventV3("cancel_subcategory");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.hm);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        InterfaceC42995Gu7 callback;
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.LJLILLLLZI) {
            C42998GuA vl = vl();
            if (vl != null && (callback = vl.getCallback()) != null) {
                callback.onDismiss();
            }
            FMX.onEventV3("cancel_subcategory");
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                C40328FsC.LIZLLL(mo49getActivity, R.string.eku);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<AdDislikeReasonModel> list;
        AdDislikeInfo dislikeInfo;
        Window window;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        C42998GuA vl = vl();
        C85703Xy c85703Xy = null;
        if (vl != null && (dislikeInfo = vl.getDislikeInfo()) != null) {
            list = dislikeInfo.getCategoryList();
        } else {
            list = null;
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j9v);
        mo49getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.j9v);
        if (list != null) {
            c85703Xy = new C85703Xy(list, new C42996Gu8(this));
        }
        recyclerView2.setAdapter(c85703Xy);
        _$_findCachedViewById(R.id.j9v).setOverScrollMode(2);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.f0h), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.amd, viewGroup, false);
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
