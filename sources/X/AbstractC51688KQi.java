package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.KQi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51688KQi implements KRB {
    public Activity activity;
    public Fragment fragment;

    public void onActivityCreated(Bundle bundle) {
    }

    @Override // X.KRB
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.KRB
    public void onCreate(Bundle bundle) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    @Override // X.KRB
    public void onDestroy() {
    }

    @Override // X.KRB
    public void onDestroyView() {
    }

    @Override // X.KRB
    public void onDetach() {
        this.activity = null;
    }

    @Override // X.KRB
    public void onPause() {
    }

    @Override // X.KRB
    public void onResume() {
    }

    @Override // X.KRB
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.KRB
    public void onStart() {
    }

    @Override // X.KRB
    public void onStop() {
    }

    @Override // X.KRB
    public void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.KRB
    public void onViewStateRestored(Bundle bundle) {
    }

    public Context getContext() {
        return this.activity;
    }

    public Fragment getFragment() {
        return this.fragment;
    }

    @Override // X.KRB
    public void onAttach(Activity activity, Fragment fragment) {
        this.activity = activity;
        this.fragment = fragment;
    }
}
