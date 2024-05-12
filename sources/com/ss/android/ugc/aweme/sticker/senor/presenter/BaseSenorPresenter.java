package com.ss.android.ugc.aweme.sticker.senor.presenter;

import X.AbstractC86959YAx;
import X.C16880lQ;
import X.C39187FZn;
import X.C39188FZo;
import X.C78862UxG;
import X.C83663WsV;
import X.InterfaceC84018WyE;
import Y.ARunnableS28S0200000_9;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseSenorPresenter implements GenericLifecycleObserver, InterfaceC84018WyE {
    public boolean LJLIL;
    public final SensorManager LJLILLLLZI;
    public final SparseIntArray LJLJI;
    public final List<AbstractC86959YAx> LJLJJI;
    public final Context LJLJJL;
    public final Handler LJLJJLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            unRegister();
        }
    }

    public void register() {
        this.LJLIL = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void unRegister() {
        this.LJLIL = false;
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            AbstractC86959YAx abstractC86959YAx = (AbstractC86959YAx) it.next();
            C39187FZn c39187FZn = C39188FZo.LIZ;
            SensorManager sensorManager = this.LJLILLLLZI;
            C78862UxG c78862UxG = C83663WsV.LJII;
            c39187FZn.getClass();
            C39187FZn.LIZLLL(sensorManager, abstractC86959YAx, c78862UxG);
        }
    }

    @Override // X.InterfaceC84018WyE
    public final boolean Kk() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC84018WyE
    public final void rl0(boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.LJLJJI).iterator();
        while (it.hasNext()) {
            ((AbstractC86959YAx) it.next()).LJLIL = z;
        }
    }

    public BaseSenorPresenter(Context context, LifecycleOwner lifecycleOwner, Handler handler) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJJL = context;
        this.LJLJJLL = handler;
        Object LLILL = C16880lQ.LLILL(context, "sensor");
        if (LLILL != null) {
            this.LJLILLLLZI = (SensorManager) LLILL;
            this.LJLJI = new SparseIntArray();
            this.LJLJJI = new CopyOnWriteArrayList();
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS28S0200000_9(lifecycleOwner, this, 28));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.hardware.SensorManager");
    }
}
