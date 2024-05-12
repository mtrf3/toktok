package com.bytedance.als.ui;

import X.AbstractC41331jl;
import X.AbstractC56012Ht;
import X.C0I6;
import X.C0Y1;
import X.C221108m2;
import X.C5H3;
import X.EnumC06840Oq;
import X.InterfaceC65784Pro;
import X.WMH;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class UIPanelComponent<API_COMPONENT extends C0I6, SCENE extends AbstractC56012Ht<STATE, ACTION>, STATE, ACTION> extends AbstractC41331jl<API_COMPONENT, STATE, ACTION> {
    public Class<?> LJLJI;
    public EnumC06840Oq LJLJJI;
    public final C5H3 LJLJJL;
    public final InterfaceC65784Pro<SCENE> LJLJJLL;
    public final WMH LJLJL;

    public final SCENE LJLJJL() {
        return (SCENE) this.LJLJJL.getValue();
    }

    public final EnumC06840Oq LJLIIL() {
        EnumC06840Oq enumC06840Oq = this.LJLJJI;
        if (enumC06840Oq != null) {
            return enumC06840Oq;
        }
        o.LJIJI("defaultVisibility");
        throw null;
    }

    public final Class<?> LJLJLJ() {
        Class<?> cls = this.LJLJI;
        if (cls != null) {
            return cls;
        }
        o.LJIJI("uiClass");
        throw null;
    }

    public void hide() {
        Lifecycle lifecycle = this.LJLJL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "_parentScene.lifecycle");
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED) || !LJLJJL().isVisible()) {
            return;
        }
        C0Y1.LIZ(new IDqS420S0100000((UIPanelComponent) this, 15));
    }

    public void show() {
        Lifecycle lifecycle = this.LJLJL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "_parentScene.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED || LJLJJL().isVisible()) {
            return;
        }
        Lifecycle lifecycle2 = this.LJLJL.getLifecycle();
        o.LJIIIIZZ(lifecycle2, "_parentScene.lifecycle");
        if (lifecycle2.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            C0Y1.LIZ(new IDqS420S0100000((UIPanelComponent) this, 18));
        } else {
            this.LJLJL.getLifecycle().addObserver(new UIPanelComponent$show$2(this));
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        EnumC06840Oq enumC06840Oq = this.LJLJJI;
        if (enumC06840Oq != null) {
            if (enumC06840Oq == EnumC06840Oq.SHOW) {
                show();
                return;
            }
            return;
        }
        o.LJIJI("defaultVisibility");
        throw null;
    }

    public InterfaceC65784Pro<SCENE> LJLJJLL() {
        return this.LJLJJLL;
    }

    public UIPanelComponent(WMH _parentScene) {
        o.LJIIIZ(_parentScene, "_parentScene");
        this.LJLJL = _parentScene;
        this.LJLJJL = C221108m2.LIZIZ(new IDqS420S0100000((UIPanelComponent) this, 16));
        this.LJLJJLL = new IDqS420S0100000((UIPanelComponent) this, 17);
    }

    public final void LJLLILLLL(EnumC06840Oq enumC06840Oq) {
        o.LJIIIZ(enumC06840Oq, "<set-?>");
        this.LJLJJI = enumC06840Oq;
    }

    public final void LJLLL(Class<?> cls) {
        o.LJIIIZ(cls, "<set-?>");
        this.LJLJI = cls;
    }
}
