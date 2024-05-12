package com.bytedance.android.livesdk.util.rxutils.rxlifecycle;

import X.C141335gf;
import X.C3C5;
import X.C73849Syb;
import X.C76800UCe;
import X.EnumC29270BeE;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class BindingFragment extends Fragment {
    public final C73849Syb<EnumC29270BeE> LJLIL = new C73849Syb<>();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLIL.onNext(EnumC29270BeE.DESTROY);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLIL.onNext(EnumC29270BeE.DESTROY_VIEW);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.LJLIL.onNext(EnumC29270BeE.DETACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLIL.onNext(EnumC29270BeE.PAUSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLIL.onNext(EnumC29270BeE.RESUME);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.LJLIL.onNext(EnumC29270BeE.START);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LJLIL.onNext(EnumC29270BeE.STOP);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.LJLIL.onNext(EnumC29270BeE.ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLIL.onNext(EnumC29270BeE.CREATE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.LJLIL.onNext(EnumC29270BeE.ATTACH);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        this.LJLIL.onNext(EnumC29270BeE.CREATE_VIEW);
        try {
            C3C5.m7constructorimpl(C76800UCe.LIZ);
            return null;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }
}
