package com.bytedance.hox;

import X.AbstractC53895LDf;
import X.C221108m2;
import X.C53901LDl;
import X.C53903LDn;
import X.C62822Ol8;
import X.InterfaceC53894LDe;
import X.InterfaceC53902LDm;
import X.InterfaceC53905LDp;
import X.InterfaceC53907LDr;
import Y.ARunnableS13S0400000_9;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class HoxFragmentNode extends AbstractC53895LDf implements InterfaceC53902LDm {
    public Fragment LJLJJL;
    public boolean LJLJJLL;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C53901LDl.LJLIL);

    @Override // X.InterfaceC53902LDm
    public final List<InterfaceC53905LDp> Nk() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC53895LDf
    public final void LJIIIIZZ(InterfaceC53907LDr observer) {
        Fragment fragment;
        Lifecycle lifecycle;
        o.LJIIJ(observer, "observer");
        super.LJIIIIZZ(observer);
        if (!this.LJLJJLL && (fragment = this.LJLJJL) != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(this);
            this.LJLJJLL = true;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIJ(source, "source");
        o.LJIIJ(event, "event");
        C53903LDn.LIZ(this, source, event);
    }

    @Override // X.AbstractC53895LDf
    public final void LJIILIIL(AbstractC53895LDf abstractC53895LDf, AbstractC53895LDf abstractC53895LDf2, List<InterfaceC53894LDe> hoxVisibleObserver) {
        o.LJIIJ(hoxVisibleObserver, "hoxVisibleObserver");
        if (this.LJLJJL == null) {
            ((List) this.LJLJL.getValue()).add(new ARunnableS13S0400000_9(this, abstractC53895LDf, abstractC53895LDf2, hoxVisibleObserver, 2));
        } else {
            super.LJIILIIL(abstractC53895LDf, abstractC53895LDf2, hoxVisibleObserver);
        }
    }

    @Override // X.AbstractC53895LDf
    public final void LJIILJJIL(AbstractC53895LDf abstractC53895LDf, AbstractC53895LDf abstractC53895LDf2, CopyOnWriteArrayList<InterfaceC53894LDe> changNodeObserver) {
        o.LJIIJ(changNodeObserver, "changNodeObserver");
        if (this.LJLJJL == null) {
            ((List) this.LJLJL.getValue()).add(new ARunnableS13S0400000_9(this, abstractC53895LDf, abstractC53895LDf2, changNodeObserver, 3));
        } else {
            super.LJIILJJIL(abstractC53895LDf, abstractC53895LDf2, changNodeObserver);
        }
    }
}
