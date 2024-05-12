package com.ss.android.ugc.aweme.popularfeed.ui;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C47704Ins;
import X.C54081LKj;
import X.C54082LKk;
import X.C54912Lgq;
import X.C55096Ljo;
import X.C55749LuL;
import X.C62822Ol8;
import X.InterfaceC55102Lju;
import X.InterfaceC56322M8o;
import X.LTV;
import X.LZW;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopularFeedPopupAssem extends UIContentAssem implements InterfaceC56322M8o, IPopularPopupAssemAbility, InterfaceC55102Lju {
    public final C55749LuL LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1940864862) {
            return null;
        }
        return this;
    }

    public PopularFeedPopupAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, LZW.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = C221108m2.LIZIZ(LTV.LJLIL);
        this.LJLJI = "popular";
    }

    @Override // com.ss.android.ugc.aweme.popularfeed.ui.IPopularPopupAssemAbility
    public final void LLLLJ() {
        FragmentManager fragmentManager;
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        if (((Keva) value).getBoolean("intro_guide_show", false)) {
            return;
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            fragmentManager = LIZ.getSupportFragmentManager();
        } else {
            fragmentManager = null;
        }
        PopupManager.LJIIL(new C54912Lgq(this, fragmentManager));
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context context = getContext();
        if (context != null) {
            return C54081LKj.LIZ(context, this);
        }
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null || (lifecycle = LIZLLL.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.CREATED)) {
            return false;
        }
        return true;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LJLJI;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }
}
