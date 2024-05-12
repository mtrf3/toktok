package com.ss.android.ugc.aweme.search.pages.common.theme.dark;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C48891JGt;
import X.C50238Jne;
import X.C51048K1s;
import X.C62822Ol8;
import X.InterfaceC48888JGq;
import Y.AObserverS76S0100000_8;
import android.util.SparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.search.pages.common.theme.ThemeViewModel;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class GlobalDarkThemeController implements InterfaceC48888JGq {
    public static final C62822Ol8 LJLJL = C221108m2.LIZIZ(C51048K1s.LJLIL);
    public final ActivityC45651qj LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final AObserverS76S0100000_8 LJLJJLL;

    @Override // X.InterfaceC48888JGq
    public final void onDestroy() {
        ((LiveData) this.LJLJJL.getValue()).removeObserver(this.LJLJJLL);
        ((SparseArray) LJLJL.getValue()).remove(this.LJLIL.hashCode());
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        C48891JGt.onCreate(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C48891JGt.onPause(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C48891JGt.onResume(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        C48891JGt.onStart(this);
    }

    @Override // X.InterfaceC48888JGq
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C48891JGt.onStop(this);
    }

    public GlobalDarkThemeController(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
        activityC45651qj.getLifecycle().addObserver(this);
        this.LJLILLLLZI = C50238Jne.LIZJ(activityC45651qj).LIZ;
        this.LJLJI = C50238Jne.LIZLLL();
        activityC45651qj.getWindow();
        this.LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 202));
        this.LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 201));
        this.LJLJJLL = new AObserverS76S0100000_8(this, 41);
    }

    public final void LIZ(String theme) {
        o.LJIIIZ(theme, "theme");
        ThemeViewModel themeViewModel = (ThemeViewModel) this.LJLJJI.getValue();
        themeViewModel.getClass();
        themeViewModel.iv0().postValue(theme);
        SettingServiceImpl.LIZ().setTheme(this.LJLIL.hashCode(), theme);
    }
}
