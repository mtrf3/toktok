package com.ss.android.ugc.aweme.favorites.business.collection.base;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C45804HyK;
import X.C76800UCe;
import X.C90903hW;
import X.GCT;
import X.GCU;
import X.JBR;
import X.JBS;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BasePage extends BaseFragment implements JBS {
    public static final int LJLJI = 8;
    public View LJLIL;
    public Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public void Dl(Activity activity) {
        o.LJIIIZ(activity, "<this>");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLILLLLZI.clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract int getLayout();

    public /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wl(this, layoutInflater, viewGroup, bundle);
    }

    public /* synthetic */ void onNewIntent(Intent intent) {
    }

    public final View Al() {
        View view = this.LJLIL;
        if (view != null) {
            return view;
        }
        o.LJIJI("viewContainer");
        throw null;
    }

    public boolean Gl() {
        xl();
        return true;
    }

    @Override // X.JBS
    public void onBackPressed_Activity() {
        if (!Gl()) {
            JBR.LIZIZ(this);
        }
    }

    public void xl() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GCT.LJLIL);
        activityConfiguration(GCU.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Activity activity;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        o.LJI(activity);
        Dl(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.JBS
    public void onActivityResult_Activity(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    public View vl(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, getLayout(), viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(getLayout(), container, false)");
        this.LJLIL = LLLLIILL;
        return Al();
    }

    public static View wl(BasePage basePage, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View vl = basePage.vl(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(vl instanceof View)) {
            vl = null;
        }
        if (vl != null) {
            try {
                ViewTreeLifecycleOwner.set(vl, basePage.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(vl, basePage);
                C10A.LIZIZ(vl, basePage);
                ActivityC45651qj mo49getActivity = basePage.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return vl;
    }
}
