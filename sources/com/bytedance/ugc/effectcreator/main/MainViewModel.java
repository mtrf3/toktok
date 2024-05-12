package com.bytedance.ugc.effectcreator.main;

import X.C09G;
import X.C221108m2;
import X.C62822Ol8;
import X.C79853Bl;
import X.C93624aTs;
import X.C94115abn;
import X.C94549ain;
import X.C94790amg;
import X.C94791amh;
import X.EnumC93933aYr;
import X.XKX;
import X.XLL;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.keva.Keva;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;

/* loaded from: classes34.dex */
public final class MainViewModel extends StateViewModel implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final C93624aTs<String> LJLILLLLZI = new C93624aTs<>();
    public final C93624aTs<EnumC93933aYr> LJLJI = new C93624aTs<>();
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final XLL LJLJJLL;
    public final XLL LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C94115abn LJLJLLL;
    public final String LJLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C09G.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    public final void jv0() {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C94791amh(this, null), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        CKEffectEditorContext.LJIIL(this.LJLJLLL);
    }

    public MainViewModel(String str) {
        this.LJLL = str;
        XLL LIZ = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLJJLL = LIZ;
        this.LJLJL = LIZ;
        this.LJLJLJ = C221108m2.LIZIZ(C94549ain.LJLIL);
        C94115abn c94115abn = new C94115abn(this);
        this.LJLJLLL = c94115abn;
        CKEffectEditorContext.LJIILIIL.add(c94115abn);
    }

    public final void iv0(String str) {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C94790amg(this, str, System.currentTimeMillis(), Keva.getRepo("cke_main_action_store_repo").getBoolean("cke_user_has_enter_key", false), null), 3);
    }
}
