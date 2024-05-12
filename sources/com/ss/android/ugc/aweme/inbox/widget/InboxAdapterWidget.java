package com.ss.android.ugc.aweme.inbox.widget;

import X.AbstractC029409q;
import X.C16880lQ;
import X.C47261Igj;
import X.C96533qb;
import X.EnumC94693nd;
import X.X1D;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class InboxAdapterWidget implements GenericLifecycleObserver, LifecycleOwner {
    public static final List<EnumC94693nd> LJLJJL;
    public static final List<EnumC94693nd> LJLJJLL;
    public final Fragment LJLIL;
    public final MutableLiveData<Boolean> LJLILLLLZI;
    public final Map<String, String> LJLJI;
    public boolean LJLJJI;

    static {
        EnumC94693nd enumC94693nd = EnumC94693nd.EMPTY;
        EnumC94693nd enumC94693nd2 = EnumC94693nd.FAIL;
        LJLJJL = C47261Igj.LJJIJIIJI(enumC94693nd, EnumC94693nd.SUCCESS, enumC94693nd2);
        LJLJJLL = C47261Igj.LJJIJIIJI(enumC94693nd, enumC94693nd2);
    }

    public void LIZ() {
    }

    public abstract void LJ();

    public void LJII(int i, C96533qb uiStyleConfig) {
        o.LJIIIZ(uiStyleConfig, "uiStyleConfig");
    }

    public LiveData<Boolean> LJIIIIZZ() {
        return null;
    }

    public abstract int LJIIIZ(int i);

    public abstract AbstractC029409q<?> LJIIJ();

    public LiveData<Integer> LJIIL() {
        return null;
    }

    public abstract LiveData<EnumC94693nd> LJIILIIL();

    public void LJIILL(int i, int i2, Intent intent) {
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL.getLifecycle();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[widget: (");
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append(")] state: ");
        LIZ.append(LJIILIIL().getValue());
        LIZ.append(", isExpanded: ");
        LIZ.append(LJIILJJIL().getValue());
        return X1D.LIZIZ(LIZ);
    }

    public MutableLiveData<Boolean> LJIILJJIL() {
        return this.LJLILLLLZI;
    }

    public InboxAdapterWidget(Fragment fragment, LiveData<EnumC94693nd> parentWidgetState) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(parentWidgetState, "parentWidgetState");
        this.LJLIL = fragment;
        this.LJLILLLLZI = new MutableLiveData<>();
        this.LJLJI = new LinkedHashMap();
    }
}
