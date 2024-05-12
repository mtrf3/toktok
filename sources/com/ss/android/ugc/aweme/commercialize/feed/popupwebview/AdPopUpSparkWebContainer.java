package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import X.InterfaceC60761Nsz;
import X.InterfaceC60770Nt8;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.hybrid.spark.SparkContext;

/* loaded from: classes11.dex */
public final class AdPopUpSparkWebContainer implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLJI = 0;
    public final LifecycleOwner LJLIL;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        SparkContext sparkContext;
        InterfaceC60770Nt8 interfaceC60770Nt8;
        KeyEvent.Callback callback;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) sparkContext.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            InterfaceC60761Nsz kitView = this.LJLILLLLZI.getKitView();
            WebView webView = null;
            if (kitView != null) {
                callback = kitView.LIZJ();
            } else {
                callback = null;
            }
            if (callback instanceof WebView) {
                webView = (WebView) callback;
            }
            interfaceC60770Nt8.LJII(webView);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        SparkContext sparkContext;
        InterfaceC60770Nt8 interfaceC60770Nt8;
        System.currentTimeMillis();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext()) != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) sparkContext.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            interfaceC60770Nt8.onResume();
        }
    }

    public AdPopUpSparkWebContainer(LifecycleOwner lifecycleOwner, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
