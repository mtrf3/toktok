package com.google.android.gms.maps;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C29S;
import X.C3C5;
import X.C68818Qze;
import X.C68840R0a;
import X.C68841R0b;
import X.C68842R0c;
import X.C76800UCe;
import X.C90903hW;
import X.R0Z;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class SupportStreetViewPanoramaFragment extends Fragment {
    public final C68818Qze LJLIL = new C68818Qze(this);

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C68818Qze c68818Qze = this.LJLIL;
        T t = c68818Qze.LIZ;
        if (t != 0) {
            t.onDestroy();
        } else {
            c68818Qze.LIZJ(1);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C68818Qze c68818Qze = this.LJLIL;
        T t = c68818Qze.LIZ;
        if (t != 0) {
            t.onDestroyView();
        } else {
            c68818Qze.LIZJ(2);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        T t = this.LJLIL.LIZ;
        if (t != 0) {
            t.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C68818Qze c68818Qze = this.LJLIL;
        T t = c68818Qze.LIZ;
        if (t != 0) {
            t.onPause();
        } else {
            c68818Qze.LIZJ(5);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C68818Qze c68818Qze = this.LJLIL;
        T t = c68818Qze.LIZ;
        if (t != 0) {
            t.onStop();
        } else {
            c68818Qze.LIZJ(4);
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C68818Qze c68818Qze = this.LJLIL;
        c68818Qze.getClass();
        c68818Qze.LIZLLL(null, new C68842R0c(c68818Qze));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C68818Qze c68818Qze = this.LJLIL;
        c68818Qze.getClass();
        c68818Qze.LIZLLL(null, new C68841R0b(c68818Qze));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader = SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        C68818Qze c68818Qze = this.LJLIL;
        c68818Qze.LJI = activity;
        c68818Qze.LJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C68818Qze c68818Qze = this.LJLIL;
        c68818Qze.getClass();
        c68818Qze.LIZLLL(bundle, new C68840R0a(c68818Qze, bundle));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader = SupportStreetViewPanoramaFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        C68818Qze c68818Qze = this.LJLIL;
        T t = c68818Qze.LIZ;
        if (t != 0) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = c68818Qze.LIZIZ;
        if (bundle2 == null) {
            return;
        }
        bundle.putAll(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LIZIZ = this.LJLIL.LIZIZ(inflater, viewGroup, bundle);
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZIZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            C68818Qze c68818Qze = this.LJLIL;
            c68818Qze.LJI = activity;
            c68818Qze.LJ();
            Bundle bundle2 = new Bundle();
            C68818Qze c68818Qze2 = this.LJLIL;
            c68818Qze2.getClass();
            c68818Qze2.LIZLLL(bundle, new R0Z(c68818Qze2, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
